class Solution {
    public int[] plusOne(int[] digits) {
      for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		//adding one to the digit if its less than 9 starting from th last index
		return digits;
	}
	digits[i] = 0;//making lasst index 0 if its 9 then incrementing the prev element
}

digits = new int[digits.length + 1];//addding the length of the array if its 9
digits[0] = 1;
 return digits;
        
    }
}