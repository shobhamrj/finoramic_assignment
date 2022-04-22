public class Solution {
    public int threeSumClosest(int[] A, int B) {
        Arrays.sort(A);
        int result = A[0] + A[1] + A[A.length - 1];
        for(int i = 0; i < A.length - 2; i++) {
            int left = i + 1;
            int right = A.length - 1;
            while (left < right) {
                int currentSum = A[i] + A[left] + A[right];
                if(currentSum > B)
                    right --;
                else
                    left ++;
                if(Math.abs(currentSum - B) < Math.abs(result - B))
                    result = currentSum;
            }
        }
        return result;
    }
}

