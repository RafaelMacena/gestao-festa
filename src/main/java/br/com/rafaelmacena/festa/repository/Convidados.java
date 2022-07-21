package br.com.rafaelmacena.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rafaelmacena.festa.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long>{

}
