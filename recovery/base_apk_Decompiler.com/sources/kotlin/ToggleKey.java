package kotlin;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018"}, d2 = {"Lo/ToggleKey;", "", "<init>", "()V", "", "p0", "", "p1", "p2", "", "p3", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "RemoteActionCompatParcelizer", "read", "(Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "write", "Ljava/util/concurrent/CopyOnWriteArraySet;", "", "Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ToggleKey {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<String, String> RemoteActionCompatParcelizer;
    public static final ToggleKey INSTANCE = new ToggleKey();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final CopyOnWriteArraySet<Logger> IconCompatParcelizer = new CopyOnWriteArraySet<>();

    private ToggleKey() {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = ThemeKtExternalSyntheticLambda3.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        String name2 = ThemeKtExternalSyntheticLambda3.class.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name2, "");
        linkedHashMap2.put(name2, "okhttp.OkHttpClient");
        String name3 = setConnectionMonitor.class.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name3, "");
        linkedHashMap2.put(name3, "okhttp.Http2");
        String name4 = SyncModule.class.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name4, "");
        linkedHashMap2.put(name4, "okhttp.TaskRunner");
        linkedHashMap2.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        RemoteActionCompatParcelizer = VideoTimelineResponseBody.AudioAttributesCompatParcelizer(linkedHashMap2);
    }

    public static void AudioAttributesCompatParcelizer(String p0, int p1, String p2, Throwable p3) {
        int iMin;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        if (Log.isLoggable(IconCompatParcelizer(p0), p1)) {
            if (p3 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(p2);
                sb.append('\n');
                sb.append(Log.getStackTraceString(p3));
                p2 = sb.toString();
            }
            int length = p2.length();
            int i = 0;
            while (i < length) {
                int iIconCompatParcelizer = TestGroupLSModel.IconCompatParcelizer((CharSequence) p2, '\n', i, false, 4);
                if (iIconCompatParcelizer == -1) {
                    iIconCompatParcelizer = length;
                }
                while (true) {
                    iMin = Math.min(iIconCompatParcelizer, i + 4000);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p2.substring(i, iMin), "");
                    if (iMin >= iIconCompatParcelizer) {
                        break;
                    } else {
                        i = iMin;
                    }
                }
                i = iMin + 1;
            }
        }
    }

    private static String IconCompatParcelizer(String p0) {
        String str = RemoteActionCompatParcelizer.get(p0);
        return str == null ? TestGroupLSModel.RemoteActionCompatParcelizer(p0, 23) : str;
    }

    public static void RemoteActionCompatParcelizer() {
        for (Map.Entry<String, String> entry : RemoteActionCompatParcelizer.entrySet()) {
            read(entry.getKey(), entry.getValue());
        }
    }

    private static void read(String p0, String p1) {
        Level level;
        Logger logger = Logger.getLogger(p0);
        if (IconCompatParcelizer.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(p1, 3)) {
                level = Level.FINE;
            } else {
                level = Log.isLoggable(p1, 4) ? Level.INFO : Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(VideoTimelineSideSheetViewModel.INSTANCE);
        }
    }
}
