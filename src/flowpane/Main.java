package flowpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Button btn1;
    private FlowPane flowPane;
    @Override
    public void start(Stage primaryStage) throws Exception {
        btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Another Button");
        btn2.setText("New _Button");
//        btn2.setMinWidth(50);
        
        //Create FlowPane
        flowPane = new FlowPane(); //0 horizontal gap, 0 vertical gap
        //Add children
        System.out.println(flowPane.getChildren());
        flowPane.getChildren().addAll(btn1,btn2,btn3);
        System.out.println(flowPane.getChildren());
        //Set the alignment of flowpane
//        flowPane.setAlignment(Pos.TOP_RIGHT);
        //Set Horizontal Gap
        flowPane.setHgap(20);
        //Vertical Gap
        flowPane.setVgap(20);
        flowPane.setPadding(new Insets(20));
        //Set the orientation
//        flowPane.setOrientation(Orientation.VERTICAL);
        //Scene
        Scene scene = new Scene(flowPane,200,200);
        //Set the Scene
        primaryStage.setScene(scene);
        //Set title
        primaryStage.setTitle("Demo Application");
        //Disable Resizing
        primaryStage.setResizable(false);

        //Show the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
