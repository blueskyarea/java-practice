package com.itstudy365.onpra.experiment.nestbasedaccesscontrol;

/**
 * Nested classes (classes defined within other classes) have access to the
 * private members of their enclosing classes. However, prior to Java 11, if you
 * had multiple nested classes that needed to access each other's private
 * members, you would have to use reflection or make the members accessible via
 * package-private or protected access modifiers.
 *
 */
public class NestBasedAccessControl {

	private static String privateStaticField = "Private Static Field";

	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.accessPrivateStaticField();
		
		System.out.println(NestBasedAccessControl.class.isNestmateOf(NestBasedAccessControl.Inner.class));
		// -> true
		System.out.println(NestBasedAccessControl.Inner.class.getNestHost());
		// -> class com.itstudy365.onpra.experiment.nestbasedaccesscontrol.NestBasedAccessControl
		System.out.println(NestBasedAccessControl.Inner.class.getName());
		// -> com.itstudy365.onpra.experiment.nestbasedaccesscontrol.NestBasedAccessControl$Inner
		System.out.println(NestBasedAccessControl.Inner.class.getNestMembers().length);
		// -> 2
		System.out.println(NestBasedAccessControl.Inner.class.getNestMembers()[0]);
		// -> class com.itstudy365.onpra.experiment.nestbasedaccesscontrol.NestBasedAccessControl
		System.out.println(NestBasedAccessControl.Inner.class.getNestMembers()[1]);
		// -> class com.itstudy365.onpra.experiment.nestbasedaccesscontrol.NestBasedAccessControl$Inner
	}

	static class Inner {
		void accessPrivateStaticField() {
			System.out.println(privateStaticField);
		}
	}
}
