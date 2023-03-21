package findprimenumber;

import java.util.Scanner;

public class FindPrimeNumber {
    public static boolean Test(int x){
        if (x<2){
            return false;
        }
        for (int i=2;i<=Math.sqrt(x);i++){
        if (x%i==0) {
            return false;
        }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []mang1=new int[6];
        for (int i=0; i<mang1.length;i++){
            System.out.println("Nhập vào giá trị thứ "+i);
            mang1[i]=sc.nextInt();
        }
        int y=0;
        int z=0;
        for (int i=0;i< mang1.length;i++) {
            System.out.print(mang1[i]+",");
        }
            for (int j=0;j< mang1.length; j++){
            if (Test(mang1[j])){
                System.out.println("Số nguyên tố: "+mang1[j]);
            }else{
                 y=mang1[j];
            }

        }
    }
}
