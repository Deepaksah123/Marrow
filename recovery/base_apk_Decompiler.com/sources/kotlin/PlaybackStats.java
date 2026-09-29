package kotlin;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStats extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ getMeanInitialAudioFormatBitrate read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybackStats(getMeanInitialAudioFormatBitrate getmeaninitialaudioformatbitrate) {
        super(0);
        this.read = getmeaninitialaudioformatbitrate;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        InputManager inputManager = this.read.read;
        toMagicModuleMetaRepoModel.write(inputManager);
        int[] inputDeviceIds = inputManager.getInputDeviceIds();
        toMagicModuleMetaRepoModel.write(inputDeviceIds);
        getMeanInitialAudioFormatBitrate getmeaninitialaudioformatbitrate = this.read;
        ArrayList arrayList = new ArrayList(inputDeviceIds.length);
        for (int i : inputDeviceIds) {
            InputDevice inputDevice = getmeaninitialaudioformatbitrate.read.getInputDevice(i);
            toMagicModuleMetaRepoModel.write(inputDevice);
            int vendorId = inputDevice.getVendorId();
            String name = inputDevice.getName();
            toMagicModuleMetaRepoModel.write((Object) name);
            arrayList.add(new maybeReportTrackChanges(name, String.valueOf(vendorId)));
        }
        return arrayList;
    }
}
