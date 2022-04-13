package com.epicCoolCompany;

public class Item {
    private String itemName = "";
    private double itemPrice = 0.00;
    private int quantity = 0;
    private String itemSeller = "";
    private String itemDescription = "";

    //No Arg Constructor
    public Item(String s, int i, double i1, String s1, String s2) {
    }
    //Get Item Name
    public String getItemName() {
        return itemName;
    }
    //Set item name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    //Get Price
    public double getItemPrice() {
        return itemPrice;
    }
    //Set Price
    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }
    //Get Quantity
    public int getItemQuantity() {
        return quantity;
    }
    //Set Quantity
    public void setItemQuantity(int itemQuantity) {
        this.quantity = quantity;
    }
    //Get Item Seller
    public String itemSeller() {
        return itemSeller;
    }
    //Set Item Seller
    public void setItemSeller(String itemSeller) {
        this.itemSeller = itemSeller;
    }
    //Get Item Description
    public String getItemDescription() {
        return itemDescription;
    }
    //Set Item Description
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

}
