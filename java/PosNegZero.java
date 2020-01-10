class PosNegZero
{
int n;
void set(int x)
{
n=x;
}
void decide()
{
if(n>0)
{
System.out.println(n+" is +ve");
}
else
{
if(n<0)
{
System.out.println(n+" is -ve");
}
else
{
System.out.println(n+" is zero");
}
}
}
}
class PosNegZeroDemo
{
public static void main(String[]args)
{
if(args.length!=1)
{
System.out.println("plz enter one val from cmd prompt:");
}
else
{
int x1=Integer.parseInt(args[0]);
PosNegZero pnz=new PosNegZero();
pnz.set(x1);
pnz.decide();
}
}
}
