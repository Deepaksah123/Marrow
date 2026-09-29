package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class AdaptationSet {
    public static final float IconCompatParcelizer(Number number, Number number2) {
        toMagicModuleMetaRepoModel.write(number, "");
        toMagicModuleMetaRepoModel.write(number2, "");
        return (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) number, (Object) 0) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) number2, (Object) 0)) ? BitmapDescriptorFactory.HUE_RED : (number.floatValue() / number2.floatValue()) * 100.0f;
    }

    public static final void AudioAttributesCompatParcelizer(getStreamPositionUsForContent getstreampositionusforcontent, String str, String str2) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(str, "");
        getstreampositionusforcontent.IconCompatParcelizer(str, str2);
    }

    public static final void read(getStreamPositionUsForContent getstreampositionusforcontent, String str, long j) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(str, "");
        getstreampositionusforcontent.RemoteActionCompatParcelizer(str, j);
    }

    public static final void read(getStreamPositionUsForContent getstreampositionusforcontent, String str) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(str, "");
        getstreampositionusforcontent.IconCompatParcelizer(str, false);
    }

    public static final void RemoteActionCompatParcelizer(getStreamPositionUsForContent getstreampositionusforcontent, String str, int i) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(str, "");
        getstreampositionusforcontent.IconCompatParcelizer(str, i);
    }
}
