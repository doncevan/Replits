package ReplitPractice;
/*
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.  */
public class R106_StringBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("Hello");
        str.append(" World");
        String appendWord = str.toString().toUpperCase();
        System.out.println(appendWord);
    }
}

