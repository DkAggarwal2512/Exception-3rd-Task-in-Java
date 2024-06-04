import java.io.File;
public class Delete {
    public static void main(String[]args){

// ------>>>>> FIle Delete

File a =new File("IBM.txt");
if(a.exists()){
    a.delete();
    System.out.println("File Delete");
}
else{
    System.out.println("File not found");
}

}}


// CREATE A FILE -->>>>>>
//         File a = new File("IBM.txt");


//         try{
//             if(a.createNewFile())
//             {
//             System.out.println("File created Done");
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