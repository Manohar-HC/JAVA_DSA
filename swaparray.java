public class swaparray{
    public static void main(String[] args) {
        int[] arr={5, 8, 3, 1 };
        int start=0;
int end = arr.length -1;

while (start< end ) { 
    int temp = arr[start];
    arr[start]= arr[end];
    arr[end]= temp;
    start++;
    end--;
}
for(int i=0; i<arr.length; i++){
    System.out.println(arr[i]);
}
    }
}



// public class SwapTwoElements {

//     public static void main(String[] args) {

//         int[] arr = {1,5,3,8,2};

//         int temp = arr[1];
//         arr[1] = arr[3];
//         arr[3] = temp;

//         for(int i = 0; i < arr.length; i++){
//             System.out.println(arr[i]);
//         }

//     }
// }

// int temp = arr[1];
// arr[1] = arr[3];
// arr[3] = temp; // for swapping one element
// This pattern is used in many DSA problems like:

// Reverse array

// Palindrome check

// Two-sum problems

// Sliding window algorithms