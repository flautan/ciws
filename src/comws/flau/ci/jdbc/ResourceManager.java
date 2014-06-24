package comws.flau.ci.jdbc;

import java.sql.*;

public class ResourceManager
{
    private static String JDBC_DRIVER   = "com.mysql.jdbc.Driver";
// localhost
//    private static String JDBC_URL      = "jdbc:mysql://127.0.0.1/group700_fig";
//    private static String JDBC_USER     = "root";
//    private static String JDBC_PASSWORD = "domenico";
// produzione
    private static String JDBC_URL      = "jdbc:mysql://151.1.159.238/group700_fig";
    private static String JDBC_USER     = "group700_root";
    private static String JDBC_PASSWORD = "A5TEjTf0dE";
    
    private static Driver driver = null;

    public static synchronized Connection getConnection()
	throws SQLException
    {
        if (driver == null)
        {
            try
            {
                Class jdbcDriverClass = Class.forName( JDBC_DRIVER );
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver( driver );
            }
            catch (Exception e)
            {
                System.out.println( "Failed to initialise JDBC driver" );
                e.printStackTrace();
            }
        }

        return DriverManager.getConnection(
                JDBC_URL,
                JDBC_USER,
                JDBC_PASSWORD
        );
    }


	public static void close(Connection conn)
	{
		try {
			if (conn != null) conn.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}

	public static void close(PreparedStatement stmt)
	{
		try {
			if (stmt != null) stmt.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
	}

	public static void close(ResultSet rs)
	{
		try {
			if (rs != null) rs.close();
		}
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}

	}

}
