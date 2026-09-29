package kotlin;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setTrimFrameCount extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ XmpData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setTrimFrameCount(XmpData xmpData) {
        super(0);
        this.write = xmpData;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        SensorManager sensorManager = this.write.read;
        toMagicModuleMetaRepoModel.write(sensorManager);
        List<Sensor> sensorList = sensorManager.getSensorList(-1);
        toMagicModuleMetaRepoModel.write(sensorList);
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) sensorList, 10));
        for (Sensor sensor : sensorList) {
            toMagicModuleMetaRepoModel.write(sensor);
            String name = sensor.getName();
            toMagicModuleMetaRepoModel.write((Object) name);
            String vendor = sensor.getVendor();
            toMagicModuleMetaRepoModel.write((Object) vendor);
            arrayList.add(new TeeAudioProcessorWavFileAudioBufferSink(name, vendor));
        }
        return arrayList;
    }
}
