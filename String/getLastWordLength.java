// Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
// If the last word does not exist, return 0.
//
// Note: A word is defined as a character sequence consists of non-space characters only.
//
// Example:
//
// Given s = "Hello World",
//
// return 5 as length("World") = 5.
//
// Please make sure you try to solve this problem without using library functions. Make sure you only traverse the string once.

class Solution {
	public static int lengthOfLastWord(final String a) {
    public int lengthOfLastWord(final String a) {
    String str = a.trim();
   int len = str.length();
    int count=0;
    for(int i=len-1; i>=0; i--){
      count++;
      if(str.charAt(i)==32){
        return(count-1);
      }else if( i==0){
        return(count);
      }
    }
    return(0);
}
	}

  public static void main(String[] args) {
    System.out.println(Solution.lengthOfLastWord("  xDGBklKecz IAcOJYOH O  WY WPi"));
  }
}
