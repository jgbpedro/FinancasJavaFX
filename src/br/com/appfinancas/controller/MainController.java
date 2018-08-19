package br.com.appfinancas.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import br.com.appfinancas.model.Gasto;
import br.com.appfinancas.model.GastosDAO;
import br.com.appfinancas.view.ScreenManager;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class MainController implements Initializable {

	@FXML TextField txtDescricao;
	@FXML ComboBox<String> cboCategoria;
	@FXML TextField txtValor;
	@FXML Button btnInserir;
	@FXML Button btnVisualizar;



	@FXML public void Inserir(){

		//verificar se todos os campos estão prenchidos
		if(txtDescricao.getText().isEmpty() ||
				txtValor.getText().isEmpty() ||
				cboCategoria.getValue()==null
		){
			Alert msg = new Alert(AlertType.ERROR);
			msg.setContentText("Preencha todos os campos.");
			msg.setHeaderText("Erro de validação");
			msg.show();
			return;
		}


		Gasto gasto = new Gasto();
		gasto.setDescricao(txtDescricao.getText());
		gasto.setCategoria(cboCategoria.getValue());
		gasto.setValor(Double.parseDouble(txtValor.getText()));

		//inserir na lista estatica
		GastosDAO.getLstGastos().add(gasto);


		//mensagem de sucesso
		Alert msg = new Alert(AlertType.INFORMATION);
		msg.setContentText("Inserido com sucesso.");
		msg.setHeaderText("Sucesso");
		msg.show();

		//Limpar caixas de texto
		txtDescricao.setText("");
		txtValor.setText("");
		cboCategoria.setValue(null);

	}

	@FXML public void abrirListagem() {

		ScreenManager janela = new ScreenManager();
		Stage stage = new Stage();
		janela.openScreen(stage, "Listagem.fxml");

	}


	@Override
	public void initialize(URL location, ResourceBundle resources) {

		cboCategoria.getItems().add("Lazer");
		cboCategoria.getItems().add("Alimentação");
		cboCategoria.getItems().add("Casa");
	}


}
