void setup() {
  methodOne();
  methodTwo();
}

/*
  The following method has an error in it. Fix the error and run it.
 */

void methodOne()
{
  int i = 1000; // You are not allowed to change this line.

  int max = 10;

  if (i > max) {
    String output = "i is greater than "+max+".";
    println(output);
  } else {
    println("i is less than " + max + ".");
  }
}

/*
 Finish the following method so that we can change the number assigned
 to the weekday and it prints the correct output.
 */
void methodTwo()
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday.
  boolean weekend = false;

  if (weekDay < 5) {
    weekend = false;
  } else {
    weekend = true;
  }

  // Print the name of the weekday here:
  String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

  int i = 0;
  if (weekDay > 6) {
    println("Please enter a valid number for weekDay");
  } else {
    while (i != weekDay) {
      i++;
      if (i == weekDay) {
        println(days[i]);
      }
    }


    // Print if it is weekend here:
    if (weekend == true) {
      println("Weekend");
    }
  }
}
