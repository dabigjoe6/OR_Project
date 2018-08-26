/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_project_javafx;


import javafx.stage.Stage;

/**
 *
 * @author BLAKJ
 */
public class Presenter {
    public static void showDijkstra(Stage primaryStage) {
        DijkstraView dijkstra = new DijkstraView();
        dijkstra.view(primaryStage);
    }
    
    public static void showFloyd(Stage primaryStage) {
        FloydView floyd = new FloydView();
        floyd.view(primaryStage);
    }
    
    public static void showMainView(Stage primaryStage) {
        MainView main = new MainView();
        main.view(primaryStage);
    }
    
}
