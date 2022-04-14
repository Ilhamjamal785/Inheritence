package Kelas_X.Semester2.Inheritence.Latihan4;

public class Hitung {

    public static void main(String[] args) {
        BangunDatar bangundatar=new BangunDatar();

        persegi Persegi = new persegi();
        Persegi.sisi=8;

        Persegipanjang perjang =new Persegipanjang();
        perjang.lebar=11;
        perjang.panjang=2;


        bangundatar.luas();
        bangundatar.keliling();

        Persegi.luas();
        Persegi.keliling();

        perjang.luas();
        perjang.keliling();

    }

}
