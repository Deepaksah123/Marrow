package kotlin;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdadrmSessionReleased5comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher {
    private static final RenewEligible write = getRenewExpiresOn.write(RenewEligibleCompanion.read, AnonymousClass2.IconCompatParcelizer);

    /* JADX INFO: renamed from: o.lambdadrmSessionReleased5comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/Handler;", "AudioAttributesCompatParcelizer", "()Landroid/os/Handler;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<Handler> {
        public static final AnonymousClass2 IconCompatParcelizer = new AnonymousClass2();

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }

        AnonymousClass2() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler AudioAttributesCompatParcelizer() {
        return (Handler) write.RemoteActionCompatParcelizer();
    }

    public static final isAnnotationBundle write(Drawable drawable, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        lambdadrmSessionManagerError2comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmsessionmanagererror2comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
        _handleunrecognizedcharacterescape.read(1756822313);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1756822313, 8, -1, "com.google.accompanist.drawablepainter.rememberDrawablePainter (DrawablePainter.kt:154)");
        }
        _handleunrecognizedcharacterescape.read(1157296644);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(drawable);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if (zAudioAttributesCompatParcelizer || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            if (drawable == null) {
                objOnPause = withParameters.INSTANCE;
            } else {
                if (drawable instanceof BitmapDrawable) {
                    Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bitmap, "");
                    lambdadrmsessionmanagererror2comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = new refineDeserializationType(_allocMore.AudioAttributesCompatParcelizer(bitmap), 0L, 0L, 6, null);
                } else if (drawable instanceof ColorDrawable) {
                    lambdadrmsessionmanagererror2comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = new isIgnorableType(RequestPayload.AudioAttributesCompatParcelizer(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(drawableMutate, "");
                    lambdadrmsessionmanagererror2comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = new lambdadrmSessionManagerError2comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(drawableMutate);
                }
                objOnPause = lambdadrmsessionmanagererror2comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
            }
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        isAnnotationBundle isannotationbundle = (isAnnotationBundle) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return isannotationbundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long read(Drawable drawable) {
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            return allocCharBuffer.IconCompatParcelizer(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
        return calloc.INSTANCE.IconCompatParcelizer();
    }
}
