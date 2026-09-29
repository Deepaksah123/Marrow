package kotlin;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

/* JADX INFO: loaded from: classes.dex */
public final class lambdaonVideoDisabled18 {
    private lambdaonVideoCodecError21 write;

    public enum RemoteActionCompatParcelizer {
        AUTO,
        EXPLICIT_ONLY
    }

    public static void write(Application application, String str) {
        lambdaonVideoCodecError21.RemoteActionCompatParcelizer(application, str);
    }

    public static void AudioAttributesCompatParcelizer(Context context, String str) {
        lambdaonVideoCodecError21.RemoteActionCompatParcelizer(context, str);
    }

    public static lambdaonVideoDisabled18 AudioAttributesCompatParcelizer(Context context) {
        return new lambdaonVideoDisabled18(context);
    }

    private lambdaonVideoDisabled18(Context context) {
        this.write = new lambdaonVideoCodecError21(context, (String) null, (AccessToken) null);
    }

    public static RemoteActionCompatParcelizer read() {
        return lambdaonVideoCodecError21.read();
    }

    public final void IconCompatParcelizer(String str, Bundle bundle) {
        this.write.write(str, bundle);
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.AudioAttributesImplApi21Parcelizer();
    }

    public static void write() {
        lambdaonVideoCodecError21.write();
    }

    public static String AudioAttributesCompatParcelizer() {
        return lambdaonTracksChanged31.AudioAttributesCompatParcelizer();
    }

    public static String IconCompatParcelizer(Context context) {
        return lambdaonVideoCodecError21.RemoteActionCompatParcelizer(context);
    }
}
