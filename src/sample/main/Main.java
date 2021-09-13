package sample.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.intarfaces.impls.ColltionAdressBook;
import sample.objects.Person;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/sample.fxml"));
        primaryStage.setTitle("Телефонная книга");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(400);
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    private void testData(){
        ColltionAdressBook adressBook   = new ColltionAdressBook();

        Person person = new Person();
        person.setFio("Vakarchuk");
        person.setPhone("121212121212");


        Person person2 = new Person();
        person.setFio("Nogu svelo");
        person.setPhone("121212121212");

        adressBook.add(person);
        adressBook.add(person2);

        person.setPhone("1111111111111");
        //adressBook.update(person)

        adressBook.delete(person);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
