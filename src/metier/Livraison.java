package metier;

public class Livraison {
	public Livraison(int id, EtatLivraison etat, Livreur livreur, Transport transport) {
		super();
		this.id = id;
		this.etat = etat;
		this.livreur = livreur;
		this.transport = transport;
	}
	public int id;
	public EtatLivraison etat;
	public Livreur livreur;
	public Transport transport;

}
