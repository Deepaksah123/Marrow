package kotlin;

import android.app.Application;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/shouldUseStandaloneClock;", "", "<init>", "()V", "", "IconCompatParcelizer", "()Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class shouldUseStandaloneClock {
    public static final shouldUseStandaloneClock INSTANCE = new shouldUseStandaloneClock();

    private shouldUseStandaloneClock() {
    }

    public final String IconCompatParcelizer() {
        String processName = Application.getProcessName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(processName, "");
        return processName;
    }
}
