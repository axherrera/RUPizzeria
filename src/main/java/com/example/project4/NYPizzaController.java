

package com.example.project4;

        import javafx.beans.value.ChangeListener;
        import javafx.beans.value.ObservableValue;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.ComboBox;
        import javafx.scene.control.ListView;
        import javafx.scene.control.RadioButton;
        import javafx.scene.control.TextField;
        import javafx.scene.control.ToggleGroup;
        import javafx.scene.image.ImageView;

        import java.net.URL;
        import java.util.ResourceBundle;

public class NYPizzaController implements Initializable {

    private PizzaFactory factory;
    private Pizza currentPizza;

    private final Style [] styleOptions = {
            Style.DELUXE,
            Style.BBQ,
            Style.MEATZZA,
            Style.BYO
    };


    @FXML
    private TextField crustType;

    @FXML
    private RadioButton largePizza;

    @FXML
    private RadioButton mediumPizza;

    @FXML
    private ImageView nyPizzaImage;

    @FXML
    private ListView<Topping> opList;

    @FXML
    private TextField pizzaPrice;

    @FXML
    private ToggleGroup pizzaSize;

    @FXML
    private ComboBox<Style> pizzaSyle;

    @FXML
    private ListView<Topping> selList;

    @FXML
    private RadioButton smallPizza;

    private ObservableList<Topping> toppings;
    private ObservableList<Topping> selected;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        toppings = FXCollections.observableArrayList(Topping.getAll());
        selected = FXCollections.observableArrayList();
        selList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Topping>() {
            @Override
            public void changed(ObservableValue<? extends Topping> observableValue, Topping topping, Topping t1) {

            }
        });

        factory = new NYPizza();
        currentPizza = factory.createBuildYourOwn();

        opList.setItems(toppings);
        selList.setItems(selected);
        pizzaSyle.setValue(Style.BYO);
        pizzaSyle.getItems().addAll(styleOptions);

    }

    @FXML
    void addToOrder(ActionEvent event) {

    }

    @FXML
    void addTopping(ActionEvent event) {

    }

    @FXML
    void remTopping(ActionEvent event) {

    }

    @FXML
    void styleSelection(ActionEvent event) {
        Style currentSelection = pizzaSyle.getValue();
        switch (currentSelection){
            case DELUXE -> {
                currentPizza = factory.createDeluxe();
                selected = FXCollections.observableArrayList(Topping.getDeluxe());
            }
            case BBQ -> {
                currentPizza = factory.createBBQChicken();
                selected = FXCollections.observableArrayList(Topping.getBBQ());
            }
            case MEATZZA -> {
                currentPizza = factory.createMeatzza();
                selected = FXCollections.observableArrayList(Topping.getMeatzza());
            }
        }

    }

    void updatePage(Style style){

    }


}

