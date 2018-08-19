package br.com.appfinancas.model;

import java.util.ArrayList;
import java.util.List;

public class GastosDAO {

	private static List<Gasto> lstGastos = new ArrayList<>();

	public static List<Gasto> getLstGastos() {
		return lstGastos;
	}

	public void setLstGastos(List<Gasto> lstGastos) {
		this.lstGastos = lstGastos;
	}
}
