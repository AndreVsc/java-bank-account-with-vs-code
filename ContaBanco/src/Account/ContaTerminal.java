package Account;

import User.User;
import java.util.Scanner;

public class ContaTerminal {
    private Scanner scanner = new Scanner(System.in);

    public User register() {
        System.out.println("Digite seu número: ");
        int number = Integer.parseInt(scanner.nextLine());
        
        System.out.println("\nDigite sua agência: ");
        String agency = scanner.nextLine();
        
        System.out.println("\nDigite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("\nDigite seu saldo: ");
        float balance = Float.parseFloat(scanner.nextLine());
    
        return new User(number, agency, name, balance);
    }
}
