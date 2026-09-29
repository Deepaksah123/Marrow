package kotlin;

import android.os.Trace;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractDeserializer;
import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin._reportMissingSetter;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00011BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010,J]\u0010-\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b-\u0010.Ja\u0010/\u001a\u00020\u00112\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u001c2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b/\u00100J-\u00101\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b1\u00102J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b/\u0010,J\u000f\u00103\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104J\u000f\u0010*\u001a\u00020\rH\u0000¢\u0006\u0004\b*\u00104J\u0013\u0010*\u001a\u00020\r*\u000205H\u0016¢\u0006\u0004\b*\u00106J%\u0010-\u001a\u00020:2\u0006\u0010\u0006\u001a\u0002072\u0006\u0010\b\u001a\u0002082\u0006\u0010\n\u001a\u000209¢\u0006\u0004\b-\u0010;J#\u0010/\u001a\u00020:*\u0002072\u0006\u0010\u0006\u001a\u0002082\u0006\u0010\b\u001a\u000209H\u0016¢\u0006\u0004\b/\u0010;J%\u00103\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020<2\u0006\u0010\b\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b3\u0010>J#\u0010/\u001a\u00020\u0013*\u00020<2\u0006\u0010\u0006\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u0010>J%\u0010?\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020<2\u0006\u0010\b\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b?\u0010>J#\u0010-\u001a\u00020\u0013*\u00020<2\u0006\u0010\u0006\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010>J%\u0010@\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020<2\u0006\u0010\b\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b@\u0010>J#\u00101\u001a\u00020\u0013*\u00020<2\u0006\u0010\u0006\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u0010>J%\u0010(\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020<2\u0006\u0010\b\u001a\u00020=2\u0006\u0010\n\u001a\u00020\u0013¢\u0006\u0004\b(\u0010>J#\u0010*\u001a\u00020\u0013*\u00020<2\u0006\u0010\u0006\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b*\u0010>J\u0015\u00101\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020A¢\u0006\u0004\b1\u0010BJ\u0013\u0010*\u001a\u00020\r*\u00020AH\u0016¢\u0006\u0004\b*\u0010BR\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u00101\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010GR$\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010HR\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010JR\u0016\u0010?\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR$\u0010M\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR,\u0010@\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010U\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010O\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010VR$\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010HR\u0014\u0010Q\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010WR$\u0010K\u001a\u0010\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u0013\u0018\u00010X8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010ZR\u0018\u0010E\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010[R\u0014\u0010C\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\\R*\u0010_\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0]\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010HR\u0018\u0010^\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b1\u0010`"}, d2 = {"Lo/WorkDatabase;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/_initForReading;", "Lo/addKeySerializers;", "Lo/hasIndex;", "Lo/AbstractDeserializer;", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lkotlin/Function1;", "Lo/deserializeFromNumber;", "", "p3", "Lo/paramName;", "p4", "", "p5", "", "p6", "p7", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "Lo/_findCustomMapDeserializer;", "p8", "Lo/WritableTypeIdInclusion;", "p9", "Lo/JFunction2;", "p10", "Lo/MinimalPrettyPrinter;", "p11", "Lo/setTrackNameProvider;", "p12", "Lo/WorkDatabase$RemoteActionCompatParcelizer;", "p13", "<init>", "(Lo/AbstractDeserializer;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;Lo/getAnswerMap;IZIILjava/util/List;Lo/getAnswerMap;Lo/JFunction2;Lo/MinimalPrettyPrinter;Lo/setTrackNameProvider;Lo/getAnswerMap;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/bufferMapProperty;", "Lo/removeRearDisplayStatusListener;", "IconCompatParcelizer", "(Lo/bufferMapProperty;)Lo/removeRearDisplayStatusListener;", "write", "(Lo/MinimalPrettyPrinter;Lo/deserializeWithObjectId;)Z", "(Lo/AbstractDeserializer;)Z", "AudioAttributesCompatParcelizer", "(Lo/deserializeWithObjectId;Ljava/util/List;IIZLo/_reportMissingSetter$write;ILo/setTrackNameProvider;)Z", "read", "(Lo/getAnswerMap;Lo/getAnswerMap;Lo/JFunction2;Lo/getAnswerMap;)Z", "RemoteActionCompatParcelizer", "(ZZZZ)V", "MediaBrowserCompatCustomActionResultReceiver", "()V", "Lo/getConfigOverride;", "(Lo/getConfigOverride;)V", "Lo/withContentValueHandler;", "Lo/isTypeOrSuperTypeOf;", "Lo/PropertyValueAny;", "Lo/withHandlersFrom;", "(Lo/withContentValueHandler;Lo/isTypeOrSuperTypeOf;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "(Lo/getValueHandler;Lo/hasHandlers;I)I", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "Lo/findSerializer;", "(Lo/findSerializer;)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/AbstractDeserializer;", "onCustomAction", "Lo/deserializeWithObjectId;", "Lo/_reportMissingSetter$write;", "Lo/getAnswerMap;", "MediaBrowserCompatMediaItem", "I", "handleMediaPlayPauseIfPendingOnHandler", "Z", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "RatingCompat", "Ljava/util/List;", "MediaDescriptionCompat", "Lo/JFunction2;", "MediaMetadataCompat", "Lo/MinimalPrettyPrinter;", "MediaBrowserCompatSearchResultReceiver", "Lo/setTrackNameProvider;", "()Z", "", "Lo/weirdNumberException;", "Ljava/util/Map;", "Lo/removeRearDisplayStatusListener;", "()Lo/removeRearDisplayStatusListener;", "", "onCommand", "onAddQueueItem", "Lo/WorkDatabase$RemoteActionCompatParcelizer;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WorkDatabase extends _handleOddName.IconCompatParcelizer implements _initForReading, addKeySerializers, hasIndex {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private _reportMissingSetter.write RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super RemoteActionCompatParcelizer, getShowPopup> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private Map<weirdNumberException, Integer> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private getAnswerMap<? super deserializeFromNumber, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private int write;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private AbstractDeserializer read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private JFunction2 MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private MinimalPrettyPrinter MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public RemoteActionCompatParcelizer onCommand;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private getAnswerMap<? super List<deserializeFromNumber>, Boolean> onAddQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private deserializeWithObjectId AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private removeRearDisplayStatusListener onCustomAction;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setTrackNameProvider RatingCompat;

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return false;
    }

    private WorkDatabase(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap, int i, boolean z, int i2, int i3, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap<? super RemoteActionCompatParcelizer, getShowPopup> getanswermap3) {
        this.read = abstractDeserializer;
        this.AudioAttributesCompatParcelizer = deserializewithobjectid;
        this.RemoteActionCompatParcelizer = writeVar;
        this.IconCompatParcelizer = getanswermap;
        this.write = i;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesImplApi26Parcelizer = list;
        this.AudioAttributesImplApi21Parcelizer = getanswermap2;
        this.MediaBrowserCompatMediaItem = jFunction2;
        this.MediaBrowserCompatSearchResultReceiver = minimalPrettyPrinter;
        this.RatingCompat = settracknameprovider;
        this.MediaMetadataCompat = getanswermap3;
    }

    private final removeRearDisplayStatusListener read() {
        if (this.onCustomAction == null) {
            this.onCustomAction = new removeRearDisplayStatusListener(this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.RatingCompat, null);
        }
        removeRearDisplayStatusListener removereardisplaystatuslistener = this.onCustomAction;
        toMagicModuleMetaRepoModel.write(removereardisplaystatuslistener);
        return removereardisplaystatuslistener;
    }

    private final removeRearDisplayStatusListener IconCompatParcelizer(bufferMapProperty p0) {
        removeRearDisplayStatusListener write;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCommand;
        if (remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.getIconCompatParcelizer() && (write = remoteActionCompatParcelizer.getWrite()) != null) {
            write.IconCompatParcelizer(p0);
            return write;
        }
        removeRearDisplayStatusListener removereardisplaystatuslistener = read();
        removereardisplaystatuslistener.IconCompatParcelizer(p0);
        return removereardisplaystatuslistener;
    }

    public final boolean write(MinimalPrettyPrinter p0, deserializeWithObjectId p1) {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, this.MediaBrowserCompatSearchResultReceiver);
        this.MediaBrowserCompatSearchResultReceiver = p0;
        return (zRemoteActionCompatParcelizer && p1.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) ? false : true;
    }

    public final boolean IconCompatParcelizer(AbstractDeserializer p0) {
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read.getIconCompatParcelizer(), (Object) p0.getIconCompatParcelizer());
        boolean z = (zRemoteActionCompatParcelizer && this.read.RemoteActionCompatParcelizer(p0)) ? false : true;
        if (z) {
            this.read = p0;
        }
        if (!zRemoteActionCompatParcelizer) {
            write();
        }
        return z;
    }

    public final boolean AudioAttributesCompatParcelizer(deserializeWithObjectId p0, List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> p1, int p2, int p3, boolean p4, _reportMissingSetter.write p5, int p6, setTrackNameProvider p7) {
        boolean z = !this.AudioAttributesCompatParcelizer.read(p0);
        this.AudioAttributesCompatParcelizer = p0;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, p1)) {
            this.AudioAttributesImplApi26Parcelizer = p1;
            z = true;
        }
        if (this.MediaBrowserCompatItemReceiver != p2) {
            this.MediaBrowserCompatItemReceiver = p2;
            z = true;
        }
        if (this.AudioAttributesImplBaseParcelizer != p3) {
            this.AudioAttributesImplBaseParcelizer = p3;
            z = true;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver != p4) {
            this.MediaBrowserCompatCustomActionResultReceiver = p4;
            z = true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, p5)) {
            this.RemoteActionCompatParcelizer = p5;
            z = true;
        }
        if (!paramName.write(this.write, p6)) {
            this.write = p6;
            z = true;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, p7)) {
            return z;
        }
        this.RatingCompat = p7;
        return true;
    }

    public final boolean read(getAnswerMap<? super deserializeFromNumber, getShowPopup> p0, getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> p1, JFunction2 p2, getAnswerMap<? super RemoteActionCompatParcelizer, getShowPopup> p3) {
        boolean z;
        if (this.IconCompatParcelizer != p0) {
            this.IconCompatParcelizer = p0;
            z = true;
        } else {
            z = false;
        }
        if (this.AudioAttributesImplApi21Parcelizer != p1) {
            this.AudioAttributesImplApi21Parcelizer = p1;
            z = true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, p2)) {
            this.MediaBrowserCompatMediaItem = p2;
            z = true;
        }
        if (this.MediaMetadataCompat == p3) {
            return z;
        }
        this.MediaMetadataCompat = p3;
        return true;
    }

    public final void RemoteActionCompatParcelizer(boolean p0, boolean p1, boolean p2, boolean p3) {
        if (p1 || p2 || p3) {
            read().write(this.read, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer, this.RatingCompat);
        }
        if (getRatingCompat()) {
            if (p1 || (p0 && this.onAddQueueItem != null)) {
                getValueNulls.write(this);
            }
            if (p1 || p2 || p3) {
                _newReader.RemoteActionCompatParcelizer(this);
                addDeserializers.read(this);
            }
            if (p0) {
                addDeserializers.read(this);
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016\"\u0004\b\u0015\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u0013\u0010\u001cR$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b\u001d\u0010 "}, d2 = {"Lo/WorkDatabase$RemoteActionCompatParcelizer;", "", "Lo/AbstractDeserializer;", "p0", "p1", "", "p2", "Lo/removeRearDisplayStatusListener;", "p3", "<init>", "(Lo/AbstractDeserializer;Lo/AbstractDeserializer;ZLo/removeRearDisplayStatusListener;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Lo/AbstractDeserializer;", "AudioAttributesCompatParcelizer", "()Lo/AbstractDeserializer;", "write", "(Lo/AbstractDeserializer;)V", "Z", "IconCompatParcelizer", "()Z", "(Z)V", "read", "Lo/removeRearDisplayStatusListener;", "()Lo/removeRearDisplayStatusListener;", "(Lo/removeRearDisplayStatusListener;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RemoteActionCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private boolean IconCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final AbstractDeserializer AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private removeRearDisplayStatusListener write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private AbstractDeserializer RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(AbstractDeserializer abstractDeserializer, AbstractDeserializer abstractDeserializer2, boolean z, removeRearDisplayStatusListener removereardisplaystatuslistener) {
            this.AudioAttributesCompatParcelizer = abstractDeserializer;
            this.RemoteActionCompatParcelizer = abstractDeserializer2;
            this.IconCompatParcelizer = z;
            this.write = removereardisplaystatuslistener;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(AbstractDeserializer abstractDeserializer, AbstractDeserializer abstractDeserializer2, boolean z, removeRearDisplayStatusListener removereardisplaystatuslistener, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(abstractDeserializer, abstractDeserializer2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : removereardisplaystatuslistener);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final AbstractDeserializer getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(AbstractDeserializer abstractDeserializer) {
            this.RemoteActionCompatParcelizer = abstractDeserializer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final AbstractDeserializer getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(boolean z) {
            this.IconCompatParcelizer = z;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final removeRearDisplayStatusListener getWrite() {
            return this.write;
        }

        public final void read(removeRearDisplayStatusListener removereardisplaystatuslistener) {
            this.write = removereardisplaystatuslistener;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == remoteActionCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, remoteActionCompatParcelizer.write);
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            int iHashCode3 = Boolean.hashCode(this.IconCompatParcelizer);
            removeRearDisplayStatusListener removereardisplaystatuslistener = this.write;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (removereardisplaystatuslistener == null ? 0 : removereardisplaystatuslistener.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer=");
            sb.append((Object) this.AudioAttributesCompatParcelizer);
            sb.append(", RemoteActionCompatParcelizer=");
            sb.append((Object) this.RemoteActionCompatParcelizer);
            sb.append(", IconCompatParcelizer=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", write=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }

    private final boolean read(AbstractDeserializer p0) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCommand;
        if (remoteActionCompatParcelizer != null) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, remoteActionCompatParcelizer.getRemoteActionCompatParcelizer())) {
                return false;
            }
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(p0);
            removeRearDisplayStatusListener write = remoteActionCompatParcelizer.getWrite();
            if (write == null) {
                return false;
            }
            write.write(p0, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), this.RatingCompat);
            return true;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = new RemoteActionCompatParcelizer(this.read, p0, false, null, 12, null);
        removeRearDisplayStatusListener removereardisplaystatuslistener = new removeRearDisplayStatusListener(p0, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), this.RatingCompat, null);
        removereardisplaystatuslistener.IconCompatParcelizer(read().getMediaMetadataCompat());
        remoteActionCompatParcelizer2.read(removereardisplaystatuslistener);
        this.onCommand = remoteActionCompatParcelizer2;
        return true;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        getValueNulls.write(this);
        _newReader.RemoteActionCompatParcelizer(this);
        addDeserializers.read(this);
    }

    public final void write() {
        this.onCommand = null;
    }

    @Override // kotlin.hasIndex
    public final void write(getConfigOverride getconfigoverride) {
        getAnswerMap<? super List<deserializeFromNumber>, Boolean> getanswermap = this.onAddQueueItem;
        if (getanswermap == null) {
            getanswermap = new getAnswerMap() { // from class: o.WorkDatabase_Impl
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(WorkDatabase.read(this.read, (List) obj));
                }
            };
            this.onAddQueueItem = getanswermap;
        }
        MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, this.read);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCommand;
        if (remoteActionCompatParcelizer != null) {
            MapperBuilder.IconCompatParcelizer(getconfigoverride, remoteActionCompatParcelizer.getRemoteActionCompatParcelizer());
            MapperBuilder.AudioAttributesCompatParcelizer(getconfigoverride, remoteActionCompatParcelizer.getIconCompatParcelizer());
        }
        MapperBuilder.AudioAttributesImplBaseParcelizer$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.MemoryCacheKeyComplex
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WorkDatabase.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (AbstractDeserializer) obj));
            }
        }, 1, (Object) null);
        MapperBuilder.MediaBrowserCompatCustomActionResultReceiver$default(getconfigoverride, (String) null, new getAnswerMap() { // from class: o.PixelSize
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(WorkDatabase.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, ((Boolean) obj).booleanValue()));
            }
        }, 1, (Object) null);
        MapperBuilder.IconCompatParcelizer$default(getconfigoverride, (String) null, new getCreatedOnDateMs() { // from class: o.DiagnosticsWorker
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return Boolean.valueOf(WorkDatabase.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
            }
        }, 1, (Object) null);
        MapperBuilder.RemoteActionCompatParcelizer$default(getconfigoverride, (String) null, getanswermap, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean read(kotlin.WorkDatabase r37, java.util.List r38) {
        /*
            r0 = r37
            o.removeRearDisplayStatusListener r1 = r37.read()
            o.deserializeFromNumber r2 = r1.getRatingCompat()
            if (r2 == 0) goto Laf
            o.deserializeFromBoolean r1 = r2.getIconCompatParcelizer()
            o.AbstractDeserializer r4 = r1.getWrite()
            o.deserializeWithObjectId r5 = r0.AudioAttributesCompatParcelizer
            o.MinimalPrettyPrinter r0 = r0.MediaBrowserCompatSearchResultReceiver
            if (r0 == 0) goto L1f
            long r0 = r0.write()
            goto L25
        L1f:
            o.switchToNext$AudioAttributesCompatParcelizer r0 = kotlin.switchToNext.INSTANCE
            long r0 = r0.AudioAttributesImplApi21Parcelizer()
        L25:
            r6 = r0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 16777214(0xfffffe, float:2.3509884E-38)
            r36 = 0
            o.deserializeWithObjectId r5 = kotlin.deserializeWithObjectId.AudioAttributesCompatParcelizer$default(r5, r6, r8, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36)
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            java.util.List r6 = r0.MediaBrowserCompatCustomActionResultReceiver()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            int r7 = r0.getIconCompatParcelizer()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            boolean r8 = r0.getRemoteActionCompatParcelizer()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            int r9 = r0.getMediaBrowserCompatCustomActionResultReceiver()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            o.bufferMapProperty r10 = r0.getAudioAttributesImplBaseParcelizer()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            o.tryToResolveUnresolved r11 = r0.getMediaBrowserCompatItemReceiver()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            o._reportMissingSetter$write r12 = r0.getAudioAttributesImplApi21Parcelizer()
            o.deserializeFromBoolean r0 = r2.getIconCompatParcelizer()
            long r13 = r0.getAudioAttributesImplApi26Parcelizer()
            o.deserializeFromBoolean r0 = new o.deserializeFromBoolean
            r15 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15)
            r4 = 0
            r6 = 2
            r7 = 0
            o.deserializeFromNumber r0 = kotlin.deserializeFromNumber.read$default(r2, r3, r4, r6, r7)
            if (r0 == 0) goto Laf
            r1 = r38
            r1.add(r0)
            goto Lb0
        Laf:
            r0 = 0
        Lb0:
            if (r0 == 0) goto Lb4
            r0 = 1
            return r0
        Lb4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WorkDatabase.read(o.WorkDatabase, java.util.List):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(WorkDatabase workDatabase, AbstractDeserializer abstractDeserializer) {
        workDatabase.read(abstractDeserializer);
        workDatabase.MediaBrowserCompatCustomActionResultReceiver();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(WorkDatabase workDatabase, boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = workDatabase.onCommand;
        if (remoteActionCompatParcelizer == null) {
            return false;
        }
        getAnswerMap<? super RemoteActionCompatParcelizer, getShowPopup> getanswermap = workDatabase.MediaMetadataCompat;
        if (getanswermap != null) {
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer);
            getanswermap.invoke(remoteActionCompatParcelizer);
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = workDatabase.onCommand;
        if (remoteActionCompatParcelizer2 != null) {
            remoteActionCompatParcelizer2.RemoteActionCompatParcelizer(z);
        }
        workDatabase.MediaBrowserCompatCustomActionResultReceiver();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(WorkDatabase workDatabase) {
        workDatabase.write();
        workDatabase.MediaBrowserCompatCustomActionResultReceiver();
        return true;
    }

    public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler p0, isTypeOrSuperTypeOf p1, long p2) {
        return read(p0, p1, p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(_parser _parserVar, _parser.IconCompatParcelizer iconCompatParcelizer) {
        _parser.IconCompatParcelizer.IconCompatParcelizer$default(iconCompatParcelizer, _parserVar, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, (Object) null);
        return getShowPopup.INSTANCE;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver(getValueHandler p0, hasHandlers p1, int p2) {
        return read(p0, p1, p2);
    }

    @Override // kotlin._initForReading
    public final int read(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).AudioAttributesCompatParcelizer(getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    public final int MediaBrowserCompatItemReceiver(getValueHandler p0, hasHandlers p1, int p2) {
        return AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin._initForReading
    public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).AudioAttributesCompatParcelizer(i, getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    public final int AudioAttributesImplApi21Parcelizer(getValueHandler p0, hasHandlers p1, int p2) {
        return RemoteActionCompatParcelizer(p0, p1, p2);
    }

    @Override // kotlin._initForReading
    public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).IconCompatParcelizer(getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    public final int IconCompatParcelizer(getValueHandler p0, hasHandlers p1, int p2) {
        return write(p0, p1, p2);
    }

    @Override // kotlin._initForReading
    public final int write(getValueHandler getvaluehandler, hasHandlers hashandlers, int i) {
        return IconCompatParcelizer(getvaluehandler).AudioAttributesCompatParcelizer(i, getvaluehandler.getAudioAttributesCompatParcelizer());
    }

    public final void RemoteActionCompatParcelizer(findSerializer p0) {
        write(p0);
    }

    @Override // kotlin.addKeySerializers
    public final void write(findSerializer findserializer) {
        boolean z;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<_findCustomMapDeserializer>> list;
        if (getRatingCompat()) {
            JFunction2 jFunction2 = this.MediaBrowserCompatMediaItem;
            if (jFunction2 != null) {
                jFunction2.read(findserializer);
            }
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findserializer.getIconCompatParcelizer().IconCompatParcelizer();
            deserializeFromNumber deserializefromnumberIconCompatParcelizer = IconCompatParcelizer(findserializer).IconCompatParcelizer();
            _checkImplicitlyNamedConstructors write = deserializefromnumberIconCompatParcelizer.getWrite();
            boolean z2 = deserializefromnumberIconCompatParcelizer.RemoteActionCompatParcelizer() && !paramName.write(this.write, paramName.INSTANCE.IconCompatParcelizer());
            if (z2) {
                z = z2;
                long j = -1;
                WritableTypeIdInclusion writableTypeIdInclusion = BufferRecycler.read(getReferencedType.INSTANCE.write(), calloc.write((((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits((int) deserializefromnumberIconCompatParcelizer.getRead()))) | (((long) Float.floatToRawIntBits((int) (deserializefromnumberIconCompatParcelizer.getRead() >> 32))) << 32)));
                jsonParserDelegateIconCompatParcelizer.IconCompatParcelizer();
                JsonParserDelegate.RemoteActionCompatParcelizer$default(jsonParserDelegateIconCompatParcelizer, writableTypeIdInclusion, 0, 2, null);
            } else {
                z = z2;
            }
            try {
                renameAll renameallOnPlayFromMediaId = this.AudioAttributesCompatParcelizer.onPlayFromMediaId();
                if (renameallOnPlayFromMediaId == null) {
                    renameallOnPlayFromMediaId = renameAll.INSTANCE.write();
                }
                renameAll renameall = renameallOnPlayFromMediaId;
                nopInstance nopinstanceOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
                if (nopinstanceOnFastForward == null) {
                    nopinstanceOnFastForward = nopInstance.INSTANCE.RemoteActionCompatParcelizer();
                }
                nopInstance nopinstance = nopinstanceOnFastForward;
                findTypeResolver findtyperesolverAudioAttributesImplApi26Parcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
                if (findtyperesolverAudioAttributesImplApi26Parcelizer == null) {
                    findtyperesolverAudioAttributesImplApi26Parcelizer = findTypeResolver.INSTANCE;
                }
                findViews findviews = findtyperesolverAudioAttributesImplApi26Parcelizer;
                Instantiatable instantiatableWrite = this.AudioAttributesCompatParcelizer.write();
                if (instantiatableWrite != null) {
                    write.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer, instantiatableWrite, (64 & 4) != 0 ? Float.NaN : this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(), (64 & 8) != 0 ? null : nopinstance, (64 & 16) != 0 ? null : renameall, (64 & 32) != 0 ? null : findviews, (64 & 64) != 0 ? findSetterInfo.INSTANCE.write() : 0);
                } else {
                    MinimalPrettyPrinter minimalPrettyPrinter = this.MediaBrowserCompatSearchResultReceiver;
                    long jWrite = minimalPrettyPrinter != null ? minimalPrettyPrinter.write() : switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer();
                    if (jWrite == 16) {
                        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() != 16) {
                            jWrite = this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
                        } else {
                            jWrite = switchToNext.INSTANCE.AudioAttributesCompatParcelizer();
                        }
                    }
                    write.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer, (32 & 2) != 0 ? switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer() : jWrite, (32 & 4) != 0 ? null : nopinstance, (32 & 8) != 0 ? null : renameall, (32 & 16) == 0 ? findviews : null, (32 & 32) != 0 ? findSetterInfo.INSTANCE.write() : 0);
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCommand;
                if (((remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.getIconCompatParcelizer()) && OriginalSize.AudioAttributesCompatParcelizer(this.read)) || !((list = this.AudioAttributesImplApi26Parcelizer) == null || list.isEmpty())) {
                    findserializer.write();
                }
            } finally {
                if (z) {
                    jsonParserDelegateIconCompatParcelizer.AudioAttributesCompatParcelizer();
                }
            }
        }
    }

    @Override // kotlin._initForReading
    public final withHandlersFrom read(withContentValueHandler withcontentvaluehandler, isTypeOrSuperTypeOf istypeorsupertypeof, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            removeRearDisplayStatusListener removereardisplaystatuslistenerIconCompatParcelizer = IconCompatParcelizer(withcontentvaluehandler);
            boolean zWrite = removereardisplaystatuslistenerIconCompatParcelizer.write(j, withcontentvaluehandler.getAudioAttributesCompatParcelizer());
            deserializeFromNumber deserializefromnumberIconCompatParcelizer = removereardisplaystatuslistenerIconCompatParcelizer.IconCompatParcelizer();
            deserializefromnumberIconCompatParcelizer.getWrite().getRead().AudioAttributesCompatParcelizer();
            if (zWrite) {
                _newReader.AudioAttributesCompatParcelizer(this);
                getAnswerMap<? super deserializeFromNumber, getShowPopup> getanswermap = this.IconCompatParcelizer;
                if (getanswermap != null) {
                    getanswermap.invoke(deserializefromnumberIconCompatParcelizer);
                }
                JFunction2 jFunction2 = this.MediaBrowserCompatMediaItem;
                if (jFunction2 != null) {
                    jFunction2.read(deserializefromnumberIconCompatParcelizer);
                }
                LinkedHashMap linkedHashMap = this.handleMediaPlayPauseIfPendingOnHandler;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(wrongTokenException.RemoteActionCompatParcelizer(), Integer.valueOf(Math.round(deserializefromnumberIconCompatParcelizer.getRemoteActionCompatParcelizer())));
                linkedHashMap.put(wrongTokenException.IconCompatParcelizer(), Integer.valueOf(Math.round(deserializefromnumberIconCompatParcelizer.getAudioAttributesCompatParcelizer())));
                this.handleMediaPlayPauseIfPendingOnHandler = linkedHashMap;
            }
            getAnswerMap<? super List<WritableTypeIdInclusion>, getShowPopup> getanswermap2 = this.AudioAttributesImplApi21Parcelizer;
            if (getanswermap2 != null) {
                getanswermap2.invoke(deserializefromnumberIconCompatParcelizer.MediaBrowserCompatItemReceiver());
            }
            final _parser _parserVarWrite = istypeorsupertypeof.write(PropertyValueAny.INSTANCE.IconCompatParcelizer((int) (deserializefromnumberIconCompatParcelizer.getRead() >> 32), (int) (deserializefromnumberIconCompatParcelizer.getRead() >> 32), (int) deserializefromnumberIconCompatParcelizer.getRead(), (int) deserializefromnumberIconCompatParcelizer.getRead()));
            int read = (int) (deserializefromnumberIconCompatParcelizer.getRead() >> 32);
            int read2 = (int) deserializefromnumberIconCompatParcelizer.getRead();
            Map<weirdNumberException, Integer> map = this.handleMediaPlayPauseIfPendingOnHandler;
            toMagicModuleMetaRepoModel.write(map);
            return withcontentvaluehandler.AudioAttributesCompatParcelizer(read, read2, map, new getAnswerMap() { // from class: o.WorkManagerInitializer
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return WorkDatabase.IconCompatParcelizer(_parserVarWrite, (_parser.IconCompatParcelizer) obj);
                }
            });
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ WorkDatabase(AbstractDeserializer abstractDeserializer, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, getAnswerMap getanswermap, int i, boolean z, int i2, int i3, List list, getAnswerMap getanswermap2, JFunction2 jFunction2, MinimalPrettyPrinter minimalPrettyPrinter, setTrackNameProvider settracknameprovider, getAnswerMap getanswermap3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(abstractDeserializer, deserializewithobjectid, writeVar, getanswermap, i, z, i2, i3, list, getanswermap2, jFunction2, minimalPrettyPrinter, settracknameprovider, getanswermap3);
    }
}
