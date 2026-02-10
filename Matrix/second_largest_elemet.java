public class second_largest_elemet {
    public static void main(String[] args) {
        int[] arr = {3,5,1,4,2};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element is: " + secondLargest);
    }
    
}
