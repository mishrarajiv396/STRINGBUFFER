// Java Program to demonstrate use of stringbuffer
public class StringBufferExample {
    public static void main(String[] args)
    {
        StringBuffer s = new StringBuffer();
        s.append("rajiv");
        s.append("for");
        s.append("Geeks");
        String message = s.toString();
        System.out.println(message);
    }
}