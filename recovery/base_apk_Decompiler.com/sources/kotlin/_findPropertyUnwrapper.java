package kotlin;

import kotlin.AbstractDeserializer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b$\u0010%JÅ\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010\u0003\u001a\u0004\u0018\u00010(H\u0096\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020)2\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b.\u0010-J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00101J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u00104R\u001a\u00109\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010$\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010,\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010&\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010B\u001a\u0004\b:\u0010CR\u001c\u0010.\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010<\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010H\u001a\u0004\b>\u0010IR\u001c\u0010D\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010J\u001a\u0004\bK\u00104R\u001a\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=R\u001c\u0010:\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\b,\u0010NR\u001c\u0010K\u001a\u0004\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010@\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010S\u001a\u0004\b5\u0010TR\u001a\u0010U\u001a\u00020\u00178\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b&\u0010=R\u001c\u0010L\u001a\u0004\u0018\u00010\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010V\u001a\u0004\bW\u0010XR\u001c\u00105\u001a\u0004\u0018\u00010\u001b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010Y\u001a\u0004\bO\u0010ZR\u001c\u0010F\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010[\u001a\u0004\bU\u0010\\R\u001c\u0010W\u001a\u0004\u0018\u00010\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010]\u001a\u0004\bD\u0010^R\u0011\u0010O\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b.\u0010=R\u0013\u00107\u001a\u0004\u0018\u00010_8G¢\u0006\u0006\u001a\u0004\b9\u0010`R\u0011\u00102\u001a\u00020a8G¢\u0006\u0006\u001a\u0004\b$\u0010b"}, d2 = {"Lo/_findPropertyUnwrapper;", "Lo/AbstractDeserializer$RemoteActionCompatParcelizer;", "Lo/replace;", "p0", "Lo/ReadableObjectIdReferring;", "p1", "Lo/getDataStream;", "p2", "Lo/withValueDeserializer;", "p3", "Lo/_findFormat;", "p4", "Lo/_reportMissingSetter;", "p5", "", "p6", "p7", "Lo/_find2ViaAlias;", "p8", "Lo/CreatorCandidate;", "p9", "Lo/canCreateFromBoolean;", "p10", "Lo/switchToNext;", "p11", "Lo/renameAll;", "p12", "Lo/nopInstance;", "p13", "Lo/_findCustomReferenceDeserializer;", "p14", "Lo/findViews;", "p15", "<init>", "(Lo/replace;JLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/_findCustomReferenceDeserializer;Lo/findViews;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/_findCustomReferenceDeserializer;Lo/findViews;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "AudioAttributesCompatParcelizer", "(Lo/_findPropertyUnwrapper;)Lo/_findPropertyUnwrapper;", "write", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/_findCustomReferenceDeserializer;Lo/findViews;)Lo/_findPropertyUnwrapper;", "", "", "equals", "(Ljava/lang/Object;)Z", "RemoteActionCompatParcelizer", "(Lo/_findPropertyUnwrapper;)Z", "read", "", "hashCode", "()I", "onAddQueueItem", "toString", "()Ljava/lang/String;", "MediaBrowserCompatSearchResultReceiver", "Lo/replace;", "onCommand", "()Lo/replace;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "J", "AudioAttributesImplBaseParcelizer", "()J", "MediaBrowserCompatItemReceiver", "Lo/getDataStream;", "MediaBrowserCompatMediaItem", "()Lo/getDataStream;", "Lo/withValueDeserializer;", "()Lo/withValueDeserializer;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_findFormat;", "RatingCompat", "()Lo/_findFormat;", "Lo/_reportMissingSetter;", "()Lo/_reportMissingSetter;", "Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "Lo/_find2ViaAlias;", "()Lo/_find2ViaAlias;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/CreatorCandidate;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()Lo/CreatorCandidate;", "Lo/canCreateFromBoolean;", "()Lo/canCreateFromBoolean;", "MediaDescriptionCompat", "Lo/renameAll;", "onCustomAction", "()Lo/renameAll;", "Lo/nopInstance;", "()Lo/nopInstance;", "Lo/_findCustomReferenceDeserializer;", "()Lo/_findCustomReferenceDeserializer;", "Lo/findViews;", "()Lo/findViews;", "Lo/Instantiatable;", "()Lo/Instantiatable;", "", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _findPropertyUnwrapper implements AbstractDeserializer.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final withValueDeserializer write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final _findFormat read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getDataStream RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final renameAll MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final replace IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final nopInstance MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final canCreateFromBoolean MediaBrowserCompatMediaItem;
    private final _findCustomReferenceDeserializer RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final findViews onCustomAction;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final CreatorCandidate AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _reportMissingSetter AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final _find2ViaAlias AudioAttributesImplApi21Parcelizer;

    private _findPropertyUnwrapper(replace replaceVar, long j, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j2, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j3, renameAll renameall, nopInstance nopinstance, _findCustomReferenceDeserializer _findcustomreferencedeserializer, findViews findviews) {
        this.IconCompatParcelizer = replaceVar;
        this.AudioAttributesCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = getdatastream;
        this.write = withvaluedeserializer;
        this.read = _findformat;
        this.AudioAttributesImplBaseParcelizer = _reportmissingsetter;
        this.MediaBrowserCompatCustomActionResultReceiver = str;
        this.MediaBrowserCompatItemReceiver = j2;
        this.AudioAttributesImplApi21Parcelizer = _find2viaalias;
        this.AudioAttributesImplApi26Parcelizer = creatorCandidate;
        this.MediaBrowserCompatMediaItem = cancreatefromboolean;
        this.MediaDescriptionCompat = j3;
        this.MediaMetadataCompat = renameall;
        this.MediaBrowserCompatSearchResultReceiver = nopinstance;
        this.RatingCompat = _findcustomreferencedeserializer;
        this.onCustomAction = findviews;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final replace getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final getDataStream getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final withValueDeserializer getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final _findFormat getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final _reportMissingSetter getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final _find2ViaAlias getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final CreatorCandidate getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final canCreateFromBoolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final renameAll getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final nopInstance getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final _findCustomReferenceDeserializer getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final findViews getOnCustomAction() {
        return this.onCustomAction;
    }

    public /* synthetic */ _findPropertyUnwrapper(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, _findCustomReferenceDeserializer _findcustomreferencedeserializer, findViews findviews, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i & 2) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j2, (i & 4) != 0 ? null : getdatastream, (i & 8) != 0 ? null : withvaluedeserializer, (i & 16) != 0 ? null : _findformat, (i & 32) != 0 ? null : _reportmissingsetter, (i & 64) != 0 ? null : str, (i & 128) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j3, (i & 256) != 0 ? null : _find2viaalias, (i & 512) != 0 ? null : creatorCandidate, (i & 1024) != 0 ? null : cancreatefromboolean, (i & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j4, (i & 4096) != 0 ? null : renameall, (i & 8192) != 0 ? null : nopinstance, (i & 16384) != 0 ? null : _findcustomreferencedeserializer, (i & 32768) != 0 ? null : findviews, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    private _findPropertyUnwrapper(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, _findCustomReferenceDeserializer _findcustomreferencedeserializer, findViews findviews) {
        this(replace.INSTANCE.AudioAttributesCompatParcelizer(j), j2, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j3, _find2viaalias, creatorCandidate, cancreatefromboolean, j4, renameall, nopinstance, _findcustomreferencedeserializer, findviews, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public final long read() {
        return this.IconCompatParcelizer.read();
    }

    public final Instantiatable IconCompatParcelizer() {
        return this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final _findPropertyUnwrapper AudioAttributesCompatParcelizer(_findPropertyUnwrapper p0) {
        return p0 == null ? this : _convertObjectId.AudioAttributesCompatParcelizer(this, p0.IconCompatParcelizer.read(), p0.IconCompatParcelizer.RemoteActionCompatParcelizer(), p0.IconCompatParcelizer.AudioAttributesCompatParcelizer(), p0.AudioAttributesCompatParcelizer, p0.RemoteActionCompatParcelizer, p0.write, p0.read, p0.AudioAttributesImplBaseParcelizer, p0.MediaBrowserCompatCustomActionResultReceiver, p0.MediaBrowserCompatItemReceiver, p0.AudioAttributesImplApi21Parcelizer, p0.AudioAttributesImplApi26Parcelizer, p0.MediaBrowserCompatMediaItem, p0.MediaDescriptionCompat, p0.MediaMetadataCompat, p0.MediaBrowserCompatSearchResultReceiver, p0.RatingCompat, p0.onCustomAction);
    }

    public final _findPropertyUnwrapper write(long p0, long p1, getDataStream p2, withValueDeserializer p3, _findFormat p4, _reportMissingSetter p5, String p6, long p7, _find2ViaAlias p8, CreatorCandidate p9, canCreateFromBoolean p10, long p11, renameAll p12, nopInstance p13, _findCustomReferenceDeserializer p14, findViews p15) {
        replace replaceVarAudioAttributesCompatParcelizer;
        if (switchToNext.RemoteActionCompatParcelizer(p0, read())) {
            replaceVarAudioAttributesCompatParcelizer = this.IconCompatParcelizer;
        } else {
            replaceVarAudioAttributesCompatParcelizer = replace.INSTANCE.AudioAttributesCompatParcelizer(p0);
        }
        return new _findPropertyUnwrapper(replaceVarAudioAttributesCompatParcelizer, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findPropertyUnwrapper)) {
            return false;
        }
        _findPropertyUnwrapper _findpropertyunwrapper = (_findPropertyUnwrapper) p0;
        return RemoteActionCompatParcelizer(_findpropertyunwrapper) && read(_findpropertyunwrapper);
    }

    public final boolean RemoteActionCompatParcelizer(_findPropertyUnwrapper p0) {
        if (this == p0) {
            return true;
        }
        return ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, p0.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p0.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, p0.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, p0.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, p0.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) p0.MediaBrowserCompatCustomActionResultReceiver) && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, p0.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, p0.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p0.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, p0.MediaBrowserCompatMediaItem) && switchToNext.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, p0.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, p0.RatingCompat);
    }

    public final boolean read(_findPropertyUnwrapper p0) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, p0.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, p0.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, p0.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCustomAction, p0.onCustomAction);
    }

    public final int hashCode() {
        int i;
        int iHashCode;
        int iMediaBrowserCompatItemReceiver = switchToNext.MediaBrowserCompatItemReceiver(read());
        Instantiatable instantiatableIconCompatParcelizer = IconCompatParcelizer();
        int iHashCode2 = instantiatableIconCompatParcelizer != null ? instantiatableIconCompatParcelizer.hashCode() : 0;
        int iHashCode3 = Float.hashCode(AudioAttributesCompatParcelizer());
        int iMediaBrowserCompatItemReceiver2 = ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        getDataStream getdatastream = this.RemoteActionCompatParcelizer;
        int iHashCode4 = getdatastream != null ? getdatastream.hashCode() : 0;
        withValueDeserializer withvaluedeserializer = this.write;
        int iRemoteActionCompatParcelizer = withvaluedeserializer != null ? withValueDeserializer.RemoteActionCompatParcelizer(withvaluedeserializer.getIconCompatParcelizer()) : 0;
        _findFormat _findformat = this.read;
        int iAudioAttributesCompatParcelizer = _findformat != null ? _findFormat.AudioAttributesCompatParcelizer(_findformat.getRead()) : 0;
        _reportMissingSetter _reportmissingsetter = this.AudioAttributesImplBaseParcelizer;
        int iHashCode5 = _reportmissingsetter != null ? _reportmissingsetter.hashCode() : 0;
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode6 = str != null ? str.hashCode() : 0;
        int iMediaBrowserCompatItemReceiver3 = ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver);
        _find2ViaAlias _find2viaalias = this.AudioAttributesImplApi21Parcelizer;
        int iIconCompatParcelizer = _find2viaalias != null ? _find2ViaAlias.IconCompatParcelizer(_find2viaalias.getAudioAttributesCompatParcelizer()) : 0;
        CreatorCandidate creatorCandidate = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode7 = creatorCandidate != null ? creatorCandidate.hashCode() : 0;
        canCreateFromBoolean cancreatefromboolean = this.MediaBrowserCompatMediaItem;
        if (cancreatefromboolean != null) {
            iHashCode = cancreatefromboolean.hashCode();
            i = iHashCode3;
        } else {
            i = iHashCode3;
            iHashCode = 0;
        }
        int iMediaBrowserCompatItemReceiver4 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaDescriptionCompat);
        renameAll renameall = this.MediaMetadataCompat;
        int iHashCode8 = renameall != null ? renameall.hashCode() : 0;
        nopInstance nopinstance = this.MediaBrowserCompatSearchResultReceiver;
        int iHashCode9 = nopinstance != null ? nopinstance.hashCode() : 0;
        _findCustomReferenceDeserializer _findcustomreferencedeserializer = this.RatingCompat;
        int iHashCode10 = _findcustomreferencedeserializer != null ? _findcustomreferencedeserializer.hashCode() : 0;
        findViews findviews = this.onCustomAction;
        return (((((((((((((((((((((((((((((((((iMediaBrowserCompatItemReceiver * 31) + iHashCode2) * 31) + i) * 31) + iMediaBrowserCompatItemReceiver2) * 31) + iHashCode4) * 31) + iRemoteActionCompatParcelizer) * 31) + iAudioAttributesCompatParcelizer) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iMediaBrowserCompatItemReceiver3) * 31) + iIconCompatParcelizer) * 31) + iHashCode7) * 31) + iHashCode) * 31) + iMediaBrowserCompatItemReceiver4) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (findviews != null ? findviews.hashCode() : 0);
    }

    public final int onAddQueueItem() {
        int iMediaBrowserCompatItemReceiver = ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.AudioAttributesCompatParcelizer);
        getDataStream getdatastream = this.RemoteActionCompatParcelizer;
        int iHashCode = getdatastream != null ? getdatastream.hashCode() : 0;
        withValueDeserializer withvaluedeserializer = this.write;
        int iRemoteActionCompatParcelizer = withvaluedeserializer != null ? withValueDeserializer.RemoteActionCompatParcelizer(withvaluedeserializer.getIconCompatParcelizer()) : 0;
        _findFormat _findformat = this.read;
        int iAudioAttributesCompatParcelizer = _findformat != null ? _findFormat.AudioAttributesCompatParcelizer(_findformat.getRead()) : 0;
        _reportMissingSetter _reportmissingsetter = this.AudioAttributesImplBaseParcelizer;
        int iHashCode2 = _reportmissingsetter != null ? _reportmissingsetter.hashCode() : 0;
        String str = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        int iMediaBrowserCompatItemReceiver2 = ReadableObjectIdReferring.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver);
        _find2ViaAlias _find2viaalias = this.AudioAttributesImplApi21Parcelizer;
        int iIconCompatParcelizer = _find2viaalias != null ? _find2ViaAlias.IconCompatParcelizer(_find2viaalias.getAudioAttributesCompatParcelizer()) : 0;
        CreatorCandidate creatorCandidate = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode4 = creatorCandidate != null ? creatorCandidate.hashCode() : 0;
        canCreateFromBoolean cancreatefromboolean = this.MediaBrowserCompatMediaItem;
        int iHashCode5 = cancreatefromboolean != null ? cancreatefromboolean.hashCode() : 0;
        int iMediaBrowserCompatItemReceiver3 = switchToNext.MediaBrowserCompatItemReceiver(this.MediaDescriptionCompat);
        _findCustomReferenceDeserializer _findcustomreferencedeserializer = this.RatingCompat;
        return (((((((((((((((((((((iMediaBrowserCompatItemReceiver * 31) + iHashCode) * 31) + iRemoteActionCompatParcelizer) * 31) + iAudioAttributesCompatParcelizer) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iMediaBrowserCompatItemReceiver2) * 31) + iIconCompatParcelizer) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iMediaBrowserCompatItemReceiver3) * 31) + (_findcustomreferencedeserializer != null ? _findcustomreferencedeserializer.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(read()));
        sb.append(", brush=");
        sb.append(IconCompatParcelizer());
        sb.append(", alpha=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(", fontSize=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer));
        sb.append(", fontWeight=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", fontStyle=");
        sb.append(this.write);
        sb.append(", fontSynthesis=");
        sb.append(this.read);
        sb.append(", fontFamily=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", fontFeatureSettings=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", letterSpacing=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(this.MediaBrowserCompatItemReceiver));
        sb.append(", baselineShift=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", textGeometricTransform=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", localeList=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", background=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.MediaDescriptionCompat));
        sb.append(", textDecoration=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", shadow=");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        sb.append(", platformStyle=");
        sb.append(this.RatingCompat);
        sb.append(", drawStyle=");
        sb.append(this.onCustomAction);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ _findPropertyUnwrapper(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, _findCustomReferenceDeserializer _findcustomreferencedeserializer, findViews findviews, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j3, _find2viaalias, creatorCandidate, cancreatefromboolean, j4, renameall, nopinstance, _findcustomreferencedeserializer, findviews);
    }

    public /* synthetic */ _findPropertyUnwrapper(replace replaceVar, long j, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j2, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j3, renameAll renameall, nopInstance nopinstance, _findCustomReferenceDeserializer _findcustomreferencedeserializer, findViews findviews, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(replaceVar, j, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j2, _find2viaalias, creatorCandidate, cancreatefromboolean, j3, renameall, nopinstance, _findcustomreferencedeserializer, findviews);
    }
}
