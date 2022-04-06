package com.song.demo;

public class Song {
    private Integer id;
    private String nome;
    private String artista;
    private String album;
    private String anoLancamento;
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", artista='" + getArtista() + "'" +
            ", album='" + getAlbum() + "'" +
            ", anoLancamento='" + getAnoLancamento() + "'" +
            "}";
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
}
