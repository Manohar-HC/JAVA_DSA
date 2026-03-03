
public class MethodPractice {

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        int result = subtract(10, 4);
        System.out.println(result);
    }

}
  

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        System.out.println(square(7));
    }


    public static int maxOfThree(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println(maxOfThree(5, 9, 3));
    }


    public static void main (String[]args){

 printstars();
 printstars();



    }

     public static void printstars(){
        System.out.println("*****");

     }
   


   public static void sayhello(){
    System.out.println("hello");
   }
   public static void main(String[] args) {
       sayhello();
       sayhello();
       sayhello();
   }



public static void greet(String name){
    System.out.println("hi"+name);
}
public static void main(String[] args) {
    greet("manohar");
    greet("rahul");
    greet("abhi");
}



public static void printline(){
    System.out.println("---------------------------");

}
public static void main(String[] args) {
    printline();
    printline();
    printline();
}

public static void sayname(String name){
    System.out.println("hi"+name);
}
public static void main(String[] args) {
    sayname("manohar");
    sayname("Java");
}


public static int multiply(int a, int b){
    return a*b;

}

public static void main(String[] args) {
  
  int a = multiply(4, 5);

    System.out.println(a);
}
}
 



