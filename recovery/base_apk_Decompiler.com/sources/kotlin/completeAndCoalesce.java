package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\t\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/completeAndCoalesce;", "Lo/unshare;", "Landroid/graphics/Bitmap;", "p0", "<init>", "(Landroid/graphics/Bitmap;)V", "", "read", "()V", "AudioAttributesCompatParcelizer", "Landroid/graphics/Bitmap;", "RemoteActionCompatParcelizer", "()Landroid/graphics/Bitmap;", "write", "", "()I", "IconCompatParcelizer", "Lo/contentsAsInt;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class completeAndCoalesce implements unshare {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Bitmap write;

    public completeAndCoalesce(Bitmap bitmap) {
        this.write = bitmap;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Bitmap getWrite() {
        return this.write;
    }

    @Override // kotlin.unshare
    public final int AudioAttributesCompatParcelizer() {
        return this.write.getWidth();
    }

    @Override // kotlin.unshare
    public final int write() {
        return this.write.getHeight();
    }

    @Override // kotlin.unshare
    public final int IconCompatParcelizer() {
        Bitmap.Config config = this.write.getConfig();
        toMagicModuleMetaRepoModel.write(config);
        return _allocMore.write(config);
    }

    @Override // kotlin.unshare
    public final void read() {
        this.write.prepareToDraw();
    }
}
