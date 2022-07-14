package br.com.teste.primeirorest.compartilhado;

import java.util.List;

public class PessoaDto {
    private Integer id;
    private String nome;
    private String sobrenome;
    private List<AnimalDto> animais;


    /**
     * @return the animais
     */
    public List<AnimalDto> getAnimais() {
        return animais;
    }

    /**
     * @param animais the animais to set
     */
    public void setAnimais(List<AnimalDto> animais) {
        this.animais = animais;
    }

    //#region Get / Set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    //#endregion
}
