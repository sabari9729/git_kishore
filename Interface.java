package mypack;

interface Searchable
{
	boolean search(String keyword);
}
class Document implements Searchable
{
	public String content;
	public Document(String content) {
		this.content=content;
		
	}
	public boolean search(String keyword)
	{
		if(content.contains(keyword))
		{
			return true;
		}
		return false;
	}
}
class webpage implements Searchable
{
	public String www;
	public webpage(String www)
	{
		this.www=www;
		
	}
	public boolean search(String keyword) {
		if (www.contains(keyword)){
			return true;
		}
		return false;
	}
}

public class Interface 
{

	public static void main(String[] args) 
	{
		Document ks=new Document("file document for searching");
		webpage mk=new webpage("www.gmail.com");
		String Document="searching";
		String webpage1="www.gmail.com";
		boolean foundInDocument=ks.search(Document);
		boolean foundInwebpage=mk.search(webpage1);
		System.out.println("search for "+Document+" in document:"+foundInDocument);
		System.out.println("search for "+webpage1+" in webpage:"+foundInwebpage);
	}

}
