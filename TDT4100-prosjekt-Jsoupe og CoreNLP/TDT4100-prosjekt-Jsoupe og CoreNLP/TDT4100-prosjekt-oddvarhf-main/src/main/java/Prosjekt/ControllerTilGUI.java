package Prosjekt;

import javafx.fxml.FXML;
import javafx.scene.control.Button; 
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class ControllerTilGUI implements LagretiFilObserver{


@FXML
private Button knapp1;

@FXML
private Button knapp2;

@FXML
private Button knapp3;

@FXML
private Button sendinn;

@FXML
private Button startspill;

@FXML
private TextField textinn;

@FXML
private ImageView bildepermanet;

@FXML
private TextArea textuut;

@FXML
private ImageView bilde;

@FXML
private Button nestespørsmåll;


HigherOrLower HL;

boolean liv;

URLTilFil urlTilFil;

public void initialize() {

    Image image = new Image(getClass().getResourceAsStream("image.png"));
    bildepermanet.setImage(image);

//bildepermanet.setImage(new Image("Higher-Or-Lower-Spill-NRK-Wiki--main\\TDT4100-prosjekt\\TDT4100-prosjekt-oddvarhf-main\\src\\main\\resources\\Prosjekt\\image.png"));

knapp1.setDisable(true);
knapp2.setDisable(true);
knapp3.setDisable(true);
nestespørsmåll.setDisable(true);

sendinn.setOnAction(event -> {
   // textuut.setText("Laster... Vennligst ha tålmodighet.");
   //blokkerende oppgave 
    String tekstFraBruker = textinn.getText();
    urlTilFil = new URLTilFil(tekstFraBruker);
    urlTilFil.addObserver(ControllerTilGUI.this);
    try {
        urlTilFil.startSkrapingOgLagre();
        if (urlTilFil.getNettside().equals("NRK")) {
            bilde.setImage(new Image(getClass().getResourceAsStream("nrk123.jpg")));
        } else if (urlTilFil.getNettside().equals("WIKI")) {
            bilde.setImage(new Image(getClass().getResourceAsStream("Wikipedia-logo-v2.png")));
        }
    } catch (Exception e) {
        textuut.setText("Feil: " + e.getMessage());
    }
   

    

});
               
        
startspill.setOnAction(event -> {

    startSpill();

});

            
nestespørsmåll.setOnAction(event -> {

    nesteSpørsmål();

});        
    
knapp1.setOnAction(event -> {
    String svar = HL.spill(1);
    oppdaterGrensesnitt(svar);
    spillferdig(HL.getAntallLiv());
});
    
knapp2.setOnAction(event -> {
    String svar = HL.spill(2);
    oppdaterGrensesnitt(svar);
    spillferdig(HL.getAntallLiv());
});
    
knapp3.setOnAction(event -> {
    String svar = HL.spill(3);
    oppdaterGrensesnitt(svar);
    spillferdig(HL.getAntallLiv());

});
    
            
}

private void nesteSpørsmål() {
        
       
    String oppgave = HL.Fåoppgave();
    oppdaterGrensesnitt(oppgave);

    knapp1.setText( HL.getPerson1().getNavn()+ " Er nevnt mest");
    knapp3.setText(HL.getPerson2().getNavn()+ " Er nevnt mest");           

}



public void startSpill() {
 
    startspill.setDisable(true);
    knapp1.setDisable(false);
    knapp2.setDisable(false);
    knapp3.setDisable(false);
    nestespørsmåll.setDisable(false);

    this.HL = new HigherOrLower();
    HL.lesPersonerFraFil("Telt.txt");
    
    String oppgave = HL.Fåoppgave();
    oppdaterGrensesnitt(oppgave);

    knapp1.setText( HL.getPerson1().getNavn()+ " Er nevnt mest");
    knapp3.setText(HL.getPerson2().getNavn()+ " Er nevnt mest");
        


}

private void oppdaterGrensesnitt(String tekst) {
        textuut.setText(tekst);
}



private void spillferdig(int liv){
    if (HL.getAntallLiv()<1) {
        textuut.setText("GameOver! Start et nytt spill for å spille igjen. DU  fikk "+HL.getANTALL_POENG() +" poeng");

        knapp1.setDisable(true);
        knapp2.setDisable(true);
        knapp3.setDisable(true);
        nestespørsmåll.setDisable(true);
        startspill.setDisable(false);

    }

}




}



    

