import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class displayXorO {
	final private static int Radius = 37;
	public static void o(int locX, int locY) {
		Circle circle = new Circle();
		circle.setRadius(Radius);
		circle.setLayoutX(locX);
		circle.setLayoutY(locY);
		
	}

	public static void x(double locX, double locY) {
		Line br = new Line();
		br.setStartX(locX);
		br.setStartY(locY);
		br.setEndX(locX - 74);
		br.setEndY(locY - 74);
		Line bl = new Line();
		bl.setStartX(locX + 74);
		bl.setStartY(locY);
		br.setEndX(locX);
		br.setEndY(locY - 74);
	}
}
