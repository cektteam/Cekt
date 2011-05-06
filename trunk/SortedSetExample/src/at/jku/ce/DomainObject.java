package at.jku.ce;

public class DomainObject {

 	private String name;
	public String uuid;

	/**
 	* Default constructor
 	*/

	public DomainObject() {
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