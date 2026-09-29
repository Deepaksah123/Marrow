package in.juspay.hyper.core;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import in.juspay.hyper.constants.LogLevel;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\n\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\tJ'\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\t"}, d2 = {"Lin/juspay/hyper/core/JuspayLogger;", "", "<init>", "()V", "", "p0", "p1", "", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "e", "", "p2", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, "log", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "w"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JuspayLogger {
    public static final JuspayLogger INSTANCE = new JuspayLogger();

    private JuspayLogger() {
    }

    @getMagicModuleMeta
    public static final void d(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JuspayCoreLib.isAppDebuggable();
    }

    @getMagicModuleMeta
    public static final void e(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JuspayCoreLib.isAppDebuggable();
    }

    @getMagicModuleMeta
    public static final void e(String p0, String p1, Throwable p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        JuspayCoreLib.isAppDebuggable();
    }

    @getMagicModuleMeta
    public static final void i(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JuspayCoreLib.isAppDebuggable();
    }

    @getMagicModuleMeta
    public static final void w(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JuspayCoreLib.isAppDebuggable();
    }

    @getMagicModuleMeta
    public static final void log(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        switch (p1.hashCode()) {
            case 3237038:
                if (p1.equals("info")) {
                    i(p0, p2);
                    return;
                }
                return;
            case 95458899:
                if (p1.equals(LogLevel.DEBUG)) {
                    d(p0, p2);
                    return;
                }
                return;
            case 96784904:
                if (!p1.equals("error")) {
                    return;
                }
                break;
            case 1124446108:
                if (p1.equals(LogLevel.WARNING)) {
                    w(p0, p2);
                    return;
                }
                return;
            case 1952151455:
                if (!p1.equals(LogLevel.CRITICAL)) {
                    return;
                }
                break;
            default:
                return;
        }
        e(p0, p2);
    }
}
