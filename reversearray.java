public class reversearray{

//     public static void main(String[]args){

// int []arr={1,3,5,7};

// for(int i=arr.length -1; i>=0; i--){
//     System.out.println(arr[i]);
   
// }


//     }



// public static void main (String[]args){

// int[] arr={ 2,4,6};
// for( int i= arr.length -1; i>=0; i--){
//     System.out.println(arr[i]+1);
// }

// }






//  public static void main (String[]args){

// int[] arr={ 9,1,8,4};

//     System.out.println(arr[arr.length -1]);
// }



 public static void main (String[]args){

int[] arr={ 3,6,9};
int sum=0;

for( int i = arr.length - 1; i >= 0; i--){
    sum= sum+arr[i];
   
}
 System.out.println(sum);
}


}