package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import kotlin.InvalidTypeIdException;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.ab;
import kotlin.getPackageManager;
import kotlin.recordRemarketingPing;
import kotlin.reportWithConversionId;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Visibility extends Transition {
    private static final String[] RemoteActionCompatParcelizer = {"android:visibility:visibility", "android:visibility:parent"};
    private int AudioAttributesImplApi21Parcelizer;

    public Animator RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        return null;
    }

    public Animator read(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        return null;
    }

    static class AudioAttributesCompatParcelizer {
        ViewGroup AudioAttributesCompatParcelizer;
        boolean AudioAttributesImplApi26Parcelizer;
        int IconCompatParcelizer;
        ViewGroup RemoteActionCompatParcelizer;
        int read;
        boolean write;

        AudioAttributesCompatParcelizer() {
        }
    }

    public Visibility() {
        this.AudioAttributesImplApi21Parcelizer = 3;
    }

    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesImplApi21Parcelizer = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.MediaBrowserCompatItemReceiver);
        int i = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            read(i);
        }
    }

    public final void read(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public final int onPlayFromMediaId() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // androidx.transition.Transition
    public final String[] write() {
        return RemoteActionCompatParcelizer;
    }

    private static void IconCompatParcelizer(Rstring rstring) {
        rstring.read.put("android:visibility:visibility", Integer.valueOf(rstring.AudioAttributesCompatParcelizer.getVisibility()));
        rstring.read.put("android:visibility:parent", rstring.AudioAttributesCompatParcelizer.getParent());
        int[] iArr = new int[2];
        rstring.AudioAttributesCompatParcelizer.getLocationOnScreen(iArr);
        rstring.read.put("android:visibility:screenLocation", iArr);
    }

    @Override // androidx.transition.Transition
    public void read(Rstring rstring) {
        IconCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Transition
    public void RemoteActionCompatParcelizer(Rstring rstring) {
        IconCompatParcelizer(rstring);
    }

    private static AudioAttributesCompatParcelizer write(Rstring rstring, Rstring rstring2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = false;
        audioAttributesCompatParcelizer.write = false;
        if (rstring != null && rstring.read.containsKey("android:visibility:visibility")) {
            audioAttributesCompatParcelizer.IconCompatParcelizer = ((Integer) rstring.read.get("android:visibility:visibility")).intValue();
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = (ViewGroup) rstring.read.get("android:visibility:parent");
        } else {
            audioAttributesCompatParcelizer.IconCompatParcelizer = -1;
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer = null;
        }
        if (rstring2 != null && rstring2.read.containsKey("android:visibility:visibility")) {
            audioAttributesCompatParcelizer.read = ((Integer) rstring2.read.get("android:visibility:visibility")).intValue();
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = (ViewGroup) rstring2.read.get("android:visibility:parent");
        } else {
            audioAttributesCompatParcelizer.read = -1;
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer = null;
        }
        if (rstring != null && rstring2 != null) {
            if (audioAttributesCompatParcelizer.IconCompatParcelizer != audioAttributesCompatParcelizer.read || audioAttributesCompatParcelizer.RemoteActionCompatParcelizer != audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer) {
                if (audioAttributesCompatParcelizer.IconCompatParcelizer != audioAttributesCompatParcelizer.read) {
                    if (audioAttributesCompatParcelizer.IconCompatParcelizer == 0) {
                        audioAttributesCompatParcelizer.write = false;
                        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
                        return audioAttributesCompatParcelizer;
                    }
                    if (audioAttributesCompatParcelizer.read == 0) {
                        audioAttributesCompatParcelizer.write = true;
                        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
                        return audioAttributesCompatParcelizer;
                    }
                } else {
                    if (audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer == null) {
                        audioAttributesCompatParcelizer.write = false;
                        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
                        return audioAttributesCompatParcelizer;
                    }
                    if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer == null) {
                        audioAttributesCompatParcelizer.write = true;
                        audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
                        return audioAttributesCompatParcelizer;
                    }
                }
            }
        } else {
            if (rstring == null && audioAttributesCompatParcelizer.read == 0) {
                audioAttributesCompatParcelizer.write = true;
                audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
                return audioAttributesCompatParcelizer;
            }
            if (rstring2 == null && audioAttributesCompatParcelizer.IconCompatParcelizer == 0) {
                audioAttributesCompatParcelizer.write = false;
                audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer = true;
            }
        }
        return audioAttributesCompatParcelizer;
    }

    @Override // androidx.transition.Transition
    public final Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write(rstring, rstring2);
        if (!audioAttributesCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer) {
            return null;
        }
        if (audioAttributesCompatParcelizerWrite.RemoteActionCompatParcelizer == null && audioAttributesCompatParcelizerWrite.AudioAttributesCompatParcelizer == null) {
            return null;
        }
        if (audioAttributesCompatParcelizerWrite.write) {
            int i = audioAttributesCompatParcelizerWrite.IconCompatParcelizer;
            int i2 = audioAttributesCompatParcelizerWrite.read;
            return AudioAttributesCompatParcelizer(viewGroup, rstring, rstring2);
        }
        int i3 = audioAttributesCompatParcelizerWrite.IconCompatParcelizer;
        return AudioAttributesCompatParcelizer(viewGroup, rstring, rstring2, audioAttributesCompatParcelizerWrite.read);
    }

    private Animator AudioAttributesCompatParcelizer(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        if ((this.AudioAttributesImplApi21Parcelizer & 1) != 1 || rstring2 == null) {
            return null;
        }
        if (rstring == null) {
            View view = (View) rstring2.AudioAttributesCompatParcelizer.getParent();
            if (write(IconCompatParcelizer(view, false), RemoteActionCompatParcelizer(view, false)).AudioAttributesImplApi26Parcelizer) {
                return null;
            }
        }
        return read(viewGroup, rstring2.AudioAttributesCompatParcelizer, rstring, rstring2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082 A[PHI: r3
      0x0082: PHI (r3v3 android.view.View) = (r3v2 android.view.View), (r3v9 android.view.View), (r3v16 android.view.View) binds: [B:24:0x003c, B:39:0x007c, B:31:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.animation.Animator AudioAttributesCompatParcelizer(android.view.ViewGroup r11, kotlin.Rstring r12, kotlin.Rstring r13, int r14) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.AudioAttributesCompatParcelizer(android.view.ViewGroup, o.Rstring, o.Rstring, int):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public final boolean RemoteActionCompatParcelizer(Rstring rstring, Rstring rstring2) {
        if (rstring == null && rstring2 == null) {
            return false;
        }
        if (rstring != null && rstring2 != null && rstring2.read.containsKey("android:visibility:visibility") != rstring.read.containsKey("android:visibility:visibility")) {
            return false;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizerWrite = write(rstring, rstring2);
        if (audioAttributesCompatParcelizerWrite.AudioAttributesImplApi26Parcelizer) {
            return audioAttributesCompatParcelizerWrite.IconCompatParcelizer == 0 || audioAttributesCompatParcelizerWrite.read == 0;
        }
        return false;
    }

    static class RemoteActionCompatParcelizer extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private final View AudioAttributesImplBaseParcelizer;
        private final ViewGroup IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private boolean write;
        private boolean AudioAttributesCompatParcelizer = false;
        private final boolean read = true;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        RemoteActionCompatParcelizer(View view, int i) {
            this.AudioAttributesImplBaseParcelizer = view;
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = (ViewGroup) view.getParent();
            write(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.AudioAttributesCompatParcelizer = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            write();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                ab.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, 0);
                ViewGroup viewGroup = this.IconCompatParcelizer;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            write();
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
            transition.AudioAttributesCompatParcelizer(this);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
            write(false);
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            ab.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            write(true);
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            ab.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, 0);
        }

        private void write() {
            if (!this.AudioAttributesCompatParcelizer) {
                ab.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.RemoteActionCompatParcelizer);
                ViewGroup viewGroup = this.IconCompatParcelizer;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            write(false);
        }

        private void write(boolean z) {
            ViewGroup viewGroup;
            if (!this.read || this.write == z || (viewGroup = this.IconCompatParcelizer) == null) {
                return;
            }
            this.write = z;
            getPackageManager.write(viewGroup, z);
        }
    }

    class read extends AnimatorListenerAdapter implements Transition.RemoteActionCompatParcelizer {
        private final View AudioAttributesCompatParcelizer;
        private boolean IconCompatParcelizer = true;
        private final ViewGroup RemoteActionCompatParcelizer;
        private final View read;

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer() {
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
        }

        read(ViewGroup viewGroup, View view, View view2) {
            this.RemoteActionCompatParcelizer = viewGroup;
            this.AudioAttributesCompatParcelizer = view;
            this.read = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            this.RemoteActionCompatParcelizer.getOverlay().remove(this.AudioAttributesCompatParcelizer);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            if (this.AudioAttributesCompatParcelizer.getParent() == null) {
                InvalidTypeIdException.write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
            } else {
                Visibility.this.AudioAttributesCompatParcelizer();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z) {
            if (z) {
                this.read.setTag(reportWithConversionId.RemoteActionCompatParcelizer.save_overlay_view, this.AudioAttributesCompatParcelizer);
                InvalidTypeIdException.write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer);
                this.IconCompatParcelizer = true;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            RemoteActionCompatParcelizer();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z) {
            if (z) {
                return;
            }
            RemoteActionCompatParcelizer();
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
            transition.AudioAttributesCompatParcelizer(this);
        }

        @Override // androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
            if (this.IconCompatParcelizer) {
                RemoteActionCompatParcelizer();
            }
        }

        private void RemoteActionCompatParcelizer() {
            this.read.setTag(reportWithConversionId.RemoteActionCompatParcelizer.save_overlay_view, null);
            this.RemoteActionCompatParcelizer.getOverlay().remove(this.AudioAttributesCompatParcelizer);
            this.IconCompatParcelizer = false;
        }
    }
}
