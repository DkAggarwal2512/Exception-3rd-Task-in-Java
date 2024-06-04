import java.io.File;

public class Size {

    public static void main(String[] args) {


//         // Specify the path to the file
        String filePath = "ADIT.txt";
        
//         // Create a File object
        File file = new File(filePath);
        
        if (file.exists() && file.isFile()) {
//             // Get the size of the file in bytes
            long fileSizeInBytes = file.length();
            
//             // Convert the size to kilobytes (1 KB = 1024 Bytes)
            double fileSizeInKilobytes = (double) fileSizeInBytes / 1024;
            
//             // Convert the size to megabytes (1 MB = 1024 KB)
            double fileSizeInMegabytes = fileSizeInKilobytes / 1024;
            
//             // Print the sizes
            System.out.println("File size:");
            System.out.println("File Size In Bytes: " + fileSizeInBytes);
            System.out.println("File Size In Kilobytes: " + String.format("%.2f", fileSizeInKilobytes));
            System.out.println("File Size In Megabytes: " + String.format("%.2f", fileSizeInMegabytes));
        } else {
            System.out.println("The file does not exist or is not a file.");
        }
    }
}



// 1 .  CREATE A FILE -->>>>>>
//         File a = new File("ADIT.txt");


//         try{
//             if(a.createNewFile())
//             {
//             System.out.println("File created");
//         }
//         else{
//             System.out.println("File Already Exicst");
//         }
//     }
//         catch(Exception e ){
//             System.out.println("File not created ");
//         }
//     }
    
// }



// 2. Write The File -->>>>>> import java.io.FileWriter;

    //     try {
    //         FileWriter a =new FileWriter("ADIT.txt");
    //     a.write("Written using java");
    //     a.close();
    //     System.out.println("file Written done");
            
    //     } 
    //     catch (Exception e) {
    //         System.out.println("File can not be written");
    //     }
    // }}