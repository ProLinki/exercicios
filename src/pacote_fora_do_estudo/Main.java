package pacote_fora_do_estudo;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author ProLinki
 */
public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String opcao;
        Aluno lucas = new Aluno(new Pessoa("Lucas", "Lima", 2526L));

        lucas.setMaterias(new Materias(new Matematica(), new Fisica()));

        do {
            System.out.println("1 - inserir notas");
            System.out.println("2 - ver notas");
            System.out.println("3 - finalizar");
            opcao = console.next();
            
            switch (opcao) {
                case "1":
                    System.out.print("Quantidade de notas?: ");
                    int quantidadeNotas = console.nextInt();
                    if (lucas.getMaterias().getMatematica().validaEntradaDaNota()) {
                        while (quantidadeNotas-- != 0) {
                            System.out.print("Nota: ");
                            lucas.getMaterias().getMatematica().inserirNotas(console.nextDouble());
                            lucas.getMaterias().getFisica().inserirNotas(10.0);
                        }
                    } else {
                        System.out.println("kkkkkkkkkkkkkkkk");
                    }
                    break;
                case "2":
                    lucas.getMaterias().verNotasGerais();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!opcao.equals("3"));
    }
}