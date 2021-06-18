/**This program reads a word and prints all substrings, sorted by length.
 * @author (Fikri San Koktas)
 * @version (18 January 2021)*/
import java.util.Scanner;
public class KFS_AllSubStrings_Main
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please Enter The Word: ");
        String word = in.next();
        for (int len = 1; len <= word.length(); len++) 
        {
            for (int position = 0; position <= word.length() - len; position++) 
            {
                System.out.println(word.substring(position, position + len));
            }
        }
    }
}
