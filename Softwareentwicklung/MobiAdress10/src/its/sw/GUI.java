package its.sw;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliver Schwahlen
 */
public class GUI extends javax.swing.JFrame {

    private final Person[] persListe = new Person[20];
    private int persCounter = 0;
    private final DefaultListModel daten = new DefaultListModel();

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        lstOverview.setModel(daten);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onlDetail = new javax.swing.JPanel();
        lblGebDatum = new javax.swing.JLabel();
        lblVorname = new javax.swing.JLabel();
        txfGebDatum = new javax.swing.JTextField();
        lblNachname = new javax.swing.JLabel();
        txfVorname = new javax.swing.JTextField();
        txfNachname = new javax.swing.JTextField();
        lblKlasse = new javax.swing.JLabel();
        btnUebernehmen = new javax.swing.JButton();
        txfKlasse = new javax.swing.JTextField();
        btnAnzeigen = new javax.swing.JButton();
        lblPLZ = new javax.swing.JLabel();
        txfPLZ = new javax.swing.JTextField();
        lblOrt = new javax.swing.JLabel();
        txfOrt = new javax.swing.JTextField();
        pnlOverview = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstOverview = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MobiAdress");
        getContentPane().setLayout(new java.awt.GridLayout(1, 2));

        onlDetail.setBorder(javax.swing.BorderFactory.createTitledBorder("Detail"));

        lblGebDatum.setText("Geb.Datum");

        lblVorname.setText("Vorname");

        lblNachname.setText("Nachname");

        lblKlasse.setText("Klasse");

        btnUebernehmen.setText("Daten übernehmen");
        btnUebernehmen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUebernehmenActionPerformed(evt);
            }
        });

        btnAnzeigen.setText("alle Daten anzeigen");
        btnAnzeigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnzeigenActionPerformed(evt);
            }
        });

        lblPLZ.setText("PLZ");

        lblOrt.setText("Ort");

        javax.swing.GroupLayout onlDetailLayout = new javax.swing.GroupLayout(onlDetail);
        onlDetail.setLayout(onlDetailLayout);
        onlDetailLayout.setHorizontalGroup(
            onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPLZ)
                    .addComponent(lblOrt)
                    .addGroup(onlDetailLayout.createSequentialGroup()
                        .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNachname)
                            .addComponent(lblKlasse)
                            .addComponent(lblGebDatum)
                            .addComponent(lblVorname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfVorname)
                            .addComponent(txfGebDatum)
                            .addComponent(txfPLZ, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfKlasse)
                            .addComponent(txfNachname)
                            .addComponent(txfOrt, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(btnUebernehmen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnzeigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        onlDetailLayout.setVerticalGroup(
            onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVorname)
                    .addComponent(txfVorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNachname)
                    .addComponent(txfNachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKlasse)
                    .addComponent(txfKlasse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPLZ)
                    .addComponent(txfPLZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrt)
                    .addComponent(txfOrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(onlDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGebDatum)
                    .addComponent(txfGebDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUebernehmen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnzeigen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(onlDetail);

        pnlOverview.setBorder(javax.swing.BorderFactory.createTitledBorder("Übersicht"));

        jScrollPane1.setViewportView(lstOverview);

        javax.swing.GroupLayout pnlOverviewLayout = new javax.swing.GroupLayout(pnlOverview);
        pnlOverview.setLayout(pnlOverviewLayout);
        pnlOverviewLayout.setHorizontalGroup(
            pnlOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlOverviewLayout.setVerticalGroup(
            pnlOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlOverviewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(pnlOverview);

        pack();
    }// </editor-fold>//GEN-END:initComponents

  private void btnUebernehmenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUebernehmenActionPerformed
        
      if (persCounter < 20) {

          persListe[persCounter] = new Person();
          persListe[persCounter].setVorname(txfVorname.getText());
          //persListe[persCounter].vorname = txfVorname.getText();
          persListe[persCounter].setNachname(txfNachname.getText());
          persListe[persCounter].setKlasse(txfKlasse.getText());
          persListe[persCounter].setPlz(Integer.parseInt(txfPLZ.getText()));
          persListe[persCounter].setOrt(txfOrt.getText());
          persCounter++;
      } else {
          JOptionPane.showMessageDialog(this, "Kein Speicher vorhanden!");
      }
}//GEN-LAST:event_btnUebernehmenActionPerformed

  private void btnAnzeigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnzeigenActionPerformed
      daten.clear();
      for (int i = 0; i < persCounter; i++) {
          daten.addElement(persListe[i].getNachname() + ", "
                  + persListe[i].getVorname() + ", "
                  + persListe[i].getKlasse() + ", "
                  + String.valueOf(persListe[i].getPlz()) + ", "
                  + persListe[i].getOrt());
      }
  }//GEN-LAST:event_btnAnzeigenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnzeigen;
    private javax.swing.JButton btnUebernehmen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGebDatum;
    private javax.swing.JLabel lblKlasse;
    private javax.swing.JLabel lblNachname;
    private javax.swing.JLabel lblOrt;
    private javax.swing.JLabel lblPLZ;
    private javax.swing.JLabel lblVorname;
    private javax.swing.JList lstOverview;
    private javax.swing.JPanel onlDetail;
    private javax.swing.JPanel pnlOverview;
    private javax.swing.JTextField txfGebDatum;
    private javax.swing.JTextField txfKlasse;
    private javax.swing.JTextField txfNachname;
    private javax.swing.JTextField txfOrt;
    private javax.swing.JTextField txfPLZ;
    private javax.swing.JTextField txfVorname;
    // End of variables declaration//GEN-END:variables
}
