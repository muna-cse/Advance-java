import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener
{
    JButton addButton,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,BACKSPACE,CE,C,MC,div,sqrt,MR,mul,per,MS,sub,prop,M,pm,dot,eq;
    JTextField mainTextField, memoryTextField;
    double result=0,memory=0,n1=0;


    int first=1;


    double num;


    int opt=2;

    int oper1=0,oper2=0;

    Calculator()
    {
        setTitle("Calculator");
        setSize(300,300);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    void initComponents()
    {
        mainTextField = new JTextField(32);
        mainTextField.setText("0");
        add(mainTextField,BorderLayout.NORTH);
        mainTextField.setHorizontalAlignment(JTextField.RIGHT);
        JPanel panel7 = new JPanel();


        JPanel panel1 = new JPanel();

        memoryTextField = new JTextField(5);
        memoryTextField.setText(" ");
        panel1.add(memoryTextField);
        MC = new JButton("MC");
        MC.setForeground(Color.BLACK);
        panel1.add(MC);
        MR = new JButton("MR");
        MR.setForeground(Color.BLACK);
        panel1.add(MR);
        M = new JButton("M+");
        M.setForeground(Color.BLACK);
        panel1.add(M);
        MS = new JButton("MS");
        MS.setForeground(Color.BLACK);
        panel1.add(MS);

        panel7.add(panel1);


        JPanel panel2 = new JPanel();

        CE= new JButton("CE");
        CE.setForeground(Color.BLACK);
        panel2.add(CE);
        C = new JButton("C");
        panel2.add(C);
        C.setForeground(Color.BLACK);
        BACKSPACE = new JButton("BACKSPACE");
        BACKSPACE.setForeground(Color.BLACK);
        panel2.add(BACKSPACE);
        sqrt = new JButton("sqrt");
        sqrt.setForeground(Color.BLUE);
        panel2.add(sqrt);

        panel7.add(panel2);


        JPanel panel3 = new JPanel();

        b7 = new JButton("7");
        b7.setForeground(Color.BLUE);
        panel3.add(b7);
        b8= new JButton("8");
        b8.setForeground(Color.BLUE);
        panel3.add(b8);
        b9 = new JButton("9");
        b9.setForeground(Color.BLUE);
        panel3.add(b9);
        div = new JButton("/");
        div.setForeground(Color.BLACK);
        panel3.add(div);
        per = new JButton("%");
        per.setForeground(Color.BLUE);
        panel3.add(per);

        panel7.add(panel3);


        JPanel panel4 = new JPanel();

        b4= new JButton("4");
        b4.setForeground(Color.BLUE);
        panel4.add(b4);
        b5 = new JButton("5");
        b5.setForeground(Color.BLUE);
        panel4.add(b5);
        b6= new JButton("6");
        b6.setForeground(Color.BLUE);
        panel4.add(b6);
        mul = new JButton("*");
        mul.setForeground(Color.BLACK);
        panel4.add(mul);
        prop = new JButton("1/x");
        prop.setForeground(Color.BLUE);
        panel4.add(prop);

        panel7.add(panel4);

        JPanel panel5 = new JPanel();

        b1 = new JButton("1");
        b1.setForeground(Color.BLUE);
        panel5.add(b1);
        b2= new JButton("2");
        b2.setForeground(Color.BLUE);
        panel5.add(b2);
        b3 = new JButton("3");
        b3.setForeground(Color.BLUE);
        panel5.add(b3);
        sub = new JButton("-");
        sub.setForeground(Color.BLACK);
        panel5.add(sub);
        pm= new JButton("+/-");
        pm.setForeground(Color.BLUE);
        panel5.add(pm);

        panel7.add(panel5);

        JPanel panel6 = new JPanel();

        b0= new JButton("0");
        b0.setForeground(Color.BLUE);
        panel6.add(b0);
        dot= new JButton(".");
        dot.setForeground(Color.BLUE);
        panel6.add(dot);
        addButton = new JButton("+");
        addButton.setForeground(Color.BLACK);
        panel6.add(addButton);
        eq = new JButton("=");
        eq.setForeground(Color.BLACK);
        panel6.add(eq);

        panel7.add(panel6);

        panel1.setBackground(Color.blue);
        panel7.setBackground(Color.LIGHT_GRAY);

        add(panel7,BorderLayout.CENTER);


        addButton.addActionListener(this);
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
        BACKSPACE.addActionListener(this);
        CE.addActionListener(this);
        C.addActionListener(this);
        MC.addActionListener(this);
        div.addActionListener(this);
        sqrt.addActionListener(this);
        MR.addActionListener(this);
        mul.addActionListener(this);
        per.addActionListener(this);
        MS.addActionListener(this);
        sub.addActionListener(this);
        prop.addActionListener(this);
        M.addActionListener(this);
        pm.addActionListener(this);
        dot.addActionListener(this);
        eq.addActionListener(this);
        per.addActionListener(this);
    }


    public void actionPerformed(ActionEvent evt)
    {
        String str;


        if(evt.getSource()== addButton)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(mainTextField.getText());
                oper1=1;
            }
            else
            {
                n1=Double.parseDouble(mainTextField.getText());
                oper2=1;
            }

            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }


        if(evt.getSource()==mul)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(mainTextField.getText());
                oper1=4;
            }
            else
            {
                n1=Double.parseDouble(mainTextField.getText());
                oper2=4;
            }


            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }


        if(evt.getSource()==div)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(mainTextField.getText());
                oper1=3;
            }
            else
            {
                n1=Double.parseDouble(mainTextField.getText());
                oper2=3;
            }


            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }
        }

        else if(evt.getSource()==sub)
        {
            if(first==1)
            {
                result=num=Double.parseDouble(mainTextField.getText());
                oper1=2;
            }
            else
            {
                n1=Double.parseDouble(mainTextField.getText());
                oper2=2;
            }

            switch(oper1)
            {
                case 1:add1();
                    break;
                case 2:sub();
                    break;
                case 3:div();
                    break;
                case 4:mul();
                    break;
            }

        }

        else if(evt.getSource()==eq)
        {
            double n1=Double.parseDouble(mainTextField.getText());
            if(oper1==1)
                result=result+n1;
            else if(oper1==2)
                result=result-n1;
            else if(oper1==3)
                result=result/n1;
            else if(oper1==4)
                result=result*n1;
            else
                result=Double.parseDouble(mainTextField.getText());
            num=result;
            str=String.valueOf(result);
            mainTextField.setText(str);
        }

        else if(evt.getSource()==MS)
        {
            memory=Double.parseDouble(mainTextField.getText());
            str=String.valueOf("M");
            memoryTextField.setText(str);

        }

        else if(evt.getSource()==M)
        {
            memory=memory+Double.parseDouble(mainTextField.getText());
        }


        else if(evt.getSource()==MC)
        {
            memory=0;
            mainTextField.setText("0");
            memoryTextField.setText(" ");
        }

        else if(evt.getSource()==MR)
        {
            str=String.valueOf(memory);
            mainTextField.setText(str);
        }


        else if(evt.getSource()==pm)
        {
            double n1=Double.parseDouble(mainTextField.getText());
            n1=-n1;
            str=String.valueOf(n1);
            mainTextField.setText(str);
        }


        else if(evt.getSource()==b0)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+0;
            else
                str=String.valueOf(" ")+0;
            opt=1;
            mainTextField.setText(str);

        }


        else if(evt.getSource()==b1)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+1;
            else
                str=String.valueOf(" ")+1;
            opt=1;
            mainTextField.setText(str);

        }

        else if(evt.getSource()==b2)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+2;
            else
                str=String.valueOf(" ")+2;
            opt=1;
            mainTextField.setText(str);
        }

        else if(evt.getSource()==b3)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+3;
            else
                str=String.valueOf(" ")+3;
            opt=1;
            mainTextField.setText(str);
        }

        else if(evt.getSource()==b4)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+4;
            else
                str=String.valueOf(" ")+4;
            opt=1;
            mainTextField.setText(str);
        }


        else if(evt.getSource()==b5)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+5;
            else
                str=String.valueOf(" ")+5;
            opt=1;
            mainTextField.setText(str);
        }

        else if(evt.getSource()==b6)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+6;
            else
                str=String.valueOf(" ")+6;
            opt=1;
            mainTextField.setText(str);
        }


        else if(evt.getSource()==b7)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+7;
            else
                str=String.valueOf(" ")+7;
            opt=1;
            mainTextField.setText(str);
        }


        else if(evt.getSource()==b8)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+8;
            else
                str=String.valueOf(" ")+8;
            opt=1;
            mainTextField.setText(str);
        }


        else if(evt.getSource()==b9)
        {
            if(opt==1)
                str=String.valueOf(mainTextField.getText())+9;
            else
                str=String.valueOf(" ")+9;
            opt=1;
            mainTextField.setText(str);
        }


        else if(evt.getSource()==BACKSPACE)
        {
            int len;
            str= mainTextField.getText();
            len=str.length();
            if(len>=1)
                str=str.substring(0,len-1);
            mainTextField.setText(str);
        }


        else if(evt.getSource()==CE)
        {
            result=0;
            first=1;
            opt=2;
            str=String.valueOf('0');
            mainTextField.setText(str);

        }

        else if(evt.getSource()==C)
        {
            result=0;
            memory=0;
            first=1;
            opt=2;
            mainTextField.setText("0");
            memoryTextField.setText(" ");

        }


        else if(evt.getSource()==dot)
        {
            str=String.valueOf(mainTextField.getText())+".";
            mainTextField.setText(str);
        }


        else if(evt.getSource()==prop)
        {
            double n1=Double.parseDouble(mainTextField.getText());
            n1=1/n1;
            str=String.valueOf(n1);
            mainTextField.setText(str);
        }


        else if(evt.getSource()==sqrt)
        {
            double n1=Double.parseDouble(mainTextField.getText());
            n1=Math.sqrt(n1);
            str=String.valueOf(n1);
            mainTextField.setText(str);
        }


        else if(evt.getSource()==per)
        {
            double n1=Double.parseDouble(mainTextField.getText());
            n1=(n1*num)/100;
            str=String.valueOf(n1);
            mainTextField.setText(str);
        }

    }


    void add1()
    {
        if(first==0)
            result=num=result+n1;
        String str=String.valueOf(result);
        mainTextField.setText(str);
        opt=2;
        if(oper2!=0)
        {
            oper1=oper2;
            oper2=0;
        }
        first=0;
    }


    void sub()
    {
        if(first==0)
            result=num=result-n1;
        String str=String.valueOf(result);
        mainTextField.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }


    void div()
    {
        if(first==0)
        {
            if(n1==0)
                mainTextField.setText("Cannot divide by zero");
            else
                result=num=result/n1;
        }
        String str=String.valueOf(result);
        mainTextField.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }


    void mul()
    {
        if(first==0)
            result=num=result*n1;
        String str=String.valueOf(result);
        mainTextField.setText(str);
        opt=2;
        if(oper2!=0)
            oper1=oper2;
        first=0;
    }
    public static void main(String args[])
    {
        Calculator obj = new Calculator();
        obj.setVisible(true);
    }
}