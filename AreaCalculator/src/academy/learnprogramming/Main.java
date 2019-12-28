package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1d;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double length, double width) {
        if (length < 0 || width < 0) {
            return -1d;
        } else {
            return length * width;
        }
    }
}
