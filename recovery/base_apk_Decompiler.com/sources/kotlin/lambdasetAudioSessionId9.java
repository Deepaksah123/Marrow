package kotlin;

import android.graphics.drawable.Drawable;
import kotlin.lambdasetRepeatMode3;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetAudioSessionId9 extends lambdasetRepeatMode3 {
    private final Drawable AudioAttributesCompatParcelizer;
    private final lambdamaybeNotifySurfaceSizeChanged27 RemoteActionCompatParcelizer;
    private final lambdasetRepeatMode3.AudioAttributesCompatParcelizer read;

    @Override // kotlin.lambdasetRepeatMode3
    public final Drawable IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.lambdasetRepeatMode3
    public final lambdamaybeNotifySurfaceSizeChanged27 write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final lambdasetRepeatMode3.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdasetAudioSessionId9(Drawable drawable, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(null);
        toMagicModuleMetaRepoModel.write(drawable, "");
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = drawable;
        this.RemoteActionCompatParcelizer = lambdamaybenotifysurfacesizechanged27;
        this.read = audioAttributesCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lambdasetAudioSessionId9)) {
            return false;
        }
        lambdasetAudioSessionId9 lambdasetaudiosessionid9 = (lambdasetAudioSessionId9) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(IconCompatParcelizer(), lambdasetaudiosessionid9.IconCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), lambdasetaudiosessionid9.write()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, lambdasetaudiosessionid9.read);
    }

    public final int hashCode() {
        return (((IconCompatParcelizer().hashCode() * 31) + write().hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(drawable=");
        sb.append(IconCompatParcelizer());
        sb.append(", request=");
        sb.append(write());
        sb.append(", metadata=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
