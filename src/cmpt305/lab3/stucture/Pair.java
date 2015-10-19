package cmpt305.lab3.stucture;

public class Pair<K, V>{
	private final K k;
	private final V v;

	public Pair(K k, V v){
		this.k = k;
		this.v = v;
	}

	public K getKey(){
		return k;
	}

	public V getValue(){
		return v;
	}
}
