package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeNotifyPlaybackInfoChanged {
    private final char AudioAttributesCompatParcelizer;
    private final double AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final double RemoteActionCompatParcelizer;
    private final String read;
    private final List<setOffloadSchedulingEnabledInternal> write;

    public static int AudioAttributesCompatParcelizer(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public maybeNotifyPlaybackInfoChanged(List<setOffloadSchedulingEnabledInternal> list, char c, double d, double d2, String str, String str2) {
        this.write = list;
        this.AudioAttributesCompatParcelizer = c;
        this.RemoteActionCompatParcelizer = d;
        this.AudioAttributesImplApi26Parcelizer = d2;
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final List<setOffloadSchedulingEnabledInternal> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final double write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read);
    }
}
