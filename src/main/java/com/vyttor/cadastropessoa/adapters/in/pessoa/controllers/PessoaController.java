package com.vyttor.cadastropessoa.adapters.in.pessoa.controllers;

import com.vyttor.cadastropessoa.adapters.in.pessoa.CadastrarPessoaService;
import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.request.PessoaRequest;
import com.vyttor.cadastropessoa.adapters.in.pessoa.dto.response.PessoaResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final CadastrarPessoaService cadastrarPessoaService;

    @PostMapping
    public ResponseEntity<PessoaResponse> cadastrar(@RequestBody PessoaRequest pessoaRequest){
        PessoaResponse pessoaResponse = cadastrarPessoaService.cadastrar(pessoaRequest);

        return ResponseEntity.ok( pessoaResponse );
    }
}
