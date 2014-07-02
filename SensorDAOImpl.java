package ard;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;


public class SensorDAOImpl implements SensorDAO {

	@Override
	public void createSensorTable() {
		// TODO Auto-generated method stub
	     Connection connection = null;
	        Statement statement = null;
	 
	        try {
	            connection = ConnectionConfiguration.getConnection();
	            statement = connection.createStatement();
	            statement.execute("CREATE TABLE IF NOT EXISTS sensordata (id int primary key unique auto_increment," +
	                    "time TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP,int sensorid,double sensorvalue)");
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (statement != null) {
	                try {
	                    statement.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	 
	            if (connection != null) {
	                try {
	                    connection.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	}

	@Override
	public void insert(SensorData sensorData) {
		// TODO Auto-generated method stub
	      Connection connection = null;
	        PreparedStatement preparedStatement = null;
	 
	        try {
	            connection = ConnectionConfiguration.getConnection();
	            
	            java.util.Date date = new Date(System.currentTimeMillis());
	            Timestamp timestamp = new Timestamp(date.getTime());
	            
	            preparedStatement = connection.prepareStatement("INSERT INTO sensor.sensordata (time,sensorid,sensorvalue)" +
	                    "VALUES (?, ?, ?)");
	            preparedStatement.setTimestamp(1, timestamp );
	            preparedStatement.setInt(2, sensorData.getSensorId());
	            preparedStatement.setDouble(3,sensorData.getSensorData());

	            preparedStatement.executeUpdate();
	            System.out.println("INSERT INTO sensor.sensordata (timestamp,sensorid,sensorvalue)" +"VALUES (?, ?, ?)");
	 
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            if (preparedStatement != null) {
	                try {
	                    preparedStatement.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	 
	            if (connection != null) {
	                try {
	                    connection.close();
	                } catch (SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	        }

	}

	@Override
	public SensorData selectByData(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SensorData> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(SensorData sensorData, int id) {
		// TODO Auto-generated method stub

	}

}
