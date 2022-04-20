package com.epicCoolCompany;

public class item {

     public String itemName = "";
     public double itemPrice = 0.00;
     public int quantity = 0;
     public String itemSeller = "";
     public String itemDescription = "";
     public boolean inCart = false;
     public int numberInCart = 0;



    //Get Item Name
    public String getItemName() {
        return itemName;
    }
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
    //Set Number in Cart
    public void setNumberInCart(int numberInCart) {
        this.numberInCart = numberInCart;
    }
    //Get Number In Cart
    public int getNumberInCart() {
        return numberInCart;
    }
    //Buy Item
    public void buyItem() {
        this.setItemQuantity(this.quantity - 1);
        this.setNumberInCart(this.numberInCart + 1);
    }
    //Remove from Cart
    public void sellItem(int quantity, int numberInCart) {
        if (this.numberInCart == 0)
            System.out.println("You Cannot Remove an Item You Don't Have");
        else
            this.setItemQuantity(this.quantity + 1);
            this.setNumberInCart(this.numberInCart - 1);

    }

}
