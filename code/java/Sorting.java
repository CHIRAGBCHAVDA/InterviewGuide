import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Input Size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter A[" + i + "]: ");
            arr[i] = scanner.nextInt();
        }

        System.out.print("Select Sorting Algorithm:" +
                "\n1.Bubble\n2.Selection\n3.Insertion\n4.Shell\n5.Merge\n" +
                "Enter your choice: ");
        int selected = scanner.nextInt();
        System.out.println("\nUnsorted Output: " + Arrays.toString(arr));

        scanner.close();
        switch (selected) {
            case 1:
                bubbleSort(arr);
                break;
            case 2:
                selectionSort(arr);
                break;
            case 3:
                insertionSort(arr);
                break;
            case 4:
                shellSort(arr);
                break;
            case 5:
                mergeSort(arr, 0, n - 1);
                break;
            default:
                System.out.println("Invalid Input");
                return;
        }

        System.out.println("Sorted Output: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int temp;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int temp, min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static void shellSort(int[] arr) {
        int j, temp, n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                temp = arr[i];
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void mergeSort(int[] arr, int s, int e) {
        // Return back if single element
        if (s >= e)
            return;

        // Divide array and sort both sides
        int mid = (s + e) / 2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);

        // Create 2 new arrays and store both sorted arrays
        int len1 = mid - s + 1;
        int len2 = e - mid;
        int arr1[] = new int[len1];
        int arr2[] = new int[len2];
        for (int i = 0; i < len1; i++)
            arr1[i] = arr[s + i];
        for (int i = 0; i < len2; i++)
            arr2[i] = arr[mid + 1 + i];

        // Combine both arrays in main array in sorted order
        int i = s, i1 = 0, i2 = 0;
        while (i1 < len1 && i2 < len2) {
            if (arr1[i1] < arr2[i2])
                arr[i++] = arr1[i1++];
            else
                arr[i++] = arr2[i2++];
        }
        while (i1 < len1)
            arr[i++] = arr1[i1++];
        while (i2 < len2)
            arr[i++] = arr2[i2++];
    }
}