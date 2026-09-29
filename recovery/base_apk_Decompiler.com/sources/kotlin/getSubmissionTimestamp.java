package kotlin;

import java.nio.charset.Charset;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006"}, d2 = {"Lo/getSubmissionTimestamp;", "", "<init>", "()V", "Ljava/nio/charset/Charset;", "AudioAttributesCompatParcelizer", "Ljava/nio/charset/Charset;", "IconCompatParcelizer", "read", "write", "()Ljava/nio/charset/Charset;", "RemoteActionCompatParcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSubmissionTimestamp {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Charset IconCompatParcelizer;
    public static final getSubmissionTimestamp INSTANCE = new getSubmissionTimestamp();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static volatile Charset AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Charset AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static volatile Charset read;

    private getSubmissionTimestamp() {
    }

    static {
        Charset charsetForName = Charset.forName(CharsetNames.UTF_8);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
        IconCompatParcelizer = charsetForName;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(Charset.forName(CharsetNames.UTF_16), "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(Charset.forName(CharsetNames.UTF_16BE), "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(Charset.forName(CharsetNames.UTF_16LE), "");
        Charset charsetForName2 = Charset.forName(CharsetNames.US_ASCII);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName2, "");
        AudioAttributesCompatParcelizer = charsetForName2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(Charset.forName(CharsetNames.ISO_8859_1), "");
    }

    public final Charset write() {
        Charset charset = read;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
        read = charsetForName;
        return charsetForName;
    }

    public final Charset AudioAttributesCompatParcelizer() {
        Charset charset = AudioAttributesImplApi21Parcelizer;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
        AudioAttributesImplApi21Parcelizer = charsetForName;
        return charsetForName;
    }
}
