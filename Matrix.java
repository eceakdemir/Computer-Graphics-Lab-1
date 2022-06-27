

package lab1;
import java.lang.Math;

public class Matrix {
	private int r; // number of rows
	private int c; // number of columns
	private static int[][] data; // R-by-C array

	public Matrix(int r, int c) {
		this.r = r;
		this.c = c;
		for(int i=0; i < r ; i++){
			for(int j=0; j < c; j++){
				data[i][j] = 0;
			}
		}
	}
	
	public Matrix(int[][] data) {
		this.r = r;
		this.c = c;
		for(int i=0; i < r ; i++){
			for(int j=0; j < c; j++){
				this.data[i][j] = this.data[i][j];
			}
		}
	}
	
	public static Matrix random(int r, int c) {
		Matrix newMatrix = new Matrix(r, c);
		for (int i=0; i < r; i++){
			for(int j=0; j < c; j++){
				newMatrix.data[i][j] = (int) (Math.random()*100);
			}
		}
		return newMatrix;
	}
	
	public int getRow() {
		return r;
	}
	
	public void setRow(int number) {
		r = number;
	}
	
	public int getColumn() {
		return c;
	}
	
	public void setColumn(int number) {
		c = number;
	}
	
	public int[][] getData() {
		return data;
	}
	
	public void setData( int[][] arr) {
		data = arr;
	}
	
	public Matrix add(Matrix B) {
		Matrix newMatrix = new Matrix(r, c);
		for(int i=0; i < B.r; i++){
			for(int j=0; j < B.c; j++){
				newMatrix.data[i][j] = data[i][j] + B.data[i][j];
			}
		}
		return newMatrix;
	}
	
	public Matrix subtract(Matrix B) {
		Matrix newMatrix = new Matrix(r, c);
		for(int i=0; i < B.r; i++){
			for(int j=0; j < B.c; j++){
				newMatrix.data[i][j] = data[i][j] - B.data[i][j];
			}
		}
		return newMatrix;
	}
	
	public Matrix multiply(Matrix B) {
		Matrix newMatrix = new Matrix(r, c);
		for(int i=0; i < B.r; i++){
			for(int j=0; j < B.c; j++){
				newMatrix.data[i][j] = data[i][j] * B.data[i][j];
			}
		}
		return newMatrix;
	}
	
	public void show(){
		for (int i=0; i < r; i++){
			for(int j=0; j < c; j++){
				System.out.println(data[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	
	public void fizzBuzz(){
		for(int i=0; i < c ; i++){
			if (data[0][i] % 3 == 0)
				System.out.println("fizz");
			else if(data[0][i] % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(data[0][i]);
		}
	}
	
	static boolean isPrime(int number){
		if (number == 2)
			return true;
		for (int i=2 ; i < (number/2) + 1 ; i++){
			if(number % i == 0)
				return false;
		}
		return true;
	}
	
	public void optimusPrime(){
		for(int i=0; i < c ; i++){
			if(data[0][i]==1)
				System.out.println(data[0][i]);
			else if(isPrime(data[0][i]) && (data[0][i] % 3 == 0 || data[0][i] % 5 == 0))
				System.out.println("optimusPrime");
			else if(isPrime(data[0][i]))
				System.out.println("Prime");
			else if (data[0][i] % 3 == 0)
				System.out.println("fizz");
			else if(data[0][i] % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(data[0][i]);
		}
	}
	
	public static void main(String[] args) {
		
	}
}

