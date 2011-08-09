/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.lockerz.thrift.user_lookup.gen;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserLookup implements org.apache.thrift.TBase<UserLookup, UserLookup._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UserLookup");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField POD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("podId", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NORMALIZED_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("normalizedEmail", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField CREATED_FIELD_DESC = new org.apache.thrift.protocol.TField("created", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField MODIFIED_FIELD_DESC = new org.apache.thrift.protocol.TField("modified", org.apache.thrift.protocol.TType.STRING, (short)6);

  public long id;
  public long podId;
  public String email;
  public String normalizedEmail;
  public String created;
  public String modified;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    POD_ID((short)2, "podId"),
    EMAIL((short)3, "email"),
    NORMALIZED_EMAIL((short)4, "normalizedEmail"),
    CREATED((short)5, "created"),
    MODIFIED((short)6, "modified");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // POD_ID
          return POD_ID;
        case 3: // EMAIL
          return EMAIL;
        case 4: // NORMALIZED_EMAIL
          return NORMALIZED_EMAIL;
        case 5: // CREATED
          return CREATED;
        case 6: // MODIFIED
          return MODIFIED;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private static final int __PODID_ISSET_ID = 1;
  private BitSet __isset_bit_vector = new BitSet(2);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.POD_ID, new org.apache.thrift.meta_data.FieldMetaData("podId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NORMALIZED_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("normalizedEmail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREATED, new org.apache.thrift.meta_data.FieldMetaData("created", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MODIFIED, new org.apache.thrift.meta_data.FieldMetaData("modified", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UserLookup.class, metaDataMap);
  }

  public UserLookup() {
  }

  public UserLookup(
    long id,
    long podId,
    String email,
    String normalizedEmail,
    String created,
    String modified)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.podId = podId;
    setPodIdIsSet(true);
    this.email = email;
    this.normalizedEmail = normalizedEmail;
    this.created = created;
    this.modified = modified;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UserLookup(UserLookup other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.id = other.id;
    this.podId = other.podId;
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetNormalizedEmail()) {
      this.normalizedEmail = other.normalizedEmail;
    }
    if (other.isSetCreated()) {
      this.created = other.created;
    }
    if (other.isSetModified()) {
      this.modified = other.modified;
    }
  }

  public UserLookup deepCopy() {
    return new UserLookup(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    setPodIdIsSet(false);
    this.podId = 0;
    this.email = null;
    this.normalizedEmail = null;
    this.created = null;
    this.modified = null;
  }

  public long getId() {
    return this.id;
  }

  public UserLookup setId(long id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bit_vector.clear(__ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return __isset_bit_vector.get(__ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bit_vector.set(__ID_ISSET_ID, value);
  }

  public long getPodId() {
    return this.podId;
  }

  public UserLookup setPodId(long podId) {
    this.podId = podId;
    setPodIdIsSet(true);
    return this;
  }

  public void unsetPodId() {
    __isset_bit_vector.clear(__PODID_ISSET_ID);
  }

  /** Returns true if field podId is set (has been assigned a value) and false otherwise */
  public boolean isSetPodId() {
    return __isset_bit_vector.get(__PODID_ISSET_ID);
  }

  public void setPodIdIsSet(boolean value) {
    __isset_bit_vector.set(__PODID_ISSET_ID, value);
  }

  public String getEmail() {
    return this.email;
  }

  public UserLookup setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getNormalizedEmail() {
    return this.normalizedEmail;
  }

  public UserLookup setNormalizedEmail(String normalizedEmail) {
    this.normalizedEmail = normalizedEmail;
    return this;
  }

  public void unsetNormalizedEmail() {
    this.normalizedEmail = null;
  }

  /** Returns true if field normalizedEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetNormalizedEmail() {
    return this.normalizedEmail != null;
  }

  public void setNormalizedEmailIsSet(boolean value) {
    if (!value) {
      this.normalizedEmail = null;
    }
  }

  public String getCreated() {
    return this.created;
  }

  public UserLookup setCreated(String created) {
    this.created = created;
    return this;
  }

  public void unsetCreated() {
    this.created = null;
  }

  /** Returns true if field created is set (has been assigned a value) and false otherwise */
  public boolean isSetCreated() {
    return this.created != null;
  }

  public void setCreatedIsSet(boolean value) {
    if (!value) {
      this.created = null;
    }
  }

  public String getModified() {
    return this.modified;
  }

  public UserLookup setModified(String modified) {
    this.modified = modified;
    return this;
  }

  public void unsetModified() {
    this.modified = null;
  }

  /** Returns true if field modified is set (has been assigned a value) and false otherwise */
  public boolean isSetModified() {
    return this.modified != null;
  }

  public void setModifiedIsSet(boolean value) {
    if (!value) {
      this.modified = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Long)value);
      }
      break;

    case POD_ID:
      if (value == null) {
        unsetPodId();
      } else {
        setPodId((Long)value);
      }
      break;

    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case NORMALIZED_EMAIL:
      if (value == null) {
        unsetNormalizedEmail();
      } else {
        setNormalizedEmail((String)value);
      }
      break;

    case CREATED:
      if (value == null) {
        unsetCreated();
      } else {
        setCreated((String)value);
      }
      break;

    case MODIFIED:
      if (value == null) {
        unsetModified();
      } else {
        setModified((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return new Long(getId());

    case POD_ID:
      return new Long(getPodId());

    case EMAIL:
      return getEmail();

    case NORMALIZED_EMAIL:
      return getNormalizedEmail();

    case CREATED:
      return getCreated();

    case MODIFIED:
      return getModified();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case POD_ID:
      return isSetPodId();
    case EMAIL:
      return isSetEmail();
    case NORMALIZED_EMAIL:
      return isSetNormalizedEmail();
    case CREATED:
      return isSetCreated();
    case MODIFIED:
      return isSetModified();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UserLookup)
      return this.equals((UserLookup)that);
    return false;
  }

  public boolean equals(UserLookup that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_podId = true;
    boolean that_present_podId = true;
    if (this_present_podId || that_present_podId) {
      if (!(this_present_podId && that_present_podId))
        return false;
      if (this.podId != that.podId)
        return false;
    }

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_normalizedEmail = true && this.isSetNormalizedEmail();
    boolean that_present_normalizedEmail = true && that.isSetNormalizedEmail();
    if (this_present_normalizedEmail || that_present_normalizedEmail) {
      if (!(this_present_normalizedEmail && that_present_normalizedEmail))
        return false;
      if (!this.normalizedEmail.equals(that.normalizedEmail))
        return false;
    }

    boolean this_present_created = true && this.isSetCreated();
    boolean that_present_created = true && that.isSetCreated();
    if (this_present_created || that_present_created) {
      if (!(this_present_created && that_present_created))
        return false;
      if (!this.created.equals(that.created))
        return false;
    }

    boolean this_present_modified = true && this.isSetModified();
    boolean that_present_modified = true && that.isSetModified();
    if (this_present_modified || that_present_modified) {
      if (!(this_present_modified && that_present_modified))
        return false;
      if (!this.modified.equals(that.modified))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(UserLookup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    UserLookup typedOther = (UserLookup)other;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(typedOther.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, typedOther.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPodId()).compareTo(typedOther.isSetPodId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPodId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.podId, typedOther.podId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(typedOther.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, typedOther.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNormalizedEmail()).compareTo(typedOther.isSetNormalizedEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNormalizedEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.normalizedEmail, typedOther.normalizedEmail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCreated()).compareTo(typedOther.isSetCreated());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreated()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.created, typedOther.created);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetModified()).compareTo(typedOther.isSetModified());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetModified()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.modified, typedOther.modified);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.id = iprot.readI64();
            setIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // POD_ID
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.podId = iprot.readI64();
            setPodIdIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // EMAIL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.email = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NORMALIZED_EMAIL
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.normalizedEmail = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // CREATED
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.created = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // MODIFIED
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.modified = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(ID_FIELD_DESC);
    oprot.writeI64(this.id);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(POD_ID_FIELD_DESC);
    oprot.writeI64(this.podId);
    oprot.writeFieldEnd();
    if (this.email != null) {
      oprot.writeFieldBegin(EMAIL_FIELD_DESC);
      oprot.writeString(this.email);
      oprot.writeFieldEnd();
    }
    if (this.normalizedEmail != null) {
      oprot.writeFieldBegin(NORMALIZED_EMAIL_FIELD_DESC);
      oprot.writeString(this.normalizedEmail);
      oprot.writeFieldEnd();
    }
    if (this.created != null) {
      oprot.writeFieldBegin(CREATED_FIELD_DESC);
      oprot.writeString(this.created);
      oprot.writeFieldEnd();
    }
    if (this.modified != null) {
      oprot.writeFieldBegin(MODIFIED_FIELD_DESC);
      oprot.writeString(this.modified);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("UserLookup(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("podId:");
    sb.append(this.podId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("normalizedEmail:");
    if (this.normalizedEmail == null) {
      sb.append("null");
    } else {
      sb.append(this.normalizedEmail);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("created:");
    if (this.created == null) {
      sb.append("null");
    } else {
      sb.append(this.created);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("modified:");
    if (this.modified == null) {
      sb.append("null");
    } else {
      sb.append(this.modified);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}