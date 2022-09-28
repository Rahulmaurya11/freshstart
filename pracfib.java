import java.util.Scanner;
public class pracfib {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, count;
        System.out.println("enter the value to find fibonacci number for the same ");
        Scanner in = new Scanner(System.in);
        count=in.nextInt();

long ans = retrunn(n1,n2,count);
        System.out.println(ans);
    }

    public static long retrunn(int n1, int n2,int count) {
if (count==1)
{
    return 1;
}
if(count==0){
    return 0;
}
        for (int i = 2; i <= count; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
if (i==count){return n3;}
        }

return -1;

    }
}