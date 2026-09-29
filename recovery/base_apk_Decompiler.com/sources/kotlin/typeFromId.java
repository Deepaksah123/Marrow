package kotlin;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class typeFromId implements idFromBaseType {
    public int IconCompatParcelizer;
    public final int read;
    public int write;
    private static final String AudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
    private static final String RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    private static final String MediaBrowserCompatItemReceiver = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);

    public typeFromId(int i, int i2, int i3) {
        this.IconCompatParcelizer = i;
        this.write = i2;
        this.read = i3;
    }

    public final Bundle IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
        bundle.putInt(RemoteActionCompatParcelizer, this.write);
        bundle.putInt(MediaBrowserCompatItemReceiver, this.read);
        return bundle;
    }

    public static typeFromId IconCompatParcelizer(Bundle bundle) {
        return new typeFromId(bundle.getInt(AudioAttributesCompatParcelizer), bundle.getInt(RemoteActionCompatParcelizer), bundle.getInt(MediaBrowserCompatItemReceiver));
    }
}
