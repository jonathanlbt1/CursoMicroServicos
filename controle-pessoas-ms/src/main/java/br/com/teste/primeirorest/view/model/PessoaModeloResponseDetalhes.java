package br.com.teste.primeirorest.view.model;

import java.util.List;

import br.com.teste.primeirorest.compartilhado.AnimalDto;

public class PessoaModeloResponseDetalhes extends PessoaModeloResponse {
    
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

}
