import java.util.Scanner;

class P8task9157{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String st1 = in.nextLine();
    int st1len = st1.length();
    char arr1[] = new char [st1len];

    String st2 = in.nextLine();
    int st2len = st2.length();
    char arr2[] = new char[st2len];


    boolean f = false;
    for (int i = 0; i < st1len; i++ ) {
      arr1[i] = st1.charAt(i); 
    }
    for (int j = 0; j < st2len; j++ ) {
      arr2[j] = st2.charAt(j);  
    }

    for (int k = 0; k < st1len; k++ ) {
      for (int l=0; l < st2len; l++ ) {
        f = false;
        
        if (arr1[k] == arr2[l]) {
          f = true;
          break;
        }
      }

      if (f == true) {
        System.out.println("yeaap");
        
      }else if (f==false) {
        System.out.println("nooo");
      }
    }
  }
}