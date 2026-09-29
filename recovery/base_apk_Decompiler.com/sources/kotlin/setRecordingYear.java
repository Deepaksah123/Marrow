package kotlin;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setRecordingYear<T extends Drawable> implements setMimeType<T>, setLiveTargetOffsetMs {
    public final T RemoteActionCompatParcelizer;

    public setRecordingYear(T t) {
        this.RemoteActionCompatParcelizer = (T) moveMediaSource.AudioAttributesCompatParcelizer(t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.setMimeType
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public T RemoteActionCompatParcelizer() {
        Drawable.ConstantState constantState = this.RemoteActionCompatParcelizer.getConstantState();
        if (constantState == null) {
            return this.RemoteActionCompatParcelizer;
        }
        return (T) constantState.newDrawable();
    }

    public void IconCompatParcelizer() {
        T t = this.RemoteActionCompatParcelizer;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof setYear) {
            ((setYear) t).read().prepareToDraw();
        }
    }
}
