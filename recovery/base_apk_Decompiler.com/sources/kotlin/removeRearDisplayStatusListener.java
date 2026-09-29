package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._reportMissingSetter;
import kotlin.startRearDisplaySession;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\b\u0000\u0018\u00002\u00020\u0001:\u0001\"Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0019\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0019\u0010\u001fJ'\u0010\"\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u001c2\u0006\u0010\u0005\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001c¢\u0006\u0004\b\u0019\u0010$Je\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0014\u0010\u0012\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001d\u0010%J\u0017\u0010\"\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010'J\u001f\u0010\"\u001a\u00020 2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\"\u0010(J%\u0010)\u001a\u00020\n*\u0004\u0018\u00010!2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001cH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010\"\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010+J\u0015\u0010-\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001c¢\u0006\u0004\b-\u0010.J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001c¢\u0006\u0004\b\u0019\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010\u001d\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\"\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010)\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010-\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00107R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107R$\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u00104\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010@R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010,\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010FR.\u00106\u001a\u0004\u0018\u00010G2\b\u0010\u0003\u001a\u0004\u0018\u00010G8\u0001@AX\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010H\u001a\u0004\b\u001d\u0010I\"\u0004\b-\u0010JR$\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048\u0002@CX\u0083\u000e¢\u0006\f\n\u0004\bK\u0010L\"\u0004\b\u001d\u0010MR\u0018\u0010N\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010:\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010PR\u0018\u0010B\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010QR\u0016\u00102\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00107R\u0016\u0010K\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u00107R\u001c\u0010=\u001a\b\u0018\u00010RR\u00020\u00008\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010SR\u0018\u0010U\u001a\u00060RR\u00020\u00008CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010TR\u0011\u00108\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b-\u0010VR\u0013\u0010W\u001a\u0004\u0018\u00010!8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010VR\u0016\u0010Y\u001a\u00020X8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\"\u0010F"}, d2 = {"Lo/removeRearDisplayStatusListener;", "", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lo/paramName;", "p3", "", "p4", "", "p5", "p6", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p7", "Lo/setTrackNameProvider;", "p8", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;IZIILjava/util/List;Lo/setTrackNameProvider;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/DistinctElementSidecarCallback;", "", "AudioAttributesCompatParcelizer", "(J)V", "Lo/PropertyValueAny;", "Lo/tryToResolveUnresolved;", "write", "(JLo/tryToResolveUnresolved;)Z", "(JLo/tryToResolveUnresolved;)J", "Lo/_checkImplicitlyNamedConstructors;", "Lo/deserializeFromNumber;", "read", "(Lo/tryToResolveUnresolved;JLo/_checkImplicitlyNamedConstructors;)Lo/deserializeFromNumber;", "(ILo/tryToResolveUnresolved;)I", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;IZIILjava/util/List;Lo/setTrackNameProvider;)V", "Lo/_findParamName;", "(Lo/tryToResolveUnresolved;)Lo/_findParamName;", "(JLo/tryToResolveUnresolved;)Lo/_checkImplicitlyNamedConstructors;", "RemoteActionCompatParcelizer", "(Lo/deserializeFromNumber;JLo/tryToResolveUnresolved;)Z", "()V", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "(Lo/tryToResolveUnresolved;)I", "", "toString", "()Ljava/lang/String;", "onCustomAction", "Lo/AbstractDeserializer;", "AudioAttributesImplBaseParcelizer", "Lo/_reportMissingSetter$write;", "MediaMetadataCompat", "I", "handleMediaPlayPauseIfPendingOnHandler", "Z", "MediaDescriptionCompat", "MediaBrowserCompatMediaItem", "MediaBrowserCompatItemReceiver", "onCommand", "Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "Lo/setTrackNameProvider;", "Lo/startRearDisplaySession;", "RatingCompat", "Lo/startRearDisplaySession;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/endRearDisplaySession;", "J", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/deserializeWithObjectId;", "(Lo/deserializeWithObjectId;)V", "MediaBrowserCompatSearchResultReceiver", "Lo/_findParamName;", "Lo/tryToResolveUnresolved;", "Lo/deserializeFromNumber;", "Lo/removeRearDisplayStatusListener$read;", "Lo/removeRearDisplayStatusListener$read;", "()Lo/removeRearDisplayStatusListener$read;", "onAddQueueItem", "()Lo/deserializeFromNumber;", "onPause", "", "onPlay"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeRearDisplayStatusListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int onCustomAction;
    private long AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private deserializeFromNumber RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private _reportMissingSetter.write write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private bufferMapProperty MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private tryToResolveUnresolved MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;
    private _findParamName MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private deserializeWithObjectId MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int read;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private startRearDisplaySession MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private read onCommand;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private AbstractDeserializer AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public long onPlay;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setTrackNameProvider AudioAttributesImplBaseParcelizer;

    private removeRearDisplayStatusListener(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, setTrackNameProvider settracknameprovider) {
        this.AudioAttributesCompatParcelizer = abstractDeserializer;
        this.write = writeVar;
        this.read = i;
        this.RemoteActionCompatParcelizer = z;
        this.IconCompatParcelizer = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplBaseParcelizer = settracknameprovider;
        this.AudioAttributesImplApi21Parcelizer = endRearDisplaySession.INSTANCE.write();
        this.MediaBrowserCompatMediaItem = deserializewithobjectid;
        this.onCustomAction = -1;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final bufferMapProperty getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final void IconCompatParcelizer(bufferMapProperty buffermapproperty) {
        bufferMapProperty buffermapproperty2 = this.MediaMetadataCompat;
        long jRemoteActionCompatParcelizer = buffermapproperty != null ? endRearDisplaySession.RemoteActionCompatParcelizer(buffermapproperty) : endRearDisplaySession.INSTANCE.write();
        if (buffermapproperty2 == null) {
            this.MediaMetadataCompat = buffermapproperty;
            this.AudioAttributesImplApi21Parcelizer = jRemoteActionCompatParcelizer;
        } else if (buffermapproperty == null || !endRearDisplaySession.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, jRemoteActionCompatParcelizer)) {
            this.MediaMetadataCompat = buffermapproperty;
            this.AudioAttributesImplApi21Parcelizer = jRemoteActionCompatParcelizer;
            AudioAttributesCompatParcelizer(DistinctElementSidecarCallback.INSTANCE.IconCompatParcelizer());
            read();
        }
    }

    private final void write(deserializeWithObjectId deserializewithobjectid) {
        boolean z = deserializewithobjectid.read(this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem = deserializewithobjectid;
        if (z) {
            return;
        }
        AudioAttributesImplApi21Parcelizer();
    }

    private final read RemoteActionCompatParcelizer() {
        if (this.onCommand == null) {
            this.onCommand = new read();
        }
        read readVar = this.onCommand;
        toMagicModuleMetaRepoModel.write(readVar);
        return readVar;
    }

    public final deserializeFromNumber IconCompatParcelizer() {
        deserializeFromNumber deserializefromnumber = this.RatingCompat;
        if (deserializefromnumber != null) {
            return deserializefromnumber;
        }
        throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ".concat(String.valueOf(this)));
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final deserializeFromNumber getRatingCompat() {
        return this.RatingCompat;
    }

    private final void AudioAttributesCompatParcelizer(long p0) {
        this.onPlay = p0 | (this.onPlay << 2);
    }

    public final boolean write(long p0, tryToResolveUnresolved p1) {
        AudioAttributesCompatParcelizer(DistinctElementSidecarCallback.INSTANCE.write());
        long jAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver > 1 ? AudioAttributesCompatParcelizer(p0, p1) : p0;
        if (!RemoteActionCompatParcelizer(this.RatingCompat, jAudioAttributesCompatParcelizer, p1)) {
            deserializeFromNumber deserializefromnumber = this.RatingCompat;
            toMagicModuleMetaRepoModel.write(deserializefromnumber);
            if (PropertyValueAny.write(jAudioAttributesCompatParcelizer, deserializefromnumber.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer())) {
                return false;
            }
            deserializeFromNumber deserializefromnumber2 = this.RatingCompat;
            toMagicModuleMetaRepoModel.write(deserializefromnumber2);
            this.RatingCompat = read(p1, jAudioAttributesCompatParcelizer, deserializefromnumber2.getWrite());
            return true;
        }
        if (this.AudioAttributesImplBaseParcelizer != null) {
            this.MediaDescriptionCompat = p1;
            long jAudioAttributesImplApi21Parcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer();
            setTrackNameProvider settracknameprovider = this.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.write(settracknameprovider);
            long jRemoteActionCompatParcelizer = settracknameprovider.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), p0, this.AudioAttributesCompatParcelizer);
            if (ReadableObjectIdReferring.MediaBrowserCompatCustomActionResultReceiver(jRemoteActionCompatParcelizer)) {
                jRemoteActionCompatParcelizer = accept.IconCompatParcelizer(jAudioAttributesImplApi21Parcelizer, jRemoteActionCompatParcelizer);
            }
            long j = jRemoteActionCompatParcelizer;
            deserializeFromNumber read2 = RemoteActionCompatParcelizer().getRead();
            if (read2 != null && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j, read2.getIconCompatParcelizer().getRead().AudioAttributesImplApi21Parcelizer()) && paramName.write(read2.getIconCompatParcelizer().getMediaBrowserCompatCustomActionResultReceiver(), this.read)) {
                this.RatingCompat = read2;
                return true;
            }
            deserializeWithObjectId deserializewithobjectid = this.MediaBrowserCompatMediaItem;
            write(deserializewithobjectid.IconCompatParcelizer((16777212 & 1) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.read() : 0L, (16777212 & 2) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : j, (16777212 & 4) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null, (16777212 & 8) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getWrite() : null, (16777212 & 16) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRead() : null, (16777212 & 32) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null, (16777212 & 64) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() : null, (16777212 & 128) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : 0L, (16777212 & 256) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 512) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() : null, (16777212 & 1024) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem() : null, (16777212 & 2048) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaDescriptionCompat() : 0L, (16777212 & 4096) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaMetadataCompat() : null, (16777212 & 8192) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() : null, (16777212 & 16384) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getOnCustomAction() : null, (16777212 & 32768) != 0 ? deserializewithobjectid.read.getWrite() : 0, (16777212 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? deserializewithobjectid.read.getIconCompatParcelizer() : 0, (16777212 & 131072) != 0 ? deserializewithobjectid.read.getRead() : 0L, (16777212 & 262144) != 0 ? deserializewithobjectid.read.getAudioAttributesCompatParcelizer() : null, (16777212 & 524288) != 0 ? deserializewithobjectid.write : null, (16777212 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 2097152) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi26Parcelizer() : 0, (16777212 & 4194304) != 0 ? deserializewithobjectid.read.getMediaBrowserCompatCustomActionResultReceiver() : 0, (16777212 & 8388608) != 0 ? deserializewithobjectid.read.getAudioAttributesImplBaseParcelizer() : null));
        }
        this.RatingCompat = read(p1, jAudioAttributesCompatParcelizer, read(jAudioAttributesCompatParcelizer, p1));
        return true;
    }

    private final long AudioAttributesCompatParcelizer(long p0, tryToResolveUnresolved p1) {
        startRearDisplaySession.Companion companion = startRearDisplaySession.INSTANCE;
        startRearDisplaySession startreardisplaysession = this.MediaBrowserCompatCustomActionResultReceiver;
        deserializeWithObjectId deserializewithobjectid = this.MediaBrowserCompatMediaItem;
        bufferMapProperty buffermapproperty = this.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.write(buffermapproperty);
        startRearDisplaySession startreardisplaysessionIconCompatParcelizer = companion.IconCompatParcelizer(startreardisplaysession, p1, deserializewithobjectid, buffermapproperty, this.write);
        this.MediaBrowserCompatCustomActionResultReceiver = startreardisplaysessionIconCompatParcelizer;
        return startreardisplaysessionIconCompatParcelizer.read(p0, this.MediaBrowserCompatItemReceiver);
    }

    private final deserializeFromNumber read(tryToResolveUnresolved p0, long p1, _checkImplicitlyNamedConstructors p2) {
        float fMin = Math.min(p2.getRead().write(), p2.getIconCompatParcelizer());
        AbstractDeserializer abstractDeserializer = this.AudioAttributesCompatParcelizer;
        deserializeWithObjectId deserializewithobjectid = this.MediaBrowserCompatMediaItem;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (listRemoteActionCompatParcelizer == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        int i = this.IconCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        int i2 = this.read;
        bufferMapProperty buffermapproperty = this.MediaMetadataCompat;
        toMagicModuleMetaRepoModel.write(buffermapproperty);
        deserializeFromBoolean deserializefromboolean = new deserializeFromBoolean(abstractDeserializer, deserializewithobjectid, listRemoteActionCompatParcelizer, i, z, i2, buffermapproperty, p0, this.write, p1, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        long j = -1;
        return new deserializeFromNumber(deserializefromboolean, p2, PropertyValueBuffer.write(p1, getKey.read((((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(p2.getAudioAttributesImplApi21Parcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(fMin)) << 32))), null);
    }

    public final int AudioAttributesCompatParcelizer(int p0, tryToResolveUnresolved p1) {
        int i = this.onCustomAction;
        int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (p0 == i && i != -1) {
            return i2;
        }
        long jAudioAttributesCompatParcelizer = PropertyValueBuffer.read(0, p0, 0, Integer.MAX_VALUE);
        if (this.MediaBrowserCompatItemReceiver > 1) {
            jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer, p1);
        }
        int iWrite = getQues.write(MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(read(jAudioAttributesCompatParcelizer, p1).getAudioAttributesImplApi21Parcelizer()), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(jAudioAttributesCompatParcelizer));
        this.onCustomAction = p0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iWrite;
        return iWrite;
    }

    public final void write(AbstractDeserializer p0, deserializeWithObjectId p1, _reportMissingSetter.write p2, int p3, boolean p4, int p5, int p6, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> p7, setTrackNameProvider p8) {
        this.AudioAttributesCompatParcelizer = p0;
        write(p1);
        this.write = p2;
        this.read = p3;
        this.RemoteActionCompatParcelizer = p4;
        this.IconCompatParcelizer = p5;
        this.MediaBrowserCompatItemReceiver = p6;
        this.AudioAttributesImplApi26Parcelizer = p7;
        this.AudioAttributesImplBaseParcelizer = p8;
        AudioAttributesCompatParcelizer(DistinctElementSidecarCallback.INSTANCE.RemoteActionCompatParcelizer());
        read();
    }

    private final _findParamName read(tryToResolveUnresolved p0) {
        _findParamName _findparamname = this.MediaBrowserCompatSearchResultReceiver;
        if (_findparamname == null || p0 != this.MediaDescriptionCompat || _findparamname.AudioAttributesCompatParcelizer()) {
            this.MediaDescriptionCompat = p0;
            AbstractDeserializer abstractDeserializer = this.AudioAttributesCompatParcelizer;
            deserializeWithObjectId deserializewithobjectidIconCompatParcelizer = injectValues.IconCompatParcelizer(this.MediaBrowserCompatMediaItem, p0);
            bufferMapProperty buffermapproperty = this.MediaMetadataCompat;
            toMagicModuleMetaRepoModel.write(buffermapproperty);
            _reportMissingSetter.write writeVar = this.write;
            List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> listRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
            if (listRemoteActionCompatParcelizer == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            _findparamname = new _findParamName(abstractDeserializer, deserializewithobjectidIconCompatParcelizer, listRemoteActionCompatParcelizer, buffermapproperty, writeVar);
        }
        this.MediaBrowserCompatSearchResultReceiver = _findparamname;
        return _findparamname;
    }

    private final _checkImplicitlyNamedConstructors read(long p0, tryToResolveUnresolved p1) {
        _findParamName _findparamname = read(p1);
        return new _checkImplicitlyNamedConstructors(_findparamname, startRearDisplayPresentationSession.read(p0, this.RemoteActionCompatParcelizer, this.read, _findparamname.write()), startRearDisplayPresentationSession.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.IconCompatParcelizer), this.read, null);
    }

    private final boolean RemoteActionCompatParcelizer(deserializeFromNumber deserializefromnumber, long j, tryToResolveUnresolved trytoresolveunresolved) {
        if (deserializefromnumber == null || deserializefromnumber.getWrite().getRead().AudioAttributesCompatParcelizer() || trytoresolveunresolved != deserializefromnumber.getIconCompatParcelizer().getMediaBrowserCompatItemReceiver()) {
            return true;
        }
        if (PropertyValueAny.write(j, deserializefromnumber.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer())) {
            return false;
        }
        return PropertyValueAny.AudioAttributesImplBaseParcelizer(j) != PropertyValueAny.AudioAttributesImplBaseParcelizer(deserializefromnumber.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer()) || PropertyValueAny.MediaBrowserCompatItemReceiver(j) != PropertyValueAny.MediaBrowserCompatItemReceiver(deserializefromnumber.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer()) || ((float) PropertyValueAny.AudioAttributesImplApi21Parcelizer(j)) < deserializefromnumber.getWrite().getAudioAttributesImplApi21Parcelizer() || deserializefromnumber.getWrite().getRemoteActionCompatParcelizer();
    }

    private final void read() {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.RatingCompat = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        this.onCustomAction = -1;
        this.onCommand = null;
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer(DistinctElementSidecarCallback.INSTANCE.AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.RatingCompat = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        this.onCustomAction = -1;
    }

    public final int IconCompatParcelizer(tryToResolveUnresolved p0) {
        return MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(read(p0).write());
    }

    public final int AudioAttributesCompatParcelizer(tryToResolveUnresolved p0) {
        return MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(read(p0).RemoteActionCompatParcelizer());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/removeRearDisplayStatusListener$read;", "Lo/MemoryCacheKey;", "<init>", "(Lo/removeRearDisplayStatusListener;)V", "Lo/ReadableObjectIdReferring;", "", "c_", "(J)F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Lo/deserializeFromNumber;", "p0", "Lo/deserializeFromNumber;", "write", "()Lo/deserializeFromNumber;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class read implements MemoryCacheKey {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private deserializeFromNumber read;

        public read() {
        }

        @Override // kotlin.bufferMapProperty
        /* JADX INFO: renamed from: IconCompatParcelizer */
        public final float getRead() {
            bufferMapProperty mediaMetadataCompat = removeRearDisplayStatusListener.this.getMediaMetadataCompat();
            toMagicModuleMetaRepoModel.write(mediaMetadataCompat);
            return mediaMetadataCompat.getRead();
        }

        @Override // kotlin.getParameter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final float getIconCompatParcelizer() {
            bufferMapProperty mediaMetadataCompat = removeRearDisplayStatusListener.this.getMediaMetadataCompat();
            toMagicModuleMetaRepoModel.write(mediaMetadataCompat);
            return mediaMetadataCompat.getIconCompatParcelizer();
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final deserializeFromNumber getRead() {
            return this.read;
        }

        @Override // kotlin.bufferMapProperty
        public final float c_(long j) {
            if (ReadableObjectIdReferring.MediaBrowserCompatCustomActionResultReceiver(j)) {
                if (!ReadableObjectIdReferring.MediaBrowserCompatCustomActionResultReceiver(removeRearDisplayStatusListener.this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer())) {
                    if (!ReadableObjectIdReferring.AudioAttributesCompatParcelizer(removeRearDisplayStatusListener.this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer(), ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer())) {
                        return c_(removeRearDisplayStatusListener.this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer()) * ReadableObjectIdReferring.AudioAttributesCompatParcelizer(j);
                    }
                    throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.".toString());
                }
                throw new IllegalStateException("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.".toString());
            }
            return AudioAttributesCompatParcelizer(e_(j));
        }
    }

    public final String toString() {
        deserializeFromBoolean iconCompatParcelizer;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        sb.append(this.RatingCompat != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) endRearDisplaySession.read(this.AudioAttributesImplApi21Parcelizer));
        sb.append(", history=");
        sb.append(this.onPlay);
        sb.append(", constraints=");
        deserializeFromNumber deserializefromnumber = this.RatingCompat;
        if (deserializefromnumber != null && (iconCompatParcelizer = deserializefromnumber.getIconCompatParcelizer()) != null) {
            obj = PropertyValueAny.read(iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ removeRearDisplayStatusListener(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3, List list, setTrackNameProvider settracknameprovider, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, i, z, i2, i3, list, settracknameprovider);
    }
}
