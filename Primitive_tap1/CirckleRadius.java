package Primitive_tap1;

//   System.out.println(Math.sqrt(81)); квадратный корень
public class CirckleRadius {
    // чтобы найти радиус R(2)= Площадь/3.14
    public static void calcCircleRadius(double area) {
        double radius = Math.sqrt(area / Math.PI);
        System.out.format("%.3f%n", radius);
    }


    public static void main(String[] args) {
        calcCircleRadius(10);


    }

}
