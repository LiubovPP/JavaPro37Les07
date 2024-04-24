package app.constants;

public interface Constants {

    // http://120.230.12.10:8080/cars?id=5
    // jdbc:postgresql://120.230.12.10:5432/g_37_jp_cars?user=postgres&password=ppp77777

    // Для MySQL:
    // String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    // String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    // String DB_USERNAME = "root";

    String DB_DRIVER_PATH = "org.postgresql.Driver";
    String DB_ADDRESS = "jdbc:postgresql://localhost:5432/";
    String DB_NAME = "cars";
    String DB_USERNAME = "postgres";
    String DB_PASSWORD = "qwe007";
}