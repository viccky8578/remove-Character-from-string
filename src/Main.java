import java.util.*;

class Solution {
    public static void removeChars(String S) {
        // Write your code here
      //taking input from user   S="You are Getting placed soon";
        int n=S.length();
        String newstr=S.replaceAll("([a,c,i,o])","");//removing character a,c,i,o from given String S.

        System.out.println("after removing a,c,i,o :"+newstr);//output=Yu re Gettng pled sn

        String str1=S.substring(0,n-1);//removing last character of String
        System.out.println("after removing last character:"+str1);//output=You are Getting placed soo

        String str2=S.replaceAll("([a-z])","");//removing all lowercase character from string.
        System.out.println("after removing all lowercase character :" +str2);//output = Y   G


        //return newstr;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Solution obj= new Solution();
        //String result = obj.removeChars(S);
        //System.out.println(result);
        //System.out.println(obj.removeChars(S));
        obj.removeChars(S);
    }
}
//general method for remving character from string
// class Main{
// public static void main(String args[]){
// Scanner sc=new Scanner(System.in);
// String s=sc.next();
// String res=" ";
// for (int i = 0; i < s.length(); i++) {
// if(s.charAt(i)=='a'||s.charAt(i)=='A'){
// res=res+"";//here i can use continue instead of res=res+"";
// }
// else if(s.charAt(i)=='e'||s.charAt(i)=='E'){
// res=res+"";
// }
// else if(s.charAt(i)=='i'||s.charAt(i)=='I'){
// res=res+"";
// }
// else if(s.charAt(i)=='o'||s.charAt(i)=='O'){
// res=res+"";
// }
// else if(s.charAt(i)=='u'||s.charAt(i)=='U'){
// res=res+"";
// }
// else{
// res=res+s.charAt(i);
// }
// }
// System.out.println(res);
// }
// }
