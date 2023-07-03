package View;

import Process.DataValidator;
import Process.Evaluate;
import Process.EvaluateDao;
import Process.MessageDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class NotEvaluateAPL extends javax.swing.JDialog {

    /**
     * Creates new form NotEvaluateAPL
     */
    private int APPLICANTNO, INTERVIEWSCHEDULENO;

    /**
     * Creates new form NotEvaluateAPL
     */
    public NotEvaluateAPL(java.awt.Frame parent, boolean modal, int maApp, int maITS) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

        APPLICANTNO = maApp;
        INTERVIEWSCHEDULENO = maITS;

        lblINTERVIEWSCHEDULE.setText(String.valueOf(INTERVIEWSCHEDULENO));
        lblAPPLICANTNO.setText(String.valueOf(APPLICANTNO));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblINTERVIEWSCHEDULE = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAPPLICANTNO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMARK = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaCOMMENT = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("ĐÁNH GIÁ ỨNG VIÊN");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã lịch:");

        lblINTERVIEWSCHEDULE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblINTERVIEWSCHEDULE.setText("jLabel6");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã ứng viên:");

        lblAPPLICANTNO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAPPLICANTNO.setText("jLabel5");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Điểm đánh giá:");

        txtMARK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nhận xét:");

        txaCOMMENT.setColumns(20);
        txaCOMMENT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txaCOMMENT.setRows(5);
        jScrollPane1.setViewportView(txaCOMMENT);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/icons8_plus_16px.png"))); // NOI18N
        jButton1.setText("Thêm đánh giá");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                            .addComponent(txtMARK)
                            .addComponent(lblAPPLICANTNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblINTERVIEWSCHEDULE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(106, 106, 106))))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblINTERVIEWSCHEDULE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblAPPLICANTNO))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMARK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMARK, sb, "Điểm đánh giá không được để trống!");

        if (sb.length() > 0) {
            MessageDialog.showErrorDialog(this, sb.toString(), "Lỗi");
            return;
        }

        if (txtMARK.getText().length() > 0 && !txtMARK.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Điểm đánh giá chỉ có thể là số!");
            return;
        }

        try {
            EvaluateDao dao = new EvaluateDao();
            int mark_apl = Integer.parseInt(txtMARK.getText());
            String comment_apl = txaCOMMENT.getText();
            Evaluate ev = new Evaluate(mark_apl, comment_apl);

            if (dao.insertEvaluateAPL(APPLICANTNO, INTERVIEWSCHEDULENO, ev)) {
                MessageDialog.showMessageDialog(this, "Thêm thành công!", "Thông báo");
                this.dispose();
            } else {
                MessageDialog.showConfirmDialog(this, "Thêm thất bại!", "Thông báo");
            }
        } catch (Exception e) {
            MessageDialog.showErrorDialog(this, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAPPLICANTNO;
    private javax.swing.JLabel lblINTERVIEWSCHEDULE;
    private javax.swing.JTextArea txaCOMMENT;
    private javax.swing.JTextField txtMARK;
    // End of variables declaration//GEN-END:variables
}
