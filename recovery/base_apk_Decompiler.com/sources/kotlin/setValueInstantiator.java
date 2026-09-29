package kotlin;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b-\b\u0002\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001a\u00101\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u001a\u00106\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b&\u00105R\u001a\u00109\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00107\u001a\u0004\b+\u00108R\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010'\u001a\u0004\b:\u0010)R\u001c\u0010>\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\b%\u0010=R\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b*\u0010)R\u001a\u0010/\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010:\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bC\u0010BR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b9\u0010)R\u001a\u0010A\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\b6\u0010ER\u001a\u0010C\u001a\u00020\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010D\u001a\u0004\bG\u0010ER\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b1\u0010)R\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b>\u0010)R\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010'\u001a\u0004\b-\u0010)R\u001a\u0010F\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010'\u001a\u0004\b;\u0010)R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010H\u001a\u0004\b?\u0010IR\u001c\u0010J\u001a\u0004\u0018\u00010\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bF\u0010I"}, d2 = {"Lo/setValueInstantiator;", "", "", "p0", "", "p1", "p2", "Landroid/text/TextPaint;", "p3", "p4", "Landroid/text/TextDirectionHeuristic;", "p5", "Landroid/text/Layout$Alignment;", "p6", "p7", "Landroid/text/TextUtils$TruncateAt;", "p8", "p9", "", "p10", "p11", "p12", "", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "<init>", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZIIII[I[I)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "read", "onCommand", "I", "onCustomAction", "()I", "write", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "RatingCompat", "Landroid/text/TextPaint;", "MediaBrowserCompatMediaItem", "()Landroid/text/TextPaint;", "IconCompatParcelizer", "onMediaButtonEvent", "onPlayFromMediaId", "Landroid/text/TextDirectionHeuristic;", "()Landroid/text/TextDirectionHeuristic;", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/text/Layout$Alignment;", "()Landroid/text/Layout$Alignment;", "AudioAttributesImplApi21Parcelizer", "MediaDescriptionCompat", "AudioAttributesImplApi26Parcelizer", "Landroid/text/TextUtils$TruncateAt;", "()Landroid/text/TextUtils$TruncateAt;", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "F", "MediaBrowserCompatSearchResultReceiver", "()F", "MediaMetadataCompat", "Z", "()Z", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "[I", "()[I", "onPause"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setValueInstantiator {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final TextUtils.TruncateAt MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Layout.Alignment AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private final float MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int onCommand;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final CharSequence read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final float MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final TextPaint IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final int[] onPause;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final TextDirectionHeuristic MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    public setValueInstantiator(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i4, TextUtils.TruncateAt truncateAt, int i5, float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.read = charSequence;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = textPaint;
        this.AudioAttributesCompatParcelizer = i3;
        this.MediaBrowserCompatCustomActionResultReceiver = textDirectionHeuristic;
        this.AudioAttributesImplApi21Parcelizer = alignment;
        this.AudioAttributesImplApi26Parcelizer = i4;
        this.MediaBrowserCompatItemReceiver = truncateAt;
        this.AudioAttributesImplBaseParcelizer = i5;
        this.MediaBrowserCompatMediaItem = f;
        this.MediaDescriptionCompat = f2;
        this.RatingCompat = i6;
        this.MediaBrowserCompatSearchResultReceiver = z;
        this.MediaMetadataCompat = z2;
        this.onCustomAction = i7;
        this.onAddQueueItem = i8;
        this.onCommand = i9;
        this.handleMediaPlayPauseIfPendingOnHandler = i10;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = iArr;
        this.onPause = iArr2;
        if (i < 0 || i > i2) {
            withStackTrace.read("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            withStackTrace.read("invalid end value");
        }
        if (i4 < 0) {
            withStackTrace.read("invalid maxLines value");
        }
        if (i3 < 0) {
            withStackTrace.read("invalid width value");
        }
        if (i5 < 0) {
            withStackTrace.read("invalid ellipsizedWidth value");
        }
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        withStackTrace.read("invalid lineSpacingMultiplier value");
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final CharSequence getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final TextPaint getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final TextDirectionHeuristic getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Layout.Alignment getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final TextUtils.TruncateAt getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final float getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final float getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int[] getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final int[] getOnPause() {
        return this.onPause;
    }
}
