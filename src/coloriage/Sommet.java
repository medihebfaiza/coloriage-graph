package coloriage ;

public class Sommet{
  private String nom ;
  private int color ; // 0 : blanc ,
  private int degre ;


	/**
	* Default empty Sommet constructor
	*/
	public Sommet() {
    this.degre = 0 ;
	}

	/**
	* Default Sommet constructor
	*/
	public Sommet(String nom) {
		this.nom = nom ;
		this.color = 0 ;
		this.degre = 0 ;
	}


	/**
	* Returns value of nom
	* @return
	*/
	public String getNom() {
		return nom;
	}

	/**
	* Sets new value of nom
	* @param
	*/
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	* Returns value of color
	* @return
	*/
	public int getColor() {
		return color;
	}

	/**
	* Sets new value of color
	* @param
	*/
	public void setColor(int color) {
		this.color = color;
	}

	/**
	* Returns value of degre
	* @return
	*/
	public int getDegre() {
		return degre;
	}

	/**
	* Sets new value of degre
	* @param
	*/
	public void setDegre(int degre) {
		this.degre = degre;
	}


	/**
	* Create string representation of Sommet for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Sommet [nom=" + nom + ", color=" + color + ", degre=" + degre + "]";
	}

  /**
  *
  */
  public void incrementerDegre(){
    this.degre++ ;
  }

  /**
  *
  */
  public void decrementerDegre(){
    this.degre-- ;
  }
}