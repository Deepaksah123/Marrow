package kotlin;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lo/CollectionDeserializer;", "", "<init>", "()V", "Lkotlin/Function0;", "", "p0", "Landroid/window/OnBackInvokedCallback;", "ci_", "(Lo/getCreatedOnDateMs;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "p1", "AudioAttributesCompatParcelizer", "(Landroid/view/View;Ljava/lang/Object;)V", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CollectionDeserializer {
    public static final CollectionDeserializer INSTANCE = new CollectionDeserializer();

    private CollectionDeserializer() {
    }

    @getMagicModuleMeta
    public static final OnBackInvokedCallback ci_(final getCreatedOnDateMs<getShowPopup> p0) {
        return new OnBackInvokedCallback() { // from class: o.ByteBufferDeserializer
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                CollectionDeserializer.IconCompatParcelizer(p0);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        if (getcreatedondatems != null) {
            getcreatedondatems.invoke();
        }
    }

    @getMagicModuleMeta
    public static final void AudioAttributesCompatParcelizer(View p0, Object p1) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(p1 instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = p0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(PlaybackException.CUSTOM_ERROR_CODE_BASE, (OnBackInvokedCallback) p1);
    }

    @getMagicModuleMeta
    public static final void write(View p0, Object p1) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(p1 instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = p0.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) p1);
    }
}
