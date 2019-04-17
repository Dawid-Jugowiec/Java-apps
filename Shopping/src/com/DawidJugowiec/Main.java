package com.DawidJugowiec;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        /*System.out.println(stockList);*/

      /*  for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }*/

        Basket timsBasket = new Basket("Tim");
        sellItem(timsBasket, "car", 0);
        /*System.out.println(timsBasket);*/

        sellItem(timsBasket, "car", 2);
        /*System.out.println(timsBasket);*/



       /* if(sellItem(timsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }*/

        sellItem(timsBasket, "spanner", 5);
      /*  System.out.println(timsBasket);*/

        sellItem(timsBasket, "juice", 5);
        sellItem(timsBasket, "cup", 12);
        sellItem(timsBasket, "bread", 1);
       // unreserveItem(timsBasket,"bread",1);
        unreserveItem(timsBasket,"ferrari|",1);

   /*     System.out.println(timsBasket);

        System.out.println(stockList);*/

        //temp = new StockItem("pen", 1.12);
        //stockList.Items().put(temp.getName(), temp);
        /*stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);*/
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " costs " + price.getValue());
        }

        System.out.println(timsBasket);
        System.out.println(stockList);

        checkoutBasket(timsBasket);
        System.out.println(timsBasket);
        System.out.println(stockList);



    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }

        return 0;
    }

    public static int unreserveItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.unreserveStock(item, quantity) != 0) {
            basket.removeFromBasket(stockItem, quantity);
            return quantity;
        }

        else
        {
            System.out.println("Operation not possible");
        }
        return 0;
    }

    public static void checkoutBasket (Basket basket)
    {
        for (Map.Entry<StockItem, Integer> item : basket.getList().entrySet() )
        {
            StockItem stockItem = stockList.get(item.getKey().getName());

            stockList.sellStock(item.getKey().getName(), item.getValue());



        }

        basket.basketCheckOut();


    }



}
