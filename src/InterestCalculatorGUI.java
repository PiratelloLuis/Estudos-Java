import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterestCalculatorGUI {

    public static void main(String[] args) {

        // Janela
        JFrame frame = new JFrame("Compound Interest Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2, 5, 5));

        // Componentes
        JLabel principalLabel = new JLabel("Principal Amount:");
        JTextField principalField = new JTextField();

        JLabel rateLabel = new JLabel("Interest Rate:");
        JTextField rateField = new JTextField();

        JLabel timesLabel = new JLabel("Times Compounded / Year:");
        JTextField timesField = new JTextField();

        JLabel yearsLabel = new JLabel("Years:");
        JTextField yearsField = new JTextField();

        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ");

        // Ação do botão
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText()) / 100;
                    int timesYear = Integer.parseInt(timesField.getText());
                    int years = Integer.parseInt(yearsField.getText());

                    double result = principal *
                            Math.pow(1 + rate / timesYear, timesYear * years);

                    resultLabel.setText(
                            String.format("Result: R$ %,.2f", result)
                    );

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(
                            frame,
                            "Please enter valid numbers!",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });

        // Adicionando componentes
        frame.add(principalLabel);
        frame.add(principalField);

        frame.add(rateLabel);
        frame.add(rateField);

        frame.add(timesLabel);
        frame.add(timesField);

        frame.add(yearsLabel);
        frame.add(yearsField);

        frame.add(calculateButton);
        frame.add(resultLabel);

        // Exibir janela
        frame.setVisible(true);
    }
}
