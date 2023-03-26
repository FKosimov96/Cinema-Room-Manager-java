package cinema;

public class Cinema {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Cinema:");
        System.out.print("  ");
        for(int t = 1; t <=8; t++){
            System.out.print(t + " ");
        }

        for (int i = 1; i <8; i++) {
            if(i == 1) System.out.println("");
            System.out.print(i+ " ");
            for (int j = 0; j < 8; j++){
                System.out.print("S ");
                if(j == 7){
                    System.out.println("");
                }
            }
        }
        System.out.println("");
    }
}