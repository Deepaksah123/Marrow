package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onInputFormatChanged extends AudioRendererEventListenerEventDispatcher {
    public onInputFormatChanged(List list, AudioProcessor audioProcessor) {
        super(clearFlag.AudioAttributesCompatParcelizer.write(), list, audioProcessor);
    }
}
