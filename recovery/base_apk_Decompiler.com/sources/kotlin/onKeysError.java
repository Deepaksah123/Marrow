package kotlin;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class onKeysError extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ onSessionCreated AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onKeysError(onSessionCreated onsessioncreated) {
        super(0);
        this.AudioAttributesCompatParcelizer = onsessioncreated;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ContentResolver contentResolver = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(contentResolver);
        String string = Settings.Global.getString(contentResolver, onInterruptedByAd.AudioAttributesCompatParcelizer.write());
        toMagicModuleMetaRepoModel.write((Object) string);
        return string;
    }
}
