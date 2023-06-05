import java.util.Scanner;
class Reverse{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int sd=0;
System.out.println("enter any positive number");
n=sc.nextInt();
while(n>0)
{
sd=sd*10+(n%10);
n=n/10;}
System.out.println(sd);
}}