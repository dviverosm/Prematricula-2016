/**
 * Materia.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.unicauca.prematriculas.control;

public class Materia  implements java.io.Serializable 
{
    private java.lang.String activa;

    private java.lang.String codigomateria;

    private int condiciones;

    private int correquisitos;

    private int creditos;

    private java.lang.String electiva;

    private int escorrequisitode;

    private int estado;

    private java.util.Calendar fechaEdicionMicrocurriculo;

    private int horassemana;

    private boolean laboratorio;

    private java.lang.String materia;

    private boolean microcurriculoDisponible;

    private int oidelectiva;

    private int oidmateria;

    private int oidmateriaPensum;

    private int oidprograma;

    private int semestre;

    public Materia() {
    }

    public Materia(
           java.lang.String activa,
           java.lang.String codigomateria,
           int condiciones,
           int correquisitos,
           int creditos,
           java.lang.String electiva,
           int escorrequisitode,
           int estado,
           java.util.Calendar fechaEdicionMicrocurriculo,
           int horassemana,
           boolean laboratorio,
           java.lang.String materia,
           boolean microcurriculoDisponible,
           int oidelectiva,
           int oidmateria,
           int oidmateriaPensum,
           int oidprograma,
           int semestre) {
           this.activa = activa;
           this.codigomateria = codigomateria;
           this.condiciones = condiciones;
           this.correquisitos = correquisitos;
           this.creditos = creditos;
           this.electiva = electiva;
           this.escorrequisitode = escorrequisitode;
           this.estado = estado;
           this.fechaEdicionMicrocurriculo = fechaEdicionMicrocurriculo;
           this.horassemana = horassemana;
           this.laboratorio = laboratorio;
           this.materia = materia;
           this.microcurriculoDisponible = microcurriculoDisponible;
           this.oidelectiva = oidelectiva;
           this.oidmateria = oidmateria;
           this.oidmateriaPensum = oidmateriaPensum;
           this.oidprograma = oidprograma;
           this.semestre = semestre;
    }


    /**
     * Gets the activa value for this Materia.
     * 
     * @return activa
     */
    public java.lang.String getActiva() {
        return activa;
    }


    /**
     * Sets the activa value for this Materia.
     * 
     * @param activa
     */
    public void setActiva(java.lang.String activa) {
        this.activa = activa;
    }


    /**
     * Gets the codigomateria value for this Materia.
     * 
     * @return codigomateria
     */
    public java.lang.String getCodigomateria() {
        return codigomateria;
    }


    /**
     * Sets the codigomateria value for this Materia.
     * 
     * @param codigomateria
     */
    public void setCodigomateria(java.lang.String codigomateria) {
        this.codigomateria = codigomateria;
    }


    /**
     * Gets the condiciones value for this Materia.
     * 
     * @return condiciones
     */
    public int getCondiciones() {
        return condiciones;
    }


    /**
     * Sets the condiciones value for this Materia.
     * 
     * @param condiciones
     */
    public void setCondiciones(int condiciones) {
        this.condiciones = condiciones;
    }


    /**
     * Gets the correquisitos value for this Materia.
     * 
     * @return correquisitos
     */
    public int getCorrequisitos() {
        return correquisitos;
    }


    /**
     * Sets the correquisitos value for this Materia.
     * 
     * @param correquisitos
     */
    public void setCorrequisitos(int correquisitos) {
        this.correquisitos = correquisitos;
    }


    /**
     * Gets the creditos value for this Materia.
     * 
     * @return creditos
     */
    public int getCreditos() {
        return creditos;
    }


    /**
     * Sets the creditos value for this Materia.
     * 
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    /**
     * Gets the electiva value for this Materia.
     * 
     * @return electiva
     */
    public java.lang.String getElectiva() {
        return electiva;
    }


    /**
     * Sets the electiva value for this Materia.
     * 
     * @param electiva
     */
    public void setElectiva(java.lang.String electiva) {
        this.electiva = electiva;
    }


    /**
     * Gets the escorrequisitode value for this Materia.
     * 
     * @return escorrequisitode
     */
    public int getEscorrequisitode() {
        return escorrequisitode;
    }


    /**
     * Sets the escorrequisitode value for this Materia.
     * 
     * @param escorrequisitode
     */
    public void setEscorrequisitode(int escorrequisitode) {
        this.escorrequisitode = escorrequisitode;
    }


    /**
     * Gets the estado value for this Materia.
     * 
     * @return estado
     */
    public int getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Materia.
     * 
     * @param estado
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }


    /**
     * Gets the fechaEdicionMicrocurriculo value for this Materia.
     * 
     * @return fechaEdicionMicrocurriculo
     */
    public java.util.Calendar getFechaEdicionMicrocurriculo() {
        return fechaEdicionMicrocurriculo;
    }


    /**
     * Sets the fechaEdicionMicrocurriculo value for this Materia.
     * 
     * @param fechaEdicionMicrocurriculo
     */
    public void setFechaEdicionMicrocurriculo(java.util.Calendar fechaEdicionMicrocurriculo) {
        this.fechaEdicionMicrocurriculo = fechaEdicionMicrocurriculo;
    }


    /**
     * Gets the horassemana value for this Materia.
     * 
     * @return horassemana
     */
    public int getHorassemana() {
        return horassemana;
    }


    /**
     * Sets the horassemana value for this Materia.
     * 
     * @param horassemana
     */
    public void setHorassemana(int horassemana) {
        this.horassemana = horassemana;
    }


    /**
     * Gets the laboratorio value for this Materia.
     * 
     * @return laboratorio
     */
    public boolean isLaboratorio() {
        return laboratorio;
    }


    /**
     * Sets the laboratorio value for this Materia.
     * 
     * @param laboratorio
     */
    public void setLaboratorio(boolean laboratorio) {
        this.laboratorio = laboratorio;
    }


    /**
     * Gets the materia value for this Materia.
     * 
     * @return materia
     */
    public java.lang.String getMateria() {
        return materia;
    }


    /**
     * Sets the materia value for this Materia.
     * 
     * @param materia
     */
    public void setMateria(java.lang.String materia) {
        this.materia = materia;
    }


    /**
     * Gets the microcurriculoDisponible value for this Materia.
     * 
     * @return microcurriculoDisponible
     */
    public boolean isMicrocurriculoDisponible() {
        return microcurriculoDisponible;
    }


    /**
     * Sets the microcurriculoDisponible value for this Materia.
     * 
     * @param microcurriculoDisponible
     */
    public void setMicrocurriculoDisponible(boolean microcurriculoDisponible) {
        this.microcurriculoDisponible = microcurriculoDisponible;
    }


    /**
     * Gets the oidelectiva value for this Materia.
     * 
     * @return oidelectiva
     */
    public int getOidelectiva() {
        return oidelectiva;
    }


    /**
     * Sets the oidelectiva value for this Materia.
     * 
     * @param oidelectiva
     */
    public void setOidelectiva(int oidelectiva) {
        this.oidelectiva = oidelectiva;
    }


    /**
     * Gets the oidmateria value for this Materia.
     * 
     * @return oidmateria
     */
    public int getOidmateria() {
        return oidmateria;
    }


    /**
     * Sets the oidmateria value for this Materia.
     * 
     * @param oidmateria
     */
    public void setOidmateria(int oidmateria) {
        this.oidmateria = oidmateria;
    }


    /**
     * Gets the oidmateriaPensum value for this Materia.
     * 
     * @return oidmateriaPensum
     */
    public int getOidmateriaPensum() {
        return oidmateriaPensum;
    }


    /**
     * Sets the oidmateriaPensum value for this Materia.
     * 
     * @param oidmateriaPensum
     */
    public void setOidmateriaPensum(int oidmateriaPensum) {
        this.oidmateriaPensum = oidmateriaPensum;
    }


    /**
     * Gets the oidprograma value for this Materia.
     * 
     * @return oidprograma
     */
    public int getOidprograma() {
        return oidprograma;
    }


    /**
     * Sets the oidprograma value for this Materia.
     * 
     * @param oidprograma
     */
    public void setOidprograma(int oidprograma) {
        this.oidprograma = oidprograma;
    }


    /**
     * Gets the semestre value for this Materia.
     * 
     * @return semestre
     */
    public int getSemestre() {
        return semestre;
    }


    /**
     * Sets the semestre value for this Materia.
     * 
     * @param semestre
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Materia)) return false;
        Materia other = (Materia) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activa==null && other.getActiva()==null) || 
             (this.activa!=null &&
              this.activa.equals(other.getActiva()))) &&
            ((this.codigomateria==null && other.getCodigomateria()==null) || 
             (this.codigomateria!=null &&
              this.codigomateria.equals(other.getCodigomateria()))) &&
            this.condiciones == other.getCondiciones() &&
            this.correquisitos == other.getCorrequisitos() &&
            this.creditos == other.getCreditos() &&
            ((this.electiva==null && other.getElectiva()==null) || 
             (this.electiva!=null &&
              this.electiva.equals(other.getElectiva()))) &&
            this.escorrequisitode == other.getEscorrequisitode() &&
            this.estado == other.getEstado() &&
            ((this.fechaEdicionMicrocurriculo==null && other.getFechaEdicionMicrocurriculo()==null) || 
             (this.fechaEdicionMicrocurriculo!=null &&
              this.fechaEdicionMicrocurriculo.equals(other.getFechaEdicionMicrocurriculo()))) &&
            this.horassemana == other.getHorassemana() &&
            this.laboratorio == other.isLaboratorio() &&
            ((this.materia==null && other.getMateria()==null) || 
             (this.materia!=null &&
              this.materia.equals(other.getMateria()))) &&
            this.microcurriculoDisponible == other.isMicrocurriculoDisponible() &&
            this.oidelectiva == other.getOidelectiva() &&
            this.oidmateria == other.getOidmateria() &&
            this.oidmateriaPensum == other.getOidmateriaPensum() &&
            this.oidprograma == other.getOidprograma() &&
            this.semestre == other.getSemestre();
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
        if (getActiva() != null) {
            _hashCode += getActiva().hashCode();
        }
        if (getCodigomateria() != null) {
            _hashCode += getCodigomateria().hashCode();
        }
        _hashCode += getCondiciones();
        _hashCode += getCorrequisitos();
        _hashCode += getCreditos();
        if (getElectiva() != null) {
            _hashCode += getElectiva().hashCode();
        }
        _hashCode += getEscorrequisitode();
        _hashCode += getEstado();
        if (getFechaEdicionMicrocurriculo() != null) {
            _hashCode += getFechaEdicionMicrocurriculo().hashCode();
        }
        _hashCode += getHorassemana();
        _hashCode += (isLaboratorio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMateria() != null) {
            _hashCode += getMateria().hashCode();
        }
        _hashCode += (isMicrocurriculoDisponible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOidelectiva();
        _hashCode += getOidmateria();
        _hashCode += getOidmateriaPensum();
        _hashCode += getOidprograma();
        _hashCode += getSemestre();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Materia.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "materia"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigomateria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigomateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condiciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condiciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correquisitos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correquisitos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("electiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "electiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escorrequisitode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "escorrequisitode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaEdicionMicrocurriculo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaEdicionMicrocurriculo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horassemana");
        elemField.setXmlName(new javax.xml.namespace.QName("", "horassemana"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laboratorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "laboratorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("microcurriculoDisponible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "microcurriculoDisponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidelectiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidelectiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidmateria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidmateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidmateriaPensum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidmateriaPensum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidprograma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidprograma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semestre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "semestre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
           java.lang.Class _javaType,  
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
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
