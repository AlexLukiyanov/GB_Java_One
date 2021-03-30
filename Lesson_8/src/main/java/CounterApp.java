import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {

    private int value;
    private int saveValue;
    public boolean checkPressing;

    public CounterApp(int initialValue) {

        //Создание окна
        setBounds(500, 500, 300, 300);
        setTitle("Counter Applications");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Определение шрифта
        Font font = new Font("Times New Roman", Font.BOLD, 26);

        //Создание надписи
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        //Создание кнопок
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        //Для задания 2
        JButton dischargeButton = new JButton("Discharge");
        dischargeButton.setFont(font);
        add(dischargeButton, BorderLayout.SOUTH);

        //Для задания 3
        JButton saveChangeButton = new JButton("Save");
        saveChangeButton.setFont(font);
        add(saveChangeButton, BorderLayout.NORTH);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        //Для задания 2
        dischargeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        //Для задания 3
        saveChangeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (checkPressing == false) {
                    saveValue = value;
                    checkPressing = true;
                } else {
                    value = saveValue;
                    counterValueView.setText(String.valueOf(saveValue));
                    checkPressing = false;
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}