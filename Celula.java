public class Celula {
     public Celula(Object elemento, Object elemento2) {
		super();
		this.elemento = elemento;
		this.proximo = elemento2;
	}
	private Object elemento;
	private Celula anterior;
    private Celula proximo;
    public Celula(Object elemento) {
    	this(null, elemento);
    }
    
    
    
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	public Object getElemento() {
		return elemento;
	}
    public Celula getAnterior() {
    	return anterior;
    }
    public void setAnterior(Celula anterior) {
    	this.anterior = anterior;
    }
    
    
    
    
}
