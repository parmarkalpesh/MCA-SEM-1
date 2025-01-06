package com.pcs;

public class Product 
{
	private int pcode;
	private String pname;
	private int price;
	public Product() {}
	public Product(int pcode, String pname, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "pcode=" + pcode + " pname=" + pname + ", price="+ price;
	}
	
	
}
