package sec40.exam40;

public class New1 {

	public static void main(String[] args) {
		
		/*int data[][] =  {{10,15,7,3},{1,6,17,2},{20,2,6,4}};
		 for(int i=0; i<data.length; i++) {
			for(int k=0; k<data[i].length; k++) {
				System.out.println("data["+i+"]["+k+"]="+data[i][k]);
			}
			
		} */
		
		int data[][]= new int [3][];
		data[0] = new int[4];
		data[1] = new int[4];
		data[2] = new int[4];
		
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++)
				System.out.print(data[i][j]+" ");
			System.out.println( );
		}

	}

}
