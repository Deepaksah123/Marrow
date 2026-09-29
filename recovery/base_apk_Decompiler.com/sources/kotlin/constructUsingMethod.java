package kotlin;

import androidx.media3.extractor.metadata.icy.IcyInfo;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class constructUsingMethod extends _isIntType {
    private static final Pattern write = Pattern.compile("(.+?)='(.*?)';", 32);
    private final CharsetDecoder IconCompatParcelizer = parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer.newDecoder();
    private final CharsetDecoder read = parseMdtaFromMeta.AudioAttributesCompatParcelizer.newDecoder();

    @Override // kotlin._isIntType
    public final androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer) {
        String strIconCompatParcelizer = IconCompatParcelizer(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (strIconCompatParcelizer == null) {
            return new androidx.media3.common.Metadata(new IcyInfo(bArr, null, null));
        }
        Matcher matcher = write.matcher(strIconCompatParcelizer);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String str3 = parseMdhd.read(strGroup);
                str3.hashCode();
                if (str3.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (str3.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new androidx.media3.common.Metadata(new IcyInfo(bArr, str, str2));
    }

    private String IconCompatParcelizer(ByteBuffer byteBuffer) {
        try {
            return this.IconCompatParcelizer.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String string = this.read.decode(byteBuffer).toString();
                this.read.reset();
                byteBuffer.rewind();
                return string;
            } catch (CharacterCodingException unused2) {
                this.read.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th) {
                this.read.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.IconCompatParcelizer.reset();
            byteBuffer.rewind();
        }
    }
}
