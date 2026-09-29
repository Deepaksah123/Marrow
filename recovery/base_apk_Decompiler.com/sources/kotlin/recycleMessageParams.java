package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class recycleMessageParams implements getInputBuffer {
    private needsReconfiguration AudioAttributesCompatParcelizer;
    private final doHandleMessage IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer = false;
    private boolean read = false;

    recycleMessageParams(doHandleMessage dohandlemessage) {
        this.IconCompatParcelizer = dohandlemessage;
    }

    final void read(needsReconfiguration needsreconfiguration, boolean z) {
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesCompatParcelizer = needsreconfiguration;
        this.read = z;
    }

    private void AudioAttributesCompatParcelizer() {
        if (this.RemoteActionCompatParcelizer) {
            throw new dequeueInputBufferIndex("Cannot encode a second value in the ValueEncoderContext");
        }
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // kotlin.getInputBuffer
    public final getInputBuffer AudioAttributesCompatParcelizer(String str) throws IOException {
        AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.read(this.AudioAttributesCompatParcelizer, str, this.read);
        return this;
    }

    @Override // kotlin.getInputBuffer
    public final getInputBuffer AudioAttributesCompatParcelizer(boolean z) throws IOException {
        AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, z, this.read);
        return this;
    }
}
