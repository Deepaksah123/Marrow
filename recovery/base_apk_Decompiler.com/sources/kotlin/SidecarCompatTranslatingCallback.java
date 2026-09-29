package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin._reportMissingSetter;
import kotlin.startRearDisplaySession;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\b\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u001bJE\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u001cJ\u0017\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0013\u0010\u001eJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010\"\u001a\u0004\u0018\u00010%2\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010&J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010'J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010'J\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u0010#\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00101R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00101R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R.\u0010.\u001a\u0004\u0018\u00010:2\b\u0010\u0003\u001a\u0004\u0018\u00010:8\u0001@AX\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010;\u001a\u0004\b \u0010<\"\u0004\b\u0017\u0010=R\u0014\u0010?\u001a\u00020\u00128AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010>R\u001e\u00100\u001a\u0004\u0018\u00010\u001f8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u0019\u0010BR\u001c\u00105\u001a\u00020\n8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b \u00103\u001a\u0004\b\u0013\u0010CR\u001c\u0010@\u001a\u00020D8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b\u0017\u0010ER\u0018\u00104\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010GR\u0018\u0010H\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010K\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010JR\u0016\u00102\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u00109R\u0016\u0010L\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u00101R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u00101R\u0016\u0010,\u001a\u00020M8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\"\u00109"}, d2 = {"Lo/SidecarCompatTranslatingCallback;", "", "", "p0", "Lo/deserializeWithObjectId;", "p1", "Lo/_reportMissingSetter$write;", "p2", "Lo/paramName;", "p3", "", "p4", "", "p5", "p6", "<init>", "(Ljava/lang/String;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;IZIILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/DistinctElementSidecarCallback;", "", "write", "(J)V", "Lo/PropertyValueAny;", "Lo/tryToResolveUnresolved;", "read", "(JLo/tryToResolveUnresolved;)Z", "AudioAttributesCompatParcelizer", "(JLo/tryToResolveUnresolved;Lo/deserializeWithObjectId;)J", "(ILo/tryToResolveUnresolved;)I", "(Ljava/lang/String;Lo/deserializeWithObjectId;Lo/_reportMissingSetter$write;IZII)V", "Lo/_findCustomBeanDeserializer;", "(Lo/tryToResolveUnresolved;)Lo/_findCustomBeanDeserializer;", "Lo/_constructDefaultValueInstantiator;", "RemoteActionCompatParcelizer", "(JLo/tryToResolveUnresolved;)Lo/_constructDefaultValueInstantiator;", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "()V", "Lo/deserializeFromNumber;", "(Lo/deserializeWithObjectId;)Lo/deserializeFromNumber;", "(Lo/tryToResolveUnresolved;)I", "toString", "()Ljava/lang/String;", "handleMediaPlayPauseIfPendingOnHandler", "Ljava/lang/String;", "onAddQueueItem", "Lo/deserializeWithObjectId;", "AudioAttributesImplBaseParcelizer", "Lo/_reportMissingSetter$write;", "MediaBrowserCompatMediaItem", "I", "onCustomAction", "Z", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "MediaBrowserCompatCustomActionResultReceiver", "Lo/endRearDisplaySession;", "AudioAttributesImplApi26Parcelizer", "J", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "(Lo/bufferMapProperty;)V", "()Lo/getShowPopup;", "MediaBrowserCompatItemReceiver", "RatingCompat", "Lo/_constructDefaultValueInstantiator;", "()Lo/_constructDefaultValueInstantiator;", "()Z", "Lo/getKey;", "()J", "Lo/startRearDisplaySession;", "Lo/startRearDisplaySession;", "MediaDescriptionCompat", "Lo/_findCustomBeanDeserializer;", "Lo/tryToResolveUnresolved;", "onCommand", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SidecarCompatTranslatingCallback {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private tryToResolveUnresolved onCommand;
    private long AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private _reportMissingSetter.write IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public long onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private long RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private startRearDisplaySession MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private int AudioAttributesImplApi21Parcelizer;
    private _findCustomBeanDeserializer MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private _constructDefaultValueInstantiator MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private deserializeWithObjectId read;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private long onCustomAction;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private bufferMapProperty AudioAttributesImplBaseParcelizer;

    private SidecarCompatTranslatingCallback(String str, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3) {
        this.RemoteActionCompatParcelizer = str;
        this.read = deserializewithobjectid;
        this.IconCompatParcelizer = writeVar;
        this.AudioAttributesCompatParcelizer = i;
        this.write = z;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i3;
        this.AudioAttributesImplApi26Parcelizer = endRearDisplaySession.INSTANCE.write();
        this.RatingCompat = getKey.read(0L);
        this.onCustomAction = PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(0, 0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final bufferMapProperty getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void read(bufferMapProperty buffermapproperty) {
        bufferMapProperty buffermapproperty2 = this.AudioAttributesImplBaseParcelizer;
        long jRemoteActionCompatParcelizer = buffermapproperty != null ? endRearDisplaySession.RemoteActionCompatParcelizer(buffermapproperty) : endRearDisplaySession.INSTANCE.write();
        if (buffermapproperty2 == null) {
            this.AudioAttributesImplBaseParcelizer = buffermapproperty;
            this.AudioAttributesImplApi26Parcelizer = jRemoteActionCompatParcelizer;
        } else if (buffermapproperty == null || !endRearDisplaySession.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, jRemoteActionCompatParcelizer)) {
            this.AudioAttributesImplBaseParcelizer = buffermapproperty;
            this.AudioAttributesImplApi26Parcelizer = jRemoteActionCompatParcelizer;
            write(DistinctElementSidecarCallback.INSTANCE.IconCompatParcelizer());
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final getShowPopup IconCompatParcelizer() {
        _findCustomBeanDeserializer _findcustombeandeserializer = this.MediaDescriptionCompat;
        if (_findcustombeandeserializer != null) {
            _findcustombeandeserializer.AudioAttributesCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _constructDefaultValueInstantiator getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getRatingCompat() {
        return this.RatingCompat;
    }

    private final void write(long p0) {
        this.onAddQueueItem = p0 | (this.onAddQueueItem << 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean read(long r19, kotlin.tryToResolveUnresolved r21) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SidecarCompatTranslatingCallback.read(long, o.tryToResolveUnresolved):boolean");
    }

    static /* synthetic */ long AudioAttributesCompatParcelizer$default(SidecarCompatTranslatingCallback sidecarCompatTranslatingCallback, long j, tryToResolveUnresolved trytoresolveunresolved, deserializeWithObjectId deserializewithobjectid, int i, Object obj) {
        if ((i & 4) != 0) {
            deserializewithobjectid = sidecarCompatTranslatingCallback.read;
        }
        return sidecarCompatTranslatingCallback.AudioAttributesCompatParcelizer(j, trytoresolveunresolved, deserializewithobjectid);
    }

    private final long AudioAttributesCompatParcelizer(long p0, tryToResolveUnresolved p1, deserializeWithObjectId p2) {
        startRearDisplaySession.Companion companion = startRearDisplaySession.INSTANCE;
        startRearDisplaySession startreardisplaysession = this.MediaBrowserCompatSearchResultReceiver;
        bufferMapProperty buffermapproperty = this.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.write(buffermapproperty);
        startRearDisplaySession startreardisplaysessionIconCompatParcelizer = companion.IconCompatParcelizer(startreardisplaysession, p1, p2, buffermapproperty, this.IconCompatParcelizer);
        this.MediaBrowserCompatSearchResultReceiver = startreardisplaysessionIconCompatParcelizer;
        return startreardisplaysessionIconCompatParcelizer.read(p0, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final int write(int p0, tryToResolveUnresolved p1) {
        int i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i2 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (p0 == i && i != -1) {
            return i2;
        }
        long jAudioAttributesCompatParcelizer$default = PropertyValueBuffer.read(0, p0, 0, Integer.MAX_VALUE);
        if (this.MediaBrowserCompatCustomActionResultReceiver > 1) {
            jAudioAttributesCompatParcelizer$default = AudioAttributesCompatParcelizer$default(this, jAudioAttributesCompatParcelizer$default, p1, null, 4, null);
        }
        int iWrite = getQues.write(MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer$default, p1).read()), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(jAudioAttributesCompatParcelizer$default));
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p0;
        this.handleMediaPlayPauseIfPendingOnHandler = iWrite;
        return iWrite;
    }

    public final void write(String p0, deserializeWithObjectId p1, _reportMissingSetter.write p2, int p3, boolean p4, int p5, int p6) {
        this.RemoteActionCompatParcelizer = p0;
        this.read = p1;
        this.IconCompatParcelizer = p2;
        this.AudioAttributesCompatParcelizer = p3;
        this.write = p4;
        this.AudioAttributesImplApi21Parcelizer = p5;
        this.MediaBrowserCompatCustomActionResultReceiver = p6;
        write(DistinctElementSidecarCallback.INSTANCE.RemoteActionCompatParcelizer());
        AudioAttributesImplApi21Parcelizer();
    }

    private final _findCustomBeanDeserializer write(tryToResolveUnresolved p0) {
        _findCustomBeanDeserializer _findcustombeandeserializerRemoteActionCompatParcelizer = this.MediaDescriptionCompat;
        if (_findcustombeandeserializerRemoteActionCompatParcelizer == null || p0 != this.onCommand || _findcustombeandeserializerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            this.onCommand = p0;
            String str = this.RemoteActionCompatParcelizer;
            deserializeWithObjectId deserializewithobjectidIconCompatParcelizer = injectValues.IconCompatParcelizer(this.read, p0);
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            bufferMapProperty buffermapproperty = this.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.write(buffermapproperty);
            _findcustombeandeserializerRemoteActionCompatParcelizer = _findCustomCollectionDeserializer.RemoteActionCompatParcelizer(str, deserializewithobjectidIconCompatParcelizer, listRemoteActionCompatParcelizer, buffermapproperty, this.IconCompatParcelizer, IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        }
        this.MediaDescriptionCompat = _findcustombeandeserializerRemoteActionCompatParcelizer;
        return _findcustombeandeserializerRemoteActionCompatParcelizer;
    }

    public final _constructDefaultValueInstantiator RemoteActionCompatParcelizer(long p0, tryToResolveUnresolved p1) {
        _findCustomBeanDeserializer _findcustombeandeserializerWrite = write(p1);
        return _findCustomMapLikeDeserializer.IconCompatParcelizer(_findcustombeandeserializerWrite, startRearDisplayPresentationSession.read(p0, this.write, this.AudioAttributesCompatParcelizer, _findcustombeandeserializerWrite.write()), startRearDisplayPresentationSession.IconCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer), this.AudioAttributesCompatParcelizer);
    }

    private final boolean IconCompatParcelizer(long p0, tryToResolveUnresolved p1) {
        _findCustomBeanDeserializer _findcustombeandeserializer;
        _constructDefaultValueInstantiator _constructdefaultvalueinstantiator = this.MediaBrowserCompatMediaItem;
        if (_constructdefaultvalueinstantiator == null || (_findcustombeandeserializer = this.MediaDescriptionCompat) == null || _findcustombeandeserializer.AudioAttributesCompatParcelizer() || p1 != this.onCommand) {
            return true;
        }
        if (PropertyValueAny.write(p0, this.onCustomAction)) {
            return false;
        }
        return PropertyValueAny.AudioAttributesImplBaseParcelizer(p0) != PropertyValueAny.AudioAttributesImplBaseParcelizer(this.onCustomAction) || PropertyValueAny.MediaBrowserCompatItemReceiver(p0) != PropertyValueAny.MediaBrowserCompatItemReceiver(this.onCustomAction) || ((float) PropertyValueAny.AudioAttributesImplApi21Parcelizer(p0)) < _constructdefaultvalueinstantiator.read() || _constructdefaultvalueinstantiator.AudioAttributesCompatParcelizer();
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        this.MediaBrowserCompatMediaItem = null;
        this.MediaDescriptionCompat = null;
        this.onCommand = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;
        this.handleMediaPlayPauseIfPendingOnHandler = -1;
        this.onCustomAction = PropertyValueAny.INSTANCE.AudioAttributesCompatParcelizer(0, 0);
        this.RatingCompat = getKey.read(0L);
        this.MediaMetadataCompat = false;
    }

    public final deserializeFromNumber IconCompatParcelizer(deserializeWithObjectId p0) {
        bufferMapProperty buffermapproperty;
        tryToResolveUnresolved trytoresolveunresolved = this.onCommand;
        if (trytoresolveunresolved == null || (buffermapproperty = this.AudioAttributesImplBaseParcelizer) == null) {
            return null;
        }
        AbstractDeserializer abstractDeserializer = new AbstractDeserializer(this.RemoteActionCompatParcelizer, null, 2, null);
        if (this.MediaBrowserCompatMediaItem == null || this.MediaDescriptionCompat == null) {
            return null;
        }
        long jWrite = PropertyValueAny.write(this.onCustomAction & (-8589934589L));
        return new deserializeFromNumber(new deserializeFromBoolean(abstractDeserializer, p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer, this.write, this.AudioAttributesCompatParcelizer, buffermapproperty, trytoresolveunresolved, this.IconCompatParcelizer, jWrite, (MagicModuleRepositoryImplExternalSyntheticLambda0) null), new _checkImplicitlyNamedConstructors(new _findParamName(abstractDeserializer, p0, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), buffermapproperty, this.IconCompatParcelizer), jWrite, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesCompatParcelizer, null), this.RatingCompat, null);
    }

    public final int AudioAttributesCompatParcelizer(tryToResolveUnresolved p0) {
        return MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(write(p0).RemoteActionCompatParcelizer());
    }

    public final int read(tryToResolveUnresolved p0) {
        return MediaRouteExpandCollapseButton.RemoteActionCompatParcelizer(write(p0).write());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.MediaBrowserCompatMediaItem != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) endRearDisplaySession.read(this.AudioAttributesImplApi26Parcelizer));
        sb.append(", history=");
        sb.append(this.onAddQueueItem);
        sb.append(", constraints=$)");
        return sb.toString();
    }

    public /* synthetic */ SidecarCompatTranslatingCallback(String str, deserializeWithObjectId deserializewithobjectid, _reportMissingSetter.write writeVar, int i, boolean z, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, deserializewithobjectid, writeVar, i, z, i2, i3);
    }
}
