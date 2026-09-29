package kotlin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class setStreamKeys {
    private final Map<onVolumeChanged, setDrmPlayClearContentWithoutKey<?>> IconCompatParcelizer = new HashMap();
    private final Map<onVolumeChanged, setDrmPlayClearContentWithoutKey<?>> read = new HashMap();

    setStreamKeys() {
    }

    final setDrmPlayClearContentWithoutKey<?> write(onVolumeChanged onvolumechanged, boolean z) {
        return IconCompatParcelizer(z).get(onvolumechanged);
    }

    final void RemoteActionCompatParcelizer(onVolumeChanged onvolumechanged, setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkey) {
        IconCompatParcelizer(setdrmplayclearcontentwithoutkey.read()).put(onvolumechanged, setdrmplayclearcontentwithoutkey);
    }

    final void IconCompatParcelizer(onVolumeChanged onvolumechanged, setDrmPlayClearContentWithoutKey<?> setdrmplayclearcontentwithoutkey) {
        Map<onVolumeChanged, setDrmPlayClearContentWithoutKey<?>> mapIconCompatParcelizer = IconCompatParcelizer(setdrmplayclearcontentwithoutkey.read());
        if (setdrmplayclearcontentwithoutkey.equals(mapIconCompatParcelizer.get(onvolumechanged))) {
            mapIconCompatParcelizer.remove(onvolumechanged);
        }
    }

    private Map<onVolumeChanged, setDrmPlayClearContentWithoutKey<?>> IconCompatParcelizer(boolean z) {
        return z ? this.read : this.IconCompatParcelizer;
    }
}
