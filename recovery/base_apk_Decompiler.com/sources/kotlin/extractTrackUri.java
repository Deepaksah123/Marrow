package kotlin;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes3.dex */
public class extractTrackUri extends processMPEG4FmtpAttribute {
    private int MediaBrowserCompatItemReceiver;

    public extractTrackUri(X509Certificate x509Certificate) throws CertificateParsingException {
        super(x509Certificate);
        setMsFixedDuration setmsfixeddurationWrite = write(x509Certificate);
        this.read = getInitializationDataFromParameterSet.write(setmsfixeddurationWrite.IconCompatParcelizer(0));
        this.MediaBrowserCompatItemReceiver = getInitializationDataFromParameterSet.write(setmsfixeddurationWrite.IconCompatParcelizer(1));
        this.write = getInitializationDataFromParameterSet.write(setmsfixeddurationWrite.IconCompatParcelizer(2));
        this.RemoteActionCompatParcelizer = getInitializationDataFromParameterSet.write(setmsfixeddurationWrite.IconCompatParcelizer(3));
        this.IconCompatParcelizer = getInitializationDataFromParameterSet.IconCompatParcelizer(setmsfixeddurationWrite.IconCompatParcelizer(4));
        this.AudioAttributesImplApi21Parcelizer = getInitializationDataFromParameterSet.IconCompatParcelizer(setmsfixeddurationWrite.IconCompatParcelizer(5));
        this.AudioAttributesCompatParcelizer = new RtspMessageChannelInterleavedBinaryDataListener(setmsfixeddurationWrite.IconCompatParcelizer(6));
        this.AudioAttributesImplApi26Parcelizer = new RtspMessageChannelInterleavedBinaryDataListener(setmsfixeddurationWrite.IconCompatParcelizer(7));
    }

    private static setMsFixedDuration write(X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.17");
        }
        return getInitializationDataFromParameterSet.AudioAttributesCompatParcelizer(extensionValue);
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final int RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final addMessageLine AudioAttributesCompatParcelizer() {
        addMessageLine addmessagelineOnRemoveQueueItemAt = this.AudioAttributesImplApi26Parcelizer.onRemoveQueueItemAt();
        return addmessagelineOnRemoveQueueItemAt != null ? addmessagelineOnRemoveQueueItemAt : this.AudioAttributesCompatParcelizer.onRemoveQueueItemAt();
    }
}
