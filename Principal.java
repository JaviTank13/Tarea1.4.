import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para crear el array de Usuarios: ");
        int tamanyo = sc.nextInt();

        Usuario[] usuarios = arrayUsur(tamanyo);

        System.out.println("---------------------|Informacion Usuario|---------------");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println("----------------------||||---------------------------");
        }
    }

    public static Usuario[] arrayUsur(int tamanyo) {
    	String nombre;
    	String apellidos;
    	String email;
        Scanner sc = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[tamanyo];

        for (int i = 0; i < tamanyo; i++) {
            System.out.println("Escribe la informacion del Usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
             nombre = sc.nextLine();

            System.out.print("Apellidos: ");
             apellidos = sc.nextLine();

            System.out.print("Email: ");
             email = sc.nextLine();

            
            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        return usuarios;
    }
}
