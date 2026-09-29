package kotlin;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import kotlin.addMessageLine;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannelMessageParser extends processMPEG4FmtpAttribute {
    private lambdanew5 MediaBrowserCompatCustomActionResultReceiver;
    private addMessageLine MediaBrowserCompatItemReceiver;

    public RtspMessageChannelMessageParser(X509Certificate x509Certificate) throws ExoPlaybackExceptionType, CertificateParsingException {
        super(x509Certificate);
        lambdanew5 lambdanew5VarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(x509Certificate);
        this.MediaBrowserCompatCustomActionResultReceiver = lambdanew5VarAudioAttributesCompatParcelizer;
        addMessageLine.read readVar = new addMessageLine.read();
        List<Boolean> listIconCompatParcelizer = null;
        boolean zBooleanValue = false;
        for (lambdanew10 lambdanew10Var : lambdanew5VarAudioAttributesCompatParcelizer.write()) {
            int iIntValue = ((lambdanew6) lambdanew10Var).RemoteActionCompatParcelizer().intValue();
            if (iIntValue == -76000) {
                lambdanew5 lambdanew5Var = (lambdanew5) this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(lambdanew10Var);
                this.AudioAttributesCompatParcelizer = new RtspMessageChannelInterleavedBinaryDataListener((lambdanew5) lambdanew5Var.AudioAttributesCompatParcelizer(new lambdasetRenderersFactory16("software")));
                this.AudioAttributesImplApi26Parcelizer = new RtspMessageChannelInterleavedBinaryDataListener((lambdanew5) lambdanew5Var.AudioAttributesCompatParcelizer(new lambdasetRenderersFactory16("tee")));
            } else if (iIntValue == -75008) {
                this.IconCompatParcelizer = RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var);
            } else if (iIntValue != 7) {
                switch (iIntValue) {
                    case -82006:
                        zBooleanValue = RtspMessageChannelLoaderCallbackImpl.write(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var).booleanValue();
                        break;
                    case -82005:
                        this.write = RtspMessageChannelLoaderCallbackImpl.read(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var);
                        break;
                    case -82004:
                        this.read = RtspMessageChannelLoaderCallbackImpl.read(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var);
                        break;
                    case -82003:
                        readVar.IconCompatParcelizer(RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var));
                        break;
                    case -82002:
                        readVar.write(RtspMessageChannelLoaderCallbackImpl.write(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var).booleanValue());
                        break;
                    case -82001:
                        readVar.write(RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var));
                        break;
                    default:
                        switch (iIntValue) {
                            case -76003:
                                listIconCompatParcelizer = RtspMessageChannelLoaderCallbackImpl.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var);
                                break;
                            case -76002:
                                this.RemoteActionCompatParcelizer = write(RtspMessageChannelLoaderCallbackImpl.read(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var));
                                break;
                            default:
                                StringBuilder sb = new StringBuilder("Unknown EAT tag: ");
                                sb.append(lambdanew10Var);
                                sb.append("\n in EAT extension:\n");
                                sb.append(this);
                                throw new CertificateParsingException(sb.toString());
                        }
                        break;
                }
            } else {
                Arrays.toString(RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var));
                this.AudioAttributesImplApi21Parcelizer = RtspMessageChannelLoaderCallbackImpl.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lambdanew10Var);
            }
        }
        if (listIconCompatParcelizer != null) {
            readVar.read(AudioAttributesCompatParcelizer(listIconCompatParcelizer, Boolean.valueOf(zBooleanValue)));
        }
        this.MediaBrowserCompatItemReceiver = readVar.write();
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final int RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer != null && this.AudioAttributesImplApi26Parcelizer.read() != null) {
            return this.AudioAttributesImplApi26Parcelizer.onSetCaptioningEnabled().intValue();
        }
        if (this.AudioAttributesCompatParcelizer == null || this.AudioAttributesCompatParcelizer.read() == null) {
            return -1;
        }
        return this.AudioAttributesCompatParcelizer.onSetCaptioningEnabled().intValue();
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final addMessageLine AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // kotlin.processMPEG4FmtpAttribute
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\nEncoded CBOR: ");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        return sb.toString();
    }

    private static lambdanew5 AudioAttributesCompatParcelizer(X509Certificate x509Certificate) throws ExoPlaybackExceptionType, CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25");
        if (extensionValue == null || extensionValue.length == 0) {
            throw new CertificateParsingException("Did not find extension with OID 1.3.6.1.4.1.11129.2.1.25");
        }
        return (lambdanew5) copyWithMediaPeriodId.write(getInitializationDataFromParameterSet.IconCompatParcelizer(getInitializationDataFromParameterSet.IconCompatParcelizer(extensionValue))).get(0);
    }

    static int write(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        throw new RuntimeException("Invalid EAT security level: ".concat(String.valueOf(i)));
    }

    private static int AudioAttributesCompatParcelizer(List<Boolean> list, Boolean bool) {
        if (list.size() != 5) {
            StringBuilder sb = new StringBuilder("Boot state map has unexpected size: ");
            sb.append(list.size());
            throw new RuntimeException(sb.toString());
        }
        if (list.get(4).booleanValue()) {
            throw new RuntimeException("debug-permanent-disable must never be true: ".concat(String.valueOf(list)));
        }
        boolean zBooleanValue = list.get(0).booleanValue();
        if (zBooleanValue != list.get(1).booleanValue() && zBooleanValue != list.get(2).booleanValue() && zBooleanValue != list.get(3).booleanValue()) {
            throw new RuntimeException("Unexpected boot state: ".concat(String.valueOf(list)));
        }
        if (!bool.booleanValue()) {
            return zBooleanValue ? 1 : 2;
        }
        if (zBooleanValue) {
            return 0;
        }
        throw new AssertionError("Non-verified official build");
    }
}
