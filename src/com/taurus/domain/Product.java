package com.taurus.domain;

import java.sql.Date;

public class Product {
	private int pid;
	private String pname;
	private double marketPrice;
	private double shopPrice;
	private String pimage;
	private Date pDate;
	private int isHot;
	private String Pdesc;
	private int Pflag;
	private String cid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public double getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(double shopPrice) {
		this.shopPrice = shopPrice;
	}
	public String getPimage() {
		return pimage;
	}
	public void setPimage(String pimage) {
		this.pimage = pimage;
	}
	public Date getpDate() {
		return pDate;
	}
	public void setpDate(Date pDate) {
		this.pDate = pDate;
	}
	public int getIsHot() {
		return isHot;
	}
	public void setIsHot(int isHot) {
		this.isHot = isHot;
	}
	public String getPdesc() {
		return Pdesc;
	}
	public void setPdesc(String pdesc) {
		Pdesc = pdesc;
	}
	public int getPflag() {
		return Pflag;
	}
	public void setPflag(int pflag) {
		Pflag = pflag;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", marketPrice=" + marketPrice + ", shopPrice=" + shopPrice
				+ ", pimage=" + pimage + ", pDate=" + pDate + ", isHot=" + isHot + ", Pdesc=" + Pdesc + ", Pflag="
				+ Pflag + ", cid=" + cid + "]";
	}
	
}
