/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mde.a5.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.mde.a5.ui.internal.A5Activator;

public class ErasmusProgramsUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return A5Activator.getInstance().getInjector("org.xtext.mde.a5.ErasmusPrograms");
	}

}
