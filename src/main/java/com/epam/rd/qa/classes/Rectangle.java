package com.epam.rd.qa.classes;

import java.util.Objects;

public class Rectangle {

    //Private real fields `sideA` and `sideB` (sides А and В of the rectangle)
    private final double sideA;
    private final double sideB;

    //Constructor with two real parameters `a` and `b` to specify the sides of the rectangle
    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    //Constructor with a real parameter side to specify the same values for sides A and B of the rectangle
    public Rectangle(double side){
        this.sideA = side;
        this.sideB = side;
    }

    //Constructor without parameters (initializes side A with 4 and side B with 3)
    public Rectangle() {
        this.sideA = 4;
        this.sideB = 3;
    }

    //Method `getSideA`, returns value of the side А
    public double getSideA() {
        return sideA;
    }

    //Method `getSideВ`, returns value of the side В
    public double getSideB() {
        return sideB;
    }

    //Method `area`, calculates and returning the area value
    public double area (){
        return sideA*sideB;
    }

    //Method `perimeter`, calculates and returning the perimeter value
    public double perimeter (){
        return 2*(sideA+sideB);
    }

    //Method `isSquare`, checks whether current rectangle is shape square or not.
    // Returns `true` if the shape is square and `false` in another case.
    public boolean isSquare(){
        if(sideA==sideB) return true;
        else {
            return false;
        }
    }

    //- Method `replaceSides`, swaps rectangle sides.
    public Rectangle replaceSides(){
        return new Rectangle(sideB,sideA);
    }

    //Override `equals` and `hashCode` methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 && Double.compare(rectangle.sideB, sideB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sideA, sideB);
    }


    //Override `toString` method (optional, not tested).

    @Override
    public String toString() {
        return super.toString();
    }
}
