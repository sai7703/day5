import java.util.Scanner;
class Reversec{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String n;
String sd="";
System.out.println("enter any String");
n=sc.next();
int len=n.length()-1;
for(int i=len;i>=0;i--){
sd=sd+n.charAt(i);
}
System.out.println(sd);
}}