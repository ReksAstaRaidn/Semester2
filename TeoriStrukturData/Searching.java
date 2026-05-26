public class Searching {
    
    public static int search(int[] arr, int target) {
     
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                return i; // Return the index of the target
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;

        int result = search(arr, target);
        if(result == -1) {
            System.out.println("Element is not present in array");
        } else {
            System.out.println("Element is present at index: " + result);
        }
    }
}
