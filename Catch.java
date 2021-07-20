import java.util.Scanner;
public class Catch
{
 public static void main(String[]args)
 {
   Scanner scan = new Scanner(System.in);
   String msg = "Enter a sentence with 5 words: ";
   System.out.println(msg);
   
   String sentence = scan.nextLine();
   String[] theWords = sentence.split(" ");
   
    for(int x=0;x<=4;x++)
    {
	  String toTheUpper = "";
	  try
	  {
	    toTheUpper = theWords[x].toUpperCase();
		System.out.println(toTheUpper);
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	  System.out.println("You have entered an invalid sentence");
	  System.out.println("Re-enter sentence with 5 words!!!");
	  break;
	  }
	}	
 }

}