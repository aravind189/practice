class Multiplication
{
double a,b,c;
void set()
{
a=7;
b=6;
}
void multiply()
{
c=a*b;
}
void disp()
{
System.out.println("val of a="+a);
System.out.println("val of b="+b);
System.out.println("multiply="+c);
}
}
class MultiplicationDemo
{
public static void main(String[] args)
{
Multiplication m0=new Multiplication();
m0.set();
m0.multiply();
m0.disp();
}
}