package kotlin;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u0012\u0010\u001dJ!\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010\u0015J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u001f\u0010\u0012\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0012\u0010\"J\u001f\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020#2\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010$J9\u0010\u0012\u001a\u00020\u000b2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b\u0012\u0010%J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020&H\u0016¢\u0006\u0004\b\u0019\u0010'J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020&H\u0016¢\u0006\u0004\b\u0012\u0010'J\u000f\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0011\u0010\u0019\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b\u0019\u0010)J\u000f\u0010*\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R,\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00100R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00101R\u0016\u0010\u0016\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0014\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u00107R$\u0010*\u001a\u00020\u00182\u0006\u0010\u0004\u001a\u00020\u00188\u0002@CX\u0082\u000e¢\u0006\f\n\u0004\b(\u00105\"\u0004\b\u0019\u00108R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010=\u001a\u00020H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bI\u00103R\u0018\u0010.\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010E\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u00105R\u0016\u0010K\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u00105R\u0016\u0010M\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u00105R\"\u00106\u001a\u00020N8\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010O\u001a\u0004\b\u001c\u0010P\"\u0004\b,\u0010QR\u001c\u0010R\u001a\u00020\u00188\u0016@\u0017X\u0097\u000e¢\u0006\f\n\u0004\bG\u00105\"\u0004\b \u00108R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u000b0S8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010UR\u0014\u0010I\u001a\u00020&8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010)"}, d2 = {"Lo/serializerInstance;", "Lo/_reportUnkownFormat;", "Lo/getGenericSignature;", "Lo/hasAnyGetter;", "p0", "Lo/buf;", "p1", "Landroidx/compose/ui/platform/AndroidComposeView;", "p2", "Lkotlin/Function2;", "Lo/JsonParserDelegate;", "", "p3", "Lkotlin/Function0;", "p4", "<init>", "(Lo/hasAnyGetter;Lo/buf;Landroidx/compose/ui/platform/AndroidComposeView;Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;)V", "Lo/resolveAbstractType;", "IconCompatParcelizer", "(Lo/resolveAbstractType;)V", "AudioAttributesImplBaseParcelizer", "()V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getReferencedType;", "", "RemoteActionCompatParcelizer", "(J)Z", "Lo/hasReferringProperties;", "write", "(J)V", "Lo/getKey;", "(Lo/JsonParserDelegate;Lo/hasAnyGetter;)V", "AudioAttributesCompatParcelizer", "invalidate", "(JZ)J", "Lo/getType;", "(Lo/getType;Z)V", "(Lo/MagicModuleSubmissionRequestBody;Lo/getCreatedOnDateMs;)V", "Lo/resetWithShared;", "([F)V", "AudioAttributesImplApi26Parcelizer", "()[F", "MediaBrowserCompatItemReceiver", "Lo/hasAnyGetter;", "read", "Lo/buf;", "onCommand", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lo/MagicModuleSubmissionRequestBody;", "Lo/getCreatedOnDateMs;", "onPause", "J", "AudioAttributesImplApi21Parcelizer", "Z", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "[F", "(Z)V", "Lo/bufferMapProperty;", "Lo/bufferMapProperty;", "MediaMetadataCompat", "Lo/tryToResolveUnresolved;", "RatingCompat", "Lo/tryToResolveUnresolved;", "MediaBrowserCompatMediaItem", "Lo/findRenameByField;", "onFastForward", "Lo/findRenameByField;", "MediaDescriptionCompat", "", "handleMediaPlayPauseIfPendingOnHandler", "I", "MediaBrowserCompatSearchResultReceiver", "Lo/findCreatorAnnotation;", "onMediaButtonEvent", "Lo/resetWithString;", "onCustomAction", "Lo/resetWithString;", "onAddQueueItem", "", "F", "()F", "(F)V", "onPlayFromMediaId", "Lkotlin/Function1;", "Lo/findSetterInfo;", "Lo/getAnswerMap;", "onPlay"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class serializerInstance implements _reportUnkownFormat, getGenericSignature {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> IconCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private float MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private hasAnyGetter write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private float[] AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private boolean onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private boolean onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final AndroidComposeView AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private resetWithString onCommand;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final buf RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean onFastForward;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private long MediaBrowserCompatCustomActionResultReceiver = getKey.read(9223372034707292159L);

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final float[] AudioAttributesImplBaseParcelizer = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private bufferMapProperty MediaMetadataCompat = bufferAnyProperty.IconCompatParcelizer$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private tryToResolveUnresolved MediaBrowserCompatMediaItem = tryToResolveUnresolved.write;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final findRenameByField MediaDescriptionCompat = new findRenameByField();

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private long RatingCompat = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean onAddQueueItem = true;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final getAnswerMap<findSetterInfo, getShowPopup> onPlay = new AnonymousClass1();

    public serializerInstance(hasAnyGetter hasanygetter, buf bufVar, AndroidComposeView androidComposeView, MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> magicModuleSubmissionRequestBody, getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.write = hasanygetter;
        this.RemoteActionCompatParcelizer = bufVar;
        this.AudioAttributesCompatParcelizer = androidComposeView;
        this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        this.read = getcreatedondatems;
    }

    private final void RemoteActionCompatParcelizer(boolean z) {
        if (z != this.MediaBrowserCompatItemReceiver) {
            this.MediaBrowserCompatItemReceiver = z;
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, z);
        }
    }

    public final void read(float f) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = f;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onPlayFromMediaId = z;
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(resolveAbstractType p0) {
        int iAudioAttributesCompatParcelizer;
        getCreatedOnDateMs<getShowPopup> getcreatedondatems;
        int remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer() | this.MediaBrowserCompatSearchResultReceiver;
        this.MediaBrowserCompatMediaItem = p0.getOnCustomAction();
        this.MediaMetadataCompat = p0.getHandleMediaPlayPauseIfPendingOnHandler();
        int i = remoteActionCompatParcelizer & 4096;
        if (i != 0) {
            this.RatingCompat = p0.getRatingCompat();
        }
        if ((remoteActionCompatParcelizer & 1) != 0) {
            this.write.AudioAttributesImplApi26Parcelizer(p0.getIconCompatParcelizer());
        }
        if ((remoteActionCompatParcelizer & 2) != 0) {
            this.write.AudioAttributesImplApi21Parcelizer(p0.getWrite());
        }
        if ((remoteActionCompatParcelizer & 4) != 0) {
            this.write.write(p0.getAudioAttributesCompatParcelizer());
        }
        if ((remoteActionCompatParcelizer & 8) != 0) {
            this.write.MediaBrowserCompatItemReceiver(p0.getRead());
        }
        if ((remoteActionCompatParcelizer & 16) != 0) {
            this.write.AudioAttributesImplBaseParcelizer(p0.getMediaBrowserCompatCustomActionResultReceiver());
        }
        if ((remoteActionCompatParcelizer & 32) != 0) {
            this.write.MediaBrowserCompatCustomActionResultReceiver(p0.getMediaBrowserCompatItemReceiver());
            if (p0.getMediaBrowserCompatItemReceiver() > BitmapDescriptorFactory.HUE_RED && !this.onFastForward && (getcreatedondatems = this.read) != null) {
                getcreatedondatems.invoke();
            }
        }
        if ((remoteActionCompatParcelizer & 64) != 0) {
            this.write.IconCompatParcelizer(p0.getAudioAttributesImplApi26Parcelizer());
        }
        if ((remoteActionCompatParcelizer & 128) != 0) {
            this.write.RemoteActionCompatParcelizer(p0.getAudioAttributesImplBaseParcelizer());
        }
        if ((remoteActionCompatParcelizer & 1024) != 0) {
            this.write.AudioAttributesCompatParcelizer(p0.getMediaMetadataCompat());
        }
        if ((remoteActionCompatParcelizer & 256) != 0) {
            this.write.RemoteActionCompatParcelizer(p0.getAudioAttributesImplApi21Parcelizer());
        }
        if ((remoteActionCompatParcelizer & 512) != 0) {
            this.write.read(p0.getMediaBrowserCompatSearchResultReceiver());
        }
        if ((remoteActionCompatParcelizer & 2048) != 0) {
            this.write.IconCompatParcelizer(p0.getMediaBrowserCompatMediaItem());
        }
        boolean z = false;
        if (i != 0) {
            if (findCreatorAnnotation.IconCompatParcelizer(this.RatingCompat, findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer())) {
                this.write.write(getReferencedType.INSTANCE.read());
            } else {
                long j = -1;
                this.write.write(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(findCreatorAnnotation.read(this.RatingCompat) * ((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32)))) << 32) | (((long) Float.floatToRawIntBits(findCreatorAnnotation.write(this.RatingCompat) * ((int) this.MediaBrowserCompatCustomActionResultReceiver))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
            }
        }
        if ((remoteActionCompatParcelizer & 16384) != 0) {
            this.write.read(p0.getOnAddQueueItem());
        }
        if ((131072 & remoteActionCompatParcelizer) != 0) {
            this.write.IconCompatParcelizer(p0.getOnPlayFromMediaId());
        }
        if ((262144 & remoteActionCompatParcelizer) != 0) {
            this.write.RemoteActionCompatParcelizer(p0.getOnFastForward());
        }
        if ((524288 & remoteActionCompatParcelizer) != 0) {
            this.write.AudioAttributesCompatParcelizer(p0.getOnPlay());
        }
        if ((32768 & remoteActionCompatParcelizer) != 0) {
            hasAnyGetter hasanygetter = this.write;
            int onCommand = p0.getOnCommand();
            if (Separators.RemoteActionCompatParcelizer(onCommand, Separators.INSTANCE.AudioAttributesCompatParcelizer())) {
                iAudioAttributesCompatParcelizer = hasAnySetter.INSTANCE.write();
            } else if (Separators.RemoteActionCompatParcelizer(onCommand, Separators.INSTANCE.RemoteActionCompatParcelizer())) {
                iAudioAttributesCompatParcelizer = hasAnySetter.INSTANCE.AudioAttributesCompatParcelizer();
            } else {
                if (!Separators.RemoteActionCompatParcelizer(onCommand, Separators.INSTANCE.IconCompatParcelizer())) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
                iAudioAttributesCompatParcelizer = hasAnySetter.INSTANCE.read();
            }
            hasanygetter.read(iAudioAttributesCompatParcelizer);
        }
        if ((remoteActionCompatParcelizer & 7963) != 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = true;
            this.onCustomAction = true;
        }
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCommand, p0.getOnPlayFromUri())) {
            this.onCommand = p0.getOnPlayFromUri();
            MediaBrowserCompatCustomActionResultReceiver();
            z = true;
        }
        this.MediaBrowserCompatSearchResultReceiver = p0.getRemoteActionCompatParcelizer();
        if (remoteActionCompatParcelizer != 0 || z) {
            AudioAttributesImplBaseParcelizer();
            if (this.AudioAttributesCompatParcelizer.getOnSkipToPrevious()) {
                this.AudioAttributesCompatParcelizer.write(getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            }
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        getFormat.INSTANCE.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        getCreatedOnDateMs<getShowPopup> getcreatedondatems;
        resetWithString resetwithstring = this.onCommand;
        if (resetwithstring != null) {
            findWrapperName.IconCompatParcelizer(this.write, resetwithstring);
            if (!(resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer) || Build.VERSION.SDK_INT >= 33 || (getcreatedondatems = this.read) == null) {
                return;
            }
            getcreatedondatems.invoke();
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final void write(long p0) {
        if (this.AudioAttributesCompatParcelizer.getOnSkipToPrevious()) {
            this.AudioAttributesCompatParcelizer.write(_loadMore.INSTANCE.write());
        }
        this.write.AudioAttributesCompatParcelizer(p0);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(long p0) {
        if (getKey.AudioAttributesCompatParcelizer(p0, this.MediaBrowserCompatCustomActionResultReceiver)) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer.getOnSkipToPrevious()) {
            this.AudioAttributesCompatParcelizer.write(_loadMore.INSTANCE.write());
        }
        this.MediaBrowserCompatCustomActionResultReceiver = p0;
        invalidate();
    }

    @Override // kotlin._reportUnkownFormat
    public final void RemoteActionCompatParcelizer(JsonParserDelegate p0, hasAnyGetter p1) {
        AudioAttributesCompatParcelizer();
        this.onFastForward = this.write.MediaMetadataCompat() > BitmapDescriptorFactory.HUE_RED;
        findSerializationTyping iconCompatParcelizer = this.MediaDescriptionCompat.getIconCompatParcelizer();
        iconCompatParcelizer.AudioAttributesCompatParcelizer(p0);
        iconCompatParcelizer.write(p1);
        findWrapperName.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, this.write);
    }

    @Override // kotlin._reportUnkownFormat
    public final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.getOnSkipToPrevious() && getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() != BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesCompatParcelizer.write(getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        }
        if (this.MediaBrowserCompatItemReceiver) {
            if (!findCreatorAnnotation.IconCompatParcelizer(this.RatingCompat, findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer()) && !getKey.AudioAttributesCompatParcelizer(this.write.getOnPause(), this.MediaBrowserCompatCustomActionResultReceiver)) {
                long j = -1;
                this.write.write(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(findCreatorAnnotation.read(this.RatingCompat) * ((int) (this.MediaBrowserCompatCustomActionResultReceiver >> 32)))) << 32) | (((long) Float.floatToRawIntBits(findCreatorAnnotation.write(this.RatingCompat) * ((int) this.MediaBrowserCompatCustomActionResultReceiver))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
            }
            this.write.RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatCustomActionResultReceiver, this.onPlay);
            RemoteActionCompatParcelizer(false);
        }
    }

    /* JADX INFO: renamed from: o.serializerInstance$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "RemoteActionCompatParcelizer", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            RemoteActionCompatParcelizer(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(findSetterInfo findsetterinfo) {
            serializerInstance serializerinstance = serializerInstance.this;
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
            MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = serializerinstance.IconCompatParcelizer;
            if (magicModuleSubmissionRequestBody != null) {
                magicModuleSubmissionRequestBody.invoke(jsonParserDelegateIconCompatParcelizer, findsetterinfo.getIconCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
            }
        }

        AnonymousClass1() {
            super(1);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final void invalidate() {
        if (this.MediaBrowserCompatItemReceiver || this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer.invalidate();
        RemoteActionCompatParcelizer(true);
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer() {
        read(BitmapDescriptorFactory.HUE_RED);
        AudioAttributesCompatParcelizer(false);
        this.IconCompatParcelizer = null;
        this.read = null;
        this.AudioAttributesImplApi21Parcelizer = true;
        RemoteActionCompatParcelizer(false);
        buf bufVar = this.RemoteActionCompatParcelizer;
        if (bufVar != null) {
            bufVar.RemoteActionCompatParcelizer(this.write);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final long IconCompatParcelizer(long p0, boolean p1) {
        float[] fArrAudioAttributesImplApi26Parcelizer;
        if (p1) {
            fArrAudioAttributesImplApi26Parcelizer = RemoteActionCompatParcelizer();
            if (fArrAudioAttributesImplApi26Parcelizer == null) {
                return getReferencedType.INSTANCE.RemoteActionCompatParcelizer();
            }
        } else {
            fArrAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        }
        return this.onAddQueueItem ? p0 : resetWithShared.AudioAttributesCompatParcelizer(fArrAudioAttributesImplApi26Parcelizer, p0);
    }

    @Override // kotlin._reportUnkownFormat
    public final void write(getType p0, boolean p1) {
        float[] fArrRemoteActionCompatParcelizer = p1 ? RemoteActionCompatParcelizer() : AudioAttributesImplApi26Parcelizer();
        if (this.onAddQueueItem) {
            return;
        }
        if (fArrRemoteActionCompatParcelizer == null) {
            p0.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        } else {
            resetWithShared.write(fArrRemoteActionCompatParcelizer, p0);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(MagicModuleSubmissionRequestBody<? super JsonParserDelegate, ? super hasAnyGetter, getShowPopup> p0, getCreatedOnDateMs<getShowPopup> p1) {
        buf bufVar = this.RemoteActionCompatParcelizer;
        if (bufVar != null) {
            if (!this.write.getHandleMediaPlayPauseIfPendingOnHandler()) {
                reportWrongTokenException.AudioAttributesCompatParcelizer("layer should have been released before reuse");
            }
            this.write = bufVar.IconCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = false;
            this.IconCompatParcelizer = p0;
            this.read = p1;
            this.handleMediaPlayPauseIfPendingOnHandler = false;
            this.onCustomAction = false;
            this.onAddQueueItem = true;
            resetWithShared.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            float[] fArr = this.AudioAttributesImplApi26Parcelizer;
            if (fArr != null) {
                resetWithShared.RemoteActionCompatParcelizer(fArr);
            }
            this.RatingCompat = findCreatorAnnotation.INSTANCE.AudioAttributesCompatParcelizer();
            this.onFastForward = false;
            this.MediaBrowserCompatCustomActionResultReceiver = getKey.read(9223372034707292159L);
            this.onCommand = null;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            return;
        }
        reportWrongTokenException.write("currently reuse is only supported when we manage the layer lifecycle");
        throw new PlanDetailsCreator();
    }

    @Override // kotlin._reportUnkownFormat
    public final void RemoteActionCompatParcelizer(float[] p0) {
        resetWithShared.RemoteActionCompatParcelizer(p0, AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin._reportUnkownFormat
    public final void IconCompatParcelizer(float[] p0) {
        float[] fArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (fArrRemoteActionCompatParcelizer != null) {
            resetWithShared.RemoteActionCompatParcelizer(p0, fArrRemoteActionCompatParcelizer);
        }
    }

    private final float[] AudioAttributesImplApi26Parcelizer() {
        MediaBrowserCompatItemReceiver();
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin._reportUnkownFormat
    public final float[] read() {
        return AudioAttributesImplApi26Parcelizer();
    }

    private final float[] RemoteActionCompatParcelizer() {
        float[] fArrRemoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (fArrRemoteActionCompatParcelizer == null) {
            fArrRemoteActionCompatParcelizer = resetWithShared.RemoteActionCompatParcelizer(null, 1, null);
            this.AudioAttributesImplApi26Parcelizer = fArrRemoteActionCompatParcelizer;
        }
        if (!this.onCustomAction) {
            if (Float.isNaN(fArrRemoteActionCompatParcelizer[0])) {
                return null;
            }
        } else {
            this.onCustomAction = false;
            float[] fArrAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (this.onAddQueueItem) {
                return fArrAudioAttributesImplApi26Parcelizer;
            }
            if (!contentConverter.AudioAttributesCompatParcelizer(fArrAudioAttributesImplApi26Parcelizer, fArrRemoteActionCompatParcelizer)) {
                fArrRemoteActionCompatParcelizer[0] = Float.NaN;
                return null;
            }
        }
        return fArrRemoteActionCompatParcelizer;
    }

    private final void MediaBrowserCompatItemReceiver() {
        long onPrepareFromSearch;
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            hasAnyGetter hasanygetter = this.write;
            if ((hasanygetter.getOnPrepareFromSearch() & 9223372034707292159L) == 9205357640488583168L) {
                onPrepareFromSearch = allocCharBuffer.AudioAttributesCompatParcelizer(SetterlessProperty.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
            } else {
                onPrepareFromSearch = hasanygetter.getOnPrepareFromSearch();
            }
            resetWithShared.AudioAttributesCompatParcelizer$default(this.AudioAttributesImplBaseParcelizer, Float.intBitsToFloat((int) (onPrepareFromSearch >> 32)), Float.intBitsToFloat((int) onPrepareFromSearch), hasanygetter.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), hasanygetter.handleMediaPlayPauseIfPendingOnHandler(), BitmapDescriptorFactory.HUE_RED, hasanygetter.MediaBrowserCompatItemReceiver(), hasanygetter.AudioAttributesImplBaseParcelizer(), hasanygetter.RatingCompat(), hasanygetter.MediaBrowserCompatSearchResultReceiver(), hasanygetter.MediaDescriptionCompat(), BitmapDescriptorFactory.HUE_RED, 1040, null);
            this.handleMediaPlayPauseIfPendingOnHandler = false;
            this.onAddQueueItem = getTextBuffer.write(this.AudioAttributesImplBaseParcelizer);
        }
    }

    @Override // kotlin._reportUnkownFormat
    public final boolean RemoteActionCompatParcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        if (this.write.getOnSetRating()) {
            return getAccessorNaming.IconCompatParcelizer$default(this.write.AudioAttributesImplApi26Parcelizer(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }
}
