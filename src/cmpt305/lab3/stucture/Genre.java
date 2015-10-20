package cmpt305.lab3.stucture;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

public class Genre{
	// For pair: key is the official genre, value is the user genre
	private static final Set<Genre> KNOWN = new HashSet();

	public static Genre getGenre(String name){
		Genre g = new Genre(name);

		if(KNOWN.contains(g)){
			return g;
		}
		KNOWN.add(g);
		return g;
	}

	public static Set<Genre> getKnown(){
		return new HashSet(KNOWN);
	}

	public final String name;

	private Genre(String name){
		this.name = name;
	}

	@Override
	public int hashCode(){
		int hash = 3;
		hash = 83 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		final Genre other = (Genre) obj;
		return Objects.equals(this.name, other.name);
	}

	@Override
	public String toString(){
		return name;
	}
}
