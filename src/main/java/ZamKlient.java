import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ZamKlient extends BorderPane{

    Label data = new Label("Data zamówienia:");
    Label wartosc = new Label("Wartość zamówienia:");
    TextField pdata = new TextField();
    TextField pwartosc = new TextField();
    Button cofnij = new Button("Cofnij");

    public ZamKlient (){}
    public  ZamKlient(Scene scene){
        przygotuj(scene);
    }

    public void przygotuj(Scene scene){
        HBox hbo1= new HBox();
        hbo1.getChildren().addAll(data,pdata);
        HBox hbo2= new HBox();
        hbo2.getChildren().addAll(wartosc,pwartosc);
        HBox hbo3 = new HBox(cofnij);
        VBox all= new VBox();
        all.getChildren().addAll(hbo1,hbo2,hbo3);
        data.setPrefSize(150,25);
        pdata.setPrefSize(150,20);
        wartosc.setPrefSize(150,25);
        pwartosc.setPrefSize(150,20);
        cofnij.setPrefSize(150,20);

            scene.setRoot(this);
            this.setCenter(all);
        }
}