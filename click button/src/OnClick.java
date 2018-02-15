import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;


public class OnClick extends Application{
	
	/*
	 * The main method Launches The Application class
	 * 
	 */
	public static void main(String[]args)
	{
		launch(args);
	}
	
	Button btn1;
	Button btn2;
	Button btn3;
	public void start(Stage primaryStage) {
		
		/*
		 * Setting functions for Button method 1
		 */
		btn1= new Button();
		btn1.setText("HI! CLICK ME");
		btn1.setOnAction(e -> ButtonClick());
		
		/*
		 * Setting functions for Button method 2
		 */
		btn2 = new Button();
		btn2.setText("NO! DONT CLICK ME");
		btn2.setOnAction(e -> ButtonClick2());
		
		/*
		 * Setting functions for Button method 3
		 */
		btn3 = new Button();
		btn3.setText("YOU CAN CLICK ME");
		btn3.setOnAction(e -> ButtonClick3());
		
		/*
		 * Setting Pane
		 */
		BorderPane pane = new BorderPane();
		
		/*
		 * Setting up Button Display
		 */
		pane.setCenter(btn1);
		pane.setLeft(btn2);
		pane.setRight(btn3);
		
		/*
		 * Setting up Display Interface
		 */
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CLICK APP V2");
		primaryStage.show();
		
	}
	
	/*
	 * Setting up actions for button clicks
	 */
	
	public void ButtonClick(){
		
		if(btn1.getText()=="HI! CLICK ME") {
			btn1.setText("THANKS FOR THE CLICK");
		}
		else {
			btn1.setText("HI! CLICK ME");
		}
	}
	
	public void ButtonClick2() {
		
		if(btn2.getText()=="NO! DONT CLICK ME") {
			btn2.setText("LEAVE ME ALONE");
		}
		
		else {
			btn2.setText("WHERE IS MY LAWYER");
		}
	}
	
	public void ButtonClick3() {
		if(btn3.getText()=="YOU CAN CLICK ME") {
			btn3.setText("NOW I KNOW ALL YOUR SECRET");
		}
		else {
			btn3.setText("THANKS FOR THE INFO");
		}
	}
	

}
