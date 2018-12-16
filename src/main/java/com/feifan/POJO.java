package com.feifan;

import java.io.Serializable;
import java.util.Date;

public class POJO implements Serializable {
	private Integer id;
	private String name;
	private String address;
	private Date brithday;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBrithday() {
		return brithday;
	}
	public void setBrithday(Date brithday) {
		this.brithday = brithday;
	}
	@Override
	public String toString() {
		return "POJO [id=" + id + ", name=" + name + ", address=" + address + ", brithday=" + brithday + "]";
	}
	
}
