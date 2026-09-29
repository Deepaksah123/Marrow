package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class VideoPlayerExceptionNoInternetException extends InputStream {
    private setOnRatingBarChangedListener IconCompatParcelizer;
    private final setScrollEndListener MediaBrowserCompatCustomActionResultReceiver;
    private InputStream write;
    private boolean RemoteActionCompatParcelizer = true;
    private int read = 0;
    private final boolean AudioAttributesCompatParcelizer = false;

    VideoPlayerExceptionNoInternetException(setScrollEndListener setscrollendlistener) {
        this.MediaBrowserCompatCustomActionResultReceiver = setscrollendlistener;
    }

    private setOnRatingBarChangedListener AudioAttributesCompatParcelizer() throws IOException {
        LottieRatingBar lottieRatingBarIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        if (lottieRatingBarIconCompatParcelizer == null) {
            return null;
        }
        if (lottieRatingBarIconCompatParcelizer instanceof setOnRatingBarChangedListener) {
            if (this.read == 0) {
                return (setOnRatingBarChangedListener) lottieRatingBarIconCompatParcelizer;
            }
            throw new IOException("only the last nested bitstring can have padding");
        }
        StringBuilder sb = new StringBuilder("unknown object encountered: ");
        sb.append(lottieRatingBarIconCompatParcelizer.getClass());
        throw new IOException(sb.toString());
    }

    final int IconCompatParcelizer() {
        return this.read;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.write == null) {
            if (!this.RemoteActionCompatParcelizer) {
                return -1;
            }
            setOnRatingBarChangedListener setonratingbarchangedlistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = setonratingbarchangedlistenerAudioAttributesCompatParcelizer;
            if (setonratingbarchangedlistenerAudioAttributesCompatParcelizer == null) {
                return -1;
            }
            this.RemoteActionCompatParcelizer = false;
            this.write = setonratingbarchangedlistenerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i = this.write.read();
            if (i >= 0) {
                return i;
            }
            this.read = this.IconCompatParcelizer.read();
            setOnRatingBarChangedListener setonratingbarchangedlistenerAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = setonratingbarchangedlistenerAudioAttributesCompatParcelizer2;
            if (setonratingbarchangedlistenerAudioAttributesCompatParcelizer2 == null) {
                this.write = null;
                return -1;
            }
            this.write = setonratingbarchangedlistenerAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (this.write == null) {
            if (!this.RemoteActionCompatParcelizer) {
                return -1;
            }
            setOnRatingBarChangedListener setonratingbarchangedlistenerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = setonratingbarchangedlistenerAudioAttributesCompatParcelizer;
            if (setonratingbarchangedlistenerAudioAttributesCompatParcelizer == null) {
                return -1;
            }
            this.RemoteActionCompatParcelizer = false;
            this.write = setonratingbarchangedlistenerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i4 = this.write.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                this.read = this.IconCompatParcelizer.read();
                setOnRatingBarChangedListener setonratingbarchangedlistenerAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer();
                this.IconCompatParcelizer = setonratingbarchangedlistenerAudioAttributesCompatParcelizer2;
                if (setonratingbarchangedlistenerAudioAttributesCompatParcelizer2 == null) {
                    this.write = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.write = setonratingbarchangedlistenerAudioAttributesCompatParcelizer2.RemoteActionCompatParcelizer();
            }
        }
    }
}
