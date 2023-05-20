package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CityScape {
    private List<Rectangle> rectangles = new ArrayList<>();

    public void add(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public void draw() {
        int totalHeight = 0;
        int totalLength = 0;
        for (Rectangle rectangle : rectangles) {
            if (rectangle.getHeight() > totalHeight) {
                totalHeight = rectangle.getHeight();
            }
            totalLength += rectangle.getLength();
        }
        totalLength -= rectangles.size() - 1;

        char[][] grid = new char[totalHeight][totalLength];
        for (int row = 0; row < grid.length; row++) {
            Arrays.fill(grid[row], ' ');
        }


        int startingX = 0;
        int prevHeight = 0;
        for (Rectangle rectangle : rectangles) {
            int rectHeight = rectangle.getHeight();
            int rectLength = rectangle.getLength();
            int startingY = totalHeight - rectHeight;
            for (int row = startingY; row < totalHeight; row++) {
                for (int column = startingX; column < startingX + rectLength; column++) {
                    if (row == startingY || row == totalHeight - 1) {
                        grid[row][column] = '*';
                    } else if (column == startingX || column == startingX + rectLength - 1) {
                        if (grid[row][column] == '*' && row > prevHeight) {
                            grid[row][column] = ' ';
                        } else {
                            grid[row][column] = '*';
                        }
                    } else {
                        grid[row][column] = ' ';
                    }
                }
            }
            startingX += rectLength - 1;
            prevHeight = totalHeight - rectHeight;
        }

        for (int column = 1; column < totalLength - 1; column++) {
            grid[grid.length - 1][column] = ' ';
        }

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.print(grid[row][column]);
            }
            System.out.println();
        }
    }
}
