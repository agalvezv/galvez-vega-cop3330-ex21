package challenge21;
//AGV
//6-5-2021

import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        System.out.println("Please enter the number of the month: ");
        String monthS = inputs.nextLine();
        //int monthI = Integer.parseInt(monthS);

        switch(monthS){
            case "1":
                monthS = "January";
                break;
            case "2":
                monthS = "February";
                break;
            case "3":
                monthS = "March";
                break;
            case "4":
                monthS = "April";
                break;
            case "5":
                monthS = "May";
                break;
            case "6":
                monthS = "June";
                break;
            case "7":
                monthS = "July";
                break;
            case "8":
                monthS = "August";
                break;
            case "9":
                monthS = "September";
                break;
            case "10":
                monthS = "October";
                break;
            case "11":
                monthS = "November";
                break;
            case "12":
                monthS = "December";
                break;
            default:
                monthS= "inputted incorrectly.";
        }
        System.out.println("The name of the month is " + monthS);

    }
}
