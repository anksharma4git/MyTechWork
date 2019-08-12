package com.mmt.holiday.mock.service.mockingcontrollerimpl;

import com.mmt.holiday.mock.service.commons.LOB;
import com.mmt.holiday.mock.service.mockingcontroller.LOBMockController;
import com.mmt.holiday.mock.service.mockingcontroller.MockingController;

public class MockControllerImpl  implements MockingController {



	@Override
	public LOBMockController getLOBMockController(LOB lob) {
		LOBMockController lobController = null;
		switch (lob) {
		case FLIGHTS:
			lobController = new FlightsMockControllerImpl();
			break;
		case HOTELS:
			lobController = new HotelMockControllerImpl();
			break;
		default:
			break;
		}

		return lobController;
	}

}
