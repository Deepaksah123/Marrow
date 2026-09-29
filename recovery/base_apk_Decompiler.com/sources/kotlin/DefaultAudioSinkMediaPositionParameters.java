package kotlin;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAudioSinkMediaPositionParameters {
    public final Context AudioAttributesCompatParcelizer;
    public final LocationManager write;

    public DefaultAudioSinkMediaPositionParameters(Context context, LocationManager locationManager) {
        this.AudioAttributesCompatParcelizer = context;
        this.write = locationManager;
    }

    public static updateCurrentPosition AudioAttributesCompatParcelizer(Location location, String str) {
        if (location == null) {
            return null;
        }
        if (!((Boolean) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new createUnexpectedDecodeException(location), 7), Boolean.FALSE)).booleanValue()) {
            location = null;
        }
        if (location != null) {
            return new updateCurrentPosition(str, ((Number) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new setAudioSinkPreferredDevice(location), 7), 0L)).longValue());
        }
        return null;
    }

    public final ArrayList write() {
        List<String> list = (List) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new registerStreamEventCallbackV29(this), 7), IntermediateLoginResponseBody.RemoteActionCompatParcelizer());
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            updateCurrentPosition updatecurrentpositionAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer((Location) setForHeaderData.read(onProcessedStreamChange.AudioAttributesCompatParcelizer(0L, new isAudioTrackDeadObject(this, str), 7), null), str);
            if (updatecurrentpositionAudioAttributesCompatParcelizer != null) {
                arrayList.add(updatecurrentpositionAudioAttributesCompatParcelizer);
            }
        }
        return arrayList;
    }
}
