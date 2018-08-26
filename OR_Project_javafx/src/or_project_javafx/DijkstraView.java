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
public class DijkstraView {
    private Label labelDijkstra = new Label("Dijkstra scene");
    private Button backButtonDijkstra = new Button("back");
    private VBox dijkstraRoot = new VBox();
    private HBox backPaneDijkstra = new HBox();
    private VBox dijkstraPane = new VBox();
    
    public void view(Stage primaryStage) {
        backPaneDijkstra.getChildren().add(backButtonDijkstra);
        dijkstraPane.getChildren().add(labelDijkstra);
        dijkstraPane.setAlignment(Pos.CENTER);
        backPaneDijkstra.setPadding(new Insets(20, 0, 0, 20));
        dijkstraRoot.getChildren().addAll(backPaneDijkstra, dijkstraPane);
        Scene dijkstraScene = new Scene(dijkstraRoot);
        primaryStage.setScene(dijkstraScene);
        primaryStage.show();
       
        backButtonDijkstra.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                Presenter.showMainView(primaryStage);
            }
        });
    }
    
}
