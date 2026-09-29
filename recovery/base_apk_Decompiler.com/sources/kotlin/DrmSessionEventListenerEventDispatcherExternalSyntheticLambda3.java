package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListenerEventDispatcherExternalSyntheticLambda3 {
    private static final long RemoteActionCompatParcelizer = RequestPayload.write$default(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.3f, null, 16, null);
    private static final getAnswerMap<switchToNext, switchToNext> write = AnonymousClass1.RemoteActionCompatParcelizer;

    public static final DrmSessionEventListenerEventDispatcherExternalSyntheticLambda2 RemoteActionCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(-715745933);
        Window windowWrite = write(_handleunrecognizedcharacterescape);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(-715745933, 0, -1, "com.google.accompanist.systemuicontroller.rememberSystemUiController (SystemUiController.kt:183)");
        }
        View view = (View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver());
        _handleunrecognizedcharacterescape.read(511388516);
        boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(view);
        boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(windowWrite);
        Object objOnPause = _handleunrecognizedcharacterescape.onPause();
        if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
            objOnPause = new lambdadrmKeysRestored3comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher(view, windowWrite);
            _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        lambdadrmKeysRestored3comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher lambdadrmkeysrestored3comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher = (lambdadrmKeysRestored3comgoogleandroidexoplayer2drmDrmSessionEventListenerEventDispatcher) objOnPause;
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return lambdadrmkeysrestored3comgoogleandroidexoplayer2drmdrmsessioneventlistenereventdispatcher;
    }

    private static final Window write(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape) {
        _handleunrecognizedcharacterescape.read(1009281237);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(1009281237, 0, -1, "com.google.accompanist.systemuicontroller.findWindow (SystemUiController.kt:191)");
        }
        ViewParent parent = ((View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver())).getParent();
        resolveForwardReference resolveforwardreference = parent instanceof resolveForwardReference ? (resolveForwardReference) parent : null;
        Window windowAudioAttributesCompatParcelizer = resolveforwardreference != null ? resolveforwardreference.AudioAttributesCompatParcelizer() : null;
        if (windowAudioAttributesCompatParcelizer == null) {
            Context context = ((View) _handleunrecognizedcharacterescape.write(AndroidCompositionLocals_androidKt.MediaBrowserCompatItemReceiver())).getContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
            windowAudioAttributesCompatParcelizer = read(context);
        }
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        _handleunrecognizedcharacterescape.RatingCompat();
        return windowAudioAttributesCompatParcelizer;
    }

    private static final Window read(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        }
        return ((Activity) context).getWindow();
    }

    /* JADX INFO: renamed from: o.DrmSessionEventListenerEventDispatcherExternalSyntheticLambda3$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/switchToNext;", "p0", "AudioAttributesCompatParcelizer", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<switchToNext, switchToNext> {
        public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ switchToNext invoke(switchToNext switchtonext) {
            return switchToNext.write(AudioAttributesCompatParcelizer(switchtonext.getIconCompatParcelizer()));
        }

        public final long AudioAttributesCompatParcelizer(long j) {
            return RequestPayload.RemoteActionCompatParcelizer(DrmSessionEventListenerEventDispatcherExternalSyntheticLambda3.RemoteActionCompatParcelizer, j);
        }

        AnonymousClass1() {
            super(1);
        }
    }
}
