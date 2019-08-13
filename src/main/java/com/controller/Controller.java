package com.controller;

import com.dao.Nrepository;
import com.mainconfig.MainConfig;
import com.models.Task;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private ListView<String> currentOrders;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Nrepository nrepository = context.getBean(Nrepository.class);
        Task task1 = context.getBean(Task.class);

        task1.setName("Tom");
        task1.setAddress("Nedelina");
        task1.setPersonOrder("Pizza");
        task1.setCost("500_rub");
        nrepository.save(task1);
        ObservableList<String> currentOrdres = FXCollections.observableArrayList();
        currentOrdres.add(task1.getName());
        currentOrders.setItems(currentOrdres);

    }
}
