package kotlin;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannelReceiver extends extractTrackUri {
    private parseNext AudioAttributesImplBaseParcelizer;
    private byte[] MediaBrowserCompatCustomActionResultReceiver;
    private String MediaBrowserCompatItemReceiver;

    public RtspMessageChannelReceiver(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        for (LottieRatingBar lottieRatingBar : write(x509Certificate)) {
            if (!(lottieRatingBar instanceof ZoomableLinearLayoutManager)) {
                StringBuilder sb = new StringBuilder("Expected tagged object, found ");
                sb.append(lottieRatingBar.getClass().getName());
                throw new CertificateParsingException(sb.toString());
            }
            ZoomableLinearLayoutManager zoomableLinearLayoutManager = (ZoomableLinearLayoutManager) lottieRatingBar;
            int iAudioAttributesImplBaseParcelizer = zoomableLinearLayoutManager.AudioAttributesImplBaseParcelizer();
            setMsDelay setmsdelayAudioAttributesImplApi26Parcelizer = zoomableLinearLayoutManager.read().AudioAttributesImplApi26Parcelizer();
            if (iAudioAttributesImplBaseParcelizer == 0) {
                this.MediaBrowserCompatItemReceiver = getInitializationDataFromParameterSet.MediaBrowserCompatItemReceiver(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 5) {
                this.AudioAttributesImplBaseParcelizer = new parseNext(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else if (iAudioAttributesImplBaseParcelizer == 6) {
                this.MediaBrowserCompatCustomActionResultReceiver = getInitializationDataFromParameterSet.IconCompatParcelizer(setmsdelayAudioAttributesImplApi26Parcelizer);
            } else {
                throw new CertificateParsingException("invalid tag no: ".concat(String.valueOf(iAudioAttributesImplBaseParcelizer)));
            }
        }
    }

    private static setMsFixedDuration write(X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.236.11.3.23.7");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.236.11.3.23.7");
        }
        return getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(extensionValue);
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\n\nExtension type: ");
        sb.append(getClass().getSimpleName());
        sb.append("\nChallenge: ");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append("\nIntegrity status: ");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append("\nAttestation record hash: ");
        sb.append(getCurrentSampleSize.RemoteActionCompatParcelizer().read(this.MediaBrowserCompatCustomActionResultReceiver));
        return sb.toString();
    }
}
