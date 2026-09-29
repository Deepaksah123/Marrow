package kotlin;

import android.content.Context;
import android.location.Geocoder;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdadecoderInitialized1comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Context RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdadecoderInitialized1comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(Context context) {
        super(1);
        this.RemoteActionCompatParcelizer = context;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return new Geocoder(this.RemoteActionCompatParcelizer, Locale.US);
    }
}
