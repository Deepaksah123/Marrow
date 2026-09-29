package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class setRatingChangeAllowed extends setMsDelay {
    public static final setRatingChangeAllowed AudioAttributesCompatParcelizer;
    public static final setRatingChangeAllowed IconCompatParcelizer;
    private final byte RemoteActionCompatParcelizer;

    static {
        new setScaleType(setRatingChangeAllowed.class) { // from class: o.setRatingChangeAllowed.3
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setRatingChangeAllowed.write(emptyBody.read());
            }
        };
        AudioAttributesCompatParcelizer = new setRatingChangeAllowed((byte) 0);
        IconCompatParcelizer = new setRatingChangeAllowed((byte) -1);
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    private setRatingChangeAllowed(byte b) {
        this.RemoteActionCompatParcelizer = b;
    }

    static setRatingChangeAllowed write(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new setRatingChangeAllowed(b) : AudioAttributesCompatParcelizer : IconCompatParcelizer;
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        return (setmsdelay instanceof setRatingChangeAllowed) && RemoteActionCompatParcelizer() == ((setRatingChangeAllowed) setmsdelay).RemoteActionCompatParcelizer();
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.IconCompatParcelizer(z, this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return setMinimumWidthMargin.RemoteActionCompatParcelizer(z, 1);
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return RemoteActionCompatParcelizer() ? 1 : 0;
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer != 0;
    }

    @Override // kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        return RemoteActionCompatParcelizer() ? IconCompatParcelizer : AudioAttributesCompatParcelizer;
    }

    public String toString() {
        return RemoteActionCompatParcelizer() ? "TRUE" : "FALSE";
    }
}
