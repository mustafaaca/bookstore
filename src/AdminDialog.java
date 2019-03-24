
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author mmustafaaca
 */

public class AdminDialog extends javax.swing.JDialog {
    //We created here table model
    DefaultTableModel model;
    //We created Operations object
    Operations operations = new Operations();
    
    public AdminDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //When AdminDialog start to run book table will fill
        model = (DefaultTableModel) bookTable.getModel();
        showBooks();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dynamicSearchTextField = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        publishYearTextField = new javax.swing.JTextField();
        numberOfPagesLabel = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        publishYearliLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        bookNameiTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        createOrderButton = new javax.swing.JButton();
        bookNameiLabel = new javax.swing.JLabel();
        publisheriTextField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        typerTextField = new javax.swing.JTextField();
        publisheriLabel = new javax.swing.JLabel();
        numberOfPagesTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        showOrderButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        updatebookButton = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();
        alertlabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        welcomeMenu = new javax.swing.JMenu();

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

        typeLabel.setText("Type : ");

        numberOfPagesLabel.setText("Number Of Pages : ");

        publishYearliLabel.setText("Publish Year :  ");

        priceLabel.setText("Price : ");

        createOrderButton.setText("Create Order");
        createOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderButtonActionPerformed(evt);
            }
        });

        bookNameiLabel.setText("Book Name : ");

        authorLabel.setText("Author : ");

        typerTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typerTextFieldActionPerformed(evt);
            }
        });

        publisheriLabel.setText("Publisher : ");

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Author", "Publisher", "Type", "Number Of Pages", "Publish Year", "Price"
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

        showOrderButton.setText("Show Order");
        showOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showOrderButtonActionPerformed(evt);
            }
        });

        deleteBookButton.setText("Delete Book");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });

        updatebookButton.setText("Update Book");
        updatebookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebookButtonActionPerformed(evt);
            }
        });

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        alertlabel.setForeground(new java.awt.Color(102, 0, 0));

        welcomeMenu.setText("Welcome");
        jMenuBar1.add(welcomeMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(deleteBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatebookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(publishYearliLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(typeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(publisheriLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(authorLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bookNameiLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(numberOfPagesLabel, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bookNameiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(authorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publisheriTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(typerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(publishYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(dynamicSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(30, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(addBookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updatebookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBookButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createOrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showOrderButton)
                .addGap(28, 28, 28)
                .addComponent(alertlabel)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(dynamicSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookNameiLabel)
                        .addComponent(bookNameiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(typeLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberOfPagesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numberOfPagesLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(publishYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(publishYearliLabel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(priceLabel))
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dynamicSearchTextFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dynamicSearchTextFieldMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_dynamicSearchTextFieldMouseReleased
    
    private void dynamicSearchTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dynamicSearchTextFieldKeyReleased
        String search = dynamicSearchTextField.getText();
        dynamicSearch(search);
    }//GEN-LAST:event_dynamicSearchTextFieldKeyReleased

    //Here, we create an array list as Book type and fill it with books informations
    public void showBooks()
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
    
    //Here, we make dynamic search
    //When we input a word it starts giving search results
    public void dynamicSearch(String search)
    {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        bookTable.setRowSorter(tr);
        tr.setRowFilter(javax.swing.RowFilter.regexFilter(search));
    }
    
    private void typerTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typerTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typerTextFieldActionPerformed

    //We take values when we click on book table
    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        int selectedRow = bookTable.getSelectedRow();
        bookNameiTextField.setText(model.getValueAt(selectedRow, 1).toString());
        authorTextField.setText(model.getValueAt(selectedRow, 2).toString());
        publisheriTextField.setText(model.getValueAt(selectedRow, 3).toString());
        typerTextField.setText(model.getValueAt(selectedRow, 4).toString());
        numberOfPagesTextField.setText(model.getValueAt(selectedRow, 5).toString());
        publishYearTextField.setText(model.getValueAt(selectedRow, 6).toString());
        priceTextField.setText(model.getValueAt(selectedRow, 7).toString());
    }//GEN-LAST:event_bookTableMouseClicked

    //We get texts from text fields and then we add book to our database with addBook method
    //Then we make an alert
    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        alertlabel.setText("");
        String name = bookNameiTextField.getText();
        String author = authorTextField.getText();
        String publisher = publisheriTextField.getText();
        String type = typerTextField.getText();
        String numberOfPages = numberOfPagesTextField.getText();
        String publishYear = publishYearTextField.getText();
        String price = priceTextField.getText();
        operations.addBook(name, author, publisher, type, numberOfPages, publishYear, price);
        showBooks();
        alertlabel.setText("New book added.");
        
    }//GEN-LAST:event_addBookButtonActionPerformed

    //Here we update an book information
    private void updatebookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebookButtonActionPerformed
        alertlabel.setText("");
        //Here, we select a row
        int selectedRow = bookTable.getSelectedRow();
        //If no selected row in table
        if(selectedRow == -1)
        {
            //If table is empty make alert
            if(model.getRowCount() == 0)
            {
                alertlabel.setText("No book in the list.");
            }
            //Otherwise alert to user to select a row
            else
            {
                alertlabel.setText("Choose book that you want to update.");
            }
        }
        //If a row selected and not empty get informations and update with updateBook method
        else
        {
            int id = (int) model.getValueAt(selectedRow, 0);
            String name = bookNameiTextField.getText();
            String author = authorTextField.getText();
            String publisher = publisheriTextField.getText();
            String type = typerTextField.getText();
            String numberOfPages = numberOfPagesTextField.getText();
            String publishYear = publishYearTextField.getText();
            String price = priceTextField.getText();
            operations.updateBook(id, name, author, publisher, type, numberOfPages, publishYear, price);
            showBooks();
            alertlabel.setText("Selected book updated.");
        }
    }//GEN-LAST:event_updatebookButtonActionPerformed

    //Here we delete a book
    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        //Here, we select a row
        int selectedRow = bookTable.getSelectedRow();
        //If no selected row in table
        if(selectedRow == -1)
        {
            //If table is empty make alert
            if(model.getRowCount() == 0)
            {
                alertlabel.setText("No book in the list.");
            }
            //Otherwise alert to user to select a row
            else
            {
                alertlabel.setText("Choose book that you want to delete.");
            }
        }
        //If a row selected and not empty get row id and delete book with deleteBook method
        else
        {
            int id = (int) model.getValueAt(selectedRow, 0);
            operations.deleteBook(id);
            showBooks();
            alertlabel.setText("Selected book updated.");
        }
    }//GEN-LAST:event_deleteBookButtonActionPerformed

    //Here we create an order with createOrder method
    private void createOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderButtonActionPerformed
        String name = bookNameiTextField.getText();
        String author = authorTextField.getText();
        String publisher = publisheriTextField.getText();
        String type = typerTextField.getText();
        String numberOfPages = numberOfPagesTextField.getText();
        String publishYear = publishYearTextField.getText();
        String price = priceTextField.getText();
        operations.createOrder(name, author, publisher, type, numberOfPages, publishYear, price);
    }//GEN-LAST:event_createOrderButtonActionPerformed

    //Here, we create an OrderDialog object and set it visible
    private void showOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showOrderButtonActionPerformed
        OrderDialog orderDialog = new OrderDialog(null, true);
        setVisible(false);
        orderDialog.setVisible(true);
    }//GEN-LAST:event_showOrderButtonActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminDialog dialog = new AdminDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel alertlabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel bookNameiLabel;
    private javax.swing.JTextField bookNameiTextField;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton createOrderButton;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JTextField dynamicSearchTextField;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel numberOfPagesLabel;
    private javax.swing.JTextField numberOfPagesTextField;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField publishYearTextField;
    private javax.swing.JLabel publishYearliLabel;
    private javax.swing.JLabel publisheriLabel;
    private javax.swing.JTextField publisheriTextField;
    private javax.swing.JButton showOrderButton;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typerTextField;
    private javax.swing.JButton updatebookButton;
    private javax.swing.JMenu welcomeMenu;
    // End of variables declaration//GEN-END:variables
}
