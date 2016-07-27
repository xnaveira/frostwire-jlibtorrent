/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class entry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public entry.data_type type() {
    return entry.data_type.swigToEnum(libtorrent_jni.entry_type(swigCPtr, this));
  }

  public entry(string_entry_map arg0) {
    this(libtorrent_jni.new_entry__SWIG_0(string_entry_map.getCPtr(arg0), arg0), true);
  }

  public entry(byte_span arg0) {
    this(libtorrent_jni.new_entry__SWIG_1(byte_span.getCPtr(arg0), arg0), true);
  }

  public entry(entry_list arg0) {
    this(libtorrent_jni.new_entry__SWIG_3(entry_list.getCPtr(arg0), arg0), true);
  }

  public entry(long arg0) {
    this(libtorrent_jni.new_entry__SWIG_4(arg0), true);
  }

  public entry(entry.data_type t) {
    this(libtorrent_jni.new_entry__SWIG_5(t.swigValue()), true);
  }

  public entry(entry e) {
    this(libtorrent_jni.new_entry__SWIG_6(entry.getCPtr(e), e), true);
  }

  public entry() {
    this(libtorrent_jni.new_entry__SWIG_7(), true);
  }

  public boolean op_eq(entry e) {
    return libtorrent_jni.entry_op_eq(swigCPtr, this, entry.getCPtr(e), e);
  }

  public boolean op_neq(entry e) {
    return libtorrent_jni.entry_op_neq(swigCPtr, this, entry.getCPtr(e), e);
  }

  public long integer() {
    return libtorrent_jni.entry_integer(swigCPtr, this);
  }

  public String string() {
    return libtorrent_jni.entry_string(swigCPtr, this);
  }

  public entry_list list() {
    return new entry_list(libtorrent_jni.entry_list(swigCPtr, this), false);
  }

  public string_entry_map dict() {
    return new string_entry_map(libtorrent_jni.entry_dict(swigCPtr, this), false);
  }

  public void swap(entry e) {
    libtorrent_jni.entry_swap(swigCPtr, this, entry.getCPtr(e), e);
  }

  public entry find_key(String key) {
    long cPtr = libtorrent_jni.entry_find_key(swigCPtr, this, key);
    return (cPtr == 0) ? null : new entry(cPtr, false);
  }

  public String to_string() {
    return libtorrent_jni.entry_to_string(swigCPtr, this);
  }

  public entry(String s) {
    this(libtorrent_jni.new_entry__SWIG_8(s), true);
  }

  public entry get(String key) {
    return new entry(libtorrent_jni.entry_get(swigCPtr, this, key), false);
  }

  public void set(String key, String value) {
    libtorrent_jni.entry_set__SWIG_0(swigCPtr, this, key, value);
  }

  public void set(String key, byte_vector value) {
    libtorrent_jni.entry_set__SWIG_1(swigCPtr, this, key, byte_vector.getCPtr(value), value);
  }

  public void set(String key, long value) {
    libtorrent_jni.entry_set__SWIG_2(swigCPtr, this, key, value);
  }

  public void set(String key, entry value) {
    libtorrent_jni.entry_set__SWIG_3(swigCPtr, this, key, entry.getCPtr(value), value);
  }

  public byte_vector string_bytes() {
    return new byte_vector(libtorrent_jni.entry_string_bytes(swigCPtr, this), true);
  }

  public byte_vector preformatted_bytes() {
    return new byte_vector(libtorrent_jni.entry_preformatted_bytes(swigCPtr, this), true);
  }

  public byte_vector bencode() {
    return new byte_vector(libtorrent_jni.entry_bencode(swigCPtr, this), true);
  }

  public static entry from_string_bytes(byte_vector string_bytes) {
    return new entry(libtorrent_jni.entry_from_string_bytes(byte_vector.getCPtr(string_bytes), string_bytes), true);
  }

  public static entry from_preformatted_bytes(byte_vector preformatted_bytes) {
    return new entry(libtorrent_jni.entry_from_preformatted_bytes(byte_vector.getCPtr(preformatted_bytes), preformatted_bytes), true);
  }

  public static entry bdecode(byte_vector buffer) {
    return new entry(libtorrent_jni.entry_bdecode(byte_vector.getCPtr(buffer), buffer), true);
  }

  public final static class data_type {
    public final static entry.data_type int_t = new entry.data_type("int_t");
    public final static entry.data_type string_t = new entry.data_type("string_t");
    public final static entry.data_type list_t = new entry.data_type("list_t");
    public final static entry.data_type dictionary_t = new entry.data_type("dictionary_t");
    public final static entry.data_type undefined_t = new entry.data_type("undefined_t");
    public final static entry.data_type preformatted_t = new entry.data_type("preformatted_t");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static data_type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + data_type.class + " with value " + swigValue);
    }

    private data_type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private data_type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private data_type(String swigName, data_type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static data_type[] swigValues = { int_t, string_t, list_t, dictionary_t, undefined_t, preformatted_t };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
