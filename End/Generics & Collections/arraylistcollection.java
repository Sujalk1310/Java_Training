import java.util.*;
public class arraylistcollection {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        
        // animals.remove();
        System.out.println("Array List: "+animals);

        System.out.println("Accessing individual elements: ");
        for(String s : animals){
            System.out.print(s);
            System.out.print(", ");
        }
    }
    
}
