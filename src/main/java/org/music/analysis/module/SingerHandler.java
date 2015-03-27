package org.music.analysis.module;

import java.sql.*;

public class SingerHandler{
	private ResultSet rs=null;
	private Connection ct = null;
	private PreparedStatement ps = null;

	public Singer getSinger(String name){
		Singer singer=new Singer();
		try{
			ct = new ConnDB().getConnection();
			ps = ct.prepareStatement("select * from Artists where artistName = "+name+"");
			rs = ps.executeQuery();
			if(rs.next()){
				singer.singerName=rs.getString(2);
				singer.country=rs.getString(1);
				//singer.singerType=rs.getString(1);
			}
			
			//Get albumList:
			ps = ct.prepareStatement("select * from goods where goodsId = ");
			rs = ps.executeQuery();
			if(rs.next())
				singer.albumList.add(rs.getString(1));
			
			//Get topSongList:
			ps = ct.prepareStatement("select * from goods where goodsId = ");
			rs = ps.executeQuery();
			if(rs.next())
				singer.albumList.add(rs.getString(1));
			
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try { rs.close(); } catch (Exception e) {}
			try { ps.close(); } catch (Exception e) {}
		    try { ct.close(); } catch (Exception e) {}
		}
		return singer;
	}
}
