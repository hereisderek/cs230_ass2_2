package qwta;

import java.util.Vector;

public class Marksheet {

	public Student marked;
	public Course assessed;
	public Vector<Scoresheet>  recorded;

	public Scoresheet addScoresheet(Quiz q) {
		Scoresheet ss = new Scoresheet( q, this );
		recorded.add( ss );
		return ss;
	}

	public Marksheet(Student s, Course c) {
		marked = s;
		// BUGFIX:  null course
		try {
			if (c == null) throw new NullPointerException("null course");
			assessed = c;
			recorded = new Vector<Scoresheet>(); 
		} catch (NullPointerException e){
			System.err.println(e.toString());
		}
	}

}