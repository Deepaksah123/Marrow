package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class setIsDeviceMuted implements setDeviceInfo {
    private final setPlayerError AudioAttributesCompatParcelizer;
    private final CleverTapInstanceConfig IconCompatParcelizer;
    private final lambdaonAudioCodecError11 RemoteActionCompatParcelizer;
    private setNewlyRenderedFirstFrame read;

    public setIsDeviceMuted(CleverTapInstanceConfig cleverTapInstanceConfig, setPlayerError setplayererror, lambdaonAudioCodecError11 lambdaonaudiocodecerror11) {
        this.IconCompatParcelizer = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = setplayererror;
        this.RemoteActionCompatParcelizer = lambdaonaudiocodecerror11;
        AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.setDeviceInfo
    public final setNewlyRenderedFirstFrame read() {
        return this.read;
    }

    @Override // kotlin.setDeviceInfo
    public final boolean RemoteActionCompatParcelizer(String str) {
        boolean zIconCompatParcelizer = this.read.IconCompatParcelizer(str);
        CleverTapInstanceConfig cleverTapInstanceConfig = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("ConfigurableIdentityRepoisIdentity [Key: ");
        sb.append(str);
        sb.append(" , Value: ");
        sb.append(zIconCompatParcelizer);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return zIconCompatParcelizer;
    }

    private void AudioAttributesCompatParcelizer() {
        setNewlyRenderedFirstFrame setnewlyrenderedfirstframeAudioAttributesCompatParcelizer = setNewlyRenderedFirstFrame.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.read());
        CleverTapInstanceConfig cleverTapInstanceConfig = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("ConfigurableIdentityRepoPrefIdentitySet [");
        sb.append(setnewlyrenderedfirstframeAudioAttributesCompatParcelizer);
        sb.append("]");
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        setNewlyRenderedFirstFrame setnewlyrenderedfirstframe = setNewlyRenderedFirstFrame.read(this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver());
        CleverTapInstanceConfig cleverTapInstanceConfig2 = this.IconCompatParcelizer;
        StringBuilder sb2 = new StringBuilder("ConfigurableIdentityRepoConfigIdentitySet [");
        sb2.append(setnewlyrenderedfirstframe);
        sb2.append("]");
        cleverTapInstanceConfig2.read("ON_USER_LOGIN", sb2.toString());
        RemoteActionCompatParcelizer(setnewlyrenderedfirstframeAudioAttributesCompatParcelizer, setnewlyrenderedfirstframe);
        if (setnewlyrenderedfirstframeAudioAttributesCompatParcelizer.read()) {
            this.read = setnewlyrenderedfirstframeAudioAttributesCompatParcelizer;
            CleverTapInstanceConfig cleverTapInstanceConfig3 = this.IconCompatParcelizer;
            StringBuilder sb3 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Pref[");
            sb3.append(this.read);
            sb3.append("]");
            cleverTapInstanceConfig3.read("ON_USER_LOGIN", sb3.toString());
        } else if (setnewlyrenderedfirstframe.read()) {
            this.read = setnewlyrenderedfirstframe;
            CleverTapInstanceConfig cleverTapInstanceConfig4 = this.IconCompatParcelizer;
            StringBuilder sb4 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Config[");
            sb4.append(this.read);
            sb4.append("]");
            cleverTapInstanceConfig4.read("ON_USER_LOGIN", sb4.toString());
        } else {
            this.read = setNewlyRenderedFirstFrame.IconCompatParcelizer();
            CleverTapInstanceConfig cleverTapInstanceConfig5 = this.IconCompatParcelizer;
            StringBuilder sb5 = new StringBuilder("ConfigurableIdentityRepoIdentity Set activated from Default[");
            sb5.append(this.read);
            sb5.append("]");
            cleverTapInstanceConfig5.read("ON_USER_LOGIN", sb5.toString());
        }
        if (setnewlyrenderedfirstframeAudioAttributesCompatParcelizer.read()) {
            return;
        }
        String string = this.read.toString();
        this.AudioAttributesCompatParcelizer.write(string);
        CleverTapInstanceConfig cleverTapInstanceConfig6 = this.IconCompatParcelizer;
        StringBuilder sb6 = new StringBuilder("ConfigurableIdentityRepoSaving Identity Keys in Pref[");
        sb6.append(string);
        sb6.append("]");
        cleverTapInstanceConfig6.read("ON_USER_LOGIN", sb6.toString());
    }

    private void RemoteActionCompatParcelizer(setNewlyRenderedFirstFrame setnewlyrenderedfirstframe, setNewlyRenderedFirstFrame setnewlyrenderedfirstframe2) {
        if (setnewlyrenderedfirstframe.read() && setnewlyrenderedfirstframe2.read() && !setnewlyrenderedfirstframe.equals(setnewlyrenderedfirstframe2)) {
            this.RemoteActionCompatParcelizer.read(lambdaonAudioDecoderReleased8.IconCompatParcelizer(531));
            CleverTapInstanceConfig cleverTapInstanceConfig = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder("ConfigurableIdentityRepopushing error due to mismatch [Pref:");
            sb.append(setnewlyrenderedfirstframe);
            sb.append("], [Config:");
            sb.append(setnewlyrenderedfirstframe2);
            sb.append("]");
            cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
            return;
        }
        CleverTapInstanceConfig cleverTapInstanceConfig2 = this.IconCompatParcelizer;
        StringBuilder sb2 = new StringBuilder("ConfigurableIdentityRepoNo error found while comparing [Pref:");
        sb2.append(setnewlyrenderedfirstframe);
        sb2.append("], [Config:");
        sb2.append(setnewlyrenderedfirstframe2);
        sb2.append("]");
        cleverTapInstanceConfig2.read("ON_USER_LOGIN", sb2.toString());
    }
}
