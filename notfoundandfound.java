public class notfoundandfound{
    public static void main(String[]args){
        int[] arr={4,9,2,7,5};
        int target =6;
        boolean found = false;

        for( int i=0; i<arr.length; i++){

            if(arr[i]==target){
                System.out.println("found"+i);
                found=true;
                break;
            }
            
   }

   if(found==false){
                System.out.println("not found");
            }
    }
}