package matrixDouble;

public class MatrixDouble {
	// Matrix is declared and constructed
	private double[][] m = new double[2][2];

	// We are creating this empty constructor because in order to avoid the
	// method from being invalid and invalid state
	/**
	 * Zero-parameter private constructor that returns (0,0,0,0) matrix in
	 * default
	 * 
	 */
	public MatrixDouble() {
		m[0][0] = 0;
		m[0][1] = 0;
		m[1][0] = 0;
		m[1][1] = 0;
	}

	public MatrixDouble(double m00, double m01, double m10, double m11) {
		m[0][0] = m00;
		m[0][1] = m01;
		m[1][0] = m10;
		m[1][1] = m11;
	}

	/**
	 * construct a new MatrixDouble with exactly the same values as the
	 * input src.
	 * 
	 * @param src
	 * @return
	 */
	public MatrixDouble(MatrixDouble src) {

		this.m[0][0] = src.m[0][0];
		this.m[0][1] = src.m[0][1];
		this.m[1][0] = src.m[1][0];
		this.m[1][1] = src.m[1][1];

		new MatrixDouble(src.m[0][0], src.m[0][1], src.m[1][0], src.m[1][1]);

	}

	/**
	 * Add rh to this
	 * 
	 * @param rh
	 *            Matrix to add
	 * @return Sum of current matrix and input
	 */
	public void add(MatrixDouble rh) {
		this.m[0][0] += rh.m[0][0];
		this.m[0][1] += rh.m[0][1];
		this.m[1][0] += rh.m[1][0];
		this.m[1][1] += rh.m[1][1];
	}

	/**
	 * multiply this by a scalar value
	 * 
	 * @param rh
	 *            Matrix to add
	 * @return Sum of current matrix and input
	 */
	public void scalarProduct(double d) {
		m[0][0] = m[0][0] * d;
		m[0][1] = m[0][1] * d;
		m[1][0] = m[1][0] * d;
		m[1][1] = m[1][1] * d;
	}

	/**
	 * multiply this by rh
	 * 
	 * @param rh
	 *            Matrix to add
	 * @return Sum of current matrix and input
	 */
	public void product(MatrixDouble rh) {
		MatrixDouble temp = new MatrixDouble();
		temp.m[0][0] = (this.m[0][0] * rh.m[0][0])
				+ (this.m[0][1] * rh.m[1][0]);
		temp.m[0][1] = (this.m[0][0] * rh.m[0][1])
				+ (this.m[0][1] * rh.m[1][1]);
		temp.m[1][0] = (this.m[1][0] * rh.m[0][0])
				+ (this.m[1][1] * rh.m[1][0]);
		temp.m[1][1] = (this.m[1][0] * rh.m[0][1])
				+ (this.m[1][1] * rh.m[1][1]);
		this.m = temp.m;
	
	}

	/**
	 * TO DO: Update this Matrix to return the Identity Matrix
	 * 
	 * @return
	 */
	public static MatrixDouble identity() {
		return new MatrixDouble(1, 0, 0, 1);
	}

	/**
	 * Return true if rh*this equals the Identity Matrix and false otherwise.
	 * 
	 * @param rh
	 * @return
	 */
	public boolean isInverse(MatrixDouble rh) {
		MatrixDouble temp = new MatrixDouble();
		temp.m[0][0] = (this.m[0][0] * rh.m[0][0])
				+ (this.m[0][1] * rh.m[1][0]);
		temp.m[0][1] = (this.m[0][0] * rh.m[0][1])
				+ (this.m[0][1] * rh.m[1][1]);
		temp.m[1][0] = (this.m[1][0] * rh.m[0][0])
				+ (this.m[1][1] * rh.m[1][0]);
		temp.m[1][1] = (this.m[1][0] * rh.m[0][1])
				+ (this.m[1][1] * rh.m[1][1]);
		if ((temp.m[0][0] == 1) && (temp.m[0][1] == 0) && (temp.m[1][0] == 0)
				&& (temp.m[1][1] == 1)) {
			return true;
		}
		return false;
	}
	/**
	 * Method that enables a user to check if two matrices are equal
	 * 
	 * @param eq
	 * @return
	 */
	public boolean isEquals(MatrixDouble eq) {

		if ((eq.m[0][0] == this.m[0][0]) && (eq.m[0][1] == this.m[0][1])
				&& (eq.m[1][0] == this.m[1][0]) && (eq.m[1][1] == this.m[1][1])) {
			return true;
		}
		return false;
	}
	/**
	 * Method that enables a user to subtract one matrix from another
	 * 
	 * @param rh
	 */
	public void subtract(MatrixDouble rh) {
		this.m[0][0] -= rh.m[0][0];
		this.m[0][1] -= rh.m[0][1];
		this.m[1][0] -= rh.m[1][0];
		this.m[1][1] -= rh.m[1][1];
	}
	/**
	 * A method that returns the length of any two given coordinates
	 * 
	 * @param db
	 */
	public double lenght(){
		double length = 0.0;
		length = Math.sqrt(((this.m[0][1] - this.m[0][0])*(this.m[0][1] - this.m[0][0])) + ((this.m[1][1] - this.m[1][0])*(this.m[1][1] - this.m[1][0])));
		/**
		 * here a = (x1-x0)^2 and b = (y1-y0)^2
		 *
		 */
		return length;
	}
	
	// Key methods for the ideaFest!!
	/**
	 * 
	 * @param matrix
	 */
	public static void identity(MatrixDouble rh)
	{
		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				if (i == j)
					rh.m[i][j] = 1;
				else
					rh.m[i][j] = 0;
			}
		}	
	} 
	/**
	 * 
	 * @param matrix
	 * @param a
	 * @param b
	 */
	public void translationMatrix(MatrixDouble rh, double a, double b)
	{
		//identity(rh);
		rh.m[0][1] = a;
		rh.m[1][1] = b;	
		
		this.m[0][1] = rh.m[0][1];
		this.m[1][1] = rh.m[1][1];
	} //end method translationMatrix
	/**
	 * 
	 * @param matrix
	 * @param theta
	 */
	public  void rotationMatrix(MatrixDouble rh, double theta)
	{
		// Rotate the Matrix
		identity(rh);
		rh.m[0][0] = Math.cos(theta);
		rh.m[0][1] = -(Math.sin(theta));
		rh.m[1][0] = Math.sin(theta);
		rh.m[1][1] = Math.cos(theta);	
		// Set it to the default matrix
		this.m[0][0] = rh.m[0][0];
		this.m[0][1] = rh.m[0][1];
		this.m[1][0] = rh.m[1][0];
		this.m[1][1] = rh.m[1][1];
		
		
	} 
	
	public String toString() {
		return m[0][0] + " " + m[0][1] + " " + m[1][0] + " " + m[1][1] + " ";
	}
}
