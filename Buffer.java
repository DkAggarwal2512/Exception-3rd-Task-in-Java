import java.io.*;


public class Buffer {
    public static void main(String[] args) throws IOException {
       BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter your age: ");
       String name = a.readLine();
       System.out.println("Your name is :"+ name);
    }}
       