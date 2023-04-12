class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void calculateShape() {
        double area = side * side;
        System.out.println("The area of the square is " + area + ".");
    }

    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("The perimeter of the square is " + perimeter + ".");
    }
}
