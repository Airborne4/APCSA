//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit7;

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive tri = new TriangleFive('C', 4);
	   System.out.println(tri.toString());
	   
	   TriangleFive tri2 = new TriangleFive('A', 5);
	   System.out.println(tri2.toString());
	   
	   TriangleFive tri3 = new TriangleFive('B', 7);
	   System.out.println(tri3.toString());
	   
	   TriangleFive tri4 = new TriangleFive('X', 6);
	   System.out.println(tri4.toString());
	   
	   TriangleFive tri5 = new TriangleFive('Z', 8);
	   System.out.println(tri5.toString());
	}
}