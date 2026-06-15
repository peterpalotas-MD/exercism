import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ReverseString {

    String reverse(String inputString) {
        char[] c = inputString.toCharArray();

        int left = 0;
        int right = c.length-1;
        while (left<right){
            char temp = c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;right--;
        }

        return new String(c);
    }
  
}
