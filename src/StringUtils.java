public class StringUtils {

    public  boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(text.charAt(left));
            char rightChar = Character.toLowerCase(text.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

}