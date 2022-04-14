package Kelas_X.Semester2.Inheritence.Latihan4;

public class Persegipanjang extends BangunDatar {
    float panjang,lebar;

    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas Persegi panjang = " + luas);
    }

    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling Persegi panjang = " + keliling);
    }

}

