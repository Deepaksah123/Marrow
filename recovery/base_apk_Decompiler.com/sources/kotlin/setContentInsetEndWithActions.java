package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0015\bJ\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0005R\u001d\u0010\u0010\u001a\u00028\u00008W@PX\u0096\u008c\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00008W@QX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\b\u0010\u0014R\u001c\u0010\n\u001a\u00028\u00008\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u001a8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR+\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u001f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u0016\u0010\"\"\u0004\b\u0013\u0010#R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b\u0015\u0010&\"\u0004\b\n\u0010'R\u001a\u0010\f\u001a\u00020(8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\b\u0010*R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0018\u0010\u000e\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010."}, d2 = {"Lo/setContentInsetEndWithActions;", "S", "Lo/createCount;", "", "AudioAttributesImplApi26Parcelizer", "()V", "Lo/setLayoutInflater;", "p0", "IconCompatParcelizer", "(Lo/setLayoutInflater;)V", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "Lo/InputAccessor;", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "AudioAttributesImplApi21Parcelizer", "read", "(Ljava/lang/Object;)V", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/lang/Object;", "MediaDescriptionCompat", "Lo/setLayoutInflater;", "", "J", "Lkotlin/Function0;", "RatingCompat", "Lo/getCreatedOnDateMs;", "", "MediaBrowserCompatMediaItem", "Lo/nextTokenToRead;", "()F", "(F)V", "Lo/setStateRank;", "Lo/setStateRank;", "()Lo/setStateRank;", "(Lo/setStateRank;)V", "Lo/setDownloadPercent;", "Lo/setDownloadPercent;", "()Lo/setDownloadPercent;", "Lo/setDropDownBackgroundResource;", "Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;", "Lo/setDropDownBackgroundResource;", "Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setContentInsetEndWithActions<S> extends createCount<S> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final InputAccessor RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private RemoteActionCompatParcelizer MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private setStateRank<? super S> AudioAttributesImplApi26Parcelizer;
    private final setDownloadPercent MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private S write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final nextTokenToRead AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final setDropDownBackgroundResource<RemoteActionCompatParcelizer> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private setLayoutInflater<S> read;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final InputAccessor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public long IconCompatParcelizer;
    private static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer(null);
    public static final int AudioAttributesCompatParcelizer = 8;
    private static final setHoverListener write = new setHoverListener(BitmapDescriptorFactory.HUE_RED);
    private static final setHoverListener RemoteActionCompatParcelizer = new setHoverListener(1.0f);

    @Override // kotlin.createCount
    public final S AudioAttributesCompatParcelizer() {
        return (S) this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.createCount
    public final void IconCompatParcelizer(S s) {
        this.RemoteActionCompatParcelizer.write(s);
    }

    @Override // kotlin.createCount
    public final S read() {
        return (S) this.RemoteActionCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final void read(S s) {
        this.write = s;
    }

    private final void read(float f) {
        this.AudioAttributesImplBaseParcelizer.write(f);
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer();
    }

    public final setStateRank<S> RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void write(setStateRank<? super S> setstaterank) {
        this.AudioAttributesImplApi26Parcelizer = setstaterank;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setDownloadPercent getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        setLayoutInflater<S> setlayoutinflater = this.read;
        if (setlayoutinflater != null) {
            setlayoutinflater.write();
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat = null;
            read(1.0f);
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    @Override // kotlin.createCount
    public final void IconCompatParcelizer(setLayoutInflater<S> p0) {
        setLayoutInflater<S> setlayoutinflater = this.read;
        if (setlayoutinflater != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setlayoutinflater)) {
            StringBuilder sb = new StringBuilder("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
            sb.append(this.read);
            sb.append(", new instance: ");
            sb.append(p0);
            setCollapsible.IconCompatParcelizer(sb.toString());
        }
        this.read = p0;
    }

    @Override // kotlin.createCount
    public final void write() {
        this.read = null;
        setCardElevation.RemoteActionCompatParcelizer().read(this);
    }

    public final void AudioAttributesImplBaseParcelizer() {
        setCardElevation.RemoteActionCompatParcelizer().IconCompatParcelizer(this, (getAnswerMap<? super setContentInsetEndWithActions<S>, getShowPopup>) setCardElevation.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        long j = this.IconCompatParcelizer;
        AudioAttributesImplBaseParcelizer();
        long j2 = this.IconCompatParcelizer;
        if (j != j2) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaMetadataCompat;
            if (remoteActionCompatParcelizer == null) {
                if (j2 != 0) {
                    MediaBrowserCompatSearchResultReceiver();
                    return;
                }
                return;
            }
            long write2 = remoteActionCompatParcelizer.getWrite();
            long j3 = this.IconCompatParcelizer;
            if (write2 > j3) {
                AudioAttributesImplApi26Parcelizer();
                return;
            }
            remoteActionCompatParcelizer.read(j3);
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer() == null) {
                remoteActionCompatParcelizer.IconCompatParcelizer(getOnline.write((1.0d - ((double) remoteActionCompatParcelizer.getRemoteActionCompatParcelizer().read(0))) * this.IconCompatParcelizer));
            }
        }
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        setLayoutInflater<S> setlayoutinflater = this.read;
        if (setlayoutinflater == null) {
            return;
        }
        setlayoutinflater.IconCompatParcelizer(getOnline.write(((double) MediaBrowserCompatItemReceiver()) * setlayoutinflater.MediaBrowserCompatSearchResultReceiver()));
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u00020\u00078\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00138\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0011\u001a\u00020\u000e8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u001c\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u001b\u0010\t\"\u0004\b\u000f\u0010\u001cR\u001c\u0010\u001d\u001a\u00020\u00078\u0006@\u0007X\u0087\u000e¢\u0006\f\n\u0004\b\u0011\u0010\t\"\u0004\b\n\u0010\u001c"}, d2 = {"Lo/setContentInsetEndWithActions$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "AudioAttributesImplApi21Parcelizer", "J", "IconCompatParcelizer", "()J", "write", "Lo/ParcelableSnapshotMutableIntState;", "Lo/setHoverListener;", "read", "Lo/ParcelableSnapshotMutableIntState;", "RemoteActionCompatParcelizer", "()Lo/ParcelableSnapshotMutableIntState;", "", "Z", "", "AudioAttributesCompatParcelizer", "F", "AudioAttributesImplApi26Parcelizer", "Lo/setHoverListener;", "()Lo/setHoverListener;", "MediaBrowserCompatItemReceiver", "(J)V", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        public float AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private long write;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private setHoverListener RemoteActionCompatParcelizer = new setHoverListener(BitmapDescriptorFactory.HUE_RED);

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public setHoverListener MediaBrowserCompatItemReceiver;

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
        private long AudioAttributesImplApi21Parcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private long MediaBrowserCompatCustomActionResultReceiver;
        private ParcelableSnapshotMutableIntState<setHoverListener> read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        public boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        public final ParcelableSnapshotMutableIntState<setHoverListener> RemoteActionCompatParcelizer() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final setHoverListener getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void read(long j) {
            this.AudioAttributesImplApi21Parcelizer = j;
        }

        public final void IconCompatParcelizer(long j) {
            this.MediaBrowserCompatCustomActionResultReceiver = j;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("progress nanos: ");
            sb.append(this.write);
            sb.append(", animationSpec: ");
            sb.append(this.read);
            sb.append(", isComplete: ");
            sb.append(this.IconCompatParcelizer);
            sb.append(", value: ");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", start: ");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", initialVelocity: ");
            sb.append(this.MediaBrowserCompatItemReceiver);
            sb.append(", durationNanos: ");
            sb.append(this.AudioAttributesImplApi21Parcelizer);
            sb.append(", animationSpecDuration: ");
            sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/setContentInsetEndWithActions$IconCompatParcelizer;", "", "<init>", "()V", "Lo/setHoverListener;", "write", "Lo/setHoverListener;", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
