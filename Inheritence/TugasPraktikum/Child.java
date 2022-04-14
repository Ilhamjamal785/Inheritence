package Kelas_X.Semester2.Inheritence.TugasPraktikum;

public class Child extends Mother{

    public Child(String name, String gender, String divisi, double gaji_, int nomer) {
        super(name, gender, divisi, gaji_, nomer);
    }

    @Override
    public void printData(){
        System.out.println(" === identitas pegawai ==== ");
        System.out.println("nama = " + nama);
        System.out.println("Jenis kelamin = " + kelamin);
        System.out.println("Nomor pegawai " + no);
        System.out.println("Bekerja di bagian = " + bagian);
        System.out.println("Gaji utama yang didapat $" + this.gaji_);
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi $" + this.gaji_*2);
    }
}
