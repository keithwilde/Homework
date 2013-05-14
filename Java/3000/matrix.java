// strassen's matrix multiplication algorithm
public class matrix {

	public static void main(String [] args){
		int[][] a = {{1,2},{2,2}};
		int[][] b =  {{3,4},{3,2}};
		int[][]c = strassenMult(a,b);
		
		System.out.println("A");
		System.out.println(printMatrix(a));
		System.out.println("\n B");
		System.out.println(printMatrix(b));
		System.out.println("\n C");
		System.out.println(printMatrix(c));
	}


	  public static int [][] strassenMult(int [][] a, int [][] b) {
	        
	    	int n = a.length;
	        int [][] c = new int[n][n];

	        if(n == 1) {
	            c[0][0] = a[0][0]*b[0][0];
	        } 
	        
	        else {
	            int [][] a11 = new int[n/2][n/2];
	            int [][] a12 = new int[n/2][n/2];
	            int [][] a21 = new int[n/2][n/2];
	            int [][] a22 = new int[n/2][n/2];
	            int [][] b11 = new int[n/2][n/2];
	            int [][] b12 = new int[n/2][n/2];
	            int [][] b21 = new int[n/2][n/2];
	            int [][] b22 = new int[n/2][n/2];
	            
	            //divides A,B into n/2 x n/2 matrices
	            subMatrix(a, a11, 0 , 0);
	            subMatrix(a, a12, 0 , n/2);
	            subMatrix(a, a21, n/2, 0);
	            subMatrix(a, a22, n/2, n/2);
	            subMatrix(b, b11, 0 , 0);
	            subMatrix(b, b12, 0 , n/2);
	            subMatrix(b, b21, n/2, 0);
	            subMatrix(b, b22, n/2, n/2);

	            int [][] p1 = strassenMult(add(a11, a22), add(b11, b22));
	            int [][] p2 = strassenMult(add(a21, a22), b11);
	            int [][] p3 = strassenMult(a11, subtract(b12, b22));
	            int [][] p4 = strassenMult(a22, subtract(b21, b11));
	            int [][] p5 = strassenMult(add(a11, a12), b22);
	            int [][] p6 = strassenMult(subtract(a21, a11), add(b11, b12));
	            int [][] p7 = strassenMult(subtract(a12, a22), add(b21, b22));
	            
	            //submatrices of result matrix
	            int [][] c11 = add(subtract(add(p1, p4), p5), p7);
	            int [][] c12 = add(p3, p5);
	            int [][] c21 = add(p2, p4);
	            int [][] c22 = add(subtract(add(p1, p3), p2), p6);
	            	            
	            //copies c11,c12,c21,c22 to c    
	            copyMatrix(c11, c, 0 , 0);
	            copyMatrix(c12, c, 0 , n/2);
	            copyMatrix(c21, c, n/2, 0);
	            copyMatrix(c22, c, n/2, n/2);
	        }

	        return c;
	    }
	   
	  //divides matrix into submatrices
	  public static void subMatrix(int[][] matrix, int[][] sub, int i, int j){
		  
		  for(int x = 0; x<sub.length; x ++){
	    	  for(int y = 0; y < sub.length; y ++){
	    		  sub[x][y] = matrix[i][j];
	    		  	  j++;
	    		  
	    	  }
	    	  i++;
	    	}
		
	    }
	    
		//adds two square matrices
	  public static int [][] add(int [][] a, int [][] b){
	        int n = a.length;
	        int [][] sum = new int[n][n];

	        for(int i=0; i<n; i++){
	        	for(int j=0; j<n; j++){
	        	sum[i][j] = a[i][j] + b[i][j];
				}
			}
	        return sum;
	    }
	    
	    // subtracts square matrices
	   public static int [][] subtract(int [][] a, int [][] b){
	        
	    	int n = a.length;
	        int [][] result = new int[n][n];

	        for(int i=0; i<n; i++)
	            for(int j=0; j<n; j++)
	                result[i][j] = a[i][j] - b[i][j];

	        return result;
	    }
	    
	   
	   //copies submatrices into matrix
	   public static void copyMatrix(int[][] sub, int[][] matrix, int i, int j){
		   for(int x = 0; x<sub.length; x ++){
		    	  for(int y = 0; y < sub.length; y ++){
		    		  matrix[i][j] = sub[x][y];
		    		  j++;
		    	  }
		    	  i++;
		      }
	 
	     }
	   
	   //returns string representation of a matrix c
	   public static String printMatrix(int[][] c){
		   String result= "";	
		   int row = c.length;
		   int col = c[0].length;
			for(int i = 0; i < row; i++) {
				 result += "(";
				 for(int j = 0; j < col; j++) {
					 result += " " + c[i][j];
				 	}
				 result += " )\n";
			}
			return result;
	   }
	}

