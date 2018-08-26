/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_project_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author BLAKJ
 */
public class OR_Project_javafx extends Application {
    
    @Override
    public void start(Stage primaryStage) {  
        //Create Scenes
        Scene dijkstraScene;
        Scene floydScene;
        VBox root = new VBox();
        Scene myScene = new Scene(root);
        
        //configure primary stage
        primaryStage.setTitle("OR Project Group _");
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);
       
        
        //Dijkstra Scene
        Label labelDijkstra = new Label("Dijkstra scene");
        Button backButtonDijkstra = new Button("back");
        VBox dijkstraRoot = new VBox();
        HBox backPaneDijkstra = new HBox();
        VBox dijkstraPane = new VBox();
        backPaneDijkstra.getChildren().add(backButtonDijkstra);
        dijkstraPane.getChildren().add(labelDijkstra);
        dijkstraPane.setAlignment(Pos.CENTER);
        backPaneDijkstra.setPadding(new Insets(20, 0, 0, 20));
        dijkstraRoot.getChildren().addAll(backPaneDijkstra, dijkstraPane);
        dijkstraScene = new Scene(dijkstraRoot);
        
        backButtonDijkstra.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                primaryStage.setScene(myScene);
            }
        });
        
        //Floyd Scene
        Label labelFloyd = new Label("Floyd scene");
        Button backButtonFloyd = new Button("back");
        VBox floydRoot = new VBox();
        HBox backPaneFloyd = new HBox();
        VBox floydPane = new VBox();
        backPaneFloyd.getChildren().add(backButtonFloyd);
        floydPane.getChildren().add(labelFloyd);
        floydPane.setAlignment(Pos.CENTER);
        backPaneFloyd.setPadding(new Insets(20, 0, 0, 20));
        floydRoot.getChildren().addAll(backPaneFloyd, floydPane);
        floydScene = new Scene(floydRoot);
        
        backButtonFloyd.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                primaryStage.setScene(myScene);
            }
        });
        
        //Main Scene
        
        Button dijkstraBtn = new Button("Dijkstra Algorithm");
        Button floydBtn = new Button("Floyd Algorithm");
        Button backBtn = new Button("back");
        Label algoLabel = new Label("Select an Algorithm: ");
        
        floydBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                primaryStage.setScene(floydScene);
            }
        });
        
        dijkstraBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                primaryStage.setScene(dijkstraScene);
            }
        });
        
        
        
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(20, 0, 0, 20));
        
        hBox.getChildren().add(backBtn);
        
        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setMinHeight(primaryStage.getMinHeight());
        vBox.setMinWidth(primaryStage.getMinWidth());
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(algoLabel, dijkstraBtn, floydBtn);
        
        root.getChildren().addAll(hBox, vBox);
        
        primaryStage.setScene(myScene);
        
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
