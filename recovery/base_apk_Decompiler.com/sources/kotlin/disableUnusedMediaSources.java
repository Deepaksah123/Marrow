package kotlin;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes2.dex */
public final class disableUnusedMediaSources implements onVolumeChanged {
    private final onVolumeChanged RemoteActionCompatParcelizer;
    private final int write;

    public static onVolumeChanged read(Context context) {
        return new disableUnusedMediaSources(context.getResources().getConfiguration().uiMode & 48, correctOffsets.write(context));
    }

    private disableUnusedMediaSources(int i, onVolumeChanged onvolumechanged) {
        this.write = i;
        this.RemoteActionCompatParcelizer = onvolumechanged;
    }

    @Override // kotlin.onVolumeChanged
    public final boolean equals(Object obj) {
        if (!(obj instanceof disableUnusedMediaSources)) {
            return false;
        }
        disableUnusedMediaSources disableunusedmediasources = (disableUnusedMediaSources) obj;
        return this.write == disableunusedmediasources.write && this.RemoteActionCompatParcelizer.equals(disableunusedmediasources.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.onVolumeChanged
    public final int hashCode() {
        return moveMediaSourceRange.write(this.RemoteActionCompatParcelizer, this.write);
    }

    @Override // kotlin.onVolumeChanged
    public final void write(MessageDigest messageDigest) {
        this.RemoteActionCompatParcelizer.write(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.write).array());
    }
}
