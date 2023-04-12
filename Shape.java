abstract class Shape {
    public abstract void calculateShape();
    public abstract void calculatePerimeter();

    public void showShape(String shapeName) {
        System.out.println("You have selected " + shapeName + ".");
    }
}
