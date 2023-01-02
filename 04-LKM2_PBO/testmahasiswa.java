
class mahasiswa{
    String nama;
    int angkatan;
    String asal;
    mahasiswa(){
        nama  = "Ghifari";
        angkatan = 2019;
        asal = "Lotim";
    }
    void ubah(String nm, int ang, String as){
        nama = nm;
        angkatan = ang;
        asal = as;
    }
    void cetak(){
        System.out.println("nama : "+nama);
        System.out.println("angkatan : "+angkatan);
        System.out.println("asal : "+asal);
    }
}
public class testmahasiswa{
    public static void main(String[] args) {
        mahasiswa MHS = new mahasiswa();
        System.out.println("identitas awal : ");
        MHS.cetak();

        MHS.ubah("Atma", 2020, "Keselet");
        System.out.println("identitas akhir : ");
        MHS.cetak();
    }
}