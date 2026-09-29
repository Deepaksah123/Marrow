package kotlin;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0006\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0006\u0010\u000fR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/getMediaItemIndexInNewPlaylist;", "Lo/getPeriodOrAdDurationMs;", "", "p0", "<init>", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/String;", "write", "", "read", "(Ljava/lang/String;)[B", "", "p1", "p2", "(ILjava/lang/String;[B)[B", "RemoteActionCompatParcelizer", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMediaItemIndexInNewPlaylist extends getPeriodOrAdDurationMs {
    private static final String read;
    private static final String write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    public getMediaItemIndexInNewPlaylist(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder();
        sb.append(write);
        sb.append(str);
        sb.append(read);
        this.read = sb.toString();
    }

    @Override // kotlin.getPeriodOrAdDurationMs
    public final String AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = this.read;
        Charset charset = StandardCharsets.UTF_8;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        byte[] bytes = p0.getBytes(charset);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        byte[] bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(1, str, bytes);
        if (bArrAudioAttributesCompatParcelizer == null) {
            return null;
        }
        String string = Arrays.toString(bArrAudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.getPeriodOrAdDurationMs
    public final String write(String p0) {
        byte[] bArrAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        byte[] bArr = read(p0);
        if (bArr == null || (bArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(2, this.read, bArr)) == null) {
            return null;
        }
        Charset charset = StandardCharsets.UTF_8;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        return new String(bArrAudioAttributesCompatParcelizer, charset);
    }

    private static byte[] read(String p0) {
        try {
            String strSubstring = p0.substring(1, p0.length() - 1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            List<String> list = new newYearNameItem("\\s*,\\s*").read(TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) strSubstring).toString());
            byte[] bArr = new byte[list.size()];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bArr[i] = Byte.parseByte(list.get(i));
            }
            return bArr;
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    private static byte[] AudioAttributesCompatParcelizer(int p0, String p1, byte[] p2) {
        try {
            Charset charset = StandardCharsets.UTF_8;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
            byte[] bytes = "W1ZRCl3>".getBytes(charset);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
            Charset charset2 = StandardCharsets.UTF_8;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset2, "");
            byte[] bytes2 = "__CL3>3Rt#P__1V_".getBytes(charset2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes2, "");
            char[] charArray = p1.toCharArray();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charArray, "");
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWithMD5And128BitAES-CBC-OpenSSL").generateSecret(new PBEKeySpec(charArray, bytes, 1000, 256)).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(p0, secretKeySpec, new IvParameterSpec(bytes2));
            return cipher.doFinal(p2);
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("Lq3fz", "");
        write = "Lq3fz";
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("bLti2", "");
        read = "bLti2";
    }
}
