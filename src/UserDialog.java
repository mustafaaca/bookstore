
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author mmustafaaca
 */
public class UserDialog extends javax.swing.JDialog {
    DefaultTableModel model;
    Operations operations = new Operations();
    
    public UserDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) bookTable.getModel();
        showBooks();
    }

    public final void showBooks()
    {
        model.setRowCount(0);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList = operations.bookInformations();
        if(bookList != null)
        {
            for(Book wander : bookList)
            {
                Object[] toBeAdded = {wander.getId(), wander.getName(), wander.getAuthor(), wander.getPublisher(), wander.getType(), wander.getNumberOfPages(), wander.getPublishYear(), wander.getPrice()};
                model.addRow(toBeAdded);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dynamicSearchTextField = new javax.swing.JTextField();
        typerLabel = new javax.swing.JLabel();
        publishYearTextField = new javax.swing.JTextField();
        numberOfPagesLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        publishYearLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        bookNameTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        bookNameLabel = new javax.swing.JLabel();
        publisheriTextField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        typerTextField = new javax.swing.JTextField();
        publisheriLabel = new javax.swing.JLabel();
        numberOfPagesTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        createOrderButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        userMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(340, 110, 0, 0));

        dynamicSearchTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dynamicSearchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                dynamicSearchTextFieldMouseReleased(evt);
            }
        });
        dynamicSearchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dynamicSearchTextFieldKeyReleased(evt);
            }
        });

        typerLabel.setText("Type : ");

        publishYearTextField.setEnabled(false);

        numberOfPagesLabel.setText("Number of Pages : ");

        priceTextField.setEnabled(false);

        publishYearLabel.setText("Publish Year :");

        priceLabel.setText("Price : ");

        bookNameTextField.setEnabled(false);

        authorTextField.setEnabled(false);

        bookNameLabel.setText("Book Name :  ");

        publisheriTextField.setEnabled(false);

        authorLabel.setText("Author : ");

        typerTextField.setEnabled(false);
        typerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typerTextFieldActionPerformed(evt);
            }
        });

        publisheriLabel.setText("Publisher : ");

        numberOfPagesTextField.setEnabled(false);

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Author", "Publisher", "Type", "Number of Books", "Publish Year", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable);

        createOrderButton.setText("Create Order");
        createOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderButtonActionPerformed(evt);
            }
        });

        userMenu.setText("Welcome");
        jMenuBar1.add(userMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(publishYearLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(publisheriLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberOfPagesLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publisheriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publishYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(dynamicSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addComponent(createOrderButton)
                .addContainerGap(223, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(dynamicSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookNameLabel)
                        .addComponent(bookNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(authorLabel)
                        .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(publisheriLabel)
                        .addComponent(publisheriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(typerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typerLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberOfPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberOfPagesLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(publishYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(publishYearLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceLabel))
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGap(22, 22, 22)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dynamicSearchTextFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dynamicSearchTextFieldMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dynamicSearchTextFieldMouseReleased

    public void dynamicSearch(String search)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        bookTable.setRowSorter(tr);
        tr.setRowFilter(javax.swing.RowFilter.regexFilter(search));
    }
    
    private void dynamicSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dynamicSearchTextFieldKeyReleased
        String search = dynamicSearchTextField.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_dynamicSearchTextFieldKeyReleased

    private void typerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typerTextFieldActionPerformed

    //Here we get values from selected row on book table
    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int selectedRow = bookTable.getSelectedRow();
        bookNameTextField.setText(model.getValueAt(selectedRow, 1).toString());
        authorTextField.setText(model.getValueAt(selectedRow, 2).toString());
        publisheriTextField.setText(model.getValueAt(selectedRow, 3).toString());
        typerTextField.setText(model.getValueAt(selectedRow, 4).toString());
        numberOfPagesTextField.setText(model.getValueAt(selectedRow, 5).toString());
        publishYearTextField.setText(model.getValueAt(selectedRow, 6).toString());
        priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
    }//GEN-LAST:event_bookTableMouseClicked

    //We get values from fields to create order
    private void createOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderButtonActionPerformed
        String name = bookNameTextField.getText();
        String author = authorTextField.getText();
        String publisher = publisheriTextField.getText();
        String type = typerTextField.getText();
        String nummberOfPages = numberOfPagesTextField.getText();
        String publishYear = publishYearTextField.getText();
        String price = priceTextField.getText();
        operations.createOrder(name, author, publisher, type, nummberOfPages, publishYear, price);
        
    }//GEN-LAST:event_createOrderButtonActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UserDialog dialog = new UserDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel bookNameLabel;
    private javax.swing.JTextField bookNameTextField;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton createOrderButton;
    private javax.swing.JTextField dynamicSearchTextField;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numberOfPagesLabel;
    private javax.swing.JTextField numberOfPagesTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JLabel publishYearLabel;
    private javax.swing.JTextField publishYearTextField;
    private javax.swing.JLabel publisheriLabel;
    private javax.swing.JTextField publisheriTextField;
    private javax.swing.JLabel typerLabel;
    private javax.swing.JTextField typerTextField;
    private javax.swing.JMenu userMenu;
    // End of variables declaration//GEN-END:variables
}
