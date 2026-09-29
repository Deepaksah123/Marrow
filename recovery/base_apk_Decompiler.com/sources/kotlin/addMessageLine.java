package kotlin;

import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class addMessageLine {
    private final boolean IconCompatParcelizer;
    private final byte[] RemoteActionCompatParcelizer;
    private final int read;
    private final byte[] write;

    public addMessageLine(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for root of trust, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        setMsFixedDuration setmsfixedduration = (setMsFixedDuration) lottieRatingBar;
        this.RemoteActionCompatParcelizer = getInitializationDataFromParameterSet.IconCompatParcelizer(setmsfixedduration.IconCompatParcelizer(0));
        this.IconCompatParcelizer = getInitializationDataFromParameterSet.RemoteActionCompatParcelizer(setmsfixedduration.IconCompatParcelizer(1));
        this.read = getInitializationDataFromParameterSet.write(setmsfixedduration.IconCompatParcelizer(2));
        if (setmsfixedduration.RemoteActionCompatParcelizer() == 3) {
            this.write = null;
        } else {
            this.write = getInitializationDataFromParameterSet.IconCompatParcelizer(setmsfixedduration.IconCompatParcelizer(3));
        }
    }

    addMessageLine(byte[] bArr, boolean z, int i, byte[] bArr2) {
        this.RemoteActionCompatParcelizer = bArr;
        this.IconCompatParcelizer = z;
        this.read = i;
        this.write = bArr2;
    }

    public static String read(int i) {
        if (i == 0) {
            return "Verified";
        }
        if (i == 1) {
            return "Self-signed";
        }
        if (i == 2) {
            return "Unverified";
        }
        if (i == 3) {
            return "Failed";
        }
        StringBuilder sb = new StringBuilder("Unknown (");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final byte[] read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final byte[] IconCompatParcelizer() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("verifiedBootKey: ");
        sb.append(getCurrentSampleSize.RemoteActionCompatParcelizer().read(this.RemoteActionCompatParcelizer));
        sb.append("\ndeviceLocked: ");
        sb.append(this.IconCompatParcelizer);
        sb.append("\nverifiedBootState: ");
        sb.append(read(this.read));
        if (this.write != null) {
            sb.append("\nverifiedBootHash: ");
            sb.append(getCurrentSampleSize.RemoteActionCompatParcelizer().read(this.write));
        }
        return sb.toString();
    }

    public static class read {
        private byte[] RemoteActionCompatParcelizer;
        private byte[] read;
        private boolean IconCompatParcelizer = false;
        private int write = -1;

        public final read write(byte[] bArr) {
            this.RemoteActionCompatParcelizer = bArr;
            return this;
        }

        public final read write(boolean z) {
            this.IconCompatParcelizer = z;
            return this;
        }

        public final read read(int i) {
            this.write = i;
            return this;
        }

        public final read IconCompatParcelizer(byte[] bArr) {
            this.read = bArr;
            return this;
        }

        public final addMessageLine write() {
            return new addMessageLine(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, this.write, this.read);
        }
    }
}
