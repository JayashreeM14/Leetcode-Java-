class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int length = arr.length;

        if (length % 2 != 0) {
            return arr[length / 2];
        }

      
        int middle1 = arr[length / 2 - 1];
        int middle2 = arr[length / 2];

        return (middle1 + middle2) / 2.0;
    }
}