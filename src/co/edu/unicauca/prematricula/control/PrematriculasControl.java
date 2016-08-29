/**
 * PrematriculasControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.unicauca.prematriculas.control;

public interface PrematriculasControl extends java.rmi.Remote 
{
    public co.edu.unicauca.prematriculas.control.Estudiante cargarDatosEstudiante(java.lang.String arg0) throws java.rmi.RemoteException;
    public co.edu.unicauca.prematriculas.control.Nota[] cargarHistoriaAcademica(java.lang.String arg0) throws java.rmi.RemoteException;
    public co.edu.unicauca.prematriculas.control.MateriaPensum[] cargarPensum(java.lang.String arg0) throws java.rmi.RemoteException;
    public co.edu.unicauca.prematriculas.control.Docente cargarDatosDocente(java.lang.String arg0) throws java.rmi.RemoteException;
}
