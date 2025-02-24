import java.util.Scanner;

class UserInput {
    /*sccanenr class */
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        System.out.println("enter roll:");
        int roll= sc.nextInt();

        System.out.println("enter name:");
      //String name = sc.nextLine();  <----Here the second input is string and it will be omitted , so use "next"
        String name = sc.next();
        System.out.println("Name is : "+name);
        System.out.println("Roll is : "+roll);
        sc.close();
    }
    
}
