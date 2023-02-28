import java.util.Scanner;

public class MVPT1 {
    static int x ;
    static double array1[];
    static double array2[][];
    static double y[];

    static void Calculation () {
        double sum = 0;
        for (int z = 0; z < 12; z++) { // a loop for 12 months
            System.out.println(z+1 + "th month:"); // print to show which year
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) { // double loop to get around the 2D array
                    y[j] = array1[j] * array2[j][i]; /* y[] will take in the calculated result of array1[] and array2[]
                                                        */
                    sum = sum + y[j];
                    if (j == x - 1) {
                        System.out.println(sum);
                    }
                }
                array1[i]= sum; // new value replace the old array1
                sum = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in); //Scanner inport for user inputs
        System.out.println("Please enter the number of comparatives : ");
        x = io.nextInt(); // x will be the amount of companies that user put in
        array1 = new double[x]; // both array1 and array2 will be dynamic depending on users input,
        array2 = new double[x][x];  /* Exp: if user input 2, the matrix size will be set to
                                        [int, int] [ int, int
                                                     int, int] */
        y = new double [x]; // array y is for the calculated result of the companies
            for(int k = 0; k < x; k++){ // a loop for user to input the ratio for companies
            System.out.printf("Please enter the %d divided value: \n", k+1);
            array1[k] = io.nextDouble(); //
        }
        for(int r = 0; r < x; r++) {
            for (int c = 0; c < x; c++) { // double loops for go around the 2D array
                System.out.println("Please Enter Input : ");
                array2[r][c] = io.nextDouble(); // inputs for the survey for the satisfaction rate of companies
            }
        }
        Calculation (); // run the calculation method
    }
}