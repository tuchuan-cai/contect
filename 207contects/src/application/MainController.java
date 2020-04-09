package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainController{

    @FXML
    private Label allLinkman;

    @FXML
    private Button creatNewGroupBtn;

    @FXML
    private Button setNewLinkmanBtn;

    @FXML
    private Button deleteGroupBtn;

    @FXML
    private Button importContactsBtn;

    @FXML
    private Button exportContectsBtn;
    
    @FXML
    private TextField newGroupName; 
    
    @FXML
    private Button setNewGroupNameBtn;

    @FXML
    void deleteGroup(ActionEvent event) {
    	System.out.println("deleteGroup");
    }

    @FXML
    void showAllLinkman() {
    	System.out.println("showAllLinkman");
    }

    @FXML
    void creatNewGroupBtn(ActionEvent event) throws Exception {
    	System.out.println("creatNewGroupBtn");
    	FXMLLoader fl = new FXMLLoader();
		fl.setLocation(fl.getClassLoader().getResource("application/NewGroup.fxml"));
		BorderPane root = (BorderPane)fl.load();
    	Scene setNLScene = new Scene(root);
    	Stage setNLStage = new Stage();
    	setNLStage.setScene(setNLScene);
    	System.out.println("setNewLinkman");
    	setNLStage.setTitle("新建分组");
    	setNLStage.show();
    }

    @FXML
    void importContects(ActionEvent event) {
    	System.out.println("importContects");
    }

    @FXML
    void exportContects(ActionEvent event) {
    	System.out.println("exportContects");
    }

    @FXML
    void setNewLinkman(ActionEvent event) throws Exception{
    	FXMLLoader fl = new FXMLLoader();
		fl.setLocation(fl.getClassLoader().getResource("application/NewLinkman.fxml"));
		BorderPane root = (BorderPane)fl.load();
    	Scene setNLScene = new Scene(root);
    	Stage setNLStage = new Stage();
    	setNLStage.setScene(setNLScene);
    	System.out.println("setNewLinkman");
    	setNLStage.setTitle("新建联系人");
    	setNLStage.show();
    }
    
    @FXML
    void setNewGroupName(ActionEvent event) {
    	
    }

}
