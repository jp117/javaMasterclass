package academy.learning;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 1));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.26, .75));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0  || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            double area = width * height;
            double bucketsNeeded = Math.ceil(area/areaPerBucket);
            return (int)(bucketsNeeded - extraBuckets);
        }
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0  || height <= 0 || areaPerBucket <= 0){
            return -1;
        } else {
            double area = width * height;
            double bucketsNeeded = Math.ceil(area / areaPerBucket);
            return (int)(bucketsNeeded);
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            return (int)Math.ceil(area/areaPerBucket);
        }
    }
}
