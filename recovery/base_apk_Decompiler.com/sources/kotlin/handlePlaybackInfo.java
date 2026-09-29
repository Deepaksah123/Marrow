package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class handlePlaybackInfo extends lambdasetRepeatMode3 {
    private final lambdamaybeNotifySurfaceSizeChanged27 AudioAttributesCompatParcelizer;
    private final Drawable IconCompatParcelizer;
    private final Throwable write;

    @Override // kotlin.lambdasetRepeatMode3
    public final Drawable IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.lambdasetRepeatMode3
    public final lambdamaybeNotifySurfaceSizeChanged27 write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Throwable RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public handlePlaybackInfo(Drawable drawable, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Throwable th) {
        super(null);
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(th, "");
        this.IconCompatParcelizer = drawable;
        this.AudioAttributesCompatParcelizer = lambdamaybenotifysurfacesizechanged27;
        this.write = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof handlePlaybackInfo)) {
            return false;
        }
        handlePlaybackInfo handleplaybackinfo = (handlePlaybackInfo) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(), handleplaybackinfo.IconCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), handleplaybackinfo.write()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, handleplaybackinfo.write);
    }

    public final int hashCode() {
        return ((((IconCompatParcelizer() == null ? 0 : IconCompatParcelizer().hashCode()) * 31) + write().hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResult(drawable=");
        sb.append(IconCompatParcelizer());
        sb.append(", request=");
        sb.append(write());
        sb.append(", throwable=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
