package kotlin;

import android.os.Handler;
import com.facebook.GraphRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonSeekForwardIncrementChanged46 {
    private long AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private final long MediaBrowserCompatItemReceiver;
    private long RemoteActionCompatParcelizer;
    private final GraphRequest read;
    private final Handler write;

    public lambdaonSeekForwardIncrementChanged46(Handler handler, GraphRequest graphRequest) {
        toMagicModuleMetaRepoModel.write(graphRequest, "");
        this.write = handler;
        this.read = graphRequest;
        this.MediaBrowserCompatItemReceiver = lambdaonMediaMetadataChanged48.MediaDescriptionCompat();
    }

    public final void read(long j) {
        long j2 = this.AudioAttributesCompatParcelizer + j;
        this.AudioAttributesCompatParcelizer = j2;
        if (j2 >= this.RemoteActionCompatParcelizer + this.MediaBrowserCompatItemReceiver || j2 >= this.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer();
        }
    }

    public final void IconCompatParcelizer(long j) {
        this.IconCompatParcelizer += j;
    }

    public final void AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer > this.RemoteActionCompatParcelizer) {
            final GraphRequest.write audioAttributesCompatParcelizer = this.read.getAudioAttributesCompatParcelizer();
            final long j = this.IconCompatParcelizer;
            if (j <= 0 || !(audioAttributesCompatParcelizer instanceof GraphRequest.read)) {
                return;
            }
            final long j2 = this.AudioAttributesCompatParcelizer;
            Handler handler = this.write;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.lambdaonSeekForwardIncrementChanged46.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                });
            }
            this.RemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        }
    }
}
