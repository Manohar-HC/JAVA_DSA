public class binarysearch{
    public static void main(String[] args) {
        /*1. Find middle element
2. Compare with target
3. If target bigger → go right
4. If target smaller → go left
5. Repeat
these are the steps to follow the binary search

mid=(start+end)/2
start=0
end =4
mid=(0+4) /2=2


*/  


// meaning
// start=first index number
// end= last indoex 


        int[] arr = {2,4,6,8,10};
        int target = 8;

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = (start + end) / 2;

            if(arr[mid] == target){
                System.out.println("Found at index " + mid);
                break;
            }

            if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }

    }
}



    
