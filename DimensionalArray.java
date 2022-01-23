
public class DimensionalArray {

	public static void main(String[] args) {
		
        int[] a[], b = { 4 };
        a = new int[2][2];
        b = new int[3];
  
        // print single dimensional arrays
        for (int i = 1; i < 2; i++)
            System.out.println(b[i]);
  
        
        // print multi-dimensional  arrays
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = 105;
                System.out.println(a[i][j]);
            }
        }
       
	}

}
