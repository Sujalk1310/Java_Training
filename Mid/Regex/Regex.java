import java.util.regex.*;

public class Regex {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z A-Z][a-z A-Z 0-9]+@[a-z A-Z]+.[a-z A-Z]+");
        Matcher m = p.matcher("Sujal.12sdd@gmail.vkjh 6789 zjzsjkjsj skjj @.ds");
        while(m.find()){
            System.out.println("mil gaya bkloda "+m.group());
        }
        
    }
}

com|co.in|in|