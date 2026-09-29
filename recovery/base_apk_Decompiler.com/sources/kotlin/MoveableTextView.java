package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MoveableTextView extends setMsDelay {
    private byte[] read;

    static {
        new setScaleType(MoveableTextView.class) { // from class: o.MoveableTextView.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return MoveableTextView.AudioAttributesCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    MoveableTextView(byte[] bArr, boolean z) {
        this.read = bArr;
    }

    static MoveableTextView AudioAttributesCompatParcelizer(byte[] bArr) {
        return new CoroutinesDispatchersModule(bArr);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof MoveableTextView) {
            return SampleVideosRSModel.write(this.read, ((MoveableTextView) setmsdelay).read);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.read(z, 22, this.read);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, this.read.length);
    }

    private String RemoteActionCompatParcelizer() {
        return ShareCopyRSModel.RemoteActionCompatParcelizer(this.read);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return SampleVideosRSModel.write(this.read);
    }

    public String toString() {
        return RemoteActionCompatParcelizer();
    }
}
