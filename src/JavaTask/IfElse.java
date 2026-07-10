package JavaTask;

public class IfElse {
    public static void main(String[] args) {
        int marks = 45;
        if (marks > 40) {
            System.out.println("student passed");
        } else {
            System.out.println("student failed");
        }
        int number = -7;
        if (number > 0) {
            System.out.println(number + "is positive");
        } else {
            System.out.println(number + "is negative");
        }
        String username = "farooq@123";
        if (username.equals("farooq@123")) {
            System.out.println("login succesful");
        } else {
            System.out.println("invalid login");
        }
        int a = 25;
        int b = 20;
        if (a > b) {
            System.out.println(a + "is largest");
        } else {
            System.out.println(b + "islargest");
        }
        int marks1 = 95;
        if (marks1 > 90) {
            System.out.println("Grade A");
        } else if (marks1 > 80) {
            System.out.println("Grade B");
        } else if (marks1 > 70) {
            System.out.println("Grade C");
        } else if (marks1 > 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("FAIL");
        }
        String signal = "red";
        if (signal.equals("red")) {
            System.out.println("stop");
        } else if (signal.equals("Green")) {
            System.out.println("Go");
        } else if (signal.equals("yellow")) {
            System.out.println("ready to go");
        } else {
            System.out.println("invalid signal");
        }
        String browser = "chrome";
        if (browser.equals("chrome")) {
            System.out.println("launching chrome browser");
        } else if (browser.equals("firefox")) {
            System.out.println("launching firefox");
        } else if (browser.equals("edge")) {
            System.out.println("launching edge");
        } else {
            System.out.println("browser not supported");
        }
        int experience = 5;
        if (experience > 5) {
            System.out.println("bonus=20000");
        } else if (experience > 4) {
            System.out.println("bonus=10000");
        } else if (experience > 3) {
            System.out.println("bonus=5000");
        } else {
            System.out.println("no bonus");
        }
        int age = 25;
        double salary = 30000;
        if (age >= 21) {
            if (salary >= 30000) {
                System.out.println("elegible for loan");
            } else {
                System.out.println("salary is too low");
            }
        } else {
            System.out.println("age is not elegible");
        }
        String username1 = "farooq@7868";
        String password = "1234567";
        if (username1.equals("farooq@7868")) {
            if (password.equals("1234567")) {
                System.out.println("login successful");
            } else {
                System.out.println("worng password");
            }
        } else {
            System.out.println("invalid username");
        }
        int maths = 95;
        int science = 85;
        int social = 75;
        if (maths > 90) {
            if (science > 80) {
                if (social > 70) {
                    System.out.println("student passed all subjects");
                } else {
                    System.out.println("failed in science");
                }
            } else {
                System.out.println("failed in maths");
            }
            int c = 10;
            if (c > 5) {
                if (c % 2 == 0) {
                    System.out.println(" c is positive and even");
                } else {
                    System.out.println("c is positive but odd");
                }
            } else {
                System.out.println("c is not postive");
            }
            int experience1 = 4;
            int rating = 4;
            if (experience1 >= 4) {
                if (rating >= 4) {
                    System.out.println("elegible for bonus");
                } else {
                    System.out.println("low experience1");
                }
            } else {
                System.out.println("low rating");
            }
            int day = 3;
            switch (day) {
                case 1:
                    System.out.println("sunday");
                    break;
                case 2:
                    System.out.println("monday");
                    break;
                case 3:
                    System.out.println("tuesday");
                    break;
                case 4:
                    System.out.println("wednesday");
                    break;
                case 5:
                    System.out.println("thrusday");
                    break;
                default:
                    System.out.println("invalid day");
            }
            int e = 10;
            int f = 20;
            char operators = '+';
            switch (operators) {
                case '+':
                    System.out.println("add=" + (e + f));
                case '-':
                    System.out.println("sub=" + (e - f));
                    break;
                case '*':
                    System.out.println("mul=" + (e * f));
                case '/':
                    System.out.println("div=" + (e / f));
                case '%':
                    System.out.println("mod=" + (e % f));
            }
            String browser1 = "firefox";
            switch (browser1) {
                case "chrome":
                    System.out.println("launching chrome");
                    break;
                case "firefox":
                    System.out.println("launching firefox");
                case "edge":
                    System.out.println("launching edge");
            }
            int month = 4;
            switch (month) {
                case 1:
                    System.out.println(" january");
                    break;
                case 2:
                    System.out.println("february");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                case 5:
                    System.out.println("may");
                    break;
                default:
                    System.out.println("invalid month");
            }
            int choice = 3;
            switch (choice) {
                case 1:
                    System.out.println("ordered biryani");
                    break;
                case 2:
                    System.out.println("ordered chicken tikka");
                    break;
                case 3:
                    System.out.println("ordered fish pulusu");
                    break;
                case 4:
                    System.out.println("ordered grill");
                    break;
                default:
                    System.out.println("invalid choice");
            }
                    String day1 = "sunday";
                    if (day1.equals("saturday") || day1.equals("sunday")) {
                        System.out.println(day1 + "is a weekend");
                    }else if(day1.equals("monday")|| day1.equals("tuesday")||day1.equals("wednesday")|| day1.equals("friday")||day1.equals("thrusday")) {
                        System.out.println(day1 + "is a weekday");
                    }else {
                        System.out.println("invalid day");
                    }
                    int experience2=10;
                    double bonus;
                    if(experience2>=3 ) {
                        System.out.println(experience2 + " bonus =" + (  60000 * 0.10));
                    } else if(experience2>=5) {
                        System.out.println(experience2 + " bonus =" + ( 90000 * 0.15));
                    }else if(experience2>=10){
                        System.out.println(experience2 + " bonus =" + (120000 * 0.20));
                        }else {
                        System.out.println("no bonus");
                    }








                    }

                    }

            }




























































