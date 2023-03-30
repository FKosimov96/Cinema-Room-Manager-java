package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int scnRow = scanner.nextInt();
        System.out.println("Enter the number of seats in each row");
        int scnSeats = scanner.nextInt();

        int backSeatsPrice = 8;
        int frontSeatsPrice = 10;
        int backHalfRow = 0;
        int frontHalfRow = 0;
        int totalIncome = 0;

        if (scnRow * scnSeats <= 60) {
            totalIncome = scnRow * scnSeats * frontSeatsPrice;
        } else if (scnRow * scnSeats > 60) {
            if (scnRow % 2 == 0) {
                frontHalfRow = scnRow / 2;
                backHalfRow = scnRow / 2;
            }else {
                frontHalfRow = scnRow / 2;
                backHalfRow = scnRow / 2 + 1;
            }
            totalIncome = (frontHalfRow * scnSeats * frontSeatsPrice) + (backHalfRow * scnSeats * backSeatsPrice) ;
                   
        }
        System.out.println("Total income:\n"+"$" + totalIncome);

//        // Write your code here
//        System.out.println("Cinema:");
//        System.out.print("  ");
//        for(int t = 1; t <=8; t++){
//            System.out.print(t + " ");
//        }
//
//        for (int i = 1; i <8; i++) {
//            if(i == 1) System.out.println("");
//            System.out.print(i+ " ");
//            for (int j = 0; j < 8; j++){
//                System.out.print("S ");
//                if(j == 7){
//                    System.out.println("");
//                }
//            }
//        }
//        System.out.println("");
    }
}