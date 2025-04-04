public class 연습문제3 {
    public static void main(String[] args) {
        int[] arr = {1,9,4,2,5};
        int temp;
        for(int i=0;i<arr.length/2;i++){
            temp = arr[i];
            arr[i] = arr[arr.length-1- i];
            arr[arr.length-1-i] = temp;
        }
        printArray(arr);
        
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }
}
