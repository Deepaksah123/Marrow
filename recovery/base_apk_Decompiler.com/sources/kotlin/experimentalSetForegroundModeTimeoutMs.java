package kotlin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.setAnalyticsCollector;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/experimentalSetForegroundModeTimeoutMs;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setAnalyticsCollector;", "read", "(Landroid/content/Context;)Lo/setAnalyticsCollector;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/setAnalyticsCollector;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class experimentalSetForegroundModeTimeoutMs {
    public static final experimentalSetForegroundModeTimeoutMs INSTANCE = new experimentalSetForegroundModeTimeoutMs();
    private static setAnalyticsCollector IconCompatParcelizer;

    private experimentalSetForegroundModeTimeoutMs() {
    }

    @getMagicModuleMeta
    public static final setAnalyticsCollector read(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        setAnalyticsCollector setanalyticscollector = IconCompatParcelizer;
        return setanalyticscollector == null ? INSTANCE.RemoteActionCompatParcelizer(p0) : setanalyticscollector;
    }

    private final setAnalyticsCollector RemoteActionCompatParcelizer(Context p0) {
        synchronized (this) {
            setAnalyticsCollector setanalyticscollector = IconCompatParcelizer;
            if (setanalyticscollector != null) {
                return setanalyticscollector;
            }
            Object applicationContext = p0.getApplicationContext();
            setAnalyticsCollector setanalyticscollectorIconCompatParcelizer = null;
            setDetachSurfaceTimeoutMs setdetachsurfacetimeoutms = applicationContext instanceof setDetachSurfaceTimeoutMs ? (setDetachSurfaceTimeoutMs) applicationContext : null;
            if (setdetachsurfacetimeoutms != null) {
                setanalyticscollectorIconCompatParcelizer = setdetachsurfacetimeoutms.IconCompatParcelizer();
            }
            if (setanalyticscollectorIconCompatParcelizer == null) {
                setAnalyticsCollector.Companion companion = setAnalyticsCollector.INSTANCE;
                setanalyticscollectorIconCompatParcelizer = setAnalyticsCollector.Companion.RemoteActionCompatParcelizer(p0);
            }
            IconCompatParcelizer = setanalyticscollectorIconCompatParcelizer;
            return setanalyticscollectorIconCompatParcelizer;
        }
    }
}
