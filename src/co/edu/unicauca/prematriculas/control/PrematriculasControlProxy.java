package co.edu.unicauca.prematriculas.control;

public class PrematriculasControlProxy implements co.edu.unicauca.prematriculas.control.PrematriculasControl {
  private String _endpoint = null;
  private co.edu.unicauca.prematriculas.control.PrematriculasControl prematriculasControl = null;
  
  public PrematriculasControlProxy() {
    _initPrematriculasControlProxy();
  }
  
  public PrematriculasControlProxy(String endpoint) {
    _endpoint = endpoint;
    _initPrematriculasControlProxy();
  }
  
  private void _initPrematriculasControlProxy() {
    try {
      prematriculasControl = (new co.edu.unicauca.prematriculas.control.PrematriculasControlServiceLocator()).getPrematriculasControlPort();
      if (prematriculasControl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)prematriculasControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)prematriculasControl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (prematriculasControl != null)
      ((javax.xml.rpc.Stub)prematriculasControl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edu.unicauca.prematriculas.control.PrematriculasControl getPrematriculasControl() {
    if (prematriculasControl == null)
      _initPrematriculasControlProxy();
    return prematriculasControl;
  }
  
  public co.edu.unicauca.prematriculas.control.Estudiante cargarDatosEstudiante(java.lang.String arg0) throws java.rmi.RemoteException{
    if (prematriculasControl == null)
      _initPrematriculasControlProxy();
    return prematriculasControl.cargarDatosEstudiante(arg0);
  }
  
  public co.edu.unicauca.prematriculas.control.Nota[] cargarHistoriaAcademica(java.lang.String arg0) throws java.rmi.RemoteException{
    if (prematriculasControl == null)
      _initPrematriculasControlProxy();
    return prematriculasControl.cargarHistoriaAcademica(arg0);
  }
  
  public co.edu.unicauca.prematriculas.control.MateriaPensum[] cargarPensum(java.lang.String arg0) throws java.rmi.RemoteException{
    if (prematriculasControl == null)
      _initPrematriculasControlProxy();
    return prematriculasControl.cargarPensum(arg0);
  }
  
  public co.edu.unicauca.prematriculas.control.Docente cargarDatosDocente(java.lang.String arg0) throws java.rmi.RemoteException{
    if (prematriculasControl == null)
      _initPrematriculasControlProxy();
    return prematriculasControl.cargarDatosDocente(arg0);
  }
  
  
}