package kotlin;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StdKeyDeserializersExternalSyntheticLambda0 {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final int IconCompatParcelizer = 0;
    private final List<List<byte[]>> RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    public StdKeyDeserializersExternalSyntheticLambda0(String str, String str2, String str3, List<List<byte[]>> list) {
        this.read = (String) StringCollectionDeserializer.RemoteActionCompatParcelizer(str);
        this.AudioAttributesCompatParcelizer = (String) StringCollectionDeserializer.RemoteActionCompatParcelizer(str2);
        this.AudioAttributesImplApi21Parcelizer = (String) StringCollectionDeserializer.RemoteActionCompatParcelizer(str3);
        this.RemoteActionCompatParcelizer = (List) StringCollectionDeserializer.RemoteActionCompatParcelizer(list);
        this.write = AudioAttributesCompatParcelizer(str, str2, str3);
    }

    private static String AudioAttributesCompatParcelizer(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append(str3);
        return sb.toString();
    }

    public final String write() {
        return this.read;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final List<List<byte[]>> AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    final String read() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("FontRequest {mProviderAuthority: ");
        sb2.append(this.read);
        sb2.append(", mProviderPackage: ");
        sb2.append(this.AudioAttributesCompatParcelizer);
        sb2.append(", mQuery: ");
        sb2.append(this.AudioAttributesImplApi21Parcelizer);
        sb2.append(", mCertificates:");
        sb.append(sb2.toString());
        for (int i = 0; i < this.RemoteActionCompatParcelizer.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.RemoteActionCompatParcelizer.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        StringBuilder sb3 = new StringBuilder("mCertificatesArray: ");
        sb3.append(this.IconCompatParcelizer);
        sb.append(sb3.toString());
        return sb.toString();
    }
}
