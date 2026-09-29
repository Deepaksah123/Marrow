package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import kotlin.DoubleClickConversionReporter;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.addPackageToPreferred;
import kotlin.recordRemarketingPing;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
public class Slide extends Visibility {
    private int onCommand;
    private AudioAttributesCompatParcelizer onCustomAction;
    private static final TimeInterpolator handleMediaPlayPauseIfPendingOnHandler = new DecelerateInterpolator();
    private static final TimeInterpolator RemoteActionCompatParcelizer = new AccelerateInterpolator();
    private static final AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver = new write() { // from class: androidx.transition.Slide.1
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final AudioAttributesCompatParcelizer MediaBrowserCompatMediaItem = new write() { // from class: androidx.transition.Slide.3
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    private static final AudioAttributesCompatParcelizer MediaMetadataCompat = new read() { // from class: androidx.transition.Slide.4
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float read(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    private static final AudioAttributesCompatParcelizer RatingCompat = new write() { // from class: androidx.transition.Slide.5
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final AudioAttributesCompatParcelizer MediaDescriptionCompat = new write() { // from class: androidx.transition.Slide.2
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view) {
            if (viewGroup.getLayoutDirection() == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    private static final AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer = new read() { // from class: androidx.transition.Slide.6
        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float read(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    interface AudioAttributesCompatParcelizer {
        float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view);

        float read(ViewGroup viewGroup, View view);
    }

    @Override // androidx.transition.Transition
    public final boolean read() {
        return true;
    }

    static abstract class write implements AudioAttributesCompatParcelizer {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float read(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    static abstract class read implements AudioAttributesCompatParcelizer {
        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // androidx.transition.Slide.AudioAttributesCompatParcelizer
        public final float RemoteActionCompatParcelizer(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.onCustomAction = AudioAttributesImplApi21Parcelizer;
        this.onCommand = 80;
        write(80);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onCustomAction = AudioAttributesImplApi21Parcelizer;
        this.onCommand = 80;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.AudioAttributesImplApi21Parcelizer);
        int i = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        typedArrayObtainStyledAttributes.recycle();
        write(i);
    }

    private static void IconCompatParcelizer(Rstring rstring) {
        int[] iArr = new int[2];
        rstring.AudioAttributesCompatParcelizer.getLocationOnScreen(iArr);
        rstring.read.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void read(Rstring rstring) {
        super.read(rstring);
        IconCompatParcelizer(rstring);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        super.RemoteActionCompatParcelizer(rstring);
        IconCompatParcelizer(rstring);
    }

    private void write(int i) {
        if (i == 3) {
            this.onCustomAction = MediaBrowserCompatSearchResultReceiver;
        } else if (i == 5) {
            this.onCustomAction = RatingCompat;
        } else if (i == 48) {
            this.onCustomAction = MediaMetadataCompat;
        } else if (i == 80) {
            this.onCustomAction = AudioAttributesImplApi21Parcelizer;
        } else if (i == 8388611) {
            this.onCustomAction = MediaBrowserCompatMediaItem;
        } else if (i == 8388613) {
            this.onCustomAction = MediaDescriptionCompat;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        this.onCommand = i;
        DoubleClickConversionReporter doubleClickConversionReporter = new DoubleClickConversionReporter();
        doubleClickConversionReporter.write(i);
        read(doubleClickConversionReporter);
    }

    @Override // androidx.transition.Visibility
    public final Animator read(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        if (rstring2 == null) {
            return null;
        }
        int[] iArr = (int[]) rstring2.read.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return addPackageToPreferred.RemoteActionCompatParcelizer(view, rstring2, iArr[0], iArr[1], this.onCustomAction.RemoteActionCompatParcelizer(viewGroup, view), this.onCustomAction.read(viewGroup, view), translationX, translationY, handleMediaPlayPauseIfPendingOnHandler, this);
    }

    @Override // androidx.transition.Visibility
    public final Animator RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, Rstring rstring, Rstring rstring2) {
        if (rstring == null) {
            return null;
        }
        int[] iArr = (int[]) rstring.read.get("android:slide:screenPosition");
        return addPackageToPreferred.RemoteActionCompatParcelizer(view, rstring, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.onCustomAction.RemoteActionCompatParcelizer(viewGroup, view), this.onCustomAction.read(viewGroup, view), RemoteActionCompatParcelizer, this);
    }
}
