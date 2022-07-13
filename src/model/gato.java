package model;

import java.util.Objects;

public class gato {
    private String none;
    private String cor;
    private Integer idade;

    public gato() {    }

    public gato(String none, String cor, Integer idade) {
        this.none = none;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNone() {
        return none;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        gato gato = (gato) o;
        return Objects.equals(none, gato.none) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(none, cor, idade);
    }

    @Override
    public String toString() {
        return "gato{" +
                "none='" + none + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
