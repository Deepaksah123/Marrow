package kotlin;

import java.nio.charset.Charset;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
public final class parseMdtaFromMeta {
    public static final Charset RemoteActionCompatParcelizer = Charset.forName(CharsetNames.US_ASCII);
    public static final Charset AudioAttributesCompatParcelizer = Charset.forName(CharsetNames.ISO_8859_1);
    public static final Charset AudioAttributesImplApi26Parcelizer = Charset.forName(CharsetNames.UTF_8);
    public static final Charset IconCompatParcelizer = Charset.forName(CharsetNames.UTF_16BE);
    public static final Charset read = Charset.forName(CharsetNames.UTF_16LE);
    public static final Charset write = Charset.forName(CharsetNames.UTF_16);
}
