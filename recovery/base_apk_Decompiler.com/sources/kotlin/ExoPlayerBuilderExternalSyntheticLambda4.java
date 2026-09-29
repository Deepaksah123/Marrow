package kotlin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010$\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010&\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010'\u001a\u0004\b \u0010(R\u001a\u0010\"\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010)\u001a\u0004\b%\u0010*R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b$\u0010,R\u001a\u0010-\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00103\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\u001a\u0010/\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b1\u00100R\u0014\u00101\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u00106R\u001a\u00108\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b-\u0010#R\u001a\u00107\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "", "Landroid/content/Context;", "p0", "Landroid/graphics/Bitmap$Config;", "p1", "Landroid/graphics/ColorSpace;", "p2", "Lo/lambdaupdatePlaybackInfo16;", "p3", "", "p4", "p5", "p6", "Lo/ShapeKt;", "p7", "Lo/lambdasetShuffleModeEnabled4;", "p8", "Lo/getPlayWhenReadyChangeReason;", "p9", "p10", "p11", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lo/lambdaupdatePlaybackInfo16;ZZZLo/ShapeKt;Lo/lambdasetShuffleModeEnabled4;Lo/getPlayWhenReadyChangeReason;Lo/getPlayWhenReadyChangeReason;Lo/getPlayWhenReadyChangeReason;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Z", "write", "()Z", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Landroid/graphics/ColorSpace;", "()Landroid/graphics/ColorSpace;", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Landroid/content/Context;", "()Landroid/content/Context;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/getPlayWhenReadyChangeReason;", "MediaBrowserCompatItemReceiver", "()Lo/getPlayWhenReadyChangeReason;", "AudioAttributesImplApi21Parcelizer", "Lo/ShapeKt;", "AudioAttributesImplBaseParcelizer", "()Lo/ShapeKt;", "AudioAttributesImplApi26Parcelizer", "Lo/lambdasetShuffleModeEnabled4;", "RatingCompat", "MediaBrowserCompatMediaItem", "Lo/lambdaupdatePlaybackInfo16;", "()Lo/lambdaupdatePlaybackInfo16;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda4 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final ShapeKt AudioAttributesImplBaseParcelizer;
    private final getPlayWhenReadyChangeReason AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getPlayWhenReadyChangeReason MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;
    private final getPlayWhenReadyChangeReason MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final lambdasetShuffleModeEnabled4 AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final lambdaupdatePlaybackInfo16 RatingCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final Bitmap.Config write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Context IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final ColorSpace AudioAttributesCompatParcelizer;

    public ExoPlayerBuilderExternalSyntheticLambda4(Context context, Bitmap.Config config, ColorSpace colorSpace, lambdaupdatePlaybackInfo16 lambdaupdateplaybackinfo16, boolean z, boolean z2, boolean z3, ShapeKt shapeKt, lambdasetShuffleModeEnabled4 lambdasetshufflemodeenabled4, getPlayWhenReadyChangeReason getplaywhenreadychangereason, getPlayWhenReadyChangeReason getplaywhenreadychangereason2, getPlayWhenReadyChangeReason getplaywhenreadychangereason3) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(config, "");
        toMagicModuleMetaRepoModel.write(lambdaupdateplaybackinfo16, "");
        toMagicModuleMetaRepoModel.write(shapeKt, "");
        toMagicModuleMetaRepoModel.write(lambdasetshufflemodeenabled4, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason2, "");
        toMagicModuleMetaRepoModel.write(getplaywhenreadychangereason3, "");
        this.IconCompatParcelizer = context;
        this.write = config;
        this.AudioAttributesCompatParcelizer = colorSpace;
        this.RatingCompat = lambdaupdateplaybackinfo16;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.MediaBrowserCompatMediaItem = z3;
        this.AudioAttributesImplBaseParcelizer = shapeKt;
        this.AudioAttributesImplApi21Parcelizer = lambdasetshufflemodeenabled4;
        this.AudioAttributesImplApi26Parcelizer = getplaywhenreadychangereason;
        this.MediaBrowserCompatCustomActionResultReceiver = getplaywhenreadychangereason2;
        this.MediaBrowserCompatItemReceiver = getplaywhenreadychangereason3;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Context getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Bitmap.Config getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final ColorSpace getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final lambdaupdatePlaybackInfo16 getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final ShapeKt getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final getPlayWhenReadyChangeReason getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final getPlayWhenReadyChangeReason getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ExoPlayerBuilderExternalSyntheticLambda4)) {
            return false;
        }
        ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4 = (ExoPlayerBuilderExternalSyntheticLambda4) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, exoPlayerBuilderExternalSyntheticLambda4.IconCompatParcelizer) && this.write == exoPlayerBuilderExternalSyntheticLambda4.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, exoPlayerBuilderExternalSyntheticLambda4.AudioAttributesCompatParcelizer) && this.RatingCompat == exoPlayerBuilderExternalSyntheticLambda4.RatingCompat && this.RemoteActionCompatParcelizer == exoPlayerBuilderExternalSyntheticLambda4.RemoteActionCompatParcelizer && this.read == exoPlayerBuilderExternalSyntheticLambda4.read && this.MediaBrowserCompatMediaItem == exoPlayerBuilderExternalSyntheticLambda4.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, exoPlayerBuilderExternalSyntheticLambda4.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, exoPlayerBuilderExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer) && this.AudioAttributesImplApi26Parcelizer == exoPlayerBuilderExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == exoPlayerBuilderExternalSyntheticLambda4.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == exoPlayerBuilderExternalSyntheticLambda4.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        int iHashCode2 = this.write.hashCode();
        ColorSpace colorSpace = this.AudioAttributesCompatParcelizer;
        int iHashCode3 = colorSpace == null ? 0 : colorSpace.hashCode();
        int iHashCode4 = this.RatingCompat.hashCode();
        int iHashCode5 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode6 = Boolean.hashCode(this.read);
        int iHashCode7 = Boolean.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode8 = this.AudioAttributesImplBaseParcelizer.hashCode();
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Options(context=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", config=");
        sb.append(this.write);
        sb.append(", colorSpace=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", scale=");
        sb.append(this.RatingCompat);
        sb.append(", allowInexactSize=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", allowRgb565=");
        sb.append(this.read);
        sb.append(", premultipliedAlpha=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", headers=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", parameters=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", memoryCachePolicy=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", diskCachePolicy=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", networkCachePolicy=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(')');
        return sb.toString();
    }
}
