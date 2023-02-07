package ejercicio1;

public class Publicacion implements IOperaciones{

	private String titulo;
	private int id;
	private boolean prestado;
	private int anioPublicacion;
	
	public Publicacion(String titulo, int id, boolean prestado, int anioPublicacion) {
		super();
		this.titulo = titulo;
		this.id = id;
		this.prestado = prestado;
		this.anioPublicacion = anioPublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	@Override
	public String toString() {
		return "Publicacion [titulo=" + titulo + ", id=" + id + ", prestado=" + prestado + ", anioPublicacion="
				+ anioPublicacion + "]";
	}
	
	public void prestar(Publicacion p) {
		setPrestado(false);
	}

	@Override
	public int calcularPrestados() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
