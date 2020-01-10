class arthmatic 
{
double a,b,c,d,e,f,g;
void set()
{
a=2;
b=3;
}
void calculate()
{
c=a+b;
d=a-b;
e=a*b;
f=a/b;
g=a%b;
}
void display()
{
system.out.println("val of a="+a);
System.out.println("val of b="+b);
System.out.println("sum of="+c);
System.out.println("sub of="+d);
System.out.println("mul of="+e);
System.out.println("div of="+f);
System.out.println("mod of="+g);
}
}
class arthDemo
{
public static void main(string[] args);
{
arthmatic a0=new arthmatic;
a0.set();
a0.calculate();
a0.disp();
}
}