package kotlin;

import android.graphics.Bitmap;
import java.util.TreeMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0007\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c"}, d2 = {"Lo/setUsePlatformDiagnostics;", "Lo/setLivePlaybackSpeedControl;", "<init>", "()V", "", "p0", "", "IconCompatParcelizer", "(I)V", "p1", "Landroid/graphics/Bitmap$Config;", "p2", "Landroid/graphics/Bitmap;", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Bitmap;)V", "()Landroid/graphics/Bitmap;", "", "read", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "Lo/setUseLazyPreparation;", "Lo/setUseLazyPreparation;", "write", "Ljava/util/TreeMap;", "Ljava/util/TreeMap;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class setUsePlatformDiagnostics implements setLivePlaybackSpeedControl {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setUseLazyPreparation<Integer, Bitmap> write = new setUseLazyPreparation<>();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final TreeMap<Integer, Integer> read = new TreeMap<>();

    @Override // kotlin.setLivePlaybackSpeedControl
    public final void AudioAttributesCompatParcelizer(Bitmap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iWrite = maybeNotifySurfaceSizeChanged.write(p0);
        this.write.read(Integer.valueOf(iWrite), p0);
        Integer num = this.read.get(Integer.valueOf(iWrite));
        this.read.put(Integer.valueOf(iWrite), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // kotlin.setLivePlaybackSpeedControl
    public final Bitmap IconCompatParcelizer(int p0, int p1, Bitmap.Config p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        stopInternal stopinternal = stopInternal.INSTANCE;
        int iWrite = stopInternal.write(p0, p1, p2);
        Integer numCeilingKey = this.read.ceilingKey(Integer.valueOf(iWrite));
        if (numCeilingKey != null) {
            if (numCeilingKey.intValue() > (iWrite << 2)) {
                numCeilingKey = null;
            }
            if (numCeilingKey != null) {
                iWrite = numCeilingKey.intValue();
            }
        }
        Bitmap bitmapIconCompatParcelizer = this.write.IconCompatParcelizer(Integer.valueOf(iWrite));
        if (bitmapIconCompatParcelizer != null) {
            IconCompatParcelizer(iWrite);
            bitmapIconCompatParcelizer.reconfigure(p0, p1, p2);
        }
        return bitmapIconCompatParcelizer;
    }

    @Override // kotlin.setLivePlaybackSpeedControl
    public final Bitmap AudioAttributesCompatParcelizer() {
        Bitmap bitmapAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer();
        if (bitmapAudioAttributesCompatParcelizer != null) {
            IconCompatParcelizer(bitmapAudioAttributesCompatParcelizer.getAllocationByteCount());
        }
        return bitmapAudioAttributesCompatParcelizer;
    }

    private final void IconCompatParcelizer(int p0) {
        int iIntValue = ((Number) VideoTimelineResponseBody.AudioAttributesCompatParcelizer(this.read, Integer.valueOf(p0))).intValue();
        if (iIntValue == 1) {
            this.read.remove(Integer.valueOf(p0));
        } else {
            this.read.put(Integer.valueOf(p0), Integer.valueOf(iIntValue - 1));
        }
    }

    @Override // kotlin.setLivePlaybackSpeedControl
    public final String read(Bitmap p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        StringBuilder sb = new StringBuilder("[");
        sb.append(maybeNotifySurfaceSizeChanged.write(p0));
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.setLivePlaybackSpeedControl
    public final String RemoteActionCompatParcelizer(int p0, int p1, Bitmap.Config p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        StringBuilder sb = new StringBuilder("[");
        stopInternal stopinternal = stopInternal.INSTANCE;
        sb.append(stopInternal.write(p0, p1, p2));
        sb.append(']');
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SizeStrategy: entries=");
        sb.append(this.write);
        sb.append(", sizes=");
        sb.append(this.read);
        return sb.toString();
    }
}
