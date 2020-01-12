import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Gui extends Application {
    Label login = new Label("Login:");
    Label haslo = new Label("Hasło:");
    Label won = new Label();
    TextField wlog = new TextField();
    PasswordField whas = new PasswordField();
    Button zaloguj = new Button("Zaloguj");
    Scene scenelog;
    Stage pStage;

    public static void main(String[] args) {
        launch(Gui.class,args);
    }

    public void start(final Stage primaryStage) throws Exception {
        BorderPane log = new BorderPane();
        log.setPrefSize(600,400);
        scenelog = new Scene(log);
        primaryStage.setScene(scenelog);
        primaryStage.show();


        HBox hbo1 = new HBox();
        hbo1.getChildren().addAll(login,wlog);
        HBox hbo2 = new HBox();
        hbo2.getChildren().addAll(haslo,whas);
        HBox hbo3 = new HBox();
        hbo3.getChildren().addAll(zaloguj,won);
        VBox vbo1 = new VBox();
        vbo1.getChildren().addAll(hbo1,hbo2,hbo3);

        wlog.setPrefSize(150,20);
        login.setPrefSize(100,20);
        haslo.setPrefSize(100,20);
        whas.setPrefSize(150,20);
        zaloguj.setPrefSize(100,20);
        log.setCenter(vbo1);

        zaloguj.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (wlog.getText().equals("admin") && whas.getText().equals("admin")){
                     Admin admin = new Admin(scenelog);

                }else if (wlog.getText().equals("prac") && whas.getText().equals("prac")){
                    Pracownik pracownik = new Pracownik(scenelog);

                }else if (wlog.getText().equals("user") && whas.getText().equals("user")){
                    Klient klient = new Klient(scenelog);

               }else{
                    won.setText("Błędny login lub hasło!");
                }

            }
        });
    }
}




























//admin:
//pełny dostęp

//   BorderPane admin = new BorderPane();