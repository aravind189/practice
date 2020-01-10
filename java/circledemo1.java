class circle
{
double r,pc,ac;
void set(double x)
{
r=x;
}
void area()
{
System.out.println("radius="+r);
System.out.println("area of circle="+ac);
}
void peri()
{
pc=2*3.14*r;
System.out.println("radius="+r);
System.out.println("peri of circle="+pc);
}
}
class circledemo1
{
public static void main(String[]args)
{
if(args.length!=1)
{
System.out.println("plz enter one val from cmd prompt:");
}
else
{
double1=Double.parseDouble(args[0]);
circle co=new circle();
co.set();
co.peri();
co.area();
}
}
}

