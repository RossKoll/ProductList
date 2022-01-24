package com.company.animalprogect;

public class Products {
   private String name;
   private int price;
   private ProductType type;

   public Products(String name, int price, ProductType type) {
      this.name = name;
      this.price = price;
      this.type = type;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public ProductType getType() {
      return type;
   }

   public void setType(ProductType type) {
      this.type = type;
   }

   @Override
   public String toString() {
      return "Products{" +
              "name='" + name + '\'' +
              ", price=" + price +
              ", type=" + type +
              '}';
   }
}
