package Strings;

public class StringFormat {
	public static void main(String args[])  
    {  
        String s1 = new String("Hello");    //String 1  
        String s2 = new String(" World");    //String 2  
        String s = String.format("%s%s",s1,s2);   //String 3 to store the result  
            System.out.println(s.toString());  //Displays result  
            StringBuffer sb=new StringBuffer("array");
            sb.replace(1,3,"java");
            System.out.println(sb);
    } 
}
