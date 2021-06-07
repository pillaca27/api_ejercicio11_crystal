package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	
	@Query("Select c from Cliente c where nombre like :fil")
	public abstract List<Cliente> listaClientePorNombreLike(@Param("fil") String filtro);

}
