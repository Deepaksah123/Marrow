package kotlin;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.view.View;
import kotlin.Metadata;
import kotlin.getSystemAvailableFeatures;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0003\u0010\u0006"}, d2 = {"Landroid/view/View;", "p0", "Lo/includeFilterInstance;", "RemoteActionCompatParcelizer", "(Landroid/view/View;)Lo/includeFilterInstance;", "Landroid/content/Context;", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _reportIncompatibleRootType {
    public static final includeFilterInstance RemoteActionCompatParcelizer(View view) {
        Context context = view.getContext();
        Context contextRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context);
        if (contextRemoteActionCompatParcelizer != null) {
            getSystemAvailableFeatures.Companion companion = getSystemAvailableFeatures.INSTANCE;
            getSystemSharedLibraryNames getsystemsharedlibrarynamesRemoteActionCompatParcelizer = getSystemAvailableFeatures.Companion.IconCompatParcelizer().RemoteActionCompatParcelizer(contextRemoteActionCompatParcelizer);
            long j = -1;
            return includeFilterInstance.INSTANCE.AudioAttributesCompatParcelizer(getKey.read((((long) getsystemsharedlibrarynamesRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().width()) << 32) | (((long) getsystemsharedlibrarynamesRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer().height()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))), _findMissing.write(contextRemoteActionCompatParcelizer));
        }
        Configuration configuration = context.getResources().getConfiguration();
        return includeFilterInstance.INSTANCE.read(getParameters.IconCompatParcelizer(assignParameter.IconCompatParcelizer(configuration.screenWidthDp), assignParameter.IconCompatParcelizer(configuration.screenHeightDp)), _findMissing.write(context));
    }

    private static final Context RemoteActionCompatParcelizer(Context context) {
        while (context instanceof ContextWrapper) {
            if ((context instanceof Activity) || (context instanceof InputMethodService) || (context instanceof Application)) {
                return context;
            }
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                return null;
            }
            context = contextWrapper.getBaseContext();
        }
        return null;
    }
}
