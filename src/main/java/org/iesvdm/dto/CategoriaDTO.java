package org.iesvdm.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.iesvdm.domain.Categoria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDTO extends Categoria {

	private int conteoPeliculas;
	private List<String> conteoAlmacenes;

	public CategoriaDTO(long id, String nombre, Date ultimaActualizacion, int conteoPeliculas) {
		super(id, nombre, ultimaActualizacion);
		this.conteoPeliculas = conteoPeliculas;
		this.conteoAlmacenes= null;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CategoriaDTO other = (CategoriaDTO) obj;
		return conteoPeliculas == other.conteoPeliculas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(conteoPeliculas);
		return result;
	}
	
	
	
}
