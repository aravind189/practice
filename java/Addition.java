class Addition
{
float a,b,c;
void set()
{
a=5;
b=6;
}
void add()
{
c=a+b;
}
void display()
{
System.out.println("vlaue of a="+a);
System.out.println("vlaue of b="+b);
System.out.println("add="+c);
}
}
class AdditionDemo
{
public static void main(String[] ar)
{
Addition ad=new Addition();
ad.set();
ad.add();
ad.display();
}
}


