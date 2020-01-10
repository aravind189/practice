class swap
{
int a,b;
void set(int x,int y)
{
a=x;
b=y;
}
void swapvalues()
{
a=a+b;
b=a-b;
a=a-b;
}
void disp()
{
System.out.println("--------------------------");
System.out.println("value of a="+a);
System.out.println("value of b="+b);
System.out.println("---------------------------");
}
}
class swapdemo
{
public static void main(String[]args)
{
if(args.length!=2)
{
System.out.println("plz enter two values:");
}
else
{
int x1=Integer.parseInt(args[0]);
int x2=Integer.parseInt(args[1]);
swap so=new swap();
so.set(x1,x2);
System.out.println("original values:");
so.disp();
so.swapvalues();
System.out.println("swapped values:");
so.disp();
}
}
}