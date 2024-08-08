package ru.gb.vendingMachin;

import ru.gb.vendingMachin.product.Bottle;
import ru.gb.vendingMachin.product.HotDrink;
import ru.gb.vendingMachin.product.Product;
import ru.gb.vendingMachin.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        //Чипсы
        Product product1 = new Product("Lay’s", 129.99);
        Product product2 = new Product("Pringles", 199.99);
        Product product3 = new Product("Estrella", 149.99);
        Product product4 = new Product("Cheetos", 119.99);
        Product product5 = new Product("Русская картошка", 149.99);
        Product product6 = new Product("Naturals", 159.99);
        Product product7 = new Product("Московской картофель", 179.99);
        Product product8 = new Product("Snekkin", 111.99);
        Product product9 = new Product("Хрустящий картофель", 149.99);
        Product product10 = new Product("Chio", 119.99);

        //Газировка
        Bottle product11 = new Bottle("Olipop Lemon Lime",0.25,69.99);
        Bottle product12 = new Bottle("Секретная природа фруктов",0.25,69.99);
        Bottle product13 = new Bottle("Poppi Grape",0.25,69.99);
        Bottle product14 = new Bottle("Dr . Pepper с клубникой и сливками",0.25,69.99);
        Bottle product15 = new Bottle("Mountain Dew Pitch Black",0.25,69.99);
        Bottle product16 = new Bottle("Coca-Cola",0.5,99.99);
        Bottle product17 = new Bottle("Fanta",0.5,99.99);
        Bottle product18 = new Bottle("Sprite",0.5,99.99);
        Bottle product19 = new Bottle("Pepsi",0.5,99.99);
        Bottle product20 = new Bottle("Red bull",0.25,149.99);

        //Кофе, Какао
        HotDrink product21 = new HotDrink("Эспрессо",0.030,15,93,90);
        HotDrink product22 = new HotDrink("Американо",0.15,20,93,90);
        HotDrink product23 = new HotDrink("Капучино",0.25,30,80,90);
        HotDrink product24 = new HotDrink("Латте",0.25,30,80,90);
        HotDrink product25 = new HotDrink("Какао",0.25,20,98,90);
        HotDrink product26 = new HotDrink("Горячий шоколад",0.25,20,98,90);

        //Добавление продуктов в автомат

        //Чипсы

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);
        vendingMachine.addProduct(product3);
        vendingMachine.addProduct(product4);
        vendingMachine.addProduct(product5);
        vendingMachine.addProduct(product6);
        vendingMachine.addProduct(product7);
        vendingMachine.addProduct(product8);
        vendingMachine.addProduct(product9);
        vendingMachine.addProduct(product10);

        //газировка

        vendingMachine.addProduct(product11);
        vendingMachine.addProduct(product12);
        vendingMachine.addProduct(product13);
        vendingMachine.addProduct(product14);
        vendingMachine.addProduct(product15);
        vendingMachine.addProduct(product16);
        vendingMachine.addProduct(product17);
        vendingMachine.addProduct(product18);
        vendingMachine.addProduct(product19);
        vendingMachine.addProduct(product20);

        //Кофе, Какао
        vendingMachine.addProduct(product21);
        vendingMachine.addProduct(product22);
        vendingMachine.addProduct(product23);
        vendingMachine.addProduct(product24);
        vendingMachine.addProduct(product25);
        vendingMachine.addProduct(product26);

        //Запуск
        System.out.println(vendingMachine);
    }
}
