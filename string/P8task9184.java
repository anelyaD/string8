import java.util.Scanner; 
 
class P8task9184{ 
  public static void main(String[] args) { 
    Scanner in = new Scanner(System.in); 
 
    String word = in.nextLine(); 
    int length = word.length(); 
    char arr[] = new char[length]; 
    boolean res = word.startsWith(")"); 
    boolean f = false; 
    int count = 0; 
    int count1 = 0; 
    for(int i = 0; i < length; i++){ 
      if(res==true){ 
        f = true; 
      } else{ 
          f = false; 
        } 
    } 
    for (int j = 0; j < length; j++) { 
      if (f == true) { 
      System.out.println("Not balanced"); 
      break; 
      }else{ 
        for(int i = 0; i < length; i++){ 
          if(word.charAt(i) == '('){ 
            count++; 
          } 
          if(word.charAt(i) == ')'){ 
          count1++; 
          } 
        } 
      } 
    } 
    if (f != true) { 
    
   
      if(count == count1){ 
        System.out.println("Balanced"); 
      }else{ 
        System.out.println("Not balanced"); 
      } 
    } 
  } 
}