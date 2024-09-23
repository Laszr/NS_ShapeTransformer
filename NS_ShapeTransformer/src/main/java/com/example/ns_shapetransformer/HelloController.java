package com.example.ns_shapetransformer;

import javafx.css.Size;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.RotateEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.io.IOException;

public class HelloController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Circle circle;

    @FXML
    private Rectangle rectangle;

    @FXML
    private Polygon triangle;

    public void rotateTriangle(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        triangle_rotate(90).Rotate(triangle);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void rotateCircle(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        circle_rotate(90).Rotate(circle);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void rotateRectangle(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        rectangle_rotate(90).Rotate(rectangle);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void circleColor(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        circle_color.setColor(Color.ALICEBLUE);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void colorTriangle(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        triangle_color.setColor(Color.RED);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void rectangleColor(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        rectangle_color.setColor(Color.PURPLE);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void triangleSize(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        triangle_size.setSize(10);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void circleSize(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        circle_size.setSize(10);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
    public void rectangleSize(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("alternate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        rectangle_size.setSize(10);


        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}