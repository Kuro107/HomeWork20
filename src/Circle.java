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
//    Создайте класс Круг с константной переменной ПИ – 3,14
//    и обычную переменную Радиус. Используйте константную переменную
//    ПИ в не статичном методе, который вычисляет площадь круга по формуле Площадь = Пи * Радиус*Радиус.
//    Также создайте статичный метод, который принимает в качестве параметра значение Радиуса
//    и вычисляет площадь по формуле Площадь = 2 * ПИ * Радиус.
//    Продемонстрируйте работу обоих методов с выводом на консоль значение Площади