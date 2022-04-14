package Kelas_X.Semester2.Inheritence.Latihan3;

public class BangunDatar {
    double luas;
    double a=0.5;

    void luas(double panjang , double lebar){
        luas = panjang*lebar;
        System.out.println("luas pertama = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        luas= panjang * lebar*a;
        System.out.println("luas kedua = "+luas);
    }

}

