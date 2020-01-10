class EvenOdd
{
int n;
void set(int x)
{
n=x;
}
void decideevenodd()
{
if(n<=0)
{
System.out.println("invalid input,enter +ve value");
}
else
{
int r=n%2;
if(r==0)
{
System.out.println("the number is even");
}
else
{
System.out.println("the number is odd");
}
}
}
}
class EvenOddDemo
{
public static void main(String[]args)
{
if(args.length!=1)
{
System.out.println("plz enter one value from cmd prompt");
}
else
{
int x=Integer.parseInt(args[0]);
EvenOdd eo=new EvenOdd();
eo.set(x);
eo.decideevenodd();
}
}
}