import java.io.*;

public class CopyFile {
   public static void main(String args[]) throws IOException
   {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }

 	FileReader in2 = null;
      FileWriter out2 = null;

      try {
         in2 = new FileReader("input.txt");
         out2 = new FileWriter("output1.txt");
         
         int c;
         while ((c = in2.read()) != -1) {
            out2.write(c);
         }
      }finally {
         if (in2 != null) {
            in2.close();
         }
         if (out2 != null) {
            out2.close();
         }
      }

 try{
      byte bWrite [] = {11,21,3,40,5};
      OutputStream os = new FileOutputStream("test.txt");
      for(int x=0; x < bWrite.length ; x++){
         os.write( bWrite[x] ); // writes the bytes
      }
      os.close();
     
      InputStream is = new FileInputStream("test.txt");
      int size = is.available();

      for(int i=0; i< size; i++){
         System.out.print((char)is.read() + "  ");
      }
      is.close();
   }catch(IOException e){
      System.out.print("Exception");
   }	

   }
}