package kotlin;

import android.os.Handler;
import com.facebook.GraphRequest;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonRenderedFirstFrame19 extends OutputStream implements lambdaonShuffleModeEnabledChanged40 {
    private final Map<GraphRequest, lambdaonSeekForwardIncrementChanged46> AudioAttributesCompatParcelizer = new HashMap();
    private lambdaonSeekForwardIncrementChanged46 IconCompatParcelizer;
    private final Handler RemoteActionCompatParcelizer;
    private int read;
    private GraphRequest write;

    public lambdaonRenderedFirstFrame19(Handler handler) {
        this.RemoteActionCompatParcelizer = handler;
    }

    public final int write() {
        return this.read;
    }

    @Override // kotlin.lambdaonShuffleModeEnabledChanged40
    public final void AudioAttributesCompatParcelizer(GraphRequest graphRequest) {
        this.write = graphRequest;
        this.IconCompatParcelizer = graphRequest != null ? this.AudioAttributesCompatParcelizer.get(graphRequest) : null;
    }

    public final Map<GraphRequest, lambdaonSeekForwardIncrementChanged46> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void read(long j) {
        GraphRequest graphRequest = this.write;
        if (graphRequest != null) {
            if (this.IconCompatParcelizer == null) {
                lambdaonSeekForwardIncrementChanged46 lambdaonseekforwardincrementchanged46 = new lambdaonSeekForwardIncrementChanged46(this.RemoteActionCompatParcelizer, graphRequest);
                this.IconCompatParcelizer = lambdaonseekforwardincrementchanged46;
                this.AudioAttributesCompatParcelizer.put(graphRequest, lambdaonseekforwardincrementchanged46);
            }
            lambdaonSeekForwardIncrementChanged46 lambdaonseekforwardincrementchanged462 = this.IconCompatParcelizer;
            if (lambdaonseekforwardincrementchanged462 != null) {
                lambdaonseekforwardincrementchanged462.IconCompatParcelizer(j);
            }
            this.read += (int) j;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        read(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        toMagicModuleMetaRepoModel.write(bArr, "");
        read(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        read(1L);
    }
}
