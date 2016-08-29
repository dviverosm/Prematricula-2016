package co.edu.unicauca.prematricula.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import co.edu.unicauca.prematricula.entities.PrematriculaBD;
import co.edu.unicauca.prematricula.persistencia.Conexion;

public class PrematriculaDao {

	public PrematriculaDao(){
		
	}
	
	public static void createPrematricula(PrematriculaBD p) throws SQLException{
		if(verifyMateria(p.getMatCodigo())){
			insertMateria(Integer.parseInt(p.getMatCodigo()), p.getMatCodigo(), p.getMatNombre(), p.getMatSemestre(), p.getMatPrograma());
		}
		if(verifyUsuario(p.getUsuCodigo())){
			insertUsuario(p.getUsuCodigo(), p.getUsuNombre());
		}
		
		insertPrematricula(p.getUsuCodigo(), Integer.parseInt(p.getMatCodigo()), dateToString(p.getPreFecha()), p.getMatPrograma());
	}
	
	public static boolean realizoPrematricula(String codigo, String fini, String ffin){
		boolean resultB = false;
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT * FROM usuario u, prematricula p " +
						"WHERE u.usu_codigo = p.usu_codigo AND u.usu_codigo = "+codigo+" AND " +
						"p.pre_fecha BETWEEN TO_DATE('"+fini+"') AND TO_DATE('"+ffin+"')";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		
		try {
			if(result.next()){
				resultB = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultB;
	}
	
	private static void insertMateria(int id, String codigo, String nombre, int semestre, int programa) throws SQLException{
		Conexion objCon = new Conexion("Prematricula");
		String query = "INSERT INTO MATERIA (MAT_ID, MAT_CODIGO, MAT_NOMBRE, MAT_SEMESTRE, MAT_PROGRAMA) " +
						"VALUES ("+id+", '"+codigo+"', '"+nombre+"', "+semestre+", "+programa+")";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		result.close();
		objCon.close();
	}
	
	private static void insertUsuario(int codigo, String nombre) throws SQLException {
		Conexion objCon = new Conexion("Prematricula");
		String query = "INSERT INTO USUARIO (USU_CODIGO, USU_NOMBRE) " +
						"VALUES ("+codigo+", '"+nombre+"')";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		result.close();
		objCon.close();
	}
	
	private static void insertPrematricula(int usuario, int materia, String fecha, int programa) throws SQLException {
		Conexion objCon = new Conexion("Prematricula");
		String query = "INSERT INTO PREMATRICULA (USU_CODIGO, MAT_ID, PRE_FECHA, OIDPROGRAMA) " +
						"VALUES ("+usuario+", "+materia+", TO_DATE('"+fecha+"', 'YYYY-MM-DD'), "+programa+")";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		result.close();
		objCon.close();
	}
	
	private static boolean verifyMateria(String codigo) throws SQLException{
		boolean bResult = true;
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT * FROM MATERIA WHERE MAT_CODIGO = '"+codigo+"'";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		try{
			if(result.next()){
				bResult = false;
			}
		}catch(Exception e){}
		result.close();
		objCon.close();
		
		return bResult;
	}
	
	private static boolean verifyUsuario(int codigo) throws SQLException{
		boolean bResult = true;
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT * FROM USUARIO WHERE USU_CODIGO = "+codigo;
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		try{
			if(result.next()){
				bResult = false;
			}
		}catch(Exception e){}
		result.close();
		objCon.close();
		
		return bResult;
	}
	
	public static ArrayList<PrematriculaBD> readPrematricula(String fini, String ffin, int oid){
		ArrayList<PrematriculaBD> list = new ArrayList<PrematriculaBD>();
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT DISTINCT m.mat_nombre, m.mat_programa, m.mat_codigo, m.mat_semestre, p.pre_fecha, t.inscritos " +
						"FROM materia m, (SELECT mat_id, COUNT(mat_id) AS inscritos " +
										 "FROM prematricula " +
										 "WHERE oidprograma = " +oid +" "+
										 "GROUP BY mat_id " +
										 "HAVING COUNT(mat_id)>0 ) t, prematricula p " +
										 "WHERE m.mat_id = t.mat_id AND m.mat_id = p.mat_id AND " +
										 "p.pre_fecha BETWEEN TO_DATE('"+fini+"') AND TO_DATE('"+ffin+"') " +
										 "ORDER BY m.mat_semestre";
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		try{
			while(result.next()){
				PrematriculaBD p = new PrematriculaBD();
				p.setMatNombre(result.getString("MAT_NOMBRE"));
				p.setMatPrograma(Integer.parseInt(result.getString("MAT_PROGRAMA")));
				p.setMatCodigo(result.getString("MAT_CODIGO"));
				p.setMatSemestre(Integer.parseInt(result.getString("MAT_SEMESTRE")));
				p.setPreInscritos(Integer.parseInt(result.getString("INSCRITOS")));
				p = selectMateria(p);
				p = selectUsuario(p);
				list.add(p);
			}
		}catch(Exception e){}
		
		return list;
	}
	
	private static PrematriculaBD selectMateria(PrematriculaBD p){
		PrematriculaBD pre = p;
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT * FROM MATERIA WHERE MAT_ID = "+p.getMatId();
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		try{
			if(result.next()){
				pre.setMatCodigo(result.getString("MAT_CODIGO"));
				pre.setMatNombre(result.getString("MAT_NOMBRE"));
				pre.setMatSemestre(result.getInt("MAT_SEMESTRE"));
				pre.setMatPrograma(result.getInt("MAT_PROGRAMA"));
			}
		}catch(Exception e){}
		
		return pre;
	}
	
	private static PrematriculaBD selectUsuario(PrematriculaBD p){
		PrematriculaBD pre = p;
		
		Conexion objCon = new Conexion("Prematricula");
		String query = "SELECT * FROM USUARIO WHERE USU_CODIGO = "+p.getUsuCodigo();
		ResultSet result = null;
		result = objCon.executeQueryRSET(query);
		try{
			if(result.next()){
				pre.setUsuNombre(result.getString("USUNOMBRE"));
			}
		}catch(Exception e){}
		
		return pre;
	}
	
	private static String dateToString(Date date){
		
		String result;
		
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		result = c.get(Calendar.YEAR)+"-"+(c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.DATE);
		
		return result;
	}
	
}
