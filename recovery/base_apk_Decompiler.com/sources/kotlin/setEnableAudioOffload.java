package kotlin;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class setEnableAudioOffload implements onUpgrade {
    private final setEnableDecoderFallback AudioAttributesCompatParcelizer;
    final CVolumeFlags RemoteActionCompatParcelizer;
    final toBundle read;

    static {
        n.write("WMFgUpdater");
    }

    public setEnableAudioOffload(WorkDatabase workDatabase, toBundle tobundle, setEnableDecoderFallback setenabledecoderfallback) {
        this.read = tobundle;
        this.AudioAttributesCompatParcelizer = setenabledecoderfallback;
        this.RemoteActionCompatParcelizer = workDatabase.onMediaButtonEvent();
    }

    @Override // kotlin.onUpgrade
    public final Mp4ExtractorExternalSyntheticLambda0<Void> RemoteActionCompatParcelizer(final Context context, final UUID uuid, final eb ebVar) {
        return i.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.read(), "setForegroundAsync", new getCreatedOnDateMs() { // from class: o.setAllowedVideoJoiningTimeMs
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(uuid, ebVar, context);
            }
        });
    }

    final /* synthetic */ Void RemoteActionCompatParcelizer(UUID uuid, eb ebVar, Context context) {
        String string = uuid.toString();
        CVideoChangeFrameRateStrategy cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(string);
        if (cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer == null || cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer.onCommand.AudioAttributesCompatParcelizer()) {
            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
        this.read.read(string, ebVar);
        context.startService(BundleListRetriever.AudioAttributesCompatParcelizer(context, onReleased.read(cVideoChangeFrameRateStrategyAudioAttributesCompatParcelizer), ebVar));
        return null;
    }
}
