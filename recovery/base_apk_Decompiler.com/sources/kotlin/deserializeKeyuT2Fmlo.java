package kotlin;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class deserializeKeyuT2Fmlo extends RecyclerView.AudioAttributesImplApi26Parcelizer {
    private boolean write = true;

    public abstract boolean IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent);

    public abstract boolean read(RecyclerView.onMediaButtonEvent onmediabuttonevent);

    public abstract boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, int i, int i2, int i3, int i4);

    public abstract boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.onMediaButtonEvent onmediabuttonevent2, int i, int i2, int i3, int i4);

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.write = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean AudioAttributesImplBaseParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        return !this.write || onmediabuttonevent.isInvalid();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean RemoteActionCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2) {
        int i = writeVar.RemoteActionCompatParcelizer;
        int i2 = writeVar.read;
        View view = onmediabuttonevent.itemView;
        int left = writeVar2 == null ? view.getLeft() : writeVar2.RemoteActionCompatParcelizer;
        int top = writeVar2 == null ? view.getTop() : writeVar2.read;
        if (!onmediabuttonevent.isRemoved() && (i != left || i2 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return write(onmediabuttonevent, i, i2, left, top);
        }
        return IconCompatParcelizer(onmediabuttonevent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean IconCompatParcelizer(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2) {
        if (writeVar != null && (writeVar.RemoteActionCompatParcelizer != writeVar2.RemoteActionCompatParcelizer || writeVar.read != writeVar2.read)) {
            return write(onmediabuttonevent, writeVar.RemoteActionCompatParcelizer, writeVar.read, writeVar2.RemoteActionCompatParcelizer, writeVar2.read);
        }
        return read(onmediabuttonevent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2) {
        if (writeVar.RemoteActionCompatParcelizer != writeVar2.RemoteActionCompatParcelizer || writeVar.read != writeVar2.read) {
            return write(onmediabuttonevent, writeVar.RemoteActionCompatParcelizer, writeVar.read, writeVar2.RemoteActionCompatParcelizer, writeVar2.read);
        }
        RatingCompat(onmediabuttonevent);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplApi26Parcelizer
    public final boolean write(RecyclerView.onMediaButtonEvent onmediabuttonevent, RecyclerView.onMediaButtonEvent onmediabuttonevent2, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar, RecyclerView.AudioAttributesImplApi26Parcelizer.write writeVar2) {
        int i;
        int i2;
        int i3 = writeVar.RemoteActionCompatParcelizer;
        int i4 = writeVar.read;
        if (onmediabuttonevent2.shouldIgnore()) {
            int i5 = writeVar.RemoteActionCompatParcelizer;
            i2 = writeVar.read;
            i = i5;
        } else {
            i = writeVar2.RemoteActionCompatParcelizer;
            i2 = writeVar2.read;
        }
        return write(onmediabuttonevent, onmediabuttonevent2, i3, i4, i, i2);
    }

    public final void MediaDescriptionCompat(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer(onmediabuttonevent);
    }

    public final void RatingCompat(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer(onmediabuttonevent);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer(onmediabuttonevent);
    }

    public final void MediaBrowserCompatMediaItem(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
        AudioAttributesImplApi26Parcelizer(onmediabuttonevent);
    }
}
