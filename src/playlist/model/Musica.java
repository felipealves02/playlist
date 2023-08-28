/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playlist.model;

/**
 *
 * @author felipe
 */
public class Musica {
    private String nome;
    private String artista;
    private int ano;
    private String album ;
    private String genero;

    public Musica(String nome, String artista, int ano, String album, String genero) {
        this.nome = nome;
        this.artista = artista;
        this.ano = ano;
        this.album = album;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica{" + "nome=" + nome + ", artista=" + artista + ", ano=" + ano + ", album=" + album + ", genero=" + genero + '}';
    }
    
    
    
}
