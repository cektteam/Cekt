package at.jku.ce;

public class Main {

	/**
	 * @param args
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		
		Set<DomainObject> objectSet = new TreeSet<DomainObject>(new DomainObjectComparator());

		objectSet.add(DomainFactory.createDomainObject("Helga", "Kommentar Helga"));
		objectSet.add(DomainFactory.createDomainObject("Walter", "Kommentar Walter"));
		objectSet.add(DomainFactory.createDomainObject("Hannah", "Kommentar Hannah"));
		objectSet.add(DomainFactory.createDomainObject("Paul", "Kommentar Paul"));
		objectSet.add(DomainFactory.createDomainObject("Claudia", "Kommentar Claudia"));

		for (DomainObject domainObject : objectSet) {
		  LOGGER.debug(domainObject.toString());
		}
	}

}
