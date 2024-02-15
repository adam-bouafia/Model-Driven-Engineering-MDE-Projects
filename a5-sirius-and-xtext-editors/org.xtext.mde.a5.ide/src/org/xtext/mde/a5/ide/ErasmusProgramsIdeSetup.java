/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mde.a5.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.mde.a5.ErasmusProgramsRuntimeModule;
import org.xtext.mde.a5.ErasmusProgramsStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class ErasmusProgramsIdeSetup extends ErasmusProgramsStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new ErasmusProgramsRuntimeModule(), new ErasmusProgramsIdeModule()));
	}
	
}