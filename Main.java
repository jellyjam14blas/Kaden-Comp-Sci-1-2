/*

a a^2 a^3
1 1 1
2 4 8
3 9 27
4 16 64

*/

class Main {
  public static void main(String[] args) {
  System.out.println("");   
    System.out.println("a a^2 a^3\n1 1 1\n2 4 8\n3 9 27\n4 16 64");
  System.out.println(""); 
  double cradius;
  double cperimeter;
  double carea;

  cradius = 5.5;  
  cperimeter = 2*cradius*3.14;
  carea = cradius*cradius*3.14;
  System.out.println("Hello");
  //System.out.println("The Radius of the Circle is " + radius);
  System.out.println("The Circle of Radius " + cradius + " has a Perimeter of " + cperimeter + " and an Area of " + carea + ".");
  System.out.println("");

double sw = 4.5;
double sh = 7.9;
double sarea;

sarea = sw*sh;

System.out.println("The Square of Width " + sw + " and Hieght " + sh + " has an Area of " + sarea + ".");
System.out.println("");

double speed1 = 1.6*14/1.3;
System.out.println("The Speed in MPH is " + speed1 + ".");
System.out.println("");

double speed2 = 24*1.4035/1.6;
System.out.println("The Speed in KMH is " + speed2 + ".");
System.out.println("");


double celsius = 43;
double fahrenheit;
fahrenheit = (9 / 5) * celsius + 32;
System.out.println("The Temp in Fahrenheit is " + fahrenheit + ".");
System.out.println("");

double cylinderR = 5.5;
double cylinderH = 12;
double cylinderA;
double cylinderV;
cylinderA = cylinderR * cylinderR * 3.14;
cylinderV = cylinderA * cylinderH;
System.out.println("The Volume of the cylinder is " + cylinderV + ".");
System.out.println("");

int num = 932;
int numcopy;
numcopy = num; 
int sum = 0;
  while (num > 0) {
  sum = sum + num % 10;
  num = num / 10;
 }
System.out.println("The Sum of the int " + numcopy + " is " + sum + ".");
System.out.println("");; 

  }
}