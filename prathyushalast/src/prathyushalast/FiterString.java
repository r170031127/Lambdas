package prathyushalast;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class FiterString {
  public static List<String> search(List<String> list) {
    return list
        .stream()
        .filter(s -> s.startsWith("a") && s.length()==3)
        .collect(Collectors.toList());
  }
  
  public static void main(String args[]) {
    
    List<String> li = new ArrayList<String>();
     li.add("abc"); 
          li.add("aaa"); 
          li.add("bbb");
          li.add("abcd");
          List<String> s = search(li); 
          System.out.println(s);
     
            
    
  }
}