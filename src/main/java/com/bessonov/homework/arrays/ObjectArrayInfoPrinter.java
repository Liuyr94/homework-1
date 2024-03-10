package com.bessonov.homework.arrays;

public class ObjectArrayInfoPrinter {
    static class Car implements Info {
        private String brand;
        private String model;

        public Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public void info() {
            System.out.println("Бренд: " + brand + "\nМодель: " + model);
        }
    }

    static class Book implements Info {
        String title;
        String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public void info() {
            System.out.println("Название: " + title + "\nАвтор: " + author);
        }
    }

    public static void main(String[] args) {
        Info[] infos = {
                new Car("BMW", "M5"),
                new Book("Antoine de Saint-Exupery", "The Little Prince"),
        };

        for (Info inf : infos) {
            inf.info();
        }
    }
}
