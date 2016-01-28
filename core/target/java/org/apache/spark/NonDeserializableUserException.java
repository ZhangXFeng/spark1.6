package org.apache.spark;
public  class NonDeserializableUserException extends java.lang.RuntimeException {
  public   NonDeserializableUserException () { throw new RuntimeException(); }
  private  void readObject (java.io.ObjectInputStream in) { throw new RuntimeException(); }
}
