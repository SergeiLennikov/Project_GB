package ru.gb.vendingMachin.product;

public class Bottle extends Product {
    private double volume;


    public Bottle(String name, double volume, double price) {
        super(name, price);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Название: "+ getName()+ ", Объем: " + volume +"Л." + ", Цена: " + getPrice() + " р.";
    }

    public static class HotDrink extends Product {
        private int temperature;
        private double volume;
        private double CookingTime;

        public HotDrink(String name, double volume, double cookingTime, int temperature, double price) {
            super(name, price);
            this.volume = volume;
            CookingTime = cookingTime;
            this.temperature = temperature;
        }

        public int getTemperature() { return temperature; }

        public double getCookingTime() { return CookingTime; }

        public double getVolume() { return volume; }

        @Override
        public String toString() {

            return "Название: " + getName() + ", Объем: " + volume + " Мл" + ", Температура: " + temperature +"°C" + ", Время приготавления: " + CookingTime + " Сек. " + "Цена: " + getPrice() + " р.";
        }
    }
}
