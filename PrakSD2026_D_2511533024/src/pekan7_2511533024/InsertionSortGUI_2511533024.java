package pekan7_2511533024;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class InsertionSortGUI_2511533024 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_3024;
    private JLabel[] labelArray_3024;
    private JButton stepButton_3024, resetButton_3024, setButton_3024;
    private JTextField inputField_3024;
    private JPanel panelArray_3024;
    private JTextArea stepArea_3024;

    private int i = 1, j;
    private boolean sorting_3024 = false;
    private int stepCount_3024 = 1;

    public InsertionSortGUI_2511533024() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputField_3024 = new JTextField(30);
        setButton_3024 = new JButton("Set Array");
        inputPanel.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel.add(inputField_3024);
        inputPanel.add(setButton_3024);

        // Panel array visual
        panelArray_3024 = new JPanel();
        panelArray_3024.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel = new JPanel();
        stepButton_3024 = new JButton("Langkah Selanjutnya");
        resetButton_3024 = new JButton("Reset");
        stepButton_3024.setEnabled(false);
        controlPanel.add(stepButton_3024);
        controlPanel.add(resetButton_3024);

        // Area teks untuk log langkah-langkah
        stepArea_3024 = new JTextArea(8, 60);
        stepArea_3024.setEditable(false);
        stepArea_3024.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(stepArea_3024);

        // Tambahkan panel ke frame
        add(inputPanel, BorderLayout.NORTH);
        add(panelArray_3024, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.EAST);

        // Event Set Array
        setButton_3024.addActionListener(e -> setArrayFromInput_3024());

        // Event Langkah Selanjutnya
        stepButton_3024.addActionListener(e -> performStep_3024());

        // Event Reset
        resetButton_3024.addActionListener(e -> reset_3024());
    }

    private void setArrayFromInput_3024() {
        String text = inputField_3024.getText().trim();
        if (text.isEmpty())
            return;

        String[] parts = text.split(",");
        array_3024 = new int[parts.length];

        try {
            for (int k = 0; k < parts.length; k++) {
                array_3024[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan dengan koma!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        i = 1;
        stepCount_3024 = 1;
        sorting_3024 = true;
        stepButton_3024.setEnabled(true);
        stepArea_3024.setText("");

        panelArray_3024.removeAll();
        labelArray_3024 = new JLabel[array_3024.length];

        for (int k = 0; k < array_3024.length; k++) {
            labelArray_3024[k] = new JLabel(String.valueOf(array_3024[k]));
            labelArray_3024[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_3024[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_3024[k].setPreferredSize(new Dimension(50, 50));
            labelArray_3024[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_3024.add(labelArray_3024[k]);
        }

        panelArray_3024.revalidate();
        panelArray_3024.repaint();
    }

    private void performStep_3024() {
        if (i < array_3024.length && sorting_3024) {
            int key = array_3024[i];
            j = i - 1;

            StringBuilder stepLog = new StringBuilder();
            stepLog.append("Langkah ").append(stepCount_3024)
                    .append(": Memasukkan ").append(key).append("\n");

            while (j >= 0 && array_3024[j] > key) {
                array_3024[j + 1] = array_3024[j];
                j--;
            }

            array_3024[j + 1] = key;

            updateLabels_3024();
            stepLog.append("Hasil: ").append(arrayToString_3024(array_3024)).append("\n\n");
            stepArea_3024.append(stepLog.toString());

            i++;
            stepCount_3024++;

            if (i == array_3024.length) {
                sorting_3024 = false;
                stepButton_3024.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Sorting selesai!");
            }
        }
    }

    private void updateLabels_3024() {
        for (int k = 0; k < array_3024.length; k++) {
            labelArray_3024[k].setText(String.valueOf(array_3024[k]));
        }
    }

    private void reset_3024() {
        inputField_3024.setText("");
        panelArray_3024.removeAll();
        panelArray_3024.revalidate();
        panelArray_3024.repaint();
        stepArea_3024.setText("");
        stepButton_3024.setEnabled(false);
        sorting_3024 = false;
        i = 1;
        stepCount_3024 = 1;
    }

    private String arrayToString_3024(int[] arr_3024) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr_3024.length; k++) {
            sb.append(arr_3024[k]);
            if (k < arr_3024.length - 1)
                sb.append(", ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InsertionSortGUI_2511533024 gui = new InsertionSortGUI_2511533024();
            gui.setVisible(true);
        });
    }
}