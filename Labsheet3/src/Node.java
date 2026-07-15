
public class Node {
	public Object data; // Data of the node
	public Node next; // Pointer to the next node in the list
	public Node(Object data)
	{
		this.data=data;
		this.next=null;
	}
	public String getAddress()
	{
		return ""+Integer.toHexString(System.identityHashCode(this));
	}
	public static String getAdderss(Node node)
	{
		return(node==null)  ? "null" : node.getAddress();
	}
	

}
