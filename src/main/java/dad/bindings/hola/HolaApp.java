package dad.bindings.hola;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HolaApp extends Application {
	
	private TextField nombreText;
	private Label saludoLabel;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(150);
		nombreText.setPrefColumnCount(10);
		
		saludoLabel = new Label("-");
		
		VBox root = new VBox(5,nombreText,saludoLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
			
		//StringProperty saludo = new SimpleStringProperty("Hola ");
		
		// ESTABLECEMOS EL BINDEO
		
		saludoLabel.textProperty().bind(Bindings.concat("Hola ", nombreText.textProperty(),"!"));
		
		Scene scene = new Scene(root,320,200);
		
		primaryStage.setTitle("Hola con binding");
		primaryStage.setScene(scene);
		primaryStage.show();
		

	}
	
	
	public static void main (String [] args) {
		launch(args);
	}

}
