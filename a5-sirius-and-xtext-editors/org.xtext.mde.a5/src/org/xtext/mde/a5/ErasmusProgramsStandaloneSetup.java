/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mde.a5;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ErasmusProgramsStandaloneSetup extends ErasmusProgramsStandaloneSetupGenerated {

	public static void doSetup() {
		new ErasmusProgramsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
