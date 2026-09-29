package kotlin;

import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannel {
    private String AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private String RemoteActionCompatParcelizer;
    private int read;

    private RtspMessageChannel(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        this.read = 2;
        this.IconCompatParcelizer = 2;
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for caller auth, found ");
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
                this.read = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 1) {
                this.RemoteActionCompatParcelizer = getInitializationDataFromParameterSet.MediaBrowserCompatItemReceiver(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 2) {
                this.AudioAttributesCompatParcelizer = getInitializationDataFromParameterSet.MediaBrowserCompatItemReceiver(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 3) {
                this.IconCompatParcelizer = getInitializationDataFromParameterSet.write(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else {
                throw new CertificateParsingException("invalid tag no: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer)));
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Caller Auth Result: ");
        sb.append(parseNext.read(this.read));
        sb.append("\nCalling Package: ");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("\nCalling Package Signatures: ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("\nCalling Package Auth Result: ");
        sb.append(parseNext.read(this.IconCompatParcelizer));
        return sb.toString();
    }

    public static RtspMessageChannel write(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        RtspMessageChannel rtspMessageChannel = new RtspMessageChannel(lottieRatingBar);
        if (rtspMessageChannel.read == 2 && rtspMessageChannel.RemoteActionCompatParcelizer == null && rtspMessageChannel.AudioAttributesCompatParcelizer == null && rtspMessageChannel.IconCompatParcelizer == 2) {
            return null;
        }
        return rtspMessageChannel;
    }
}
