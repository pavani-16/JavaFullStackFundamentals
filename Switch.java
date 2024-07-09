package com.java.loopcontrolstatements;
public class Switch{
    public static void main(String args[]){
        int productPrice = 300000;
        int discount;
        int discountPercentage = 1;
        char membership = 'B';
        String brand = "Samsung";
        switch(brand){
            case "Apple":
        if(membership == 'D')
            discountPercentage = 30;
        else if(membership == 'G')
            discountPercentage = 25;
            break;
            case "Samsung":
        if(membership == 'D')
            discountPercentage = 20;
        else if(membership == 'G')
            discountPercentage = 15;
            break;
        default:
            discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount $ : " +discount);
        System.out.println("Final Price is $ : " +(productPrice - discount));
    }
}
    