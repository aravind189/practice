class multiply 
{
double a,b,c;
void set()
a=7;
b=6;
}
void multiply()
{
c=a*b;
}
void disp()
{
system.out.println("val of a="+a);
system.out.println("val of b="+b);
system.out.println("multiply="+c);
}
}
class multiplydemo
{
public stastic void main(string[] args)
{
multiply m0=new multiply();
m0.set();
m0.multiply();
m0.disp();
}
}