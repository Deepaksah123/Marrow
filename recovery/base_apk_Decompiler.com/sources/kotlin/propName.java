package kotlin;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u001c\u0010\f\u001a\u00020\u00128\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0013\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u000e\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/propName;", "", "Landroid/content/Context;", "p0", "Lkotlin/Function1;", "Lo/_checkNeedForRehash;", "", "p1", "<init>", "(Landroid/content/Context;Lo/getAnswerMap;)V", "Lo/DatabindContext;", "", "read", "(Lo/DatabindContext;Z)Z", "AudioAttributesCompatParcelizer", "()V", "Lo/getAnswerMap;", "RemoteActionCompatParcelizer", "Lo/getWrapperName;", "write", "I", "()I", "Z", "Landroid/view/GestureDetector;", "IconCompatParcelizer", "Landroid/view/GestureDetector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class propName {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final GestureDetector AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<_checkNeedForRehash, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read = getWrapperName.INSTANCE.write();

    /* JADX WARN: Multi-variable type inference failed */
    public propName(Context context, getAnswerMap<? super _checkNeedForRehash, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = getanswermap;
        this.AudioAttributesCompatParcelizer = new GestureDetector(context, new RemoteActionCompatParcelizer());
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006J1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\tJ1\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0010"}, d2 = {"Lo/propName$RemoteActionCompatParcelizer;", "Landroid/view/GestureDetector$OnGestureListener;", "Landroid/view/MotionEvent;", "p0", "", "onDown", "(Landroid/view/MotionEvent;)Z", "", "onShowPress", "(Landroid/view/MotionEvent;)V", "onSingleTapUp", "p1", "", "p2", "p3", "onScroll", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z", "onLongPress", "onFling"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements GestureDetector.OnGestureListener {
        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent p0) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent p0) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent p0, MotionEvent p1, float p2, float p3) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final void onShowPress(MotionEvent p0) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent p0) {
            return true;
        }

        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent p0, MotionEvent p1, float p2, float p3) {
            if (propName.this.write) {
                return true;
            }
            if (getWrapperName.RemoteActionCompatParcelizer(propName.this.getRead(), getWrapperName.INSTANCE.AudioAttributesCompatParcelizer())) {
                if (Math.abs(p2) > Math.abs(p3)) {
                    propName.this.RemoteActionCompatParcelizer.invoke(_checkNeedForRehash.read(p2 > BitmapDescriptorFactory.HUE_RED ? _checkNeedForRehash.INSTANCE.write() : _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer()));
                }
            } else if (getWrapperName.RemoteActionCompatParcelizer(propName.this.getRead(), getWrapperName.INSTANCE.RemoteActionCompatParcelizer()) && Math.abs(p3) > Math.abs(p2)) {
                propName.this.RemoteActionCompatParcelizer.invoke(_checkNeedForRehash.read(p3 > BitmapDescriptorFactory.HUE_RED ? _checkNeedForRehash.INSTANCE.write() : _checkNeedForRehash.INSTANCE.AudioAttributesImplBaseParcelizer()));
            }
            return true;
        }
    }

    public final boolean read(DatabindContext p0, boolean p1) {
        MotionEvent motionEventAudioAttributesCompatParcelizer = getMetadata.AudioAttributesCompatParcelizer(p0);
        int action = motionEventAudioAttributesCompatParcelizer.getAction();
        if (action == 0) {
            this.read = p0.getRead();
            this.write = false;
        } else if ((action == 1 || action == 2) && p1) {
            AudioAttributesCompatParcelizer();
        }
        return this.AudioAttributesCompatParcelizer.onTouchEvent(motionEventAudioAttributesCompatParcelizer);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.read = getWrapperName.INSTANCE.write();
        this.write = true;
    }
}
