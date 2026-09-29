package kotlin;

import android.util.LruCache;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u0013*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012"}, d2 = {"Lo/onShuffleModeChanged;", "", "T", "", "p0", "Lo/AnalyticsListener;", "p1", "<init>", "(ILo/AnalyticsListener;)V", "", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Object;)Z", "read", "(Ljava/lang/String;)Ljava/lang/Object;", "IconCompatParcelizer", "write", "I", "Lo/AnalyticsListener;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class onShuffleModeChanged<T> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AnalyticsListener<T> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    private onShuffleModeChanged(int i, AnalyticsListener<T> analyticsListener) {
        toMagicModuleMetaRepoModel.write(analyticsListener, "");
        this.IconCompatParcelizer = i;
        this.write = analyticsListener;
    }

    public /* synthetic */ onShuffleModeChanged(int i, AnalyticsListener analyticsListener, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i2 & 2) != 0 ? new AnalyticsListener<T>(i) { // from class: o.onShuffleModeChanged.1
            private final LruCache<String, T> IconCompatParcelizer;

            {
                AnalyticsListenerEventFlags analyticsListenerEventFlags = AnalyticsListenerEventFlags.INSTANCE;
                this.IconCompatParcelizer = AnalyticsListenerEventFlags.AudioAttributesCompatParcelizer(i);
            }

            @Override // kotlin.AnalyticsListener
            public final boolean write(String str, T t) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(t, "");
                this.IconCompatParcelizer.put(str, t);
                return true;
            }

            @Override // kotlin.AnalyticsListener
            public final T IconCompatParcelizer(String str) {
                toMagicModuleMetaRepoModel.write(str, "");
                return this.IconCompatParcelizer.get(str);
            }

            @Override // kotlin.AnalyticsListener
            public final T read(String str) {
                toMagicModuleMetaRepoModel.write(str, "");
                return this.IconCompatParcelizer.remove(str);
            }
        } : analyticsListener);
    }

    public final boolean RemoteActionCompatParcelizer(String p0, T p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (onBandwidthEstimate.write(p1) > this.IconCompatParcelizer) {
            IconCompatParcelizer(p0);
            return false;
        }
        this.write.write(p0, p1);
        return true;
    }

    public final T read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.IconCompatParcelizer(p0);
    }

    public final T IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.write.read(p0);
    }
}
