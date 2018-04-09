package br.com.ms.dtoexample.dto;

import br.com.ms.dtoexample.model.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDTO {

    private String nome;
    private String email;
    private String senha;

    public Usuario transformaParaObjeto(){
        return new Usuario(nome, email, senha);
    }
}
