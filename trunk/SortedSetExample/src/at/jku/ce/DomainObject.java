package at.jku.ce;

public class DomainObject {

 	private String name;
<<<<<<< HEAD
  public String id = UUID.randomUUID().toString()
  
=======
	public String uuid;

>>>>>>> 3a21088ce0b19975d2287dfd5f141b3e078f66d4
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