//Copying a string into an arrary

class strcpy {
    public static void main(String args[]) {
        String str = "Hello, this is a book on java";
        char arr[] = new char[20];
        str.getChars(7,21,arr,0); // 7 start index to 20 end index beginning from 0
        System.out.println(arr);
    }
}



