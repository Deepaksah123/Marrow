package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\"\u0018\u0000 92\u00020\u0001:\u00019B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010'\u001a\u00020&\u0012\b\b\u0002\u0010(\u001a\u00020\f\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\b\b\u0002\u0010/\u001a\u00020.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b\b\u00104J\r\u00105\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0004¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b9\u0010:J\u009b\u0002\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b=\u0010>J\u009b\u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\f2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\f2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020&2\b\b\u0002\u0010(\u001a\u00020\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u0002002\n\b\u0002\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020A2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bB\u0010CJ\u0015\u0010=\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b=\u0010DJ\u0015\u0010?\u001a\u00020A2\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b?\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020EH\u0000¢\u0006\u0004\bH\u0010GJ\u000f\u0010I\u001a\u00020\u0014H\u0016¢\u0006\u0004\bI\u0010JR\u001a\u0010;\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u00106R\u001a\u0010=\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b=\u0010N\u001a\u0004\bO\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010P\u001a\u0004\bQ\u0010RR\u0013\u0010K\u001a\u0004\u0018\u00010S8G¢\u0006\u0006\u001a\u0004\b9\u0010TR\u0011\u0010?\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010U\u001a\u00020W8G¢\u0006\u0006\u001a\u0004\b;\u0010XR\u0011\u0010Z\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bY\u0010VR\u0013\u0010]\u001a\u0004\u0018\u00010\r8G¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010Y\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0013\u0010b\u001a\u0004\u0018\u00010\u00108G¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010d\u001a\u0004\u0018\u00010\u00128G¢\u0006\u0006\u001a\u0004\bZ\u0010cR\u0013\u0010`\u001a\u0004\u0018\u00010\u00148G¢\u0006\u0006\u001a\u0004\b]\u0010JR\u0011\u0010e\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bd\u0010VR\u0013\u0010^\u001a\u0004\u0018\u00010\u00178G¢\u0006\u0006\u001a\u0004\b?\u0010fR\u0013\u0010[\u001a\u0004\u0018\u00010\u00198G¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010k\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0011\u0010l\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b=\u0010VR\u0013\u0010O\u001a\u0004\u0018\u00010\u001e8G¢\u0006\u0006\u001a\u0004\bm\u0010nR\u0013\u0010q\u001a\u0004\u0018\u00010 8G¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010i\u001a\u0004\u0018\u00010\"8G¢\u0006\u0006\u001a\u0004\bb\u0010rR\u0011\u0010m\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\bs\u0010GR\u0011\u0010M\u001a\u00020&8G¢\u0006\u0006\u001a\u0004\bt\u0010GR\u0011\u0010s\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bq\u0010VR\u0013\u0010o\u001a\u0004\u0018\u00010)8G¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0013\u0010Q\u001a\u0004\u0018\u00010,8G¢\u0006\u0006\u001a\u0004\bk\u0010wR\u0011\u0010u\u001a\u0002008G¢\u0006\u0006\u001a\u0004\be\u0010GR\u0011\u0010H\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\bl\u0010GR\u0013\u0010x\u001a\u0004\u0018\u0001028G¢\u0006\u0006\u001a\u0004\bx\u0010y"}, d2 = {"Lo/deserializeWithObjectId;", "", "Lo/_findPropertyUnwrapper;", "p0", "Lo/_findCustomCollectionLikeDeserializer;", "p1", "Lo/_getSetterInfo;", "p2", "<init>", "(Lo/_findPropertyUnwrapper;Lo/_findCustomCollectionLikeDeserializer;Lo/_getSetterInfo;)V", "(Lo/_findPropertyUnwrapper;Lo/_findCustomCollectionLikeDeserializer;)V", "Lo/switchToNext;", "Lo/ReadableObjectIdReferring;", "Lo/getDataStream;", "Lo/withValueDeserializer;", "p3", "Lo/_findFormat;", "p4", "Lo/_reportMissingSetter;", "p5", "", "p6", "p7", "Lo/_find2ViaAlias;", "p8", "Lo/CreatorCandidate;", "p9", "Lo/canCreateFromBoolean;", "p10", "p11", "Lo/renameAll;", "p12", "Lo/nopInstance;", "p13", "Lo/findViews;", "p14", "Lo/assignIndexes;", "p15", "Lo/withCaseInsensitivity;", "p16", "p17", "Lo/withProperty;", "p18", "p19", "Lo/find;", "p20", "Lo/findSize;", "p21", "Lo/_findWithAlias;", "p22", "Lo/findOnlyParamWithoutInjection;", "p23", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/findViews;IIJLo/withProperty;Lo/_getSetterInfo;Lo/find;IILo/findOnlyParamWithoutInjection;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "onRemoveQueueItemAt", "()Lo/_findPropertyUnwrapper;", "onRemoveQueueItem", "()Lo/_findCustomCollectionLikeDeserializer;", "write", "(Lo/deserializeWithObjectId;)Lo/deserializeWithObjectId;", "AudioAttributesCompatParcelizer", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/findViews;IIJLo/withProperty;Lo/find;IILo/_getSetterInfo;Lo/findOnlyParamWithoutInjection;)Lo/deserializeWithObjectId;", "read", "(Lo/_findCustomCollectionLikeDeserializer;)Lo/deserializeWithObjectId;", "IconCompatParcelizer", "(JJLo/getDataStream;Lo/withValueDeserializer;Lo/_findFormat;Lo/_reportMissingSetter;Ljava/lang/String;JLo/_find2ViaAlias;Lo/CreatorCandidate;Lo/canCreateFromBoolean;JLo/renameAll;Lo/nopInstance;Lo/findViews;IIJLo/withProperty;Lo/_getSetterInfo;Lo/find;IILo/findOnlyParamWithoutInjection;)Lo/deserializeWithObjectId;", "", "equals", "(Ljava/lang/Object;)Z", "(Lo/deserializeWithObjectId;)Z", "", "hashCode", "()I", "onPlayFromSearch", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/_findPropertyUnwrapper;", "onPlay", "Lo/_findCustomCollectionLikeDeserializer;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/_getSetterInfo;", "onMediaButtonEvent", "()Lo/_getSetterInfo;", "Lo/Instantiatable;", "()Lo/Instantiatable;", "MediaBrowserCompatCustomActionResultReceiver", "()J", "", "()F", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaMetadataCompat", "()Lo/getDataStream;", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "()Lo/withValueDeserializer;", "RatingCompat", "()Lo/_findFormat;", "AudioAttributesImplApi26Parcelizer", "()Lo/_reportMissingSetter;", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "()Lo/_find2ViaAlias;", "onPrepareFromMediaId", "()Lo/CreatorCandidate;", "onAddQueueItem", "()Lo/canCreateFromBoolean;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "onPlayFromMediaId", "()Lo/renameAll;", "onFastForward", "()Lo/nopInstance;", "onCustomAction", "()Lo/findViews;", "onPause", "onPlayFromUri", "onPrepare", "()Lo/withProperty;", "()Lo/find;", "onPrepareFromSearch", "()Lo/findOnlyParamWithoutInjection;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializeWithObjectId {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final _getSetterInfo write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final _findPropertyUnwrapper AudioAttributesCompatParcelizer;
    private final _findCustomCollectionLikeDeserializer read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final deserializeWithObjectId IconCompatParcelizer = new deserializeWithObjectId(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    public deserializeWithObjectId(_findPropertyUnwrapper _findpropertyunwrapper, _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer, _getSetterInfo _getsetterinfo) {
        this.AudioAttributesCompatParcelizer = _findpropertyunwrapper;
        this.read = _findcustomcollectionlikedeserializer;
        this.write = _getsetterinfo;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final _findPropertyUnwrapper getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final _findCustomCollectionLikeDeserializer getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final _getSetterInfo getWrite() {
        return this.write;
    }

    public deserializeWithObjectId(_findPropertyUnwrapper _findpropertyunwrapper, _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer) {
        this(_findpropertyunwrapper, _findcustomcollectionlikedeserializer, injectValues.IconCompatParcelizer(_findpropertyunwrapper.getRatingCompat(), _findcustomcollectionlikedeserializer.getRemoteActionCompatParcelizer()));
    }

    public /* synthetic */ deserializeWithObjectId(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, findViews findviews, int i, int i2, long j5, withProperty withproperty, _getSetterInfo _getsetterinfo, find findVar, int i3, int i4, findOnlyParamWithoutInjection findonlyparamwithoutinjection, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i5 & 1) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j, (i5 & 2) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j2, (i5 & 4) != 0 ? null : getdatastream, (i5 & 8) != 0 ? null : withvaluedeserializer, (i5 & 16) != 0 ? null : _findformat, (i5 & 32) != 0 ? null : _reportmissingsetter, (i5 & 64) != 0 ? null : str, (i5 & 128) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j3, (i5 & 256) != 0 ? null : _find2viaalias, (i5 & 512) != 0 ? null : creatorCandidate, (i5 & 1024) != 0 ? null : cancreatefromboolean, (i5 & 2048) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : j4, (i5 & 4096) != 0 ? null : renameall, (i5 & 8192) != 0 ? null : nopinstance, (i5 & 16384) != 0 ? null : findviews, (i5 & 32768) != 0 ? assignIndexes.INSTANCE.AudioAttributesImplApi21Parcelizer() : i, (i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? withCaseInsensitivity.INSTANCE.MediaBrowserCompatCustomActionResultReceiver() : i2, (i5 & 131072) != 0 ? ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer() : j5, (i5 & 262144) != 0 ? null : withproperty, (i5 & 524288) != 0 ? null : _getsetterinfo, (i5 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : findVar, (i5 & 2097152) != 0 ? findSize.INSTANCE.IconCompatParcelizer() : i3, (i5 & 4194304) != 0 ? _findWithAlias.INSTANCE.AudioAttributesCompatParcelizer() : i4, (i5 & 8388608) != 0 ? null : findonlyparamwithoutinjection, null);
    }

    private deserializeWithObjectId(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, findViews findviews, int i, int i2, long j5, withProperty withproperty, _getSetterInfo _getsetterinfo, find findVar, int i3, int i4, findOnlyParamWithoutInjection findonlyparamwithoutinjection) {
        this(new _findPropertyUnwrapper(j, j2, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j3, _find2viaalias, creatorCandidate, cancreatefromboolean, j4, renameall, nopinstance, _getsetterinfo != null ? _getsetterinfo.getIconCompatParcelizer() : null, findviews, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), new _findCustomCollectionLikeDeserializer(i, i2, j5, withproperty, _getsetterinfo != null ? _getsetterinfo.getRemoteActionCompatParcelizer() : null, findVar, i3, i4, findonlyparamwithoutinjection, null), _getsetterinfo);
    }

    public final _findPropertyUnwrapper onRemoveQueueItemAt() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final _findCustomCollectionLikeDeserializer onRemoveQueueItem() {
        return this.read;
    }

    public final deserializeWithObjectId write(deserializeWithObjectId p0) {
        return (p0 == null || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, IconCompatParcelizer)) ? this : new deserializeWithObjectId(onRemoveQueueItemAt().AudioAttributesCompatParcelizer(p0.onRemoveQueueItemAt()), onRemoveQueueItem().IconCompatParcelizer(p0.onRemoveQueueItem()));
    }

    public final deserializeWithObjectId AudioAttributesCompatParcelizer(long p0, long p1, getDataStream p2, withValueDeserializer p3, _findFormat p4, _reportMissingSetter p5, String p6, long p7, _find2ViaAlias p8, CreatorCandidate p9, canCreateFromBoolean p10, long p11, renameAll p12, nopInstance p13, findViews p14, int p15, int p16, long p17, withProperty p18, find p19, int p20, int p21, _getSetterInfo p22, findOnlyParamWithoutInjection p23) {
        _findPropertyUnwrapper _findpropertyunwrapperAudioAttributesCompatParcelizer = _convertObjectId.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, null, Float.NaN, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p22 != null ? p22.getIconCompatParcelizer() : null, p14);
        _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer = _findCustomEnumDeserializer.read(this.read, p15, p16, p17, p18, p22 != null ? p22.getRemoteActionCompatParcelizer() : null, p19, p20, p21, p23);
        return (this.AudioAttributesCompatParcelizer == _findpropertyunwrapperAudioAttributesCompatParcelizer && this.read == _findcustomcollectionlikedeserializer) ? this : new deserializeWithObjectId(_findpropertyunwrapperAudioAttributesCompatParcelizer, _findcustomcollectionlikedeserializer);
    }

    public final deserializeWithObjectId read(_findCustomCollectionLikeDeserializer p0) {
        return new deserializeWithObjectId(onRemoveQueueItemAt(), onRemoveQueueItem().IconCompatParcelizer(p0));
    }

    public final deserializeWithObjectId IconCompatParcelizer(long p0, long p1, getDataStream p2, withValueDeserializer p3, _findFormat p4, _reportMissingSetter p5, String p6, long p7, _find2ViaAlias p8, CreatorCandidate p9, canCreateFromBoolean p10, long p11, renameAll p12, nopInstance p13, findViews p14, int p15, int p16, long p17, withProperty p18, _getSetterInfo p19, find p20, int p21, int p22, findOnlyParamWithoutInjection p23) {
        replace replaceVarAudioAttributesCompatParcelizer;
        if (switchToNext.RemoteActionCompatParcelizer(p0, this.AudioAttributesCompatParcelizer.read())) {
            replaceVarAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.getIconCompatParcelizer();
        } else {
            replaceVarAudioAttributesCompatParcelizer = replace.INSTANCE.AudioAttributesCompatParcelizer(p0);
        }
        return new deserializeWithObjectId(new _findPropertyUnwrapper(replaceVarAudioAttributesCompatParcelizer, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p19 != null ? p19.getIconCompatParcelizer() : null, p14, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), new _findCustomCollectionLikeDeserializer(p15, p16, p17, p18, p19 != null ? p19.getRemoteActionCompatParcelizer() : null, p20, p21, p22, p23, null), p19);
    }

    public final Instantiatable write() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer();
    }

    public final getDataStream MediaMetadataCompat() {
        return this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public final withValueDeserializer MediaBrowserCompatMediaItem() {
        return this.AudioAttributesCompatParcelizer.getWrite();
    }

    public final _findFormat RatingCompat() {
        return this.AudioAttributesCompatParcelizer.getRead();
    }

    public final _reportMissingSetter AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer();
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver();
    }

    public final long MediaDescriptionCompat() {
        return this.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver();
    }

    public final _find2ViaAlias IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer();
    }

    public final CreatorCandidate onPrepareFromMediaId() {
        return this.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer();
    }

    public final canCreateFromBoolean onAddQueueItem() {
        return this.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem();
    }

    public final long read() {
        return this.AudioAttributesCompatParcelizer.getMediaDescriptionCompat();
    }

    public final renameAll onPlayFromMediaId() {
        return this.AudioAttributesCompatParcelizer.getMediaMetadataCompat();
    }

    public final nopInstance onFastForward() {
        return this.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver();
    }

    public final findViews AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.getOnCustomAction();
    }

    public final int onPause() {
        return this.read.getWrite();
    }

    public final int onPlayFromUri() {
        return this.read.getIconCompatParcelizer();
    }

    public final long onCustomAction() {
        return this.read.getRead();
    }

    public final withProperty onPrepare() {
        return this.read.getAudioAttributesCompatParcelizer();
    }

    public final find MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.read.getAudioAttributesImplApi21Parcelizer();
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.read.getMediaBrowserCompatCustomActionResultReceiver();
    }

    public final int onCommand() {
        return this.read.getAudioAttributesImplApi26Parcelizer();
    }

    public final findOnlyParamWithoutInjection onPrepareFromSearch() {
        return this.read.getAudioAttributesImplBaseParcelizer();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof deserializeWithObjectId)) {
            return false;
        }
        deserializeWithObjectId deserializewithobjectid = (deserializeWithObjectId) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, deserializewithobjectid.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, deserializewithobjectid.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, deserializewithobjectid.write);
    }

    public final boolean read(deserializeWithObjectId p0) {
        if (this != p0) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, p0.read) && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0.AudioAttributesCompatParcelizer);
        }
        return true;
    }

    public final boolean IconCompatParcelizer(deserializeWithObjectId p0) {
        return this == p0 || this.AudioAttributesCompatParcelizer.read(p0.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode2 = this.read.hashCode();
        _getSetterInfo _getsetterinfo = this.write;
        return (((iHashCode * 31) + iHashCode2) * 31) + (_getsetterinfo != null ? _getsetterinfo.hashCode() : 0);
    }

    public final int onPlayFromSearch() {
        int iOnAddQueueItem = this.AudioAttributesCompatParcelizer.onAddQueueItem();
        int iHashCode = this.read.hashCode();
        _getSetterInfo _getsetterinfo = this.write;
        return (((iOnAddQueueItem * 31) + iHashCode) * 31) + (_getsetterinfo != null ? _getsetterinfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(MediaBrowserCompatCustomActionResultReceiver()));
        sb.append(", brush=");
        sb.append(write());
        sb.append(", alpha=");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(", fontSize=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(AudioAttributesImplApi21Parcelizer()));
        sb.append(", fontWeight=");
        sb.append(MediaMetadataCompat());
        sb.append(", fontStyle=");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(", fontSynthesis=");
        sb.append(RatingCompat());
        sb.append(", fontFamily=");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append(", fontFeatureSettings=");
        sb.append(MediaBrowserCompatItemReceiver());
        sb.append(", letterSpacing=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(MediaDescriptionCompat()));
        sb.append(", baselineShift=");
        sb.append(IconCompatParcelizer());
        sb.append(", textGeometricTransform=");
        sb.append(onPrepareFromMediaId());
        sb.append(", localeList=");
        sb.append(onAddQueueItem());
        sb.append(", background=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(read()));
        sb.append(", textDecoration=");
        sb.append(onPlayFromMediaId());
        sb.append(", shadow=");
        sb.append(onFastForward());
        sb.append(", drawStyle=");
        sb.append(AudioAttributesImplApi26Parcelizer());
        sb.append(", textAlign=");
        sb.append((Object) assignIndexes.AudioAttributesCompatParcelizer(onPause()));
        sb.append(", textDirection=");
        sb.append((Object) withCaseInsensitivity.IconCompatParcelizer(onPlayFromUri()));
        sb.append(", lineHeight=");
        sb.append((Object) ReadableObjectIdReferring.AudioAttributesImplApi21Parcelizer(onCustomAction()));
        sb.append(", textIndent=");
        sb.append(onPrepare());
        sb.append(", platformStyle=");
        sb.append(this.write);
        sb.append(", lineHeightStyle=");
        sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb.append(", lineBreak=");
        sb.append((Object) findSize.MediaBrowserCompatCustomActionResultReceiver(onCommand()));
        sb.append(", hyphens=");
        sb.append((Object) _findWithAlias.IconCompatParcelizer(MediaBrowserCompatSearchResultReceiver()));
        sb.append(", textMotion=");
        sb.append(onPrepareFromSearch());
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: o.deserializeWithObjectId$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/deserializeWithObjectId$write;", "", "<init>", "()V", "Lo/deserializeWithObjectId;", "IconCompatParcelizer", "Lo/deserializeWithObjectId;", "read", "()Lo/deserializeWithObjectId;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final deserializeWithObjectId read() {
            return deserializeWithObjectId.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public /* synthetic */ deserializeWithObjectId(long j, long j2, getDataStream getdatastream, withValueDeserializer withvaluedeserializer, _findFormat _findformat, _reportMissingSetter _reportmissingsetter, String str, long j3, _find2ViaAlias _find2viaalias, CreatorCandidate creatorCandidate, canCreateFromBoolean cancreatefromboolean, long j4, renameAll renameall, nopInstance nopinstance, findViews findviews, int i, int i2, long j5, withProperty withproperty, _getSetterInfo _getsetterinfo, find findVar, int i3, int i4, findOnlyParamWithoutInjection findonlyparamwithoutinjection, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(j, j2, getdatastream, withvaluedeserializer, _findformat, _reportmissingsetter, str, j3, _find2viaalias, creatorCandidate, cancreatefromboolean, j4, renameall, nopinstance, findviews, i, i2, j5, withproperty, _getsetterinfo, findVar, i3, i4, findonlyparamwithoutinjection);
    }
}
