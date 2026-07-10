package JavaTask;

public class Practice {
    public static void main(String[] args) {
        int number = 10;
        if (number > 5) {
            System.out.println("positive number");
        }
        int number1 = -1;
        if (number1 < 0) {
            System.out.println("negative number");
        }
        int num = 2;
        if (num % 2 == 0) {
            System.out.println("even number");
        }
        int num1 = 5;
        if (num1 % 2 != 0) {
            System.out.println("odd number");
        }
        int marks = 90;
        if (marks > 75) {
            System.out.println("student passed");
        }
        byte age = 18;
        if (age >= 18) {
            System.out.println("elegible to vote");
        }
        int num2 = 30;
        if (num2 % 5 == 0) {
            System.out.println(num2 + "is divisible by 5");
        }
        int salary = 80000;
        if (salary > 50000) {
            System.out.println("salary is greater than 50000");
        }
        int temperature = 35;
        if (temperature > 30) {
            System.out.println("temperature is greater than 30");
        }
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "is uppercase");
        }
        int num3 = 10;
        if (num3 > 0) {
            System.out.println("num3 is positive");
        } else System.out.println("num3 is negative");
        int num4 = 6;
        if (num4 % 2 == 0) {
            System.out.println("num4 is even");
        } else System.out.println("num4 is odd");
        int marks1 = 45;
        if (marks >= 40) {
            System.out.println("student passed");
        } else System.out.println("student failed");
        int age1 = 20;
        if (age >= 18) {
            System.out.println("elegible to vote");
        } else System.out.println("not elegible to vote");
        int person = 20;
        if (person > 18) {
            System.out.println("person is adult");
        } else System.out.println("person is minor");
        int num5 = 25;
        int num6 = 20;
        if (num5 > num6) {
            System.out.println(num5 + "greater number");
        } else System.out.println(num6 + "lesser number");
        int num7 = 30;
        if (num7 % 2 == 0) {
            System.out.println(num7 + "is divisible by5");
        } else System.out.println(num7 + "is not divisible by5");
        char ch1 = 'a';
        if (ch1 >= 'A' && ch1 <= 'Z') {
            System.out.println(ch1 + "is uppercase");
        } else System.out.println(ch1 + "is lower case");
        int temperature1 = 40;
        if (temperature1 >= 40) {
            System.out.println("temperature is hot");
        } else System.out.println("temperature is cold");
        int salary1 = 80000;
        if (salary1 > 60000) {
            System.out.println("greater salary");
        } else System.out.println("lesser salary");
        int age2 = 20;
        if (age2 >= 18) {
            System.out.println(age2 + "is adult");
        } else System.out.println(age2 + "is minor");
        int age3 = 65;
        if (age3 < 18) {
            System.out.println("child");
        } else if (age3 < 60) {
            System.out.println("adult");
        } else {
            System.out.println("senior citizen");
        }
        int number2 = 5;
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
        int marks2 = 85;
        if (marks2 >= 85) {
            System.out.println("Grade A");
        } else if (marks > 70) {
            System.out.println("grade B");
        } else {
            System.out.println("fail");
        }
        String signal = "Red";
        if (signal.equals("Red")) {
            System.out.println("STOP");
        } else if (signal.equals("Green")) {
            System.out.println("GO");
        } else {
            System.out.println("invalid signal");
        }
        int age4 = 20;
        boolean aadhar = true;
        if (age >= 18) {
            if (aadhar) {
                System.out.println("elegible to vote");
            }
        }
        String username = "farooq";
        String password = "1456478";
        if (username.equals("farooq")) {
            if (password.equals("1456478")) {
                System.out.println("login successful");
            }
        }
        int marks4 = 85;
        if (marks4 >= 35) {
            if (marks > 75) {
                System.out.println("pass with distinction");
            }
        }
        int num8 = 8;
        if (num8 > 0) {
            if (num8 % 2 == 0) {
                System.out.println("num8 is positive and even");
            }
        }
        int age7 = 18;
        boolean licence = true;
        if (age7 >= 18) {
            if (licence) {
                System.out.println("can ride");
            }
            int pin = 7868;
            int amount = 40000;
            if (pin == 7868) {
                if (amount >= 30000) {
                    System.out.println("transaction succesful");
                }
            }
            int expereince = 6;
            int salary2 = 60000;
            if (expereince > 5) {
                if (salary > 50000) {
                    System.out.println("elegible employee");
                }
            }
            int marks3 = 40;
            int attendance = 80;
            if (marks > 35) {
                if (attendance > 75) {
                    System.out.println("student passed");
                }
            }
            String username1 = "farooq@7868";
            String password1 = "123@7868";
            if (username1.equals("farooq@7868")) {
                if (password1.equals("123@7868")) {
                    System.out.println("login succesful");
                }
            }
            int choice = 1;
            switch (choice) {
                case 1:
                    System.out.println("upma pesarettu");
                    break;
                case 2:
                    System.out.println("onion pesarettu");
                    break;
                case 3:
                    System.out.println("chitti pesarettu");
                    break;
            }
            int choice1 = 4;
            switch (choice1) {
                case 1:
                    System.out.println("january");
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
            }
            for (int l = 1; l <= 5; l++) {
                System.out.println("farooq");
            }
            for (int m = 71; m <= 91; m++) {
                if (m % 2 != 0) {
                    System.out.println(m);
                }
            }
            int count = 0;
            for (int n = 1; n <= 50; n++) {
                if (n % 2 == 0) {
                    count++;
                }
            }
            System.out.println("total even numbers" + count);
            int sum = 0;
            for (int o = 1; o <= 100; o++) {
                sum = sum + o;
            }
            System.out.println("sum =" + sum);
            int number5 = 7;
            for (int n = 1; n <= 12; n++)
                System.out.println(number5 + "x" + n + "=" + (number5 * n));

            for (int q = 20; q >= 1; q--)

                System.out.println(q);


        }
        String name ="farooq";
        System.out.println("name:"+name);
        int age8 =20;
        if(age>=18) {
            System.out.println("elegible for vote");
        }
        int i=50;
        while(i>=21){
            if(i%2!=0) {
                System.out.print(i+" ");
            }
            i--;

        }
        }


    }






































































