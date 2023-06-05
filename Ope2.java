import java.util.Scanner;
class Ope{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
i=s.nextInt();
j=s.nextInt();
if(j==0){
System.out.println("divided by 0 Error");}
else{
System.out.println(+i+" divided by "+j+" is "+(i/j));}
}}