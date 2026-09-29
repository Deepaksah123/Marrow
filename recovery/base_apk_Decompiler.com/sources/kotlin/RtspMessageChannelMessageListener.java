package kotlin;

import android.content.res.Resources;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannelMessageListener {
    private Integer AudioAttributesImplApi26Parcelizer;
    private CertificateParsingException AudioAttributesImplBaseParcelizer;
    private final X509Certificate MediaBrowserCompatCustomActionResultReceiver;
    private GeneralSecurityException MediaBrowserCompatItemReceiver;
    private processMPEG4FmtpAttribute RemoteActionCompatParcelizer;
    private static final byte[] write = Base64.decode("MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAr7bHgiuxpwHsK7Qui8xUFmOr75gvMsd/dTEDDJdSSxtf6An7xyqpRR90PL2abxM1dEqlXnf2tqw1Ne4Xwl5jlRfdnJLmN0pTy/4lj4/7tv0Sk3iiKkypnEUtR6WfMgH0QZfKHM1+di+y9TFRtv6y//0rb+T+W8a9nsNL/ggjnar86461qO0rOs2cXjp3kOG1FEJ5MVmFmBGtnrKpa73XpXyTqRxB/M0n1n/W9nGqC4FSYa04T6N5RIZGBN2z2MT5IKGbFlbC8UrW0DxW7AYImQQcHtGl/m00QLVWutHQoVJYnFPlXTcHYvASLu+RhhsbDmxMgJJ0mcDpvsC4PjvB+TxywElgS70vE0XmLD+OJtvsBslHZvPBKCOdT0MS+tgSOIfga+z1Z1g7+DVagf7quvmag8jfPioyKvxnK/EgsTUVi2ghzq8wm27ud/mIM7AY2qEORR8Go3TVB4HzWQgpZrt3i5MIlCaY504LzSRiigHCzAPlHws+W0rB5N+er5/2pJKnfBSDiCiFAVtCLOZ7gLiMm0jhO2B6tUXHI/+MRPjy02i59lINMRRev56GKtcd9qO/0kUJWdZTdA2XoS82ixPvZtXQpUpuL12ab+9EaDK8Z4RHJYYfCT3Q5vNAXaiWQ+8PTWm2QgBR/bkwSWc+NpUFgNPN9PvQi8WEg5UmAGMCAwEAAQ==", 0);
    private static final byte[] read = Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE7l1ex+HA220Dpn7mthvsTWpdamguD/9/SQ59dx9EIm29sa/6FsvHrcV30lacqrewLVQBXT5DKyqO107sSHVBpA==", 0);
    private static final byte[] AudioAttributesCompatParcelizer = Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCia63rbi5EYe/VDoLmt5TRdSMfd5tjkWP/96r/C3JHTsAsQ+wzfNes7UA+jCigZtX3hwszl94OuE4TQKuvpSe/lWmgMdsGUmX4RFlXYfC78hdLt0GAZMAoDo9Sd47b0ke2RekZyOmLw9vCkT/X11DEHTVm+Vfkl5YLCazOkjWFmwIDAQAB", 0);
    private static final byte[] IconCompatParcelizer = Base64.decode("MIGbMBAGByqGSM49AgEGBSuBBAAjA4GGAAQBhbGuLrpql5I2WJmrE5kEVZOo+dgA46mKrVJf/sgzfzs2u7M9c1Y9ZkCEiiYkhTFE9vPbasmUfXybwgZ2EM30A1ABPd124n3JbEDfsB/wnMH1AcgsJyJFPbETZiy42Fhwi+2BCA5bcHe7SrdkRIYSsdBRaKBoZsapxB0gAOs0jSPRX5M=", 0);
    private int AudioAttributesImplApi21Parcelizer = 0;
    private int MediaMetadataCompat = 0;

    private RtspMessageChannelMessageListener(X509Certificate x509Certificate) {
        this.MediaBrowserCompatCustomActionResultReceiver = x509Certificate;
    }

    public final X509Certificate AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final GeneralSecurityException RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final processMPEG4FmtpAttribute IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final CertificateParsingException read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    private void write(Resources resources) {
        Set<PublicKey> setIconCompatParcelizer = IconCompatParcelizer(resources);
        byte[] encoded = this.MediaBrowserCompatCustomActionResultReceiver.getPublicKey().getEncoded();
        if (Arrays.equals(encoded, write)) {
            this.AudioAttributesImplApi21Parcelizer = 2;
            return;
        }
        if (Arrays.equals(encoded, read)) {
            this.AudioAttributesImplApi21Parcelizer = 1;
            return;
        }
        if (Arrays.equals(encoded, AudioAttributesCompatParcelizer)) {
            this.AudioAttributesImplApi21Parcelizer = 1;
            return;
        }
        if (Arrays.equals(encoded, IconCompatParcelizer)) {
            this.AudioAttributesImplApi21Parcelizer = 3;
            return;
        }
        if (setIconCompatParcelizer != null) {
            Iterator<PublicKey> it = setIconCompatParcelizer.iterator();
            while (it.hasNext()) {
                if (Arrays.equals(encoded, it.next().getEncoded())) {
                    this.AudioAttributesImplApi21Parcelizer = 4;
                    return;
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Resources resources, PublicKey publicKey) {
        try {
            this.MediaMetadataCompat = 1;
            this.MediaBrowserCompatCustomActionResultReceiver.verify(publicKey);
            this.MediaMetadataCompat = 2;
            addMessageBody addmessagebodyAudioAttributesCompatParcelizer = addMessageBody.AudioAttributesCompatParcelizer(resources, this.MediaBrowserCompatCustomActionResultReceiver.getSerialNumber());
            if (addmessagebodyAudioAttributesCompatParcelizer != null) {
                StringBuilder sb = new StringBuilder("Certificate revocation ");
                sb.append(addmessagebodyAudioAttributesCompatParcelizer);
                throw new CertificateException(sb.toString());
            }
            this.MediaMetadataCompat = 3;
            this.MediaBrowserCompatCustomActionResultReceiver.checkValidity();
            this.MediaMetadataCompat = 4;
        } catch (GeneralSecurityException e) {
            this.MediaBrowserCompatItemReceiver = e;
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        try {
            processMPEG4FmtpAttribute processmpeg4fmtpattributeRemoteActionCompatParcelizer = processMPEG4FmtpAttribute.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            this.RemoteActionCompatParcelizer = processmpeg4fmtpattributeRemoteActionCompatParcelizer;
            Set<Integer> setOnPlayFromUri = processmpeg4fmtpattributeRemoteActionCompatParcelizer.read().onPlayFromUri();
            if (setOnPlayFromUri != null) {
                return !setOnPlayFromUri.contains(7);
            }
            return true;
        } catch (CertificateParsingException e) {
            this.AudioAttributesImplBaseParcelizer = e;
            this.MediaBrowserCompatItemReceiver();
            return false;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        byte[] extensionValue = this.MediaBrowserCompatCustomActionResultReceiver.getExtensionValue("1.3.6.1.4.1.11129.2.1.30");
        if (extensionValue == null) {
            return;
        }
        try {
            getHideRunner gethiderunner = new getHideRunner(extensionValue);
            try {
                lambdanew5 lambdanew5Var = (lambdanew5) copyWithMediaPeriodId.write(((setIsTablet) gethiderunner.RemoteActionCompatParcelizer()).read()).get(0);
                for (lambdanew10 lambdanew10Var : lambdanew5Var.write()) {
                    if (((lambdanew6) lambdanew10Var).RemoteActionCompatParcelizer().intValue() == 1) {
                        this.AudioAttributesImplApi26Parcelizer = Integer.valueOf(RtspMessageChannelLoaderCallbackImpl.read(lambdanew5Var, lambdanew10Var));
                    } else {
                        Objects.toString(lambdanew5Var.AudioAttributesCompatParcelizer(lambdanew10Var));
                    }
                }
                gethiderunner.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static onInterleavedBinaryDataReceived read(Resources resources, List<X509Certificate> list) {
        ArrayList arrayList = new ArrayList();
        X509Certificate x509Certificate = list.get(list.size() - 1);
        for (int size = list.size() - 1; size >= 0; size--) {
            PublicKey publicKey = x509Certificate.getPublicKey();
            RtspMessageChannelMessageListener rtspMessageChannelMessageListener = new RtspMessageChannelMessageListener(list.get(size));
            arrayList.add(rtspMessageChannelMessageListener);
            rtspMessageChannelMessageListener.AudioAttributesCompatParcelizer(resources, publicKey);
            X509Certificate x509Certificate2 = rtspMessageChannelMessageListener.MediaBrowserCompatCustomActionResultReceiver;
            if (x509Certificate == x509Certificate2) {
                rtspMessageChannelMessageListener.write(resources);
            } else {
                x509Certificate = x509Certificate2;
            }
            if (rtspMessageChannelMessageListener.AudioAttributesImplApi21Parcelizer()) {
                break;
            }
        }
        return onInterleavedBinaryDataReceived.write(arrayList);
    }

    private static Set<PublicKey> IconCompatParcelizer(Resources resources) {
        int identifier = resources.getIdentifier("android:array/vendor_required_attestation_certificates", null, null);
        if (identifier == 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            for (String str : resources.getStringArray(identifier)) {
                hashSet.add(certificateFactory.generateCertificate(new ByteArrayInputStream(str.replaceAll("\\s+", "\n").replaceAll("-BEGIN\\nCERTIFICATE-", "-BEGIN CERTIFICATE-").replaceAll("-END\\nCERTIFICATE-", "-END CERTIFICATE-").getBytes())).getPublicKey());
            }
            hashSet.removeIf(new Predicate() { // from class: o.onSendingFailed
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Arrays.equals(((PublicKey) obj).getEncoded(), RtspMessageChannelMessageListener.write);
                }
            });
            if (hashSet.isEmpty()) {
                return null;
            }
            hashSet.forEach(new Consumer() { // from class: o.onReceivingFailed
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Objects.toString((PublicKey) obj);
                }
            });
            return hashSet;
        } catch (CertificateException unused) {
            return null;
        }
    }
}
