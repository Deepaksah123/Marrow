package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.PrimitiveArrayDeserializersFloatDeser;
import kotlin.ReferenceTypeDeserializer;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveArrayDeserializersIntDeser {
    int AudioAttributesCompatParcelizer;
    private ReferenceTypeDeserializer.write IconCompatParcelizer;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int RatingCompat;
    private Context RemoteActionCompatParcelizer;
    private String onPlayFromMediaId;
    ObjectArrayDeserializer read;
    private int MediaMetadataCompat = -1;
    private boolean MediaBrowserCompatItemReceiver = false;
    private int MediaDescriptionCompat = 0;
    private int AudioAttributesImplApi26Parcelizer = -1;
    private int onPause = -1;
    private int AudioAttributesImplApi21Parcelizer = 0;
    private String MediaBrowserCompatCustomActionResultReceiver = null;
    private int AudioAttributesImplBaseParcelizer = -1;
    private int onCustomAction = -1;
    private int write = -1;
    private int MediaBrowserCompatMediaItem = -1;
    private int MediaBrowserCompatSearchResultReceiver = -1;
    private int onAddQueueItem = -1;
    private int onCommand = -1;
    private int handleMediaPlayPauseIfPendingOnHandler = -1;

    public final int write() {
        return this.MediaMetadataCompat;
    }

    public final int read() {
        return this.onAddQueueItem;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.onCommand;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewTransition(");
        sb.append(NumberDeserializersShortDeserializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.RatingCompat));
        sb.append(")");
        return sb.toString();
    }

    private Interpolator IconCompatParcelizer(Context context) {
        int i = this.AudioAttributesImplApi21Parcelizer;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(context, this.AudioAttributesImplBaseParcelizer);
        }
        if (i == -1) {
            final EnumMapDeserializer enumMapDeserializerIconCompatParcelizer = EnumMapDeserializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            return new Interpolator() { // from class: o.PrimitiveArrayDeserializersIntDeser.3
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) enumMapDeserializerIconCompatParcelizer.AudioAttributesCompatParcelizer(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    PrimitiveArrayDeserializersIntDeser(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersIntDeser.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void read(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == _isBlank.read.ViewTransition_android_id) {
                this.RatingCompat = typedArrayObtainStyledAttributes.getResourceId(index, this.RatingCompat);
            } else if (index == _isBlank.read.ViewTransition_motionTarget) {
                if (MotionLayout.RemoteActionCompatParcelizer) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = resourceId;
                    if (resourceId == -1) {
                        this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.onPlayFromMediaId = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                }
            } else if (index == _isBlank.read.ViewTransition_onStateTransition) {
                this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getInt(index, this.MediaMetadataCompat);
            } else if (index == _isBlank.read.ViewTransition_transitionDisable) {
                this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaBrowserCompatItemReceiver);
            } else if (index == _isBlank.read.ViewTransition_pathMotionArc) {
                this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getInt(index, this.MediaDescriptionCompat);
            } else if (index == _isBlank.read.ViewTransition_duration) {
                this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi26Parcelizer);
            } else if (index == _isBlank.read.ViewTransition_upDuration) {
                this.onPause = typedArrayObtainStyledAttributes.getInt(index, this.onPause);
            } else if (index == _isBlank.read.ViewTransition_viewTransitionMode) {
                this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesCompatParcelizer);
            } else if (index == _isBlank.read.ViewTransition_motionInterpolator) {
                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                if (typedValuePeekValue.type == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.AudioAttributesImplBaseParcelizer = resourceId2;
                    if (resourceId2 != -1) {
                        this.AudioAttributesImplApi21Parcelizer = -2;
                    }
                } else if (typedValuePeekValue.type == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.MediaBrowserCompatCustomActionResultReceiver = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.AudioAttributesImplApi21Parcelizer = -2;
                    } else {
                        this.AudioAttributesImplApi21Parcelizer = -1;
                    }
                } else {
                    this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getInteger(index, this.AudioAttributesImplApi21Parcelizer);
                }
            } else if (index == _isBlank.read.ViewTransition_setsTag) {
                this.onCustomAction = typedArrayObtainStyledAttributes.getResourceId(index, this.onCustomAction);
            } else if (index == _isBlank.read.ViewTransition_clearsTag) {
                this.write = typedArrayObtainStyledAttributes.getResourceId(index, this.write);
            } else if (index == _isBlank.read.ViewTransition_ifTagSet) {
                this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaBrowserCompatMediaItem);
            } else if (index == _isBlank.read.ViewTransition_ifTagNotSet) {
                this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getResourceId(index, this.MediaBrowserCompatSearchResultReceiver);
            } else if (index == _isBlank.read.ViewTransition_SharedValueId) {
                this.onCommand = typedArrayObtainStyledAttributes.getResourceId(index, this.onCommand);
            } else if (index == _isBlank.read.ViewTransition_SharedValue) {
                this.onAddQueueItem = typedArrayObtainStyledAttributes.getInteger(index, this.onAddQueueItem);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void IconCompatParcelizer(constructValue constructvalue, MotionLayout motionLayout, View view) {
        handleSingleElementUnwrapped handlesingleelementunwrapped = new handleSingleElementUnwrapped(view);
        handlesingleelementunwrapped.AudioAttributesCompatParcelizer(view);
        this.read.read(handlesingleelementunwrapped);
        handlesingleelementunwrapped.RemoteActionCompatParcelizer(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
        new AudioAttributesCompatParcelizer(constructvalue, handlesingleelementunwrapped, this.AudioAttributesImplApi26Parcelizer, this.onPause, this.MediaMetadataCompat, IconCompatParcelizer(motionLayout.getContext()), this.onCustomAction, this.write);
    }

    static class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private Interpolator AudioAttributesImplApi21Parcelizer;
        private float AudioAttributesImplApi26Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private handleSingleElementUnwrapped MediaBrowserCompatCustomActionResultReceiver;
        private long MediaBrowserCompatItemReceiver;
        private int MediaBrowserCompatMediaItem;
        private long MediaBrowserCompatSearchResultReceiver;
        private constructValue MediaDescriptionCompat;
        private final int RemoteActionCompatParcelizer;
        private float read;
        private boolean write;
        private FromStringDeserializer IconCompatParcelizer = new FromStringDeserializer();
        private boolean MediaMetadataCompat = false;
        private Rect RatingCompat = new Rect();

        AudioAttributesCompatParcelizer(constructValue constructvalue, handleSingleElementUnwrapped handlesingleelementunwrapped, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.write = false;
            this.MediaDescriptionCompat = constructvalue;
            this.MediaBrowserCompatCustomActionResultReceiver = handlesingleelementunwrapped;
            this.AudioAttributesCompatParcelizer = i;
            this.MediaBrowserCompatMediaItem = i2;
            long jNanoTime = System.nanoTime();
            this.MediaBrowserCompatSearchResultReceiver = jNanoTime;
            this.MediaBrowserCompatItemReceiver = jNanoTime;
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer(this);
            this.AudioAttributesImplApi21Parcelizer = interpolator;
            this.AudioAttributesImplBaseParcelizer = i4;
            this.RemoteActionCompatParcelizer = i5;
            if (i3 == 3) {
                this.write = true;
            }
            this.read = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            IconCompatParcelizer();
        }

        private void RemoteActionCompatParcelizer() {
            this.MediaMetadataCompat = true;
            int i = this.MediaBrowserCompatMediaItem;
            if (i != -1) {
                this.read = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatItemReceiver = System.nanoTime();
        }

        final void IconCompatParcelizer() {
            if (this.MediaMetadataCompat) {
                read();
            } else {
                write();
            }
        }

        private void read() {
            long jNanoTime = System.nanoTime();
            long j = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = jNanoTime;
            float f = this.AudioAttributesImplApi26Parcelizer - (((float) ((jNanoTime - j) * 1.0E-6d)) * this.read);
            this.AudioAttributesImplApi26Parcelizer = f;
            if (f < BitmapDescriptorFactory.HUE_RED) {
                this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
            }
            Interpolator interpolator = this.AudioAttributesImplApi21Parcelizer;
            float interpolation = interpolator == null ? this.AudioAttributesImplApi26Parcelizer : interpolator.getInterpolation(this.AudioAttributesImplApi26Parcelizer);
            handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean zWrite = handlesingleelementunwrapped.write(handlesingleelementunwrapped.IconCompatParcelizer, interpolation, jNanoTime, this.IconCompatParcelizer);
            if (this.AudioAttributesImplApi26Parcelizer <= BitmapDescriptorFactory.HUE_RED) {
                if (this.AudioAttributesImplBaseParcelizer != -1) {
                    this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().setTag(this.AudioAttributesImplBaseParcelizer, Long.valueOf(System.nanoTime()));
                }
                if (this.RemoteActionCompatParcelizer != -1) {
                    this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().setTag(this.RemoteActionCompatParcelizer, null);
                }
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(this);
            }
            if (this.AudioAttributesImplApi26Parcelizer > BitmapDescriptorFactory.HUE_RED || zWrite) {
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            }
        }

        private void write() {
            long jNanoTime = System.nanoTime();
            long j = this.MediaBrowserCompatItemReceiver;
            this.MediaBrowserCompatItemReceiver = jNanoTime;
            float f = this.AudioAttributesImplApi26Parcelizer + (((float) ((jNanoTime - j) * 1.0E-6d)) * this.read);
            this.AudioAttributesImplApi26Parcelizer = f;
            if (f >= 1.0f) {
                this.AudioAttributesImplApi26Parcelizer = 1.0f;
            }
            Interpolator interpolator = this.AudioAttributesImplApi21Parcelizer;
            float interpolation = interpolator == null ? this.AudioAttributesImplApi26Parcelizer : interpolator.getInterpolation(this.AudioAttributesImplApi26Parcelizer);
            handleSingleElementUnwrapped handlesingleelementunwrapped = this.MediaBrowserCompatCustomActionResultReceiver;
            boolean zWrite = handlesingleelementunwrapped.write(handlesingleelementunwrapped.IconCompatParcelizer, interpolation, jNanoTime, this.IconCompatParcelizer);
            if (this.AudioAttributesImplApi26Parcelizer >= 1.0f) {
                if (this.AudioAttributesImplBaseParcelizer != -1) {
                    this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().setTag(this.AudioAttributesImplBaseParcelizer, Long.valueOf(System.nanoTime()));
                }
                if (this.RemoteActionCompatParcelizer != -1) {
                    this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().setTag(this.RemoteActionCompatParcelizer, null);
                }
                if (!this.write) {
                    this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(this);
                }
            }
            if (this.AudioAttributesImplApi26Parcelizer < 1.0f || zWrite) {
                this.MediaDescriptionCompat.AudioAttributesCompatParcelizer();
            }
        }

        public final void RemoteActionCompatParcelizer(int i, float f, float f2) {
            if (i == 1) {
                if (this.MediaMetadataCompat) {
                    return;
                }
                RemoteActionCompatParcelizer();
            } else if (i == 2) {
                this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver().getHitRect(this.RatingCompat);
                if (this.RatingCompat.contains((int) f, (int) f2) || this.MediaMetadataCompat) {
                    return;
                }
                RemoteActionCompatParcelizer();
            }
        }
    }

    final void RemoteActionCompatParcelizer(constructValue constructvalue, MotionLayout motionLayout, int i, ReferenceTypeDeserializer referenceTypeDeserializer, final View... viewArr) {
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        int i2 = this.AudioAttributesCompatParcelizer;
        if (i2 == 2) {
            IconCompatParcelizer(constructvalue, motionLayout, viewArr[0]);
            return;
        }
        if (i2 == 1) {
            for (int i3 : motionLayout.RemoteActionCompatParcelizer()) {
                if (i3 != i) {
                    ReferenceTypeDeserializer referenceTypeDeserializerRemoteActionCompatParcelizer = motionLayout.RemoteActionCompatParcelizer(i3);
                    for (View view : viewArr) {
                        ReferenceTypeDeserializer.write writeVarRemoteActionCompatParcelizer = referenceTypeDeserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(view.getId());
                        ReferenceTypeDeserializer.write writeVar = this.IconCompatParcelizer;
                        if (writeVar != null) {
                            writeVar.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer);
                            writeVarRemoteActionCompatParcelizer.read.putAll(this.IconCompatParcelizer.read);
                        }
                    }
                }
            }
        }
        ReferenceTypeDeserializer referenceTypeDeserializer2 = new ReferenceTypeDeserializer();
        referenceTypeDeserializer2.write(referenceTypeDeserializer);
        for (View view2 : viewArr) {
            ReferenceTypeDeserializer.write writeVarRemoteActionCompatParcelizer2 = referenceTypeDeserializer2.RemoteActionCompatParcelizer(view2.getId());
            ReferenceTypeDeserializer.write writeVar2 = this.IconCompatParcelizer;
            if (writeVar2 != null) {
                writeVar2.AudioAttributesCompatParcelizer(writeVarRemoteActionCompatParcelizer2);
                writeVarRemoteActionCompatParcelizer2.read.putAll(this.IconCompatParcelizer.read);
            }
        }
        motionLayout.IconCompatParcelizer(i, referenceTypeDeserializer2);
        motionLayout.IconCompatParcelizer(_isBlank.write.view_transition, referenceTypeDeserializer);
        motionLayout.setState(_isBlank.write.view_transition, -1, -1);
        PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(motionLayout.MediaDescriptionCompat, _isBlank.write.view_transition, i);
        for (View view3 : viewArr) {
            read(audioAttributesCompatParcelizer, view3);
        }
        motionLayout.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
        motionLayout.IconCompatParcelizer(new Runnable() { // from class: o.PrimitiveArrayDeserializersDoubleDeser
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(viewArr);
            }
        });
    }

    final /* synthetic */ void IconCompatParcelizer(View[] viewArr) {
        if (this.onCustomAction != -1) {
            for (View view : viewArr) {
                view.setTag(this.onCustomAction, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.write != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.write, null);
            }
        }
    }

    private void read(PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, View view) {
        int i = this.AudioAttributesImplApi26Parcelizer;
        if (i != -1) {
            audioAttributesCompatParcelizer.write(i);
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaDescriptionCompat);
        audioAttributesCompatParcelizer.read(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplBaseParcelizer);
        int id = view.getId();
        ObjectArrayDeserializer objectArrayDeserializer = this.read;
        if (objectArrayDeserializer != null) {
            ArrayList<NumberDeserializersNumberDeserializer> arrayListWrite = objectArrayDeserializer.write();
            ObjectArrayDeserializer objectArrayDeserializer2 = new ObjectArrayDeserializer();
            Iterator<NumberDeserializersNumberDeserializer> it = arrayListWrite.iterator();
            while (it.hasNext()) {
                objectArrayDeserializer2.AudioAttributesCompatParcelizer(it.next().clone().AudioAttributesCompatParcelizer(id));
            }
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(objectArrayDeserializer2);
        }
    }

    final int AudioAttributesCompatParcelizer() {
        return this.RatingCompat;
    }

    final boolean AudioAttributesCompatParcelizer(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == -1 && this.onPlayFromMediaId == null) || !RemoteActionCompatParcelizer(view)) {
            return false;
        }
        if (view.getId() == this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            return true;
        }
        return this.onPlayFromMediaId != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).MediaDescriptionCompat) != null && str.matches(this.onPlayFromMediaId);
    }

    final boolean RemoteActionCompatParcelizer(int i) {
        int i2 = this.MediaMetadataCompat;
        return i2 == 1 ? i == 0 : i2 == 2 ? i == 1 : i2 == 3 && i == 0;
    }

    final boolean RemoteActionCompatParcelizer(View view) {
        int i = this.MediaBrowserCompatMediaItem;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.MediaBrowserCompatSearchResultReceiver;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }
}
