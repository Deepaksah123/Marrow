package kotlin;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB3\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000b0\n¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016"}, d2 = {"Lo/updateWifiLock;", "", "Lo/access4300;", "Landroid/graphics/Bitmap;", "p0", "", "p1", "p2", "<init>", "(Lo/access4300;Lo/access4300;Lo/access4300;)V", "Lo/onShuffleModeChanged;", "Lo/getSubscriptionExpiresOn;", "Ljava/io/File;", "AudioAttributesImplApi21Parcelizer", "()Lo/onShuffleModeChanged;", "read", "IconCompatParcelizer", "Lo/onPlayerReleased;", "AudioAttributesImplApi26Parcelizer", "()Lo/onPlayerReleased;", "write", "AudioAttributesCompatParcelizer", "Lo/access4300;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class updateWifiLock {
    private static updateWifiLock AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final access4300<Bitmap> AudioAttributesCompatParcelizer;
    private final access4300<byte[]> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final access4300<byte[]> read;

    private updateWifiLock(access4300<Bitmap> access4300Var, access4300<byte[]> access4300Var2, access4300<byte[]> access4300Var3) {
        this.AudioAttributesCompatParcelizer = access4300Var;
        this.RemoteActionCompatParcelizer = access4300Var2;
        this.read = access4300Var3;
    }

    /* JADX INFO: renamed from: o.updateWifiLock$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lo/updateWifiLock$read;", "", "<init>", "()V", "Lo/access4300;", "Landroid/graphics/Bitmap;", "p0", "", "p1", "p2", "Lo/updateWifiLock;", "write", "(Lo/access4300;Lo/access4300;Lo/access4300;)Lo/updateWifiLock;", "AudioAttributesCompatParcelizer", "Lo/updateWifiLock;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final updateWifiLock write(access4300<Bitmap> p0, access4300<byte[]> p1, access4300<byte[]> p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            if (updateWifiLock.AudioAttributesCompatParcelizer == null) {
                synchronized (this) {
                    if (updateWifiLock.AudioAttributesCompatParcelizer == null) {
                        Companion companion = updateWifiLock.INSTANCE;
                        updateWifiLock.AudioAttributesCompatParcelizer = new updateWifiLock(p0, p1, p2, null);
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
            updateWifiLock updatewifilock = updateWifiLock.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(updatewifilock);
            return updatewifilock;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final onShuffleModeChanged<Pair<Bitmap, File>> AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    public final onShuffleModeChanged<Pair<byte[], File>> read() {
        return this.RemoteActionCompatParcelizer.read();
    }

    public final onShuffleModeChanged<Pair<byte[], File>> IconCompatParcelizer() {
        return this.read.read();
    }

    public final onPlayerReleased AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    public final onPlayerReleased write() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    public final onPlayerReleased AudioAttributesCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public /* synthetic */ updateWifiLock(access4300 access4300Var, access4300 access4300Var2, access4300 access4300Var3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(access4300Var, access4300Var2, access4300Var3);
    }
}
