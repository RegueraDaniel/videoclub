package org.iesvdm.repository;

import java.util.List;

import org.iesvdm.domain.Categoria;
import org.iesvdm.dto.CategoriaDTO;

public interface CategoriaRepository {

	public Categoria find(Long id);
	public CategoriaDTO findDTO(Long id);
	public List<Categoria> findAll();
	public List<String> pelisCategoriaAlmacenes(CategoriaDTO categoriaDTO);
}
