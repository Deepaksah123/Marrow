package kotlin;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
final class VideoPlayerExceptionInternalPlaybackException extends InputStream {
    private InputStream AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer = true;
    private final setScrollEndListener RemoteActionCompatParcelizer;

    VideoPlayerExceptionInternalPlaybackException(setScrollEndListener setscrollendlistener) {
        this.RemoteActionCompatParcelizer = setscrollendlistener;
    }

    private setMoveRunner write() throws IOException {
        LottieRatingBar lottieRatingBarIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (lottieRatingBarIconCompatParcelizer == null) {
            return null;
        }
        if (lottieRatingBarIconCompatParcelizer instanceof setMoveRunner) {
            return (setMoveRunner) lottieRatingBarIconCompatParcelizer;
        }
        StringBuilder sb = new StringBuilder("unknown object encountered: ");
        sb.append(lottieRatingBarIconCompatParcelizer.getClass());
        throw new IOException(sb.toString());
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        setMoveRunner setmoverunnerWrite;
        if (this.AudioAttributesCompatParcelizer == null) {
            if (!this.IconCompatParcelizer || (setmoverunnerWrite = write()) == null) {
                return -1;
            }
            this.IconCompatParcelizer = false;
            this.AudioAttributesCompatParcelizer = setmoverunnerWrite.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i = this.AudioAttributesCompatParcelizer.read();
            if (i >= 0) {
                return i;
            }
            setMoveRunner setmoverunnerWrite2 = write();
            if (setmoverunnerWrite2 == null) {
                this.AudioAttributesCompatParcelizer = null;
                return -1;
            }
            this.AudioAttributesCompatParcelizer = setmoverunnerWrite2.RemoteActionCompatParcelizer();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        setMoveRunner setmoverunnerWrite;
        int i3 = 0;
        if (this.AudioAttributesCompatParcelizer == null) {
            if (!this.IconCompatParcelizer || (setmoverunnerWrite = write()) == null) {
                return -1;
            }
            this.IconCompatParcelizer = false;
            this.AudioAttributesCompatParcelizer = setmoverunnerWrite.RemoteActionCompatParcelizer();
        }
        while (true) {
            int i4 = this.AudioAttributesCompatParcelizer.read(bArr, i + i3, i2 - i3);
            if (i4 >= 0) {
                i3 += i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                setMoveRunner setmoverunnerWrite2 = write();
                if (setmoverunnerWrite2 == null) {
                    this.AudioAttributesCompatParcelizer = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    return i3;
                }
                this.AudioAttributesCompatParcelizer = setmoverunnerWrite2.RemoteActionCompatParcelizer();
            }
        }
    }
}
