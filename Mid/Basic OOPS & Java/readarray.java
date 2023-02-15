import java.util.Scanner;
class readarray { 
    public static void main(String args[]) { 
        int sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter your array size=");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++) {
            a[i]=obj.nextInt();
            sum=sum+a[i];
        }
        System.out.println("print array elements");
        for(int i=0;i<n;i++)
            System.out.println(a[i]);
        System.out.print("sum="+sum);
        obj.close();
    }
}
