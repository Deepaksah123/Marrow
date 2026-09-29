package kotlin;

import android.location.Location;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class setAudioSinkPreferredDevice extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ Location RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setAudioSinkPreferredDevice(Location location) {
        super(1);
        this.RemoteActionCompatParcelizer = location;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) {
        return Long.valueOf((SystemClock.elapsedRealtimeNanos() - this.RemoteActionCompatParcelizer.getElapsedRealtimeNanos()) / 1000000);
    }
}
