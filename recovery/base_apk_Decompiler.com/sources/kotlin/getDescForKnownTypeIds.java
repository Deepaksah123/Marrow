package kotlin;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class getDescForKnownTypeIds implements idFromBaseType {
    private static final String RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
    private static final String read = LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
    public final String AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;

    public getDescForKnownTypeIds(String str, int i) {
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = i;
    }

    public final Bundle read() {
        Bundle bundle = new Bundle();
        bundle.putString(RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
        bundle.putInt(read, this.IconCompatParcelizer);
        return bundle;
    }

    public static getDescForKnownTypeIds read(Bundle bundle) {
        return new getDescForKnownTypeIds((String) buildTypeSerializer.IconCompatParcelizer(bundle.getString(RemoteActionCompatParcelizer)), bundle.getInt(read));
    }
}
