package kotlin;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/getTranslateX;", "", "<init>", "()V", "Lo/setImageDisplayMode;", "p0", "Lo/Typed3EpoxyController;", "p1", "Landroid/view/inputmethod/HandwritingGesture;", "p2", "Lo/CoercionConfig;", "p3", "Ljava/util/concurrent/Executor;", "p4", "Ljava/util/function/IntConsumer;", "p5", "Lkotlin/Function1;", "Lo/findBeanDeserializer;", "", "p6", "bH_", "(Lo/setImageDisplayMode;Lo/Typed3EpoxyController;Landroid/view/inputmethod/HandwritingGesture;Lo/CoercionConfig;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lo/getAnswerMap;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "bI_", "(Lo/setImageDisplayMode;Lo/Typed3EpoxyController;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getTranslateX {
    public static final getTranslateX INSTANCE = new getTranslateX();

    private getTranslateX() {
    }

    public final void bH_(setImageDisplayMode p0, Typed3EpoxyController p1, HandwritingGesture p2, CoercionConfig p3, Executor p4, final IntConsumer p5, getAnswerMap<? super findBeanDeserializer, getShowPopup> p6) {
        final int iBV_ = p0 != null ? setOffscreenPageLimit.INSTANCE.bV_(p0, p2, p1, p3, p6) : 3;
        if (p5 == null) {
            return;
        }
        if (p4 != null) {
            p4.execute(new Runnable() { // from class: o.setTranslateY
                @Override // java.lang.Runnable
                public final void run() {
                    getTranslateX.RemoteActionCompatParcelizer(p5, iBV_);
                }
            });
        } else {
            p5.accept(iBV_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }

    public final boolean bI_(setImageDisplayMode p0, Typed3EpoxyController p1, PreviewableHandwritingGesture p2, CancellationSignal p3) {
        if (p0 != null) {
            return setOffscreenPageLimit.INSTANCE.bW_(p0, p2, p1, p3);
        }
        return false;
    }
}
