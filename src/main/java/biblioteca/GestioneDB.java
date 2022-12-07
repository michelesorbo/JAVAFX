package biblioteca;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;

public class GestioneDB {
    private Connection conn;
    private Statement st;
    private ResultSet rs;

    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/bibliojava","root","root");
            st = conn.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ResultSet qSelect(String query){
        try {
            rs = st.executeQuery(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return rs;
    }

    public boolean qUpdateInsert(String query) {
        try {
            st.executeUpdate(query);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public void DBClose(){
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getMd5Hash(String input)
    {
        try
        {
            //static getInstance() method is called with hashing MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //calculating message digest of an input that return array of byte
            byte[] messageDigest = md.digest(input.getBytes());
            //converting byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);
            //converting message digest into hex value
            String hashtext = no.toString(16);
            while (hashtext.length() < 32)
            {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        //for specifying wrong message digest algorithms
        catch (NoSuchAlgorithmException e)
        {
            throw new RuntimeException(e);
        }
    }

}
