package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class setScrollEndListener {
    private final InputStream AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final byte[][] write;

    setScrollEndListener(InputStream inputStream, int i, byte[][] bArr) {
        this.AudioAttributesCompatParcelizer = inputStream;
        this.IconCompatParcelizer = i;
        this.write = bArr;
    }

    private void read() {
        InputStream inputStream = this.AudioAttributesCompatParcelizer;
        if (inputStream instanceof ResetBookmarkResponseBodyKt) {
            ((ResetBookmarkResponseBodyKt) inputStream).read(false);
        }
    }

    private LottieRatingBar write(int i) throws IOException {
        read();
        int iWrite = getHideRunner.write(this.AudioAttributesCompatParcelizer, i);
        int iRemoteActionCompatParcelizer = getHideRunner.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, iWrite == 3 || iWrite == 4 || iWrite == 16 || iWrite == 17 || iWrite == 8);
        if (iRemoteActionCompatParcelizer < 0) {
            if ((i & 32) == 0) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            setScrollEndListener setscrollendlistener = new setScrollEndListener(new ResetBookmarkResponseBodyKt(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer), this.IconCompatParcelizer, this.write);
            int i2 = i & PsExtractor.AUDIO_STREAM;
            return i2 != 0 ? new toAnalyticMap(i2, iWrite, setscrollendlistener) : setscrollendlistener.RemoteActionCompatParcelizer(iWrite);
        }
        ResetBookmarkRequestBody resetBookmarkRequestBody = new ResetBookmarkRequestBody(this.AudioAttributesCompatParcelizer, iRemoteActionCompatParcelizer, this.IconCompatParcelizer);
        if ((i & 224) == 0) {
            return read(iWrite, resetBookmarkRequestBody);
        }
        setScrollEndListener setscrollendlistener2 = new setScrollEndListener(resetBookmarkRequestBody, resetBookmarkRequestBody.AudioAttributesCompatParcelizer(), this.write);
        int i3 = i & PsExtractor.AUDIO_STREAM;
        if (i3 != 0) {
            return new ResetBookmarkResponseBody(i3, iWrite, (i & 32) != 0, setscrollendlistener2);
        }
        return setscrollendlistener2.AudioAttributesCompatParcelizer(iWrite);
    }

    final setMsDelay write(int i, int i2, boolean z) throws IOException {
        return !z ? ZoomableLinearLayoutManager.write(i, i2, ((ResetBookmarkRequestBody) this.AudioAttributesCompatParcelizer).write()) : ZoomableLinearLayoutManager.RemoteActionCompatParcelizer(i, i2, write());
    }

    final setMsDelay AudioAttributesCompatParcelizer(int i, int i2) throws IOException {
        return ZoomableLinearLayoutManager.read(i, i2, write());
    }

    private LottieRatingBar AudioAttributesCompatParcelizer(int i) throws IOException {
        if (i == 3) {
            return new MediaChangedException(this);
        }
        if (i == 4) {
            return new DeletedDownloadException(this);
        }
        if (i == 8) {
            return new L3FallbackApprovalResponseBody(this);
        }
        if (i == 16) {
            return new setEventBus(this);
        }
        if (i == 17) {
            return new AspectRatioImageView(this);
        }
        StringBuilder sb = new StringBuilder("unknown DL object encountered: 0x");
        sb.append(Integer.toHexString(i));
        throw new MaxHeightRecyclerView(sb.toString());
    }

    private LottieRatingBar RemoteActionCompatParcelizer(int i) throws IOException {
        if (i == 3) {
            return new MediaChangedException(this);
        }
        if (i == 4) {
            return new DeletedDownloadException(this);
        }
        if (i == 8) {
            return new L3FallbackApprovalResponseBody(this);
        }
        if (i == 16) {
            return new MediaChangedExceptionCompanion(this);
        }
        if (i == 17) {
            return new isProviderInvalid(this);
        }
        StringBuilder sb = new StringBuilder("unknown BER object encountered: 0x");
        sb.append(Integer.toHexString(i));
        throw new MaxHeightRecyclerView(sb.toString());
    }

    private LottieRatingBar read(int i, ResetBookmarkRequestBody resetBookmarkRequestBody) throws IOException {
        if (i == 3) {
            return new setUseCase(resetBookmarkRequestBody);
        }
        if (i == 4) {
            return new CoroutinesScopesModule(resetBookmarkRequestBody);
        }
        if (i == 8) {
            throw new MaxHeightRecyclerView("externals must use constructed encoding (see X.690 8.18)");
        }
        if (i == 16) {
            throw new MaxHeightRecyclerView("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
        }
        if (i == 17) {
            throw new MaxHeightRecyclerView("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
        }
        try {
            return getHideRunner.RemoteActionCompatParcelizer(i, resetBookmarkRequestBody, this.write);
        } catch (IllegalArgumentException e) {
            throw new MaxHeightRecyclerView("corrupted stream detected", e);
        }
    }

    public final LottieRatingBar IconCompatParcelizer() throws IOException {
        int i = this.AudioAttributesCompatParcelizer.read();
        if (i < 0) {
            return null;
        }
        return write(i);
    }

    final setHtmlLoadListener write() throws IOException {
        int i = this.AudioAttributesCompatParcelizer.read();
        if (i < 0) {
            return new setHtmlLoadListener(0);
        }
        setHtmlLoadListener sethtmlloadlistener = new setHtmlLoadListener();
        do {
            LottieRatingBar lottieRatingBarWrite = write(i);
            sethtmlloadlistener.RemoteActionCompatParcelizer(lottieRatingBarWrite instanceof toResetBookmarkRepoModel ? ((toResetBookmarkRepoModel) lottieRatingBarWrite).AudioAttributesCompatParcelizer() : lottieRatingBarWrite.AudioAttributesImplApi26Parcelizer());
            i = this.AudioAttributesCompatParcelizer.read();
        } while (i >= 0);
        return sethtmlloadlistener;
    }
}
