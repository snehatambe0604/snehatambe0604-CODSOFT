import java.util.*;
class sgrade{
int rollno;
String name;
int dotnet,java,py,st,iot,dbms;
float avg;
int sum;
void getdata()
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the roll number of student:");
rollno=sc.nextInt();
System.out.println("Enter the name of student:");
name=sc.next();
System.out.println("Enter the marks obtain DOTNET(out of 100):");
dotnet=sc.nextInt();
System.out.println("Enter the marks obtain JAVA(out of 100):");
java=sc.nextInt();
System.out.println("Enter the marks obtain PYTHON(out of 100):");
py=sc.nextInt();
System.out.println("Enter the marks obtain SOFTWARE TESTING(out of 100):");
st=sc.nextInt();
System.out.println("Enter the marks obtain IoT(out of 100):");
iot=sc.nextInt();
System.out.println("Enter the marks obtain DBMS(out of 100):");
dbms=sc.nextInt();
}
void sum()
{
sum=dotnet+java+py+st+iot+dbms;
System.out.println("Total marks obtain :"+sum);
}
void avg()
{
avg=sum/6;
System.out.println("Average Percentage :"+avg);
}
void grade()
{
if(avg>=75 && avg<100)
{
 System.out.println("Grade=Distiction");
}
else if(avg>=60 && avg<75)
{
 System.out.println("Grade=First class");
}
else if(avg>=50 && avg<60)
{
 System.out.println("Grade=Second class");
}
else if(avg>=35 && avg<50)
{
 System.out.println("Grade=Pass");
}
else
{
System.out.println("Fail");
}
}
public static void main(String args[]){
sgrade s1 =new sgrade();
s1.getdata();
s1.sum();
s1.avg();
s1.grade();
}
}
