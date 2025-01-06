import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Calculator implements ActionListener {
    TextField tf=new TextField();


    //Row-2
    Button b1=new Button(" %");
    Button b2=new Button(" CE ");
    Button b3=new Button(" C ");
    Button b4=new Button(" x ");

    //Row-3
    Button b5=new Button(" 7 ");
    Button b6=new Button(" 8 ");
    Button b7=new Button(" 9 ");
    Button b8=new Button(" * ");

    //Row-4
    Button b10=new Button(" 4 ");
    Button b11=new Button(" 5 ");
    Button b12=new Button(" 6 ");
    Button b13=new Button(" - ");

    //Row-5
    Button b14=new Button(" 1 ");
    Button b15=new Button(" 2 ");
    Button b16=new Button(" 3 ");
    Button b17=new Button(" + ");

    //Row-6
    Button b18=new Button(" */- ");
    Button b19=new Button(" 0 ");
    Button b20=new Button(" . ");
    Button b21=new Button(" = ");
    Calculator(){
        Frame f=new Frame("Calculator Application");
        //Row-1


        //frame size
        f.setBounds(100,100,600,600);

        //Row-1-Bound Setting
        tf.setBounds(100,100,360,40);

        //Row-2-Bound Setting
        b1.setBounds(100,160,80,30);
        b2.setBounds(190,160,80,30);
        b3.setBounds(280,160,80,30);
        b4.setBounds(370,160,80,30);

        //Row-3-Bound Setting
        b5.setBounds(100,220,80,30);
        b6.setBounds(190,220,80,30);
        b7.setBounds(280,220,80,30);
        b8.setBounds(370,220,80,30);

        //Row-4-Bound Setting
        b10.setBounds(100,280,80,30);
        b11.setBounds(190,280,80,30);
        b12.setBounds(280,280,80,30);
        b13.setBounds(370,280,80,30);

        //Row-5-Bound Setting
        b14.setBounds(100,340,80,30);
        b15.setBounds(190,340,80,30);
        b16.setBounds(280,340,80,30);
        b17.setBounds(370,340,80,30);

        //Row-6-Bound Setting
        b18.setBounds(100,400,80,30);
        b19.setBounds(190,400,80,30);
        b20.setBounds(280,400,80,30);
        b21.setBounds(370,400,80,30);

        //Adding Event Listeners

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);







        f.add(tf);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.add(b17);
        f.add(b18);
        f.add(b19);
        f.add(b20);
        f.add(b21);



        f.setLayout(null);
        f.setVisible(true);



    }


    public static void main(String[] args) {
        Calculator c=new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            tf.setText(b1.getLabel());
            System.out.println("hello");
        }
        else if(e.getSource()==b2){
            tf.setText(b2.getLabel());
        }
        else if(e.getSource()==b3){
            tf.setText(b3.getLabel());
        }
        else if(e.getSource()==b4){
            tf.setText(b4.getLabel());
        }
        else if(e.getSource()==b5){
            tf.setText(b5.getLabel());
        }
        else if(e.getSource()==b6){
            tf.setText(b6.getLabel());
        }
        else if(e.getSource()==b7){
            tf.setText(b7.getLabel());
        }
        else if(e.getSource()==b8){
            tf.setText(b8.getLabel());
        }
        else if(e.getSource()==b10){
            tf.setText(b10.getLabel());
        }
        else if(e.getSource()==b11){
            tf.setText(b12.getLabel());
        }
        else if(e.getSource()==b13){
            tf.setText(b13.getLabel());
        }
        else if(e.getSource()==b14){
            tf.setText(b14.getLabel());
        }
        else if(e.getSource()==b15){
            tf.setText(b15.getLabel());
        }
        else if(e.getSource()==b16){
            tf.setText(b16.getLabel());
        }
        else if(e.getSource()==b17){
            tf.setText(b17.getLabel());
        }
        else if(e.getSource()==b18){
            tf.setText(b18.getLabel());
        }
        else if(e.getSource()==b19){
            tf.setText(b20.getLabel());
        }
        else if(e.getSource()==b21){
            tf.setText(b21.getLabel());
        }

    }


}
