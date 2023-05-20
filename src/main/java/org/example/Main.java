package org.example;

public class Main {
    public static void main(String[] args) {
//        Rectangle rect = new Rectangle(5, 3);
//
//        System.out.println(rect.getArea());
//        rect.draw();

        CityScape city = new CityScape();
        city.add(new Rectangle(3, 5));
        city.add(new Rectangle(4, 2));
        city.add(new Rectangle(2, 3));
        city.add(new Rectangle(5, 7));
        city.add(new Rectangle(3, 10));
        city.draw();
    }
}