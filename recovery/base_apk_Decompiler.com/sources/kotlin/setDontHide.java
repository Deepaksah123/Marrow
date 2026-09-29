package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setDontHide extends setMsDelay {
    static {
        new setScaleType(setDontHide.class) { // from class: o.setDontHide.2
            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return setDontHide.AudioAttributesCompatParcelizer(emptyBody.read());
            }
        };
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        return -1;
    }

    setDontHide() {
    }

    static setDontHide AudioAttributesCompatParcelizer(byte[] bArr) {
        if (bArr.length == 0) {
            return NetworkApiResponse.write;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        return setmsdelay instanceof setDontHide;
    }

    public String toString() {
        return "NULL";
    }
}
