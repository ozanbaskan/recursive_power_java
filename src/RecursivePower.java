import java.util.Scanner;

public class RecursivePower {


    public static void main(String[] args) {
    double base,power;

    Scanner s = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        base = s.nextDouble();
        System.out.print("Enter the power number: ");
        power = s.nextDouble();
        if ( power == 0 && base == 0)
        {
            System.out.print("Invalid");
        }
        else
        {
            System.out.print("Answer: " + recursive_power(base,power));
        }

    }

    static double recursive_power(double base, double power)
    {

        if (power < 0)
        {
            power *= -1;
            base = 1.0 / base;
        }
        if (power == 1)
        {
            return base;
        }
        return recursive_power(base,power - 1) * base;
    }





}
