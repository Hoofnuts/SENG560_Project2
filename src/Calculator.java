import arithmetic.Arithmetic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculator {

    private JPanel Calculator;
    private JTextField text;
    private JButton clear;
    private JButton subtract;
    private JButton mutiply;
    private JButton divide;
    private JButton equals;
    private JButton backspace;
    private JButton seven;
    private JButton four;
    private JButton one;
    private JButton doubleZero;
    private JButton add;
    private JButton eight;
    private JButton five;
    private JButton two;
    private JButton zero;
    private JButton negate;
    private JButton nine;
    private JButton six;
    private JButton three;
    private JButton decimal;
    private JButton percent;

    private Operation oper;
    private float a, b, answer;
    private Arithmetic math = new Arithmetic();


    public Calculator() {
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + nine.getText());
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + eight.getText());
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + seven.getText());
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + six.getText());
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + five.getText());
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + four.getText());
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + three.getText());
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + two.getText());
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + one.getText());
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(text.getText() + zero.getText());
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("");
            }
        });
        negate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(text.getText().contains(".")){
                    text.setText(String.valueOf(Float.parseFloat(text.getText()) * -1));
                } else{
                    text.setText(String.valueOf(Integer.parseInt(text.getText()) * -1));
                }
            }
        });
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text.getText().contains(".")){
                    text.setText(text.getText() + decimal.getText());
                }
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(text.getText());
                oper = Operation.ADD;
                text.setText("");//Clear display
            }
        });
        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(text.getText());
                oper = Operation.SUBTRACT;
                text.setText("");//Clear display
            }
        });
        mutiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(text.getText());
                oper = Operation.MUTIPLY;
                text.setText("");//Clear display
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Float.parseFloat(text.getText());
                oper = Operation.DIVIDE;
                text.setText("");//Clear display
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!text.getText().isEmpty()){
                    StringBuilder str = new StringBuilder(text.getText());
                    str.deleteCharAt(text.getText().length()-1);
                    text.setText(String.valueOf(str));
                }
            }
        });
        percent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(String.valueOf(Float.parseFloat(text.getText()) / 100));
           }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Float.parseFloat(text.getText());
                switch(oper){
                    case ADD:
                        answer = math.add(a,b);
                        break;
                    case SUBTRACT:
                        answer = math.subtract(a,b);
                        break;
                    case MUTIPLY:
                        answer = math.multiply(a,b);
                        break;
                    case DIVIDE:
                        answer = math.divide(a,b);
                        break;
                }

                text.setText(String.valueOf(answer));//Clear display
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
