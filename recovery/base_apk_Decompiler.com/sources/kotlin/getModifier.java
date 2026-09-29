package kotlin;

import android.content.Context;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001bJ\r\u0010!\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\u001bJ\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020#H\u0002¢\u0006\u0004\b \u0010$J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020%¢\u0006\u0004\b\u001c\u0010&R\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010(R\u0016\u0010\u001c\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010*R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010*R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010*R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010*R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010*R\u001a\u0010\u000e\u001a\u00020\u000b*\u0004\u0018\u00010\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010+R\u001a\u0010\u0013\u001a\u00020\u000b*\u0004\u0018\u00010\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010+"}, d2 = {"Lo/getModifier;", "", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;I)V", "", "read", "()V", "", "onMediaButtonEvent", "()Z", "RatingCompat", "MediaBrowserCompatSearchResultReceiver", "onCommand", "handleMediaPlayPauseIfPendingOnHandler", "MediaMetadataCompat", "MediaDescriptionCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCustomAction", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatMediaItem", "onAddQueueItem", "Landroid/widget/EdgeEffect;", "AudioAttributesImplApi26Parcelizer", "()Landroid/widget/EdgeEffect;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "write", "RemoteActionCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/superDispatchKeyEvent;", "(Lo/superDispatchKeyEvent;)Landroid/widget/EdgeEffect;", "Lo/getKey;", "(J)V", "Landroid/content/Context;", "I", "J", "Landroid/widget/EdgeEffect;", "(Landroid/widget/EdgeEffect;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getModifier {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private EdgeEffect MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long IconCompatParcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private EdgeEffect read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private EdgeEffect AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private EdgeEffect MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private EdgeEffect MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private EdgeEffect AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private EdgeEffect AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private EdgeEffect AudioAttributesImplApi26Parcelizer;
    private final Context write;

    public getModifier(Context context, int i) {
        this.write = context;
        this.RemoteActionCompatParcelizer = i;
    }

    public final void read() {
        EdgeEffect edgeEffect = this.read;
        if (edgeEffect != null) {
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.AudioAttributesCompatParcelizer;
        if (edgeEffect2 != null) {
            edgeEffect2.finish();
        }
        EdgeEffect edgeEffect3 = this.AudioAttributesImplBaseParcelizer;
        if (edgeEffect3 != null) {
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (edgeEffect4 != null) {
            edgeEffect4.finish();
        }
        EdgeEffect edgeEffect5 = this.AudioAttributesImplApi21Parcelizer;
        if (edgeEffect5 != null) {
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.AudioAttributesImplApi26Parcelizer;
        if (edgeEffect6 != null) {
            edgeEffect6.finish();
        }
        EdgeEffect edgeEffect7 = this.MediaBrowserCompatItemReceiver;
        if (edgeEffect7 != null) {
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.MediaBrowserCompatMediaItem;
        if (edgeEffect8 != null) {
            edgeEffect8.finish();
        }
    }

    public final boolean onMediaButtonEvent() {
        return AudioAttributesCompatParcelizer(this.read);
    }

    public final boolean RatingCompat() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
    }

    public final boolean onCommand() {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
    }

    public final boolean MediaMetadataCompat() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    public final boolean MediaDescriptionCompat() {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
    }

    private final boolean AudioAttributesCompatParcelizer(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(getLifecycleOwner.INSTANCE.write(edgeEffect) == BitmapDescriptorFactory.HUE_RED);
    }

    public final boolean onCustomAction() {
        return write(this.read);
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return write(this.AudioAttributesCompatParcelizer);
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return write(this.AudioAttributesImplBaseParcelizer);
    }

    public final boolean onAddQueueItem() {
        return write(this.MediaBrowserCompatCustomActionResultReceiver);
    }

    private final boolean write(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public final EdgeEffect AudioAttributesImplApi26Parcelizer() {
        EdgeEffect edgeEffect = this.read;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.write);
        this.read = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect IconCompatParcelizer() {
        EdgeEffect edgeEffect = this.AudioAttributesCompatParcelizer;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.write);
        this.AudioAttributesCompatParcelizer = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect AudioAttributesCompatParcelizer() {
        EdgeEffect edgeEffect = this.AudioAttributesImplBaseParcelizer;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect AudioAttributesImplApi21Parcelizer() {
        EdgeEffect edgeEffect = this.MediaBrowserCompatCustomActionResultReceiver;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect AudioAttributesImplBaseParcelizer() {
        EdgeEffect edgeEffect = this.AudioAttributesImplApi21Parcelizer;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.write);
        this.AudioAttributesImplApi21Parcelizer = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect write() {
        EdgeEffect edgeEffect = this.AudioAttributesImplApi26Parcelizer;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.write);
        this.AudioAttributesImplApi26Parcelizer = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect RemoteActionCompatParcelizer() {
        EdgeEffect edgeEffect = this.MediaBrowserCompatItemReceiver;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatItemReceiver = edgeEffectWrite;
        return edgeEffectWrite;
    }

    public final EdgeEffect MediaBrowserCompatCustomActionResultReceiver() {
        EdgeEffect edgeEffect = this.MediaBrowserCompatMediaItem;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectWrite = write(superDispatchKeyEvent.AudioAttributesCompatParcelizer);
        this.MediaBrowserCompatMediaItem = edgeEffectWrite;
        return edgeEffectWrite;
    }

    private final EdgeEffect write(superDispatchKeyEvent p0) {
        EdgeEffect edgeEffectAudioAttributesCompatParcelizer = getLifecycleOwner.INSTANCE.AudioAttributesCompatParcelizer(this.write);
        edgeEffectAudioAttributesCompatParcelizer.setColor(this.RemoteActionCompatParcelizer);
        if (!getKey.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, getKey.INSTANCE.RemoteActionCompatParcelizer())) {
            if (p0 == superDispatchKeyEvent.write) {
                long j = this.IconCompatParcelizer;
                edgeEffectAudioAttributesCompatParcelizer.setSize((int) (j >> 32), (int) j);
                return edgeEffectAudioAttributesCompatParcelizer;
            }
            long j2 = this.IconCompatParcelizer;
            long j3 = -1;
            edgeEffectAudioAttributesCompatParcelizer.setSize((int) (((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32))) & j2), (int) (j2 >> 32));
        }
        return edgeEffectAudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(long p0) {
        this.IconCompatParcelizer = p0;
        EdgeEffect edgeEffect = this.read;
        if (edgeEffect != null) {
            edgeEffect.setSize((int) (p0 >> 32), (int) p0);
        }
        EdgeEffect edgeEffect2 = this.AudioAttributesCompatParcelizer;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize((int) (p0 >> 32), (int) p0);
        }
        EdgeEffect edgeEffect3 = this.AudioAttributesImplBaseParcelizer;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize((int) p0, (int) (p0 >> 32));
        }
        EdgeEffect edgeEffect4 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize((int) p0, (int) (p0 >> 32));
        }
        EdgeEffect edgeEffect5 = this.AudioAttributesImplApi21Parcelizer;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize((int) (p0 >> 32), (int) p0);
        }
        EdgeEffect edgeEffect6 = this.AudioAttributesImplApi26Parcelizer;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize((int) (p0 >> 32), (int) p0);
        }
        EdgeEffect edgeEffect7 = this.MediaBrowserCompatItemReceiver;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize((int) p0, (int) (p0 >> 32));
        }
        EdgeEffect edgeEffect8 = this.MediaBrowserCompatMediaItem;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize((int) p0, (int) (p0 >> 32));
        }
    }
}
