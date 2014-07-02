package ard;

import java.sql.Timestamp;

public class SensorData {
	   	private int id;  
	    private Timestamp timeStamp;
	    private double sensorData;
	    private int sensorId;
	    public SensorData(){
	    	
	    }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Timestamp getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(Timestamp timeStamp) {
			this.timeStamp = timeStamp;
		}
		public double getSensorData() {
			return sensorData;
		}
		public void setSensorData(double sensorData) {
			this.sensorData = sensorData;
		}
		public int getSensorId() {
			return sensorId;
		}
		public void setSensorId(int sensorId) {
			this.sensorId = sensorId;
		}
}
