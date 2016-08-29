/**
 * Nota.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.unicauca.prematriculas.control;

public class Nota  implements java.io.Serializable 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean anulado;

    private java.lang.String codigoEstudiante;

    private java.lang.String creditos;

    private java.lang.String cualitativa;

    private java.lang.String definitiva;

    private int estado;

    private java.lang.String fecha;

    private java.lang.String habilitacion;

    private java.lang.String materia;

    private boolean noPresento;

    private java.lang.String nombreEstudiante;

    private java.lang.String nota;

    private java.lang.String oidEstudiante;

    private java.lang.String oidGrupo;

    private java.lang.String oidMateria;

    private java.lang.String periodo;

    private int posicion;

    private boolean promedia;

    private java.lang.String recibo;

    private java.lang.String reconocimiento;

    private java.lang.String requisitoGrado;

    private java.lang.String semestre;

    private boolean soloLectura;

    private java.lang.String tiponota;

    private java.lang.String usuario;

    public Nota() {
    }

    public Nota(
           boolean anulado,
           java.lang.String codigoEstudiante,
           java.lang.String creditos,
           java.lang.String cualitativa,
           java.lang.String definitiva,
           int estado,
           java.lang.String fecha,
           java.lang.String habilitacion,
           java.lang.String materia,
           boolean noPresento,
           java.lang.String nombreEstudiante,
           java.lang.String nota,
           java.lang.String oidEstudiante,
           java.lang.String oidGrupo,
           java.lang.String oidMateria,
           java.lang.String periodo,
           int posicion,
           boolean promedia,
           java.lang.String recibo,
           java.lang.String reconocimiento,
           java.lang.String requisitoGrado,
           java.lang.String semestre,
           boolean soloLectura,
           java.lang.String tiponota,
           java.lang.String usuario) {
           this.anulado = anulado;
           this.codigoEstudiante = codigoEstudiante;
           this.creditos = creditos;
           this.cualitativa = cualitativa;
           this.definitiva = definitiva;
           this.estado = estado;
           this.fecha = fecha;
           this.habilitacion = habilitacion;
           this.materia = materia;
           this.noPresento = noPresento;
           this.nombreEstudiante = nombreEstudiante;
           this.nota = nota;
           this.oidEstudiante = oidEstudiante;
           this.oidGrupo = oidGrupo;
           this.oidMateria = oidMateria;
           this.periodo = periodo;
           this.posicion = posicion;
           this.promedia = promedia;
           this.recibo = recibo;
           this.reconocimiento = reconocimiento;
           this.requisitoGrado = requisitoGrado;
           this.semestre = semestre;
           this.soloLectura = soloLectura;
           this.tiponota = tiponota;
           this.usuario = usuario;
    }


    /**
     * Gets the anulado value for this Nota.
     * 
     * @return anulado
     */
    public boolean isAnulado() 
    {
        return anulado;
    }


    /**
     * Sets the anulado value for this Nota.
     * 
     * @param anulado
     */
    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }


    /**
     * Gets the codigoEstudiante value for this Nota.
     * 
     * @return codigoEstudiante
     */
    public java.lang.String getCodigoEstudiante() {
        return codigoEstudiante;
    }


    /**
     * Sets the codigoEstudiante value for this Nota.
     * 
     * @param codigoEstudiante
     */
    public void setCodigoEstudiante(java.lang.String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }


    /**
     * Gets the creditos value for this Nota.
     * 
     * @return creditos
     */
    public java.lang.String getCreditos() {
        return creditos;
    }


    /**
     * Sets the creditos value for this Nota.
     * 
     * @param creditos
     */
    public void setCreditos(java.lang.String creditos) {
        this.creditos = creditos;
    }


    /**
     * Gets the cualitativa value for this Nota.
     * 
     * @return cualitativa
     */
    public java.lang.String getCualitativa() {
        return cualitativa;
    }


    /**
     * Sets the cualitativa value for this Nota.
     * 
     * @param cualitativa
     */
    public void setCualitativa(java.lang.String cualitativa) {
        this.cualitativa = cualitativa;
    }


    /**
     * Gets the definitiva value for this Nota.
     * 
     * @return definitiva
     */
    public java.lang.String getDefinitiva() {
        return definitiva;
    }


    /**
     * Sets the definitiva value for this Nota.
     * 
     * @param definitiva
     */
    public void setDefinitiva(java.lang.String definitiva) {
        this.definitiva = definitiva;
    }


    /**
     * Gets the estado value for this Nota.
     * 
     * @return estado
     */
    public int getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Nota.
     * 
     * @param estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }


    /**
     * Gets the fecha value for this Nota.
     * 
     * @return fecha
     */
    public java.lang.String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Nota.
     * 
     * @param fecha
     */
    public void setFecha(java.lang.String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the habilitacion value for this Nota.
     * 
     * @return habilitacion
     */
    public java.lang.String getHabilitacion() {
        return habilitacion;
    }


    /**
     * Sets the habilitacion value for this Nota.
     * 
     * @param habilitacion
     */
    public void setHabilitacion(java.lang.String habilitacion) {
        this.habilitacion = habilitacion;
    }


    /**
     * Gets the materia value for this Nota.
     * 
     * @return materia
     */
    public java.lang.String getMateria() {
        return materia;
    }


    /**
     * Sets the materia value for this Nota.
     * 
     * @param materia
     */
    public void setMateria(java.lang.String materia) {
        this.materia = materia;
    }


    /**
     * Gets the noPresento value for this Nota.
     * 
     * @return noPresento
     */
    public boolean isNoPresento() {
        return noPresento;
    }


    /**
     * Sets the noPresento value for this Nota.
     * 
     * @param noPresento
     */
    public void setNoPresento(boolean noPresento) {
        this.noPresento = noPresento;
    }


    /**
     * Gets the nombreEstudiante value for this Nota.
     * 
     * @return nombreEstudiante
     */
    public java.lang.String getNombreEstudiante() {
        return nombreEstudiante;
    }


    /**
     * Sets the nombreEstudiante value for this Nota.
     * 
     * @param nombreEstudiante
     */
    public void setNombreEstudiante(java.lang.String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }


    /**
     * Gets the nota value for this Nota.
     * 
     * @return nota
     */
    public java.lang.String getNota() {
        return nota;
    }


    /**
     * Sets the nota value for this Nota.
     * 
     * @param nota
     */
    public void setNota(java.lang.String nota) {
        this.nota = nota;
    }


    /**
     * Gets the oidEstudiante value for this Nota.
     * 
     * @return oidEstudiante
     */
    public java.lang.String getOidEstudiante() {
        return oidEstudiante;
    }


    /**
     * Sets the oidEstudiante value for this Nota.
     * 
     * @param oidEstudiante
     */
    public void setOidEstudiante(java.lang.String oidEstudiante) {
        this.oidEstudiante = oidEstudiante;
    }


    /**
     * Gets the oidGrupo value for this Nota.
     * 
     * @return oidGrupo
     */
    public java.lang.String getOidGrupo() {
        return oidGrupo;
    }


    /**
     * Sets the oidGrupo value for this Nota.
     * 
     * @param oidGrupo
     */
    public void setOidGrupo(java.lang.String oidGrupo) {
        this.oidGrupo = oidGrupo;
    }


    /**
     * Gets the oidMateria value for this Nota.
     * 
     * @return oidMateria
     */
    public java.lang.String getOidMateria() {
        return oidMateria;
    }


    /**
     * Sets the oidMateria value for this Nota.
     * 
     * @param oidMateria
     */
    public void setOidMateria(java.lang.String oidMateria) {
        this.oidMateria = oidMateria;
    }


    /**
     * Gets the periodo value for this Nota.
     * 
     * @return periodo
     */
    public java.lang.String getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this Nota.
     * 
     * @param periodo
     */
    public void setPeriodo(java.lang.String periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the posicion value for this Nota.
     * 
     * @return posicion
     */
    public int getPosicion() {
        return posicion;
    }


    /**
     * Sets the posicion value for this Nota.
     * 
     * @param posicion
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }


    /**
     * Gets the promedia value for this Nota.
     * 
     * @return promedia
     */
    public boolean isPromedia() {
        return promedia;
    }


    /**
     * Sets the promedia value for this Nota.
     * 
     * @param promedia
     */
    public void setPromedia(boolean promedia) {
        this.promedia = promedia;
    }


    /**
     * Gets the recibo value for this Nota.
     * 
     * @return recibo
     */
    public java.lang.String getRecibo() {
        return recibo;
    }


    /**
     * Sets the recibo value for this Nota.
     * 
     * @param recibo
     */
    public void setRecibo(java.lang.String recibo) {
        this.recibo = recibo;
    }


    /**
     * Gets the reconocimiento value for this Nota.
     * 
     * @return reconocimiento
     */
    public java.lang.String getReconocimiento() {
        return reconocimiento;
    }


    /**
     * Sets the reconocimiento value for this Nota.
     * 
     * @param reconocimiento
     */
    public void setReconocimiento(java.lang.String reconocimiento) {
        this.reconocimiento = reconocimiento;
    }


    /**
     * Gets the requisitoGrado value for this Nota.
     * 
     * @return requisitoGrado
     */
    public java.lang.String getRequisitoGrado() {
        return requisitoGrado;
    }


    /**
     * Sets the requisitoGrado value for this Nota.
     * 
     * @param requisitoGrado
     */
    public void setRequisitoGrado(java.lang.String requisitoGrado) {
        this.requisitoGrado = requisitoGrado;
    }


    /**
     * Gets the semestre value for this Nota.
     * 
     * @return semestre
     */
    public java.lang.String getSemestre() {
        return semestre;
    }


    /**
     * Sets the semestre value for this Nota.
     * 
     * @param semestre
     */
    public void setSemestre(java.lang.String semestre) {
        this.semestre = semestre;
    }


    /**
     * Gets the soloLectura value for this Nota.
     * 
     * @return soloLectura
     */
    public boolean isSoloLectura() {
        return soloLectura;
    }


    /**
     * Sets the soloLectura value for this Nota.
     * 
     * @param soloLectura
     */
    public void setSoloLectura(boolean soloLectura) {
        this.soloLectura = soloLectura;
    }


    /**
     * Gets the tiponota value for this Nota.
     * 
     * @return tiponota
     */
    public java.lang.String getTiponota() {
        return tiponota;
    }


    /**
     * Sets the tiponota value for this Nota.
     * 
     * @param tiponota
     */
    public void setTiponota(java.lang.String tiponota) {
        this.tiponota = tiponota;
    }


    /**
     * Gets the usuario value for this Nota.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this Nota.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nota)) return false;
        Nota other = (Nota) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.anulado == other.isAnulado() &&
            ((this.codigoEstudiante==null && other.getCodigoEstudiante()==null) || 
             (this.codigoEstudiante!=null &&
              this.codigoEstudiante.equals(other.getCodigoEstudiante()))) &&
            ((this.creditos==null && other.getCreditos()==null) || 
             (this.creditos!=null &&
              this.creditos.equals(other.getCreditos()))) &&
            ((this.cualitativa==null && other.getCualitativa()==null) || 
             (this.cualitativa!=null &&
              this.cualitativa.equals(other.getCualitativa()))) &&
            ((this.definitiva==null && other.getDefinitiva()==null) || 
             (this.definitiva!=null &&
              this.definitiva.equals(other.getDefinitiva()))) &&
            this.estado == other.getEstado() &&
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.habilitacion==null && other.getHabilitacion()==null) || 
             (this.habilitacion!=null &&
              this.habilitacion.equals(other.getHabilitacion()))) &&
            ((this.materia==null && other.getMateria()==null) || 
             (this.materia!=null &&
              this.materia.equals(other.getMateria()))) &&
            this.noPresento == other.isNoPresento() &&
            ((this.nombreEstudiante==null && other.getNombreEstudiante()==null) || 
             (this.nombreEstudiante!=null &&
              this.nombreEstudiante.equals(other.getNombreEstudiante()))) &&
            ((this.nota==null && other.getNota()==null) || 
             (this.nota!=null &&
              this.nota.equals(other.getNota()))) &&
            ((this.oidEstudiante==null && other.getOidEstudiante()==null) || 
             (this.oidEstudiante!=null &&
              this.oidEstudiante.equals(other.getOidEstudiante()))) &&
            ((this.oidGrupo==null && other.getOidGrupo()==null) || 
             (this.oidGrupo!=null &&
              this.oidGrupo.equals(other.getOidGrupo()))) &&
            ((this.oidMateria==null && other.getOidMateria()==null) || 
             (this.oidMateria!=null &&
              this.oidMateria.equals(other.getOidMateria()))) &&
            ((this.periodo==null && other.getPeriodo()==null) || 
             (this.periodo!=null &&
              this.periodo.equals(other.getPeriodo()))) &&
            this.posicion == other.getPosicion() &&
            this.promedia == other.isPromedia() &&
            ((this.recibo==null && other.getRecibo()==null) || 
             (this.recibo!=null &&
              this.recibo.equals(other.getRecibo()))) &&
            ((this.reconocimiento==null && other.getReconocimiento()==null) || 
             (this.reconocimiento!=null &&
              this.reconocimiento.equals(other.getReconocimiento()))) &&
            ((this.requisitoGrado==null && other.getRequisitoGrado()==null) || 
             (this.requisitoGrado!=null &&
              this.requisitoGrado.equals(other.getRequisitoGrado()))) &&
            ((this.semestre==null && other.getSemestre()==null) || 
             (this.semestre!=null &&
              this.semestre.equals(other.getSemestre()))) &&
            this.soloLectura == other.isSoloLectura() &&
            ((this.tiponota==null && other.getTiponota()==null) || 
             (this.tiponota!=null &&
              this.tiponota.equals(other.getTiponota()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAnulado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCodigoEstudiante() != null) {
            _hashCode += getCodigoEstudiante().hashCode();
        }
        if (getCreditos() != null) {
            _hashCode += getCreditos().hashCode();
        }
        if (getCualitativa() != null) {
            _hashCode += getCualitativa().hashCode();
        }
        if (getDefinitiva() != null) {
            _hashCode += getDefinitiva().hashCode();
        }
        _hashCode += getEstado();
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getHabilitacion() != null) {
            _hashCode += getHabilitacion().hashCode();
        }
        if (getMateria() != null) {
            _hashCode += getMateria().hashCode();
        }
        _hashCode += (isNoPresento() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNombreEstudiante() != null) {
            _hashCode += getNombreEstudiante().hashCode();
        }
        if (getNota() != null) {
            _hashCode += getNota().hashCode();
        }
        if (getOidEstudiante() != null) {
            _hashCode += getOidEstudiante().hashCode();
        }
        if (getOidGrupo() != null) {
            _hashCode += getOidGrupo().hashCode();
        }
        if (getOidMateria() != null) {
            _hashCode += getOidMateria().hashCode();
        }
        if (getPeriodo() != null) {
            _hashCode += getPeriodo().hashCode();
        }
        _hashCode += getPosicion();
        _hashCode += (isPromedia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecibo() != null) {
            _hashCode += getRecibo().hashCode();
        }
        if (getReconocimiento() != null) {
            _hashCode += getReconocimiento().hashCode();
        }
        if (getRequisitoGrado() != null) {
            _hashCode += getRequisitoGrado().hashCode();
        }
        if (getSemestre() != null) {
            _hashCode += getSemestre().hashCode();
        }
        _hashCode += (isSoloLectura() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTiponota() != null) {
            _hashCode += getTiponota().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nota.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "nota"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anulado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anulado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEstudiante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEstudiante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cualitativa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cualitativa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("definitiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "definitiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("habilitacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "habilitacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPresento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noPresento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEstudiante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreEstudiante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidEstudiante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidEstudiante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidGrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidGrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidMateria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidMateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promedia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promedia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recibo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recibo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reconocimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reconocimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisitoGrado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requisitoGrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semestre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semestre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("soloLectura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "soloLectura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiponota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tiponota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
