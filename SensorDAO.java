package ard;

import java.util.List;

public interface SensorDAO {
	void createSensorTable();
	void insert(SensorData sensorData);
	SensorData selectByData(int id);
	List<SensorData> selectAll();
	void delete(int id);
	void update(SensorData sensorData, int id);
}
