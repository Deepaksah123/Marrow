package kotlin;

import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/removeRearDisplayPresentationStatusListener;", "", "<init>", "()V", "Landroid/view/inputmethod/EditorInfo;", "p0", "Lo/canCreateFromBoolean;", "p1", "", "IconCompatParcelizer", "(Landroid/view/inputmethod/EditorInfo;Lo/canCreateFromBoolean;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeRearDisplayPresentationStatusListener {
    public static final removeRearDisplayPresentationStatusListener INSTANCE = new removeRearDisplayPresentationStatusListener();

    private removeRearDisplayPresentationStatusListener() {
    }

    public final void IconCompatParcelizer(EditorInfo p0, canCreateFromBoolean p1) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, canCreateFromBoolean.INSTANCE.write())) {
            p0.hintLocales = null;
            return;
        }
        canCreateFromBoolean cancreatefromboolean = p1;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(cancreatefromboolean, 10));
        Iterator<canCreateFromInt> it = cancreatefromboolean.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRemoteActionCompatParcelizer());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        p0.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
