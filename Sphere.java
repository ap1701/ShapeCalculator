class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void calculateShape() {
        double surfaceArea = 4 * Math.PI * radius * radius;
        System.out.println("The surface area of the sphere is " + surfaceArea + ".");
    }

    public void calculatePerimeter() {
        // No perimeter for a sphere
    }

    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.println("The volume of the sphere is " + volume + ".");
    }
}
