package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BÑ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b(\u0010)R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b%\u00101R\u001a\u0010%\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00101R\u001a\u00105\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b2\u00101R\u001a\u00109\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b.\u00108R\u001a\u0010<\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b:\u00100\u001a\u0004\b;\u00101R\u001a\u00104\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00101R\u001a\u0010>\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b<\u0010AR\u001a\u0010B\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b9\u00101R\u001c\u0010F\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010C\u001a\u0004\bD\u0010ER\u001c\u0010;\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b?\u0010ER\u001a\u00106\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\b3\u0010HR\u001a\u0010J\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\bI\u00101R\u001a\u0010/\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\b6\u0010AR\u001a\u0010,\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bF\u0010MR\u0014\u0010K\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010NR\u0014\u0010O\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010@R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\bP\u0010-R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bQ\u0010-R\u001a\u00103\u001a\u00020\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010R\u001a\u0004\b=\u0010SR\u001a\u0010Q\u001a\u00020\u001f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010T\u001a\u0004\b:\u0010UR\u001a\u0010*\u001a\u00020!8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010V\u001a\u0004\bK\u0010WR\u0014\u0010(\u001a\u00020X8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010WR\u0014\u0010Y\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0011\u0010:\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\bJ\u0010AR \u0010]\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020\u00060Z8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bB\u0010\\R\u0014\u0010^\u001a\u00020\u00068\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u00101R\"\u0010D\u001a\u0010\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020'\u0018\u00010_8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010aR\u0014\u0010I\u001a\u00020\u00068\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u00101"}, d2 = {"Lo/removeEventListener;", "Lo/addDrmEventListener;", "Lo/withHandlersFrom;", "", "Lo/getMediaItem;", "p0", "", "p1", "p2", "p3", "Lo/superDispatchKeyEvent;", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "", "p11", "p12", "p13", "Lo/getInsetsIgnoringVisibility;", "p14", "p15", "p16", "p17", "p18", "Lo/TopUserCompanion;", "p19", "Lo/bufferMapProperty;", "p20", "Lo/PropertyValueAny;", "p21", "<init>", "(Ljava/util/List;IIILo/superDispatchKeyEvent;IIZILo/getMediaItem;Lo/getMediaItem;FIZLo/getInsetsIgnoringVisibility;Lo/withHandlersFrom;ZLjava/util/List;Ljava/util/List;Lo/TopUserCompanion;Lo/bufferMapProperty;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "RemoteActionCompatParcelizer", "(I)Lo/removeEventListener;", "", "onMediaButtonEvent", "()V", "onPause", "Ljava/util/List;", "RatingCompat", "()Ljava/util/List;", "write", "MediaMetadataCompat", "I", "()I", "AudioAttributesCompatParcelizer", "onCommand", "AudioAttributesImplApi21Parcelizer", "read", "MediaBrowserCompatSearchResultReceiver", "Lo/superDispatchKeyEvent;", "()Lo/superDispatchKeyEvent;", "IconCompatParcelizer", "onPlay", "MediaDescriptionCompat", "MediaBrowserCompatCustomActionResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "AudioAttributesImplBaseParcelizer", "onCustomAction", "Z", "()Z", "AudioAttributesImplApi26Parcelizer", "Lo/getMediaItem;", "onPlayFromSearch", "()Lo/getMediaItem;", "MediaBrowserCompatItemReceiver", "F", "()F", "onPrepareFromSearch", "MediaBrowserCompatMediaItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/getInsetsIgnoringVisibility;", "()Lo/getInsetsIgnoringVisibility;", "Lo/withHandlersFrom;", "onAddQueueItem", "onPrepare", "onPlayFromMediaId", "Lo/TopUserCompanion;", "()Lo/TopUserCompanion;", "Lo/bufferMapProperty;", "()Lo/bufferMapProperty;", "J", "()J", "Lo/getKey;", "onFastForward", "", "Lo/weirdNumberException;", "()Ljava/util/Map;", "onPrepareFromMediaId", "onPlayFromUri", "Lkotlin/Function1;", "Lo/JsonNode;", "()Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class removeEventListener implements addDrmEventListener, withHandlersFrom {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final List<getMediaItem> onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final getMediaItem MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final bufferMapProperty onPlayFromMediaId;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long onPause;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final List<getMediaItem> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final withHandlersFrom MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final superDispatchKeyEvent IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final getInsetsIgnoringVisibility RatingCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getMediaItem MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final TopUserCompanion onCommand;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final List<getMediaItem> write;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;

    private removeEventListener(List<getMediaItem> list, int i, int i2, int i3, superDispatchKeyEvent superdispatchkeyevent, int i4, int i5, boolean z, int i6, getMediaItem getmediaitem, getMediaItem getmediaitem2, float f, int i7, boolean z2, getInsetsIgnoringVisibility getinsetsignoringvisibility, withHandlersFrom withhandlersfrom, boolean z3, List<getMediaItem> list2, List<getMediaItem> list3, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, long j) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
        this.IconCompatParcelizer = superdispatchkeyevent;
        this.MediaBrowserCompatCustomActionResultReceiver = i4;
        this.AudioAttributesImplApi21Parcelizer = i5;
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = i6;
        this.MediaBrowserCompatItemReceiver = getmediaitem;
        this.MediaDescriptionCompat = getmediaitem2;
        this.MediaBrowserCompatSearchResultReceiver = f;
        this.MediaBrowserCompatMediaItem = i7;
        this.MediaMetadataCompat = z2;
        this.RatingCompat = getinsetsignoringvisibility;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = withhandlersfrom;
        this.onAddQueueItem = z3;
        this.onCustomAction = list2;
        this.handleMediaPlayPauseIfPendingOnHandler = list3;
        this.onCommand = topUserCompanion;
        this.onPlayFromMediaId = buffermapproperty;
        this.onPause = j;
    }

    @Override // kotlin.addDrmEventListener
    public final List<getMediaItem> RatingCompat() {
        return this.write;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: write, reason: from getter */
    public final superDispatchKeyEvent getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final getMediaItem getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final getMediaItem getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final float getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.addDrmEventListener
    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getInsetsIgnoringVisibility getRatingCompat() {
        return this.RatingCompat;
    }

    public /* synthetic */ removeEventListener(List list, int i, int i2, int i3, superDispatchKeyEvent superdispatchkeyevent, int i4, int i5, boolean z, int i6, getMediaItem getmediaitem, getMediaItem getmediaitem2, float f, int i7, boolean z2, getInsetsIgnoringVisibility getinsetsignoringvisibility, withHandlersFrom withhandlersfrom, boolean z3, List list2, List list3, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, long j, int i8, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list, i, i2, i3, superdispatchkeyevent, i4, i5, z, i6, getmediaitem, getmediaitem2, f, i7, z2, getinsetsignoringvisibility, withhandlersfrom, z3, (i8 & 131072) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i8 & 262144) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, topUserCompanion, buffermapproperty, j, null);
    }

    public final List<getMediaItem> onPrepare() {
        return this.onCustomAction;
    }

    public final List<getMediaItem> onPlayFromMediaId() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final TopUserCompanion getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final bufferMapProperty getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final long getOnPause() {
        return this.onPause;
    }

    @Override // kotlin.addDrmEventListener
    public final long MediaMetadataCompat() {
        long j = -1;
        return getKey.read((((long) getRemoteActionCompatParcelizer()) << 32) | (((long) getAudioAttributesCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    @Override // kotlin.addDrmEventListener
    public final int read() {
        return -getMediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean MediaBrowserCompatMediaItem() {
        getMediaItem getmediaitem = this.MediaBrowserCompatItemReceiver;
        return ((getmediaitem == null || getmediaitem.getWrite() == 0) && this.MediaBrowserCompatMediaItem == 0) ? false : true;
    }

    public final removeEventListener RemoteActionCompatParcelizer(int p0) {
        int i;
        int audioAttributesCompatParcelizer = getAudioAttributesCompatParcelizer() + getRemoteActionCompatParcelizer();
        if (this.onAddQueueItem || RatingCompat().isEmpty() || this.MediaBrowserCompatItemReceiver == null || (i = this.MediaBrowserCompatMediaItem - p0) < 0 || i >= audioAttributesCompatParcelizer) {
            return null;
        }
        float f = audioAttributesCompatParcelizer != 0 ? p0 / audioAttributesCompatParcelizer : BitmapDescriptorFactory.HUE_RED;
        float f2 = this.MediaBrowserCompatSearchResultReceiver - f;
        if (this.MediaDescriptionCompat == null || f2 >= 0.5f || f2 <= -0.5f) {
            return null;
        }
        getMediaItem getmediaitem = (getMediaItem) IntermediateLoginResponseBody.RatingCompat((List) RatingCompat());
        getMediaItem getmediaitem2 = (getMediaItem) IntermediateLoginResponseBody.MediaBrowserCompatMediaItem((List) RatingCompat());
        if (p0 < 0) {
            if (Math.min((getmediaitem.getMediaBrowserCompatMediaItem() + audioAttributesCompatParcelizer) - getMediaBrowserCompatCustomActionResultReceiver(), (getmediaitem2.getMediaBrowserCompatMediaItem() + audioAttributesCompatParcelizer) - getAudioAttributesImplApi21Parcelizer()) <= (-p0)) {
                return null;
            }
        } else if (Math.min(getMediaBrowserCompatCustomActionResultReceiver() - getmediaitem.getMediaBrowserCompatMediaItem(), getAudioAttributesImplApi21Parcelizer() - getmediaitem2.getMediaBrowserCompatMediaItem()) <= p0) {
            return null;
        }
        List<getMediaItem> listRatingCompat = RatingCompat();
        int size = listRatingCompat.size();
        for (int i2 = 0; i2 < size; i2++) {
            listRatingCompat.get(i2).write(p0);
        }
        List<getMediaItem> list = this.onCustomAction;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            list.get(i3).write(p0);
        }
        List<getMediaItem> list2 = this.handleMediaPlayPauseIfPendingOnHandler;
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            list2.get(i4).write(p0);
        }
        return new removeEventListener(RatingCompat(), getAudioAttributesCompatParcelizer(), getRemoteActionCompatParcelizer(), getRead(), getIconCompatParcelizer(), getMediaBrowserCompatCustomActionResultReceiver(), getAudioAttributesImplApi21Parcelizer(), getAudioAttributesImplBaseParcelizer(), getAudioAttributesImplApi26Parcelizer(), this.MediaBrowserCompatItemReceiver, this.MediaDescriptionCompat, this.MediaBrowserCompatSearchResultReceiver - f, this.MediaBrowserCompatMediaItem - p0, this.MediaMetadataCompat || p0 > 0, getRatingCompat(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onAddQueueItem, this.onCustomAction, this.handleMediaPlayPauseIfPendingOnHandler, this.onCommand, this.onPlayFromMediaId, this.onPause, null);
    }

    public /* synthetic */ removeEventListener(List list, int i, int i2, int i3, superDispatchKeyEvent superdispatchkeyevent, int i4, int i5, boolean z, int i6, getMediaItem getmediaitem, getMediaItem getmediaitem2, float f, int i7, boolean z2, getInsetsIgnoringVisibility getinsetsignoringvisibility, withHandlersFrom withhandlersfrom, boolean z3, List list2, List list3, TopUserCompanion topUserCompanion, bufferMapProperty buffermapproperty, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list, i, i2, i3, superdispatchkeyevent, i4, i5, z, i6, getmediaitem, getmediaitem2, f, i7, z2, getinsetsignoringvisibility, withhandlersfrom, z3, list2, list3, topUserCompanion, buffermapproperty, j);
    }

    @Override // kotlin.withHandlersFrom
    public final Map<weirdNumberException, Integer> AudioAttributesImplApi26Parcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onAddQueueItem */
    public final int getAudioAttributesCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getAudioAttributesCompatParcelizer();
    }

    @Override // kotlin.withHandlersFrom
    public final getAnswerMap<JsonNode, getShowPopup> onPause() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPause();
    }

    @Override // kotlin.withHandlersFrom
    /* JADX INFO: renamed from: onFastForward */
    public final int getRemoteActionCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.getRemoteActionCompatParcelizer();
    }

    @Override // kotlin.withHandlersFrom
    public final void onMediaButtonEvent() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onMediaButtonEvent();
    }
}
