public class PrefixSum {
    public static void main(String[] args){
        int count =0;
        int arr[] = {-1,2,3,4,-5,6};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(max>arr[i]){
                count+=1;
            }
        }
        System.out.println(count);
        

    }

}