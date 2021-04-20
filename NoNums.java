
/**
 * My solution to the prompt Print the numbers 1-10 without using numbers in your code
 * 
 * @author Ryan
 * @version 4/19/21
 */
public class NoNums
{
    public static void main(String[] args){
        String str = "*";
        String ctr = "a"; 
        
        for (int a = ctr.length(); a <=10; a++){
            System.out.println(str.length()); 
            str+="*"; 
        }
        
    }
}
