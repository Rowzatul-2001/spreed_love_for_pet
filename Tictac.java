
package pawprint.manager;       
        
        import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Tictac implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    JButton back = new JButton("Back");
    JButton reset = new JButton("Reset");
    
    boolean player1_turn;

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setBackground(null);
            buttons[i].setEnabled(true);
        }
        textfield.setText("TIC-TAC-TOE");
        firstTurn();
    }

    Tictac() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);
        title_panel.add(back, BorderLayout.WEST);
        title_panel.add(reset, BorderLayout.EAST);
        
        // Set up the text field
        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("TIC-TAC-TOE");
        textfield.setOpaque(true);
        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        
        // Set up the button panel
        button_panel.setLayout(new GridLayout(3, 3));
        button_panel.setBackground(new Color(150, 150, 150));
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }
        frame.add(button_panel);

        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               Management m=new Management();
               m.setVisible(true);
               frame.setVisible(false);
            }
        });

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetActionPerformed(e);
            }
        });

        firstTurn();
    }
    
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Tictac();
            }
        });
    }


     
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        for(int i=0;i<9;i++){
            if(e.getSource()==buttons[i]){
                if(player1_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("0 turn");
                        check();
                    }
                   
                }
                else{
                     if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("0");
                        player1_turn=true;
                        textfield.setText("X turn");
                        check();
                    }
                    
                } 
            }
        }
    }
    public void firstTurn(){
       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tictac.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(random.nextInt(2)==0){
                player1_turn=true;
                textfield.setText("X turn");
            }
            else{
                player1_turn=false;
                textfield.setText("0 turn");
            }
         
    }
    public void check(){
        if((buttons[0].getText()=="X")&&(buttons[1].getText()=="X")&&(buttons[2].getText()=="X")){
            xWins(0,1,2);
        }
        if((buttons[3].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[5].getText()=="X")){
            xWins(3,4,5);
        }
        if((buttons[6].getText()=="X")&&(buttons[7].getText()=="X")&&(buttons[8].getText()=="X")){
            xWins(6,7,8);
        }
        if((buttons[0].getText()=="X")&&(buttons[3].getText()=="X")&&(buttons[6].getText()=="X")){
            xWins(0,3,6);
        }
        if((buttons[1].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[7].getText()=="X")){
            xWins(1,4,7);
        }
        if((buttons[2].getText()=="X")&&(buttons[5].getText()=="X")&&(buttons[8].getText()=="X")){
            xWins(2,5,8);
        }
        if((buttons[0].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[8].getText()=="X")){
            xWins(0,4,8);
        }
        if((buttons[2].getText()=="X")&&(buttons[4].getText()=="X")&&(buttons[6].getText()=="X")){
            xWins(2,4,6);
        }
        
        
        if((buttons[0].getText()=="0")&&(buttons[1].getText()=="0")&&(buttons[2].getText()=="0")){
            oWins(0,1,2);
        }
        if((buttons[3].getText()=="0")&&(buttons[4].getText()=="0")&&(buttons[5].getText()=="0")){
            oWins(3,4,5);
        }
        if((buttons[6].getText()=="0")&&(buttons[7].getText()=="0")&&(buttons[8].getText()=="0")){
            oWins(6,7,8);
        }
        if((buttons[0].getText()=="0")&&(buttons[3].getText()=="0")&&(buttons[6].getText()=="0")){
            oWins(0,3,6);
        }
        if((buttons[1].getText()=="0")&&(buttons[4].getText()=="0")&&(buttons[7].getText()=="0")){
            oWins(1,4,7);
        }
        if((buttons[2].getText()=="0")&&(buttons[5].getText()=="0")&&(buttons[8].getText()=="0")){
            oWins(2,5,8);
        }
        if((buttons[0].getText()=="0")&&(buttons[4].getText()=="0")&&(buttons[8].getText()=="0")){
            oWins(0,4,8);
        }
        if((buttons[2].getText()=="0")&&(buttons[4].getText()=="0")&&(buttons[6].getText()=="0")){
            oWins(2,4,6);
        } 
            
    }
    public void xWins(int a,int b,int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("X WINS");
         
    }
    public void oWins(int a,int b,int c){
         buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            buttons[i].setEnabled(false);
        }
        textfield.setText("0 WINS");
       

    }
}
