import java.sql.*;

public class TestDataBase {

    public static void main(String[] args) throws SQLException {
        String title = "";
        String username = "root";
        String url = "jdbc:mysql://localhost:3306/taotao?characterEncoding=utf-8";
        String password = "root";

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String sql = "select ti.title title from tb_item ti where ti.id = '635906'";
            connection = DriverManager.getConnection(url, username, password);
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                title = rs.getString("title");
            }

            System.out.println(title);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            rs.close();
            pstmt.close();
            connection.close();
        }

    }

//    private final static String DB_URL = "jdbc:oracle:thin:@//172.30.3.114:1521/devorcl";
//    /** Oracle数据库连接驱动 */
//    private final static String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
//    /** 数据库用户名 */
//    private final static String DB_USERNAME = "yjsdata";
//    /** 数据库密码 */
//    private final static String DB_PASSWORD = "dev123";
//
//    public static void main(String[] ags) throws Exception{
//        Transaction Sqlca = getSqlca();
//        Connection conn = Sqlca.getConnection();
//        SystemConfig.loadSystemConfig(true, conn);
//        SendSZSRepayDetailJob job = new SendSZSRepayDetailJob();
//        job.execute(null);
//
//    }
//
//    public static Transaction getSqlca() throws Exception{
//        Class.forName(DB_DRIVER);
//        Connection  conn = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
//        Transaction Sqlca = new Transaction(conn);
//        return Sqlca;
//    }

}
