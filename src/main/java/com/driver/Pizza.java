package com.driver;

public class Pizza {

    private int price;
    private final int ExtraCheesePrice=80;
     private final int ExtraToppingsPrice;
     private final int backPackPrice= 20;
    private boolean isExtraCheeseAdded =false;
    private boolean isExtraToppingsAdded =false;
    private boolean isTakeaway =false;



    public Pizza(Boolean isVeg){
        if(isVeg){
            this.price= 300;
            ExtraToppingsPrice=70;

        }
        else{
            this.price=400;
            ExtraToppingsPrice=120;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        isExtraCheeseAdded =true;
        this.price = this.price + ExtraCheesePrice;
        }




    public void addExtraToppings(){
        // your code goes
        isExtraToppingsAdded =true;
        this.price = this.price +ExtraToppingsPrice;

    }

    public void addTakeaway(){
        // your code goes here
        isTakeaway=true;
        this.price = this.price +backPackPrice;
    }

    public String getBill() {
        // your code goes here
        String bill = "";
        /* return basePizzaPrice; */
        if (isExtraCheeseAdded) {
            bill += ExtraCheesePrice;
        }
        if (isExtraToppingsAdded) {
            bill += ExtraToppingsPrice;
        }
        if (isTakeaway) {
            bill += backPackPrice;
        }
        bill += this.price;
        return bill;
    }

}
