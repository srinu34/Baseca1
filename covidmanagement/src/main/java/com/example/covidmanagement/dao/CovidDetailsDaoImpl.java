package com.example.covidmanagement.dao;

import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.covidmanagement.connectionDB.ConnectionDB;
import com.example.covidmanagement.exception.CovidDetailsDaoException;
import com.example.covidmanagement.model.CovidDetails;

public class CovidDetailsDaoImpl extends ConnectionDB implements CovidDetailsDao {

	@Override
	public void createconnection() {

		try {
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("=====connection successfull===");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeconnection() {

		try {
			con.close();
			System.out.println("=======connection closed successfull=========");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<CovidDetails> getdetailsofcity(String city) throws CovidDetailsDaoException {
		try {
			String cityname = " select * from covid_details where city=?";
			PreparedStatement pm = con.prepareStatement(cityname);
			pm.setString(1, city);
			ArrayList<CovidDetails> details=new ArrayList<>();
			ResultSet rs = pm.executeQuery();
			rs.next();
			while(rs.next())
			{
			int cid = rs.getInt("id");
			int testing = rs.getInt("testing_done");
			int covidpatients = rs.getInt("positive_patients");
			String citynames = rs.getString("city");
			String statename = rs.getString("state");
			int affected = rs.getInt("no_of_them_infected");
			String patientdate = rs.getString("date_of_screening");
			
			CovidDetails coviddetails=new CovidDetails(cid, testing, covidpatients, citynames, statename, affected, patientdate);
		details.add(coviddetails);	
			}
			return details;
		} catch (SQLException e) {
			throw new CovidDetailsDaoException("No Data is there:");
		}

	}

	@Override
	public int[] insertdata(List<CovidDetails> adddetails) throws CovidDetailsDaoException {
		try {
			String insertQuery = "insert into covid_details values(?,?,?,?,?,?,?);";
			PreparedStatement pm = con.prepareStatement(insertQuery);
			for (CovidDetails covidDetails : adddetails) {
				pm.setInt(1, covidDetails.getId());
				pm.setInt(2, covidDetails.getNo_of_testing_done());
				pm.setInt(3, covidDetails.getNo_of_covid_positive_patients());
				pm.setString(4, covidDetails.getCity());
				pm.setString(5, covidDetails.getState());
				pm.setInt(6, covidDetails.getNo_of_infected());
				pm.setString(7, covidDetails.getDate());
				pm.addBatch();
			}
			int a[] = pm.executeBatch();
			return a;

		} catch (SQLException e) {
			throw new CovidDetailsDaoException("Insertion Eception:");

		}

	}

	@Override
	public ArrayList<CovidDetails> getdetailsofstate(String state) throws CovidDetailsDaoException {
		try {
			String cityname = " select * from covid_details where state=?";
			PreparedStatement pm = con.prepareStatement(cityname);
			pm.setString(1, state);
			ArrayList<CovidDetails> details=new ArrayList<>();
			ResultSet rs = pm.executeQuery();
			rs.next();
			while(rs.next())
			{
			int cid = rs.getInt("id");
			int testing = rs.getInt("testing_done");
			int covidpatients = rs.getInt("positive_patients");
			String citynames = rs.getString("city");
			String statename = rs.getString("state");
			int affected = rs.getInt("no_of_them_infected");
			String patientdate = rs.getString("date_of_screening");
			
			CovidDetails coviddetails=new CovidDetails(cid, testing, covidpatients, citynames, statename, affected, patientdate);
		details.add(coviddetails);	
			}
			return details;
			
		} catch (SQLException e) {
			throw new CovidDetailsDaoException("No such Data");

		}
	}

	@Override
	public int deletedetails(int id) throws CovidDetailsDaoException {
		try {
			String deleteQuery = "delete from covid_details where id=?";
			PreparedStatement pm = con.prepareStatement(deleteQuery);
			pm.setInt(1, id);
			int count = pm.executeUpdate();
			return count;
		} catch (SQLException e) {
			throw new CovidDetailsDaoException("No Data to Delete Exception:");
		}

	}

	@Override
	public int updatedetails(int id, String city) throws CovidDetailsDaoException {
		try {
			String updatequery = "update covid_details set city=? where id=?;";
			PreparedStatement pm = con.prepareStatement(updatequery);
			pm.setString(1, city);
			pm.setInt(2, id);
			int count = pm.executeUpdate();
			return count;
		} catch (SQLException e) {
			throw new CovidDetailsDaoException("Update Exception:");
		}
	}

	public ArrayList<CovidDetails> callablestatement() throws CovidDetailsDaoException {
		try {
			String Query = "{call sample()}";
			CallableStatement cm = con.prepareCall(Query);

			boolean res = cm.execute();
			if (res) {
				ArrayList<CovidDetails> details = new ArrayList<>();
				ResultSet rs = cm.getResultSet();
				while (rs.next()) {

					int cid = rs.getInt("id");
					int testing = rs.getInt("testing_done");
					int covidpatients = rs.getInt("positive_patients");
					String citynames = rs.getString("city");
					String statename = rs.getString("state");
					int affected = rs.getInt("no_of_them_infected");
					String patientdate = rs.getString("date_of_screening");
					CovidDetails coviddetails = new CovidDetails(cid, testing, covidpatients, citynames, statename,
							affected, patientdate);
					details.add(coviddetails);

				}
				return details;
			}
		} catch (SQLException e) {
			throw new CovidDetailsDaoException("Exception At Callable Get Values:");
		}
		return null;

	}

	@Override
	public void insertcallablestatement(CovidDetails covid) throws CovidDetailsDaoException {

		try {
			String insert = "{call insert_data(?,?,?,?,?,?,?)}";
			CallableStatement cm = con.prepareCall(insert);
			cm.setInt(1, covid.getId());
			cm.setInt(2, covid.getNo_of_testing_done());
			cm.setInt(3, covid.getNo_of_covid_positive_patients());
			cm.setString(4, covid.getCity());
			cm.setString(5, covid.getState());
			cm.setInt(6, covid.getNo_of_infected());
			cm.setString(7, covid.getDate());
			cm.execute();
			System.out.println("=========Details Entered Successfully=============");

		} catch (SQLException e) {
			throw new CovidDetailsDaoException("Exception At callable insert data:");
		}
	}
}
