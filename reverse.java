import java.util.*;
import java.lang.*;
class Reverse{
public static void main (String [] args){
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  System.out.println(reverseString(str));
  }
public static String reverseString(String str){
    if (str== null || str.length()<=1){
       return str;
    }
    return reverseString(str.substring(1))+str.charAt(0);
}
}