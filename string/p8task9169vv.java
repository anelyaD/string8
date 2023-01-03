import java.util.Scanner;

class P8task9169vv{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//     9.169. Дано предложение. Вывести на экран:
// в) его слова, которые содержат хотя бы одну букву о.

    String word = in.nextLine();
    String array[] = word.split(" ");
    int count = 0;
    char e = 'e';
    char o = 'o';

    for (int i = 0; i < array.length; i++) {
      count = 0;
      int len = array[i].length();
      char arr[] = new char[len];

      for (int j = 0; j < len; j++ ) {
        arr[j] = array[i].charAt(j);
        o = arr[j];

        if (o == e) {
            count++;
        } else if (count >= 1) {
            System.out.println(array[i]);
          }  
      }
    }    
  }
}