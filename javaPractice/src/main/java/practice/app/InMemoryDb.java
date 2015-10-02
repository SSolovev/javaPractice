package practice.app;

import java.sql.*;

/**
 * Created by SeASolovev on 17.09.2015.
 */
public class InMemoryDb {
    private static final String DRIVER = "org.h2.Driver";
    private static final String CONNECTION = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";

    public void createDB() {
        try {
            Connection c = getDBConnection();

            Statement st = c.createStatement();
            st.execute("CREATE TABLE A(num int)");
            st.execute("INSERT INTO A VALUES(2)");
            st.execute("INSERT INTO A VALUES(5)");
            st.execute("INSERT INTO A VALUES(7)");
            st.execute("INSERT INTO A VALUES(9)");
            st.execute("INSERT INTO A VALUES(13)");

//            ResultSet rs = st.executeQuery("SELECT num1, MIN(num2) from (" +
//                    "SELECT t1.num as num1,num2 FROM A AS t1 CROSS JOIN (SELECT num as num2 FROM A ) as t2 where  t1.num<num2) group by num1");
            ResultSet rs = st.executeQuery("SELECT a1.num,MIN(a2.num) from A as a1 inner join A as a2 on a1.num<a2.num group by a1.num order by a1.num");
            while(rs.next()){
                System.out.println(rs.getInt(1) +"--"+rs.getInt(2));
            }
//            st.execute("SELECT * FROM A");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private Connection getDBConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
        }

        try {
            return connection = DriverManager.getConnection(CONNECTION, "", "");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;

    }

}
