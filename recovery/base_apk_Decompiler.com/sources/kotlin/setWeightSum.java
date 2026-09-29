package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001c\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B[\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00028\u0000\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00028\u00008\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR+\u0010\"\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u00008G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\u001e\u0010$R*\u0010%\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u00018\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0018\u0010'\"\u0004\b\u001e\u0010(R*\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d\"\u0004\b\"\u0010)R*\u0010 \u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t8\u0007@AX\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d\"\u0004\b\u001b\u0010)R+\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8G@AX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010!\u001a\u0004\b*\u0010+\"\u0004\b\u001e\u0010,R\u0011\u0010*\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b \u0010#"}, d2 = {"Lo/setWeightSum;", "T", "Lo/ScrollingTabContainerView;", "V", "", "p0", "Lo/evictionCount;", "p1", "p2", "", "p3", "p4", "p5", "", "p6", "Lkotlin/Function0;", "", "p7", "<init>", "(Ljava/lang/Object;Lo/evictionCount;Lo/ScrollingTabContainerView;JLjava/lang/Object;JZLo/getCreatedOnDateMs;)V", "AudioAttributesCompatParcelizer", "()V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/evictionCount;", "MediaBrowserCompatItemReceiver", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "J", "()J", "read", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer", "Lo/InputAccessor;", "write", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "AudioAttributesImplApi21Parcelizer", "Lo/ScrollingTabContainerView;", "()Lo/ScrollingTabContainerView;", "(Lo/ScrollingTabContainerView;)V", "(J)V", "AudioAttributesImplBaseParcelizer", "()Z", "(Z)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setWeightSum<T, V extends ScrollingTabContainerView> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;
    private V AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final InputAccessor write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final evictionCount<T, V> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final T RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesImplApi26Parcelizer = Long.MIN_VALUE;

    public setWeightSum(T t, evictionCount<T, V> evictioncount, V v, long j, T t2, long j2, boolean z, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesCompatParcelizer = evictioncount;
        this.RemoteActionCompatParcelizer = t2;
        this.read = j2;
        this.IconCompatParcelizer = getcreatedondatems;
        this.write = available.RemoteActionCompatParcelizer$default(t, null, 2, null);
        this.AudioAttributesImplApi21Parcelizer = (V) SearchView.AudioAttributesCompatParcelizer(v);
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(Boolean.valueOf(z), null, 2, null);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    public final void read(T t) {
        this.write.write(t);
    }

    public final T write() {
        return this.write.getRemoteActionCompatParcelizer();
    }

    public final V MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void read(V v) {
        this.AudioAttributesImplApi21Parcelizer = v;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void write(long j) {
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void IconCompatParcelizer(long j) {
        this.AudioAttributesImplApi26Parcelizer = j;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return ((Boolean) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer()).booleanValue();
    }

    public final void read(boolean z) {
        this.MediaBrowserCompatItemReceiver.write(Boolean.valueOf(z));
    }

    public final T AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.read().invoke(this.AudioAttributesImplApi21Parcelizer);
    }

    public final void AudioAttributesCompatParcelizer() {
        read(false);
        this.IconCompatParcelizer.invoke();
    }
}
