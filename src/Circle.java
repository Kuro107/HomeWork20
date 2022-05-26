public class Circle {
    static final double PI = 3.14;
    private static double radius;

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public double getArea(){
        double area = PI*(radius*radius);
        return area;
    }

    public static double getPerimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString(){
        return "radius = " + radius + " \nPerimeter = "  + getPerimeter()+ " \nArea = " + getArea();
    }


}