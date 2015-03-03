package controller;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
	Label etiquetapos;
	
	private IntegerProperty x = new SimpleIntegerProperty();
	private IntegerProperty y = new SimpleIntegerProperty();
	
	@FXML
	protected void desplazar(KeyEvent event){	
		if(event.getCode()==KeyCode.UP && gp.getRowIndex(boton)>0){
			gp.setRowIndex(boton, gp.getRowIndex(boton)-1);
			x.setValue(gp.getRowIndex(boton));
			y.setValue(gp.getColumnIndex(boton));
			boton.setText("("+x.getValue()+","+y.getValue()+")");
		}
		if(event.getCode()==KeyCode.DOWN && gp.getRowIndex(boton)<4){
			gp.setRowIndex(boton, gp.getRowIndex(boton)+1);
			x.setValue(gp.getRowIndex(boton));
			y.setValue(gp.getColumnIndex(boton));
			boton.setText("("+x.getValue()+","+y.getValue()+")");
		}
		if(event.getCode()==KeyCode.RIGHT && gp.getColumnIndex(boton)<4){
			gp.setColumnIndex(boton, gp.getColumnIndex(boton)+1);
			x.setValue(gp.getRowIndex(boton));
			y.setValue(gp.getColumnIndex(boton));
			boton.setText("("+x.getValue()+","+y.getValue()+")");
		}
		if(event.getCode()==KeyCode.LEFT && gp.getColumnIndex(boton)>0){
			gp.setColumnIndex(boton, gp.getColumnIndex(boton)-1);
			x.setValue(gp.getRowIndex(boton));
			y.setValue(gp.getColumnIndex(boton));
			boton.setText("("+x.getValue()+","+y.getValue()+")");
		}
	}
	
	@FXML
	protected void cerrar(MouseEvent event){
		Stage stage = (Stage) botCerrar.getScene().getWindow();
		stage.close();
	}	

	
}
