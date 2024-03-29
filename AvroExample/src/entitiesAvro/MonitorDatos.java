package entitiesAvro;
/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
@SuppressWarnings("all")
/** Campos de los monitores de rendimiento del csv */
@org.apache.avro.specific.AvroGenerated
public class MonitorDatos extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MonitorDatos\",\"doc\":\"Campos de los monitores de rendimiento del csv\",\"fields\":[{\"name\":\"FNAME\",\"type\":\"string\"},{\"name\":\"LONGITUD\",\"type\":\"double\"},{\"name\":\"LATITUD\",\"type\":\"double\"},{\"name\":\"ID\",\"type\":\"long\"},{\"name\":\"ELEVACION\",\"type\":\"double\"},{\"name\":\"ANCHO\",\"type\":\"double\"},{\"name\":\"DISTANCIA\",\"type\":\"double\"},{\"name\":\"DURACION\",\"type\":\"double\"},{\"name\":\"HUMEDAD\",\"type\":\"double\"},{\"name\":\"FLUJO\",\"type\":\"double\"},{\"name\":\"UTC\",\"type\":\"long\"},{\"name\":\"PRODUCTO\",\"type\":\"string\"},{\"name\":\"FIELD\",\"type\":\"string\"},{\"name\":\"CARGA\",\"type\":\"string\"},{\"name\":\"MASA\",\"type\":\"double\"},{\"name\":\"REND\",\"type\":\"double\"},{\"name\":\"CLUSTER\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence FNAME;
  @Deprecated public double LONGITUD;
  @Deprecated public double LATITUD;
  @Deprecated public long ID;
  @Deprecated public double ELEVACION;
  @Deprecated public double ANCHO;
  @Deprecated public double DISTANCIA;
  @Deprecated public double DURACION;
  @Deprecated public double HUMEDAD;
  @Deprecated public double FLUJO;
  @Deprecated public long UTC;
  @Deprecated public java.lang.CharSequence PRODUCTO;
  @Deprecated public java.lang.CharSequence FIELD;
  @Deprecated public java.lang.CharSequence CARGA;
  @Deprecated public double MASA;
  @Deprecated public double REND;
  @Deprecated public int CLUSTER;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public MonitorDatos() {}

  /**
   * All-args constructor.
   */
  public MonitorDatos(java.lang.CharSequence FNAME, java.lang.Double LONGITUD, java.lang.Double LATITUD, java.lang.Long ID, java.lang.Double ELEVACION, java.lang.Double ANCHO, java.lang.Double DISTANCIA, java.lang.Double DURACION, java.lang.Double HUMEDAD, java.lang.Double FLUJO, java.lang.Long UTC, java.lang.CharSequence PRODUCTO, java.lang.CharSequence FIELD, java.lang.CharSequence CARGA, java.lang.Double MASA, java.lang.Double REND, java.lang.Integer CLUSTER) {
    this.FNAME = FNAME;
    this.LONGITUD = LONGITUD;
    this.LATITUD = LATITUD;
    this.ID = ID;
    this.ELEVACION = ELEVACION;
    this.ANCHO = ANCHO;
    this.DISTANCIA = DISTANCIA;
    this.DURACION = DURACION;
    this.HUMEDAD = HUMEDAD;
    this.FLUJO = FLUJO;
    this.UTC = UTC;
    this.PRODUCTO = PRODUCTO;
    this.FIELD = FIELD;
    this.CARGA = CARGA;
    this.MASA = MASA;
    this.REND = REND;
    this.CLUSTER = CLUSTER;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return FNAME;
    case 1: return LONGITUD;
    case 2: return LATITUD;
    case 3: return ID;
    case 4: return ELEVACION;
    case 5: return ANCHO;
    case 6: return DISTANCIA;
    case 7: return DURACION;
    case 8: return HUMEDAD;
    case 9: return FLUJO;
    case 10: return UTC;
    case 11: return PRODUCTO;
    case 12: return FIELD;
    case 13: return CARGA;
    case 14: return MASA;
    case 15: return REND;
    case 16: return CLUSTER;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: FNAME = (java.lang.CharSequence)value$; break;
    case 1: LONGITUD = (java.lang.Double)value$; break;
    case 2: LATITUD = (java.lang.Double)value$; break;
    case 3: ID = (java.lang.Long)value$; break;
    case 4: ELEVACION = (java.lang.Double)value$; break;
    case 5: ANCHO = (java.lang.Double)value$; break;
    case 6: DISTANCIA = (java.lang.Double)value$; break;
    case 7: DURACION = (java.lang.Double)value$; break;
    case 8: HUMEDAD = (java.lang.Double)value$; break;
    case 9: FLUJO = (java.lang.Double)value$; break;
    case 10: UTC = (java.lang.Long)value$; break;
    case 11: PRODUCTO = (java.lang.CharSequence)value$; break;
    case 12: FIELD = (java.lang.CharSequence)value$; break;
    case 13: CARGA = (java.lang.CharSequence)value$; break;
    case 14: MASA = (java.lang.Double)value$; break;
    case 15: REND = (java.lang.Double)value$; break;
    case 16: CLUSTER = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'FNAME' field.
   */
  public java.lang.CharSequence getFNAME() {
    return FNAME;
  }

  /**
   * Sets the value of the 'FNAME' field.
   * @param value the value to set.
   */
  public void setFNAME(java.lang.CharSequence value) {
    this.FNAME = value;
  }

  /**
   * Gets the value of the 'LONGITUD' field.
   */
  public java.lang.Double getLONGITUD() {
    return LONGITUD;
  }

  /**
   * Sets the value of the 'LONGITUD' field.
   * @param value the value to set.
   */
  public void setLONGITUD(java.lang.Double value) {
    this.LONGITUD = value;
  }

  /**
   * Gets the value of the 'LATITUD' field.
   */
  public java.lang.Double getLATITUD() {
    return LATITUD;
  }

  /**
   * Sets the value of the 'LATITUD' field.
   * @param value the value to set.
   */
  public void setLATITUD(java.lang.Double value) {
    this.LATITUD = value;
  }

  /**
   * Gets the value of the 'ID' field.
   */
  public java.lang.Long getID() {
    return ID;
  }

  /**
   * Sets the value of the 'ID' field.
   * @param value the value to set.
   */
  public void setID(java.lang.Long value) {
    this.ID = value;
  }

  /**
   * Gets the value of the 'ELEVACION' field.
   */
  public java.lang.Double getELEVACION() {
    return ELEVACION;
  }

  /**
   * Sets the value of the 'ELEVACION' field.
   * @param value the value to set.
   */
  public void setELEVACION(java.lang.Double value) {
    this.ELEVACION = value;
  }

  /**
   * Gets the value of the 'ANCHO' field.
   */
  public java.lang.Double getANCHO() {
    return ANCHO;
  }

  /**
   * Sets the value of the 'ANCHO' field.
   * @param value the value to set.
   */
  public void setANCHO(java.lang.Double value) {
    this.ANCHO = value;
  }

  /**
   * Gets the value of the 'DISTANCIA' field.
   */
  public java.lang.Double getDISTANCIA() {
    return DISTANCIA;
  }

  /**
   * Sets the value of the 'DISTANCIA' field.
   * @param value the value to set.
   */
  public void setDISTANCIA(java.lang.Double value) {
    this.DISTANCIA = value;
  }

  /**
   * Gets the value of the 'DURACION' field.
   */
  public java.lang.Double getDURACION() {
    return DURACION;
  }

  /**
   * Sets the value of the 'DURACION' field.
   * @param value the value to set.
   */
  public void setDURACION(java.lang.Double value) {
    this.DURACION = value;
  }

  /**
   * Gets the value of the 'HUMEDAD' field.
   */
  public java.lang.Double getHUMEDAD() {
    return HUMEDAD;
  }

  /**
   * Sets the value of the 'HUMEDAD' field.
   * @param value the value to set.
   */
  public void setHUMEDAD(java.lang.Double value) {
    this.HUMEDAD = value;
  }

  /**
   * Gets the value of the 'FLUJO' field.
   */
  public java.lang.Double getFLUJO() {
    return FLUJO;
  }

  /**
   * Sets the value of the 'FLUJO' field.
   * @param value the value to set.
   */
  public void setFLUJO(java.lang.Double value) {
    this.FLUJO = value;
  }

  /**
   * Gets the value of the 'UTC' field.
   */
  public java.lang.Long getUTC() {
    return UTC;
  }

  /**
   * Sets the value of the 'UTC' field.
   * @param value the value to set.
   */
  public void setUTC(java.lang.Long value) {
    this.UTC = value;
  }

  /**
   * Gets the value of the 'PRODUCTO' field.
   */
  public java.lang.CharSequence getPRODUCTO() {
    return PRODUCTO;
  }

  /**
   * Sets the value of the 'PRODUCTO' field.
   * @param value the value to set.
   */
  public void setPRODUCTO(java.lang.CharSequence value) {
    this.PRODUCTO = value;
  }

  /**
   * Gets the value of the 'FIELD' field.
   */
  public java.lang.CharSequence getFIELD() {
    return FIELD;
  }

  /**
   * Sets the value of the 'FIELD' field.
   * @param value the value to set.
   */
  public void setFIELD(java.lang.CharSequence value) {
    this.FIELD = value;
  }

  /**
   * Gets the value of the 'CARGA' field.
   */
  public java.lang.CharSequence getCARGA() {
    return CARGA;
  }

  /**
   * Sets the value of the 'CARGA' field.
   * @param value the value to set.
   */
  public void setCARGA(java.lang.CharSequence value) {
    this.CARGA = value;
  }

  /**
   * Gets the value of the 'MASA' field.
   */
  public java.lang.Double getMASA() {
    return MASA;
  }

  /**
   * Sets the value of the 'MASA' field.
   * @param value the value to set.
   */
  public void setMASA(java.lang.Double value) {
    this.MASA = value;
  }

  /**
   * Gets the value of the 'REND' field.
   */
  public java.lang.Double getREND() {
    return REND;
  }

  /**
   * Sets the value of the 'REND' field.
   * @param value the value to set.
   */
  public void setREND(java.lang.Double value) {
    this.REND = value;
  }

  /**
   * Gets the value of the 'CLUSTER' field.
   */
  public java.lang.Integer getCLUSTER() {
    return CLUSTER;
  }

  /**
   * Sets the value of the 'CLUSTER' field.
   * @param value the value to set.
   */
  public void setCLUSTER(java.lang.Integer value) {
    this.CLUSTER = value;
  }

  /** Creates a new MonitorDatos RecordBuilder */
  public static MonitorDatos.Builder newBuilder() {
    return new MonitorDatos.Builder();
  }
  
  /** Creates a new MonitorDatos RecordBuilder by copying an existing Builder */
  public static MonitorDatos.Builder newBuilder(MonitorDatos.Builder other) {
    return new MonitorDatos.Builder(other);
  }
  
  /** Creates a new MonitorDatos RecordBuilder by copying an existing MonitorDatos instance */
  public static MonitorDatos.Builder newBuilder(MonitorDatos other) {
    return new MonitorDatos.Builder(other);
  }
  
  /**
   * RecordBuilder for MonitorDatos instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MonitorDatos>
    implements org.apache.avro.data.RecordBuilder<MonitorDatos> {

    private java.lang.CharSequence FNAME;
    private double LONGITUD;
    private double LATITUD;
    private long ID;
    private double ELEVACION;
    private double ANCHO;
    private double DISTANCIA;
    private double DURACION;
    private double HUMEDAD;
    private double FLUJO;
    private long UTC;
    private java.lang.CharSequence PRODUCTO;
    private java.lang.CharSequence FIELD;
    private java.lang.CharSequence CARGA;
    private double MASA;
    private double REND;
    private int CLUSTER;

    /** Creates a new Builder */
    private Builder() {
      super(MonitorDatos.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(MonitorDatos.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.FNAME)) {
        this.FNAME = data().deepCopy(fields()[0].schema(), other.FNAME);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.LONGITUD)) {
        this.LONGITUD = data().deepCopy(fields()[1].schema(), other.LONGITUD);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LATITUD)) {
        this.LATITUD = data().deepCopy(fields()[2].schema(), other.LATITUD);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ID)) {
        this.ID = data().deepCopy(fields()[3].schema(), other.ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ELEVACION)) {
        this.ELEVACION = data().deepCopy(fields()[4].schema(), other.ELEVACION);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ANCHO)) {
        this.ANCHO = data().deepCopy(fields()[5].schema(), other.ANCHO);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.DISTANCIA)) {
        this.DISTANCIA = data().deepCopy(fields()[6].schema(), other.DISTANCIA);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.DURACION)) {
        this.DURACION = data().deepCopy(fields()[7].schema(), other.DURACION);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.HUMEDAD)) {
        this.HUMEDAD = data().deepCopy(fields()[8].schema(), other.HUMEDAD);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.FLUJO)) {
        this.FLUJO = data().deepCopy(fields()[9].schema(), other.FLUJO);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.UTC)) {
        this.UTC = data().deepCopy(fields()[10].schema(), other.UTC);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.PRODUCTO)) {
        this.PRODUCTO = data().deepCopy(fields()[11].schema(), other.PRODUCTO);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.FIELD)) {
        this.FIELD = data().deepCopy(fields()[12].schema(), other.FIELD);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.CARGA)) {
        this.CARGA = data().deepCopy(fields()[13].schema(), other.CARGA);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.MASA)) {
        this.MASA = data().deepCopy(fields()[14].schema(), other.MASA);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.REND)) {
        this.REND = data().deepCopy(fields()[15].schema(), other.REND);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.CLUSTER)) {
        this.CLUSTER = data().deepCopy(fields()[16].schema(), other.CLUSTER);
        fieldSetFlags()[16] = true;
      }
    }
    
    /** Creates a Builder by copying an existing MonitorDatos instance */
    private Builder(MonitorDatos other) {
            super(MonitorDatos.SCHEMA$);
      if (isValidValue(fields()[0], other.FNAME)) {
        this.FNAME = data().deepCopy(fields()[0].schema(), other.FNAME);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.LONGITUD)) {
        this.LONGITUD = data().deepCopy(fields()[1].schema(), other.LONGITUD);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.LATITUD)) {
        this.LATITUD = data().deepCopy(fields()[2].schema(), other.LATITUD);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.ID)) {
        this.ID = data().deepCopy(fields()[3].schema(), other.ID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.ELEVACION)) {
        this.ELEVACION = data().deepCopy(fields()[4].schema(), other.ELEVACION);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.ANCHO)) {
        this.ANCHO = data().deepCopy(fields()[5].schema(), other.ANCHO);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.DISTANCIA)) {
        this.DISTANCIA = data().deepCopy(fields()[6].schema(), other.DISTANCIA);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.DURACION)) {
        this.DURACION = data().deepCopy(fields()[7].schema(), other.DURACION);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.HUMEDAD)) {
        this.HUMEDAD = data().deepCopy(fields()[8].schema(), other.HUMEDAD);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.FLUJO)) {
        this.FLUJO = data().deepCopy(fields()[9].schema(), other.FLUJO);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.UTC)) {
        this.UTC = data().deepCopy(fields()[10].schema(), other.UTC);
        fieldSetFlags()[10] = true;
      }
      if (isValidValue(fields()[11], other.PRODUCTO)) {
        this.PRODUCTO = data().deepCopy(fields()[11].schema(), other.PRODUCTO);
        fieldSetFlags()[11] = true;
      }
      if (isValidValue(fields()[12], other.FIELD)) {
        this.FIELD = data().deepCopy(fields()[12].schema(), other.FIELD);
        fieldSetFlags()[12] = true;
      }
      if (isValidValue(fields()[13], other.CARGA)) {
        this.CARGA = data().deepCopy(fields()[13].schema(), other.CARGA);
        fieldSetFlags()[13] = true;
      }
      if (isValidValue(fields()[14], other.MASA)) {
        this.MASA = data().deepCopy(fields()[14].schema(), other.MASA);
        fieldSetFlags()[14] = true;
      }
      if (isValidValue(fields()[15], other.REND)) {
        this.REND = data().deepCopy(fields()[15].schema(), other.REND);
        fieldSetFlags()[15] = true;
      }
      if (isValidValue(fields()[16], other.CLUSTER)) {
        this.CLUSTER = data().deepCopy(fields()[16].schema(), other.CLUSTER);
        fieldSetFlags()[16] = true;
      }
    }

    /** Gets the value of the 'FNAME' field */
    public java.lang.CharSequence getFNAME() {
      return FNAME;
    }
    
    /** Sets the value of the 'FNAME' field */
    public MonitorDatos.Builder setFNAME(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.FNAME = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'FNAME' field has been set */
    public boolean hasFNAME() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'FNAME' field */
    public MonitorDatos.Builder clearFNAME() {
      FNAME = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'LONGITUD' field */
    public java.lang.Double getLONGITUD() {
      return LONGITUD;
    }
    
    /** Sets the value of the 'LONGITUD' field */
    public MonitorDatos.Builder setLONGITUD(double value) {
      validate(fields()[1], value);
      this.LONGITUD = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'LONGITUD' field has been set */
    public boolean hasLONGITUD() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'LONGITUD' field */
    public MonitorDatos.Builder clearLONGITUD() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'LATITUD' field */
    public java.lang.Double getLATITUD() {
      return LATITUD;
    }
    
    /** Sets the value of the 'LATITUD' field */
    public MonitorDatos.Builder setLATITUD(double value) {
      validate(fields()[2], value);
      this.LATITUD = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'LATITUD' field has been set */
    public boolean hasLATITUD() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'LATITUD' field */
    public MonitorDatos.Builder clearLATITUD() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'ID' field */
    public java.lang.Long getID() {
      return ID;
    }
    
    /** Sets the value of the 'ID' field */
    public MonitorDatos.Builder setID(long value) {
      validate(fields()[3], value);
      this.ID = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'ID' field has been set */
    public boolean hasID() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'ID' field */
    public MonitorDatos.Builder clearID() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'ELEVACION' field */
    public java.lang.Double getELEVACION() {
      return ELEVACION;
    }
    
    /** Sets the value of the 'ELEVACION' field */
    public MonitorDatos.Builder setELEVACION(double value) {
      validate(fields()[4], value);
      this.ELEVACION = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'ELEVACION' field has been set */
    public boolean hasELEVACION() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'ELEVACION' field */
    public MonitorDatos.Builder clearELEVACION() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'ANCHO' field */
    public java.lang.Double getANCHO() {
      return ANCHO;
    }
    
    /** Sets the value of the 'ANCHO' field */
    public MonitorDatos.Builder setANCHO(double value) {
      validate(fields()[5], value);
      this.ANCHO = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'ANCHO' field has been set */
    public boolean hasANCHO() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'ANCHO' field */
    public MonitorDatos.Builder clearANCHO() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'DISTANCIA' field */
    public java.lang.Double getDISTANCIA() {
      return DISTANCIA;
    }
    
    /** Sets the value of the 'DISTANCIA' field */
    public MonitorDatos.Builder setDISTANCIA(double value) {
      validate(fields()[6], value);
      this.DISTANCIA = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'DISTANCIA' field has been set */
    public boolean hasDISTANCIA() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'DISTANCIA' field */
    public MonitorDatos.Builder clearDISTANCIA() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'DURACION' field */
    public java.lang.Double getDURACION() {
      return DURACION;
    }
    
    /** Sets the value of the 'DURACION' field */
    public MonitorDatos.Builder setDURACION(double value) {
      validate(fields()[7], value);
      this.DURACION = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'DURACION' field has been set */
    public boolean hasDURACION() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'DURACION' field */
    public MonitorDatos.Builder clearDURACION() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'HUMEDAD' field */
    public java.lang.Double getHUMEDAD() {
      return HUMEDAD;
    }
    
    /** Sets the value of the 'HUMEDAD' field */
    public MonitorDatos.Builder setHUMEDAD(double value) {
      validate(fields()[8], value);
      this.HUMEDAD = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'HUMEDAD' field has been set */
    public boolean hasHUMEDAD() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'HUMEDAD' field */
    public MonitorDatos.Builder clearHUMEDAD() {
      fieldSetFlags()[8] = false;
      return this;
    }

    /** Gets the value of the 'FLUJO' field */
    public java.lang.Double getFLUJO() {
      return FLUJO;
    }
    
    /** Sets the value of the 'FLUJO' field */
    public MonitorDatos.Builder setFLUJO(double value) {
      validate(fields()[9], value);
      this.FLUJO = value;
      fieldSetFlags()[9] = true;
      return this; 
    }
    
    /** Checks whether the 'FLUJO' field has been set */
    public boolean hasFLUJO() {
      return fieldSetFlags()[9];
    }
    
    /** Clears the value of the 'FLUJO' field */
    public MonitorDatos.Builder clearFLUJO() {
      fieldSetFlags()[9] = false;
      return this;
    }

    /** Gets the value of the 'UTC' field */
    public java.lang.Long getUTC() {
      return UTC;
    }
    
    /** Sets the value of the 'UTC' field */
    public MonitorDatos.Builder setUTC(long value) {
      validate(fields()[10], value);
      this.UTC = value;
      fieldSetFlags()[10] = true;
      return this; 
    }
    
    /** Checks whether the 'UTC' field has been set */
    public boolean hasUTC() {
      return fieldSetFlags()[10];
    }
    
    /** Clears the value of the 'UTC' field */
    public MonitorDatos.Builder clearUTC() {
      fieldSetFlags()[10] = false;
      return this;
    }

    /** Gets the value of the 'PRODUCTO' field */
    public java.lang.CharSequence getPRODUCTO() {
      return PRODUCTO;
    }
    
    /** Sets the value of the 'PRODUCTO' field */
    public MonitorDatos.Builder setPRODUCTO(java.lang.CharSequence value) {
      validate(fields()[11], value);
      this.PRODUCTO = value;
      fieldSetFlags()[11] = true;
      return this; 
    }
    
    /** Checks whether the 'PRODUCTO' field has been set */
    public boolean hasPRODUCTO() {
      return fieldSetFlags()[11];
    }
    
    /** Clears the value of the 'PRODUCTO' field */
    public MonitorDatos.Builder clearPRODUCTO() {
      PRODUCTO = null;
      fieldSetFlags()[11] = false;
      return this;
    }

    /** Gets the value of the 'FIELD' field */
    public java.lang.CharSequence getFIELD() {
      return FIELD;
    }
    
    /** Sets the value of the 'FIELD' field */
    public MonitorDatos.Builder setFIELD(java.lang.CharSequence value) {
      validate(fields()[12], value);
      this.FIELD = value;
      fieldSetFlags()[12] = true;
      return this; 
    }
    
    /** Checks whether the 'FIELD' field has been set */
    public boolean hasFIELD() {
      return fieldSetFlags()[12];
    }
    
    /** Clears the value of the 'FIELD' field */
    public MonitorDatos.Builder clearFIELD() {
      FIELD = null;
      fieldSetFlags()[12] = false;
      return this;
    }

    /** Gets the value of the 'CARGA' field */
    public java.lang.CharSequence getCARGA() {
      return CARGA;
    }
    
    /** Sets the value of the 'CARGA' field */
    public MonitorDatos.Builder setCARGA(java.lang.CharSequence value) {
      validate(fields()[13], value);
      this.CARGA = value;
      fieldSetFlags()[13] = true;
      return this; 
    }
    
    /** Checks whether the 'CARGA' field has been set */
    public boolean hasCARGA() {
      return fieldSetFlags()[13];
    }
    
    /** Clears the value of the 'CARGA' field */
    public MonitorDatos.Builder clearCARGA() {
      CARGA = null;
      fieldSetFlags()[13] = false;
      return this;
    }

    /** Gets the value of the 'MASA' field */
    public java.lang.Double getMASA() {
      return MASA;
    }
    
    /** Sets the value of the 'MASA' field */
    public MonitorDatos.Builder setMASA(double value) {
      validate(fields()[14], value);
      this.MASA = value;
      fieldSetFlags()[14] = true;
      return this; 
    }
    
    /** Checks whether the 'MASA' field has been set */
    public boolean hasMASA() {
      return fieldSetFlags()[14];
    }
    
    /** Clears the value of the 'MASA' field */
    public MonitorDatos.Builder clearMASA() {
      fieldSetFlags()[14] = false;
      return this;
    }

    /** Gets the value of the 'REND' field */
    public java.lang.Double getREND() {
      return REND;
    }
    
    /** Sets the value of the 'REND' field */
    public MonitorDatos.Builder setREND(double value) {
      validate(fields()[15], value);
      this.REND = value;
      fieldSetFlags()[15] = true;
      return this; 
    }
    
    /** Checks whether the 'REND' field has been set */
    public boolean hasREND() {
      return fieldSetFlags()[15];
    }
    
    /** Clears the value of the 'REND' field */
    public MonitorDatos.Builder clearREND() {
      fieldSetFlags()[15] = false;
      return this;
    }

    /** Gets the value of the 'CLUSTER' field */
    public java.lang.Integer getCLUSTER() {
      return CLUSTER;
    }
    
    /** Sets the value of the 'CLUSTER' field */
    public MonitorDatos.Builder setCLUSTER(int value) {
      validate(fields()[16], value);
      this.CLUSTER = value;
      fieldSetFlags()[16] = true;
      return this; 
    }
    
    /** Checks whether the 'CLUSTER' field has been set */
    public boolean hasCLUSTER() {
      return fieldSetFlags()[16];
    }
    
    /** Clears the value of the 'CLUSTER' field */
    public MonitorDatos.Builder clearCLUSTER() {
      fieldSetFlags()[16] = false;
      return this;
    }

    @Override
    public MonitorDatos build() {
      try {
        MonitorDatos record = new MonitorDatos();
        record.FNAME = fieldSetFlags()[0] ? this.FNAME : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.LONGITUD = fieldSetFlags()[1] ? this.LONGITUD : (java.lang.Double) defaultValue(fields()[1]);
        record.LATITUD = fieldSetFlags()[2] ? this.LATITUD : (java.lang.Double) defaultValue(fields()[2]);
        record.ID = fieldSetFlags()[3] ? this.ID : (java.lang.Long) defaultValue(fields()[3]);
        record.ELEVACION = fieldSetFlags()[4] ? this.ELEVACION : (java.lang.Double) defaultValue(fields()[4]);
        record.ANCHO = fieldSetFlags()[5] ? this.ANCHO : (java.lang.Double) defaultValue(fields()[5]);
        record.DISTANCIA = fieldSetFlags()[6] ? this.DISTANCIA : (java.lang.Double) defaultValue(fields()[6]);
        record.DURACION = fieldSetFlags()[7] ? this.DURACION : (java.lang.Double) defaultValue(fields()[7]);
        record.HUMEDAD = fieldSetFlags()[8] ? this.HUMEDAD : (java.lang.Double) defaultValue(fields()[8]);
        record.FLUJO = fieldSetFlags()[9] ? this.FLUJO : (java.lang.Double) defaultValue(fields()[9]);
        record.UTC = fieldSetFlags()[10] ? this.UTC : (java.lang.Long) defaultValue(fields()[10]);
        record.PRODUCTO = fieldSetFlags()[11] ? this.PRODUCTO : (java.lang.CharSequence) defaultValue(fields()[11]);
        record.FIELD = fieldSetFlags()[12] ? this.FIELD : (java.lang.CharSequence) defaultValue(fields()[12]);
        record.CARGA = fieldSetFlags()[13] ? this.CARGA : (java.lang.CharSequence) defaultValue(fields()[13]);
        record.MASA = fieldSetFlags()[14] ? this.MASA : (java.lang.Double) defaultValue(fields()[14]);
        record.REND = fieldSetFlags()[15] ? this.REND : (java.lang.Double) defaultValue(fields()[15]);
        record.CLUSTER = fieldSetFlags()[16] ? this.CLUSTER : (java.lang.Integer) defaultValue(fields()[16]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
