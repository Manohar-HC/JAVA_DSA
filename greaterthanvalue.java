public class greaterthanvalue{

public static void main(String[] args) {
    int [] arr={5, 8, 3,1};
    int count =0;
    int value =4;

    for(int i=0; i< arr.length; i++){
        if(arr[i]> value){
            count++;
        }
    }
System.out.println("count = "+count);
} 

}