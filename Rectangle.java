class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void calculateShape() {
        double area = length * width;
        System.out.println("The area of the rectangle is " + area + ".");
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is " + perimeter + ".");
    }
}
