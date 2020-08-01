//Tushar M K
import java.util.Scanner;

public class MyString {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "z";     
        String largest = "a";
        
        
        if(s.length() == k)
        {
            return s+"\n"+s;
        }
        for(int i = 0 ; i <= s.length()-k ; i++ )
        {
            String temp = "";
            for(int j = i ; j < i+k ; j++ ) 
            {
                temp += s.charAt(j);
            }
            int x , y ;
            x = temp.compareTo(smallest);
            if(x < 0)
                smallest = temp ;
          
            y = temp.compareTo(largest);
            if(y>0)
                largest = temp ;
            
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}