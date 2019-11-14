package leetcode;

public class Main {
// TODO: improve to O(N) by update haspmap for character by index
    public static void main(String[] args) {
	// write your code here
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        String result = "";
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){
            String value = String.valueOf(s.charAt(i));
            if(!result.contains(value)){
                result += value;
            }else{
                if(result.length() > maxLength) maxLength = result.length();
                int index = result.indexOf(value);
                if(index + 1 <=  result.length()-1){
                    result = result.substring(index+1);
                    result+= value;
                }else{
                    result = value;
                }

            }

        }
        return maxLength > result.length() ? maxLength: result.length();
    }
}
