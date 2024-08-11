import java.util.Scanner;
 class LinearSearch {

    public int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index where the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key element to be searched:");
        int key = sc.nextInt();

        LinearSearch object = new LinearSearch();
        int res = object.search(arr, key);

        if (res >= 0) {
            System.out.println(key + " is found at position " + res);
        } else {
            System.out.println("Element not found");
        }
    }
}

