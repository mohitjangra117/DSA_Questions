import java.util.*;
public class SpaceString {


public static void finalstring(String str){
   for(int i=0;i<str.length();i++){
    char c =str.charAt(i);
    if(c=='1'){
        System.out.print("_");
    }
    else if(c=='0'){
        //
    }
    else{
        System.out.print(c);
    }
   
   }
   System.out.println();
}



    public static void bits(String str , int count){
        int n=(int)Math.pow(2,count);
    
     StringBuilder sb=new StringBuilder(str);

        for(int j=0;j<n;j++){
         int flag=1;
            for(int i=str.length()-1;i>=0;i--){
                if(flag==1 && sb.charAt(i)=='0'){
                       sb.setCharAt(i, '1');
                    break;
                }
                else if(sb.charAt(i)=='1'){
                    sb.setCharAt(i,'0');
                }
                
              
               
            }
            str=sb.toString();
            
            finalstring(str);
        }
    }
public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String:");
String str=sc.next();
StringBuilder sb=new StringBuilder();

int count=0;
for(int i=0;i<str.length();i++){
     char c=str.charAt(i);
    if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
        sb.append(c);
    }
    else{
        char a='0';
        sb.append(a);
        sb.append(c);
        count++;
    }
}str=sb.toString();


System.out.println("All Strings are: ");
bits(str, count);


}
    }