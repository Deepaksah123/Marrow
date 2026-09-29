package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerBuilderExternalSyntheticLambda11 {
    private static final RenewEligible write = getRenewExpiresOn.write(RenewEligibleCompanion.read, AnonymousClass3.AudioAttributesCompatParcelizer);

    public static final isAnnotationBundle read(Drawable drawable) {
        toMagicModuleMetaRepoModel.write(drawable, "");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmap, "");
            return new refineDeserializationType(_allocMore.AudioAttributesCompatParcelizer(bitmap), 0L, 0L, 6, null);
        }
        if (drawable instanceof ColorDrawable) {
            return new isIgnorableType(RequestPayload.AudioAttributesCompatParcelizer(((ColorDrawable) drawable).getColor()), null);
        }
        Drawable drawableMutate = drawable.mutate();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(drawableMutate, "");
        return new ExoPlayerBuilderExternalSyntheticLambda13(drawableMutate);
    }

    /* JADX INFO: renamed from: o.ExoPlayerBuilderExternalSyntheticLambda11$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Handler;", "IconCompatParcelizer", "()Landroid/os/Handler;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<Handler> {
        public static final AnonymousClass3 AudioAttributesCompatParcelizer = new AnonymousClass3();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }

        AnonymousClass3() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler write() {
        return (Handler) write.RemoteActionCompatParcelizer();
    }
}
