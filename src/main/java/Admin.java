import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Admin extends BorderPane {

    Button edit = new Button("Edycja danych");
    Button podglad = new Button("Przejrzyj dane");
    Button wyloguj = new Button("Wyloguj");
    Scene sceneAdmin;

    public Admin(){}
    public Admin(Scene scene){
        przygotuj(scene);
}

    public void przygotuj(Scene scene){
        sceneAdmin = scene;
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll(edit,podglad,wyloguj);
        HBox all= new HBox();
        all.getChildren().addAll(vbo1);
        edit.setPrefSize(150,100);
        podglad.setPrefSize(150,100);
        wyloguj.setPrefSize(150,100);

        edit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Edycja edycja = new Edycja(sceneAdmin);
            }});
        podglad.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                Podglad podglad = new Podglad(sceneAdmin);
            }});

        scene.setRoot(this);
        this.setCenter(all);
    }

 /*   public void przygotuj(){
        VBox vbo1= new VBox();
        vbo1.getChildren().addAll();
        VBox vbo2= new VBox();
        vbo2.getChildren().addAll();
        VBox vbo3= new VBox();
        vbo3.getChildren().addAll();
        HBox hbo1= new HBox();
        hbo1.getChildren().addAll();
        VBox all= new VBox();
        all.getChildren().addAll(vbo1,vbo2,vbo3,hbo1);
    }*/

}
