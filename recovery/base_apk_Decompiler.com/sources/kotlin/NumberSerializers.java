package kotlin;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class NumberSerializers implements _orderEntries {
    private final MediaCodec RemoteActionCompatParcelizer;

    @Override // kotlin._orderEntries
    public final void AudioAttributesCompatParcelizer() {
    }

    @Override // kotlin._orderEntries
    public final void IconCompatParcelizer() {
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer() {
    }

    @Override // kotlin._orderEntries
    public final void read() {
    }

    public NumberSerializers(MediaCodec mediaCodec) {
        this.RemoteActionCompatParcelizer = mediaCodec;
    }

    @Override // kotlin._orderEntries
    public final void AudioAttributesCompatParcelizer(int i, int i2, int i3, long j, int i4) {
        this.RemoteActionCompatParcelizer.queueInputBuffer(i, 0, i3, j, i4);
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer(int i, int i2, TypeSerializerBase typeSerializerBase, long j, int i3) {
        this.RemoteActionCompatParcelizer.queueSecureInputBuffer(i, 0, typeSerializerBase.RemoteActionCompatParcelizer(), j, i3);
    }

    @Override // kotlin._orderEntries
    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        this.RemoteActionCompatParcelizer.setParameters(bundle);
    }
}
