public class sum_of_two_ele_eq_k {
    public static void main(String[] args) {
        int[] arr = {3,-2,1,4,3,6,8};
        int k = 10;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == k){
                    System.out.println("Yes");
                }
            }
        }
    }
}
