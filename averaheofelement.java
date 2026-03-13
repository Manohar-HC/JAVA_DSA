public class averaheofelement{
    public static void main(String[] args) {
        int[] arr={ 3,6,9};
        int sum=0;
        for (int i=0; i< arr.length; i++){
            sum=sum+arr[i];
        }
        int average= sum/arr.length;
        System.out.println(average);
    }
}
/*If we want the real decimal average

We must use double.

Example:

double average = (double) sum / arr.length;

if we store in int it will give 4 5 6 7 8  like this 
if we store in double it give 5.6 7.88 9.00 7.89 6.66 like this*/