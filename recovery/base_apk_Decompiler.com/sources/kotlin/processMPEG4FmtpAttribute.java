package kotlin;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.onEmsgLeafAtomRead;

/* JADX INFO: loaded from: classes3.dex */
public abstract class processMPEG4FmtpAttribute {
    RtspMessageChannelInterleavedBinaryDataListener AudioAttributesCompatParcelizer;
    byte[] AudioAttributesImplApi21Parcelizer;
    RtspMessageChannelInterleavedBinaryDataListener AudioAttributesImplApi26Parcelizer;
    byte[] IconCompatParcelizer;
    private Set<String> MediaBrowserCompatItemReceiver;
    int RemoteActionCompatParcelizer;
    int read;
    int write;

    public abstract addMessageLine AudioAttributesCompatParcelizer();

    public abstract int RemoteActionCompatParcelizer();

    public static processMPEG4FmtpAttribute RemoteActionCompatParcelizer(X509Certificate x509Certificate) throws CertificateParsingException {
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") == null && x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") == null) {
            throw new CertificateParsingException("No attestation extensions found");
        }
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.25") != null) {
            if (x509Certificate.getExtensionValue("1.3.6.1.4.1.11129.2.1.17") != null) {
                throw new CertificateParsingException("Multiple attestation extensions found");
            }
            try {
                return new RtspMessageChannelMessageParser(x509Certificate);
            } catch (ExoPlaybackExceptionType e) {
                throw new CertificateParsingException("Unable to parse EAT extension", e);
            }
        }
        x509Certificate.getExtensionValue("2.5.29.31");
        if (x509Certificate.getExtensionValue("1.3.6.1.4.1.236.11.3.23.7") != null) {
            return new RtspMessageChannelReceiver(x509Certificate);
        }
        return new extractTrackUri(x509Certificate);
    }

    processMPEG4FmtpAttribute(X509Certificate x509Certificate) {
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(x509Certificate);
    }

    private static String AudioAttributesCompatParcelizer(int i) {
        if (i == 0) {
            return "Software";
        }
        if (i == 1) {
            return "TEE";
        }
        if (i == 2) {
            return "StrongBox";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    private static String write(int i) {
        if (i == 1) {
            return "Keymaster 2.0";
        }
        if (i == 2) {
            return "Keymaster 3.0";
        }
        if (i == 3) {
            return "Keymaster 4.0";
        }
        if (i == 4) {
            return "Keymaster 4.1";
        }
        if (i == 100) {
            return "KeyMint 1.0";
        }
        if (i == 200) {
            return "KeyMint 2.0";
        }
        if (i == 300) {
            return "KeyMint 3.0";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    private static String read(int i) {
        if (i == 0) {
            return "Keymaster 0.2 or 0.3";
        }
        if (i == 1) {
            return "Keymaster 1.0";
        }
        if (i == 2) {
            return "Keymaster 2.0";
        }
        if (i == 3) {
            return "Keymaster 3.0";
        }
        if (i == 4) {
            return "Keymaster 4.0";
        }
        if (i == 41) {
            return "Keymaster 4.1";
        }
        if (i == 100) {
            return "KeyMint 1.0";
        }
        if (i == 200) {
            return "KeyMint 2.0";
        }
        if (i == 300) {
            return "KeyMint 3.0";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final RtspMessageChannelInterleavedBinaryDataListener read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Extension type: ");
        sb2.append(getClass());
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("\nAttest version: ");
        sb3.append(write(this.read));
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("\nAttest security: ");
        sb4.append(AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer()));
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("\nKM version: ");
        sb5.append(read(this.write));
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder("\nKM security: ");
        sb6.append(AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer));
        sb.append(sb6.toString());
        sb.append("\nChallenge");
        byte[] bArr = this.IconCompatParcelizer;
        String str = bArr != null ? new String(bArr) : "null";
        if (parseMetaDataSampleEntry.AudioAttributesCompatParcelizer().read(str)) {
            StringBuilder sb7 = new StringBuilder(": [");
            sb7.append(str);
            sb7.append("]");
            sb.append(sb7.toString());
        } else {
            StringBuilder sb8 = new StringBuilder(" (base64): [");
            sb8.append(getCurrentSampleSize.IconCompatParcelizer().read(this.IconCompatParcelizer));
            sb8.append("]");
            sb.append(sb8.toString());
        }
        if (this.AudioAttributesImplApi21Parcelizer != null) {
            StringBuilder sb9 = new StringBuilder("\nUnique ID (base64): [");
            sb9.append(getCurrentSampleSize.IconCompatParcelizer().read(this.AudioAttributesImplApi21Parcelizer));
            sb9.append("]");
            sb.append(sb9.toString());
        }
        sb.append("\n-- SW enforced --");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append("\n-- TEE enforced --");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        return sb.toString();
    }

    private static Set<String> AudioAttributesCompatParcelizer(X509Certificate x509Certificate) {
        return new onEmsgLeafAtomRead.IconCompatParcelizer().IconCompatParcelizer((Iterator) x509Certificate.getCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: o.parseAacStreamMuxConfig
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return processMPEG4FmtpAttribute.IconCompatParcelizer((String) obj);
            }
        }).iterator()).IconCompatParcelizer((Iterator) x509Certificate.getNonCriticalExtensionOIDs().stream().filter(new Predicate() { // from class: o.processAacFmtpAttribute
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return processMPEG4FmtpAttribute.read((String) obj);
            }
        }).iterator()).write();
    }

    static /* synthetic */ boolean IconCompatParcelizer(String str) {
        return !"2.5.29.15".equals(str);
    }

    static /* synthetic */ boolean read(String str) {
        return ("1.3.6.1.4.1.11129.2.1.17".equals(str) || "1.3.6.1.4.1.11129.2.1.25".equals(str)) ? false : true;
    }
}
