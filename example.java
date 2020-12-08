public class Number{

 protected double x;
 public Number(){
	x = 10.0;
}
 public Number(double x){
	this.x = x;
}
 public double getX(){
	return x;
}
 
public String toString(){
	return "The number is " + x;
}
 public static Number add(Number n1, Number n2) {
	return new Number(n1.x + n2.x);
}

public static Number add(Number n1){
	Number n2 = new Number();
	return new Number(n1.x + n2.x);
 }

}
//end class Number
public class TrickyNumber extends Number{
 private double y;
 public TrickyNumber(double x, double y){
	super(x);
	this.y = y;
}
 public double getX(){
	return x+y;
}
 public double getY(){
	return y;
}
 public String toString(){
	return (super.toString() + ";" + y);
}
 public static Number add(Number n1, Number n2) {
	return new Number(2*n1.x + 2*n2.x);
}

}
//end class TrickyNumber
/*For each of the following programs write the output to the console if the code runs without error. 
In case of a compile error, indicate that and the reason for the error. In case an exception is thrown at run-time, indicate the name of the exception and the reason it is thrown. 
Note that classes Test1-Test5 are declared in the same package as classes Number and TrickyNumber.
*/

 public class Test1{
 public static void main( String args[ ] ){
 Number n = new TrickyNumber (1, 4);
 TrickyNumber t = (TrickyNumber)n;
 System.out.println(n.getX());
 System.out.println(t.getX());

}
//end main
}
//end class Test1
// ANSWER:



 public class Test2{
 public static void main( String args[ ] ){
 Number n = new TrickyNumber (1, 4);
 TrickyNumber t = (TrickyNumber)n;
 System.out.println(n.add(n,n).getX());
 System.out.println(t.add(n,n).getX());
 System.out.println(t.add(n).getX());

}
//end main

}
//end class Test2 ANSWER: 2.0 // 4.0 // 11.0
(c) public class Test3{
 public static void main( String args[ ] ){
 Number n = new Number();
 TrickyNumber t = (TrickyNumber)n;
 System.out.println(n.toString());
 System.out.println(t.toString());

}
//end main
}
//end class Test3 ANSWER: ClassCastException since object n is not a TrickyNumber object
(d) public class Test4{
 public static void main( String args[ ] ){
 Number n = new TrickyNumber(0,0);
 TrickyNumber t = (TrickyNumber)n;
 System.out.println(n.getX());
 System.out.println(n.getY());

}
//end main
}

//end class Test4 

//ANSWER: 


(e) public class Test5{
 public static void main( String args[ ] ){
 Number n1 = new Number (5);
 Number n2 = n1;
 n1 = null;
 n2 = Number.add(n1,n2);
 System.out.println(n2.getX());

}
//end main
}
//end class Test5 
//ANSWER: 
