
public class SingleBuffer<AnyType>  {
	private AnyType item;
	private boolean empty;

	public SingleBuffer() {
		item = null; 
		empty = true; 
	}

	public SingleBuffer(AnyType item) {
		this.item = item;
		if(item != null) {
			empty = false; 	
		}else {
			empty = true; 
		}
	}

	public AnyType get() throws SingleBufferException	{
		if(empty) {
			throw new SingleBufferException("Buffer is empty!");
		}
		empty = true;
		AnyType stuff = item; 

		return item; 
	}

	public void put(AnyType stuff) throws SingleBufferException {
		if(!empty) {
			throw new SingleBufferException("Buffer must be empty by insertion");
		}
		stuff = item; 
		empty = false; 
	}

	public static void main(String [] args) throws SingleBufferException {
		SingleBuffer buffer = new SingleBuffer("stuff");
		buffer.put("more stuff");
		System.out.println(buffer.get());
	}
}
