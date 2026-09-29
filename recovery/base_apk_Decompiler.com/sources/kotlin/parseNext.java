package kotlin;

import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class parseNext {
    private int AudioAttributesCompatParcelizer;
    private RtspMessageChannel IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public parseNext(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        this.RemoteActionCompatParcelizer = 2;
        this.MediaBrowserCompatItemReceiver = 2;
        this.read = 2;
        this.write = 2;
        this.AudioAttributesCompatParcelizer = 2;
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for integrity status, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        for (LottieRatingBar lottieRatingBar2 : (setMsFixedDuration) lottieRatingBar) {
            if (!(lottieRatingBar2 instanceof ZoomableLinearLayoutManager)) {
                StringBuilder sb2 = new StringBuilder("Expected tagged object, found ");
                sb2.append(lottieRatingBar2.getClass().getName());
                throw new CertificateParsingException(sb2.toString());
            }
            ZoomableLinearLayoutManager zoomableLinearLayoutManager = (ZoomableLinearLayoutManager) lottieRatingBar2;
            int iAudioAttributesImplBaseParcelizer = zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer();
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = zoomableLinearLayoutManager.read().AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplBaseParcelizer == 0) {
                this.RemoteActionCompatParcelizer = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 1) {
                this.MediaBrowserCompatItemReceiver = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 2) {
                this.read = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 3) {
                this.write = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 4) {
                this.AudioAttributesCompatParcelizer = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 5) {
                this.IconCompatParcelizer = RtspMessageChannel.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else {
                throw new CertificateParsingException("invalid tag no: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer)));
            }
        }
    }

    public static String read(int i) {
        if (i == 0) {
            return "Normal";
        }
        if (i == 1) {
            return "Abnormal";
        }
        if (i == 2) {
            return "Not support";
        }
        return Integer.toHexString(i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrustBoot: ");
        sb.append(read(this.RemoteActionCompatParcelizer));
        sb.append("\nWarranty: ");
        sb.append(read(this.MediaBrowserCompatItemReceiver));
        sb.append("\nICD: ");
        sb.append(read(this.read));
        sb.append("\nKernel Status: ");
        sb.append(read(this.write));
        sb.append("\nSystem Status: ");
        sb.append(read(this.AudioAttributesCompatParcelizer));
        sb.append("\nCaller auth(with PROCA) Status: \n");
        RtspMessageChannel rtspMessageChannel = this.IconCompatParcelizer;
        sb.append(rtspMessageChannel == null ? "Not performed" : rtspMessageChannel.toString());
        return sb.toString();
    }
}
