import java.util.Scanner;
class Ope{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
for(i=1;i<=n;i++)
{
System.out.print(i);
if(i<n){
System.out.print(",");}
}}}