package Ex3;

public class Ex3 {


    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double jurosDuasParcela(){
        return 0.3;
    }

    public static double jurosTresParcela(){
        return 0.45;
    }

    public static void calcular(double valor, int parcelas) {
        if(parcelas == 1) {
            System.out.println("O valor final do emprestimo é de: " + valor);
        }else if(parcelas == 2) {
            double valorFinal = valor * jurosDuasParcela();
            System.out.println("O valor final do emprestimo é: " + (valorFinal+valor));
        } else if (parcelas == 3) {
            double valorFinal = valor * jurosTresParcela();
            System.out.println("O valor final do emprestimo é: " + (valorFinal+valor));
        } else{
            System.out.println("Numero de parcelas excedido!");
        }
    }
}
