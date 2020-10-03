interface Abc{
	void show();
}
public class TestDemo {

	public static void main(String[] args) {
		Abc obj=()->
		{System.out.println("Hello world!!");
		};
		obj.show();
	}

}
