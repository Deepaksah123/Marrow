package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class unregisterAudioDeviceCallback extends AudioRendererEventListenerEventDispatcher {
    public unregisterAudioDeviceCallback(ArrayList arrayList, AudioProcessor audioProcessor) {
        super(StandaloneDatabaseProvider.AudioAttributesCompatParcelizer.write(), arrayList, audioProcessor);
    }
}
