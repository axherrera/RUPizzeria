package com.example.project4;

        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.Initializable;
        import javafx.scene.control.*;
        import javafx.scene.image.ImageView;

        import java.net.URL;
        import java.util.ResourceBundle;

public class ChicagoPizzaController implements Initializable {
    private HomePageController homePageController;
    private PizzaFactory factory;
    private Pizza currentPizza;

    private final Style [] styleOptions = {
            Style.DELUXE,
            Style.BBQ,
            Style.MEATZZA,
            Style.BYO
    };


    @FXML
    private Button addToppingButton, remToppingButton;
    @FXML
    private TextField crustType;

    @FXML
    private ImageView chiPizzaImage;

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
    private RadioButton smallPizza, mediumPizza, largePizza;

    private ObservableList<Topping> toppings;
    private ObservableList<Topping> selected;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        toppings = FXCollections.observableArrayList(Topping.getAll());
        selected = FXCollections.observableArrayList();
        opList.setItems(toppings);
        selList.setItems(selected);
        pizzaSyle.getItems().addAll(styleOptions);
        crustType.setEditable(false);
        pizzaPrice.setEditable(false);

        factory = new ChicagoPizza();
        pizzaSyle.setValue(Style.DELUXE);

        updatePage(Style.DELUXE);
    }

    public void setHomePageController(HomePageController controller){
        this.homePageController=controller;
    }
    @FXML
    void addToOrder(ActionEvent event) {
        homePageController.addToOrder(currentPizza);
    }

    @FXML
    void addTopping(ActionEvent event) {
        Topping t = opList.getSelectionModel().getSelectedItem();
        if(t==null)
            return;
        selList.getItems().add(t);
        currentPizza.add(t);
        opList.getItems().remove(t);
        pizzaPrice.setText(Double.toString(currentPizza.price()));
        if(currentPizza.getNumToppings()==7)
            addToppingButton.setDisable(true);
    }

    @FXML
    void remTopping(ActionEvent event) {
        Topping t = selList.getSelectionModel().getSelectedItem();
        if(t==null)
            return;
        selList.getItems().remove(t);
        currentPizza.remove(t);
        opList.getItems().add(t);
        pizzaPrice.setText(Double.toString(currentPizza.price()));
        if(currentPizza.getNumToppings()<7)
            addToppingButton.setDisable(false);
    }

    @FXML
    void changeSize(ActionEvent event) {
        currentPizza.setSize(
                Size.idSize(((RadioButton)pizzaSize.getSelectedToggle()).getText())
        );
        pizzaPrice.setText(Double.toString(currentPizza.price()));
    }

    @FXML
    void styleSelection(ActionEvent event) {
        Style currentSelection = pizzaSyle.getValue();
        switch (currentSelection){
            case DELUXE -> updatePage(Style.DELUXE);

            case BBQ -> updatePage(Style.BBQ);

            case MEATZZA -> updatePage(Style.MEATZZA);

            case BYO -> updatePage(Style.BYO);
        }
    }

    void updatePage(Style style){
        switch (style){
            case DELUXE -> {
                currentPizza = factory.createDeluxe();
                selected.removeAll(Topping.getAll());
                selected.addAll(Topping.getDeluxe());
                disableButtons();
            }
            case BBQ -> {
                currentPizza = factory.createBBQChicken();
                selected.removeAll(Topping.getAll());
                selected.addAll(Topping.getBBQ());
                disableButtons();
            }
            case MEATZZA -> {
                currentPizza = factory.createMeatzza();
                selected.removeAll(Topping.getAll());
                selected.addAll(Topping.getMeatzza());
                disableButtons();
            }
            case BYO -> {
                currentPizza = factory.createBuildYourOwn();
                toppings.removeAll(Topping.getAll());
                toppings.addAll(Topping.getAll());
                selected.removeAll(Topping.getAll());
                enableButtons();
            }
            default -> factory.createBuildYourOwn();
        }
        currentPizza.setSize(
                Size.idSize(((RadioButton)pizzaSize.getSelectedToggle()).getText())
        );
        selList.setItems(selected);
        crustType.setText(currentPizza.getCrust().toString());
        pizzaPrice.setText(Double.toString(currentPizza.price()));
    }

    void disableButtons (){
        addToppingButton.setDisable(true);
        remToppingButton.setDisable(true);
        opList.setDisable(true);
    }

    void enableButtons (){
        addToppingButton.setDisable(false);
        remToppingButton.setDisable(false);
        opList.setDisable(false);
    }
}


