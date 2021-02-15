package com.vyttor.cadastropessoa.infrastructure.restclient.controllers;

import com.vyttor.cadastropessoa.infrastructure.restclient.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.infrastructure.restclient.dto.response.PessoaResponse;
import com.vyttor.cadastropessoa.infrastructure.restclient.services.CadastrarPessoaService;
import com.vyttor.cadastropessoa.infrastructure.restclient.services.ListarTodasPessoasService;
import com.vyttor.cadastropessoa.infrastructure.restclient.services.ObterPessoaPorIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final CadastrarPessoaService cadastrarPessoaService;
    private final ListarTodasPessoasService listarTodasPessoasService;
    private final ObterPessoaPorIdService obterPessoaPorIdService;

    @PostMapping
    public ResponseEntity<PessoaResponse> cadastrar(@RequestBody PessoaRequest pessoaRequest){
        PessoaResponse pessoaResponse = cadastrarPessoaService.cadastrar(pessoaRequest);

        UriComponents uriComponents = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(pessoaResponse.getId());

        URI uri = uriComponents.toUri();

        return ResponseEntity.created( uri ).build();
    }

    @GetMapping
    public ResponseEntity<List<PessoaResponse>> listar(){
        List<PessoaResponse> pessoaResponses = listarTodasPessoasService.listar();

        return ResponseEntity.ok( pessoaResponses );
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaResponse> obter(@PathVariable Long id){
        PessoaResponse pessoaResponse = obterPessoaPorIdService.obter(id);
        return ResponseEntity.ok( pessoaResponse );
    }
}