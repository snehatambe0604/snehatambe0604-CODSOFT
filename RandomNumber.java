import java.util.*;
class RandomNumber{
public static void main(String args[]){
int ans,guess;
final int Max=100;
int limit=4;
Scanner sc= new Scanner(System.in);
System.out.println("\t\tWelcome to Random Guess Number Game:");
Random rand=new Random();
ans=rand.nextInt(Max)+1;
do{
System.out.print("\nGuess the Number( between 1 to 100):");
guess=sc.nextInt();
if(guess==ans)
{
System.out.println("Good Job the Guess number and Generated number is Same");
break;
}
else if(guess<ans)
{
System.out.println("The Guess number is smaller");
limit--;
}
else if(guess>ans)
{
System.out.println("The Guess number is Greater ");
limit--;
}
}while(limit!=-1);
System.out.println("YOUR LIMIT IS OVER !! The Guess number is not valid you lost game");
}
}