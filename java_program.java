import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculate {
        public static void main(String[] args) {
               
                int width = 0;
                int length = 0;
                int perimeter;
                       
                try
                {
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                       
                        System.out.println("Please enter lenght of a rectangle");
                        length = Integer.parseInt(br.readLine());
 
                        System.out.println("Please enter width of a rectangle");
                        width = Integer.parseInt(br.readLine());
                }
   
                catch(NumberFormatException ne)
                {
                        System.out.println("Invalid value" + ne);
                        System.exit(0);
                }
                catch(IOException ioe)
                {
                        System.out.println("IO Error :" + ioe);
                        System.exit(0);
                }
                
                perimeter = 2*length + 2*width;
                System.out.println("Perimeter of a rectangle is " + perimeter);
        }
}