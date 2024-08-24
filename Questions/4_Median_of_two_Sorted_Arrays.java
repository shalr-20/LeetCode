import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int m[] = new int[n1 + n2];

        int k = 0;
        for (int i = 0; i < n1; i++) {
            m[k++] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            m[k++] = nums2[i];
        }

        Arrays.sort(m);

        int msize = m.length;
        if (msize % 2 == 1) {
            return (double) m[msize / 2];
        } else {
            int mid1 = m[(msize - 2) / 2];
            int mid2 = m[msize / 2];
            return ((double) mid1 + (double) mid2) / 2.0;
        }
    }
}