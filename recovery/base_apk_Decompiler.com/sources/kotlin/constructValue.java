package kotlin;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.PrimitiveArrayDeserializersIntDeser;
import kotlin.convertValue;

/* JADX INFO: loaded from: classes2.dex */
public final class constructValue {
    private final MotionLayout AudioAttributesCompatParcelizer;
    private ArrayList<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> IconCompatParcelizer;
    private HashSet<View> read;
    private ArrayList<PrimitiveArrayDeserializersIntDeser> MediaBrowserCompatItemReceiver = new ArrayList<>();
    private String RemoteActionCompatParcelizer = "ViewTransitionController";
    private ArrayList<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> write = new ArrayList<>();

    public constructValue(MotionLayout motionLayout) {
        this.AudioAttributesCompatParcelizer = motionLayout;
    }

    public final void write(PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser) {
        this.MediaBrowserCompatItemReceiver.add(primitiveArrayDeserializersIntDeser);
        this.read = null;
        if (primitiveArrayDeserializersIntDeser.write() == 4) {
            RemoteActionCompatParcelizer(primitiveArrayDeserializersIntDeser, true);
        } else if (primitiveArrayDeserializersIntDeser.write() == 5) {
            RemoteActionCompatParcelizer(primitiveArrayDeserializersIntDeser, false);
        }
    }

    private void AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser, View... viewArr) {
        int iWrite = this.AudioAttributesCompatParcelizer.write();
        if (primitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer == 2) {
            primitiveArrayDeserializersIntDeser.RemoteActionCompatParcelizer(this, this.AudioAttributesCompatParcelizer, iWrite, null, viewArr);
            return;
        }
        if (iWrite == -1) {
            this.AudioAttributesCompatParcelizer.toString();
            return;
        }
        ReferenceTypeDeserializer referenceTypeDeserializerRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
        if (referenceTypeDeserializerRemoteActionCompatParcelizer == null) {
            return;
        }
        primitiveArrayDeserializersIntDeser.RemoteActionCompatParcelizer(this, this.AudioAttributesCompatParcelizer, iWrite, referenceTypeDeserializerRemoteActionCompatParcelizer, viewArr);
    }

    final void RemoteActionCompatParcelizer(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        for (PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser : this.MediaBrowserCompatItemReceiver) {
            if (primitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer() == i) {
                for (View view : viewArr) {
                    if (primitiveArrayDeserializersIntDeser.RemoteActionCompatParcelizer(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AudioAttributesCompatParcelizer(primitiveArrayDeserializersIntDeser, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
            }
        }
    }

    public final void IconCompatParcelizer(MotionEvent motionEvent) {
        int iWrite = this.AudioAttributesCompatParcelizer.write();
        if (iWrite != -1) {
            if (this.read == null) {
                this.read = new HashSet<>();
                for (PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser : this.MediaBrowserCompatItemReceiver) {
                    int childCount = this.AudioAttributesCompatParcelizer.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.AudioAttributesCompatParcelizer.getChildAt(i);
                        if (primitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer(childAt)) {
                            childAt.getId();
                            this.read.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> arrayList = this.IconCompatParcelizer;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> it = this.IconCompatParcelizer.iterator();
                while (it.hasNext()) {
                    it.next().RemoteActionCompatParcelizer(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                ReferenceTypeDeserializer referenceTypeDeserializerRemoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(iWrite);
                for (PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser2 : this.MediaBrowserCompatItemReceiver) {
                    if (primitiveArrayDeserializersIntDeser2.RemoteActionCompatParcelizer(action)) {
                        for (View view : this.read) {
                            if (primitiveArrayDeserializersIntDeser2.AudioAttributesCompatParcelizer(view)) {
                                view.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    primitiveArrayDeserializersIntDeser2.RemoteActionCompatParcelizer(this, this.AudioAttributesCompatParcelizer, iWrite, referenceTypeDeserializerRemoteActionCompatParcelizer, view);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void RemoteActionCompatParcelizer(PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new ArrayList<>();
        }
        this.IconCompatParcelizer.add(audioAttributesCompatParcelizer);
    }

    final void AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write.add(audioAttributesCompatParcelizer);
    }

    public final void read() {
        ArrayList<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> arrayList = this.IconCompatParcelizer;
        if (arrayList != null) {
            Iterator<PrimitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().IconCompatParcelizer();
            }
            this.IconCompatParcelizer.removeAll(this.write);
            this.write.clear();
            if (this.IconCompatParcelizer.isEmpty()) {
                this.IconCompatParcelizer = null;
            }
        }
    }

    final void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.invalidate();
    }

    final boolean write(int i, handleSingleElementUnwrapped handlesingleelementunwrapped) {
        for (PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser : this.MediaBrowserCompatItemReceiver) {
            if (primitiveArrayDeserializersIntDeser.AudioAttributesCompatParcelizer() == i) {
                primitiveArrayDeserializersIntDeser.read.read(handlesingleelementunwrapped);
                return true;
            }
        }
        return false;
    }

    private void RemoteActionCompatParcelizer(final PrimitiveArrayDeserializersIntDeser primitiveArrayDeserializersIntDeser, final boolean z) {
        final int iRemoteActionCompatParcelizer = primitiveArrayDeserializersIntDeser.RemoteActionCompatParcelizer();
        final int i = primitiveArrayDeserializersIntDeser.read();
        ConstraintLayout.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(primitiveArrayDeserializersIntDeser.RemoteActionCompatParcelizer(), new convertValue.AudioAttributesCompatParcelizer() { // from class: o.constructValue.3
        });
    }
}
