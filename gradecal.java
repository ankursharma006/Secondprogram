import java.util.Scanner;

public class gradecal{

public static void main(String[] args) {
   int marks[] = new int[6];
   int i;
   float total=0;
   float avg ;
   Scanner scanner = new Scanner(System.in);

   for(i=0;i<6;i++){
       System.out.print("Enter the your "+(i+1)+" Marks : ");
       marks[i]=scanner.nextInt();
       total += marks[i];
   }
scanner.close();
avg = total/6;
System.out.println("Your Grade is : ");
if(avg>=80)
{
    System.out.print("A");
}
else if(avg>=60 && avg<80){
    System.out.print("B");
}
else if(avg>=40 && avg<60){
    System.out.print("C");
}
else {
    System.out.print("D");
}
    
}
}
    