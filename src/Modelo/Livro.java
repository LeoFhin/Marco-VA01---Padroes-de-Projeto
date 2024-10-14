package Modelo;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }
}
