package com.example.demo.exception;
public class AutorNaoEncontradoException extends RuntimeException {
    public AutorNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}
