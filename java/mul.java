class mul
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
System.out.println("mul="+c);
}
}
class mulDemo
{
public static void main(String[]args)
{
mul mo=new mul();
mo.set();
mo.multiply();
mo.disp();
}
}