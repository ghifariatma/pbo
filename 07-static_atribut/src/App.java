
class display{
    private String nama;
    static String type = "layar";
    display (String nama){
        this.nama = nama;
    }

    void setTYPE(String type){
        display.type = type;
    }

    void show(){
        System.out.println("nama display : "+ this.nama);
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        display tampilan1 = new display("monitor");
        display tampilan2 = new display("smartphone");

        tampilan1.show();
        System.out.println(display.type);

        display.type = "spanduk";
        System.out.println(display.type);
    }
}
