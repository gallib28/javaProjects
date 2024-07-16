package book_system;

public class Author {
	private final String name ; 
	private final int author_id ; 
	
	public Author(String _name,int _author_id) {
		name = _name;
		author_id = _author_id ; 
	}
	
	public Author(Author _a) {
		name = _a.name ;
		author_id = _a.author_id;
	}
	
	public String getName() {
		return this.name ; 
	}
	public int getAuthorId() {
		return this.author_id ; 
	}
}
