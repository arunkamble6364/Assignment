package com.exceptions.exception4;

public class ItemBrought {

	private int itemid;
	private int itemqty;


	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getItemqty() {
		return itemqty;
	}
	public void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	public ItemBrought(int itemid, int itemqty) {
		super();
		this.itemid = itemid;
		this.itemqty = itemqty;
	}
	public ItemBrought() {
		super();
		
	}
	@Override
	public String toString() {
		return "ItemBrought [itemid=" + itemid + ", itemqty=" + itemqty + "]";
	}

}
