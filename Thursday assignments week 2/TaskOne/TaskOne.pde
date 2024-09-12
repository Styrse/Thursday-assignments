String thirty_one =  " has 31 days";
String thirty = " has 30 days";
String leap =  " typically has 28 days.\nIf the year is divisible by four it has 29 days.\nUnless the year is divisible by 100 then it will only have 28 days.\nThe last exception is if the year is also divisible by 400 then it will have 29 days.";


String month = "February";

switch (month) {
  case "January":
    println(month + thirty_one);
    break;
  case "February":
    println(month + leap);
    break;
  case "March":
    println(month + thirty_one);
    break;
  case "April":
    println(month + thirty);
    break;
  case "May":
    println(month + thirty);
    break;
  case "July":
    println(month + thirty_one);
    break;
  case "August":
    println(month + thirty_one);
    break;
  case "September":
    println(month + thirty);
    break;
  case "October":
    println(month + thirty_one);
    break;
  case "November":
    println(month + thirty);
    break;
  case "December":
    println(month + thirty_one);
    break;
  default:
    println("Buy a lottery ticket.");
}
