package pekan7_2511533024;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.util.*;

public class SortingProgram_2511533024 extends JFrame {

    private JTextField txtName_3024, txtNim_3024, txtProdi_3024;
    private JButton btnAdd_3024, btnDelete_3024, btnSort_3024;
    private JComboBox<String> cmbAlgo_3024;
    private JTable tableMahasiswa_3024;
    private DefaultTableModel tableModel_3024;
    private JTextArea taVisualisasi_3024;
    private ArrayList<Mahasiswa_2511533024> dataList_3024;

    public SortingProgram_2511533024() {
        dataList_3024 = new ArrayList<>();
        initComponents_3024();
        loadDefaultData_3024();
        refreshTable_3024();
    }

    private void initComponents_3024() {
        setTitle("Sorting Mahasiswa - 2511533024");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelInput_3024 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput_3024.setBorder(BorderFactory.createTitledBorder("Input Data Mahasiswa"));

        panelInput_3024.add(new JLabel("Nama:"));
        txtName_3024 = new JTextField();
        panelInput_3024.add(txtName_3024);

        panelInput_3024.add(new JLabel("NIM:"));
        txtNim_3024 = new JTextField();
        panelInput_3024.add(txtNim_3024);

        panelInput_3024.add(new JLabel("Program Studi:"));
        txtProdi_3024 = new JTextField();
        panelInput_3024.add(txtProdi_3024);

        panelInput_3024.add(new JLabel(""));
        btnAdd_3024 = new JButton("Tambah");
        panelInput_3024.add(btnAdd_3024);

        JPanel panelSort_3024 = new JPanel(new FlowLayout());
        panelSort_3024.setBorder(BorderFactory.createTitledBorder("Pengurutan"));

        panelSort_3024.add(new JLabel("Pilih Algoritma:"));
        String[] algo_3024 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        cmbAlgo_3024 = new JComboBox<>(algo_3024);
        panelSort_3024.add(cmbAlgo_3024);

        btnSort_3024 = new JButton("Mulai Sorting");
        btnDelete_3024 = new JButton("Hapus Terpilih");

        panelSort_3024.add(btnSort_3024);
        panelSort_3024.add(btnDelete_3024);

        tableModel_3024 = new DefaultTableModel(new String[]{"Nama", "NIM", "Program Studi"}, 0);
        tableMahasiswa_3024 = new JTable(tableModel_3024);

        JScrollPane scrollTable_3024 = new JScrollPane(tableMahasiswa_3024);
        scrollTable_3024.setBorder(BorderFactory.createTitledBorder("Daftar Mahasiswa"));

        taVisualisasi_3024 = new JTextArea();
        taVisualisasi_3024.setEditable(false);
        taVisualisasi_3024.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollVisual_3024 = new JScrollPane(taVisualisasi_3024);
        scrollVisual_3024.setBorder(BorderFactory.createTitledBorder("Proses Sorting (Langkah-langkah)"));

        JPanel panelTop_3024 = new JPanel(new BorderLayout());
        panelTop_3024.add(panelInput_3024, BorderLayout.NORTH);
        panelTop_3024.add(panelSort_3024, BorderLayout.SOUTH);

        JSplitPane splitPane_3024 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, scrollTable_3024, scrollVisual_3024);
        splitPane_3024.setResizeWeight(0.5);

        add(panelTop_3024, BorderLayout.NORTH);
        add(splitPane_3024, BorderLayout.CENTER);

        btnAdd_3024.addActionListener(e -> btnAddActionPerformed_3024());
        btnDelete_3024.addActionListener(e -> btnDeleteActionPerformed_3024());
        btnSort_3024.addActionListener(e -> btnSortActionPerformed_3024());

