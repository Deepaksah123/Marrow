package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\nJ\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0012\u0010\u0016J\u0019\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0017¢\u0006\u0004\b\u0012\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u0012\u0010\u001bJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\r\u0010\u001bJ\u001f\u0010\u0010\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u001cJ'\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u001eJ\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u001fJ\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u0011J\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010!J\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\nJ\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\nJ\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\nJ\u001d\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020$¢\u0006\u0004\b%\u0010&J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020$2\u0006\u0010\u001d\u001a\u00020'¢\u0006\u0004\b\u0010\u0010(J\u0015\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f¢\u0006\u0004\b%\u0010\u0011J)\u0010\u0010\u001a\u00020\b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\b0)2\u0006\u0010\u0005\u001a\u00020*¢\u0006\u0004\b\u0010\u0010+J\u0017\u0010%\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b%\u0010!J;\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010,\"\u0004\b\u0001\u0010-2\u0006\u0010\u0003\u001a\u00028\u00012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0.¢\u0006\u0004\b\u0010\u0010/J\u001d\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b%\u00100J%\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u00101J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u00100J\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u00100J'\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u00101J\r\u00104\u001a\u00020\b¢\u0006\u0004\b4\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010!J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\nJ\u001b\u0010%\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\b06¢\u0006\u0004\b%\u00107J\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u0002082\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b\u0012\u00109J%\u0010%\u001a\u00020\b2\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010:2\u0006\u0010\u0005\u001a\u000208¢\u0006\u0004\b%\u0010;J/\u0010\r\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010<2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020>2\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b\r\u0010@J%\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020>¢\u0006\u0004\b\r\u0010BJ\r\u0010%\u001a\u00020\b¢\u0006\u0004\b%\u0010\nJ\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u000108¢\u0006\u0004\b\u001a\u0010CJ\r\u0010D\u001a\u00020\b¢\u0006\u0004\bD\u0010\nJ\r\u0010E\u001a\u00020\b¢\u0006\u0004\bE\u0010\nJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010FR\"\u0010\u0010\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010G\u001a\u0004\bH\u0010I\"\u0004\b\r\u0010JR\u0014\u0010\u0012\u001a\u00020K8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010NR\u0014\u0010\r\u001a\u00020O8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010PR\"\u0010D\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010N\u001a\u0004\bQ\u0010R\"\u0004\b%\u0010\u000eR\u0016\u0010T\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010SR\u0016\u0010H\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bD\u0010SR\u001c\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u0010VR\u0016\u0010Q\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010SR\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010SR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010SR\u0016\u0010E\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u0010SR\u0011\u00102\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\bT\u0010R"}, d2 = {"Lo/parseLong19;", "", "Lo/_parseIntValue;", "p0", "Lo/_full3;", "p1", "<init>", "(Lo/_parseIntValue;Lo/_full3;)V", "", "onCommand", "()V", "onFastForward", "", "RemoteActionCompatParcelizer", "(Z)V", "", "AudioAttributesCompatParcelizer", "(I)V", "read", "MediaMetadataCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/_parseSlowFloat;", "(Lo/_parseSlowFloat;)V", "Lo/constructReadConstrainedTextBuffer;", "(Lo/constructReadConstrainedTextBuffer;)V", "Lo/rawReference;", "write", "(Lo/rawReference;)V", "(Ljava/lang/Object;I)V", "p2", "(Ljava/lang/Object;Lo/_parseSlowFloat;I)V", "(Lo/_parseSlowFloat;Ljava/lang/Object;)V", "RatingCompat", "(Ljava/lang/Object;)V", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatMediaItem", "Lo/releaseTokenBuffer;", "IconCompatParcelizer", "(Lo/_parseSlowFloat;Lo/releaseTokenBuffer;)V", "Lo/_outputUptoBillion;", "(Lo/_parseSlowFloat;Lo/releaseTokenBuffer;Lo/_outputUptoBillion;)V", "Lkotlin/Function1;", "Lo/createChildArrayContext;", "(Lo/getAnswerMap;Lo/createChildArrayContext;)V", "T", "V", "Lkotlin/Function2;", "(Ljava/lang/Object;Lo/MagicModuleSubmissionRequestBody;)V", "(II)V", "(III)V", "MediaDescriptionCompat", "onMediaButtonEvent", "MediaBrowserCompatItemReceiver", "onCustomAction", "Lkotlin/Function0;", "(Lo/getCreatedOnDateMs;)V", "Lo/ifftMixedRadix;", "(Lo/ifftMixedRadix;Lo/_parseSlowFloat;)V", "", "(Ljava/util/List;Lo/ifftMixedRadix;)V", "Lo/checkValue;", "Lo/convertNumberToLong;", "Lo/getFilter;", "p3", "(Lo/checkValue;Lo/convertNumberToLong;Lo/getFilter;Lo/getFilter;)V", "Lo/_reportMissingRootWS;", "(Lo/_reportMissingRootWS;Lo/convertNumberToLong;Lo/getFilter;)V", "(Lo/_full3;Lo/ifftMixedRadix;)V", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatSearchResultReceiver", "Lo/_parseIntValue;", "Lo/_full3;", "AudioAttributesImplApi26Parcelizer", "()Lo/_full3;", "(Lo/_full3;)V", "Lo/releaseBase64Buffer;", "onAddQueueItem", "()Lo/releaseBase64Buffer;", "Z", "Lo/filterFinishArray;", "Lo/filterFinishArray;", "MediaBrowserCompatCustomActionResultReceiver", "()Z", "I", "AudioAttributesImplBaseParcelizer", "Lo/parseLong;", "Ljava/util/ArrayList;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class parseLong19 {
    public static final int write = 8;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private _full3 AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final _parseIntValue IconCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final filterFinishArray RemoteActionCompatParcelizer = new filterFinishArray();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer = true;
    private final ArrayList<Object> MediaBrowserCompatItemReceiver = parseLong.IconCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private int MediaBrowserCompatCustomActionResultReceiver = -1;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private int MediaMetadataCompat = -1;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int RatingCompat = -1;

    public parseLong19(_parseIntValue _parseintvalue, _full3 _full3Var) {
        this.IconCompatParcelizer = _parseintvalue;
        this.AudioAttributesCompatParcelizer = _full3Var;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final _full3 getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void RemoteActionCompatParcelizer(_full3 _full3Var) {
        this.AudioAttributesCompatParcelizer = _full3Var;
    }

    private final releaseBase64Buffer onAddQueueItem() {
        return this.IconCompatParcelizer.getOnSetShuffleMode();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private final void onCommand() {
        onCustomAction();
    }

    private final void onFastForward() {
        AudioAttributesCompatParcelizer$default(this, false, 1, null);
        MediaMetadataCompat();
    }

    static /* synthetic */ void RemoteActionCompatParcelizer$default(parseLong19 parselong19, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        parselong19.RemoteActionCompatParcelizer(z);
    }

    private final void RemoteActionCompatParcelizer(boolean p0) {
        AudioAttributesCompatParcelizer(p0);
    }

    public final void AudioAttributesCompatParcelizer(int p0) {
        this.AudioAttributesImplBaseParcelizer += p0 - onAddQueueItem().getWrite();
    }

    public final void read(int p0) {
        this.AudioAttributesImplBaseParcelizer = p0;
    }

    public final void MediaMetadataCompat() {
        releaseBase64Buffer releasebase64bufferOnAddQueueItem;
        int mediaDescriptionCompat;
        if (onAddQueueItem().getAudioAttributesImplBaseParcelizer() <= 0 || this.RemoteActionCompatParcelizer.write(-2) == (mediaDescriptionCompat = (releasebase64bufferOnAddQueueItem = onAddQueueItem()).getMediaDescriptionCompat())) {
            return;
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (mediaDescriptionCompat > 0) {
            _parseSlowFloat _parseslowfloatIconCompatParcelizer = releasebase64bufferOnAddQueueItem.IconCompatParcelizer(mediaDescriptionCompat);
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(mediaDescriptionCompat);
            read(_parseslowfloatIconCompatParcelizer);
        }
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.write || !this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        RemoteActionCompatParcelizer$default(this, false, 1, null);
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        this.write = true;
    }

    private final void read(_parseSlowFloat p0) {
        RemoteActionCompatParcelizer$default(this, false, 1, null);
        this.AudioAttributesCompatParcelizer.write(p0);
        this.write = true;
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer$default(parseLong19 parselong19, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        parselong19.AudioAttributesCompatParcelizer(z);
    }

    private final void AudioAttributesCompatParcelizer(boolean p0) {
        int mediaDescriptionCompat = p0 ? onAddQueueItem().getMediaDescriptionCompat() : onAddQueueItem().getWrite();
        int i = mediaDescriptionCompat - this.AudioAttributesImplBaseParcelizer;
        if (i < 0) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Tried to seek backward");
        }
        if (i > 0) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i);
            this.AudioAttributesImplBaseParcelizer = mediaDescriptionCompat;
        }
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return onAddQueueItem().getMediaDescriptionCompat() - this.AudioAttributesImplBaseParcelizer < 0;
    }

    public final void read(constructReadConstrainedTextBuffer p0) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void write(rawReference p0) {
        this.AudioAttributesCompatParcelizer.read(p0);
    }

    public final void read(rawReference p0) {
        this.AudioAttributesCompatParcelizer.write(p0);
    }

    public final void RemoteActionCompatParcelizer(rawReference p0) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void AudioAttributesCompatParcelizer(Object p0, int p1) {
        RemoteActionCompatParcelizer(true);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    public final void read(Object p0, _parseSlowFloat p1, int p2) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    public final void read(_parseSlowFloat p0, Object p1) {
        this.AudioAttributesCompatParcelizer.write(p0, p1);
    }

    public final void write(int p0) {
        if (p0 > 0) {
            onFastForward();
            this.AudioAttributesCompatParcelizer.write(p0);
        }
    }

    public final void RatingCompat() {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
    }

    public final void read(Object p0) {
        RemoteActionCompatParcelizer$default(this, false, 1, null);
        this.AudioAttributesCompatParcelizer.write(p0);
    }

    public final void read() {
        if (this.write) {
            RemoteActionCompatParcelizer$default(this, false, 1, null);
            RemoteActionCompatParcelizer$default(this, false, 1, null);
            this.AudioAttributesCompatParcelizer.read();
            this.write = false;
        }
    }

    public final void RemoteActionCompatParcelizer() {
        int mediaDescriptionCompat = onAddQueueItem().getMediaDescriptionCompat();
        if (this.RemoteActionCompatParcelizer.write(-1) > mediaDescriptionCompat) {
            _validJsonValueList.AudioAttributesCompatParcelizer("Missed recording an endGroup");
        }
        if (this.RemoteActionCompatParcelizer.write(-1) == mediaDescriptionCompat) {
            RemoteActionCompatParcelizer$default(this, false, 1, null);
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            this.AudioAttributesCompatParcelizer.read();
        }
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
    }

    public final void MediaBrowserCompatMediaItem() {
        onFastForward();
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        this.AudioAttributesImplBaseParcelizer += onAddQueueItem().MediaBrowserCompatSearchResultReceiver();
    }

    public final void IconCompatParcelizer(_parseSlowFloat p0, releaseTokenBuffer p1) {
        onCustomAction();
        onFastForward();
        onMediaButtonEvent();
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
    }

    public final void AudioAttributesCompatParcelizer(_parseSlowFloat p0, releaseTokenBuffer p1, _outputUptoBillion p2) {
        onCustomAction();
        onFastForward();
        onMediaButtonEvent();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1, p2);
    }

    public final void IconCompatParcelizer(int p0) {
        onFastForward();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super createChildArrayContext, getShowPopup> p0, createChildArrayContext p1) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    public final void IconCompatParcelizer(Object p0) {
        onCommand();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    public final <T, V> void AudioAttributesCompatParcelizer(V p0, MagicModuleSubmissionRequestBody<? super T, ? super V, getShowPopup> p1) {
        onCommand();
        this.AudioAttributesCompatParcelizer.read(p0, p1);
    }

    public final void IconCompatParcelizer(int p0, int p1) {
        if (p1 > 0) {
            if (p0 < 0) {
                _validJsonValueList.AudioAttributesCompatParcelizer("Invalid remove index ".concat(String.valueOf(p0)));
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver == p0) {
                this.MediaBrowserCompatSearchResultReceiver += p1;
                return;
            }
            onMediaButtonEvent();
            this.MediaBrowserCompatCustomActionResultReceiver = p0;
            this.MediaBrowserCompatSearchResultReceiver = p1;
        }
    }

    public final void write(int p0, int p1, int p2) {
        if (p2 > 0) {
            int i = this.MediaBrowserCompatSearchResultReceiver;
            if (i > 0 && this.MediaMetadataCompat == p0 - i && this.RatingCompat == p1 - i) {
                this.MediaBrowserCompatSearchResultReceiver = i + p2;
                return;
            }
            onMediaButtonEvent();
            this.MediaMetadataCompat = p0;
            this.RatingCompat = p1;
            this.MediaBrowserCompatSearchResultReceiver = p2;
        }
    }

    public final void MediaDescriptionCompat() {
        onCustomAction();
        if (this.write) {
            handleMediaPlayPauseIfPendingOnHandler();
            read();
        }
    }

    public final void write() {
        onMediaButtonEvent();
    }

    public final void read(int p0, int p1) {
        write();
        onCustomAction();
        int iMediaMetadataCompat = onAddQueueItem().AudioAttributesImplBaseParcelizer(p1) ? 1 : onAddQueueItem().MediaMetadataCompat(p1);
        if (iMediaMetadataCompat > 0) {
            IconCompatParcelizer(p0, iMediaMetadataCompat);
        }
    }

    private final void onMediaButtonEvent() {
        int i = this.MediaBrowserCompatSearchResultReceiver;
        if (i > 0) {
            int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i2 >= 0) {
                RemoteActionCompatParcelizer(i2, i);
                this.MediaBrowserCompatCustomActionResultReceiver = -1;
            } else {
                IconCompatParcelizer(this.RatingCompat, this.MediaMetadataCompat, i);
                this.MediaMetadataCompat = -1;
                this.RatingCompat = -1;
            }
            this.MediaBrowserCompatSearchResultReceiver = 0;
        }
    }

    private final void RemoteActionCompatParcelizer(int p0, int p1) {
        onCommand();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1);
    }

    private final void IconCompatParcelizer(int p0, int p1, int p2) {
        onCommand();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    public final void MediaBrowserCompatItemReceiver() {
        onMediaButtonEvent();
        if (parseLong.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver)) {
            parseLong.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatItemReceiver);
        } else {
            this.AudioAttributesImplApi26Parcelizer++;
        }
    }

    public final void write(Object p0) {
        onMediaButtonEvent();
        parseLong.write(this.MediaBrowserCompatItemReceiver, p0);
    }

    private final void onCustomAction() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i > 0) {
            this.AudioAttributesCompatParcelizer.read(i);
            this.AudioAttributesImplApi26Parcelizer = 0;
        }
        if (parseLong.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver)) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(parseLong.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatItemReceiver));
            parseLong.read(this.MediaBrowserCompatItemReceiver);
        }
    }

    public final void IconCompatParcelizer(getCreatedOnDateMs<getShowPopup> p0) {
        this.AudioAttributesCompatParcelizer.read(p0);
    }

    public final void read(ifftMixedRadix p0, _parseSlowFloat p1) {
        onCustomAction();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
    }

    public final void IconCompatParcelizer(List<? extends Object> p0, ifftMixedRadix p1) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, p1);
    }

    public final void RemoteActionCompatParcelizer(checkValue p0, convertNumberToLong p1, getFilter p2, getFilter p3) {
        this.AudioAttributesCompatParcelizer.read(p0, p1, p2, p3);
    }

    public final void RemoteActionCompatParcelizer(_reportMissingRootWS p0, convertNumberToLong p1, getFilter p2) {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0, p1, p2);
    }

    public final void IconCompatParcelizer() {
        onCustomAction();
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        this.AudioAttributesImplBaseParcelizer = 0;
    }

    public final void write(_full3 p0, ifftMixedRadix p1) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(p0, p1);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        onCustomAction();
        if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer == 0) {
            return;
        }
        _validJsonValueList.AudioAttributesCompatParcelizer("Missed recording an endGroup()");
    }

    public final void MediaBrowserCompatSearchResultReceiver() {
        this.write = false;
        this.RemoteActionCompatParcelizer.read();
        this.AudioAttributesImplBaseParcelizer = 0;
        this.AudioAttributesImplApi21Parcelizer = true;
        this.AudioAttributesImplApi26Parcelizer = 0;
        parseLong.read(this.MediaBrowserCompatItemReceiver);
        this.MediaBrowserCompatCustomActionResultReceiver = -1;
        this.MediaMetadataCompat = -1;
        this.RatingCompat = -1;
        this.MediaBrowserCompatSearchResultReceiver = 0;
    }

    public final void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer$default(this, false, 1, null);
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }
}
