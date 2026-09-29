package dagger.hilt.android.internal.modules;

import android.app.Application;
import android.content.Context;
import kotlin.FreeVideoPromotionResponse;

/* JADX INFO: loaded from: classes.dex */
public final class ApplicationContextModule {
    private final Context AudioAttributesCompatParcelizer;

    public ApplicationContextModule(Context context) {
        this.AudioAttributesCompatParcelizer = context;
    }

    public final Context RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Application IconCompatParcelizer() {
        return FreeVideoPromotionResponse.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }
}
