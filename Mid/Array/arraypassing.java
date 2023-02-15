//passing an array to method
class arraypassing
{

    public static double getAverage(double[] arr) {
        double sum = 0, avg = 0;

        // calculating sum of marks
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // same as sum = sum + arr[i]
        }

        // calculating average of marks
        avg = sum / arr.length;

        // returning average
        return avg;
    }

    public static void main(String[] args) {
        double[] marks = { 80.5, 90, 74, 46.5, 80 };

        // calling getAverage() method
        System.out.println(getAverage(marks));
    }
}