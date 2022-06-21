import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    private Connection connection;

    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getURL(),
                    config.getUser(),
                    config.getPassword()
            );
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
        @Override
        public List<Ad> all () {
            List<Ad>ads = new ArrayList<>();
            String query = "SELECT * ads";
        try{
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
            }catch (SQLException throwables){
            throwables.printStackTrace();
        }
            return ads;
        }

        @Override
        public Long insert (Ad ad){
            Long lastInsertId = 0L;
            try{
                Statement statement = connection.createStatement();
                String insertQuery = String.format("INSERT INTO ads (user_id,title,description)VALUES(%d,'%s','%s')",
                        ad.getUserId(), ad.getTitle(), ad.getDescription());
                statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = statement.getGeneratedKeys();
                rs.next();
                lastInsertId = rs.getLong(1);
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
            return lastInsertId;
        }
    }

