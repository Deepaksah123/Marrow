package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\u0003R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u0005\u0010\fR\u001c\u0010\u0010\u001a\u00020\r8\u0000@\u0001X\u0081\u000e¢\u0006\f\n\u0004\b\b\u0010\u000e\"\u0004\b\t\u0010\u000f"}, d2 = {"Lo/getFillAlpha;", "", "<init>", "()V", "Lo/PathMotion;", "write", "()Lo/PathMotion;", "", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/PathMotion;", "(Lo/PathMotion;)V", "Lo/Transition;", "Lo/Transition;", "(Lo/Transition;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getFillAlpha {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private PathMotion RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Transition read = Transition.RemoteActionCompatParcelizer;

    public abstract void AudioAttributesCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final PathMotion getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(PathMotion pathMotion) {
        this.RemoteActionCompatParcelizer = pathMotion;
    }

    public final void AudioAttributesCompatParcelizer(Transition transition) {
        this.read = transition;
    }

    public final PathMotion write() {
        if (this.read == Transition.RemoteActionCompatParcelizer) {
            getRootStableInsets.AudioAttributesCompatParcelizer("ToolbarRequester is not initialized.");
        }
        return this.RemoteActionCompatParcelizer;
    }
}
