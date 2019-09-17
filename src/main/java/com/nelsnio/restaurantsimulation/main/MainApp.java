package com.nelsnio.restaurantsimulation.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {

       /// RestaurantSimulation rs = new RestaurantSimulation(103, 73, 12, 10, 100);
       //rs.startSimulation();
//        rs.printStats();
        
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));

        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        new JMetro(JMetro.Style.DARK).applyTheme(root);
        stage.setTitle("Restaurante");
        stage.setScene(scene);
        stage.show();
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
