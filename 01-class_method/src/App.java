

// membuat class sebagai template 
class mahasiswa{
    String nama;
    int NIM;
    String jurusan;
}

public class App {
    public static void main(String[] args) throws Exception {
        

     // membuat objek/instansi  
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nama =("ghifari");
        mahasiswa1.NIM = (212265);
        mahasiswa1.jurusan = ("informatika");

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        
    }
}
