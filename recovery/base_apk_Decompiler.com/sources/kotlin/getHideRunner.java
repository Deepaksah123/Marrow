package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class getHideRunner extends FilterInputStream {
    private final int AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final byte[][] read;

    private getHideRunner(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    private getHideRunner(InputStream inputStream, int i, boolean z) {
        this(inputStream, i, z, new byte[11][]);
    }

    private getHideRunner(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = z;
        this.read = bArr;
    }

    public getHideRunner(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public getHideRunner(byte[] bArr, byte b) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    static setMsDelay RemoteActionCompatParcelizer(int i, ResetBookmarkRequestBody resetBookmarkRequestBody, byte[][] bArr) throws IOException {
        try {
            switch (i) {
                case 1:
                    return setRatingChangeAllowed.write(write(resetBookmarkRequestBody, bArr));
                case 2:
                    return getPairOfTimeAndIndex.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 3:
                    return InteractivePanelTextView.IconCompatParcelizer(resetBookmarkRequestBody.write());
                case 4:
                    return setIsTablet.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 5:
                    return setDontHide.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 6:
                    setMinimumHeightMargin.RemoteActionCompatParcelizer(resetBookmarkRequestBody.IconCompatParcelizer());
                    return setMinimumHeightMargin.RemoteActionCompatParcelizer(write(resetBookmarkRequestBody, bArr), true);
                case 7:
                    return getRandom.write(resetBookmarkRequestBody.write());
                case 8:
                case 9:
                case 11:
                case 15:
                case 16:
                case 17:
                case 29:
                default:
                    StringBuilder sb = new StringBuilder("unknown tag ");
                    sb.append(i);
                    sb.append(" encountered");
                    throw new IOException(sb.toString());
                case 10:
                    return MarrowWebView.write(write(resetBookmarkRequestBody, bArr), true);
                case 12:
                    return ZoomableRecyclerView.read(resetBookmarkRequestBody.write());
                case 13:
                    setRandom.IconCompatParcelizer(resetBookmarkRequestBody.IconCompatParcelizer());
                    return setRandom.RemoteActionCompatParcelizer(write(resetBookmarkRequestBody, bArr), true);
                case 14:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    StringBuilder sb2 = new StringBuilder("unsupported tag ");
                    sb2.append(i);
                    sb2.append(" encountered");
                    throw new IOException(sb2.toString());
                case 18:
                    return setBigTextCounter.write(resetBookmarkRequestBody.write());
                case 19:
                    return setOnMoveListener.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 20:
                    return setScrollStartListener.write(resetBookmarkRequestBody.write());
                case 21:
                    return getAutoResetMode.IconCompatParcelizer(resetBookmarkRequestBody.write());
                case 22:
                    return MoveableTextView.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 23:
                    return setTimerUpdateListener.write(resetBookmarkRequestBody.write());
                case 24:
                    return getOnMoveListener.IconCompatParcelizer(resetBookmarkRequestBody.write());
                case 25:
                    return getMoveRunner.write(resetBookmarkRequestBody.write());
                case 26:
                    return setAutoResetMode.IconCompatParcelizer(resetBookmarkRequestBody.write());
                case 27:
                    return getBlinkerTexts.RemoteActionCompatParcelizer(resetBookmarkRequestBody.write());
                case 28:
                    return setOnScaleFatorChangeListener.AudioAttributesCompatParcelizer(resetBookmarkRequestBody.write());
                case 30:
                    return setTotalVideoDuration.RemoteActionCompatParcelizer(write(resetBookmarkRequestBody));
            }
        } catch (IllegalArgumentException e) {
            throw new MaxHeightRecyclerView(e.getMessage(), e);
        } catch (IllegalStateException e2) {
            throw new MaxHeightRecyclerView(e2.getMessage(), e2);
        }
    }

    private static char[] write(ResetBookmarkRequestBody resetBookmarkRequestBody) throws IOException {
        int iIconCompatParcelizer = resetBookmarkRequestBody.IconCompatParcelizer();
        if ((iIconCompatParcelizer & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i = iIconCompatParcelizer / 2;
        char[] cArr = new char[i];
        byte[] bArr = new byte[8];
        int i2 = 0;
        int i3 = 0;
        while (iIconCompatParcelizer >= 8) {
            if (CustomModuleLSModelKt.IconCompatParcelizer(resetBookmarkRequestBody, bArr, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i3] = (char) ((bArr[0] << 8) | (bArr[1] & 255));
            cArr[i3 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & 255));
            cArr[i3 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & 255));
            cArr[i3 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & 255));
            i3 += 4;
            iIconCompatParcelizer -= 8;
        }
        if (iIconCompatParcelizer > 0) {
            if (CustomModuleLSModelKt.IconCompatParcelizer(resetBookmarkRequestBody, bArr, iIconCompatParcelizer) != iIconCompatParcelizer) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            while (true) {
                int i4 = i2 + 2;
                cArr[i3] = (char) ((bArr[i2 + 1] & 255) | (bArr[i2] << 8));
                i3++;
                if (i4 >= iIconCompatParcelizer) {
                    break;
                }
                i2 = i4;
            }
        }
        if (resetBookmarkRequestBody.IconCompatParcelizer() == 0 && i == i3) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] write(ResetBookmarkRequestBody resetBookmarkRequestBody, byte[][] bArr) throws IOException {
        int iIconCompatParcelizer = resetBookmarkRequestBody.IconCompatParcelizer();
        if (iIconCompatParcelizer >= bArr.length) {
            return resetBookmarkRequestBody.write();
        }
        byte[] bArr2 = bArr[iIconCompatParcelizer];
        if (bArr2 == null) {
            bArr2 = new byte[iIconCompatParcelizer];
            bArr[iIconCompatParcelizer] = bArr2;
        }
        resetBookmarkRequestBody.write(bArr2);
        return bArr2;
    }

    static int RemoteActionCompatParcelizer(InputStream inputStream, int i, boolean z) throws IOException {
        int i2 = inputStream.read();
        if ((i2 >>> 7) == 0) {
            return i2;
        }
        if (128 == i2) {
            return -1;
        }
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (255 == i2) {
            throw new IOException("invalid long form definite-length 0xFF");
        }
        int i3 = 0;
        int i4 = 0;
        do {
            int i5 = inputStream.read();
            if (i5 < 0) {
                throw new EOFException("EOF found reading length");
            }
            if ((i3 >>> 23) != 0) {
                throw new IOException("long form definite-length more than 31 bits");
            }
            i3 = (i3 << 8) + i5;
            i4++;
        } while (i4 < (i2 & 127));
        if (i3 < i || z) {
            return i3;
        }
        StringBuilder sb = new StringBuilder("corrupted stream - out of bounds length found: ");
        sb.append(i3);
        sb.append(" >= ");
        sb.append(i);
        throw new IOException(sb.toString());
    }

    static int write(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        if (i3 < 31) {
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
        int i4 = i3 & 127;
        if (i4 == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        while ((i3 & 128) != 0) {
            if ((i4 >>> 24) != 0) {
                throw new IOException("Tag number more than 31 bits");
            }
            i3 = inputStream.read();
            if (i3 < 0) {
                throw new EOFException("EOF found inside tag value.");
            }
            i4 = (i4 << 7) | (i3 & 127);
        }
        return i4;
    }

    private static InteractivePanelTextView IconCompatParcelizer(setHtmlLoadListener sethtmlloadlistener) throws IOException {
        int iRemoteActionCompatParcelizer = sethtmlloadlistener.RemoteActionCompatParcelizer();
        InteractivePanelTextView[] interactivePanelTextViewArr = new InteractivePanelTextView[iRemoteActionCompatParcelizer];
        for (int i = 0; i != iRemoteActionCompatParcelizer; i++) {
            LottieRatingBar lottieRatingBar = sethtmlloadlistener.read(i);
            if (!(lottieRatingBar instanceof InteractivePanelTextView)) {
                StringBuilder sb = new StringBuilder("unknown object encountered in constructed BIT STRING: ");
                sb.append(lottieRatingBar.getClass());
                throw new MaxHeightRecyclerView(sb.toString());
            }
            interactivePanelTextViewArr[i] = (InteractivePanelTextView) lottieRatingBar;
        }
        return new DeletedDownloadExceptionCompanion(interactivePanelTextViewArr);
    }

    private static setIsTablet AudioAttributesCompatParcelizer(setHtmlLoadListener sethtmlloadlistener) throws IOException {
        int iRemoteActionCompatParcelizer = sethtmlloadlistener.RemoteActionCompatParcelizer();
        setIsTablet[] setistabletArr = new setIsTablet[iRemoteActionCompatParcelizer];
        for (int i = 0; i != iRemoteActionCompatParcelizer; i++) {
            LottieRatingBar lottieRatingBar = sethtmlloadlistener.read(i);
            if (!(lottieRatingBar instanceof setIsTablet)) {
                StringBuilder sb = new StringBuilder("unknown object encountered in constructed OCTET STRING: ");
                sb.append(lottieRatingBar.getClass());
                throw new MaxHeightRecyclerView(sb.toString());
            }
            setistabletArr[i] = (setIsTablet) lottieRatingBar;
        }
        return new MarrowFileException(setistabletArr);
    }

    private setMsDelay write(int i, int i2, int i3) throws IOException {
        ResetBookmarkRequestBody resetBookmarkRequestBody = new ResetBookmarkRequestBody(this, i3, this.AudioAttributesCompatParcelizer);
        if ((i & 224) == 0) {
            return RemoteActionCompatParcelizer(i2, resetBookmarkRequestBody, this.read);
        }
        int i4 = i & PsExtractor.AUDIO_STREAM;
        if (i4 != 0) {
            return IconCompatParcelizer(i4, i2, (i & 32) != 0, resetBookmarkRequestBody);
        }
        if (i2 == 3) {
            return IconCompatParcelizer(read(resetBookmarkRequestBody));
        }
        if (i2 == 4) {
            return AudioAttributesCompatParcelizer(read(resetBookmarkRequestBody));
        }
        if (i2 == 8) {
            return setVideoAnalyticPublisher.read(read(resetBookmarkRequestBody)).AudioAttributesImplApi21Parcelizer();
        }
        if (i2 == 16) {
            return resetBookmarkRequestBody.IconCompatParcelizer() <= 0 ? setVideoAnalyticPublisher.RemoteActionCompatParcelizer : this.IconCompatParcelizer ? new isUnBookmarked(resetBookmarkRequestBody.write()) : setVideoAnalyticPublisher.read(read(resetBookmarkRequestBody));
        }
        if (i2 == 17) {
            return setVideoAnalyticPublisher.write(read(resetBookmarkRequestBody));
        }
        StringBuilder sb = new StringBuilder("unknown tag ");
        sb.append(i2);
        sb.append(" encountered");
        throw new IOException(sb.toString());
    }

    private int write() throws IOException {
        return RemoteActionCompatParcelizer((InputStream) this, this.AudioAttributesCompatParcelizer, false);
    }

    public final setMsDelay RemoteActionCompatParcelizer() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int iWrite = write(this, i);
        int iWrite2 = write();
        if (iWrite2 >= 0) {
            try {
                return write(i, iWrite, iWrite2);
            } catch (IllegalArgumentException e) {
                throw new MaxHeightRecyclerView("corrupted stream detected", e);
            }
        }
        if ((i & 32) == 0) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        setScrollEndListener setscrollendlistener = new setScrollEndListener(new ResetBookmarkResponseBodyKt(this, this.AudioAttributesCompatParcelizer), this.AudioAttributesCompatParcelizer, this.read);
        int i2 = i & PsExtractor.AUDIO_STREAM;
        if (i2 != 0) {
            return setscrollendlistener.AudioAttributesCompatParcelizer(i2, iWrite);
        }
        if (iWrite == 3) {
            return MediaChangedException.RemoteActionCompatParcelizer(setscrollendlistener);
        }
        if (iWrite == 4) {
            return DeletedDownloadException.AudioAttributesCompatParcelizer(setscrollendlistener);
        }
        if (iWrite == 8) {
            return L3FallbackApprovalResponseBody.AudioAttributesCompatParcelizer(setscrollendlistener);
        }
        if (iWrite == 16) {
            return MediaChangedExceptionCompanion.AudioAttributesCompatParcelizer(setscrollendlistener);
        }
        if (iWrite == 17) {
            return isProviderInvalid.write(setscrollendlistener);
        }
        throw new IOException("unknown BER object encountered");
    }

    private setMsDelay IconCompatParcelizer(int i, int i2, boolean z, ResetBookmarkRequestBody resetBookmarkRequestBody) throws IOException {
        return !z ? ZoomableLinearLayoutManager.write(i, i2, resetBookmarkRequestBody.write()) : ZoomableLinearLayoutManager.RemoteActionCompatParcelizer(i, i2, read(resetBookmarkRequestBody));
    }

    final setHtmlLoadListener IconCompatParcelizer() throws IOException {
        setMsDelay setmsdelayRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (setmsdelayRemoteActionCompatParcelizer == null) {
            return new setHtmlLoadListener(0);
        }
        setHtmlLoadListener sethtmlloadlistener = new setHtmlLoadListener();
        do {
            sethtmlloadlistener.RemoteActionCompatParcelizer(setmsdelayRemoteActionCompatParcelizer);
            setmsdelayRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        } while (setmsdelayRemoteActionCompatParcelizer != null);
        return sethtmlloadlistener;
    }

    private setHtmlLoadListener read(ResetBookmarkRequestBody resetBookmarkRequestBody) throws IOException {
        int iIconCompatParcelizer = resetBookmarkRequestBody.IconCompatParcelizer();
        return iIconCompatParcelizer <= 0 ? new setHtmlLoadListener(0) : new getHideRunner(resetBookmarkRequestBody, iIconCompatParcelizer, this.IconCompatParcelizer, this.read).IconCompatParcelizer();
    }
}
