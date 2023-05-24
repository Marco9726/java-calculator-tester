package org.java.myTesting;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class EmployeeTest {
	
	@Test
	public void employeeConstructTest() throws Exception {
		Employee e = new Employee("Pinco", "Pallino", LocalDate.parse("2000-01-01"), "boss");
		assertNotNull(e);
	}
	
	@Test
	public void employeeEmptyNameConstructTest() throws Exception {
		
		assertThrows(Exception.class,
				() -> new Employee(null, null, null, null));
	}
}
