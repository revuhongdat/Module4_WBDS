package service;

import model.Dictionary;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DictService {
    public DictService() {
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary?useSSL=false", "root", "123456");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace(System.err);
        }
        return connection;
    }

    public List<Dictionary> findAll() {
        List<Dictionary> dictionaries = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from a");
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String word1 = rs.getString("word1");
                String word2 = rs.getString("word2");
                dictionaries.add(new Dictionary(id, word1, word2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return dictionaries;
    }
}
