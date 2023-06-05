import java.util.Scanner;
class Pod{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int sd=1;
System.out.println("enter any positive number");
n=sc.nextInt();
while(n>0)
{
sd=sd*(n%10);
n=n/10;}
System.out.println(sd);
}}