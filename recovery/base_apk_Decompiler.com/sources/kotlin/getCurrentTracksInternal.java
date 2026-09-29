package kotlin;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentTracksInternal extends getPeriodOrAdDurationMs {
    private final getCurrentPeriodOrAdPositionMs write;

    public getCurrentTracksInternal(getCurrentPeriodOrAdPositionMs getcurrentperiodoradpositionms) {
        toMagicModuleMetaRepoModel.write(getcurrentperiodoradpositionms, "");
        this.write = getcurrentperiodoradpositionms;
    }

    @Override // kotlin.getPeriodOrAdDurationMs
    public final String AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        Charset charset = StandardCharsets.UTF_8;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        byte[] bytes = str.getBytes(charset);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this, 1, bytes, null, null, 12);
        if (writeVarRemoteActionCompatParcelizer == null) {
            return null;
        }
        byte[] bArrWrite = writeVarRemoteActionCompatParcelizer.write();
        byte[] bArrRemoteActionCompatParcelizer = writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder("<ct<");
        sb.append(getPositionOrDefaultInMediaItem.write(bArrWrite));
        sb.append(':');
        sb.append(getPositionOrDefaultInMediaItem.write(bArrRemoteActionCompatParcelizer));
        sb.append(">ct>");
        return sb.toString();
    }

    @Override // kotlin.getPeriodOrAdDurationMs
    public final String write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        write writeVar = read(str);
        if (writeVar == null) {
            return null;
        }
        write writeVarRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this, 2, writeVar.RemoteActionCompatParcelizer(), writeVar.write(), null, 8);
        if (writeVarRemoteActionCompatParcelizer == null) {
            return null;
        }
        byte[] bArrRemoteActionCompatParcelizer = writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        Charset charset = StandardCharsets.UTF_8;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charset, "");
        return new String(bArrRemoteActionCompatParcelizer, charset);
    }

    private static write read(String str) {
        try {
            List listWrite = TestGroupLSModel.write(TestGroupLSModel.AudioAttributesCompatParcelizer(TestGroupLSModel.IconCompatParcelizer(str, (CharSequence) "<ct<"), (CharSequence) ">ct>"), new String[]{":"}, 0, 6);
            return new write(getPositionOrDefaultInMediaItem.write((String) listWrite.get(0)), getPositionOrDefaultInMediaItem.write((String) listWrite.get(1)));
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    private static /* synthetic */ write RemoteActionCompatParcelizer(getCurrentTracksInternal getcurrenttracksinternal, int i, byte[] bArr, byte[] bArr2, SecretKey secretKey, int i2) {
        if ((i2 & 4) != 0) {
            bArr2 = null;
        }
        if ((i2 & 8) != 0) {
            getCurrentPeriodOrAdPositionMs getcurrentperiodoradpositionms = getcurrenttracksinternal.write;
            secretKey = getCurrentPeriodOrAdPositionMs.RemoteActionCompatParcelizer();
        }
        return read(i, bArr, bArr2, secretKey);
    }

    public static write read(int i, byte[] bArr, byte[] bArr2, SecretKey secretKey) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            if (i == 1) {
                cipher.init(i, secretKey);
                byte[] iv = cipher.getIV();
                byte[] bArrDoFinal = cipher.doFinal(bArr);
                toMagicModuleMetaRepoModel.write(iv);
                toMagicModuleMetaRepoModel.write(bArrDoFinal);
                return new write(iv, bArrDoFinal);
            }
            if (i != 2) {
                RendererWakeupListener.MediaMetadataCompat();
                return null;
            }
            if (bArr2 != null) {
                cipher.init(i, secretKey, new GCMParameterSpec(128, bArr2));
                byte[] bArrDoFinal2 = cipher.doFinal(bArr);
                toMagicModuleMetaRepoModel.write(bArrDoFinal2);
                return new write(bArr2, bArrDoFinal2);
            }
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    public static final class write {
        private final byte[] AudioAttributesCompatParcelizer;
        private final byte[] IconCompatParcelizer;

        public write(byte[] bArr, byte[] bArr2) {
            toMagicModuleMetaRepoModel.write(bArr, "");
            toMagicModuleMetaRepoModel.write(bArr2, "");
            this.AudioAttributesCompatParcelizer = bArr;
            this.IconCompatParcelizer = bArr2;
        }

        public final byte[] read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final byte[] AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj != null ? obj.getClass() : null)) {
                return false;
            }
            toMagicModuleMetaRepoModel.read(obj, "");
            write writeVar = (write) obj;
            return Arrays.equals(this.AudioAttributesCompatParcelizer, writeVar.AudioAttributesCompatParcelizer) && Arrays.equals(this.IconCompatParcelizer, writeVar.IconCompatParcelizer);
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Arrays.hashCode(this.IconCompatParcelizer);
        }

        public final byte[] write() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final byte[] RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AESGCMCryptResult(iv=");
            sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer));
            sb.append(", encryptedBytes=");
            sb.append(Arrays.toString(this.IconCompatParcelizer));
            sb.append(')');
            return sb.toString();
        }
    }
}
