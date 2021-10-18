package com.empresa.service;

import java.util.List;



import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadService {

	public Modalidad insertaActualizaModalidad(Modalidad obj);
	public List<Modalidad> listaModalidad();
	public abstract List<Modalidad> listaModalidadPorNombreSede(String nombre, String sede);
	public abstract List<Modalidad> listaPorFiltro(FiltroModalidad filtro);
}
