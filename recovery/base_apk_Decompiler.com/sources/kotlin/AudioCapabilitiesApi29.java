package kotlin;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioCapabilitiesApi29 extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioCapabilitiesApi29(Context context) {
        super(1);
        this.write = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        ContentResolver contentResolver = this.write.getContentResolver();
        toMagicModuleMetaRepoModel.write(contentResolver);
        return contentResolver;
    }
}
