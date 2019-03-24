
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author mmustafaaca
 **/

public class Operations 
{
    //We initialized our variables here
    private Connection con;
    private PreparedStatement preparedStatement;
    private Statement statement;
    
    //We created a constuctor
    public Operations()
    {
        //We initialized url here
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.dbName ;
        //We try in this try-catch blocks connect to database
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            con = DriverManager.getConnection(url, Database.username, Database.password);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //We created bookınformations method in Book Arraylist type.
    public ArrayList<Book> bookInformations()
    {
        ArrayList<Book> output = new ArrayList<>();
        //We try here select all informations from book database while query has next
        try {
            statement = (Statement) con.createStatement();
            String query = "SELECT * FROM book";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String type = rs.getString("type");
                String numberOfPages = rs.getString("numberOfPages");
                String publishYear = rs.getString("publishYear");
                String price = rs.getString("price");
                output.add(new Book(id, name, author, publisher, type, numberOfPages, publishYear, price));
            }
            return output;
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    //We try here select all informations from orders database while query has next
    public ArrayList<Book> adminOrderInformations()
    {
        ArrayList<Book> output = new ArrayList<Book>();
        try {
            statement = (Statement) con.createStatement();
            String query = "SELECT * FROM orders";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String author = rs.getString("author");
                String publisher = rs.getString("publisher");
                String type = rs.getString("type");
                String numberOfPages = rs.getString("numberOfPages");
                String publishYear = rs.getString("publishYear");
                String price = rs.getString("price");
                output.add(new Book(id, name, author, publisher, type, numberOfPages, publishYear, price));
            }
            return output;
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
    //With this function we add book to database
    public void addBook(String name, String author, String publisher, String type, String numberOfPages, String publishYear, String price)
    {
        String query = "INSERT INTO book(name, author, publisher, type, numberOfPages, publishYear, price) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, publisher);
            preparedStatement.setString(4, type);
            preparedStatement.setString(5, numberOfPages);
            preparedStatement.setString(6, publishYear);
            preparedStatement.setString(7, price);
            preparedStatement.executeUpdate();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
     //With this function we update a book
    public void updateBook(int id, String name, String author, String publisher, String type, String numberOfPages, String publishYear, String price)
    {
        String query = "UPDATE book SET name = ?, author = ?, publisher = ?, type = ?, numberOfPages = ?, publishYear = ?, price = ? WHERE id = ?";
        try 
        {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, publisher);
            preparedStatement.setString(4, type);
            preparedStatement.setString(5, numberOfPages);
            preparedStatement.setString(6, publishYear);
            preparedStatement.setString(7, price);
            preparedStatement.setInt(8, id);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     //With this function we delete a book
    public void deleteBook(int id)
    {
        String query = "DELETE FROM book WHERE ID = ?";
        try
        {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Here we try to login
    public boolean login(String username, String password)
    {
        String query = "SELECT * FROM members WHERE username = ? AND password = ?";
        try {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            return rs.next();
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       
    }
    
    //We check here admin status
    public boolean isAdmin(String username, String password)
    {
        String query = "SELECT statu FROM members WHERE username = ? AND password = ?";
        try 
        {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs = preparedStatement.executeQuery();
            boolean statu = false;
            while(rs.next())
            {
                statu = rs.getBoolean("statu");
            }
            return statu;
        } 
        catch (SQLException ex)
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    //Here we sign up and add values to members database
    public void signUp(String username, String password)
    {
        String query = "INSERT INTO members(username, password, statu) VALUES(?, ? , 0)";
        try
        {
            preparedStatement = (PreparedStatement) con.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    //Here, we get values and insert it into orders
    //Then we make an alert
    public void createOrder(String name, String author, String publisher, String type, String numberOfPages, String publishYear, String price)
    {
        String message = "Book Name : " + name + "\n"
                     + "Author : " + author + "\n"
                     + "Publisher : " + publisher + "\n"
                     + "type : " + type + "\n"
                     + "Number Of Pages : " + numberOfPages + "\n"
                     + "Publish Year : " + publishYear + "\n"
                     + "Price : " + price + "\n"
                     + "Do you approve the purchase?" + "\n";
        String query = "INSERT INTO orders(name, author, publisher, type, numberOfPages, publishYear, price) VALUES(?, ?, ?, ?, ?, ?, ?)";
        int answer = JOptionPane.showConfirmDialog(null, message, "Order Confirmation", 2);
        //If answer in alert is 'yes', we add values to order
        if(answer == JOptionPane.YES_OPTION)
        {
            try
            {
                preparedStatement = (PreparedStatement) con.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, author);
                preparedStatement.setString(3, publisher);
                preparedStatement.setString(4, type);
                preparedStatement.setString(5, numberOfPages);
                preparedStatement.setString(6, publishYear);
                preparedStatement.setString(7, price);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "Order process is successfull", "Order Confirmed.", 1);
            } 
            catch (SQLException ex)
            {
                Logger.getLogger(Operations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //If answer in alert is 'no', we cancel operation
        else
        {
            JOptionPane.showMessageDialog(null, "Transaction Canceled");
        }
    }
    
    
}
