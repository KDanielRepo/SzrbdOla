import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Edycja extends BorderPane {
    Button klient = new Button("Dane klientów");
    Button zamowienia = new Button("Zamówienia");
    Button pracownicy = new Button("Pracownicy");
    Button towar = new Button("Towar");
    Button cofnij = new Button("Cofnij");
    Button wyloguj = new Button("Wyloguj");
/*    Scene sceneEdit;*/




    public Edycja(){}
    public Edycja(Scene scene){
        przygotuj(scene);
    }
    public void przygotuj(Scene scene){
        VBox vbo1 = new VBox();
        vbo1.getChildren().addAll(klient,pracownicy,wyloguj);
        VBox vbo2 = new VBox();
        vbo2.getChildren().addAll(zamowienia,towar,cofnij);
        HBox all = new HBox();
        all.getChildren().addAll(vbo1,vbo2);
        klient.setPrefSize(100,100);
        zamowienia.setPrefSize(100,100);
        pracownicy.setPrefSize(100,100);
        towar.setPrefSize(100,100);
        cofnij.setPrefSize(100,100);
        wyloguj.setPrefSize(100,100);

        scene.setRoot(this);
        this.setCenter(all);

    }


        /*scene.setRoot(this);
        this.setCenter(all);*/
}
