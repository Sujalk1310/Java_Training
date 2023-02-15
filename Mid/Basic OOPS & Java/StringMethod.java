public class StringMethod {
    public static void main(String[] args) {
        // .charAt(index) --->  Returns Character At Index
        String myStr = "Hello";
        char chr = myStr.charAt(0);
        System.out.println(chr);
        // .codePointAt(index) ---> Returns Unicode Value
        String myStr1 = "Hello";
        int result = myStr1.codePointAt(0);
        System.out.println(result);
        // .codePointBefore(index) ---> Returns Unicode Value of previous index
        String myStr2 = "Hello";
        int result1 = myStr2.codePointBefore(1);
        System.out.println(result1);
        // .codePointCount(indexStart, indexEnd) ---> Return the number of Unicode values found in a string
        String myStr3 = "Hello";
        int result2 = myStr3.codePointCount(0, 5);
        System.out.println(result2);
        // .compareTo() ---> Compares two strings lexicographically
        String mySt = "Hello";
        String mySt2 = "Hello";
        System.out.println(mySt.compareTo(mySt2)); // Returns 0 because they are equal, +ve when mySt is greater and -ve when mySt2 is greater
        // .compareToIgnoreCase() ---> Compares two strings lexicographically, ignoring case differences
        String my = "HELLO";
        String my2 = "hello";
        System.out.println(my.compareToIgnoreCase(my2));
        // .concat() ---> Appends a string to the end of another string
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
        // .contains() ---> Checks whether a string contains a sequence of characters
        String myS = "Hello";
        System.out.println(myS.contains("Hel"));   // true
        System.out.println(myS.contains("e"));     // true
        System.out.println(myS.contains("Hi"));    // false
        // .contentEquals() ---> Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer
        String m = "Hello";
        System.out.println(m.contentEquals("Hello"));  // true
        System.out.println(m.contentEquals("e"));      // false
        System.out.println(m.contentEquals("Hi"));     // false
        // .copyValueOf() ---> Returns a String that represents the characters of the character array
        char[] a1 = {'H', 'e', 'l', 'l', 'o'};
        String b1 = "";
        myStr2 = b1.copyValueOf(a1, 0, 5);
        System.out.println("Returned String: " + b1);
        // .endsWith() ---> 	Checks whether a string ends with the specified character(s)
        String aa = "Hello";
        System.out.println(aa.endsWith("Hel"));   // false
        System.out.println(aa.endsWith("llo"));   // true
        System.out.println(aa.endsWith("o"));     // true
        // .equals() --->  Compares two strings. Returns true if the strings are equal, and false if not
        String c1 = "Hello";
        String c2 = "Hello";
        String c3 = "Another String";
        System.out.println(c1.equals(c2)); // Returns true because they are equal
        System.out.println(c1.equals(c3)); // false
        // .equalsIgnoreCase() ---> Compares two strings, ignoring case considerations
        String x = "Hello";
        String y = "HELLO";
        String z = "Another String";
        System.out.println(x.equalsIgnoreCase(y)); // true
        System.out.println(x.equalsIgnoreCase(z)); // false
        // .hashCode() ---> Returns the hash code of a string
        String h = "Hello";
        System.out.println(h.hashCode());
        // .indexOf() ---> 	Returns the position of the first found occurrence of specified characters in a string
        String k = "Hello planet earth, you are a great planet.";
        System.out.println(k.indexOf("planet"));
        // isEmpty() ---> Checks whether a string is empty or not
        String b3 = "Hello";
        String b4 = "";
        System.out.println(b3.isEmpty());
        System.out.println(b4.isEmpty());
        // .lastIndexOf() ---> Returns the position of the last found occurrence of specified characters in a string
        String q = "Hello planet earth, you are a great planet.";
        System.out.println(q.lastIndexOf("planet"));
        // .length() ---> Returns the length of a specified string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());
        // .replace() ---> Searches a string for a specified value, and returns a new string where the specified values are replaced
        String e = "Hello";
        System.out.println(e.replace('l', 'p'));
        // .replaceFirst() ---> Replaces the first occurrence of a substring that matches the given regular expression with the given replacement
        // .replaceAll() ---> Replaces each substring of this string that matches the given regular expression with the given replacement
        // .split() ---> Splits a string into an array of substrings
        String text = "How are you doing today?";
        String[] myArray = text.split(" ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        // .startsWith() ---> Checks whether a string starts with specified characters
        String k1 = "Hello";
        System.out.println(k1.startsWith("Hel"));   // true
        System.out.println(k1.startsWith("llo"));   // false
        System.out.println(k1.startsWith("o"));     // false
        // .subSequence() ---> Returns a new character sequence that is a subsequence of this sequence
        // .substring ---> Returns a new string which is the substring of a specified string
        // .toCharArray ---> Converts this string to a new character array
        String t = "How are you doing today?";
        char[] ma = t.toCharArray();
        for (int i = 0; i < ma.length; i++) {
            System.out.println(ma[i]);
        }
        // .toLowerCase() ---> Converts a string to lower case letters	
        String tx = "Hello World";
        System.out.println(tx.toUpperCase());
        System.out.println(tx.toLowerCase());
        // .toString(base) ---> 	Returns the value of a String object
        int x4 = 65;
        System.out.println(Integer.toString(x4));
        // .toUpperCase() ---> Converts a string to upper case letters
        String xt = "Hello World";
        System.out.println(xt.toUpperCase());
        System.out.println(xt.toLowerCase());
        // .trim() ---> Removes whitespace from both ends of a string
        String r = "       Hello World!       ";
        System.out.println(r);
        System.out.println(r.trim());
        // .valueOf() ---> Returns the string representation of the specified value
        int x5 = 66;
        System.out.println(String.valueOf(x5));
    }   
}
