package com.mt.passportmanagement.service;

import java.sql.SQLException;


import com.mt.passportmanagement.Exception.InvalidNumberException;
import com.mt.passportmanagement.model.PassportDetails;
import com.mt.passportmanagement.model.PersonDetails;


public interface Dao {
	
	public void getdetailsofpassport(int p_id) throws InvalidNumberException;
	


}
