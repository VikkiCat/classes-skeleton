package com.epam.rd.qa.classes;


public class ArrayRectangles {

    //Private field `rectangleArray` - array of rectangles
    private final Rectangle [] rectangleArray;


    //Constructor that creates a null-elements array of the given length.
    //  It should throw an `IllegalArgumentException` if the length is negative or zero.
    public ArrayRectangles(int size) {

        if (size<=0){
            throw new IllegalArgumentException();
        }
        this.rectangleArray = new Rectangle[size];
        //Arrays.fill(rectangleArray, null);

    }

    //Constructor that receives an arbitrary number of `Rectangle` objects
    //  or an array of `Rectangle` objects. It should throw `IllegalArgumentException`
    //  if the array is `null` or the array length is zero.
    //  > It's guaranteed that the array does not contain null values.
    public ArrayRectangles(Rectangle... rectangles) {

        if(rectangles == null && rectangles.length==0){
            throw new IllegalArgumentException();
        }

        this.rectangleArray = new Rectangle[rectangles.length];

    }

    //Method `addRectangle` that adds a `Rectangle` object to the array
    // at the nearest empty place and returns `true` or `false` if there is no free space in the array.
    public boolean addRectangle(Rectangle rectangle) {

        for (int i = 0; i < rectangleArray.length; i++)
        {
            if (rectangleArray[i] == null)
            {
                rectangleArray[i] = rectangle;
                return true;
            }
        }
        return false;
    }

    //- Method `size` that returns the actual amount of elements in the array.
    //If `addRectangle` returns `true`, then this method should return new amount of elements.
    public int size() {
        int size = 0;
        if (addRectangle(new Rectangle())==true) {
            for (Rectangle rectangle:rectangleArray
                 ) {
                if(rectangle!=null) size++;
            }
            return size;
        }else  return rectangleArray.length;
    }

    //Method `indexMaxArea` that returns the index of the first rectangle with the maximum area in the array.
    public int indexMaxArea() {
          int indexMax = 0;
            double maxArea = 0;
            for (int i = 0; i < rectangleArray.length; i++) {
                if (maxArea < rectangleArray[i].area()) {
                    indexMax = i;
                    maxArea = rectangleArray[i].area();
                }
            }
            return indexMax;
    }

    //Method `indexMinPerimeter` that returns the index of the first rectangle with the minimum perimeter in the array.
    public int indexMinPerimeter() {
        int indexMin = 0;
        double minPerimeter = rectangleArray[0].area();
        for(int i=1; i<rectangleArray.length; i++) {
            if (rectangleArray[i].perimeter() < minPerimeter) {
                indexMin = i;
                minPerimeter = rectangleArray[i].perimeter();
            }
        }

        return indexMin;
    }

    //Method `numberSquares` that returns the number of squares in the array.
    public int numberSquares() {
        // TODO place your code here
        throw new UnsupportedOperationException();
    }
}
