package kotlin;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class releaseDecoder extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ DecoderAudioRendererApi23 AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public releaseDecoder(DecoderAudioRendererApi23 decoderAudioRendererApi23) {
        super(0);
        this.AudioAttributesCompatParcelizer = decoderAudioRendererApi23;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ContentResolver contentResolver = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(contentResolver);
        String string = Settings.Secure.getString(contentResolver, "android_id");
        toMagicModuleMetaRepoModel.write((Object) string);
        return string;
    }
}
