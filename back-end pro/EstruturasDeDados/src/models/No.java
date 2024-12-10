package models;

public class No {

    private No prox;
    private No ant;
	private int n;

	
    public No getAnt() {
		return ant;
	}

	public void setAnt(No ant) {
		this.ant = ant;
	}

	

    public No(No prox, No ant, int n) {
		super();
		this.prox = prox;
		this.ant = ant;
		this.n = n;
	}

	public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

	@Override
	public String toString() {
		return "n=" + n;
	}

	
}
