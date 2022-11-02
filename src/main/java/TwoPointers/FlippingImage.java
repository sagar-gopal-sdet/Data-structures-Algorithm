package TwoPointers;

import org.testng.annotations.Test;

public class FlippingImage {
    @Test
    public void testData() {
        int[][] arr = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(flipAndInvertImage(arr));
    }

    public int[] reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }

        return arr;
    }


    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = reverseArray(image[i]);
        }

        return image;
    }
}

