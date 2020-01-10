class NumberGene
{
int n;
void set(int x)
{
n=x;
}
void generate()
{
if(n<0)
{
System.out.println("don't enter the nagative value and enter the positive value");
}
else
{	
System.out.println("--------------------------");
System.out.println("numbers within:"+n);
System.out.println("--------------------------");
for(int i=1;i<=n;++i);
{
System.out.println(+i);
}
System.out.println("---------------------------");
}
}
}
class NumberGeneDemo
{
public static void main(String[] args)
{
if(args.length!=1)
{
System.out.println("plz enter one value from cmdprt:");
}
else
{
int x1=Integer.parseInt(args[0]);
NumberGene no=new NumberGene();
no.set(x1);
no.generate();
}
}
}