import java.util.Scanner;
class Ope{
public static void main(String args[])
{
int i,j;
Scanner s=new Scanner(System.in);
i=s.nextInt();
j=s.nextInt();
if(i<j){
System.out.println("max="+j);}
else{
System.out.println("max="+i);}
if(i<j){
System.out.println("min="+i);}
else{
System.out.println("min="+j);
}}}