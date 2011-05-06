package at.jku.ce;

public class DomainObject {

 	private String name;
	private String uuid = UUID.randomUUID().toString();
	
	/**
 	* Default constructor
 	*/

	public DomainObject(String name, String comment) {
		super();
	}
	
	public DomainObject(String uuid) {
    super();
    this.uuid = uuid;
  }
  
  public String getUuid() {
   return uuid;
}


}