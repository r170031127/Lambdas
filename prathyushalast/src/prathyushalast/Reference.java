package prathyushalast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Reference {
  public static void main(String[] args) {
        List<String> Li = Arrays.asList("aba","aaa","abbba","acdfe","abcddcba","avdc","abcdef");
        List<String> palindromes = Reference.findPal(Li, 
                (stri) -> Reference.isPal((String) stri));
 
        System.out.println("Palindromes are " + palindromes);
    }
 
    public static boolean isPal(String stri) {
      StringBuffer String =new StringBuffer();
      for(int i = stri.length()-1; i >= 0 ; i--) {
      String = String.append(stri.charAt(i));
      }
      if(stri.equalsIgnoreCase(String.toString())) {
        return true;
      } else {
        return false;
      }
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
      List<String> sortedpal = new ArrayList<String>(); 
      list.stream().filter((i) -> (predicate.test((String) i))).forEach((i) -> {sortedpal.add((String) i);});
        return sortedpal;
 
    }
    
}