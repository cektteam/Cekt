package at.jku.ce;

public class DomainObject {

 	private String name;
	private String uuid = UUID.randomUUID().toString();
	private String comment;
	
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

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }
  
  public String getName() {
   return name;
  }

  public void setName(String name) {
   this.name = name;
  }
}