public class oddeven{
    public static void main(String[] args) {
        
        int[] numbers={ 3, 8, 11, 6, 2};
        int evennumber=0;
        int oddnumber=0;
        for (int i=0; i< numbers.length; i++){
            if(numbers[i]%2==0){
                evennumber++;
            }
            else{
                oddnumber++;
            }
        }
        System.out.println("odd numbers: "+ oddnumber);
        System.out.println("even numbers: "+ evennumber);
    }
}