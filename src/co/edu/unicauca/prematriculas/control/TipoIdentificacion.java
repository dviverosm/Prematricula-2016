/**
 * TipoIdentificacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.edu.unicauca.prematriculas.control;

public class TipoIdentificacion implements java.io.Serializable 
{
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TipoIdentificacion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CEDULA = "CEDULA";
    public static final java.lang.String _TARJETAIDENTIDAD = "TARJETAIDENTIDAD";
    public static final java.lang.String _CEDULADEEXTRANJERIA = "CEDULADEEXTRANJERIA";
    public static final java.lang.String _PASAPORTE = "PASAPORTE";
    public static final java.lang.String _REGISTROCIVIL = "REGISTROCIVIL";
    public static final java.lang.String _NUMEROIDENTIFICACIÓNPERSONAL = "NUMEROIDENTIFICACIÓNPERSONAL";
    public static final java.lang.String _NUMEROUNICOIDENTIFICACIONPERSONAL = "NUMEROUNICOIDENTIFICACIONPERSONAL";
    public static final java.lang.String _NUMEROPORSECRETARIADEEDUCACION = "NUMEROPORSECRETARIADEEDUCACION";
    public static final java.lang.String _CERTIFICADOCABILDO = "CERTIFICADOCABILDO";
    public static final java.lang.String _TARJETAPROFESIONAL = "TARJETAPROFESIONAL";
    public static final java.lang.String _SERVICIONACIONALDEPRUEBAS = "SERVICIONACIONALDEPRUEBAS";
    public static final TipoIdentificacion CEDULA = new TipoIdentificacion(_CEDULA);
    public static final TipoIdentificacion TARJETAIDENTIDAD = new TipoIdentificacion(_TARJETAIDENTIDAD);
    public static final TipoIdentificacion CEDULADEEXTRANJERIA = new TipoIdentificacion(_CEDULADEEXTRANJERIA);
    public static final TipoIdentificacion PASAPORTE = new TipoIdentificacion(_PASAPORTE);
    public static final TipoIdentificacion REGISTROCIVIL = new TipoIdentificacion(_REGISTROCIVIL);
    public static final TipoIdentificacion NUMEROIDENTIFICACIÓNPERSONAL = new TipoIdentificacion(_NUMEROIDENTIFICACIÓNPERSONAL);
    public static final TipoIdentificacion NUMEROUNICOIDENTIFICACIONPERSONAL = new TipoIdentificacion(_NUMEROUNICOIDENTIFICACIONPERSONAL);
    public static final TipoIdentificacion NUMEROPORSECRETARIADEEDUCACION = new TipoIdentificacion(_NUMEROPORSECRETARIADEEDUCACION);
    public static final TipoIdentificacion CERTIFICADOCABILDO = new TipoIdentificacion(_CERTIFICADOCABILDO);
    public static final TipoIdentificacion TARJETAPROFESIONAL = new TipoIdentificacion(_TARJETAPROFESIONAL);
    public static final TipoIdentificacion SERVICIONACIONALDEPRUEBAS = new TipoIdentificacion(_SERVICIONACIONALDEPRUEBAS);
    public java.lang.String getValue() { return _value_;}
    public static TipoIdentificacion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TipoIdentificacion enumeration = (TipoIdentificacion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TipoIdentificacion fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException 
          {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TipoIdentificacion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://control.prematriculas.unicauca.edu.co/", "tipoIdentificacion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
