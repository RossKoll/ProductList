package com.company.products;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       int belowOneHundred = 0;
       int productWithWord = 0;
       ArrayList<Products> doorList = new ArrayList<>();
       ArrayList<Products> stairList = new ArrayList<>();
       ArrayList<Products> windowsList = new ArrayList<>();

        Products product1 = new Products("WerandaDoor great", 10,ProductType.DOOR );
        Products product2 = new Products("Small Window", 5, ProductType.WINDOW);
        Products product3 = new Products("Inside great stears", 70, ProductType.STAIRS);
        Products product4 = new Products("Grand Door", 15, ProductType.DOOR);

        //initiate list of products
        Products[] productsList = {product1,product2, product3,product4};

        //sort product by Product.type
        for (Products product: productsList) {
            switch (product.getType()){
                case DOOR : doorList.add(product);
                break;
                case STAIRS : stairList.add(product);
                break;
                case WINDOW : windowsList.add(product);
                break;
            }
        }

        System.out.println(doorList);
        System.out.println(stairList);
        System.out.println(windowsList);

        //show amount of product which is below price=100
        for (Products product : productsList) {
            if (product.getPrice() < 100){
                belowOneHundred++;
            }
        }
        System.out.println("We have "+ belowOneHundred+ " products below 100");

        // show amount of product which has word 'great' in mane
        for (Products product: productsList) {
            if (product.getName().contains("great")){
                productWithWord++;
            }
        }
        System.out.println("We have found "+ productWithWord + " product with 'Great' word");

    }
}
