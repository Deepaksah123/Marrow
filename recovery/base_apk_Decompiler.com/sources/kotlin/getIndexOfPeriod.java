package kotlin;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.EnumDeserializer;

/* JADX INFO: loaded from: classes2.dex */
public final class getIndexOfPeriod {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Mp4ExtractorExternalSyntheticLambda0<T> AudioAttributesCompatParcelizer(final Executor executor, final getCreatedOnDateMs<? extends T> getcreatedondatems) {
        Mp4ExtractorExternalSyntheticLambda0<T> mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer = EnumDeserializer.AudioAttributesCompatParcelizer(new EnumDeserializer.write() { // from class: o.getUidOfPeriod
            @Override // o.EnumDeserializer.write
            public final Object AudioAttributesCompatParcelizer(EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
                return getIndexOfPeriod.RemoteActionCompatParcelizer(executor, getcreatedondatems, remoteActionCompatParcelizer);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer, "");
        return mp4ExtractorExternalSyntheticLambda0AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(Executor executor, final getCreatedOnDateMs getcreatedondatems, final EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        remoteActionCompatParcelizer.write(new Runnable() { // from class: o.getFirstWindowIndex
            @Override // java.lang.Runnable
            public final void run() {
                getIndexOfPeriod.AudioAttributesCompatParcelizer(atomicBoolean);
            }
        }, g.write);
        executor.execute(new Runnable() { // from class: o.getLastWindowIndex
            @Override // java.lang.Runnable
            public final void run() {
                getIndexOfPeriod.AudioAttributesCompatParcelizer(atomicBoolean, remoteActionCompatParcelizer, getcreatedondatems);
            }
        });
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(AtomicBoolean atomicBoolean) {
        atomicBoolean.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(AtomicBoolean atomicBoolean, EnumDeserializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getCreatedOnDateMs getcreatedondatems) {
        if (atomicBoolean.get()) {
            return;
        }
        try {
            remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(getcreatedondatems.invoke());
        } catch (Throwable th) {
            remoteActionCompatParcelizer.IconCompatParcelizer(th);
        }
    }
}
