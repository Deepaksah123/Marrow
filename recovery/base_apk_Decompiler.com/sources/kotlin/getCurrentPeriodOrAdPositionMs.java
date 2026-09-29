package kotlin;

import android.security.keystore.KeyGenParameterSpec;
import com.google.android.gms.stats.CodePackage;
import in.juspay.hypersdk.core.Constants;
import java.security.Key;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes2.dex */
public final class getCurrentPeriodOrAdPositionMs {
    private final getSurfaceHolderSize write;

    public getCurrentPeriodOrAdPositionMs(getSurfaceHolderSize getsurfaceholdersize) {
        toMagicModuleMetaRepoModel.write(getsurfaceholdersize, "");
        this.write = getsurfaceholdersize;
    }

    public static SecretKey RemoteActionCompatParcelizer() {
        return IconCompatParcelizer();
    }

    public static SecretKey AudioAttributesCompatParcelizer() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey secretKeyGenerateKey = keyGenerator.generateKey();
        toMagicModuleMetaRepoModel.write(secretKeyGenerateKey);
        return secretKeyGenerateKey;
    }

    private static SecretKey IconCompatParcelizer() {
        try {
            KeyStore keyStore = KeyStore.getInstance(Constants.ANDROID_KEYSTORE);
            keyStore.load(null);
            if (!keyStore.containsAlias("EncryptionKey")) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", Constants.ANDROID_KEYSTORE);
                KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder("EncryptionKey", 3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(keyGenParameterSpecBuild, "");
                keyGenerator.init(keyGenParameterSpecBuild);
                return keyGenerator.generateKey();
            }
            Key key = keyStore.getKey("EncryptionKey", null);
            toMagicModuleMetaRepoModel.read(key, "");
            return (SecretKey) key;
        } catch (Exception e) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }
}
