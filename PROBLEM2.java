// Java program to find the second largest element in the array
// using two traversals

class PROBLEM2  {
  

    // Function to find the second largest element in the array
    static void getSecondLargest(int[] arr) {
        int n = arr.length;

        int largest = -1, secondLargest = -1;

        // Finding the largest element
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
             
        }
            
    
       

        // Finding the second largest element
        for (int i = 0; i < n; i++) {
            
            // Update second largest if the current element is greater
            // than second largest and not equal to the largest
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
    
               System.out.println(largest);
               System.out.println(secondLargest);
       
    }
    

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        getSecondLargest(arr);
    }



}

