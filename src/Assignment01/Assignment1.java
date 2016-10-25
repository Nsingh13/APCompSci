package Assignment01;
/* Assignment1
 *
 * 8/22/2016
 */
 
public class Assignment1
{
  public static void main(String[] args)
  {
   double triangleBase = 6;
   double triangleHeight = 10;
   double triangleArea  =0 ;
   triangleArea=triangleBase*triangleHeight*.5;
   System.out.println("Area = "+triangleArea+" Meters Squared");
   double circleRadius = 15;
   double circleCircumference = 0;
   double circleArea = 0;
   circleCircumference = circleRadius*3.14*2;
   System.out.println("Circumfrence = "+circleCircumference + " Meters" );
   circleArea =  (circleRadius)*(circleRadius)*(3.14);
   System.out.println("Area = "+circleArea + " Meters Squares" );
  }
}
