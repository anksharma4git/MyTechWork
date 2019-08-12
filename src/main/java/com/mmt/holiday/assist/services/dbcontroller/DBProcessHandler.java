package com.mmt.holiday.assist.services.dbcontroller;

import org.jooq.Record;
import org.jooq.Result;

public interface DBProcessHandler {

	public Result<Record>  getData(String queryToExecute);
}
