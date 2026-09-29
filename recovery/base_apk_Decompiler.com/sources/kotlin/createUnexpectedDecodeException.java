package kotlin;

import android.location.Location;
import android.os.Build;

/* JADX INFO: loaded from: classes2.dex */
public final class createUnexpectedDecodeException extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Location read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createUnexpectedDecodeException(Location location) {
        super(1);
        this.read = location;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Boolean.valueOf(Build.VERSION.SDK_INT < 31 ? this.read.isFromMockProvider() : this.read.isMock());
    }
}
