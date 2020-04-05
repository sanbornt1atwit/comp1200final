

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class gameDisplay extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	final int topL = 0;
	final int topM = 1;
	final int topR = 2;
	final int midL = 3;
	final int midM = 4;
	final int midR = 5;
	final int botL = 6;
	final int botM = 7;
	final int botR = 8;
	
	final Button tl = new Button();
	final Button tm = new Button();
	final Button tr = new Button();
	final Button ml = new Button();
	final Button mm = new Button();
	final Button mr = new Button();
	final Button bl = new Button();
	final Button bm = new Button();
	final Button br	 = new Button();
	final Label l = new Label();
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setTitle("Tic Tac Toe");

		

		
		l.setText("It is X's turn!");
		l.setMaxHeight(50);
		l.setMaxWidth(400);
		l.setAlignment(Pos.TOP_CENTER);
		l.setTranslateY(-225);
		l.setFont(Font.font(30));
		l.setOpacity(100);
		l.setStyle("-fx-text-fill: blue;");

		
		tl.setMaxHeight(125);
		tl.setMaxWidth(125);
		tl.setTranslateX(-150);
		tl.setTranslateY(-150);
    	tl.setFont(Font.font(50));

		
		tm.setMaxHeight(125);
		tm.setMaxWidth(125);
		tm.setTranslateX(0);
		tm.setTranslateY(-150);
    	tm.setFont(Font.font(50));

		
		tr.setMaxHeight(125);
		tr.setMaxWidth(125);
		tr.setTranslateX(150);
		tr.setTranslateY(-150);
    	tr.setFont(Font.font(50));
		
		ml.setMaxHeight(125);
		ml.setMaxWidth(125);
		ml.setTranslateX(-150);
		ml.setTranslateY(0);
    	ml.setFont(Font.font(50));
		
		mm.setMaxHeight(125);
		mm.setMaxWidth(125);
		mm.setTranslateX(0);
		mm.setTranslateY(0);
    	mm.setFont(Font.font(50));
    	
		mr.setMaxHeight(125);
		mr.setMaxWidth(125);
		mr.setTranslateX(150);
		mr.setTranslateY(0);
    	mr.setFont(Font.font(50));
		
		bl.setMaxHeight(125);
		bl.setMaxWidth(125);
		bl.setTranslateX(-150);
		bl.setTranslateY(150);
    	bl.setFont(Font.font(50));
		
		bm.setMaxHeight(125);
		bm.setMaxWidth(125);
		bm.setTranslateX(0);
		bm.setTranslateY(150);
    	bm.setFont(Font.font(50));
		
		br.setMaxHeight(125);
		br.setMaxWidth(125);
		br.setTranslateX(150);
		br.setTranslateY(150);
    	br.setFont(Font.font(50));
		
		
		
		final StackPane root = new StackPane();
		
		root.getChildren().add(tl);
		root.getChildren().add(tm);
		root.getChildren().add(tr);
		root.getChildren().add(ml);
		root.getChildren().add(mm);
		root.getChildren().add(mr);
		root.getChildren().add(bl);
		root.getChildren().add(bm);
		root.getChildren().add(br);
		root.getChildren().add(l);
		
		
		
		primaryStage.setScene(new Scene(root, 500, 500));
		primaryStage.show();
		
		EventHandler<ActionEvent> onPressTL = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(topL)) {
            		main.addToPlayed(topL, main.xTurn);
                    if(main.xTurn) {
                    	tl.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	tl.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        }; 
		EventHandler<ActionEvent> onPressTM = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(topM)) {
            		main.addToPlayed(topM, main.xTurn);
                    if(main.xTurn) {
                    	tm.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	tm.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressTR = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(topR)) {
            		main.addToPlayed(topR, main.xTurn);
                    if(main.xTurn) {
                    	tr.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	tr.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressML = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(midL)) {
            		main.addToPlayed(midL, main.xTurn);
                    if(main.xTurn) {
                    	ml.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	ml.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
        EventHandler<ActionEvent> onPressMM = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(midM)) {
            		main.addToPlayed(midM, main.xTurn);
                    if(main.xTurn) {
                    	mm.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	mm.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressMR = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(midR)) {
            		main.addToPlayed(midR, main.xTurn);
                    if(main.xTurn) {
                    	mr.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	mr.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressBL = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(botL)) {
            		main.addToPlayed(botL, main.xTurn);
                    if(main.xTurn) {
                    	bl.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	bl.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressBM = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(botM)) {
            		main.addToPlayed(botM, main.xTurn);
                    if(main.xTurn) {
                    	bm.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	bm.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (!main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };
		EventHandler<ActionEvent> onPressBR = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent e) 
            { 

            	if(main.canBePlayed(botR)) {
            		main.addToPlayed(botR, main.xTurn);
                    if(main.xTurn) {
                    	br.setText("X");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("X Wins!"); 
                    		return;
                    	}
                    	main.xTurn = false;
                    }else {
                    	br.setText("Y");
                    	if(main.hasWon()) {
                        	l.setFont(Font.font(72));
                    		l.setTranslateY(-75);
                    		l.setText("Y Wins!"); 
                    		return;
                    	}
                    	main.xTurn = true;

                    }
            	}else {
            		l.setText("Try a new spot");
            	}
            	
            	if (main.xTurn)
            		l.setText("It is Y's turn"); 
            	else
            		l.setText("It is X's turn");
            } 
        };

		
		tl.setOnAction(onPressTL);
		tm.setOnAction(onPressTM);
		tr.setOnAction(onPressTR);
		ml.setOnAction(onPressML);
		mm.setOnAction(onPressMM);
		mr.setOnAction(onPressMR);
		bl.setOnAction(onPressBL);
		bm.setOnAction(onPressBM);
		br.setOnAction(onPressBR);
	}
	
	
	
}
