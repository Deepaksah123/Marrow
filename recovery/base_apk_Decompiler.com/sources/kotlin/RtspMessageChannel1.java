package kotlin;

import java.security.cert.CertificateParsingException;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMessageChannel1 implements Comparable<RtspMessageChannel1> {
    private final String AudioAttributesCompatParcelizer;
    private final long RemoteActionCompatParcelizer;

    public RtspMessageChannel1(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for AttestationPackageInfo, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        setMsFixedDuration setmsfixedduration = (setMsFixedDuration) lottieRatingBar;
        this.AudioAttributesCompatParcelizer = getInitializationDataFromParameterSet.AudioAttributesImplApi26Parcelizer(setmsfixedduration.IconCompatParcelizer(0));
        this.RemoteActionCompatParcelizer = getInitializationDataFromParameterSet.read(setmsfixedduration.IconCompatParcelizer(1)).longValue();
    }

    private String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private long read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(" (version code ");
        sb.append(read());
        sb.append(")");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final int compareTo(RtspMessageChannel1 rtspMessageChannel1) {
        int iCompareTo = this.AudioAttributesCompatParcelizer.compareTo(rtspMessageChannel1.AudioAttributesCompatParcelizer);
        return iCompareTo != 0 ? iCompareTo : Long.compare(this.RemoteActionCompatParcelizer, rtspMessageChannel1.RemoteActionCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof RtspMessageChannel1) && compareTo((RtspMessageChannel1) obj) == 0;
    }
}
