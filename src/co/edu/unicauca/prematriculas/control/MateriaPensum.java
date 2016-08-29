/**
 * MateriaPensum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.unicauca.prematriculas.control;

public class MateriaPensum  implements java.io.Serializable 
{
    private java.lang.String codigomateria;

    private int creditos;

    private java.lang.String materia;

    private co.edu.unicauca.prematriculas.control.Materia[] materiasCorrequisito;

    private co.edu.unicauca.prematriculas.control.Materia[] materiasPrerrequisito;

    private boolean microcurriculoDisponible;

    private int oidmateria;

    private boolean requisitogrado;

    private int semestre;

    public MateriaPensum() {
    }

    public MateriaPensum(
           java.lang.String codigomateria,
           int creditos,
           java.lang.String materia,
           co.edu.unicauca.prematriculas.control.Materia[] materiasCorrequisito,
           co.edu.unicauca.prematriculas.control.Materia[] materiasPrerrequisito,
           boolean microcurriculoDisponible,
           int oidmateria,
           boolean requisitogrado,
           int semestre) {
           this.codigomateria = codigomateria;
           this.creditos = creditos;
           this.materia = materia;
           this.materiasCorrequisito = materiasCorrequisito;
           this.materiasPrerrequisito = materiasPrerrequisito;
           this.microcurriculoDisponible = microcurriculoDisponible;
           this.oidmateria = oidmateria;
           this.requisitogrado = requisitogrado;
           this.semestre = semestre;
    }


    /**
     * Gets the codigomateria value for this MateriaPensum.
     * 
     * @return codigomateria
     */
    public java.lang.String getCodigomateria() {
        return codigomateria;
    }


    /**
     * Sets the codigomateria value for this MateriaPensum.
     * 
     * @param codigomateria
     */
    public void setCodigomateria(java.lang.String codigomateria) {
        this.codigomateria = codigomateria;
    }


    /**
     * Gets the creditos value for this MateriaPensum.
     * 
     * @return creditos
     */
    public int getCreditos() {
        return creditos;
    }


    /**
     * Sets the creditos value for this MateriaPensum.
     * 
     * @param creditos
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }


    /**
     * Gets the materia value for this MateriaPensum.
     * 
     * @return materia
     */
    public java.lang.String getMateria() {
        return materia;
    }


    /**
     * Sets the materia value for this MateriaPensum.
     * 
     * @param materia
     */
    public void setMateria(java.lang.String materia) {
        this.materia = materia;
    }


    /**
     * Gets the materiasCorrequisito value for this MateriaPensum.
     * 
     * @return materiasCorrequisito
     */
    public co.edu.unicauca.prematriculas.control.Materia[] getMateriasCorrequisito() {
        return materiasCorrequisito;
    }


    /**
     * Sets the materiasCorrequisito value for this MateriaPensum.
     * 
     * @param materiasCorrequisito
     */
    public void setMateriasCorrequisito(co.edu.unicauca.prematriculas.control.Materia[] materiasCorrequisito) {
        this.materiasCorrequisito = materiasCorrequisito;
    }

    public co.edu.unicauca.prematriculas.control.Materia getMateriasCorrequisito(int i) {
        return this.materiasCorrequisito[i];
    }

    public void setMateriasCorrequisito(int i, co.edu.unicauca.prematriculas.control.Materia _value) {
        this.materiasCorrequisito[i] = _value;
    }


    /**
     * Gets the materiasPrerrequisito value for this MateriaPensum.
     * 
     * @return materiasPrerrequisito
     */
    public co.edu.unicauca.prematriculas.control.Materia[] getMateriasPrerrequisito() {
        return materiasPrerrequisito;
    }


    /**
     * Sets the materiasPrerrequisito value for this MateriaPensum.
     * 
     * @param materiasPrerrequisito
     */
    public void setMateriasPrerrequisito(co.edu.unicauca.prematriculas.control.Materia[] materiasPrerrequisito) {
        this.materiasPrerrequisito = materiasPrerrequisito;
    }

    public co.edu.unicauca.prematriculas.control.Materia getMateriasPrerrequisito(int i) {
        return this.materiasPrerrequisito[i];
    }

    public void setMateriasPrerrequisito(int i, co.edu.unicauca.prematriculas.control.Materia _value) {
        this.materiasPrerrequisito[i] = _value;
    }


    /**
     * Gets the microcurriculoDisponible value for this MateriaPensum.
     * 
     * @return microcurriculoDisponible
     */
    public boolean isMicrocurriculoDisponible() {
        return microcurriculoDisponible;
    }


    /**
     * Sets the microcurriculoDisponible value for this MateriaPensum.
     * 
     * @param microcurriculoDisponible
     */
    public void setMicrocurriculoDisponible(boolean microcurriculoDisponible) {
        this.microcurriculoDisponible = microcurriculoDisponible;
    }


    /**
     * Gets the oidmateria value for this MateriaPensum.
     * 
     * @return oidmateria
     */
    public int getOidmateria() {
        return oidmateria;
    }


    /**
     * Sets the oidmateria value for this MateriaPensum.
     * 
     * @param oidmateria
     */
    public void setOidmateria(int oidmateria) {
        this.oidmateria = oidmateria;
    }


    /**
     * Gets the requisitogrado value for this MateriaPensum.
     * 
     * @return requisitogrado
     */
    public boolean isRequisitogrado() {
        return requisitogrado;
    }


    /**
     * Sets the requisitogrado value for this MateriaPensum.
     * 
     * @param requisitogrado
     */
    public void setRequisitogrado(boolean requisitogrado) {
        this.requisitogrado = requisitogrado;
    }


    /**
     * Gets the semestre value for this MateriaPensum.
     * 
     * @return semestre
     */
    public int getSemestre() {
        return semestre;
    }


    /**
     * Sets the semestre value for this MateriaPensum.
     * 
     * @param semestre
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MateriaPensum)) return false;
        MateriaPensum other = (MateriaPensum) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigomateria==null && other.getCodigomateria()==null) || 
             (this.codigomateria!=null &&
              this.codigomateria.equals(other.getCodigomateria()))) &&
            this.creditos == other.getCreditos() &&
            ((this.materia==null && other.getMateria()==null) || 
             (this.materia!=null &&
              this.materia.equals(other.getMateria()))) &&
            ((this.materiasCorrequisito==null && other.getMateriasCorrequisito()==null) || 
             (this.materiasCorrequisito!=null &&
              java.util.Arrays.equals(this.materiasCorrequisito, other.getMateriasCorrequisito()))) &&
            ((this.materiasPrerrequisito==null && other.getMateriasPrerrequisito()==null) || 
             (this.materiasPrerrequisito!=null &&
              java.util.Arrays.equals(this.materiasPrerrequisito, other.getMateriasPrerrequisito()))) &&
            this.microcurriculoDisponible == other.isMicrocurriculoDisponible() &&
            this.oidmateria == other.getOidmateria() &&
            this.requisitogrado == other.isRequisitogrado() &&
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
        if (getCodigomateria() != null) {
            _hashCode += getCodigomateria().hashCode();
        }
        _hashCode += getCreditos();
        if (getMateria() != null) {
            _hashCode += getMateria().hashCode();
        }
        if (getMateriasCorrequisito() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMateriasCorrequisito());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMateriasCorrequisito(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMateriasPrerrequisito() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMateriasPrerrequisito());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMateriasPrerrequisito(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isMicrocurriculoDisponible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOidmateria();
        _hashCode += (isRequisitogrado() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getSemestre();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MateriaPensum.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "materiaPensum"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigomateria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigomateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creditos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("materiasCorrequisito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materiasCorrequisito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "materia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materiasPrerrequisito");
        elemField.setXmlName(new javax.xml.namespace.QName("", "materiasPrerrequisito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "materia"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microcurriculoDisponible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "microcurriculoDisponible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oidmateria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oidmateria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requisitogrado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requisitogrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
