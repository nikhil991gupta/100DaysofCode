public class sortarray {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1); // Call the recursive Merge Sort 
        return nums;
    }
private void mergeSort(int[] nums, int start, int end) {
    if (start < end) { // Base case - Check if array has only 1 element
        int mid = (start + end) / 2; // Calculate the middle index
        mergeSort(nums, start, mid); // Recursively call Merge Sort on left subarray
        mergeSort(nums, mid + 1, end); // Recursively call Merge Sort on right subarray
        merge(nums, start, mid, end); // Merge the sorted left and right subarrays
    }
}

private void merge(int[] nums, int start, int mid, int end) {
    int[] temp = new int[end - start + 1]; // Create a temporary array to store the merged subarrays
    int i = start, j = mid + 1, k = 0; // Initialize indices for left subarray, right subarray, and temporary array
    
    // Compare elements in the left and right subarrays, and store the smaller element in the temporary array
    while (i <= mid && j <= end) {
        if (nums[i] < nums[j]) {
            temp[k++] = nums[i++];
        } else {
            temp[k++] = nums[j++];
        }
    }
    
    // Copy any remaining elements in the left subarray to the temporary array
    while (i <= mid) {
        temp[k++] = nums[i++];
    }
    
    // Copy any remaining elements in the right subarray to the temporary array
    while (j <= end) {
        temp[k++] = nums[j++];
    }
    
    // Copy the merged subarray from the temporary array back to the original array
    for (int p = 0; p < temp.length; p++) {
        nums[start + p] = temp[p];
    }
}
}