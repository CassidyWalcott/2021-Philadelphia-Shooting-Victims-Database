import org.postgresql.ds.PGSimpleDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Shooting {


    public static PGSimpleDataSource createDS() {
        PGSimpleDataSource ds = new PGSimpleDataSource();
        ds.setServerName("localhost");
        ds.setPortNumber(5432);
        ds.setDatabaseName("Homicide");
        ds.setUser("postgres");
        ds.setPassword("postgres1");
        ds.setCurrentSchema("public");

        return ds;
    }


    public  static  final PGSimpleDataSource DATA_SOURCE = createDS();

    public static void main(String[] args) {

        List<ShootingVictim> records = new ArrayList<>();

        try (Connection conn = DATA_SOURCE.getConnection()) {


            try (Statement stat = conn.createStatement()) {

                try (ResultSet rs = stat.executeQuery("SELECT dist, date_, time_est, race, age FROM \"Shooting_Victims\"")) {

                    while (rs.next()) {

                        ShootingVictim record = new ShootingVictim();

                        record.setDist(rs.getInt("dist"));
                        record.setDate(rs.getDate("date_"));
                        record.setTime(rs.getTime("time_est"));
                        record.setRace(rs.getString("race"));
                        record.setAge(rs.getInt("age"));

                        records.add(record);
                    }
                }
            }


            for (ShootingVictim record: records) {

                System.out.println(record.getDist() + ", " + record.getDate() + ", " + record.getTime() + " , " + record.getRace() + " , " + record.getAge());
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        try (Connection conn = DATA_SOURCE.getConnection()) {

// abc.properties

            try (Statement stat = conn.createStatement()) {

                try (ResultSet rs = stat.executeQuery("SELECT COUNT(*) FROM \"Shooting_Victims\"")) {

                    while (rs.next()) {

                        int count = rs.getInt(1);
                        System.out.println(count);

break;
                    }
                }
            }



        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

