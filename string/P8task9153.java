import java.util.Scanner;

class P8task9153{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int count = 0;
    String a1 = in.nextLine();
    String a2 = a1.replace(" ","");
    int length = a2.length();
    char arr[] = new char [length];
    int array[] = new int [length];

    for (int i = 0;i < length - 1;i++ ) {
      arr[i] = a2.charAt(i);
      arr[i + 1] = a2.charAt(i + 1);

      if (arr[i] == arr[i + 1]) {
        count++;
        array[i] = count;
      } else{
          count = 0;
          array[i] = count;
        }
    }

      int max = 0;
      int maxindex = 0;

    for (int j = 0;j < length ;j++) {

      for (int t = j + 1;t < length ;t++ ) {

        if (max < array[j]) {
          max = array[j];
          maxindex = j; 
        } 
      }     
    }
    System.out.println((max + 1) + " " + arr[maxindex]);    
  }
}