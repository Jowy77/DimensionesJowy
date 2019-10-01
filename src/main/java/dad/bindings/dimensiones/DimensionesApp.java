package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {
	
	private Label altoPx;
	private Label anchoPx;
	private Label areaPx;

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		altoPx = new Label();
		anchoPx = new Label();
		areaPx = new Label();
		
		VBox root = new VBox(5,altoPx,anchoPx,areaPx);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene escena = new Scene(root,320,200);
		
		
		altoPx.textProperty().bind(Bindings.concat("Altura: ").concat(escena.heightProperty()));
		anchoPx.textProperty().bind(Bindings.concat("Anchura: ").concat(escena.widthProperty()));
		areaPx.textProperty().bind(Bindings.concat("Area: ").concat(escena.heightProperty().multiply(escena.widthProperty())));

		primaryStage.setTitle("DimensionesBindeos");
		primaryStage.setScene(escena);
		primaryStage.show();

	}
	
	
	public static void main (String [] args) {
		launch(args);
	}

}
