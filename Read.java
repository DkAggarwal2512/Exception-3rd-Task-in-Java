import java.io.File;

public class Read {

    public static void main(String[] args) {

        File a =new File("ADIT.txt");
        if(a.exists()){
            System.out.println("File name "+a.getName());
            System.out.println("File Path Is:  "+a.getAbsolutePath());
            System.out.println("File Parent is   "+a.getParent());
            System.out.println("File length is   "+a.length());
            System.out.println("File is readable  "+a.canRead());
            System.out.println("File is Writeable  "+a.canWrite());
        }
        else{
            System.out.println("File not found");
        }
    


    }
}