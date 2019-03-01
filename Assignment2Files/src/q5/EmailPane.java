package q5;

import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
/**
 * Sets the email format.
 * 
 * @author Chris Qin A00944299 Set A
 * @version 1.0
 */
public class EmailPane extends GridPane {
    
    /**'To' Label.*/
    private Label toAddress;
    
    /**'CC' Label.*/
    private Label ccAddress;
    
    /**'BCC' Label.*/
    private Label bccAddress;
    
    /**Subject line Label.*/
    private Label subjectLine;
    
    /**Message body Label.*/
    private Label messageBody;
    
    /**'To' textfield.*/
    private TextField toInput;
    
    /**'Cc' textfield.*/
    private TextField ccInput;
    
    /**'Bcc' textfield.*/
    private TextField bccInput;
    
    /**Subject line textfield.*/
    private TextField subjectInput;
    
    /**Message body textfield.*/
    private TextField messageInput;

    /**Email Pane formatting code.*/
    public EmailPane() {
        final int fieldWidth = 300;
        final int fieldHeight = 250;
        final int horizontalGap = 50;
        final int verticalGap = 10;
        final int one = 1;
        final int two = 2;
        final int three = 3;
        final int four = 4;
        final int six = 6;
        
        toAddress = new Label("To: ");
        GridPane.setHalignment(toAddress, HPos.LEFT);

        ccAddress = new Label("CC: ");
        GridPane.setHalignment(ccAddress, HPos.LEFT);
        
        bccAddress = new Label("BCC: ");
        GridPane.setHalignment(bccAddress, HPos.LEFT);
        
        subjectLine = new Label("Subject line: ");
        GridPane.setHalignment(subjectLine, HPos.LEFT);
        
        messageBody = new Label("Message Box: ");
        GridPane.setHalignment(messageBody, HPos.LEFT);

        toInput = new TextField();
        toInput.setPrefWidth(fieldWidth);
        toInput.setAlignment(Pos.TOP_LEFT);
        
        ccInput = new TextField();
        ccInput.setPrefWidth(fieldWidth);
        ccInput.setAlignment(Pos.TOP_LEFT);
        
        bccInput = new TextField();
        bccInput.setPrefWidth(fieldWidth);
        bccInput.setAlignment(Pos.TOP_LEFT);
        
        subjectInput = new TextField();
        subjectInput.setPrefWidth(fieldWidth);
        subjectInput.setAlignment(Pos.TOP_LEFT);
        
        messageInput = new TextField();
        messageInput.setPrefWidth(fieldWidth);
        messageInput.setPrefHeight(fieldHeight);
        messageInput.setAlignment(Pos.TOP_LEFT);
        
        Button sendButton = new Button("Send");
        sendButton.setOnAction(this::processSendButton);

        setAlignment(Pos.CENTER);
        setHgap(horizontalGap);
        setVgap(verticalGap);
        
        add(toAddress, 0, 0);
        add(ccAddress, 0, one);
        add(bccAddress, 0, two);
        add(subjectLine, 0, three);
        add(messageBody, 0, four);
        add(toInput, one, 0);
        add(ccInput, one, one);
        add(bccInput, one, two);
        add(subjectInput, one, three);
        add(messageInput, one, four);
        add(sendButton, 0, six);
    }
    
    /**sets an action for the send button.
     * @param event exceutes send button
     */
    public void processSendButton(ActionEvent event) {
        String sendResult = "" + toInput.getText() + "\n" + ccInput.getText() 
        + "\n" + bccInput.getText() + "\n" + subjectInput.getText() + "\n"
                + messageInput.getText();
        System.out.println(sendResult);
    }
}
