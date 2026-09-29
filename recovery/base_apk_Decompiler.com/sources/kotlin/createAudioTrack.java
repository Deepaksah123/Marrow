package kotlin;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class createAudioTrack extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ DefaultAudioSinkDefaultAudioProcessorChain write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createAudioTrack(DefaultAudioSinkDefaultAudioProcessorChain defaultAudioSinkDefaultAudioProcessorChain) {
        super(0);
        this.write = defaultAudioSinkDefaultAudioProcessorChain;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        return String.valueOf(((Double) Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", null).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(this.write.write), null)).doubleValue());
    }
}
