package debut;

public class Recipient {
	private int capacite, espaceLibre;

	public Recipient(int quantite, int capacite) {
		this.capacite = capacite;
		this.espaceLibre = capacite - quantite;
	}

	/**
	 * Nombre d'élément dans le récipient. <br>
	 * est >= 0; est &lt= getCapacité();
	 * 
	 * @return
	 */
	public int getQuantite() {
		return espaceLibre - capacite;
		
		
	}

	/**
	 * Nombre maximal d'éléments que peut contenui le récipient <br>
	 * est >= getQuantite()
	 * 
	 * @return
	 */

	public int getCapacite() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public Boolean isPlein() {
		throw new UnsupportedOperationException("Not yet implemented");
	}

	public void isVide(Recipient instance) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

	public void mettreUnDans(Recipient autre) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

	/**
	 * Replit autre. <br>
	 * Requiert getQuantite()=> autre.getEspaceLibre(); <br>
	 * Garantit autre.isPlein(); getQuantite() == oldQuantite() - old
	 * autre.getEspaceLibre();
	 * 
	 * @param autre
	 */

	public void remplir(Recipient autre) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

	/**
	 * Vider dans autre <br>
	 * Requiert getQuantite()&lt;= autre.getEspaceLibre(); <br>
	 * Garanti isVide(); autre.getQuantite() == old autre.getQuentite() + old
	 * 
	 * @param autre
	 */
	public void viderDans(Recipient autre) {
		throw new UnsupportedOperationException("Not yet implemented");

	}

}
