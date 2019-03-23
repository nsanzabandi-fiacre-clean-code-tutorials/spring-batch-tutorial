package clean.code.tutorial.spring.batch.core;

/**
 * Person representation
 * 
 * @author fnsanzabandi
 *
 */
public class Person {
	private int id;
	private String nom;
	private String prenom;
	private String civilite;
	private String Taille;

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(final String civilite) {
		this.civilite = civilite;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}
	public String getTaille() {
		return Taille;
	}

	public void setTaille(String taille) {
		Taille = taille;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", civilite=" + civilite + ", taille=" + Taille + "]";
	}
}