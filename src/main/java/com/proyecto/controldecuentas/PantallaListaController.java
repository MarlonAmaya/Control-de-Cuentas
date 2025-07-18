package com.proyecto.controldecuentas;

import java.net.URL;
import java.util.ResourceBundle;

import com.proyecto.controldecuentas.model.Cuenta;
import com.proyecto.controldecuentas.model.Partida;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PantallaListaController implements Initializable{

    @FXML
    private TableView<Partida> tablaPartidas;

    @FXML
    private TableView<Cuenta> tablaCuentas;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        //Inicialización de la tabla partidas
        //De momento no funciona porque necesita conectar con Cuenta, que actualmente está vacía
        TableColumn<Partida, String> partidaNombre = new TableColumn<>("Nombre");
        TableColumn<Partida, String> concepto = new TableColumn<>("Concepto");

        tablaPartidas.getColumns().addAll(partidaNombre, concepto);

        //Obtener arreglo desde la base de datos
        Partida partida1 = new Partida();
        Partida partida2 = new Partida();
        Partida partida3 = new Partida();

        partida1.setPartidaNombre("uno");
        partida1.setConcepto("test");

        partida2.setPartidaNombre("dos");
        partida2.setConcepto("test2");

        partida3.setPartidaNombre("tres");
        partida3.setConcepto("test3");

        //Agregar cada elemento que se obtenga de la base en una observable list
        ObservableList<Partida> listaPartidas = FXCollections.observableArrayList(partida1,partida2,partida3);

        //Asociando las columnas con atributos de la clase Partida
        partidaNombre.setCellValueFactory(new PropertyValueFactory<>("partidaNombre"));
        concepto.setCellValueFactory(new PropertyValueFactory<>("concepto"));

        tablaPartidas.setItems(listaPartidas);

        //========================================================================================================
        //Inicialización de la tabla cuenta
        TableColumn<Cuenta, String> codigo = new TableColumn<>("Codigo");
        TableColumn<Cuenta, String> cuentaNombre = new TableColumn<>("Nombre");
        TableColumn<Cuenta, String> saldo = new TableColumn<>("Saldo");
        //TableColumn<Cuenta, String> cuentaPadre = new TableColumn<>("Cuenta Padre");

        tablaCuentas.getColumns().addAll(codigo, cuentaNombre, saldo);

        //Obtener los datos de las cuentas de la base de datos
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();
        Cuenta cuenta3 = new Cuenta();

        cuenta1.setCodigo("1");
        cuenta1.setCuentaNombre("Cuenta1");
        cuenta1.setSaldo(1);

        cuenta2.setCodigo("2");
        cuenta2.setCuentaNombre("Cuenta2");
        cuenta2.setSaldo(2);

        cuenta3.setCodigo("3");
        cuenta3.setCuentaNombre("Cuenta3");
        cuenta3.setSaldo(3);

        //Agregar a observable list
        ObservableList<Cuenta> listaCuentas = FXCollections.observableArrayList(cuenta1,cuenta2,cuenta3);

        codigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        cuentaNombre.setCellValueFactory(new PropertyValueFactory<>("cuentaNombre"));
        saldo.setCellValueFactory(new PropertyValueFactory<>("saldo"));

        tablaCuentas.setItems(listaCuentas);
    }
}
