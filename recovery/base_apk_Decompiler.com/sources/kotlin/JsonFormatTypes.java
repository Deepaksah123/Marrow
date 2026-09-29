package kotlin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonFormatTypes {
    private volatile boolean read;
    private final JDK14UtilRecordAccessor RemoteActionCompatParcelizer = new JDK14UtilRecordAccessor();
    private final Map<String, AutoCloseable> IconCompatParcelizer = new LinkedHashMap();
    private final Set<AutoCloseable> write = new LinkedHashSet();

    public final void write() {
        if (this.read) {
            return;
        }
        this.read = true;
        synchronized (this.RemoteActionCompatParcelizer) {
            Iterator it = this.IconCompatParcelizer.values().iterator();
            while (it.hasNext()) {
                RemoteActionCompatParcelizer((AutoCloseable) it.next());
            }
            Iterator it2 = this.write.iterator();
            while (it2.hasNext()) {
                RemoteActionCompatParcelizer((AutoCloseable) it2.next());
            }
            this.write.clear();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(autoCloseable, "");
        if (this.read) {
            RemoteActionCompatParcelizer(autoCloseable);
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            autoCloseable2 = (AutoCloseable) this.IconCompatParcelizer.put(str, autoCloseable);
        }
        RemoteActionCompatParcelizer(autoCloseable2);
    }

    public final void write(AutoCloseable autoCloseable) {
        toMagicModuleMetaRepoModel.write(autoCloseable, "");
        if (this.read) {
            RemoteActionCompatParcelizer(autoCloseable);
            return;
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            this.write.add(autoCloseable);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final <T extends AutoCloseable> T RemoteActionCompatParcelizer(String str) {
        T t;
        toMagicModuleMetaRepoModel.write(str, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            t = (T) this.IconCompatParcelizer.get(str);
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void RemoteActionCompatParcelizer(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                findFormatFeature.AudioAttributesCompatParcelizer(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
