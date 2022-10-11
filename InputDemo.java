import java.util.Scanner;

class InputDemo{
      public static void main(String[]arg){
         Scanner s = new Scanner(System.in);
         int eid;
         String name;
         Double sal;
         System.out.println("Enter eid , name and salary");
         eid = s.nextInt();
         name = s.nextLine();
         sal = s.nextDouble();
         System.out.println("Employee id is :"eid);
         System.out.println("Employee name is"name);
         System.out.println("Employee salary is :"sal);
         
      }
}
