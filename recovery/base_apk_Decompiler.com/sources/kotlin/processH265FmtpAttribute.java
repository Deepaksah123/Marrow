package kotlin;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class processH265FmtpAttribute implements Comparable<processH265FmtpAttribute> {
    private final List<RtspMessageChannel1> IconCompatParcelizer;
    private final List<byte[]> write;

    public processH265FmtpAttribute(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof setMsFixedDuration)) {
            StringBuilder sb = new StringBuilder("Expected sequence for AttestationApplicationId, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        setMsFixedDuration setmsfixedduration = (setMsFixedDuration) lottieRatingBar;
        List<RtspMessageChannel1> listIconCompatParcelizer = IconCompatParcelizer(setmsfixedduration.IconCompatParcelizer(0));
        this.IconCompatParcelizer = listIconCompatParcelizer;
        listIconCompatParcelizer.sort(null);
        List<byte[]> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setmsfixedduration.IconCompatParcelizer(1));
        this.write = listAudioAttributesCompatParcelizer;
        listAudioAttributesCompatParcelizer.sort(new RemoteActionCompatParcelizer((byte) 0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = this.IconCompatParcelizer.size();
        int i = 1;
        for (RtspMessageChannel1 rtspMessageChannel1 : this.IconCompatParcelizer) {
            StringBuilder sb2 = new StringBuilder("Package info ");
            sb2.append(i);
            sb2.append("/");
            sb2.append(size);
            sb2.append(":\n");
            sb.append(sb2.toString());
            sb.append(rtspMessageChannel1);
            sb.append('\n');
            i++;
        }
        sb.append('\n');
        int size2 = this.write.size();
        int i2 = 1;
        for (byte[] bArr : this.write) {
            StringBuilder sb3 = new StringBuilder("Certificate sha256 digest ");
            sb3.append(i2);
            sb3.append("/");
            sb3.append(size2);
            sb3.append(":\n");
            sb.append(sb3.toString());
            sb.append(getCurrentSampleSize.RemoteActionCompatParcelizer().read(bArr));
            sb.append('\n');
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(processH265FmtpAttribute processh265fmtpattribute) {
        int iCompare = Integer.compare(this.IconCompatParcelizer.size(), processh265fmtpattribute.IconCompatParcelizer.size());
        if (iCompare != 0) {
            return iCompare;
        }
        Object[] objArr = 0;
        for (int i = 0; i < this.IconCompatParcelizer.size(); i++) {
            int iCompareTo = this.IconCompatParcelizer.get(i).compareTo(processh265fmtpattribute.IconCompatParcelizer.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        int iCompare2 = Integer.compare(this.write.size(), processh265fmtpattribute.write.size());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        new RemoteActionCompatParcelizer(objArr == true ? 1 : 0);
        for (int i2 = 0; i2 < this.write.size(); i2++) {
            iCompare2 = RemoteActionCompatParcelizer.IconCompatParcelizer(this.write.get(i2), processh265fmtpattribute.write.get(i2));
            if (iCompare2 != 0) {
                return iCompare2;
            }
        }
        return iCompare2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof processH265FmtpAttribute) && compareTo((processH265FmtpAttribute) obj) == 0;
    }

    private static List<RtspMessageChannel1> IconCompatParcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof ResponsiveScrollView)) {
            StringBuilder sb = new StringBuilder("Expected set for AttestationApplicationsInfos, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<LottieRatingBar> it = ((ResponsiveScrollView) lottieRatingBar).iterator();
        while (it.hasNext()) {
            arrayList.add(new RtspMessageChannel1(it.next()));
        }
        return arrayList;
    }

    private static List<byte[]> AudioAttributesCompatParcelizer(LottieRatingBar lottieRatingBar) throws CertificateParsingException {
        if (!(lottieRatingBar instanceof ResponsiveScrollView)) {
            StringBuilder sb = new StringBuilder("Expected set for Signature digests, found ");
            sb.append(lottieRatingBar.getClass().getName());
            throw new CertificateParsingException(sb.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<LottieRatingBar> it = ((ResponsiveScrollView) lottieRatingBar).iterator();
        while (it.hasNext()) {
            arrayList.add(getInitializationDataFromParameterSet.IconCompatParcelizer(it.next()));
        }
        return arrayList;
    }

    static class RemoteActionCompatParcelizer implements Comparator<byte[]> {
        private RemoteActionCompatParcelizer() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            return IconCompatParcelizer(bArr, bArr2);
        }

        public static int IconCompatParcelizer(byte[] bArr, byte[] bArr2) {
            int iCompare = Integer.compare(bArr.length, bArr2.length);
            if (iCompare != 0) {
                return iCompare;
            }
            for (int i = 0; i < bArr.length; i++) {
                iCompare = Byte.compare(bArr[i], bArr2[i]);
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return iCompare;
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }
}
