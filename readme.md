## Rectangle

Write a class called Rectangle

the constructor should have 2 arguments (int length, and int height).

it has 2 methods

`getArea()`

`draw()`

getArea() returns an int that is the computed area of the rectangle

draw() will display the rectangle in all its ASCII glory.

So for example, a rectangle of length 3 and height 2 should display:
```
***
***
```
A rectangle of length 1 and height 1 should display:
```
*
```
A rectangle of length 3 and height 5 should display:
```
***
* *
* *
* *
***
```
How would you design this class?  Would you include any validation?  Will you have getters and setters?  What should you do if someone tries to set a negative number?  0?

## CityScape
`add(Rectangle rectangle)`

`draw()`

When you call draw() it should display all of the rectangles in order of insertion....

```
Cityscape city = new Cityscape();
city.add(new Rectangle(3, 5));
city.add(new Rectangle(4, 2));
city.add(new Rectangle(2, 3));
city.draw();
```

should produce:
```
***
* *
* *  **
* *****
*     *
```