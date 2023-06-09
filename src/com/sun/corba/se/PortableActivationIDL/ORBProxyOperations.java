package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ORBProxyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/cygwin64/tmp/ojdkbuild/lookaside/java-1.8.0-openjdk/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Sunday, October 16, 2022 12:11:51 PM PDT
*/


/** ORB callback interface, passed to Activator in registerORB method.
    */
public interface ORBProxyOperations 
{

  /** Method used to cause ORB to activate the named adapter, if possible.
	* This will cause the named POA to register itself with the activator as
	* a side effect.  This should always happen before this call can complete.
	* This method returns true if adapter activation succeeded, otherwise it
	* returns false.
	*/
  boolean activate_adapter (String[] name);
} // interface ORBProxyOperations
