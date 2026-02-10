// given an array of integer A find and written the product of these same size where ith element of the product arraywill be equal to the product of all the element divided by the ith element of the array.


public class product_ele_is_equal_to_the_array {

    public static void main(String[] args){
        int[] arr = {5,1,10,1};
        int prod = 1;
        for(int i=0;i<arr.length;i++){
            prod *= arr[i];
        }
        int[] productArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            productArr[i] = prod / arr[i];
        }
        for(int i=0;i<productArr.length;i++){
            System.out.print(productArr[i] + " ");
        }
    }
}