package a3_Erasmo_Stanco_Group.ui.handlers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

public class ErrorHandlingUtil {

	public static MultiStatus getMultiStatus(String msg, Throwable t, Class<?> handlerClass) {
		List<Status> statuses = new ArrayList<Status>();
		StackTraceElement[] stackTraces = t.getStackTrace();

		for (StackTraceElement stackTrace : stackTraces) {
			Status status = new Status(IStatus.ERROR, handlerClass.getName(), stackTrace.toString());
			statuses.add(status);
		}
		MultiStatus ms = new MultiStatus(handlerClass.getName(), IStatus.ERROR,
				statuses.toArray(new Status[] {}), t.toString(), t);
		return ms;
	}
}
