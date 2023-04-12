class Cylinder extends Shape implements Volume {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void calculateShape() {
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        System.out.println("The surface area of the cylinder is " + surfaceArea + ".");
    }

    public void calculatePerimeter() {
        // No perimeter for a cylinder
    }

    public void calculateVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.println("The volume of the cylinder is " + volume + ".");
    }
}
