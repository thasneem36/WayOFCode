package simple_project;

import java.util.Scanner;

public class say_hello_2 {
    public static void main(String args[]){

        System.out.print("Enter Your ID: ");
        Scanner input = new Scanner(System.in);

        // input the id
        int id = input.nextInt();

        // 123 -> A
        if( id == 123 ){
            System.out.println("Hello, A");
        }
        // 456 -> B
        else if (id == 456){
            System.out.println("Hello, B");
        }
        // 789 -> C
        else if(id == 789){
            System.out.println("Hello, C");
        }
        else{
            System.out.println("Worng id");
        }


    }
}
