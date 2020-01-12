import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Klient extends BorderPane {
    Label albumy = new Label(" Albumy");
    TextField walbumy = new TextField();
    Label instrumenty = new Label(" Instrumenty");
    TextField winstrumenty = new TextField();
    Label wyszukaj = new Label(" Wyszukaj");
    TextField wwyszukaj = new TextField();
    Button enter = new Button("Wyszukaj");
    Button zmiany = new Button("Edytuj dane konta");
    Button koszyk = new Button("Koszyk");
    Button zamow = new Button("Moje zamówienia");
    Button wyloguj = new Button("Wyloguj");
    Scene sceneKlient;

    public Klient(){}
    public Klient(Scene scene){
        przygotuj(scene);

    }

    public void przygotuj(Scene scene){
        sceneKlient = scene;
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll(albumy,walbumy);
        VBox vbo2= new VBox();
        vbo2.getChildren().addAll(instrumenty,winstrumenty,enter);
        VBox vbo3= new VBox();
        vbo3.getChildren().addAll(wyszukaj,wwyszukaj);
        VBox vbo4= new VBox();
        vbo4.getChildren().addAll(zmiany,koszyk,zamow,wyloguj);
        HBox all= new HBox();
        all.getChildren().addAll(vbo1,vbo2,vbo3,vbo4);
        albumy.setPrefSize(100,20);
        walbumy.setPrefSize(100,20);
        instrumenty.setPrefSize(100,20);
        winstrumenty.setPrefSize(100,20);
        wyszukaj.setPrefSize(100,20);
        wwyszukaj.setPrefSize(100,20);
        enter.setPrefSize(120,20);
        zmiany.setPrefSize(150,20);
        koszyk.setPrefSize(150,20);
        zamow.setPrefSize(150,20);
        wyloguj.setPrefSize(150,20);


        zmiany.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
               DaneKlient daneKlient = new DaneKlient(sceneKlient);
            }});
        koszyk.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Koszyk koszyk = new Koszyk(sceneKlient);
            }});
        zamow.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                ZamKlient zamKlient = new ZamKlient(sceneKlient);
            }});
/*        wyloguj.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Gui gui = new Gui(sceneKlient);
            }
        });*/

        scene.setRoot(this);
        this.setCenter(all);
    }








/*
    HBox hbo1 = new HBox();
        login.setPrefSize(100,20);
        wlog.setPrefSize(150,20);
        hbo1.getChildren().addAll(login,wlog);*/
}

//uzytkownik:
//wgląd:
//wyszukiwanie po muzykach/gatunkach
// zamówienia
// koszyk
// zakładka albumy
// zakładka instrumenty
//dane konta
//zmiana:
//koszyk
//dane konta