import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        fechaDeHoy();
    }

    public static void fechaDeHoy() {
        Date diaHoy = new Date();
        System.out.println("Fecha y hora actual: " + diaHoy);
    }
}
