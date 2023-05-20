package org.example;

public class Rectangle {
    private final int height;
    private final int length;

    public Rectangle(int length, int height) {
        this.height = height;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return height * length;
    }

    public void draw() {
        for (int row = 0; row < height; row++) {
            for (int column = 0; column < length; column++) {
                if (row == 0 || row == height - 1 || column == 0 || column == length - 1) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
