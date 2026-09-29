package kotlin;

import java.util.List;
import kotlin.getContentBufferedPosition;

/* JADX INFO: loaded from: classes2.dex */
public abstract class getApplicationLooper<T extends getContentBufferedPosition> {
    public abstract void resetAutoModels();

    protected void validateModelHashCodesHaveNotChanged(T t) {
        List<getCurrentPeriodIndex<?>> listMediaBrowserCompatCustomActionResultReceiver = t.getAdapter().MediaBrowserCompatCustomActionResultReceiver();
        for (int i = 0; i < listMediaBrowserCompatCustomActionResultReceiver.size(); i++) {
            listMediaBrowserCompatCustomActionResultReceiver.get(i).write("Model has changed since it was added to the controller.", i);
        }
    }

    protected void setControllerToStageTo(getCurrentPeriodIndex<?> getcurrentperiodindex, T t) {
        getcurrentperiodindex.IconCompatParcelizer = t;
    }
}
