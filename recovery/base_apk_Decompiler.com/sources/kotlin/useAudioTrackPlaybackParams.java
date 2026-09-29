package kotlin;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class useAudioTrackPlaybackParams extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public useAudioTrackPlaybackParams(Context context) {
        super(0);
        this.write = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ContentResolver contentResolver = this.write.getContentResolver();
        toMagicModuleMetaRepoModel.write(contentResolver);
        return contentResolver;
    }
}
