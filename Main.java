public class Main {
	public static void main (String[] args){
		Arraylist<String> array = new Arraylist<String>();
			array.add(args);
			for (String arg:array){
				System.out.println(arg);
			}
		}
	}
