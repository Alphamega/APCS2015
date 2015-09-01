/* Harrison Allen
 * Date: 8/31/15
 * Cleveland High School
 * My name... In asterisks!
 * 
 * Description: This doesn't just write my name, it's a universal asterisk writing algorithm.
 * To use it, you design whatever image you want pixel by pixel. Then transcribe the pixel values
 * into any text editing software (I just used Notepad) in accordance with the statement beneath
 * the "numbers" string. (This can be very taxing; I wonder if there's an easier way to do it.)
 * In this scenario, the string directly outputs my name. However, if you'd rather see something
 * else, comment the current string and uncomment the other. (it's a mushroom from Super Mario,
 * althought using asterisks skews it a little bit so it's hard to tell)
 * 
 * Difficulties: The concept took a little while to come up with, but here's what was difficult;
 * -Deciding what the font should look like (I originally made it 5 by 3)
 * -Starting off, I had to figure out:
 * --The proper syntax for strings
 * --how to determine a value at a certain string value (charAt)
 * -The biggest problem was that I assumed the value that charAt read was the actual character,
 * but instead it outputs a value. e.g. 0 is 48. This led to a whole host of issues, and a looooong
 * time to troubleshoot.
 * */
 
public class MyName
{
    public static void main (String[] args)
    {
        String numbers = "110000112011111102111111102111111102111111112011111112011111102110000113110000112111111112111111112111111112111111112111111112111111112111000113110000112110000112110000112110000112000110002110000002110000112111100113110000112110000112110000112110000112000110002111111102110000112111110113111111112111111112111111112111111112000110002011111112110000112110111113111111112111111112111111102111111102000110002000000112110000112110011113110000112110000112110001112110001112111111112111111112111111112110001113110000112110000112110000112110000112111111112111111102011111102110000114";
        //String numbers = "0000011111100000300011101101110003001100011000110030111001111001110301011111111110103110011000011001131000100000010001310001000000100013100110000001100131111110000111111311111111111111113111100100100111130110001001000110300100000000001003001100000000110030001111111111000";
        /*"numbers" is a string of all of the values that defines each individual point for
         * the name output algorithm. The values of each number is as follows:
         * 0 == a space
         * 1 == an asterisk
         * 2 == a tab (in between each letter)
         * 3 == a new line
         * 4 terminates the program
         */
        int num = 0;
        for (int i = 0; num != 52; i++) //repeats until it reads a 4; i is the current character being analyzed
        {
            num = numbers.charAt(i);
            if (num == 48) { // if 0, insert a space
                System.out.print(" ");
            } else if (num == 49) { // if 1, insert an asterisk
                System.out.print("*");
            } else if (num == 50) { // if 2, insert a tab
                System.out.print("\t");
            } else if (num == 51) { // if 3, insert a new line
                System.out.print("\n");
            }
        }
   }
}

/*
Sample output:
**    **	 ****** 	******* 	******* 	********	 *******	 ****** 	**    **
**    **	********	********	********	********	********	********	***   **
**    **	**    **	**    **	**    **	   **   	**      	**    **	****  **
**    **	**    **	**    **	**    **	   **   	******* 	**    **	***** **
********	********	********	********	   **   	 *******	**    **	** *****
********	********	******* 	******* 	   **   	      **	**    **	**  ****
**    **	**    **	**   ***	**   ***	********	********	********	**   ***
**    **	**    **	**    **	**    **	********	******* 	 ****** 	**    **
 */
