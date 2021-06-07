package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Cliente;
import com.empresa.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listaCliente() {
		return repository.findAll();
	}

	@Override
	public Cliente insertaActualizaCliente(Cliente obj) {
		return repository.save(obj);
	}

	@Override
	public void eliminaCliente(int cod) {
		repository.deleteById(cod);
	}

	@Override
	public List<Cliente> listaClientePorNombreLike(String filtro) {
		return repository.listaClientePorNombreLike(filtro);
	}

	@Override
	public Optional<Cliente> obtienePorId(int cod_cli) {
		return repository.findById(cod_cli);
	}

}
