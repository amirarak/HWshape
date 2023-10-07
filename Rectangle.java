class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.name = "Rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}