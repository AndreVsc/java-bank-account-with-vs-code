import Account.ContaTerminal;
import User.User;

public class Main {
        public static void main(String[] args) throws Exception {
        // Print welcome message
        System.out.println("Seja bem-vindo! \n\nCriando conta... \n");

        // Create an instance of ContaTerminal to call non-static methods
        ContaTerminal registration = new ContaTerminal();
        User user = registration.register(); 

        // Retrieve user information from the returned User object
        String name = user.name;
        String agency = user.agency;
        int number = user.number;
        float balance = user.balance;

        // Check if the name and agency are not empty
        if (!name.isEmpty() && !agency.isEmpty()) {
            System.out.println("Conta criada com sucesso!");
            System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque");
        } else {
            System.out.println("Nome ou agência não podem estar vazios. Tente novamente.");
        }
    }
}
