package kotlin;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class InteractivePanelTextView extends setMsDelay implements setOnRatingBarChangedListener {
    final byte[] IconCompatParcelizer;
    static final setScaleType read = new setScaleType(InteractivePanelTextView.class) { // from class: o.InteractivePanelTextView.1
        @Override // kotlin.setScaleType
        final setMsDelay AudioAttributesCompatParcelizer(setMsFixedDuration setmsfixedduration) {
            return setmsfixedduration.AudioAttributesImplBaseParcelizer();
        }

        @Override // kotlin.setScaleType
        final setMsDelay read(EmptyBody emptyBody) {
            return InteractivePanelTextView.IconCompatParcelizer(emptyBody.read());
        }
    };
    private static final char[] RemoteActionCompatParcelizer = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    InteractivePanelTextView(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        this.IconCompatParcelizer = SampleVideosRSModel.write(bArr, (byte) i);
    }

    InteractivePanelTextView(byte[] bArr, boolean z) {
        this.IconCompatParcelizer = bArr;
    }

    static InteractivePanelTextView IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b = bArr[length - 1];
            if (b != ((byte) ((255 << i) & b))) {
                return new setNetworkObserver(bArr);
            }
        }
        return new isSuppressed(bArr);
    }

    public static InteractivePanelTextView write(Object obj) {
        if (obj == null || (obj instanceof InteractivePanelTextView)) {
            return (InteractivePanelTextView) obj;
        }
        if (obj instanceof LottieRatingBar) {
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = ((LottieRatingBar) obj).AudioAttributesImplApi26Parcelizer();
            if (setmsdelayAudioAttributesImplApi26Parcelizer instanceof InteractivePanelTextView) {
                return (InteractivePanelTextView) setmsdelayAudioAttributesImplApi26Parcelizer;
            }
        }
        StringBuilder sb = new StringBuilder("illegal object in getInstance: ");
        sb.append(obj.getClass().getName());
        throw new IllegalArgumentException(sb.toString());
    }

    public static InteractivePanelTextView AudioAttributesCompatParcelizer(ZoomableLinearLayoutManager zoomableLinearLayoutManager) {
        return (InteractivePanelTextView) read.IconCompatParcelizer(zoomableLinearLayoutManager, false);
    }

    @Override // kotlin.setMsDelay
    final boolean IconCompatParcelizer(setMsDelay setmsdelay) {
        if (!(setmsdelay instanceof InteractivePanelTextView)) {
            return false;
        }
        byte[] bArr = this.IconCompatParcelizer;
        byte[] bArr2 = ((InteractivePanelTextView) setmsdelay).IconCompatParcelizer;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final InputStream RemoteActionCompatParcelizer() throws IOException {
        byte[] bArr = this.IconCompatParcelizer;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // kotlin.toResetBookmarkRepoModel
    public final setMsDelay AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.setOnRatingBarChangedListener
    public final int read() {
        return this.IconCompatParcelizer[0] & 255;
    }

    private String AudioAttributesImplApi21Parcelizer() {
        try {
            byte[] bArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            StringBuffer stringBuffer = new StringBuffer((bArrMediaBrowserCompatCustomActionResultReceiver.length << 1) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != bArrMediaBrowserCompatCustomActionResultReceiver.length; i++) {
                byte b = bArrMediaBrowserCompatCustomActionResultReceiver[i];
                char[] cArr = RemoteActionCompatParcelizer;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Internal error encoding BitString: ");
            sb.append(e.getMessage());
            throw new setHideRunner(sb.toString(), e);
        }
    }

    @Override // kotlin.setBlinkerTexts
    public int hashCode() {
        byte[] bArr = this.IconCompatParcelizer;
        if (bArr.length < 2) {
            return 1;
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        return (SampleVideosRSModel.IconCompatParcelizer(bArr, length) * 257) ^ ((byte) ((255 << (b & 255)) & bArr[length]));
    }

    @Override // kotlin.setMsDelay
    setMsDelay IconCompatParcelizer() {
        return new isSuppressed(this.IconCompatParcelizer);
    }

    @Override // kotlin.setMsDelay
    setMsDelay MediaBrowserCompatItemReceiver() {
        return new setNetworkObserver(this.IconCompatParcelizer);
    }

    public String toString() {
        return AudioAttributesImplApi21Parcelizer();
    }
}
