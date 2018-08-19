package br.com.appfinancas.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.appfinancas.model.Gasto;
import br.com.appfinancas.model.GastosDAO;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;

public class ListaController implements Initializable {

	@FXML ListView<String> lstGastos;
	@FXML Button btnVoltar;



	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

		//acessando a lista estatica
		for(Gasto item : GastosDAO.getLstGastos()){

			lstGastos.getItems()
				.add(item.getDescricao());
			lstGastos.getItems()
				.add(item.getTeste());

		}


	}


}
