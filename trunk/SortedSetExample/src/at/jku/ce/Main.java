package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new HashSet<DomainObject>();

		objectSet.add(new DomainObject("Helga", "Kommentar Helga"));
		objectSet.add(new DomainObject("Walter", "Kommentar Walter"));
		objectSet.add(new DomainObject("Hannah", "Kommentar Hannah"));
		objectSet.add(new DomainObject("Paul", "Kommentar Paul"));
		objectSet.add(new DomainObject("Claudia", "Kommentar Claudia"));

		for (DomainObject domainObject : objectSet) {
		  LOGGER.debug(domainObject.getUuid());
		}
	}

}
