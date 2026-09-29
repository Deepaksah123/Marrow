package kotlin;

import android.location.Location;
import android.location.LocationManager;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class DtsUtil extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ maybePrepareFile AudioAttributesCompatParcelizer;
    private /* synthetic */ String RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DtsUtil(maybePrepareFile maybepreparefile, String str) {
        super(1);
        this.AudioAttributesCompatParcelizer = maybepreparefile;
        this.RemoteActionCompatParcelizer = str;
    }

    private void write(final interpolate interpolateVar) {
        final CancellationSignal cancellationSignal = new CancellationSignal();
        LocationManager locationManager = this.AudioAttributesCompatParcelizer.read;
        toMagicModuleMetaRepoModel.write(locationManager);
        String str = this.RemoteActionCompatParcelizer;
        Executor mainExecutor = _isNaN.getMainExecutor(this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(mainExecutor);
        locationManager.getCurrentLocation(str, cancellationSignal, mainExecutor, new Consumer() { // from class: o.getNormalizedFrameHeader
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DtsUtil.read(interpolateVar, cancellationSignal, (Location) obj);
            }
        });
    }

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ Object invoke(Object obj) {
        write((interpolate) obj);
        return getShowPopup.INSTANCE;
    }

    public static final void read(interpolate interpolateVar, CancellationSignal cancellationSignal, Location location) {
        if (location != null) {
            interpolateVar.IconCompatParcelizer(location);
            cancellationSignal.cancel();
        }
    }
}
