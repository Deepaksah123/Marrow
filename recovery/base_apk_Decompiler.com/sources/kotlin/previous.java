package kotlin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class previous {
    static final String read = n.write("DelayedWorkTracker");
    private final Map<String, Runnable> AudioAttributesCompatParcelizer = new HashMap();
    private final CctBackendFactory IconCompatParcelizer;
    final willPauseWhenDucked RemoteActionCompatParcelizer;
    private final setInstallerPackageName write;

    public previous(willPauseWhenDucked willpausewhenducked, CctBackendFactory cctBackendFactory, setInstallerPackageName setinstallerpackagename) {
        this.RemoteActionCompatParcelizer = willpausewhenducked;
        this.IconCompatParcelizer = cctBackendFactory;
        this.write = setinstallerpackagename;
    }

    public final void IconCompatParcelizer(final CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategy, long j) {
        Runnable runnableRemove = this.AudioAttributesCompatParcelizer.remove(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer);
        if (runnableRemove != null) {
            this.IconCompatParcelizer.read(runnableRemove);
        }
        Runnable runnable = new Runnable() { // from class: o.previous.1
            @Override // java.lang.Runnable
            public final void run() {
                n.write();
                String str = previous.read;
                String str2 = cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer;
                previous.this.RemoteActionCompatParcelizer.read(cVideoChangeFrameRateStrategy);
            }
        };
        this.AudioAttributesCompatParcelizer.put(cVideoChangeFrameRateStrategy.AudioAttributesImplApi21Parcelizer, runnable);
        this.IconCompatParcelizer.IconCompatParcelizer(j - this.write.read(), runnable);
    }

    public final void write(String str) {
        Runnable runnableRemove = this.AudioAttributesCompatParcelizer.remove(str);
        if (runnableRemove != null) {
            this.IconCompatParcelizer.read(runnableRemove);
        }
    }
}
