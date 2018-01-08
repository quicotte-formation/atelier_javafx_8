package com.couteaufourchette;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
//        Pane root = new VBox();
//        root.getChildren().add(btn);
//        for(int i=0;i<30;i++)
//            root.getChildren().add(new Button("caca"));

        BorderPane rootPane = new BorderPane();
        
        // Création barre de menus
        MenuBar menuBar = new MenuBar();
        rootPane.setTop(menuBar);
        
        Menu menuActions = new Menu("Actions");
        menuBar.getMenus().addAll(menuActions);
        
        MenuItem miNewBookings = new MenuItem("Nouvelles réservations");
        miNewBookings.setOnAction( event -> {
            
            throw new RuntimeException("TO BE IMPLEMENTED");
        } );
        
        MenuItem miExit = new MenuItem("Quitter");
        miExit.setOnAction( event -> {
            
            try {
                System.exit(0);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });
        
        menuActions.getItems().addAll(miNewBookings, miExit);
        
        // Création scene et affichage
        Scene scene = new Scene(rootPane, 300, 250);
        primaryStage.setTitle("Couteau-fourchette");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
