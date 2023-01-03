import java.util.Scanner;

class P8task9116{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		String a = word.replace(" ","");
        
    int length = a.length();
   	int arr[] = new int [length];
	
    String p = "";
    String v = "";

    for (int i = 0; i < length; i++) {
      	char c = a.charAt(i);
      	p = p + c;
    }
    System.out.println(p);

    for (int j = length - 1; j <= length && j != -1; j--) {
      	char c1 = a.charAt(j);
      	v = v + c1;
    }
    System.out.println(v);

    boolean res = v.equals(p);
    System.out.println(res);    
	}
}