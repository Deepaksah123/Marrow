package kotlin;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import coil.size.OriginalSize;
import coil.size.PixelSize;
import coil.size.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/ExoPlayerBuilderExternalSyntheticLambda19;", "", "Lo/setDeviceVolumeControlEnabled;", "p0", "<init>", "(Lo/setDeviceVolumeControlEnabled;)V", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Bitmap$Config;", "p1", "Lcoil/size/Size;", "p2", "Lo/lambdaupdatePlaybackInfo16;", "p3", "", "p4", "Landroid/graphics/Bitmap;", "write", "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lcoil/size/Size;Lo/lambdaupdatePlaybackInfo16;Z)Landroid/graphics/Bitmap;", "read", "(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$Config;)Z", "AudioAttributesCompatParcelizer", "(ZLcoil/size/Size;Landroid/graphics/Bitmap;Lo/lambdaupdatePlaybackInfo16;)Z", "RemoteActionCompatParcelizer", "Lo/setDeviceVolumeControlEnabled;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ExoPlayerBuilderExternalSyntheticLambda19 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setDeviceVolumeControlEnabled read;

    public ExoPlayerBuilderExternalSyntheticLambda19(setDeviceVolumeControlEnabled setdevicevolumecontrolenabled) {
        toMagicModuleMetaRepoModel.write(setdevicevolumecontrolenabled, "");
        this.read = setdevicevolumecontrolenabled;
    }

    public final Bitmap write(Drawable p0, Bitmap.Config p1, Size p2, lambdaupdatePlaybackInfo16 p3, boolean p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (p0 instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) p0).getBitmap();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmap, "");
            if (read(bitmap, p1) && AudioAttributesCompatParcelizer(p4, p2, bitmap, p3)) {
                return bitmap;
            }
        }
        Drawable drawableMutate = p0.mutate();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(drawableMutate, "");
        int iWrite = sendRendererMessage.write(drawableMutate);
        if (iWrite <= 0) {
            iWrite = 512;
        }
        int iIconCompatParcelizer = sendRendererMessage.IconCompatParcelizer(drawableMutate);
        int i = iIconCompatParcelizer > 0 ? iIconCompatParcelizer : 512;
        ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
        PixelSize pixelSize = ExoPlayerBuilderExternalSyntheticLambda22.read(iWrite, i, p2, p3);
        int iRemoteActionCompatParcelizer = pixelSize.RemoteActionCompatParcelizer();
        int iWrite2 = pixelSize.write();
        Bitmap bitmap2 = this.read.read(iRemoteActionCompatParcelizer, iWrite2, maybeNotifySurfaceSizeChanged.IconCompatParcelizer(p1));
        Rect bounds = drawableMutate.getBounds();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bounds, "");
        int i2 = bounds.left;
        int i3 = bounds.top;
        int i4 = bounds.right;
        int i5 = bounds.bottom;
        drawableMutate.setBounds(0, 0, iRemoteActionCompatParcelizer, iWrite2);
        drawableMutate.draw(new Canvas(bitmap2));
        drawableMutate.setBounds(i2, i3, i4, i5);
        return bitmap2;
    }

    private static boolean read(Bitmap p0, Bitmap.Config p1) {
        return p0.getConfig() == maybeNotifySurfaceSizeChanged.IconCompatParcelizer(p1);
    }

    private static boolean AudioAttributesCompatParcelizer(boolean p0, Size p1, Bitmap p2, lambdaupdatePlaybackInfo16 p3) {
        if (p0 || (p1 instanceof OriginalSize)) {
            return true;
        }
        ExoPlayerBuilderExternalSyntheticLambda22 exoPlayerBuilderExternalSyntheticLambda22 = ExoPlayerBuilderExternalSyntheticLambda22.INSTANCE;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p1, ExoPlayerBuilderExternalSyntheticLambda22.read(p2.getWidth(), p2.getHeight(), p1, p3));
    }
}
