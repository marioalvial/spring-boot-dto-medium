package br.com.ms.dtoexample.controller;

import br.com.ms.dtoexample.dto.UsuarioDTO;
import br.com.ms.dtoexample.dto.UsuarioRespostaDTO;
import br.com.ms.dtoexample.model.Usuario;
import br.com.ms.dtoexample.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioRespostaDTO> salvar(@RequestBody UsuarioDTO dto) {
        Usuario usuario = usuarioService.salvar(dto.transformaParaObjeto());
        return new ResponseEntity<>(UsuarioRespostaDTO.transformaEmDTO(usuario), HttpStatus.CREATED);
    }
}
