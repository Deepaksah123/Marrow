package kotlin;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class onPlayerStateChanged<ResourceT> extends onPlaybackSuppressionReasonChanged<ResourceT> {
    private final onPositionDiscontinuity AudioAttributesCompatParcelizer;
    private final Drawable RemoteActionCompatParcelizer;

    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[onPositionDiscontinuity.values().length];
            iArr[onPositionDiscontinuity.SUCCEEDED.ordinal()] = 1;
            iArr[onPositionDiscontinuity.CLEARED.ordinal()] = 2;
            iArr[onPositionDiscontinuity.RUNNING.ordinal()] = 3;
            iArr[onPositionDiscontinuity.FAILED.ordinal()] = 4;
            write = iArr;
        }
    }

    @Override // kotlin.onPlaybackSuppressionReasonChanged
    public final onPositionDiscontinuity read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Drawable AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onPlayerStateChanged(onPositionDiscontinuity onpositiondiscontinuity, Drawable drawable) {
        super(null);
        toMagicModuleMetaRepoModel.write(onpositiondiscontinuity, "");
        this.AudioAttributesCompatParcelizer = onpositiondiscontinuity;
        this.RemoteActionCompatParcelizer = drawable;
        int i = AudioAttributesCompatParcelizer.write[read().ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i != 2 && i != 3 && i != 4) {
            throw new RenewEligibleCreator();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPlayerStateChanged)) {
            return false;
        }
        onPlayerStateChanged onplayerstatechanged = (onPlayerStateChanged) obj;
        return read() == onplayerstatechanged.read() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, onplayerstatechanged.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = read().hashCode();
        Drawable drawable = this.RemoteActionCompatParcelizer;
        return (iHashCode * 31) + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(status=");
        sb.append(read());
        sb.append(", placeholder=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
