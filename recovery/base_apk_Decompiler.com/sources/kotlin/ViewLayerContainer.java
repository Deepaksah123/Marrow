package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BE\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J/\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\u0013\u001a\u00020\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u0017\u0010%R\u001a\u0010\u001d\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b\u001d\u0010%R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0014\u0010'\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010!\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00103\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010/R\u0018\u0010.\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u0010\u001f\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00101\u001a\u00020*8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010,R\u0016\u0010+\u001a\u0002048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u00105"}, d2 = {"Lo/ViewLayerContainer;", "Lo/ScrollingTabContainerView;", "V", "Lo/ParcelableSnapshotMutableLongState;", "Lo/setWindowTitle;", "p0", "Lo/setExpandedActionViewsExclusive;", "Lo/ViewLayer;", "p1", "", "p2", "p3", "Lo/setOnQueryTextFocusChangeListener;", "p4", "Lo/setSelected;", "p5", "<init>", "(Lo/setWindowTitle;Lo/setExpandedActionViewsExclusive;IILo/setOnQueryTextFocusChangeListener;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "IconCompatParcelizer", "(Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)V", "", "(JLo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;Lo/ScrollingTabContainerView;)Lo/ScrollingTabContainerView;", "read", "", "RemoteActionCompatParcelizer", "(I)F", "", "(IIZ)F", "write", "(I)I", "RatingCompat", "Lo/setWindowTitle;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setExpandedActionViewsExclusive;", "AudioAttributesCompatParcelizer", "I", "()I", "Lo/setOnQueryTextFocusChangeListener;", "AudioAttributesImplApi21Parcelizer", "", "[I", "", "MediaBrowserCompatSearchResultReceiver", "[F", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatMediaItem", "Lo/ScrollingTabContainerView;", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "Lo/setTabSelected;", "Lo/setTabSelected;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ViewLayerContainer<V extends ScrollingTabContainerView> implements ParcelableSnapshotMutableLongState<V> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int[] MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private V MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private V MediaDescriptionCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private setTabSelected MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setExpandedActionViewsExclusive<ViewLayer<V>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private float[] RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private V AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private float[] AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private float[] MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private V MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setWindowTitle RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;
    private final setOnQueryTextFocusChangeListener read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    private ViewLayerContainer(setWindowTitle setwindowtitle, setExpandedActionViewsExclusive<ViewLayer<V>> setexpandedactionviewsexclusive, int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i3) {
        this.RemoteActionCompatParcelizer = setwindowtitle;
        this.AudioAttributesCompatParcelizer = setexpandedactionviewsexclusive;
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = setonquerytextfocuschangelistener;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = ParcelableSnapshotMutableState.RemoteActionCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = ParcelableSnapshotMutableState.read;
        this.RatingCompat = ParcelableSnapshotMutableState.read;
        this.MediaMetadataCompat = ParcelableSnapshotMutableState.read;
        this.MediaBrowserCompatSearchResultReceiver = ParcelableSnapshotMutableState.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.ParcelableSnapshotMutableLongState
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ParcelableSnapshotMutableLongState
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    private final void IconCompatParcelizer(V p0, V p1, V p2) {
        float[] fArr;
        boolean z = this.MediaBrowserCompatSearchResultReceiver != ParcelableSnapshotMutableState.AudioAttributesCompatParcelizer;
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = (V) SearchView.IconCompatParcelizer(p0);
            this.MediaBrowserCompatItemReceiver = (V) SearchView.IconCompatParcelizer(p2);
            int i = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = this.RemoteActionCompatParcelizer.read(i2) / 1000.0f;
            }
            this.AudioAttributesImplBaseParcelizer = fArr2;
            int i3 = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                ViewLayer<V> viewLayerAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.read(i4));
                int read = viewLayerAudioAttributesCompatParcelizer != null ? viewLayerAudioAttributesCompatParcelizer.getRead() : this.AudioAttributesImplApi21Parcelizer;
                if (!setSelected.write(read, setSelected.INSTANCE.read())) {
                    z = true;
                }
                iArr[i4] = read;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = iArr;
        }
        if (z) {
            if (this.MediaBrowserCompatSearchResultReceiver != ParcelableSnapshotMutableState.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, p0) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, p1)) {
                return;
            }
            this.MediaDescriptionCompat = p0;
            this.MediaBrowserCompatMediaItem = p1;
            int iconCompatParcelizer = (p0.getIconCompatParcelizer() % 2) + p0.getIconCompatParcelizer();
            this.RatingCompat = new float[iconCompatParcelizer];
            this.MediaMetadataCompat = new float[iconCompatParcelizer];
            int i5 = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = this.RemoteActionCompatParcelizer.read(i6);
                ViewLayer<V> viewLayerAudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i7);
                if (i7 == 0 && viewLayerAudioAttributesCompatParcelizer2 == null) {
                    fArr = new float[iconCompatParcelizer];
                    for (int i8 = 0; i8 < iconCompatParcelizer; i8++) {
                        fArr[i8] = p0.read(i8);
                    }
                } else if (i7 == getIconCompatParcelizer() && viewLayerAudioAttributesCompatParcelizer2 == null) {
                    fArr = new float[iconCompatParcelizer];
                    for (int i9 = 0; i9 < iconCompatParcelizer; i9++) {
                        fArr[i9] = p1.read(i9);
                    }
                } else {
                    toMagicModuleMetaRepoModel.write(viewLayerAudioAttributesCompatParcelizer2);
                    ScrollingTabContainerView scrollingTabContainerViewAudioAttributesCompatParcelizer = viewLayerAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer();
                    float[] fArr4 = new float[iconCompatParcelizer];
                    for (int i10 = 0; i10 < iconCompatParcelizer; i10++) {
                        fArr4[i10] = scrollingTabContainerViewAudioAttributesCompatParcelizer.read(i10);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.MediaBrowserCompatSearchResultReceiver = new setTabSelected(this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, fArr3);
        }
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V IconCompatParcelizer(long p0, V p1, V p2, V p3) {
        ScrollingTabContainerView scrollingTabContainerViewAudioAttributesCompatParcelizer;
        ScrollingTabContainerView scrollingTabContainerViewAudioAttributesCompatParcelizer2;
        int iIconCompatParcelizer = (int) ParcelableSnapshotMutableState.IconCompatParcelizer(this, p0 / 1000000);
        ViewLayer<V> viewLayerAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
        if (viewLayerAudioAttributesCompatParcelizer != null) {
            return (V) viewLayerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        }
        if (iIconCompatParcelizer >= getIconCompatParcelizer()) {
            return p2;
        }
        if (iIconCompatParcelizer <= 0) {
            return p1;
        }
        IconCompatParcelizer(p1, p2, p3);
        V v = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(v);
        int i = 0;
        if (this.MediaBrowserCompatSearchResultReceiver != ParcelableSnapshotMutableState.AudioAttributesCompatParcelizer) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iIconCompatParcelizer);
            float[] fArr = this.RatingCompat;
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(fRemoteActionCompatParcelizer, fArr);
            int length = fArr.length;
            while (i < length) {
                v.IconCompatParcelizer(i, fArr[i]);
                i++;
            }
        } else {
            int iWrite = write(iIconCompatParcelizer);
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(iWrite, iIconCompatParcelizer, true);
            ViewLayer<V> viewLayerAudioAttributesCompatParcelizer2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.read(iWrite));
            if (viewLayerAudioAttributesCompatParcelizer2 != null && (scrollingTabContainerViewAudioAttributesCompatParcelizer2 = viewLayerAudioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer()) != null) {
                p1 = (V) scrollingTabContainerViewAudioAttributesCompatParcelizer2;
            }
            ViewLayer<V> viewLayerAudioAttributesCompatParcelizer3 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer.read(iWrite + 1));
            if (viewLayerAudioAttributesCompatParcelizer3 != null && (scrollingTabContainerViewAudioAttributesCompatParcelizer = viewLayerAudioAttributesCompatParcelizer3.AudioAttributesCompatParcelizer()) != null) {
                p2 = (V) scrollingTabContainerViewAudioAttributesCompatParcelizer;
            }
            int iconCompatParcelizer = v.getIconCompatParcelizer();
            while (i < iconCompatParcelizer) {
                v.IconCompatParcelizer(i, (p1.read(i) * (1.0f - fRemoteActionCompatParcelizer2)) + (p2.read(i) * fRemoteActionCompatParcelizer2));
                i++;
            }
        }
        return v;
    }

    @Override // kotlin.ParcelableSnapshotMutableIntState
    public final V read(long p0, V p1, V p2, V p3) {
        long jIconCompatParcelizer = ParcelableSnapshotMutableState.IconCompatParcelizer(this, p0 / 1000000);
        if (jIconCompatParcelizer < 0) {
            return p3;
        }
        IconCompatParcelizer(p1, p2, p3);
        V v = this.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.write(v);
        int i = 0;
        if (this.MediaBrowserCompatSearchResultReceiver != ParcelableSnapshotMutableState.AudioAttributesCompatParcelizer) {
            float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((int) jIconCompatParcelizer);
            float[] fArr = this.MediaMetadataCompat;
            this.MediaBrowserCompatSearchResultReceiver.read(fRemoteActionCompatParcelizer, fArr);
            int length = fArr.length;
            while (i < length) {
                v.IconCompatParcelizer(i, fArr[i]);
                i++;
            }
        } else {
            ViewLayerContainer<V> viewLayerContainer = this;
            ScrollingTabContainerView scrollingTabContainerViewWrite = ParcelableSnapshotMutableState.write(viewLayerContainer, jIconCompatParcelizer - 1, p1, p2, p3);
            ScrollingTabContainerView scrollingTabContainerViewWrite2 = ParcelableSnapshotMutableState.write(viewLayerContainer, jIconCompatParcelizer, p1, p2, p3);
            int iconCompatParcelizer = scrollingTabContainerViewWrite.getIconCompatParcelizer();
            while (i < iconCompatParcelizer) {
                v.IconCompatParcelizer(i, (scrollingTabContainerViewWrite.read(i) - scrollingTabContainerViewWrite2.read(i)) * 1000.0f);
                i++;
            }
        }
        return v;
    }

    private final float RemoteActionCompatParcelizer(int p0) {
        return RemoteActionCompatParcelizer(write(p0), p0, false);
    }

    private final float RemoteActionCompatParcelizer(int p0, int p1, boolean p2) {
        setOnQueryTextFocusChangeListener remoteActionCompatParcelizer;
        float f;
        if (p0 >= this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer - 1) {
            f = p1;
        } else {
            int i = this.RemoteActionCompatParcelizer.read(p0);
            int i2 = this.RemoteActionCompatParcelizer.read(p0 + 1);
            if (p1 != i) {
                ViewLayer<V> viewLayerAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i);
                if (viewLayerAudioAttributesCompatParcelizer == null || (remoteActionCompatParcelizer = viewLayerAudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) == null) {
                    remoteActionCompatParcelizer = this.read;
                }
                float f2 = i2 - i;
                float fAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer((p1 - i) / f2);
                return p2 ? fAudioAttributesCompatParcelizer : ((f2 * fAudioAttributesCompatParcelizer) + i) / 1000.0f;
            }
            f = i;
        }
        return f / 1000.0f;
    }

    private final int write(int p0) {
        setWindowTitle setwindowtitle = this.RemoteActionCompatParcelizer;
        int iAudioAttributesCompatParcelizer = setwindowtitle.AudioAttributesCompatParcelizer(p0, 0, setwindowtitle.AudioAttributesCompatParcelizer);
        return iAudioAttributesCompatParcelizer < -1 ? -(iAudioAttributesCompatParcelizer + 2) : iAudioAttributesCompatParcelizer;
    }

    public /* synthetic */ ViewLayerContainer(setWindowTitle setwindowtitle, setExpandedActionViewsExclusive setexpandedactionviewsexclusive, int i, int i2, setOnQueryTextFocusChangeListener setonquerytextfocuschangelistener, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(setwindowtitle, setexpandedactionviewsexclusive, i, i2, setonquerytextfocuschangelistener, i3);
    }
}
