package com.exceptions.exception4;

import java.util.Scanner;

public class Item {
	private String itemname; 
	private int itemprice;
	private static int maxitembrought=9;
	private ItemBrought itemb;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getItemprice() {
		return itemprice;
	}
	public void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	/*public int getMaxitembrought() {
		return maxitembrought;
	}
	public void setMaxitembrought(int maxitembrought) {
		this.maxitembrought = maxitembrought;
	}
	*/
	public ItemBrought getItemb() {
		return itemb;
	}
	public void setItemb(ItemBrought itemb) {
		this.itemb = itemb;
	}
	
	public Item(String itemname, int itemprice, ItemBrought itemb) {
		super();
		this.itemname = itemname;
		this.itemprice = itemprice;
		//this.maxitembrought = maxitembrought;
		this.itemb = itemb;
	}
	
	
	@Override
	public String toString() {
		return "Item [itemname=" + itemname + ", itemprice=" + itemprice + ", maxitembrought=" + maxitembrought
				+ ", itemb=" + itemb + "]";
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//ItemBrought itb=new ItemBrought(itemid,itemqunty);
		Item[] it = new Item[2]; 
		int bill=0;int flag=0;
		for(int i=0;i<2;i++) {
	
			
			System.out.println("Enter item "+i +"id");
			int itemid=sc.nextInt();
			
			
			System.out.println("Enter item quantity");
			int itemqunty=sc.nextInt();

			try {
				if(itemqunty>maxitembrought) {
					throw new ItemPurchase("ItemPurchaseLimitExceed");}
				else { flag=1;}
			}catch(ItemPurchase e)
			{ System.out.println(e.getMessage());
			break;
			}
		
		System.out.println("Enter name of item");
		String name=sc.next();
		System.out.println("Enter price of item");
	 int price=sc.nextInt();
		try {
		if(price<=0)
		{
		throw new ItemPurchase("you should enter value greater than 0");
		}else { flag=1;}
		}catch(ItemPurchase e)
		{
			System.out.println(e.getMessage()); break;
		}
		
		
		it[i] = new Item(name,price,new ItemBrought(itemid,itemqunty)); 
		
		
		
	 bill=(it[i].getItemprice()*it[i].itemb.getItemqty());
	//System.out.println(it[i]);
		}
		if(flag>0) {
		for(int i=0;i<2;i++)
		{
			System.out.println(it[i]+""+bill);	
		}
		}
		
		}

}
