public class linearsearch{//creat a class


    public static int search(int[] arr, int target){//Create a method called search

        for(int i = 0; i < arr.length; i++){
/*Linear Search returns:

index of the element

NOT the value.*/

            if(arr[i] == target){
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,9,2,7};

        int result = search(arr, 2);

        System.out.println(result);
    }
}
