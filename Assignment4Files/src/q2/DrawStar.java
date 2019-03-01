package q2;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 * Uses points and lines to draw a star from a center point.
 *
 * @author A00944299
 * @version 2018
 */
public class DrawStar extends Application {
        
    /** The contents of the application scene. */
    private Group root;

    /**Line 1.*/
    private Line l1;
    
    /**Line 2.*/
    private Line l2;
    
    /**Line 3.*/
    private Line l3;
    
    /**Line 4.*/
    private Line l4;
    
    /**Line 5.*/
    private Line l5;
        
    /**Point 1.*/
    private Point2D a;
    
    /**Point 2.*/
    private Point2D b;
    
    /**Point 3.*/
    private Point2D c;
    
    /**Point 4.*/
    private Point2D d;
    
    /**Point 5.*/
    private Point2D e;
    
    /**Point 2 x var.*/
    private double x1;
    
    /**Point 2 y var.*/
    private double y1;
    
    /**Point 3 x var.*/
    private double x2;
    
    /**Point 3 y var.*/
    private double y2;
    
    /**Point 4 x var.*/
    private double x3;
   
    /**Point 4 y var.*/
    private double y3;

    /**Point 5 x var.*/
    private double x4;
    
    /**Point 5 y var.*/
    private double y4;
    
    /** circle to move to first mouse click location. */
    private final Circle atCenter = new Circle(0, 0, 3);
    
    
    /**
     * Displays an initially empty scene, waiting for the user to draw lines
     * with the mouse.
     * 
     * @param primaryStage
     *            a Stage
     */
    public void start(Stage primaryStage) {
        final int three = 3;
        root = new Group(atCenter);
        atCenter.setFill(Color.CYAN);

        final int appWidth = 1000;
        final int appHeight = 800;
       
        l1 = new Line();
        l1.setStroke(Color.CYAN);
        l1.setStrokeWidth(three);
        
        l2 = new Line();
        l2.setStroke(Color.CYAN);
        l2.setStrokeWidth(three);
        
        l3 = new Line();
        l3.setStroke(Color.CYAN);
        l3.setStrokeWidth(three);
        
        l4 = new Line();
        l4.setStroke(Color.CYAN);
        l4.setStrokeWidth(three);
        
        l5 = new Line();
        l5.setStroke(Color.CYAN);
        l5.setStrokeWidth(three);
        
        root.getChildren().add(l1);
        root.getChildren().add(l2);
        root.getChildren().add(l3);
        root.getChildren().add(l4);
        root.getChildren().add(l5);
        
        Scene scene = new Scene(root, appWidth, appHeight, Color.BLACK);
        
        scene.setOnMouseClicked(this::processMouseClick);
        scene.setOnMouseDragged(this::processMouseDrag);

        primaryStage.setTitle("Star Drawer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**When mouse is clicked.
     * 
     * @param event click
     */
    public void processMouseClick(MouseEvent event) {
        atCenter.setCenterX(event.getX());
        atCenter.setCenterY(event.getY());
       
    }

    /**When mouse is dragged.
     * 
     * @param event drag
     */
    public void processMouseDrag(MouseEvent event) {
        final double two = 2.0;
        final double four = 4.0;
        final double five = 5.0;
        final double six = 6.0;
        final double eight = 8.0;
        a = new Point2D(event.getX(), event.getY()); 
        
        //cos 72 * a.x *
        x1 = (Math.cos(two * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) - (Math.sin(two * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterX();
        y1 = (Math.sin(two * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) + (Math.cos(two * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterY();
        
        x2 = (Math.cos(four * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) - (Math.sin(four * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterX();
        y2 = (Math.sin(four * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) + (Math.cos(four * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterY();
        
        x3 = (Math.cos(six * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) - (Math.sin(six * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterX();
        y3 = (Math.sin(six * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) + (Math.cos(six * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterY();
        
        x4 = (Math.cos(eight * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) - (Math.sin(eight * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterX();
        y4 = (Math.sin(eight * Math.PI / five) * (a.getX() 
                - atCenter.getCenterX())) + (Math.cos(eight * Math.PI / five) 
                * (a.getY() - atCenter.getCenterY())) + atCenter.getCenterY();
        
        b = new Point2D(x1, y1);
        c = new Point2D(x2, y2);
        d = new Point2D(x3, y3);
        e = new Point2D(x4, y4);

        l1.setStartX(a.getX());
        l1.setStartY(a.getY());
        l1.setEndX(c.getX());
        l1.setEndY(c.getY());
        
        l2.setStartX(c.getX());
        l2.setStartY(c.getY());
        l2.setEndX(e.getX());
        l2.setEndY(e.getY());

        l3.setStartX(e.getX());
        l3.setStartY(e.getY());
        l3.setEndX(b.getX());
        l3.setEndY(b.getY());
        
        l4.setStartX(b.getX());
        l4.setStartY(b.getY());
        l4.setEndX(d.getX());
        l4.setEndY(d.getY());
        
        l5.setStartX(d.getX());
        l5.setStartY(d.getY());
        l5.setEndX(a.getX());
        l5.setEndY(a.getY());
        
    }
    /**
     * Launches the JavaFX application.
     * 
     * @param args
     *            command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}