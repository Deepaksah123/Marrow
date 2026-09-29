package kotlin;

import android.graphics.Outline;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\r\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0015\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0010\u0010\u001cJ-\u0010\u0010\u001a\u00020\b*\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u001dR\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0018\u0010\r\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R$\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b8\u0001@BX\u0080\u000e¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010%R\u0016\u0010(\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001eR\u0018\u0010$\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010#R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010-R\u0013\u0010)\u001a\u0004\u0018\u00010\u001f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010/R\u0011\u0010'\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0019\u0010%R\u0013\u0010*\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\r\u00100R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u00101R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b,\u00101R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010\u001eR\u0018\u00105\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010#R\u0018\u00106\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b2\u0010#"}, d2 = {"Lo/JsonSerialize;", "", "<init>", "()V", "Lo/resetWithString;", "p0", "", "p1", "", "p2", "p3", "Lo/calloc;", "p4", "read", "(Lo/resetWithString;FZFJ)Z", "Lo/getReferencedType;", "IconCompatParcelizer", "(J)Z", "Lo/JsonParserDelegate;", "", "(Lo/JsonParserDelegate;)V", "write", "Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)V", "Lo/WritableTypeId;", "AudioAttributesCompatParcelizer", "(Lo/WritableTypeId;)V", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;)V", "(Lo/WritableTypeId;JJF)Z", "Z", "Landroid/graphics/Outline;", "Landroid/graphics/Outline;", "RemoteActionCompatParcelizer", "Lo/resetWithString;", "Lo/removeSoftRefsClearedByGc;", "MediaBrowserCompatItemReceiver", "()Z", "MediaBrowserCompatCustomActionResultReceiver", "MediaMetadataCompat", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "MediaDescriptionCompat", "Lo/WritableTypeId;", "AudioAttributesImplApi26Parcelizer", "F", "AudioAttributesImplBaseParcelizer", "()Landroid/graphics/Outline;", "()Lo/removeSoftRefsClearedByGc;", "J", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class JsonSerialize {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private long MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private long MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Outline RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private WritableTypeId AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private removeSoftRefsClearedByGc MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer = true;
    private resetWithString write;

    public JsonSerialize() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.RemoteActionCompatParcelizer = outline;
        this.MediaBrowserCompatMediaItem = getReferencedType.INSTANCE.write();
        this.MediaBrowserCompatSearchResultReceiver = calloc.INSTANCE.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final Outline IconCompatParcelizer() {
        write();
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.AudioAttributesCompatParcelizer) {
            return this.RemoteActionCompatParcelizer;
        }
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return !this.AudioAttributesImplApi21Parcelizer;
    }

    public final removeSoftRefsClearedByGc read() {
        write();
        return this.read;
    }

    public final boolean read(resetWithString p0, float p1, boolean p2, float p3, long p4) {
        this.RemoteActionCompatParcelizer.setAlpha(p1);
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, p0);
        if (!zRemoteActionCompatParcelizer) {
            this.write = p0;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }
        this.MediaBrowserCompatSearchResultReceiver = p4;
        boolean z = p0 != null && (p2 || p3 > BitmapDescriptorFactory.HUE_RED);
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != z) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            this.MediaBrowserCompatCustomActionResultReceiver = true;
        }
        return !zRemoteActionCompatParcelizer;
    }

    public final boolean IconCompatParcelizer(long p0) {
        resetWithString resetwithstring;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && (resetwithstring = this.write) != null) {
            return getAccessorNaming.IconCompatParcelizer(resetwithstring, Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0), this.handleMediaPlayPauseIfPendingOnHandler, this.onAddQueueItem);
        }
        return true;
    }

    public final void IconCompatParcelizer(JsonParserDelegate p0) {
        int i;
        Object obj;
        JsonParserDelegate jsonParserDelegate;
        int i2;
        removeSoftRefsClearedByGc removesoftrefsclearedbygc = read();
        if (removesoftrefsclearedbygc != null) {
            JsonParserDelegate.AudioAttributesCompatParcelizer$default(p0, removesoftrefsclearedbygc, 0, 2, null);
            return;
        }
        float f = this.AudioAttributesImplBaseParcelizer;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = this.MediaBrowserCompatItemReceiver;
            WritableTypeId writableTypeId = this.AudioAttributesImplApi26Parcelizer;
            if (removesoftrefsclearedbygcWrite == null || !IconCompatParcelizer(writableTypeId, this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatSearchResultReceiver, f)) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.MediaBrowserCompatMediaItem >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) this.MediaBrowserCompatMediaItem);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.MediaBrowserCompatMediaItem >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.MediaBrowserCompatSearchResultReceiver >> 32));
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) this.MediaBrowserCompatMediaItem);
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) this.MediaBrowserCompatSearchResultReceiver);
                float f2 = this.AudioAttributesImplBaseParcelizer;
                long j = -1;
                float f3 = fIntBitsToFloat4 + fIntBitsToFloat3;
                float f4 = fIntBitsToFloat5 + fIntBitsToFloat6;
                WritableTypeId writableTypeIdAudioAttributesCompatParcelizer = allocByteBuffer.AudioAttributesCompatParcelizer(fIntBitsToFloat, fIntBitsToFloat2, f3, f4, TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(f2)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (Float.floatToRawIntBits(f2) << 32)));
                if (removesoftrefsclearedbygcWrite == null) {
                    removesoftrefsclearedbygcWrite = writeIndentation.write();
                } else {
                    removesoftrefsclearedbygcWrite.AudioAttributesImplApi26Parcelizer();
                }
                i = 2;
                obj = null;
                removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, writableTypeIdAudioAttributesCompatParcelizer, null, 2, null);
                this.AudioAttributesImplApi26Parcelizer = writableTypeIdAudioAttributesCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = removesoftrefsclearedbygcWrite;
                jsonParserDelegate = p0;
                i2 = 0;
            } else {
                jsonParserDelegate = p0;
                i = 2;
                i2 = 0;
                obj = null;
            }
            JsonParserDelegate.AudioAttributesCompatParcelizer$default(jsonParserDelegate, removesoftrefsclearedbygcWrite, i2, i, obj);
            return;
        }
        JsonParserDelegate.IconCompatParcelizer$default(p0, Float.intBitsToFloat((int) (this.MediaBrowserCompatMediaItem >> 32)), Float.intBitsToFloat((int) this.MediaBrowserCompatMediaItem), Float.intBitsToFloat((int) (this.MediaBrowserCompatSearchResultReceiver >> 32)) + Float.intBitsToFloat((int) (this.MediaBrowserCompatMediaItem >> 32)), Float.intBitsToFloat((int) this.MediaBrowserCompatMediaItem) + Float.intBitsToFloat((int) this.MediaBrowserCompatSearchResultReceiver), 0, 16, null);
    }

    private final void write() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatMediaItem = getReferencedType.INSTANCE.write();
            this.AudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
            this.read = null;
            this.MediaBrowserCompatCustomActionResultReceiver = false;
            this.AudioAttributesImplApi21Parcelizer = false;
            resetWithString resetwithstring = this.write;
            if (resetwithstring != null && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && Float.intBitsToFloat((int) (this.MediaBrowserCompatSearchResultReceiver >> 32)) > BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) this.MediaBrowserCompatSearchResultReceiver) > BitmapDescriptorFactory.HUE_RED) {
                this.AudioAttributesCompatParcelizer = true;
                if (resetwithstring instanceof resetWithString.read) {
                    write(((resetWithString.read) resetwithstring).write());
                    return;
                } else if (resetwithstring instanceof resetWithString.RemoteActionCompatParcelizer) {
                    AudioAttributesCompatParcelizer(((resetWithString.RemoteActionCompatParcelizer) resetwithstring).getRead());
                    return;
                } else {
                    if (!(resetwithstring instanceof resetWithString.AudioAttributesCompatParcelizer)) {
                        throw new RenewEligibleCreator();
                    }
                    IconCompatParcelizer(((resetWithString.AudioAttributesCompatParcelizer) resetwithstring).getIconCompatParcelizer());
                    return;
                }
            }
            this.RemoteActionCompatParcelizer.setEmpty();
        }
    }

    private final void write(WritableTypeIdInclusion p0) {
        long j = -1;
        this.MediaBrowserCompatMediaItem = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p0.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(p0.getAudioAttributesCompatParcelizer())) << 32));
        long j2 = -1;
        this.MediaBrowserCompatSearchResultReceiver = calloc.write((((long) Float.floatToRawIntBits(p0.getWrite() - p0.getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(p0.getIconCompatParcelizer() - p0.getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        this.RemoteActionCompatParcelizer.setRect(Math.round(p0.getAudioAttributesCompatParcelizer()), Math.round(p0.getRemoteActionCompatParcelizer()), Math.round(p0.getWrite()), Math.round(p0.getIconCompatParcelizer()));
    }

    private final void AudioAttributesCompatParcelizer(WritableTypeId p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0.getWrite() >> 32));
        long j = -1;
        this.MediaBrowserCompatMediaItem = getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p0.getRemoteActionCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(p0.getIconCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        long j2 = -1;
        this.MediaBrowserCompatSearchResultReceiver = calloc.write((((long) Float.floatToRawIntBits(p0.AudioAttributesImplBaseParcelizer())) << 32) | (((long) Float.floatToRawIntBits(p0.read())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        if (allocByteBuffer.read(p0)) {
            this.RemoteActionCompatParcelizer.setRoundRect(Math.round(p0.getRemoteActionCompatParcelizer()), Math.round(p0.getIconCompatParcelizer()), Math.round(p0.getRead()), Math.round(p0.getAudioAttributesCompatParcelizer()), fIntBitsToFloat);
            this.AudioAttributesImplBaseParcelizer = fIntBitsToFloat;
            return;
        }
        removeSoftRefsClearedByGc removesoftrefsclearedbygcWrite = this.IconCompatParcelizer;
        if (removesoftrefsclearedbygcWrite == null) {
            removesoftrefsclearedbygcWrite = writeIndentation.write();
            this.IconCompatParcelizer = removesoftrefsclearedbygcWrite;
        }
        removesoftrefsclearedbygcWrite.AudioAttributesImplApi26Parcelizer();
        removeSoftRefsClearedByGc.RemoteActionCompatParcelizer$default(removesoftrefsclearedbygcWrite, p0, null, 2, null);
        IconCompatParcelizer(removesoftrefsclearedbygcWrite);
    }

    private final void IconCompatParcelizer(removeSoftRefsClearedByGc p0) {
        if (Build.VERSION.SDK_INT >= 30) {
            buildMethodName.INSTANCE.write(this.RemoteActionCompatParcelizer, p0);
        } else {
            Outline outline = this.RemoteActionCompatParcelizer;
            if (p0 instanceof getCurrentSegment) {
                outline.setConvexPath(((getCurrentSegment) p0).getRemoteActionCompatParcelizer());
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        }
        this.AudioAttributesImplApi21Parcelizer = !this.RemoteActionCompatParcelizer.canClip();
        this.read = p0;
    }

    private final boolean IconCompatParcelizer(WritableTypeId writableTypeId, long j, long j2, float f) {
        if (writableTypeId == null || !allocByteBuffer.read(writableTypeId)) {
            return false;
        }
        int i = (int) (j >> 32);
        if (writableTypeId.getRemoteActionCompatParcelizer() != Float.intBitsToFloat(i)) {
            return false;
        }
        int i2 = (int) j;
        return writableTypeId.getIconCompatParcelizer() == Float.intBitsToFloat(i2) && writableTypeId.getRead() == Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 >> 32)) && writableTypeId.getAudioAttributesCompatParcelizer() == Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) j2) && Float.intBitsToFloat((int) (writableTypeId.getWrite() >> 32)) == f;
    }
}
