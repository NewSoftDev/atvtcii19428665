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
            
            if ((hora >= 5 && hora < 13) || (hora == 12 && minuto == 59)) {
                System.out.println("Bom dia Mundo");
            } else if ((hora >= 13 && hora < 19) || (hora == 18 && minuto == 59)) {
                System.out.println("Boa tarde Mundo");
            } else if ((hora >= 19 && hora < 24) || (hora == 23 && minuto == 59)) {
                System.out.println("Boa noite Mundo");
            } else if ((hora >= 0 && hora < 5) || (hora == 4 && minuto == 59)) {
                System.out.println("Boa 'madruga' Mundo");
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Formato de hora inválido.");
        }

        scanner.close();
    }
}