package Ex2;

public class Ex2 {

    public static void mensagem(int a) {
        switch (a) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagens.mensagemBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagens.mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagens.mensagemBoaNoite();
                break;
            default:
                System.out.println("Horário inválido!");
                break;
        }
    }
}
