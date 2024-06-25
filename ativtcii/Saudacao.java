import java.util.Scanner;

public class Saudacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira a hora no formato HH:mm: ");
        String inputHora = scanner.nextLine();
        
        try {
            String[] partes = inputHora.split(":");
            int hora = Integer.parseInt(partes[0]);
            int minuto = Integer.parseInt(partes[1]);
            
            if ((hora >= 6 && hora < 13) || (hora == 12 && minuto == 59)) {
                System.out.println("Bom dia Mundo");
            } else if ((hora >= 13 && hora < 19) || (hora == 18 && minuto == 59)) {
                System.out.println("Boa tarde Mundo");
            } else {
                System.out.println("Hora fora do intervalo especificado.");
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Formato de hora inválido.");
        }

        scanner.close();
    }
}