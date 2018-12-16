package com.feifan;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller {
	//干嘛呢，兄弟
	@RequestMapping(value="/juju")
	public List<POJO> ju( ArrayList<String> who) {
		
		List<POJO> list =new ArrayList<>();
		for(int i=0;i<who.size();i++) {
			POJO pojo= new POJO();
			pojo.setName("k");
			pojo.setBrithday(new Date());
			pojo.setAddress(who.get(i));
			list.add(pojo);
		}
		return list;
	}
	
	@RequestMapping(value="j/{hello}",consumes="application/json",produces="application/json" )
	public List<POJO> get(@PathVariable("hello") String hello,@PathVariable("th") String th){
		List<POJO> list= new ArrayList<>();
		for(int i=0;i<100;i++) {
			POJO pojo= new POJO();
			pojo.setName(hello);
			pojo.setBrithday(new Date());
			pojo.setAddress(th);
			list.add(pojo);
		}
		return list;
	}
}
