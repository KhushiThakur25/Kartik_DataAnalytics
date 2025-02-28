public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,52,12,13,1,56,18,55};
        int target = 132;
        boolean found = false;
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                index = i;
                break;
            }
        }
        if(found){
            System.out.println("Your element found at " + index + " here..");
        }
        else{
            System.out.println("Your element not found");
        }
    }
}