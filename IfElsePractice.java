import java.util.*;
public class IfElsePractice{
public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);

System.out.println("enter a number");
int number = sc.nextInt();

// if (number >0){
//     System.out.println("positive number");
    
// }else if(number >0){
//     System.out.println("negative number");
// }else{
//     System.out.println("zero");
// }


// if (number >=18){
//     System.out.println("eligible to vote");
// } else{
//     System.out.println("not eligible for voting");

// }



if(number >=90){
    System.out.println("A");

}else if (number >= 75){
    System.out.println("B");
} else if (number >= 50){
System.out.println("C");
} else{
    System.out.println("fail");
}

}


}