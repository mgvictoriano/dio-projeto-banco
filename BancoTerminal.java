public class BancoTerminal {
    public static void main(String[] args) {
     
        double saldo = 25.0;
        double valorSolicitado = 18.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo após a operação: " + saldo);
      
        saldo = 15.0;
        valorSolicitado = 22.0;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo após a operação: " + saldo);
    }
}
