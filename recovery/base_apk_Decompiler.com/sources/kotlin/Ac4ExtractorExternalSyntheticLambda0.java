package kotlin;

import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Ac4ExtractorExternalSyntheticLambda0 implements Runnable {
    public static int AudioAttributesCompatParcelizer;
    public static int IconCompatParcelizer;
    private /* synthetic */ Ac3Reader RemoteActionCompatParcelizer;
    private /* synthetic */ Runnable read;

    public /* synthetic */ Ac4ExtractorExternalSyntheticLambda0(Ac3Reader ac3Reader, Runnable runnable) {
        this.RemoteActionCompatParcelizer = ac3Reader;
        this.read = runnable;
    }

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 7128190;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        IconCompatParcelizer = elapsedCpuTime;
        return elapsedCpuTime;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.RemoteActionCompatParcelizer.write(this.read);
    }
}
