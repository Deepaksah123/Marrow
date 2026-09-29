package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\u0018\u0000 #2\u00020\u0001:\u0001#B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u001f\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b\u001f\u0010\"R\u001a\u0010!\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b#\u0010&R\u001a\u0010$\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001c\u00100\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010*\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b*\u00101R\u001a\u00102\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b2\u0010)R\u001a\u0010'\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b.\u0010)R\u001c\u0010.\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b'\u00101R\u001a\u00104\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b4\u00107R\u001a\u00108\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:"}, d2 = {"Lo/getCurrentPositionUsInternal;", "", "Lo/getPlatform;", "p0", "Lo/maskWindowPositionMsOrGetPeriodPositionUs;", "p1", "Lo/lambdaupdatePlaybackInfo13;", "p2", "Landroid/graphics/Bitmap$Config;", "p3", "", "p4", "p5", "Landroid/graphics/drawable/Drawable;", "p6", "p7", "p8", "Lo/getPlayWhenReadyChangeReason;", "p9", "p10", "p11", "<init>", "(Lo/getPlatform;Lo/maskWindowPositionMsOrGetPeriodPositionUs;Lo/lambdaupdatePlaybackInfo13;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lo/getPlayWhenReadyChangeReason;Lo/getPlayWhenReadyChangeReason;Lo/getPlayWhenReadyChangeReason;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Z", "IconCompatParcelizer", "()Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "AudioAttributesImplBaseParcelizer", "Lo/getPlayWhenReadyChangeReason;", "()Lo/getPlayWhenReadyChangeReason;", "MediaBrowserCompatItemReceiver", "Lo/getPlatform;", "write", "()Lo/getPlatform;", "AudioAttributesImplApi26Parcelizer", "Landroid/graphics/drawable/Drawable;", "AudioAttributesImplApi21Parcelizer", "()Landroid/graphics/drawable/Drawable;", "MediaBrowserCompatCustomActionResultReceiver", "RatingCompat", "MediaDescriptionCompat", "MediaMetadataCompat", "Lo/lambdaupdatePlaybackInfo13;", "()Lo/lambdaupdatePlaybackInfo13;", "MediaBrowserCompatMediaItem", "Lo/maskWindowPositionMsOrGetPeriodPositionUs;", "()Lo/maskWindowPositionMsOrGetPeriodPositionUs;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getCurrentPositionUsInternal {
    public static final getCurrentPositionUsInternal write = new getCurrentPositionUsInternal(null, null, null, null, false, false, null, null, null, null, null, null, UnixStat.PERM_MASK, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final getPlayWhenReadyChangeReason MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final Drawable AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getPlayWhenReadyChangeReason AudioAttributesCompatParcelizer;
    private final Bitmap.Config IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Drawable MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final getPlatform write;
    private final maskWindowPositionMsOrGetPeriodPositionUs MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final Drawable AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final lambdaupdatePlaybackInfo13 MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getPlayWhenReadyChangeReason AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    private getCurrentPositionUsInternal(getPlatform getplatform, maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus, lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, getPlayWhenReadyChangeReason getplaywhenreadychangereason, getPlayWhenReadyChangeReason getplaywhenreadychangereason2, getPlayWhenReadyChangeReason getplaywhenreadychangereason3) {
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(maskwindowpositionmsorgetperiodpositionus, "");
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo13, "");
        toMagicModuleMetaRepoModel.write(config, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason2, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason3, "");
        this.write = getplatform;
        this.MediaBrowserCompatMediaItem = maskwindowpositionmsorgetperiodpositionus;
        this.MediaDescriptionCompat = lambdaupdateplaybackinfo13;
        this.IconCompatParcelizer = config;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.AudioAttributesImplApi26Parcelizer = drawable;
        this.AudioAttributesImplApi21Parcelizer = drawable2;
        this.MediaBrowserCompatItemReceiver = drawable3;
        this.MediaBrowserCompatCustomActionResultReceiver = getplaywhenreadychangereason;
        this.AudioAttributesCompatParcelizer = getplaywhenreadychangereason2;
        this.AudioAttributesImplBaseParcelizer = getplaywhenreadychangereason3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ getCurrentPositionUsInternal(getPlatform getplatform, maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus, lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo13, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, getPlayWhenReadyChangeReason getplaywhenreadychangereason, getPlayWhenReadyChangeReason getplaywhenreadychangereason2, getPlayWhenReadyChangeReason getplaywhenreadychangereason3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        getPlatform getplatformWrite;
        Bitmap.Config configRemoteActionCompatParcelizer;
        if ((i & 1) != 0) {
            setMbbsVerificationYear setmbbsverificationyear = setMbbsVerificationYear.INSTANCE;
            getplatformWrite = setMbbsVerificationYear.write();
        } else {
            getplatformWrite = getplatform;
        }
        maskWindowPositionMsOrGetPeriodPositionUs maskwindowpositionmsorgetperiodpositionus2 = (i & 2) != 0 ? maskWindowPositionMsOrGetPeriodPositionUs.write : maskwindowpositionmsorgetperiodpositionus;
        lambdaupdatePlaybackInfo13 lambdaupdateplaybackinfo132 = (i & 4) != 0 ? lambdaupdatePlaybackInfo13.AUTOMATIC : lambdaupdateplaybackinfo13;
        if ((i & 8) != 0) {
            stopInternal stopinternal = stopInternal.INSTANCE;
            configRemoteActionCompatParcelizer = stopInternal.RemoteActionCompatParcelizer();
        } else {
            configRemoteActionCompatParcelizer = config;
        }
        this(getplatformWrite, maskwindowpositionmsorgetperiodpositionus2, lambdaupdateplaybackinfo132, configRemoteActionCompatParcelizer, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : drawable, (i & 128) != 0 ? null : drawable2, (i & 256) == 0 ? drawable3 : null, (i & 512) != 0 ? getPlayWhenReadyChangeReason.ENABLED : getplaywhenreadychangereason, (i & 1024) != 0 ? getPlayWhenReadyChangeReason.ENABLED : getplaywhenreadychangereason2, (i & 2048) != 0 ? getPlayWhenReadyChangeReason.ENABLED : getplaywhenreadychangereason3);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final getPlatform getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final maskWindowPositionMsOrGetPeriodPositionUs getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final lambdaupdatePlaybackInfo13 getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Bitmap.Config getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final Drawable getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Drawable getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final Drawable getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final getPlayWhenReadyChangeReason getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final getPlayWhenReadyChangeReason getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final getPlayWhenReadyChangeReason getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getCurrentPositionUsInternal)) {
            return false;
        }
        getCurrentPositionUsInternal getcurrentpositionusinternal = (getCurrentPositionUsInternal) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getcurrentpositionusinternal.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, getcurrentpositionusinternal.MediaBrowserCompatMediaItem) && this.MediaDescriptionCompat == getcurrentpositionusinternal.MediaDescriptionCompat && this.IconCompatParcelizer == getcurrentpositionusinternal.IconCompatParcelizer && this.RemoteActionCompatParcelizer == getcurrentpositionusinternal.RemoteActionCompatParcelizer && this.read == getcurrentpositionusinternal.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, getcurrentpositionusinternal.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, getcurrentpositionusinternal.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, getcurrentpositionusinternal.MediaBrowserCompatItemReceiver) && this.MediaBrowserCompatCustomActionResultReceiver == getcurrentpositionusinternal.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesCompatParcelizer == getcurrentpositionusinternal.AudioAttributesCompatParcelizer && this.AudioAttributesImplBaseParcelizer == getcurrentpositionusinternal.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode3 = this.MediaDescriptionCompat.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode6 = Boolean.hashCode(this.read);
        Drawable drawable = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode7 = drawable == null ? 0 : drawable.hashCode();
        Drawable drawable2 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode8 = drawable2 == null ? 0 : drawable2.hashCode();
        Drawable drawable3 = this.MediaBrowserCompatItemReceiver;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultRequestOptions(dispatcher=");
        sb.append(this.write);
        sb.append(", transition=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", precision=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", bitmapConfig=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", allowHardware=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", allowRgb565=");
        sb.append(this.read);
        sb.append(", placeholder=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", error=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", fallback=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", memoryCachePolicy=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", diskCachePolicy=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", networkCachePolicy=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }

    public getCurrentPositionUsInternal() {
        this(null, null, null, null, false, false, null, null, null, null, null, null, UnixStat.PERM_MASK, null);
    }
}
