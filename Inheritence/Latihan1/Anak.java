package Kelas_X.Semester2.Inheritence.Latihan1;

public class Anak extends Ayah{
    double nilaimax=99.9;
    String nama="Dina";
    int age = 17;

    public void Cetak(){
        System.out.println("Anak ini memiliki sifat "+super.Sifat);
        System.out.println("yang bernama "+nama);
        System.out.println("berumur "+age+"tahun");
        System.out.println("dengan tinggi Badan "+super.TB);
        super.hobbi();
    }
}

