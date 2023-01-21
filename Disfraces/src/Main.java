
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Cliente cliente1 = new Cliente();
        Arriendo arriendo1 = new Arriendo();
        int op = 0;
        while (op != 5) {
            System.out.println("\n***OPCIONES***");
            System.out.println("1) Ingresar Cliente.");
            System.out.println("2) Ingresar Arriendo.");
            System.out.println("3) Calcular total del Arriendo.");
            System.out.println("4) Ver datos del Arriendo.");
            System.out.println("5) Salir.");
            op = Integer.parseInt(bf.readLine());

            switch (op) {
                case 1:
                    System.out.println("\nIngrese su rut:");
                    cliente1.setRut(bf.readLine());
                    System.out.println("\nIngrese su nombre:");
                    cliente1.setNombre(bf.readLine());
                    System.out.println("\nIngrese su edad:");
                    cliente1.setEdad(Integer.parseInt(bf.readLine()));
                    System.out.println("\nIngrese tipo de Cliente (F/V/N):");
                    cliente1.setTipoCliente(bf.readLine().toUpperCase().charAt(0));
                    System.out.println("\nIngrese su sexo (F/M):");
                    cliente1.setSexo(bf.readLine().toUpperCase().charAt(0));
                    break;
                case 2:
                    System.out.println("\nPor cuántos días desea arrendar?");
                    arriendo1.setDias(Integer.parseInt(bf.readLine()));
                    System.out.println("\nIngrese qué talla desea arrendar (S,M,L,XL)");
                    arriendo1.setTalla(bf.readLine());
                    System.out.println("\nIngrese qué disfraz desea arrendar:\nDracula, Cenicienta, Frankenstein, Shrek, Pinocho");
                    arriendo1.setDisfraz(bf.readLine());
                    arriendo1.setCliente(cliente1);
                    break;
                case 3:
                    System.out.println("El total por el arriendo es de: $" + arriendo1.precioFinal());
                    break;
                case 4:
                    arriendo1.imprimir();
                    break;
                case 5:
                    System.out.println("Hasta pronto!");
                    System.exit(0);
            }

        }
    }

}
