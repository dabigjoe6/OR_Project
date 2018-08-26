/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_project_javafx;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author BLAKJ
 */
public class OR_Project_javafx extends Application {
    
    @Override
    public void start(Stage primaryStage) {  
       
        VBox root = new VBox();
        
        
        //configure primary stage
        primaryStage.setTitle("OR Project Group _");
        primaryStage.setMinHeight(500);
        primaryStage.setMinWidth(500);
       
        //Main Scene
        Presenter.showMainView(primaryStage);
        
                
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
