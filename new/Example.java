import static java.lang.Math.*;

class Example {

    private int a;
    private int b;

    public void add(float a, float b) {
        System.out.println("Addition is :" + (a + b));
    }

    public void sub(float a, float b) {
        System.out.println("Substraction is :" + (a - b));
    }

    public void mul(float a, float b) {
        System.out.println("Multiplication is :" + (a * b));
    }

    public void div(float a, float b) {
        if (b == 0) {
            System.out.println("Not Possible");
        }
        System.out.println("Divition is :" + (a / b));
    }

    public void add(float a, float b, float c) {
        System.out.println("Addtion of three number is : " + (a + b + c));
    }

    public void checkprime(int n) {

        int i;
        boolean flag = false;

        for (i = 2; i <= sqrt(n); i++) {

            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("NOT PRIME");
        } else {
            System.out.println("PRIME");
        }
    }

}