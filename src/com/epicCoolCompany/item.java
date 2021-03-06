package com.epicCoolCompany;

public class item {

     public String itemName = "";
     public double itemPrice = 0.00;
     public int quantity = 0;
     public String itemSeller = "";
     public String itemDescription = "";
     public boolean inCart = false;
     public int numberInCart = 0;

    //Constructor With Specifics
    public item(String itemName, double itemPrice, int quantity, String itemSeller, String itemDescription) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.itemSeller = itemSeller;
        this.itemDescription = itemDescription;
    }
    //Constructor Thing
    public item(String name, double price, int quant, String seller, String descript, boolean isInCart, int numInCart) {
        this.itemName = name;
        this.itemPrice = price;
        this.quantity = quant;
        this.itemSeller = seller;
        this.itemDescription = descript;
        this.numberInCart = numInCart;
        this.inCart = isInCart;
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
    public void setItemQuantity(int quantity) {
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
    //Set Number in Cart
    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
    //Get Number In Cart
    public int getNumberInCart() {
        return numberInCart;
    }


}