        setSize(900, 600);
        setLocationRelativeTo(null);
    }

    private void loadDefaultData_3024() {
        dataList_3024.add(new Mahasiswa_2511533024("Budi", "001", "Informatika"));
        dataList_3024.add(new Mahasiswa_2511533024("rizky", "002", "Sistem Informasi"));
        dataList_3024.add(new Mahasiswa_2511533024("Maya", "003", "Ilmu Komputer"));
        dataList_3024.add(new Mahasiswa_2511533024("andi", "004", "Teknik Elektro"));
        dataList_3024.add(new Mahasiswa_2511533024("Citra", "005", "Manajemen Informatika"));
    }

    private void refreshTable_3024() {
        tableModel_3024.setRowCount(0);
        for (Mahasiswa_2511533024 m_3024 : dataList_3024) {
            tableModel_3024.addRow(new Object[]{
                    m_3024.getName_3024(),
                    m_3024.getNim_3024(),
                    m_3024.getProdi_3024()
            });
        }
    }

    private void btnAddActionPerformed_3024() {
        String name_3024 = txtName_3024.getText().trim();
        String nim_3024 = txtNim_3024.getText().trim();
        String prodi_3024 = txtProdi_3024.getText().trim();

        if (name_3024.isEmpty() || nim_3024.isEmpty() || prodi_3024.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        dataList_3024.add(new Mahasiswa_2511533024(name_3024, nim_3024, prodi_3024));
        refreshTable_3024();

        txtName_3024.setText("");
        txtNim_3024.setText("");
        txtProdi_3024.setText("");
        taVisualisasi_3024.setText("");
    }

    private void btnDeleteActionPerformed_3024() {
        int selectedRow_3024 = tableMahasiswa_3024.getSelectedRow();
        if (selectedRow_3024 == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang akan dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dataList_3024.remove(selectedRow_3024);
        refreshTable_3024();
        taVisualisasi_3024.setText("");
    }

    private void btnSortActionPerformed_3024() {
        if (dataList_3024.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tidak ada data untuk diurutkan!", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String algo_3024 = (String) cmbAlgo_3024.getSelectedItem();
        ArrayList<String> steps_3024 = new ArrayList<>();

        ArrayList<Mahasiswa_2511533024> workingList_3024 = new ArrayList<>(dataList_3024);

        steps_3024.add("Data Awal : " + formatList_3024(workingList_3024));
        steps_3024.add("");

        if ("Insertion Sort".equals(algo_3024)) {
            steps_3024.add("=== INSERTION SORT ===");
            insertionSort_3024(workingList_3024, steps_3024);
        } else if ("Selection Sort".equals(algo_3024)) {
            steps_3024.add("=== SELECTION SORT ===");
            selectionSort_3024(workingList_3024, steps_3024);
        } else if ("Bubble Sort".equals(algo_3024)) {
            steps_3024.add("=== BUBBLE SORT ===");
            bubbleSort_3024(workingList_3024, steps_3024);
        }

        steps_3024.add("");
        steps_3024.add("Hasil Akhir : " + formatList_3024(workingList_3024));

        taVisualisasi_3024.setText(String.join("\n", steps_3024));

        dataList_3024.clear();
        dataList_3024.addAll(workingList_3024);
        refreshTable_3024();
    }

    private void insertionSort_3024(ArrayList<Mahasiswa_2511533024> list_3024, ArrayList<String> steps_3024) {
        int n_3024 = list_3024.size();

        for (int i_3024 = 1; i_3024 < n_3024; i_3024++) {
            Mahasiswa_2511533024 key_3024 = list_3024.get(i_3024);
            int j_3024 = i_3024 - 1;

            steps_3024.add("Key = " + key_3024.toString());

            while (j_3024 >= 0 &&
                    key_3024.getName_3024().compareToIgnoreCase(list_3024.get(j_3024).getName_3024()) < 0) {
                list_3024.set(j_3024 + 1, list_3024.get(j_3024));
                j_3024--;
            }

            list_3024.set(j_3024 + 1, key_3024);
            steps_3024.add("Langkah " + i_3024 + " : " + formatList_3024(list_3024));
            steps_3024.add("");
        }
    }

    private void selectionSort_3024(ArrayList<Mahasiswa_2511533024> list_3024, ArrayList<String> steps_3024) {
        int n_3024 = list_3024.size();

        for (int i_3024 = 0; i_3024 < n_3024 - 1; i_3024++) {
            int minIdx_3024 = i_3024;

            for (int j_3024 = i_3024 + 1; j_3024 < n_3024; j_3024++) {
                if (list_3024.get(j_3024).getName_3024()
                        .compareToIgnoreCase(list_3024.get(minIdx_3024).getName_3024()) < 0) {
                    minIdx_3024 = j_3024;
                }
            }

            if (minIdx_3024 != i_3024) {
                Collections.swap(list_3024, i_3024, minIdx_3024);
                steps_3024.add("Swap index " + i_3024 + " dan " + minIdx_3024);
            } else {
                steps_3024.add("Tidak ada swap pada pass ini");
            }

            steps_3024.add("Pass " + (i_3024 + 1) + " : " + formatList_3024(list_3024));
            steps_3024.add("");
        }
    }

    private void bubbleSort_3024(ArrayList<Mahasiswa_2511533024> list_3024, ArrayList<String> steps_3024) {
        int n_3024 = list_3024.size();

        for (int i_3024 = 0; i_3024 < n_3024 - 1; i_3024++) {
            boolean swapped_3024 = false;

            for (int j_3024 = 0; j_3024 < n_3024 - i_3024 - 1; j_3024++) {
                if (list_3024.get(j_3024).getName_3024()
                        .compareToIgnoreCase(list_3024.get(j_3024 + 1).getName_3024()) > 0) {

                    Collections.swap(list_3024, j_3024, j_3024 + 1);
                    swapped_3024 = true;

                    steps_3024.add("Swap: " + list_3024.get(j_3024).toString()
                            + " <-> " + list_3024.get(j_3024 + 1).toString());
                }
            }

            steps_3024.add("Pass " + (i_3024 + 1) + " : " + formatList_3024(list_3024));
            steps_3024.add("");

            if (!swapped_3024) {
                steps_3024.add("Array sudah terurut, bubble sort berhenti lebih cepat.");
                break;
            }
        }
    }

    private String formatList_3024(ArrayList<Mahasiswa_2511533024> list_3024) {
        StringBuilder sb_3024 = new StringBuilder("[");
        for (int i_3024 = 0; i_3024 < list_3024.size(); i_3024++) {
            sb_3024.append(list_3024.get(i_3024).toString());
            if (i_3024 < list_3024.size() - 1) sb_3024.append(", ");
        }
        sb_3024.append("]");
        return sb_3024.toString();
    }

    public static void main(String[] args_3024) {
        SwingUtilities.invokeLater(() -> new SortingProgram_2511533024().setVisible(true));
    }
}