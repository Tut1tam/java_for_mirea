import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

	public static void main(String args[]){
	
		
		
	int[] k = {1,2,3,4,5,6,7} ;
	
	Integer[] i = {1,2,3,4,5,6,7} ;
	String[] s = {"abc","def","c","d","e"};
	
	ArrayList aL1 = Test.ConvertArrayToList(i);
	for(int j = 0; j<aL1.size(); j++) 
		System.out.print(aL1.get(j));
	
	ArrayList aL2 = Test.ConvertArrayToList(s);
	for(int j = 0; j<aL2.size(); j++) 
		System.out.print(aL2.get(j));
	
	Array<Integer> iA2 = new Array(i);
	System.out.println("\n"+iA2.get(2));
	
	Test.Filelist("C:\\");
	
	}
}

class Test {
	/* Написать метод для конвертации массива строк/чисел в список.
	 * */
	public static <T> ArrayList<T> ConvertArrayToList(T[] a){
		ArrayList<T> temp = new ArrayList<T>();
		for(T t:a)  
			temp.add(t);
		return temp;
		
	}
	
	/* Написать ф-ю, которая сохранит содержимое каталога в список и выведет первые 5 элементов на экран.
	 * */
	
    public static void Filelist(String path){
    	File f = new File(path);
    	String[] fArray = null;
    	if (f.exists()||f.isDirectory()) fArray = f.list(null);
    	else System.out.print("Папка не найдена");
    	ArrayList<String> list = new ArrayList(Arrays.asList(fArray));
    	
    	for (int i =0; i<list.size();i++) {
    		if(i<5) System.out.println(list.get(i));
    	}
    }
	
}

/* Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
 *  Реализовать метод, который возвращает любой элемент массива по индексу.
 * */
class Array <T>{
	public Array (T[] t){
	this.aL = new ArrayList<T>();
	for(T i: t) aL.add(i);
	}
	
	public T get(int index){
		return this.aL.get(index);
		
	}
	private ArrayList<T> aL;
}



class Array2 <T>{
	public Array2 (Object[] t){
	this.aL = new ArrayList();
	for(Object i: t) aL.add(i);
	}
	
	public T get(int index){
		return (T)this.aL.get(index);
		
	}
	private ArrayList<Object> aL;
}
