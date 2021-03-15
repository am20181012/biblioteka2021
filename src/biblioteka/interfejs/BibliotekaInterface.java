package biblioteka.interfejs;

import java.util.LinkedList;

import biblioteka.Autor;
import biblioteka.Knjiga;

/**
 * Interfejs biblioteka
 * 
 * @author Andjela Mijatovic
 *
 */
public interface BibliotekaInterface {
	
	/**
	 * Dodaj novu knjigu u biblioteku.
	 * 
	 * @param knjiga Knjiga koja se dodaje.
	 * 
	 * @throws java.lang.NullPointerExceprion ako je uneta knjiga null
	 * @throws java.lang.RuntimeExceprion ako uneta knjiga vec postoji u biblioteci(duplikat)
	 */
	public void dodajKnjigu(Knjiga knjiga);
	
	public void obrisiKnjigu(Knjiga knjiga);
	
	public LinkedList<Knjiga> vratiKnjige();
	
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac);

}
