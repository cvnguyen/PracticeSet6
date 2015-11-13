package base;
	
	import static org.junit.Assert.*;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import domain.PersonDomainModel;

	import java.text.SimpleDateFormat;
	import java.util.Date;
	
public class Person_Tests {
	private static PersonDomainModel person1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		person1 = new PersonDomainModel();
		person1.setFirstName("Cindy");
		person1.setLastName("Nguyen");
		person1.setBirthday(Date);
		person1.setCity("Newark");
		person1.setPostalCode(19711);
		person1.setStreet("281 Beverly Road");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	@Before
	public  void setUp() throws Exception{
	}

	
}