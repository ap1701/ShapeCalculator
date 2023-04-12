class Pyramid extends Shape implements Volume {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public void calculateShape() {
        double baseArea = baseLength * baseWidth;
        double slantHeight = Math.sqrt(Math.pow((baseLength / 2), 2) + Math.pow(height, 2));
        double surfaceArea = baseArea + (baseLength * slantHeight) + (baseWidth * slantHeight);
        System.out.println("The surface area of the pyramid is " + surfaceArea + ".");
    }

    public void calculatePerimeter() {
        // No perimeter for a pyramid
    }

    public void calculateVolume() {
        double volume = (1.0 / 3.0) * baseLength * baseWidth * height;
        System.out.println("The volume of the pyramid is " + volume + ".");
    }
}