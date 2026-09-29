package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class setPlaybackState implements setDeviceInfo {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private setNewlyRenderedFirstFrame write;

    public setPlaybackState(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        IconCompatParcelizer();
    }

    @Override // kotlin.setDeviceInfo
    public final setNewlyRenderedFirstFrame read() {
        return this.write;
    }

    @Override // kotlin.setDeviceInfo
    public final boolean RemoteActionCompatParcelizer(String str) {
        boolean zIconCompatParcelizer = this.write.IconCompatParcelizer(str);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("isIdentity [Key: ");
        sb.append(str);
        sb.append(" , Value: ");
        sb.append(zIconCompatParcelizer);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return zIconCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        this.write = setNewlyRenderedFirstFrame.IconCompatParcelizer();
        CleverTapInstanceConfig cleverTapInstanceConfig = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("LegacyIdentityRepo Setting the default IdentitySet[");
        sb.append(this.write);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
    }
}
