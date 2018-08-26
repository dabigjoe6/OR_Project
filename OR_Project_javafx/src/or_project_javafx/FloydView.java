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
public class FloydView {
    Label labelFloyd = new Label("Floyd scene");
    Button backButtonFloyd = new Button("back");
    VBox floydRoot = new VBox();
    HBox backPaneFloyd = new HBox();
    VBox floydPane = new VBox();
    public void view(Stage primaryStage) {
        backPaneFloyd.getChildren().add(backButtonFloyd);
        floydPane.getChildren().add(labelFloyd);
        floydPane.setAlignment(Pos.CENTER);
        backPaneFloyd.setPadding(new Insets(20, 0, 0, 20));
        floydRoot.getChildren().addAll(backPaneFloyd, floydPane);
        Scene floydScene = new Scene(floydRoot);
        primaryStage.setScene(floydScene);
        primaryStage.show();
        
        backButtonFloyd.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Presenter.showMainView(primaryStage);
            }
        });
    }
    
}
