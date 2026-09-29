package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCurrentTrackSelections;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b \u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\rJ\u0011\u0010\u000b\u001a\u00020\n*\u00020\b¢\u0006\u0004\b\u000b\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0011\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u001b\u0010\u0012\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0012\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\rJK\u0010\u0011\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u001aJG\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u0012\u001a\u00020\u0014*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u001dJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ'\u0010\u0011\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010 J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010!J\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u001eJ#\u0010\u001b\u001a\u00020\n*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\"J\u0013\u0010\u001b\u001a\u00020\n*\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010$R \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010/\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010$R$\u00105\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b\u001b\u00104R$\u00103\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148\u0001@BX\u0081\u000e¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b\u0011\u00104R\u0016\u0010,\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u0010-\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00101R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u0010$R\u0016\u00107\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u00101"}, d2 = {"Lo/onCancelLoad;", "", "Lo/onContentChanged;", "p0", "", "p1", "<init>", "(Lo/onContentChanged;Z)V", "Lo/setUpdateThrottle;", "", "", "AudioAttributesCompatParcelizer", "(Lo/setUpdateThrottle;F)V", "()V", "(Lo/setUpdateThrottle;)V", "write", "()Z", "IconCompatParcelizer", "read", "(Lo/setUpdateThrottle;Z)V", "", "p2", "p3", "p4", "p5", "p6", "(Lo/setUpdateThrottle;IIIIIFZ)V", "RemoteActionCompatParcelizer", "(IIIIIFI)V", "(Lo/setUpdateThrottle;IZ)I", "(II)V", "Lo/abandon;", "(IILjava/lang/Object;)Lo/abandon;", "(ILjava/lang/Object;I)V", "(Lo/setUpdateThrottle;II)V", "Lo/onContentChanged;", "Z", "Lo/setProvider;", "", "Lo/getCurrentTrackSelections$RemoteActionCompatParcelizer;", "AudioAttributesImplBaseParcelizer", "Lo/setProvider;", "Lo/setBackgroundDrawable;", "Lo/setBackgroundDrawable;", "RatingCompat", "MediaBrowserCompatMediaItem", "F", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "I", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "()I", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaDescriptionCompat"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class onCancelLoad {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final onContentChanged RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setProvider<List<getCurrentTrackSelections.RemoteActionCompatParcelizer>> read = ActionMenuView.write();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setBackgroundDrawable AudioAttributesCompatParcelizer = setPopupTheme.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final setProvider<abandon> write = ActionMenuView.write();

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver = -1;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver = Integer.MIN_VALUE;

    public onCancelLoad(onContentChanged oncontentchanged, boolean z) {
        this.RemoteActionCompatParcelizer = oncontentchanged;
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(setUpdateThrottle setupdatethrottle, float f) {
        AudioAttributesCompatParcelizer();
        write(setupdatethrottle, f);
        IconCompatParcelizer(setupdatethrottle, f);
        this.AudioAttributesImplApi26Parcelizer = f;
        AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesCompatParcelizer() {
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("prefetchWindowStartExtraSpace", this.RatingCompat);
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("prefetchWindowEndExtraSpace", this.MediaBrowserCompatMediaItem);
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("prefetchWindowStartIndex", this.AudioAttributesImplApi21Parcelizer);
        AtomicIntegerDeserializer.AudioAttributesCompatParcelizer("prefetchWindowEndIndex", this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void AudioAttributesCompatParcelizer(setUpdateThrottle setupdatethrottle) {
        if (!this.AudioAttributesImplBaseParcelizer && this.IconCompatParcelizer) {
            onContentChanged oncontentchanged = this.RemoteActionCompatParcelizer;
            bufferMapProperty buffermapproperty = setupdatethrottle.read();
            if (buffermapproperty != null && oncontentchanged.read(buffermapproperty, setupdatethrottle.AudioAttributesImplApi21Parcelizer()) != 0) {
                this.MediaMetadataCompat = true;
            }
            this.AudioAttributesImplBaseParcelizer = true;
        }
        int i = this.MediaBrowserCompatItemReceiver;
        if (i != -1 && i != setupdatethrottle.MediaBrowserCompatCustomActionResultReceiver()) {
            read(setupdatethrottle);
        }
        this.MediaDescriptionCompat = setupdatethrottle.MediaBrowserCompatCustomActionResultReceiver();
        if (!setupdatethrottle.write()) {
            read();
        } else {
            int iMediaBrowserCompatItemReceiver = setupdatethrottle.MediaBrowserCompatItemReceiver();
            for (int i2 = 0; i2 < iMediaBrowserCompatItemReceiver; i2++) {
                int iAudioAttributesCompatParcelizer = setupdatethrottle.AudioAttributesCompatParcelizer(i2);
                Object obj = setupdatethrottle.read(i2);
                int iIconCompatParcelizer = setupdatethrottle.IconCompatParcelizer(i2);
                if (iAudioAttributesCompatParcelizer != -1) {
                    RemoteActionCompatParcelizer(iAudioAttributesCompatParcelizer, obj, iIconCompatParcelizer);
                }
            }
            if (this.MediaMetadataCompat) {
                read(setupdatethrottle, this.AudioAttributesImplApi26Parcelizer <= BitmapDescriptorFactory.HUE_RED);
                this.MediaMetadataCompat = false;
            }
        }
        this.MediaBrowserCompatItemReceiver = setupdatethrottle.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean write() {
        return (this.AudioAttributesImplApi21Parcelizer == Integer.MAX_VALUE || this.MediaBrowserCompatCustomActionResultReceiver == Integer.MIN_VALUE) ? false : true;
    }

    private final void write(setUpdateThrottle setupdatethrottle, float f) {
        if (setupdatethrottle.write()) {
            int iAudioAttributesImplApi21Parcelizer = setupdatethrottle.AudioAttributesImplApi21Parcelizer();
            onContentChanged oncontentchanged = this.RemoteActionCompatParcelizer;
            bufferMapProperty buffermapproperty = setupdatethrottle.read();
            int iAudioAttributesCompatParcelizer = buffermapproperty != null ? oncontentchanged.AudioAttributesCompatParcelizer(buffermapproperty, iAudioAttributesImplApi21Parcelizer) : 0;
            this.MediaDescriptionCompat = setupdatethrottle.MediaBrowserCompatCustomActionResultReceiver();
            RemoteActionCompatParcelizer(setupdatethrottle.AudioAttributesCompatParcelizer(), setupdatethrottle.RemoteActionCompatParcelizer(), setupdatethrottle.AudioAttributesImplBaseParcelizer(), setupdatethrottle.AudioAttributesImplApi26Parcelizer(), iAudioAttributesCompatParcelizer, f, setupdatethrottle.MediaBrowserCompatCustomActionResultReceiver());
        }
    }

    private final void IconCompatParcelizer(setUpdateThrottle setupdatethrottle, float f) {
        if (setupdatethrottle.write()) {
            int iAudioAttributesImplApi21Parcelizer = setupdatethrottle.AudioAttributesImplApi21Parcelizer();
            onContentChanged oncontentchanged = this.RemoteActionCompatParcelizer;
            bufferMapProperty buffermapproperty = setupdatethrottle.read();
            int i = buffermapproperty != null ? oncontentchanged.read(buffermapproperty, iAudioAttributesImplApi21Parcelizer) : 0;
            IconCompatParcelizer(setupdatethrottle, setupdatethrottle.AudioAttributesCompatParcelizer(), setupdatethrottle.RemoteActionCompatParcelizer(), i, setupdatethrottle.AudioAttributesImplBaseParcelizer(), setupdatethrottle.AudioAttributesImplApi26Parcelizer(), f, f <= BitmapDescriptorFactory.HUE_RED);
        }
    }

    private final void read(setUpdateThrottle setupdatethrottle, boolean z) {
        if (setupdatethrottle.write()) {
            int iAudioAttributesImplApi21Parcelizer = setupdatethrottle.AudioAttributesImplApi21Parcelizer();
            onContentChanged oncontentchanged = this.RemoteActionCompatParcelizer;
            bufferMapProperty buffermapproperty = setupdatethrottle.read();
            IconCompatParcelizer(setupdatethrottle, setupdatethrottle.AudioAttributesCompatParcelizer(), setupdatethrottle.RemoteActionCompatParcelizer(), buffermapproperty != null ? oncontentchanged.read(buffermapproperty, iAudioAttributesImplApi21Parcelizer) : 0, setupdatethrottle.AudioAttributesImplBaseParcelizer(), setupdatethrottle.AudioAttributesImplApi26Parcelizer(), BitmapDescriptorFactory.HUE_RED, z);
        }
    }

    private final void read(setUpdateThrottle setupdatethrottle) {
        this.MediaMetadataCompat = true;
        this.AudioAttributesImplApi21Parcelizer = getQues.write(this.AudioAttributesImplApi21Parcelizer, 0);
        int iIconCompatParcelizer = setupdatethrottle.IconCompatParcelizer();
        if (iIconCompatParcelizer != -1) {
            this.MediaBrowserCompatCustomActionResultReceiver = getQues.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, iIconCompatParcelizer);
        }
        if (this.AudioAttributesImplApi26Parcelizer <= BitmapDescriptorFactory.HUE_RED) {
            write(setupdatethrottle.RemoteActionCompatParcelizer(), this.MediaDescriptionCompat - 1);
        } else {
            write(0, setupdatethrottle.AudioAttributesCompatParcelizer());
        }
    }

    public final void read() {
        this.AudioAttributesImplApi21Parcelizer = Integer.MAX_VALUE;
        this.MediaBrowserCompatCustomActionResultReceiver = Integer.MIN_VALUE;
        this.RatingCompat = 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaMetadataCompat = false;
        this.write.AudioAttributesCompatParcelizer();
        setProvider<List<getCurrentTrackSelections.RemoteActionCompatParcelizer>> setprovider = this.read;
        long[] jArr = setprovider.RemoteActionCompatParcelizer;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = setprovider.IconCompatParcelizer[i4];
                        List list = (List) setprovider.MediaBrowserCompatItemReceiver[i4];
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((getCurrentTrackSelections.RemoteActionCompatParcelizer) list.get(i6)).AudioAttributesCompatParcelizer();
                        }
                        setprovider.read(i4);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void IconCompatParcelizer(setUpdateThrottle setupdatethrottle, int i, int i2, int i3, int i4, int i5, float f, boolean z) {
        int i6;
        boolean z2 = Math.signum(f) == Math.signum(this.AudioAttributesImplApi26Parcelizer);
        if (z) {
            if (!z2 || this.MediaMetadataCompat) {
                this.MediaBrowserCompatMediaItem = i3 - i4;
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
            } else {
                this.MediaBrowserCompatMediaItem = getQues.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem + getOnline.RemoteActionCompatParcelizer(Math.abs(f)), i3 - i4);
            }
            while (this.MediaBrowserCompatMediaItem > 0 && setupdatethrottle.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) != -1 && setupdatethrottle.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver) < this.MediaDescriptionCompat - 1) {
                int i7 = read(setupdatethrottle, this.MediaBrowserCompatCustomActionResultReceiver + 1, this.MediaBrowserCompatCustomActionResultReceiver + 1 == i2 + 1 && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) i4));
                if (i7 == -1) {
                    return;
                }
                this.MediaBrowserCompatCustomActionResultReceiver++;
                this.MediaBrowserCompatMediaItem -= i7;
            }
            return;
        }
        if (!z2 || this.MediaMetadataCompat) {
            this.RatingCompat = i3 - i5;
            this.AudioAttributesImplApi21Parcelizer = i;
        } else {
            this.RatingCompat = getQues.RemoteActionCompatParcelizer(this.RatingCompat + getOnline.RemoteActionCompatParcelizer(Math.abs(f)), i3 - i5);
        }
        while (this.RatingCompat > 0 && (i6 = this.AudioAttributesImplApi21Parcelizer) > 0) {
            int i8 = read(setupdatethrottle, this.AudioAttributesImplApi21Parcelizer - 1, i6 + (-1) == i + (-1) && f != BitmapDescriptorFactory.HUE_RED && Math.abs(f) >= ((float) i5));
            if (i8 == -1) {
                return;
            }
            this.AudioAttributesImplApi21Parcelizer--;
            this.RatingCompat -= i8;
        }
    }

    private final void RemoteActionCompatParcelizer(int p0, int p1, int p2, int p3, int p4, float p5, int p6) {
        int i;
        int i2;
        if (p5 <= BitmapDescriptorFactory.HUE_RED) {
            this.RatingCompat = p4 - p3;
            this.AudioAttributesImplApi21Parcelizer = p0;
            while (this.RatingCompat > 0 && (i2 = this.AudioAttributesImplApi21Parcelizer) > 0 && this.write.IconCompatParcelizer(i2 - 1)) {
                abandon abandonVarAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer - 1);
                toMagicModuleMetaRepoModel.write(abandonVarAudioAttributesCompatParcelizer);
                this.AudioAttributesImplApi21Parcelizer--;
                this.RatingCompat -= abandonVarAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            }
            write(0, this.AudioAttributesImplApi21Parcelizer - 1);
            return;
        }
        this.MediaBrowserCompatMediaItem = p4 - p2;
        this.MediaBrowserCompatCustomActionResultReceiver = p1;
        while (this.MediaBrowserCompatMediaItem > 0 && (i = this.MediaBrowserCompatCustomActionResultReceiver) < p6 - 1 && this.write.IconCompatParcelizer(i + 1)) {
            abandon abandonVarAudioAttributesCompatParcelizer2 = this.write.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver + 1);
            toMagicModuleMetaRepoModel.write(abandonVarAudioAttributesCompatParcelizer2);
            int iconCompatParcelizer = abandonVarAudioAttributesCompatParcelizer2.getIconCompatParcelizer();
            this.MediaBrowserCompatCustomActionResultReceiver++;
            this.MediaBrowserCompatMediaItem -= iconCompatParcelizer;
        }
        write(this.MediaBrowserCompatCustomActionResultReceiver + 1, p6 - 1);
    }

    private final int read(final setUpdateThrottle setupdatethrottle, int i, boolean z) {
        List<getCurrentTrackSelections.RemoteActionCompatParcelizer> listAudioAttributesCompatParcelizer;
        List<getCurrentTrackSelections.RemoteActionCompatParcelizer> listAudioAttributesCompatParcelizer2;
        if (this.write.IconCompatParcelizer(i)) {
            abandon abandonVarAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(i);
            toMagicModuleMetaRepoModel.write(abandonVarAudioAttributesCompatParcelizer);
            return abandonVarAudioAttributesCompatParcelizer.getIconCompatParcelizer();
        }
        int i2 = 0;
        if (this.read.IconCompatParcelizer(i)) {
            if (z && (listAudioAttributesCompatParcelizer2 = this.read.AudioAttributesCompatParcelizer(i)) != null) {
                int size = listAudioAttributesCompatParcelizer2.size();
                while (i2 < size) {
                    listAudioAttributesCompatParcelizer2.get(i2).write();
                    i2++;
                }
            }
            return -1;
        }
        this.read.write(i, setupdatethrottle.RemoteActionCompatParcelizer(i, new MagicModuleSubmissionRequestBody() { // from class: o.executePendingTask
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return onCancelLoad.RemoteActionCompatParcelizer(this.write, setupdatethrottle, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }));
        if (z && (listAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(i)) != null) {
            int size2 = listAudioAttributesCompatParcelizer.size();
            while (i2 < size2) {
                listAudioAttributesCompatParcelizer.get(i2).write();
                i2++;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(onCancelLoad oncancelload, setUpdateThrottle setupdatethrottle, int i, int i2) {
        oncancelload.RemoteActionCompatParcelizer(setupdatethrottle, i, i2);
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(int p0, int p1) {
        this.write.write(p0, IconCompatParcelizer(p0, p1, abandon.INSTANCE));
        if (p0 > this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = p0;
            this.MediaBrowserCompatMediaItem -= p1;
        } else if (p0 < this.AudioAttributesImplApi21Parcelizer) {
            this.AudioAttributesImplApi21Parcelizer = p0;
            this.RatingCompat -= p1;
        }
    }

    private final abandon IconCompatParcelizer(int p0, int p1, Object p2) {
        abandon abandonVarAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(p0);
        if (abandonVarAudioAttributesCompatParcelizer != null) {
            abandonVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p1);
            abandonVarAudioAttributesCompatParcelizer.read(p2);
            return abandonVarAudioAttributesCompatParcelizer;
        }
        return new abandon(abandon.INSTANCE, p1);
    }

    private final void RemoteActionCompatParcelizer(int p0, Object p1, int p2) {
        if (this.write.IconCompatParcelizer(p0)) {
            abandon abandonVarAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.write(abandonVarAudioAttributesCompatParcelizer);
            int iconCompatParcelizer = abandonVarAudioAttributesCompatParcelizer.getIconCompatParcelizer();
            abandon abandonVarAudioAttributesCompatParcelizer2 = this.write.AudioAttributesCompatParcelizer(p0);
            toMagicModuleMetaRepoModel.write(abandonVarAudioAttributesCompatParcelizer2);
            Object remoteActionCompatParcelizer = abandonVarAudioAttributesCompatParcelizer2.getRemoteActionCompatParcelizer();
            if (iconCompatParcelizer != p2 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(remoteActionCompatParcelizer, p1)) {
                this.MediaMetadataCompat = true;
            }
        }
        this.write.write(p0, IconCompatParcelizer(p0, p2, p1));
        this.AudioAttributesImplApi21Parcelizer = Math.min(this.AudioAttributesImplApi21Parcelizer, p0);
        this.MediaBrowserCompatCustomActionResultReceiver = Math.max(this.MediaBrowserCompatCustomActionResultReceiver, p0);
        List<getCurrentTrackSelections.RemoteActionCompatParcelizer> listRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(p0);
        if (listRemoteActionCompatParcelizer != null) {
            int size = listRemoteActionCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                listRemoteActionCompatParcelizer.get(i).AudioAttributesCompatParcelizer();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void write(int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onCancelLoad.write(int, int):void");
    }

    private final void RemoteActionCompatParcelizer(setUpdateThrottle setupdatethrottle, int i, int i2) {
        IconCompatParcelizer(i, i2);
        RemoteActionCompatParcelizer(setupdatethrottle);
        AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(final kotlin.setUpdateThrottle r4) {
        /*
            r3 = this;
            float r0 = r3.AudioAttributesImplApi26Parcelizer
            float r0 = java.lang.Math.signum(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = -1
            if (r0 > 0) goto L15
            int r0 = r3.MediaBrowserCompatMediaItem
            if (r0 <= 0) goto L28
            int r0 = r3.MediaBrowserCompatCustomActionResultReceiver
            int r0 = r0 + 1
            goto L29
        L15:
            float r0 = r3.AudioAttributesImplApi26Parcelizer
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L28
            int r0 = r3.RatingCompat
            if (r0 <= 0) goto L28
            int r0 = r3.AudioAttributesImplApi21Parcelizer
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 <= 0) goto L47
            int r1 = r4.RemoteActionCompatParcelizer(r0)
            if (r1 == r2) goto L47
            int r1 = r4.RemoteActionCompatParcelizer(r0)
            int r2 = r3.MediaDescriptionCompat
            if (r1 >= r2) goto L47
            o.setProvider<java.util.List<o.getCurrentTrackSelections$RemoteActionCompatParcelizer>> r1 = r3.read
            o.onCanceled r2 = new o.onCanceled
            r2.<init>()
            java.util.List r3 = r4.RemoteActionCompatParcelizer(r0, r2)
            r1.write(r0, r3)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onCancelLoad.RemoteActionCompatParcelizer(o.setUpdateThrottle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(onCancelLoad oncancelload, setUpdateThrottle setupdatethrottle, int i, int i2) {
        oncancelload.RemoteActionCompatParcelizer(setupdatethrottle, i, i2);
        return getShowPopup.INSTANCE;
    }
}
