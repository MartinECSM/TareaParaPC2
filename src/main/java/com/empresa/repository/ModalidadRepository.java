package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>  {

	@Query("select m from Modalidad m where "
			+ "( :p_nom is '' or m.nombre like :p_nom ) and "
			+ "( :p_sede is '' or m.sede like :p_sede )")
	public abstract List<Modalidad> listaModalidadPorNombreSede(
							 	@Param("p_nom") String nombre, 
							 	@Param("p_sede") String sede);
	
	@Query("select m from Modalidad m where "
			+ "( :#{#fil.nombre} is '' or m.nombre like :#{#fil.nombre} ) and "
			+ "( :#{#fil.sede} is ''  or m.sede like :#{#fil.sede} ) ")
	public abstract List<Modalidad> listaPorFiltro(@Param("fil")FiltroModalidad filtro);
}
