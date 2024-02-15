package a3_Erasmo_Stanco_Group.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import a3_Erasmo_Stanco_Group.ErasmusProgram;
import a3_Erasmo_Stanco_Group.serializer.Util;

public class LoadCommandHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		FileDialog fileDialog = new FileDialog(window.getShell());
		fileDialog.setText("Select a file");
		fileDialog.setFilterExtensions(new String[] { "*.xmi" });
		fileDialog.setFilterNames(new String[] { "XMI files (*.xmi)" });
		
		String selectedFilePath = fileDialog.open();
		if (selectedFilePath == null) {
			return null;
		}
		
		try {
			ErasmusProgram program = Util.load(selectedFilePath);
			MessageDialog.openInformation(
					window.getShell(),
					"Erasmus Programs",
					"Model loaded; found program with name \"" + program.getName() + "\"");
		} catch (Exception e) {
			ErrorDialog errorDialog = new ErrorDialog(window.getShell(), "Error", e.getMessage(),
					ErrorHandlingUtil.getMultiStatus(e.getMessage(), e, getClass()),
					IStatus.ERROR);
			errorDialog.open();
		}
		return null;
	}

}
