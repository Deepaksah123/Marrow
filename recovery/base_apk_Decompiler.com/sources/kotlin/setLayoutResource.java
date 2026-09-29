package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004BG\b\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\rBG\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\f\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001dR\u0016\u0010\u001f\u001a\u00028\u00008\u0000@@X\u0081\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010\u0013\u001a\u00028\u00008\u0000@@X\u0081\f¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0018\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\u0018\u0010 R\u0014\u0010!\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00028\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010\u001b\u001a\u00028\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010$\u001a\u00020&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010'R\u0016\u0010)\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0014\u0010+\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00018\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#R\u0014\u0010.\u001a\u00028\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010-"}, d2 = {"Lo/setLayoutResource;", "T", "Lo/ScrollingTabContainerView;", "V", "Lo/setMeasureWithLargestChildEnabled;", "Lo/ParcelableSnapshotMutableIntState;", "p0", "Lo/evictionCount;", "p1", "p2", "p3", "p4", "<init>", "(Lo/ParcelableSnapshotMutableIntState;Lo/evictionCount;Ljava/lang/Object;Ljava/lang/Object;Lo/ScrollingTabContainerView;)V", "Lo/setOrientation;", "(Lo/setOrientation;Lo/evictionCount;Ljava/lang/Object;Ljava/lang/Object;Lo/ScrollingTabContainerView;)V", "", "read", "(J)Ljava/lang/Object;", "IconCompatParcelizer", "(J)Lo/ScrollingTabContainerView;", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/ParcelableSnapshotMutableIntState;", "write", "AudioAttributesImplBaseParcelizer", "Lo/evictionCount;", "()Lo/evictionCount;", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ScrollingTabContainerView;", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplApi26Parcelizer", "", "()Z", "J", "MediaBrowserCompatSearchResultReceiver", "()J", "MediaBrowserCompatMediaItem", "MediaMetadataCompat", "()Lo/ScrollingTabContainerView;", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setLayoutResource<T, V extends ScrollingTabContainerView> implements setMeasureWithLargestChildEnabled<T, V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ParcelableSnapshotMutableIntState<V> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private V AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final evictionCount<T, V> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public T RemoteActionCompatParcelizer;
    private V MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final V AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public T IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private V MediaMetadataCompat;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver;

    public setLayoutResource(ParcelableSnapshotMutableIntState<V> parcelableSnapshotMutableIntState, evictionCount<T, V> evictioncount, T t, T t2, V v) {
        V v2;
        this.write = parcelableSnapshotMutableIntState;
        this.read = evictioncount;
        this.RemoteActionCompatParcelizer = t2;
        this.IconCompatParcelizer = t;
        this.MediaBrowserCompatCustomActionResultReceiver = write().RemoteActionCompatParcelizer().invoke(t);
        this.AudioAttributesImplApi26Parcelizer = write().RemoteActionCompatParcelizer().invoke(t2);
        this.AudioAttributesImplBaseParcelizer = (v == null || (v2 = (V) SearchView.AudioAttributesCompatParcelizer(v)) == null) ? (V) SearchView.IconCompatParcelizer(write().RemoteActionCompatParcelizer().invoke(t)) : v2;
        this.MediaBrowserCompatSearchResultReceiver = -1L;
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final evictionCount<T, V> write() {
        return this.read;
    }

    public final T AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final T RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ setLayoutResource(setOrientation setorientation, evictionCount evictioncount, Object obj, Object obj2, ScrollingTabContainerView scrollingTabContainerView, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((setOrientation<Object>) setorientation, (evictionCount<Object, ScrollingTabContainerView>) evictioncount, obj, obj2, (i & 16) != 0 ? null : scrollingTabContainerView);
    }

    public setLayoutResource(setOrientation<T> setorientation, evictionCount<T, V> evictioncount, T t, T t2, V v) {
        this(setorientation.IconCompatParcelizer(evictioncount), evictioncount, t, t2, v);
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final boolean read() {
        return this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final T read(long p0) {
        if (!write(p0)) {
            ScrollingTabContainerView scrollingTabContainerViewIconCompatParcelizer = this.write.IconCompatParcelizer(p0, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer);
            int iconCompatParcelizer = scrollingTabContainerViewIconCompatParcelizer.getIconCompatParcelizer();
            for (int i = 0; i < iconCompatParcelizer; i++) {
                if (Float.isNaN(scrollingTabContainerViewIconCompatParcelizer.read(i))) {
                    StringBuilder sb = new StringBuilder("AnimationVector cannot contain a NaN. ");
                    sb.append(scrollingTabContainerViewIconCompatParcelizer);
                    sb.append(". Animation: ");
                    sb.append(this);
                    sb.append(", playTimeNanos: ");
                    sb.append(p0);
                    setCollapsible.IconCompatParcelizer(sb.toString());
                }
            }
            return (T) write().read().invoke(scrollingTabContainerViewIconCompatParcelizer);
        }
        return RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final long IconCompatParcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver < 0) {
            this.MediaBrowserCompatSearchResultReceiver = this.write.write(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer);
        }
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private final V AudioAttributesImplApi21Parcelizer() {
        V v = this.MediaMetadataCompat;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.write.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer);
        this.MediaMetadataCompat = v2;
        return v2;
    }

    @Override // kotlin.setMeasureWithLargestChildEnabled
    public final V IconCompatParcelizer(long p0) {
        if (!write(p0)) {
            return (V) this.write.read(p0, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, this.AudioAttributesImplBaseParcelizer);
        }
        return (V) AudioAttributesImplApi21Parcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TargetBasedAnimation: ");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(" -> ");
        sb.append(RemoteActionCompatParcelizer());
        sb.append(",initial velocity: ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", duration: ");
        sb.append(setGravity.RemoteActionCompatParcelizer(this));
        sb.append(" ms,animationSpec: ");
        sb.append(this.write);
        return sb.toString();
    }
}
