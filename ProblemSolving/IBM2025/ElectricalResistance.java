package ProblemSolving.IBM2025;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
* An electric circuit is composed of various electric and electronic components and every circuit has energy consumption per unit time of Power. If the circuit is given, then it is easy to determine the resistance value of that particular circuit.
Assume that there is a simple circuit having only one resistor and it's connected to a power supply. The aim of this question is to output the program or find the color code corresponding to the value of the resistor.
The resistor color codes are:

Black (0): Value 0, Mnemonic BLK
Brown (1): Value 1, Mnemonic BRN
Red (2): Value 2, Mnemonic RED
Orange (3): Value 3, Mnemonic ORG
Yellow (4): Value 4, Mnemonic YLW
Green (5): Value 5, Mnemonic GRN
Blue (6): Value 6, Mnemonic BLU
Violet (7): Value 7, Mnemonic VLT

The function findResistorColorBands in the editor must be completed. It has two parameters:

Power: an integer representing the power of the circuit
Current: an integer denoting the value of current passing through the circuit

Constraints:

Power > 0
Current > 0
Power ≥ Current

The input has 2 lines:

First line is an integer denoting the value of power
Second line is also an integer denoting the value of current
*
* */
public class ElectricalResistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        int current = sc.nextInt();

        int r = (int) power / (current*current);

        System.out.println(r);

        int countDigitR = (int) (Math.log10(r) + 1);
        int div = (int) Math.pow(10, (countDigitR - 2));
        int thirdDigit = countDigitR - 2;

        ArrayList<String> color = new ArrayList<>();
        color.add(getColor(thirdDigit));
        int sigNum = r/div;
        while(sigNum > 0){
            int dig = sigNum % 10;
            sigNum = (int) sigNum/10;
            color.add(getColor(dig));
        }

        for (int i = color.size(); i-- > 0; ) {
            if(i==0) System.out.print(color.get(i));
            else System.out.print(color.get(i)+" ");
        }
    }

    private static String getColor(int dig) {
        if (dig == 0) return "BLK";
        if (dig == 1) return "BWN";
        if (dig == 2) return "RED";
        if (dig == 3) return "ONG";
        if (dig == 4) return "YLW";
        if (dig == 5) return "GRN";
        if (dig == 6) return "BLU";
        if (dig == 7) return "VLT";
        return "invalid dig";
    }
}
