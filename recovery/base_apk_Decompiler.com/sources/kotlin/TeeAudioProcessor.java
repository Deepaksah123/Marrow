package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TeeAudioProcessor {
    public static final Object RemoteActionCompatParcelizer(getAnswerMap getanswermap) throws InterruptedException {
        interpolate interpolateVar = new interpolate();
        getanswermap.invoke(interpolateVar);
        interpolateVar.AudioAttributesCompatParcelizer.await();
        if (interpolateVar.AudioAttributesCompatParcelizer.getCount() == 0) {
            return interpolateVar.RemoteActionCompatParcelizer;
        }
        throw new IllegalStateException("Check failed.");
    }
}
