package kotlin;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
final class getAvailableCodecInfos {
    private static final Pattern write = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;

    private getAvailableCodecInfos(String str, String str2) {
        this.IconCompatParcelizer = AudioAttributesCompatParcelizer(str2, str);
        this.read = str;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.RemoteActionCompatParcelizer = sb.toString();
    }

    private static String AudioAttributesCompatParcelizer(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            new Object[]{str2};
            str = str.substring(8);
        }
        if (str == null || !write.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    static getAvailableCodecInfos read(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("!", -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new getAvailableCodecInfos(strArrSplit[0], strArrSplit[1]);
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final String write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof getAvailableCodecInfos)) {
            return false;
        }
        getAvailableCodecInfos getavailablecodecinfos = (getAvailableCodecInfos) obj;
        return this.IconCompatParcelizer.equals(getavailablecodecinfos.IconCompatParcelizer) && this.read.equals(getavailablecodecinfos.read);
    }

    public final int hashCode() {
        return Objects.hashCode(this.read, this.IconCompatParcelizer);
    }
}
