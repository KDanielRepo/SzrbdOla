import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Koszyk extends BorderPane {
    Label co = new Label("Co");
    TextField wco = new TextField();
    Label ile = new Label("Ile");
    TextField wile = new TextField();
    Label cena = new Label("Cena sztuki");
    TextField wcena = new TextField();
    Label suma = new Label("Suma");
    TextField psuma = new TextField();
    Button zamow = new Button("Zamów");
    Button cofnij = new Button("Cofnij");

    public Koszyk (){}
    public Koszyk(Scene scene){
        przygotuj(scene);
    }

    public void przygotuj(Scene scene){
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll(co,ile,cena,suma,zamow);
        VBox vbo2= new VBox();
        vbo2.getChildren().addAll(wco,wile,wcena,psuma,cofnij);
        HBox all= new HBox();
        all.getChildren().addAll(vbo1,vbo2);

        co.setPrefSize(100,25);
        ile.setPrefSize(100,25);
        cena.setPrefSize(100,25);
        suma.setPrefSize(100,25);
        wco.setPrefSize(100,20);
        wile.setPrefSize(100,20);
        psuma.setPrefSize(100,20);
        zamow.setPrefSize(100,20);
        cofnij.setPrefSize(100,20);


        scene.setRoot(this);
        this.setCenter(all);
    }
}
