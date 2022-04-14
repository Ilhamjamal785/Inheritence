package Kelas_X.Semester2.Inheritence.TugasPraktikum;

public class Mother {
    public final String nama,kelamin,bagian;
    public int no,gaji;
    public double gaji_;

    //overloading constructor
    Mother(String name, String gender, String divisi, int gaji, int nomor){
        this.bagian = divisi;
        this.nama = name;
        this.kelamin = gender;
        this.gaji  = gaji;
        this.no = nomor;
    }

    Mother(String name, String gender, String divisi, double gaji_, int nomer){
        this.nama = name;
        this.kelamin = gender;
        this.bagian = divisi;
        this.gaji_ = gaji_;
        this.no = nomer;
    }

    public void printData(){
        System.out.println("berikut identitas pegawai : ");
        System.out.println("nama = " + nama);
        System.out.println("Jenis kelamin = " + kelamin);
        System.out.println("Nomor pegawai " + no);
        System.out.println("Bekerja di bagian : " + bagian);
        System.out.println("Gaji utama yang didapat : Rp." + gaji);
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi : Rp." + gaji*2);
    }
}