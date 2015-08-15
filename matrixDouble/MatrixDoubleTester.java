package matrixDouble;

public class MatrixDoubleTester {

	public static void main(String[] args) {
		MatrixDouble a = new MatrixDouble(1, 2, 3, 4);
		MatrixDouble b = new MatrixDouble(20, 10, 20, 1);
		MatrixDouble c = new MatrixDouble(-2, 1, 1.5, -0.5);
		MatrixDouble e = new MatrixDouble(1, 2, 3, 4);
		MatrixDouble z = new MatrixDouble(); // Return an empty matrix
		System.out.println("--------- Equality Check ------------------");
		System.out.println(a.isEquals(e));
		System.out.println("--------- Empty Matrix Check ---------------");
		System.out.println(z);
		System.out.println("--------- Inverse Check -----------------");
		System.out.println(a.isInverse(c));
		System.out.println("--------- Scalar Multiplication --------");
		a.scalarProduct(10);
		System.out.println(a);
		System.out.println("--------- Matrix Multiplication --------");
		// The product will give the matrix itself because we are multiplying it
		// with an identity matrix
		a.product(b);
		System.out.println(a);
		System.out.println("--------- Matrix Addition ---------------");
		a.add(b);
		System.out.println(a);
		System.out.println("--------- Matrix Subraction ---------------");
		a.subtract(b);
		System.out.println(a);
		System.out.println("--------- Getting the distance between two points ---------------");
		/**
		 * I am using two different points that have a change in x = 3 and
		 * change in y = 4 to see if they will give me the distance between the
		 * point
		 * 
		 */
		MatrixDouble y = new MatrixDouble(0, 3, 0, 4);
		System.out.println(y.lenght());

		MatrixDouble p = new MatrixDouble(1, 4, 1, 5);
		System.out.println(p.lenght());
		
		System.out.println("--------- Matrix Translation ---------------");
		System.out.println("Initial Matrix: " + a);
		a.translationMatrix(a, 2.0, 3.0);
		System.out.println(a.toString());
		System.out.println("--------- Matrix Rotation ---------------");
		System.out.println("Initial Matrix: " + b);
		b.translationMatrix(b, 20, 30);
		System.out.println(b.toString());


	}

}
