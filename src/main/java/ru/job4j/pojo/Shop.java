package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int index = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null){
                index = i;
                break;
            }else{
                index = -1;
            }
        }
        return index;
    }
}
