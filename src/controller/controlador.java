package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class controlador {
	@FXML
	GridPane gp;
	@FXML
	Button boton;
	@FXML
	Button botCerrar;
	@FXML
	AnchorPane ap;
	
	@FXML
	protected void desplazar(KeyEvent event){
		if(event.getCode()==KeyCode.UP && gp.getRowIndex(boton)>0){
			gp.setRowIndex(boton, gp.getRowIndex(boton)-1);
		}
		if(event.getCode()==KeyCode.DOWN && gp.getRowIndex(boton)<4){
			gp.setRowIndex(boton, gp.getRowIndex(boton)+1);
		}
		if(event.getCode()==KeyCode.RIGHT && gp.getColumnIndex(boton)<4){
			gp.setColumnIndex(boton, gp.getColumnIndex(boton)+1);
		}
		if(event.getCode()==KeyCode.LEFT && gp.getColumnIndex(boton)>0){
			gp.setColumnIndex(boton, gp.getColumnIndex(boton)-1);
		}
	}
	
	@FXML
	protected void cerrar(MouseEvent event){
		Stage stage = (Stage) botCerrar.getScene().getWindow();
		stage.close();
	}	
	
}
