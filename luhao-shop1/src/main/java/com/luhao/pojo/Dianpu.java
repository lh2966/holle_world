package com.luhao.pojo;

import java.util.List;


public class Dianpu {
	private int did;
	private String dname;
	private String dtime;
	private List<Shangpin> shops;
	
	public List<Shangpin> getShops() {
		return shops;
	}
	public void setShops(List<Shangpin> shops) {
		this.shops = shops;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDtime() {
		return dtime;
	}
	public void setDtime(String dtime) {
		this.dtime = dtime;
	}
	
	
}
