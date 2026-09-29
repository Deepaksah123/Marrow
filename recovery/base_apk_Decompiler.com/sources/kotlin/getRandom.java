package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class getRandom extends setMsDelay {
    private final getMoveRunner IconCompatParcelizer;

    static {
        new setScaleType(getRandom.class) { // from class: o.getRandom.2
            @Override // kotlin.setScaleType
            final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
                return new getRandom((getMoveRunner) getMoveRunner.IconCompatParcelizer.AudioAttributesCompatParcelizer(setmsfixedduration));
            }

            @Override // kotlin.setScaleType
            final setMsDelay read(EmptyBody emptyBody) {
                return new getRandom((getMoveRunner) getMoveRunner.IconCompatParcelizer.read(emptyBody));
            }
        };
    }

    @Override // kotlin.setMsDelay
    final boolean write() {
        return false;
    }

    public getRandom(getMoveRunner getmoverunner) {
        if (getmoverunner == null) {
            throw new NullPointerException("'baseGraphicString' cannot be null");
        }
        this.IconCompatParcelizer = getmoverunner;
    }

    static getRandom write(byte[] bArr) {
        return new getRandom(getMoveRunner.write(bArr));
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (setmsdelay instanceof getRandom) {
            return this.IconCompatParcelizer.IconCompatParcelizer(((getRandom) setmsdelay).IconCompatParcelizer);
        }
        return false;
    }

    @Override // kotlin.setMsDelay
    final void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException {
        setminimumwidthmargin.write(z, 7);
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(setminimumwidthmargin, false);
    }

    @Override // kotlin.setMsDelay
    final int write(boolean z) {
        return this.IconCompatParcelizer.write(z);
    }

    @Override // kotlin.setBlinkerTexts
    public final int hashCode() {
        return ~this.IconCompatParcelizer.hashCode();
    }

    @Override // kotlin.setMsDelay
    final setMsDelay IconCompatParcelizer() {
        getMoveRunner getmoverunner = (getMoveRunner) this.IconCompatParcelizer.IconCompatParcelizer();
        return getmoverunner == this.IconCompatParcelizer ? this : new getRandom(getmoverunner);
    }

    @Override // kotlin.setMsDelay
    final setMsDelay MediaBrowserCompatItemReceiver() {
        getMoveRunner getmoverunner = (getMoveRunner) this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        return getmoverunner == this.IconCompatParcelizer ? this : new getRandom(getmoverunner);
    }
}
