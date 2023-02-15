//array with for each loop
class arrayforeachloop {

    public static void main(String[] args) 
   {
        int[] myarray = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        System.out.println("Elements of the array are:");

        // printing elements of array
        for (int num : myarray) {
            System.out.println(num);
        }
    }
}