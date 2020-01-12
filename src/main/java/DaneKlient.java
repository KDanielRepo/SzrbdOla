import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class DaneKlient extends BorderPane {

    Label login = new Label("Login:");
    TextField wlogin = new TextField();
    Label haslo = new Label("Hasło:");
    TextField whaslo = new TextField();
    Label email = new Label("Email:");
    TextField wemail = new TextField();
    Label nr_tel = new Label("Numer telefonu:");
    TextField wnr_tel = new TextField();
    Label imie = new Label("Imię:");
    TextField wimie = new TextField();
    Label nazwisko = new Label("Nazwisko:");
    TextField wnazwisko = new TextField();
    Label wojewodztwo = new Label("Województwo:");
    TextField wwojewodztwo = new TextField();
    Label miasto = new Label("Miasto:");
    TextField wmiasto = new TextField();
    Label ulica = new Label("Ulica:");
    TextField wulica = new TextField();
    Label kod_poczt = new Label("Kod pocztowy:");
    TextField wkod_poczt = new TextField();
    Label nr_domu = new Label("Numer domu:");
    TextField wnr_domu = new TextField();
    Label nr_lok = new Label("Numer lokalu:");
    TextField wnr_lok = new TextField();

    Button zapisz = new Button("Zapisz zmiany");
    Button cofnij = new Button("Cofnij");

    public DaneKlient(){}                       //konstruktor bez parametrowy
    public DaneKlient(Scene scene){
        przygotuj(scene);
    }
    //konstruktor parametrowy z Scene


    public void przygotuj(Scene scene){
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll(login,haslo,email,nr_tel,imie,nazwisko,wojewodztwo,miasto,ulica,kod_poczt,nr_domu,nr_lok,zapisz);
        VBox vbo2= new VBox();
        vbo2.getChildren().addAll(wlogin,whaslo,wemail,wnr_tel,wimie,wnazwisko,wwojewodztwo,wmiasto,wulica,wkod_poczt,wnr_domu,wnr_lok,cofnij);
        HBox all= new HBox();
        all.getChildren().addAll(vbo1,vbo2);

        login.setPrefSize(100,25);
        haslo.setPrefSize(100,25);
        email.setPrefSize(100,25);
        nr_tel.setPrefSize(100,25);
        imie.setPrefSize(100,25);
        nazwisko.setPrefSize(100,25);
        wojewodztwo.setPrefSize(100,25);
        miasto.setPrefSize(100,25);
        ulica.setPrefSize(100,25);
        kod_poczt.setPrefSize(100,25);
        nr_domu.setPrefSize(100,25);
        nr_lok.setPrefSize(100,25);

        wlogin.setPrefSize(100,20);
        whaslo.setPrefSize(100,20);
        wemail.setPrefSize(100,20);
        wnr_tel.setPrefSize(100,20);
        wimie.setPrefSize(100,20);
        wnazwisko.setPrefSize(100,20);
        wwojewodztwo.setPrefSize(100,20);
        wmiasto.setPrefSize(100,20);
        wulica.setPrefSize(100,20);
        wkod_poczt.setPrefSize(100,20);
        wnr_domu.setPrefSize(100,20);
        wnr_lok.setPrefSize(100,20);
        zapisz.setPrefSize(100,20);
        cofnij.setPrefSize(100,20);





        scene.setRoot(this);
        this.setCenter(all);


    }//Metoda ktora przygodowuje wyglad i ma parametr Scene
}