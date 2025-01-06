import java.io.*;

public class PipedInputStreamDemo {

   public static void main(String[] args) {

      // create a new Piped input and Output Stream
      PipedOutputStream out = new PipedOutputStream();
      PipedInputStream in = new PipedInputStream();

      try {
         // connect input and output
         in.connect(out);

         // write something 
         out.write(70);
         out.write(71);

         // read what we wrote
         for (int i = 0; i < 2; i++) {
            System.out.println("" + (char) in.read());
         }

      } catch (IOException ex) {
         ex.printStackTrace();
      }


   }
}