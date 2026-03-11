
public class sumofarray {

    public static void main(String[] args) {

        int[] arr = {5,3,7};

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
