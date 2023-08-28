/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist.controller;

import java.util.ArrayList;
import java.util.List;
import playlist.model.Musica;

/**
 *
 * @author felipe
 */
public class CadastroMusica {

    private final List<Musica> MusicaList;

    public CadastroMusica() {
        this.MusicaList = new ArrayList<>();

    }

    public void adicionarMusica(Musica musica) {
        MusicaList.add(musica);
    }

    public List<Musica> listarMusicas() {
        return MusicaList;
    }

    public void atualizarMusica(String nomeAntigo, Musica novaMusica) {
        for (int i = 0; i < MusicaList.size(); i++) {
            Musica musica = MusicaList.get(i);
            if (musica.getNome().equals(nomeAntigo)) {
                MusicaList.set(i, novaMusica);
                break;
            }
        }
    }

    public void removerMusica(String nome) {
        Musica musicaParaRemover = null;
        for (Musica musica : MusicaList) {
            if (musica.getNome().equals(nome)) {
                musicaParaRemover = musica;
                break;
            }
        }
        if (musicaParaRemover != null) {
            MusicaList.remove(musicaParaRemover);
        }
    }

    public static void main(String[] args) {
        // Crie uma instância da classe CadastroMusica para gerenciar músicas
        CadastroMusica cadastro = new CadastroMusica();

        // Crie algumas músicas e adicione-as à lista
        Musica musica1 = new Musica("Amor Proibido", "Calcinha Preta", 2005, "Volume 2", "Forró");
        cadastro.adicionarMusica(musica1);

        Musica musica2 = new Musica("Another Song", "Artist Name", 2023, "Album Name", "Genre");
        cadastro.adicionarMusica(musica2);

        // Liste as músicas
        System.out.println("Lista de Músicas:");
        for (Musica musica : cadastro.listarMusicas()) {
            System.out.println(musica);
        }

        // Atualize uma música
        Musica novaMusica = new Musica("Nova Música", "Novo Artista", 2021, "Novo Álbum", "Novo Gênero");
        cadastro.atualizarMusica("Amor Proibido", novaMusica);

        // Liste novamente as músicas após a atualização
        System.out.println("\nLista de Músicas Após Atualização:");
        for (Musica musica : cadastro.listarMusicas()) {
            System.out.println(musica);
        }

        // Remova uma música
        cadastro.removerMusica("Another Song");

        // Liste novamente as músicas após a remoção
        System.out.println("\nLista de Músicas Após Remoção:");
        for (Musica musica : cadastro.listarMusicas()) {
            System.out.println(musica);
        }
    }}

