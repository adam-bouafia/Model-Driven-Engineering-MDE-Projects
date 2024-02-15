package a3_Erasmo_Stanco_Group.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.serializer.Util;

public class CreateCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		try {
			ErasmusProgram program = Util.create();
			MessageDialog.openInformation(
					window.getShell(),
					"Erasmus Programs",
					"Created model for program with name \"" + program.getName() + "\"");
		} catch (Exception e) {
			ErrorDialog errorDialog = new ErrorDialog(window.getShell(), "Error", e.getMessage(),
					ErrorHandlingUtil.getMultiStatus(e.getMessage(), e, getClass()),
					IStatus.ERROR);
			errorDialog.open();
		}
		return null;
	}
}
