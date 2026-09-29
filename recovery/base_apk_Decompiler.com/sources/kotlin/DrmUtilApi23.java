package kotlin;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class DrmUtilApi23 implements getRequestType {
    static final String IconCompatParcelizer;
    public static final DrmUtilApi23 RemoteActionCompatParcelizer;
    private static final Set<DrmSessionManagerDrmSessionReference> read;
    private final String AudioAttributesCompatParcelizer;
    private final String write;

    static {
        String strIconCompatParcelizer = closeSession.IconCompatParcelizer("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        IconCompatParcelizer = strIconCompatParcelizer;
        String strIconCompatParcelizer2 = closeSession.IconCompatParcelizer("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String strIconCompatParcelizer3 = closeSession.IconCompatParcelizer("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        read = Collections.unmodifiableSet(new HashSet(Arrays.asList(DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"), DrmSessionManagerDrmSessionReference.IconCompatParcelizer("json"))));
        new DrmUtilApi23(strIconCompatParcelizer, null);
        RemoteActionCompatParcelizer = new DrmUtilApi23(strIconCompatParcelizer2, strIconCompatParcelizer3);
    }

    public DrmUtilApi23(String str, String str2) {
        this.AudioAttributesCompatParcelizer = str;
        this.write = str2;
    }

    @Override // kotlin.getLicenseServerUrl
    public final String read() {
        return "cct";
    }

    @Override // kotlin.getLicenseServerUrl
    public final byte[] AudioAttributesCompatParcelizer() {
        return AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.getRequestType
    public final Set<DrmSessionManagerDrmSessionReference> write() {
        return read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    private byte[] AudioAttributesImplBaseParcelizer() {
        String str = this.write;
        if (str == null && this.AudioAttributesCompatParcelizer == null) {
            return null;
        }
        String str2 = this.AudioAttributesCompatParcelizer;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(CharsetNames.UTF_8));
    }

    public static DrmUtilApi23 AudioAttributesCompatParcelizer(byte[] bArr) {
        String str = new String(bArr, Charset.forName(CharsetNames.UTF_8));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new DrmUtilApi23(str2, str3);
    }
}
