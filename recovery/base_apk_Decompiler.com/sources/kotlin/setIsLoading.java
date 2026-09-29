package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class setIsLoading {
    public static setDeviceInfo AudioAttributesCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdaonAudioCodecError11 lambdaonaudiocodecerror11) {
        setDeviceInfo setisdevicemuted;
        setPlayerError setplayererror = new setPlayerError(context, cleverTapInstanceConfig);
        if (setplayererror.write()) {
            setisdevicemuted = new setPlaybackState(cleverTapInstanceConfig);
        } else {
            setisdevicemuted = new setIsDeviceMuted(cleverTapInstanceConfig, setplayererror, lambdaonaudiocodecerror11);
        }
        StringBuilder sb = new StringBuilder("Repo provider: ");
        sb.append(setisdevicemuted.getClass().getSimpleName());
        cleverTapInstanceConfig.read("ON_USER_LOGIN", sb.toString());
        return setisdevicemuted;
    }
}
