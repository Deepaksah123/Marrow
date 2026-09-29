package kotlin;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.StrongBoxUnavailableException;
import in.juspay.hypersdk.core.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannelSender implements handleInterleavedBinaryData {
    private final Context AudioAttributesCompatParcelizer;
    private final PackageManager AudioAttributesImplApi21Parcelizer;
    private final KeyStore AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final CertificateFactory IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private List<? extends X509Certificate> RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    public RtspMessageChannelSender(Context context) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesCompatParcelizer = context;
        PackageManager packageManager = context.getPackageManager();
        this.AudioAttributesImplApi21Parcelizer = packageManager;
        KeyStore keyStore = KeyStore.getInstance(Constants.ANDROID_KEYSTORE);
        this.AudioAttributesImplApi26Parcelizer = keyStore;
        this.IconCompatParcelizer = CertificateFactory.getInstance("X.509");
        this.MediaBrowserCompatItemReceiver = packageManager.hasSystemFeature("android.hardware.strongbox_keystore");
        boolean z = false;
        this.read = Build.VERSION.SDK_INT >= 31 && packageManager.hasSystemFeature("android.hardware.keystore.app_attest_key");
        if (Build.VERSION.SDK_INT >= 31 && packageManager.hasSystemFeature("android.software.device_id_attestation")) {
            z = true;
        }
        this.write = z;
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        this.MediaBrowserCompatMediaItem = true;
        this.AudioAttributesImplBaseParcelizer = true;
        keyStore.load(null);
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super processH264FmtpAttribute>, Object> {
        private int IconCompatParcelizer;
        private /* synthetic */ boolean write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            RtspMessageChannelSender rtspMessageChannelSender = RtspMessageChannelSender.this;
            boolean z = this.write;
            this.IconCompatParcelizer = 1;
            return rtspMessageChannelSender.write(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(boolean z, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return RtspMessageChannelSender.this.new RemoteActionCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super processH264FmtpAttribute> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.handleInterleavedBinaryData
    public final processH264FmtpAttribute AudioAttributesCompatParcelizer() {
        return (processH264FmtpAttribute) setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, new RemoteActionCompatParcelizer(true, null));
    }

    public final Object write(boolean z) throws KeyStoreException {
        this.RemoteActionCompatParcelizer = null;
        if (z) {
            IconCompatParcelizer();
        }
        try {
            read();
            return RemoteActionCompatParcelizer();
        } catch (Throwable th) {
            return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(-1, th));
        }
    }

    private final void IconCompatParcelizer() throws KeyStoreException {
        Enumeration<String> enumerationAliases = this.AudioAttributesImplApi26Parcelizer.aliases();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(enumerationAliases, "");
        Iterator itAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Enumeration) enumerationAliases);
        while (itAudioAttributesCompatParcelizer.hasNext()) {
            this.AudioAttributesImplApi26Parcelizer.deleteEntry((String) itAudioAttributesCompatParcelizer.next());
        }
    }

    private final void read() throws GeneralSecurityException {
        String string;
        boolean z = false;
        boolean z2 = this.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatMediaItem;
        boolean z3 = this.write && this.AudioAttributesImplBaseParcelizer;
        if (this.read && this.MediaBrowserCompatCustomActionResultReceiver) {
            z = true;
        }
        String packageName = this.AudioAttributesCompatParcelizer.getPackageName();
        if (z2) {
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append("_strongbox");
            packageName = sb.toString();
        }
        if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageName);
            sb2.append("_persistent");
            string = sb2.toString();
        } else {
            string = null;
        }
        if (z && !this.AudioAttributesImplApi26Parcelizer.containsAlias(string)) {
            toMagicModuleMetaRepoModel.write((Object) string);
            write(string, z2, z3, string);
        }
        toMagicModuleMetaRepoModel.write((Object) packageName);
        write(packageName, z2, z3, string);
    }

    private final processH264FmtpAttribute RemoteActionCompatParcelizer() {
        String string;
        String message;
        ArrayList arrayList = new ArrayList();
        boolean z = this.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatMediaItem;
        boolean z2 = this.read && this.MediaBrowserCompatCustomActionResultReceiver;
        String packageName = this.AudioAttributesCompatParcelizer.getPackageName();
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append("_strongbox");
            packageName = sb.toString();
        }
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageName);
            sb2.append("_persistent");
            string = sb2.toString();
        } else {
            string = null;
        }
        try {
            Certificate[] certificateChain = this.AudioAttributesImplApi26Parcelizer.getCertificateChain(packageName);
            if (certificateChain == null) {
                throw new CertificateException("Unable to get certificate chain");
            }
            for (Certificate certificate : certificateChain) {
                arrayList.add(this.IconCompatParcelizer.generateCertificate(new ByteArrayInputStream(certificate.getEncoded())));
            }
            if (z2) {
                Certificate[] certificateChain2 = this.AudioAttributesImplApi26Parcelizer.getCertificateChain(string);
                if (certificateChain2 == null) {
                    throw new CertificateException("Unable to get certificate chain");
                }
                for (Certificate certificate2 : certificateChain2) {
                    arrayList.add(this.IconCompatParcelizer.generateCertificate(new ByteArrayInputStream(certificate2.getEncoded())));
                }
            }
            ArrayList arrayList2 = arrayList;
            this.RemoteActionCompatParcelizer = arrayList2;
            onInterleavedBinaryDataReceived oninterleavedbinarydatareceived = RtspMessageChannelMessageListener.read(this.AudioAttributesCompatParcelizer.getResources(), arrayList2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(oninterleavedbinarydatareceived, "");
            return registerInterleavedBinaryDataListener.write(oninterleavedbinarydatareceived);
        } catch (ProviderException e) {
            Throwable cause = e.getCause();
            if (e instanceof StrongBoxUnavailableException) {
                return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(3, e));
            }
            if (Build.VERSION.SDK_INT >= 33 && (cause instanceof android.security.KeyStoreException)) {
                android.security.KeyStoreException keyStoreException = (android.security.KeyStoreException) cause;
                int numericErrorCode = keyStoreException.getNumericErrorCode();
                if (numericErrorCode == 8) {
                    return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(4, e));
                }
                if (numericErrorCode == 16) {
                    if (keyStoreException.isTransientFailure()) {
                        return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(6, e));
                    }
                    return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(5, e));
                }
                if (keyStoreException.isTransientFailure()) {
                    return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(7, e));
                }
                return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(0, e));
            }
            if (cause != null && (message = cause.getMessage()) != null && TestGroupLSModel.write((CharSequence) message, (CharSequence) "device ids", false)) {
                return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(4, e));
            }
            return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(0, e));
        } catch (Exception e2) {
            return registerInterleavedBinaryDataListener.RemoteActionCompatParcelizer(new parseNextLine(-1, e2));
        }
    }

    private static void write(String str, boolean z, boolean z2, String str2) throws GeneralSecurityException {
        Date date = new Date();
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) str2);
        KeyGenParameterSpec.Builder certificateNotBefore = new KeyGenParameterSpec.Builder(str, (Build.VERSION.SDK_INT < 31 || !zRemoteActionCompatParcelizer) ? 4 : 128).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setCertificateNotBefore(date);
        String string = date.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        byte[] bytes = string.getBytes(getSubmissionTimestamp.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        KeyGenParameterSpec.Builder attestationChallenge = certificateNotBefore.setAttestationChallenge(bytes);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(attestationChallenge, "");
        if (z) {
            attestationChallenge.setIsStrongBoxBacked(true);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (z2) {
                attestationChallenge.setDevicePropertiesAttestationIncluded(true);
            }
            if (zRemoteActionCompatParcelizer) {
                attestationChallenge.setCertificateSubject(new X500Principal("CN=App Attest Key"));
            } else {
                attestationChallenge.setAttestKeyAlias(str2);
            }
        }
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", Constants.ANDROID_KEYSTORE);
        keyPairGenerator.initialize(attestationChallenge.build());
        keyPairGenerator.generateKeyPair();
    }
}
