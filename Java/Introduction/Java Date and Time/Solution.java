//     Author: Rodney Shaghoulian
//     Github: github.com/rshaghoulian
// HackerRank: hackerrank.com/rshaghoulian

import java.time.LocalDate;
import java.util.*;
import java.text.*;

public class Solution {
    
    public static String getDay(String day, String month, String year) {
        try{
            Date date1=new SimpleDateFormat("dd MM yyyy").parse(day+" "+month+" "+year);
            String ret = new SimpleDateFormat("EEEE").format(date1);
            return ret.toUpperCase();
            }catch(Exception e){}
           return "";
    }
    
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();   
        System.out.println(getDay(day, month, year));
    }
}
