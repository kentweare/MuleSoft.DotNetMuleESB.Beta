package com.mulesoft.samples;
import javax.jws.WebService;

@WebService
public interface ITimeSheetService {
	 TimeSheetResponse ProcessTimeSheet(TimeSheetRequest request) throws Exception;
}
