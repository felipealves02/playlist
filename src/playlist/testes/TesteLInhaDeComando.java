/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist.testes;
import java.util.Scanner;
import playlist.controller.CadastroMusica;
import playlist.model.Musica;
/**
 *
 * @author felipe
 */
public class TesteLInhaDeComando {
     public static void main(String[] args) {
        CadastroMusica cadastro = new CadastroMusica();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar música");
            System.out.println("2. Listar músicas");
            System.out.println("3. Atualizar música");
            System.out.println("4. Remover música");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Nome da música: ");
                    String nome = scanner.nextLine();
                    System.out.print("Artista: ");
                    String artista = scanner.nextLine();
                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após o número
                    System.out.print("Álbum: ");
                    String album = scanner.nextLine();
                    System.out.print("Gênero: ");
                    String genero = scanner.nextLine();

                    Musica novaMusica = new Musica(nome, artista, ano, album, genero);
                    cadastro.adicionarMusica(novaMusica);
                    System.out.println("Música cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Músicas:");
                    for (Musica musica : cadastro.listarMusicas()) {
                        System.out.println(musica);
                    }
                    break;
                case 3:
                    System.out.print("Nome da música a ser atualizada: ");
                    String nomeAntigo = scanner.nextLine();
                    System.out.print("Novo nome da música: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo artista: ");
                    String novoArtista = scanner.nextLine();
                    System.out.print("Novo ano: ");
                    int novoAno = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após o número
                    System.out.print("Novo álbum: ");
                    String novoAlbum = scanner.nextLine();
                    System.out.print("Novo gênero: ");
                    String novoGenero = scanner.nextLine();

                    Musica novaVersao = new Musica(novoNome, novoArtista, novoAno, novoAlbum, novoGenero);
                    cadastro.atualizarMusica(nomeAntigo, novaVersao);
                    System.out.println("Música atualizada com sucesso!");
                    break;
                case 4:
                    System.out.print("Nome da música a ser removida: ");
                    String nomeRemover = scanner.nextLine();
                    cadastro.removerMusica(nomeRemover);
                    System.out.println("Música removida com sucesso!");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
