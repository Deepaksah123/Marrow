package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MaskingMediaPeriodPrepareListener<TResult> {
    private FilteringMediaSourceFilteringMediaPeriod IconCompatParcelizer;
    private TResult MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean write;
    public final Handler read = new Handler(Looper.getMainLooper());
    private final List<onPrepareComplete<TResult>> AudioAttributesImplBaseParcelizer = new ArrayList();
    private final List<getPreparePositionUs> AudioAttributesCompatParcelizer = new ArrayList();
    private final List<setPrepareListener> RemoteActionCompatParcelizer = new ArrayList();

    public MaskingMediaPeriodPrepareListener() {
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        this.write = false;
        this.MediaBrowserCompatItemReceiver = false;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.IconCompatParcelizer = null;
    }

    private void AudioAttributesCompatParcelizer() {
        boolean z = false;
        if (AudioAttributesImplBaseParcelizer() != null) {
            Iterator<onPrepareComplete<TResult>> it = this.AudioAttributesImplBaseParcelizer.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer(AudioAttributesImplBaseParcelizer());
                z = true;
            }
        }
        if (read() != null) {
            Iterator<getPreparePositionUs> it2 = this.AudioAttributesCompatParcelizer.iterator();
            while (it2.hasNext()) {
                it2.next().RemoteActionCompatParcelizer(read());
                z = true;
            }
        }
        if (z) {
            IconCompatParcelizer();
        }
    }

    public final MaskingMediaPeriodPrepareListener<TResult> IconCompatParcelizer(getPreparePositionUs getpreparepositionus) {
        this.AudioAttributesCompatParcelizer.add(getpreparepositionus);
        AudioAttributesCompatParcelizer();
        return this;
    }

    public final MaskingMediaPeriodPrepareListener<TResult> write(onPrepareComplete<TResult> onpreparecomplete) {
        this.AudioAttributesImplBaseParcelizer.add(onpreparecomplete);
        AudioAttributesCompatParcelizer();
        return this;
    }

    public final void RemoteActionCompatParcelizer() {
        Iterator<setPrepareListener> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer();
        }
    }

    private FilteringMediaSourceFilteringMediaPeriod read() {
        return this.IconCompatParcelizer;
    }

    private TResult AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final MaskingMediaPeriodPrepareListener<TResult> write() {
        this.AudioAttributesImplBaseParcelizer.clear();
        this.AudioAttributesCompatParcelizer.clear();
        this.RemoteActionCompatParcelizer.clear();
        return this;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.read.postDelayed(new Runnable() { // from class: o.MaskingMediaPeriodPrepareListener.1
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = MaskingMediaPeriodPrepareListener.this.AudioAttributesCompatParcelizer.iterator();
                while (it.hasNext()) {
                    ((getPreparePositionUs) it.next()).RemoteActionCompatParcelizer(new FilteringMediaSourceFilteringMediaPeriod(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.TOKEN_TIMEOUT));
                }
            }
        }, TimeUnit.SECONDS.toMillis(j));
    }

    public final void IconCompatParcelizer(FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
        this.IconCompatParcelizer = filteringMediaSourceFilteringMediaPeriod;
        this.MediaBrowserCompatItemReceiver = false;
        this.write = true;
        AudioAttributesCompatParcelizer();
    }

    public final void write(TResult tresult) {
        this.MediaBrowserCompatCustomActionResultReceiver = tresult;
        this.MediaBrowserCompatItemReceiver = true;
        this.write = true;
        AudioAttributesCompatParcelizer();
    }
}
