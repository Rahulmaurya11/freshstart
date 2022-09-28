public class patternprac1 {
    public static void main(String[] args) {
        newpattern(4);
    }
    public static void newpattern(int n)
    {
        for(int row = 1; row<2*n;row ++){

int colinrow= row>n?2*n-row:row;

            int space=n-colinrow;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

            for(int j =0; j<colinrow; j++){

                System.out.print (" *");
            }
            System.out.println("");
        }
    }
}
