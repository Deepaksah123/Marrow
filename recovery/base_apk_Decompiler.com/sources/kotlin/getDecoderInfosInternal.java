package kotlin;

import android.content.Context;
import com.google.firebase.perf.session.PerfSession;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class getDecoderInfosInternal {
    private static final getDecoderInfosInternal AudioAttributesCompatParcelizer = new getDecoderInfosInternal();
    private Future AudioAttributesImplApi26Parcelizer;
    private final isAlias IconCompatParcelizer;
    private final Set<WeakReference<getDecoderInfo>> RemoteActionCompatParcelizer;
    private final getCodecOutputMediaFormat read;
    private PerfSession write;

    public static getDecoderInfosInternal RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer;
    }

    public final PerfSession AudioAttributesCompatParcelizer() {
        return this.write;
    }

    private getDecoderInfosInternal() {
        this(isAlias.read(), PerfSession.AudioAttributesCompatParcelizer(""), getCodecOutputMediaFormat.RemoteActionCompatParcelizer());
    }

    private getDecoderInfosInternal(isAlias isalias, PerfSession perfSession, getCodecOutputMediaFormat getcodecoutputmediaformat) {
        this.RemoteActionCompatParcelizer = new HashSet();
        this.IconCompatParcelizer = isalias;
        this.write = perfSession;
        this.read = getcodecoutputmediaformat;
    }

    public final void RemoteActionCompatParcelizer(final Context context) {
        final PerfSession perfSession = this.write;
        this.AudioAttributesImplApi26Parcelizer = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: o.getVp9ProfileAndLevel
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.write(context, perfSession);
            }
        });
    }

    final /* synthetic */ void write(Context context, PerfSession perfSession) {
        this.IconCompatParcelizer.IconCompatParcelizer(context);
        if (perfSession.AudioAttributesCompatParcelizer()) {
            this.IconCompatParcelizer.read(perfSession.write(), lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND);
        }
    }

    public final void IconCompatParcelizer() {
        if (this.write.read()) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }

    public final void AudioAttributesCompatParcelizer(PerfSession perfSession) {
        if (perfSession.write() == this.write.write()) {
            return;
        }
        this.write = perfSession;
        synchronized (this.RemoteActionCompatParcelizer) {
            Iterator<WeakReference<getDecoderInfo>> it = this.RemoteActionCompatParcelizer.iterator();
            while (it.hasNext()) {
                getDecoderInfo getdecoderinfo = it.next().get();
                if (getdecoderinfo != null) {
                    getdecoderinfo.write(perfSession);
                } else {
                    it.remove();
                }
            }
        }
        read(this.read.IconCompatParcelizer());
        AudioAttributesCompatParcelizer(this.read.IconCompatParcelizer());
    }

    public final void write() {
        read(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND);
        AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter.FOREGROUND);
    }

    public final void AudioAttributesCompatParcelizer(WeakReference<getDecoderInfo> weakReference) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.add(weakReference);
        }
    }

    public final void write(WeakReference<getDecoderInfo> weakReference) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.remove(weakReference);
        }
    }

    private void read(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (this.write.AudioAttributesCompatParcelizer()) {
            this.IconCompatParcelizer.read(this.write.write(), lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        }
    }

    private void AudioAttributesCompatParcelizer(lambdasetOnFrameRenderedListener0comgoogleandroidexoplayer2mediacodecSynchronousMediaCodecAdapter lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter) {
        if (this.write.AudioAttributesCompatParcelizer()) {
            this.IconCompatParcelizer.IconCompatParcelizer(this.write, lambdasetonframerenderedlistener0comgoogleandroidexoplayer2mediacodecsynchronousmediacodecadapter);
        } else {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        }
    }
}
