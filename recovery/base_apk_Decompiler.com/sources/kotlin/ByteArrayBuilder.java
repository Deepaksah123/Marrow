package kotlin;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000b\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001f"}, d2 = {"Lo/ByteArrayBuilder;", "Lo/buf;", "Landroid/view/ViewGroup;", "p0", "<init>", "(Landroid/view/ViewGroup;)V", "", "write", "()V", "Landroid/content/Context;", "(Landroid/content/Context;)V", "IconCompatParcelizer", "Lo/hasAnyGetter;", "()Lo/hasAnyGetter;", "RemoteActionCompatParcelizer", "(Lo/hasAnyGetter;)V", "Landroid/view/View;", "", "(Landroid/view/View;)J", "MediaBrowserCompatItemReceiver", "Landroid/view/ViewGroup;", "read", "", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "", "Z", "Lo/isManagedReference;", "AudioAttributesImplBaseParcelizer", "Lo/isManagedReference;", "Landroid/content/ComponentCallbacks2;", "Landroid/content/ComponentCallbacks2;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ByteArrayBuilder implements buf {

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private isManagedReference RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ViewGroup read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;
    public static boolean AudioAttributesCompatParcelizer = true;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer = new Object();

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final ComponentCallbacks2 write = new ComponentCallbacks2() { // from class: o.ByteArrayBuilder.5
        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration p0) {
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int p0) {
            if (p0 >= 40) {
                ByteArrayBuilder.this.write();
            }
        }
    };

    public ByteArrayBuilder(ViewGroup viewGroup) {
        this.read = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            write(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.ByteArrayBuilder.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View p0) {
                ByteArrayBuilder.this.write(p0.getContext());
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View p0) {
                ByteArrayBuilder.this.IconCompatParcelizer(p0.getContext());
                ByteArrayBuilder.this.write();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        isManagedReference ismanagedreference = this.RemoteActionCompatParcelizer;
        if (ismanagedreference != null) {
            ismanagedreference.read();
        }
        this.RemoteActionCompatParcelizer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(Context p0) {
        if (this.IconCompatParcelizer) {
            return;
        }
        p0.getApplicationContext().registerComponentCallbacks(this.write);
        this.IconCompatParcelizer = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(Context p0) {
        if (this.IconCompatParcelizer) {
            p0.getApplicationContext().unregisterComponentCallbacks(this.write);
            this.IconCompatParcelizer = false;
        }
    }

    @Override // kotlin.buf
    public final hasAnyGetter IconCompatParcelizer() {
        hasAnyGetter hasanygetter;
        synchronized (this.AudioAttributesCompatParcelizer) {
            hasanygetter = new hasAnyGetter(new hasIgnoreMarker(IconCompatParcelizer(this.read), null, null, 6, null));
        }
        return hasanygetter;
    }

    @Override // kotlin.buf
    public final void RemoteActionCompatParcelizer(hasAnyGetter p0) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            p0.onAddQueueItem();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    private final long IconCompatParcelizer(View p0) {
        return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(p0);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ByteArrayBuilder$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroid/view/View;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        public static final AudioAttributesCompatParcelizer INSTANCE = new AudioAttributesCompatParcelizer();

        private AudioAttributesCompatParcelizer() {
        }

        @getMagicModuleMeta
        public static final long AudioAttributesCompatParcelizer(View p0) {
            return p0.getUniqueDrawingId();
        }
    }
}
