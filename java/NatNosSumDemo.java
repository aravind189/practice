class NatNosSum
{
int n;
void set(int x)
{
n=x;
}
void findsum()
{
int S=0,SS=0,CS=0;
System.out.println("-----------------------------------");
System.out.println("First NatNosSum\tsquares\t\tcubes");
System.out.println("-----------------------------------");
for(int i=1;i<=n;i++)
{
System.out.println("\t"+i+"\t\t"+i*i+"\t\t"+i*i*i);
S=S+i;
SS=SS+i*i;
CS=CS+i*i*i;
}
System.out.println("-------------------------------------");
System.out.println("\t"+S+"\t\t"+SS+"\t\t"+CS);
System.out.println("--------------------------------------");
}
}
class NatNosSumDemo
{
public static void main(String[]args)
{
if(args.length!=1)
{
System.out.println("plz enter one val:");
}
else
{
int x=Integer.parseInt(args[0]);
NatNosSum ns=new NatNosSum();
ns.set(x);
ns.findsum();
}
}
}