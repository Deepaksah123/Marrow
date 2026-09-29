package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ApplicationData;

/* JADX INFO: loaded from: classes4.dex */
public final class onProfileUpdated {
    public static final ApplicationData read(isKycAuditIncomplete<?> iskycauditincomplete) {
        toMagicModuleMetaRepoModel.write(iskycauditincomplete, "");
        Iterator<T> it = iskycauditincomplete.MediaBrowserCompatSearchResultReceiver().iterator();
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((ApplicationData) next).IconCompatParcelizer() == ApplicationData.IconCompatParcelizer.write) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (ApplicationData) obj;
    }

    public static final ApplicationData RemoteActionCompatParcelizer(isKycAuditIncomplete<?> iskycauditincomplete) {
        toMagicModuleMetaRepoModel.write(iskycauditincomplete, "");
        Iterator<T> it = iskycauditincomplete.MediaBrowserCompatSearchResultReceiver().iterator();
        boolean z = false;
        Object obj = null;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((ApplicationData) next).IconCompatParcelizer() == ApplicationData.IconCompatParcelizer.IconCompatParcelizer) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (ApplicationData) obj;
    }

    public static final List<ApplicationData> IconCompatParcelizer(isKycAuditIncomplete<?> iskycauditincomplete) {
        toMagicModuleMetaRepoModel.write(iskycauditincomplete, "");
        List<ApplicationData> listMediaBrowserCompatSearchResultReceiver = iskycauditincomplete.MediaBrowserCompatSearchResultReceiver();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listMediaBrowserCompatSearchResultReceiver) {
            if (((ApplicationData) obj).IconCompatParcelizer() == ApplicationData.IconCompatParcelizer.RemoteActionCompatParcelizer) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
