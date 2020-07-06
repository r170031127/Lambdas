package prathyushalast;

import java.util.*; 
import java.util.stream.IntStream; 

public class Avg_of_Integers {
   public static void main(String[] args) 
      {
          IntStream stream = IntStream.of(2, 3, 3, 4, 6, 7, 8); 
          OptionalDouble object = stream.average(); 
          if (object.isPresent()) { 
              System.out.println(object.getAsDouble()); 
          } 
          else { 
              System.out.println("-1"); 
          } 
      } 

}