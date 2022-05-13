public class AreaCalculator {
    
    public static double area(double radius) {
        if (radius < 0){
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }
    
    public static double area(double varOne, double varTwo ){
        if ((varOne < 0) || (varTwo < 0)) {
            return -1.0;
        } else {
            return varOne * varTwo;
        }
    }
}
