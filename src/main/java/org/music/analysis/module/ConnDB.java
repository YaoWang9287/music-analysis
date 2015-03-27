package org.music.analysis.module;

import java.sql.*;

import org.apache.log4j.Logger;

public class ConnDB {
	public Connection ct = null;
	static final Logger logger = Logger.getLogger(ConnDB.class);
	
	public Connection getConnection(){
		String url="jdbc:mysql://musicanalysisdata.cuxecej3mq5k.us-west-2.rds.amazonaws.com/Database_Project_DB";
		try{
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection(url,"KevinWill","password");	
		}catch( Exception ex){
			logger.debug("Not able to connect to Database!!!");
			ex.printStackTrace();
		}
		return ct;
	}
}

