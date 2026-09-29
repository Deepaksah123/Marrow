package kotlin;

import android.util.LruCache;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0004*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/AnalyticsListenerEventFlags;", "", "<init>", "()V", "T", "", "p0", "Landroid/util/LruCache;", "", "AudioAttributesCompatParcelizer", "(I)Landroid/util/LruCache;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AnalyticsListenerEventFlags {
    public static final AnalyticsListenerEventFlags INSTANCE = new AnalyticsListenerEventFlags();

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class RemoteActionCompatParcelizer<T> extends LruCache<String, T> {
        @Override // android.util.LruCache
        protected final T create(String str) {
            return null;
        }

        @Override // android.util.LruCache
        protected final void entryRemoved(boolean z, String str, T t, T t2) {
        }

        public RemoteActionCompatParcelizer(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        protected final int sizeOf(String str, T t) {
            return onBandwidthEstimate.write(t);
        }
    }

    private AnalyticsListenerEventFlags() {
    }

    public static <T> LruCache<String, T> AudioAttributesCompatParcelizer(int p0) {
        return new RemoteActionCompatParcelizer(p0);
    }
}
