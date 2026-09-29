package kotlin;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class getSubmittedFrames extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ Context read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSubmittedFrames(Context context) {
        super(0);
        this.read = context;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ContentResolver contentResolver = this.read.getContentResolver();
        toMagicModuleMetaRepoModel.write(contentResolver);
        return contentResolver;
    }
}
