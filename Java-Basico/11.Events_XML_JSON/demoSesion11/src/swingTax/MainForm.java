package swingTax;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {

    private JTextField finalPriceField;
    private JTextField taxField;
    private JTextField priceField;
    private JLabel priceLabel;
    private JLabel totalPriceLabel;
    private JLabel taxLabel1;
    private JButton calculatePrice;
    private JPanel taxPane;

    public MainForm() {
        calculatePrice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try  {
                    double tax = Double.parseDouble(taxField.getText());
                    double price = Double.parseDouble(priceField.getText());

                    double totalPrice = price * ( 1 + tax / 100);

                    finalPriceField.setText(String.valueOf(totalPrice));

                } catch (NumberFormatException nfe) {
                    taxField.setText("");
                    priceField.setText("");
                    System.out.println("Error: " + nfe.getMessage());
                }
            }
        });
    }

    private static void createUIComponents() {
        // TODO: place custom component creation code here
        JFrame frame = new JFrame("TaxPane");
        frame.setContentPane(new MainForm().taxPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        createUIComponents();
        new MainForm();
    }
}
