package co.edu.unicauca.prematricula.entities;

public class Usuario implements Bean{

	private long id;
	private String usuario;
	private String password;
	private int privilegio;
	
	public Usuario(){}
	
	public Usuario(long id, String usuario, String password, int privilegio) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.privilegio = privilegio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPrivilegio() {
		return privilegio;
	}
	public void setPrivilegio(int privilegio) {
		this.privilegio = privilegio;
	}
	
	
}
