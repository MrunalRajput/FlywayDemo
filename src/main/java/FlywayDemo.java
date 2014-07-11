import org.flywaydb.core.Flyway;
public class FlywayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
		 Flyway flyway = new Flyway();
	     flyway.setDataSource(args[0], args[1], args[2]);
	     flyway.migrate();

		

	}

}
