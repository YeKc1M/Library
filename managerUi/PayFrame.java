package managerUi;

import login.Button;
import login.NonopaquePanel;

import javax.swing.*;
import java.awt.*;

//run if there is fine when returning a book in Client

public class PayFrame extends BackgroundFrame{
    String bookID;
    public PayFrame(double fine, String id){
        bookID=id;
        backgroundPanel.setLayout(new GridLayout(2, 1));
        backgroundPanel.add(new JLabel("please pay "+fine){
            {
                this.setHorizontalAlignment(JLabel.CENTER);
            }
        });
        backgroundPanel.add(new NonopaquePanel(){
            {
                this.add(new Button("paid!"){
                    {
                        //communicate with Server(bookID)
                        PayFrame.this.dispose();
                    }
                });
            }
        });
    }
}
