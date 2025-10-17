import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

 /* <applet code="cla.class" width="300" height="250"> </applet> */ 
public class cla extends Applet implements ActionListener
{
    int c  ;
    double n;
	TextField t1;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    String s1,s2,s3,s4,s5;
    public void init(){
        t1=new TextField();
        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button(".");
        b11=new Button("+");
        b12=new Button("-");
        b13=new Button("*");
        b14=new Button("/");
        b15=new Button("=");
        b16=new Button("clr");
        setLayout(null);
        t1.setBounds(30, 30, 260, 30);
        b16.setBounds(30,70,60,30);
        b14.setBounds(95,70,60,30);
        b13.setBounds(160,70,60,30);
        b12.setBounds(225, 70, 60, 30);
        b7.setBounds(30,105,60,30);
        b8.setBounds(95,105,60,30);
        b9.setBounds(160,105,60,30);
        b11.setBounds(225, 105, 60, 65);
        b4.setBounds(30,140,60,30);
        b5.setBounds(95,140,60,30);
        b6.setBounds(160,140,60,30);
        b1.setBounds(30,175,60,30);
        b2.setBounds(95,175,60,30);
        b3.setBounds(160,175,60,30);
        b15.setBounds(225, 175, 60, 65);
        b0.setBounds(30,210,125,30);
        b10.setBounds(160,210,60,30);
        add(t1);
        add(b0);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15); 
        add(b16);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
       
        if(e.getSource()==b0){
            s3=t1.getText();
            s4="0";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b1){
            s3=t1.getText();
            s4="1";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b2){
            s3=t1.getText();
            s4="2";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b3){
            s3=t1.getText();
            s4="3";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b4){
            s3=t1.getText();
            s4="4";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b5){
            s3=t1.getText();
            s4="5";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b6){
            s3=t1.getText();
            s4="6";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b7){
            s3=t1.getText();
            s4="7";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b8){
            s3=t1.getText();
            s4="8";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b9){
            s3=t1.getText();
            s4="9";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b10){
            s3=t1.getText();
            s4=".";
            s5=s3+s4;
            t1.setText(s5);
        }
        if(e.getSource()==b11){
            s1=t1.getText();
            t1.setText("");
            c=1;
        }
        if(e.getSource()==b12){
            s1=t1.getText();
            t1.setText("");
            c=2;
        }
        if(e.getSource()==b13){
            s1=t1.getText();
            t1.setText("");
            c=3;
        }
        if(e.getSource()==b14){
            s1=t1.getText();
            t1.setText("");
            c=4;
        }
        if(e.getSource()==b15)
        {
            s2=t1.getText();
            if(c==1){
                n=Double.parseDouble(s1)+Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==2){
                n=Double.parseDouble(s1)-Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==3){
                n=Double.parseDouble(s1)*Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
            if(c==4){
                n=Double.parseDouble(s1)/Double.parseDouble(s2);
                t1.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==b16){
            t1.setText("");
        }

    }
}