String address;
int sum;
float divisionResult;
String welcomeMessage;

void setup()  {
  address = "Firskovvej 18";
  sum = 2+3;
  divisionResult = (float)7/2;
  welcomeMessage = "Welcome to CPHBUSINESS ";
  
  println("Address: " + address);
  println("Sum: " + sum);
  println("Result division: " + divisionResult);
  println("Welcome message: " + welcomeMessage);
  
  address = "Adolphsvej 25";
  sum = 27+15;
  divisionResult = (float)18/25;
  welcomeMessage = "Tess is your teacher.";
  
  println("Address: " + address);
  println("Sum: " + sum);
  println("Result division: " + divisionResult);
  println("Welcome message: " + welcomeMessage);
  
  address += " " + "2820";
  sum ++;
  divisionResult += (2/1);
  welcomeMessage += " Tess will bring cake every Friday";
  
  println("Address: " + address);
  println("Sum: " + sum);
  println("Result division: " + divisionResult);
  println("Welcome message: " + welcomeMessage);
  
  sum ++;
  divisionResult ++;
  
  println(sum);
  println(divisionResult);
  
  sum += 3;
  divisionResult += 3;
  
  println(sum);
  println(divisionResult);
  
 sum --;
 divisionResult --;
 
 println(sum);
 println(divisionResult);
  
}
