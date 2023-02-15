public class CopyChrArr {
    public static void main(String[] args) {
        String str = "Demo Text";
        char[] charArr = new char[str.length()];
        str.getChars(0, str.length()-3, charArr, 0);
        for (char chr : charArr) {
            System.out.println(chr);
        }
    }
}
