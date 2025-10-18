package AplikasiHitungDiskon;


import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class AplikasiDiskon extends javax.swing.JFrame {

    public AplikasiDiskon() {
        initComponents();
        comboDiskon.addItem("0");
        comboDiskon.addItem("5");
        comboDiskon.addItem("10");
        comboDiskon.addItem("15");
        comboDiskon.addItem("20");
        comboDiskon.addItem("25");

        sliderDiskon.addChangeListener(e -> {
            int val = sliderDiskon.getValue();
            comboDiskon.setSelectedItem(String.valueOf(val));
        });

        comboDiskon.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                int val = Integer.parseInt(e.getItem().toString());
                sliderDiskon.setValue(val);
            }
        });
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRiwayat = new javax.swing.JTextArea();
        txtHarga = new javax.swing.JTextField();
        txtPajak = new javax.swing.JTextField();
        txtKupon = new javax.swing.JTextField();
        comboDiskon = new javax.swing.JComboBox<>();
        sliderDiskon = new javax.swing.JSlider();
        btnHitung = new javax.swing.JButton();
        txtHasil = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perhitungan Diskon");

        jPanel1.setBackground(new java.awt.Color(173, 216, 230));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16));
        jLabel1.setText("Aplikasi Perhitungan Diskon");

        jLabel2.setText("Harga Barang");
        jLabel3.setText("Pajak (%)");
        jLabel4.setText("Diskon (%)");
        jLabel5.setText("Kode Kupon (opsional)");
        jLabel6.setText("Hasil Akhir");

        txtRiwayat.setColumns(20);
        txtRiwayat.setRows(5);
        txtRiwayat.setEditable(false);
        jScrollPane1.setViewportView(txtRiwayat);

        sliderDiskon.setMaximum(50);
        sliderDiskon.setMajorTickSpacing(10);
        sliderDiskon.setPaintTicks(true);
        sliderDiskon.setPaintLabels(true);

        btnHitung.setText("Hitung");

        btnHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                hitungDiskon();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHarga)
                                    .addComponent(txtPajak)
                                    .addComponent(comboDiskon, 0, 120, Short.MAX_VALUE)
                                    .addComponent(txtKupon)
                                    .addComponent(txtHasil))
                                .addGap(18, 18, 18)
                                .addComponent(btnHitung))
                            .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20)
                .addComponent(jLabel1)
                .addGap(20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(sliderDiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKupon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHitung))
                .addGap(15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        pack();
        setLocationRelativeTo(null);
    }

    private void hitungDiskon() {
        try {
            double harga = Double.parseDouble(txtHarga.getText());
            double pajak = Double.parseDouble(txtPajak.getText());
            double diskonPersen = Double.parseDouble(comboDiskon.getSelectedItem().toString());
            double diskonKupon = 0;

            String kode = txtKupon.getText().trim();
            if (kode.equalsIgnoreCase("HEMAT10")) {
                diskonKupon = 10;
            } else if (kode.equalsIgnoreCase("PROMO5")) {
                diskonKupon = 5;
            }

            double totalDiskon = diskonPersen + diskonKupon;
            double nilaiDiskon = harga * (totalDiskon / 100);
            double hargaSetelahDiskon = harga - nilaiDiskon;
            double nilaiPajak = hargaSetelahDiskon * (pajak / 100);
            double totalHarga = hargaSetelahDiskon + nilaiPajak;

            DecimalFormat df = new DecimalFormat("#,###.00");
            txtHasil.setText("Rp " + df.format(totalHarga));

            String riwayat = String.format(
                "Harga: Rp %.2f | Diskon: %.0f%% | Pajak: %.0f%% | Kupon: %.0f%% | Total: Rp %.2f\n",
                harga, diskonPersen, pajak, diskonKupon, totalHarga
            );
            txtRiwayat.append(riwayat);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Masukkan angka dengan benar!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton btnHitung;
    private javax.swing.JComboBox<String> comboDiskon;
    private javax.swing.JTextField txtHarga, txtPajak, txtKupon, txtHasil;
    private javax.swing.JTextArea txtRiwayat;
    private javax.swing.JSlider sliderDiskon;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AplikasiDiskon().setVisible(true));
    }
}
