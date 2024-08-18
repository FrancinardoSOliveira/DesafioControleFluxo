
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in);
        System.out.printf("Digite o primeiro numero ");
        int parametroUm = terminal.nextInt();
        System.out.printf("Digite o segundo numero ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametroInvalidExceptions e){
            System.out.println(e.mensagem);
        }
        System.out.println("Fim de programa");
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametroInvalidExceptions {
        if (primeiroNumero > segundoNumero){
            throw new ParametroInvalidExceptions();
        }
        int contagem = segundoNumero - primeiroNumero;
        for(int cont = 1;cont <= contagem; cont ++){
            System.out.println("número " + cont);
        }
    }
}
