//MulTableDemo.java
class MulTable
{
int n;
void set(int x)
{
n=x;
}
void table()
{
if(n<=0)
{
System.out.println(n+"is invalid input,enter +ve val:");
}
else
{
System.out.println("------------------------");
System.out.println("mul table for:"+n);
System.out.println("-------------------------");
for(int i=1;i<=10;i++)
{
System.out.println("\t"+n+"*"+i+"="+(n*i));
}//for
System.out.println("-----------------------");
}//else
}//table()
}//MulTable-----------------------BLC
class MulTableDemo
{
public static void main(String[]args)
{
if(args.length!=1)
{
System.out.println("plz enter one val from cmd prompt:");
}
else
{
int x=Integer.parseInt(args[0]);
MulTable Mt=new MulTable();
Mt.set(x);
Mt.table();
}//else
}//main()
}//MulTableDemo--------------ELC
 