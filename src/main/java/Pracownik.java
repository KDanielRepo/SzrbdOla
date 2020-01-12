import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Pracownik extends BorderPane{

    Label zamowienie = new Label("Zamówienie:");
    TextField wzamowienie = new TextField();
    Label status = new Label("Status:");
    TextField wstatus = new TextField();
    Button zapis = new Button("Zapisz zmiany");

    public Pracownik(){}
    public Pracownik(Scene scene){
        przygotuj(scene);
}

    public void przygotuj(Scene scene){
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll(zamowienie,status);
        VBox vbo2= new VBox();
        vbo2.getChildren().addAll(wzamowienie,wstatus);
        HBox hbo1= new HBox();
        hbo1.getChildren().addAll(zapis);
        HBox all= new HBox();
        all.getChildren().addAll(vbo1,vbo2,hbo1);
        zamowienie.setPrefSize(100,20);
        wzamowienie.setPrefSize(100,20);
        status.setPrefSize(100,20);
        wstatus.setPrefSize(100,20);
        zapis.setPrefSize(100,20);

        scene.setRoot(this);
        this.setCenter(all);
    }

}

//pracownik:
//podgląd zamówienia + adresu
// zmiana statusu zamówienia

    //BorderPane dwa = new BorderPane();