class MOTOR{
    //data member
    String merk;
    int tahun;
    String noPolisi;
    String warna;
    //construktor
    /**
     * @param merk
     * @param tahun
     * @param noPolisi
     * @param warna
     */
    public MOTOR(String merk,int tahun,String noPolisi,String warna){
        this.merk=merk;
        this.tahun=tahun;
        this.noPolisi=noPolisi;
        this.warna=warna;
    }
    //method tanpa return dan tanpa parameter
    void showInfoMotor(){
        System.out.println("Merk : "+this.merk);
        System.out.println("Tahun : "+this.tahun);
        System.out.println("No Polisi : "+this.noPolisi);
        System.out.println("Warna : " + this.warna);
    }
}
public class KelasMotorKu{
    public static void main(String [] args){
    MOTOR motorku = new MOTOR("Genio",2019,"EA 0118 GH", "Biru"); 
    motorku.showInfoMotor();
    }
}