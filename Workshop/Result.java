package Workshop;
public class Result
{
int sub1,sub2,sub3;
public Result(int sub1,int sub2,int sub3)
{
 this.sub1=sub1;
 this.sub2=sub2;
 this.sub3=sub3;
}
void Gain1()
{
System.out.println("1\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+(sub1+sub2+sub3)+"\t"+(sub1+sub2+sub3)/3+"%");  
}
void Gain2()
{
System.out.println("2\t"+sub1+"\t"+sub2+"\t"+sub3+"\t"+(sub1+sub2+sub3)+"\t"+(sub1+sub2+sub3)/3+"%");  
}
}