package kotlin;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onStreamChanged<T> {
    private final LinkedHashSet<seekToPreviousMediaItem<T>> AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private final setEnableDecoderFallback read;
    private T write;

    public abstract void AudioAttributesCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    public abstract T read();

    protected onStreamChanged(Context context, setEnableDecoderFallback setenabledecoderfallback) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(setenabledecoderfallback, "");
        this.read = setenabledecoderfallback;
        Context applicationContext = context.getApplicationContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(applicationContext, "");
        this.IconCompatParcelizer = applicationContext;
        this.RemoteActionCompatParcelizer = new Object();
        this.AudioAttributesCompatParcelizer = new LinkedHashSet<>();
    }

    protected final Context write() {
        return this.IconCompatParcelizer;
    }

    public final void read(seekToPreviousMediaItem<T> seektopreviousmediaitem) {
        toMagicModuleMetaRepoModel.write(seektopreviousmediaitem, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.AudioAttributesCompatParcelizer.add(seektopreviousmediaitem)) {
                if (this.AudioAttributesCompatParcelizer.size() == 1) {
                    this.write = read();
                    n.write();
                    String unused = skipSource.write;
                    getClass().getSimpleName();
                    Objects.toString(this.write);
                    AudioAttributesCompatParcelizer();
                }
                seektopreviousmediaitem.RemoteActionCompatParcelizer(this.write);
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void write(seekToPreviousMediaItem<T> seektopreviousmediaitem) {
        toMagicModuleMetaRepoModel.write(seektopreviousmediaitem, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.AudioAttributesCompatParcelizer.remove(seektopreviousmediaitem) && this.AudioAttributesCompatParcelizer.isEmpty()) {
                RemoteActionCompatParcelizer();
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final T AudioAttributesImplBaseParcelizer() {
        T t = this.write;
        return t == null ? read() : t;
    }

    public final void IconCompatParcelizer(T t) {
        synchronized (this.RemoteActionCompatParcelizer) {
            T t2 = this.write;
            if (t2 == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t2, t)) {
                this.write = t;
                final List listOnPlay = IntermediateLoginResponseBody.onPlay(this.AudioAttributesCompatParcelizer);
                this.read.AudioAttributesCompatParcelizer().execute(new Runnable() { // from class: o.onStopped
                    @Override // java.lang.Runnable
                    public final void run() {
                        onStreamChanged.write(listOnPlay, this);
                    }
                });
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(List list, onStreamChanged onstreamchanged) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((seekToPreviousMediaItem) it.next()).RemoteActionCompatParcelizer(onstreamchanged.write);
        }
    }
}
