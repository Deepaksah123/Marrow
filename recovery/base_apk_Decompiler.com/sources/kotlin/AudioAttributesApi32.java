package kotlin;

import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioAttributesApi32 extends MagicModuleUseCase implements getCreatedOnDateMs {
    public static final AudioAttributesApi32 IconCompatParcelizer = new AudioAttributesApi32();

    public AudioAttributesApi32() {
        super(0);
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        String str = Build.MANUFACTURER;
        toMagicModuleMetaRepoModel.write((Object) str);
        return str;
    }
}
