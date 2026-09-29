package kotlin;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u0014\u0010\n\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f"}, d2 = {"Lo/_getToStringResolver;", "", "<init>", "()V", "", "p0", "p1", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/String;)Z", "write", "()Z", "read", "RemoteActionCompatParcelizer", "", "I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class _getToStringResolver {
    public static final _getToStringResolver INSTANCE = new _getToStringResolver();

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final int IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final int read;

    private _getToStringResolver() {
    }

    private static final Integer RemoteActionCompatParcelizer(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) upperCase, (Object) "BAKLAVA") ? 0 : null;
    }

    @getMagicModuleMeta
    public static final boolean IconCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "REL", (Object) p1)) {
            return false;
        }
        Integer numRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p1);
        Integer numRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(p0);
        if (numRemoteActionCompatParcelizer != null && numRemoteActionCompatParcelizer2 != null) {
            return numRemoteActionCompatParcelizer.intValue() >= numRemoteActionCompatParcelizer2.intValue();
        }
        if (numRemoteActionCompatParcelizer != null || numRemoteActionCompatParcelizer2 != null) {
            return numRemoteActionCompatParcelizer != null;
        }
        String upperCase = p1.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
        String upperCase2 = p0.toUpperCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase2, "");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final boolean write() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return IconCompatParcelizer("Tiramisu", str);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final boolean read() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return IconCompatParcelizer("UpsideDownCake", str);
    }

    @getRenewGrpId
    @getMagicModuleMeta
    public static final boolean RemoteActionCompatParcelizer() {
        if (Build.VERSION.SDK_INT >= 35) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return IconCompatParcelizer("VanillaIceCream", str);
    }

    static {
        IconCompatParcelizer = Build.VERSION.SDK_INT >= 30 ? read.INSTANCE.AudioAttributesCompatParcelizer(30) : 0;
        AudioAttributesCompatParcelizer = Build.VERSION.SDK_INT >= 30 ? read.INSTANCE.AudioAttributesCompatParcelizer(31) : 0;
        write = Build.VERSION.SDK_INT >= 30 ? read.INSTANCE.AudioAttributesCompatParcelizer(33) : 0;
        read = Build.VERSION.SDK_INT >= 30 ? read.INSTANCE.AudioAttributesCompatParcelizer(PlaybackException.CUSTOM_ERROR_CODE_BASE) : 0;
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/_getToStringResolver$read;", "", "<init>", "()V", "", "p0", "AudioAttributesCompatParcelizer", "(I)I"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class read {
        public static final read INSTANCE = new read();

        private read() {
        }

        public final int AudioAttributesCompatParcelizer(int p0) {
            return SdkExtensions.getExtensionVersion(p0);
        }
    }
}
