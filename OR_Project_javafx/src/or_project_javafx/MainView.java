/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_project_javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author BLAKJ
 */
public class MainView {
    Button dijkstraBtn = new Button("Dijkstra Algorithm");
    Button floydBtn = new Button("Floyd Algorithm");
    Label algoLabel = new Label("Select an Algorithm: ");
    VBox vBox = new VBox();
    VBox root = new VBox();
    Scene myScene = new Scene(root);
    
    public void view(Stage primaryStage) {
        floydBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Presenter.showFloyd(primaryStage);
            }
        });
        
        dijkstraBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Presenter.showDijkstra(primaryStage);
            }
        });
 
        
        vBox.setSpacing(20);
        vBox.setMinHeight(primaryStage.getMinHeight());
        vBox.setMinWidth(primaryStage.getMinWidth());
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(algoLabel, dijkstraBtn, floydBtn);
        
        root.getChildren().add(vBox);
        
        primaryStage.setScene(myScene);
        
        primaryStage.show();

    }
}
