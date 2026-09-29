package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin._parser;
import kotlin._skipWSOrEnd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u001c\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001c\u0010\"R\u001a\u0010$\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001f\u0010\"R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010+\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b\u0019\u0010*R\u0016\u0010-\u001a\u0004\u0018\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010%\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u00101R\u0014\u00104\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u00103R\u001a\u00102\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b$\u0010\"R\u0014\u00108\u001a\u0002068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u00107R$\u0010.\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0017@RX\u0097\u000e¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b+\u0010\"R\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u0010!R\u0018\u0010'\u001a\u00020\u0002*\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u00109"}, d2 = {"Lo/getMediaItem;", "Lo/createPeriod;", "", "p0", "p1", "", "Lo/_parser;", "p2", "Lo/hasReferringProperties;", "p3", "", "p4", "Lo/superDispatchKeyEvent;", "p5", "Lo/_skipWSOrEnd$write;", "p6", "Lo/_skipWSOrEnd$read;", "p7", "Lo/tryToResolveUnresolved;", "p8", "", "p9", "<init>", "(IILjava/util/List;JLjava/lang/Object;Lo/superDispatchKeyEvent;Lo/_skipWSOrEnd$write;Lo/_skipWSOrEnd$read;Lo/tryToResolveUnresolved;ZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "IconCompatParcelizer", "(III)V", "Lo/_parser$IconCompatParcelizer;", "write", "(Lo/_parser$IconCompatParcelizer;)V", "(I)V", "AudioAttributesCompatParcelizer", "(I)J", "I", "()I", "MediaMetadataCompat", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "Ljava/util/List;", "MediaBrowserCompatSearchResultReceiver", "J", "Ljava/lang/Object;", "()Ljava/lang/Object;", "read", "Lo/_skipWSOrEnd$write;", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "Lo/_skipWSOrEnd$read;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/tryToResolveUnresolved;", "MediaDescriptionCompat", "Z", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "", "[I", "RatingCompat", "(Lo/_parser;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMediaItem implements createPeriod {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final tryToResolveUnresolved MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int[] RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final List<_parser> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final _skipWSOrEnd.read MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Object read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _skipWSOrEnd.write AudioAttributesImplApi21Parcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    private getMediaItem(int i, int i2, List<? extends _parser> list, long j, Object obj, superDispatchKeyEvent superdispatchkeyevent, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, tryToResolveUnresolved trytoresolveunresolved, boolean z) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = list;
        this.IconCompatParcelizer = j;
        this.read = obj;
        this.AudioAttributesImplApi21Parcelizer = writeVar;
        this.MediaBrowserCompatCustomActionResultReceiver = readVar;
        this.MediaBrowserCompatItemReceiver = trytoresolveunresolved;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplBaseParcelizer = superdispatchkeyevent == superDispatchKeyEvent.write;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            _parser _parserVar = (_parser) list.get(i3);
            iMax = Math.max(iMax, !this.AudioAttributesImplBaseParcelizer ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead());
        }
        this.MediaDescriptionCompat = iMax;
        this.RatingCompat = new int[this.AudioAttributesCompatParcelizer.size() << 1];
        this.MediaMetadataCompat = Integer.MIN_VALUE;
    }

    @Override // kotlin.createPeriod
    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final Object getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.createPeriod
    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final void IconCompatParcelizer(int p0, int p1, int p2) {
        int read;
        this.MediaBrowserCompatMediaItem = p0;
        this.MediaMetadataCompat = this.AudioAttributesImplBaseParcelizer ? p2 : p1;
        List<_parser> list = this.AudioAttributesCompatParcelizer;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            _parser _parserVar = list.get(i);
            int i2 = i << 1;
            if (this.AudioAttributesImplBaseParcelizer) {
                int[] iArr = this.RatingCompat;
                _skipWSOrEnd.write writeVar = this.AudioAttributesImplApi21Parcelizer;
                if (writeVar != null) {
                    iArr[i2] = writeVar.IconCompatParcelizer(_parserVar.getRead(), p1, this.MediaBrowserCompatItemReceiver);
                    this.RatingCompat[i2 + 1] = p0;
                    read = _parserVar.getRemoteActionCompatParcelizer();
                } else {
                    getRootStableInsets.read("null horizontalAlignment");
                    throw new PlanDetailsCreator();
                }
            } else {
                int[] iArr2 = this.RatingCompat;
                iArr2[i2] = p0;
                _skipWSOrEnd.read readVar = this.MediaBrowserCompatCustomActionResultReceiver;
                if (readVar != null) {
                    iArr2[i2 + 1] = readVar.read(_parserVar.getRemoteActionCompatParcelizer(), p2);
                    read = _parserVar.getRead();
                } else {
                    getRootStableInsets.read("null verticalAlignment");
                    throw new PlanDetailsCreator();
                }
            }
            p0 += read;
        }
    }

    public final void write(_parser.IconCompatParcelizer p0) {
        int iAudioAttributesCompatParcelizer;
        if (this.MediaMetadataCompat == Integer.MIN_VALUE) {
            getRootStableInsets.RemoteActionCompatParcelizer("position() should be called first");
        }
        int size = this.AudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            _parser _parserVar = this.AudioAttributesCompatParcelizer.get(i);
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
            if (this.AudioAttributesImplApi26Parcelizer) {
                int iIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer ? hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer) : (this.MediaMetadataCompat - hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer)) - write(_parserVar);
                if (this.AudioAttributesImplBaseParcelizer) {
                    iAudioAttributesCompatParcelizer = (this.MediaMetadataCompat - hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer)) - write(_parserVar);
                } else {
                    iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
                }
                long j = -1;
                jAudioAttributesCompatParcelizer = hasReferringProperties.read((((long) iAudioAttributesCompatParcelizer) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) iIconCompatParcelizer) << 32));
            }
            long jAudioAttributesCompatParcelizer2 = hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer, this.IconCompatParcelizer);
            if (this.AudioAttributesImplBaseParcelizer) {
                _parser.IconCompatParcelizer.read$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
            } else {
                _parser.IconCompatParcelizer.AudioAttributesCompatParcelizer$default(p0, _parserVar, jAudioAttributesCompatParcelizer2, BitmapDescriptorFactory.HUE_RED, (getAnswerMap) null, 6, (Object) null);
            }
        }
    }

    public final void write(int p0) {
        this.MediaBrowserCompatMediaItem = getMediaBrowserCompatMediaItem() + p0;
        int length = this.RatingCompat.length;
        for (int i = 0; i < length; i++) {
            boolean z = this.AudioAttributesImplBaseParcelizer;
            if ((z && i % 2 == 1) || (!z && i % 2 == 0)) {
                int[] iArr = this.RatingCompat;
                iArr[i] = iArr[i] + p0;
            }
        }
    }

    private final long AudioAttributesCompatParcelizer(int p0) {
        int[] iArr = this.RatingCompat;
        int i = p0 << 1;
        long j = -1;
        return hasReferringProperties.read((((long) iArr[i + 1]) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) iArr[i]) << 32));
    }

    private final int write(_parser _parserVar) {
        return this.AudioAttributesImplBaseParcelizer ? _parserVar.getRemoteActionCompatParcelizer() : _parserVar.getRead();
    }

    public /* synthetic */ getMediaItem(int i, int i2, List list, long j, Object obj, superDispatchKeyEvent superdispatchkeyevent, _skipWSOrEnd.write writeVar, _skipWSOrEnd.read readVar, tryToResolveUnresolved trytoresolveunresolved, boolean z, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, i2, list, j, obj, superdispatchkeyevent, writeVar, readVar, trytoresolveunresolved, z);
    }
}
