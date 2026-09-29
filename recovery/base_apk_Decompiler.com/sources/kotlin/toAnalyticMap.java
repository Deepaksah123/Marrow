package kotlin;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
class toAnalyticMap implements ZoomageView {
    final int AudioAttributesCompatParcelizer;
    final int RemoteActionCompatParcelizer;
    final setScrollEndListener write;

    toAnalyticMap(int i, int i2, setScrollEndListener setscrollendlistener) {
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.write = setscrollendlistener;
    }

    public setMsDelay AudioAttributesCompatParcelizer() throws IOException {
        return this.write.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.LottieRatingBar
    public final setMsDelay AudioAttributesImplApi26Parcelizer() {
        try {
            return AudioAttributesCompatParcelizer();
        } catch (IOException e) {
            throw new setHideRunner(e.getMessage());
        }
    }
}
