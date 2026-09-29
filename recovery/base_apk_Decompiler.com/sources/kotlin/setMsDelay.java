package kotlin;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setMsDelay extends setBlinkerTexts {
    setMsDelay() {
    }

    @Override // kotlin.setBlinkerTexts, kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        return this;
    }

    setMsDelay IconCompatParcelizer() {
        return this;
    }

    abstract boolean IconCompatParcelizer(setMsDelay setmsdelay);

    setMsDelay MediaBrowserCompatItemReceiver() {
        return this;
    }

    abstract void RemoteActionCompatParcelizer(setMinimumWidthMargin setminimumwidthmargin, boolean z) throws IOException;

    abstract int write(boolean z) throws IOException;

    abstract boolean write();

    @Override // kotlin.setBlinkerTexts
    public final void read(OutputStream outputStream) throws IOException {
        setMinimumWidthMargin.AudioAttributesCompatParcelizer(outputStream).RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.setBlinkerTexts
    public final void read(OutputStream outputStream, String str) throws IOException {
        setMinimumWidthMargin.read(outputStream, str).RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.setBlinkerTexts
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LottieRatingBar) && IconCompatParcelizer(((LottieRatingBar) obj).AudioAttributesImplApi26Parcelizer());
    }

    public final boolean AudioAttributesCompatParcelizer(setMsDelay setmsdelay) {
        return this == setmsdelay || IconCompatParcelizer(setmsdelay);
    }
}
