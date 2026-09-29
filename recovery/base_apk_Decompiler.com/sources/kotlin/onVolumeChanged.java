package kotlin;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
public interface onVolumeChanged {
    public static final Charset read = Charset.forName(CharsetNames.UTF_8);

    boolean equals(Object obj);

    int hashCode();

    void write(MessageDigest messageDigest);
}
