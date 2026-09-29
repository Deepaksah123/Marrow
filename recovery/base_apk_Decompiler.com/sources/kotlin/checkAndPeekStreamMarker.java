package kotlin;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.calculateNextSearchBytePosition;

/* JADX INFO: loaded from: classes3.dex */
public final class checkAndPeekStreamMarker {

    public interface RemoteActionCompatParcelizer {
        WindowInsetsCompat RemoteActionCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, write writeVar);
    }

    public static void AudioAttributesCompatParcelizer(View view, boolean z) {
        findNameForMutator findnameformutatorOnFastForward;
        if (z && (findnameformutatorOnFastForward = InvalidTypeIdException.onFastForward(view)) != null) {
            findnameformutatorOnFastForward.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
        } else {
            MediaBrowserCompatCustomActionResultReceiver(view).showSoftInput(view, 1);
        }
    }

    public static void AudioAttributesImplApi26Parcelizer(final View view) {
        view.requestFocus();
        final boolean z = false;
        view.post(new Runnable(view, z) { // from class: o.readSeekTableMetadataBlock
            private /* synthetic */ boolean read = false;
            private /* synthetic */ View write;

            @Override // java.lang.Runnable
            public final void run() {
                checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this.write, this.read);
            }
        });
    }

    public static void read(View view, boolean z) {
        findNameForMutator findnameformutatorOnFastForward;
        if (z && (findnameformutatorOnFastForward = InvalidTypeIdException.onFastForward(view)) != null) {
            findnameformutatorOnFastForward.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
            return;
        }
        InputMethodManager inputMethodManagerMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(view);
        if (inputMethodManagerMediaBrowserCompatCustomActionResultReceiver != null) {
            inputMethodManagerMediaBrowserCompatCustomActionResultReceiver.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    private static InputMethodManager MediaBrowserCompatCustomActionResultReceiver(View view) {
        return (InputMethodManager) _isNaN.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static Rect IconCompatParcelizer(View view) {
        return AudioAttributesImplApi21Parcelizer(view);
    }

    private static Rect AudioAttributesImplApi21Parcelizer(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Rect IconCompatParcelizer(View view, View view2) {
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        return new Rect(i3, i4, view2.getWidth() + i3, view2.getHeight() + i4);
    }

    public static PorterDuff.Mode RemoteActionCompatParcelizer(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static boolean AudioAttributesImplBaseParcelizer(View view) {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(view) == 1;
    }

    public static float AudioAttributesCompatParcelizer(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static class write {
        public int IconCompatParcelizer;
        public int RemoteActionCompatParcelizer;
        public int read;
        public int write;

        public write(int i, int i2, int i3, int i4) {
            this.read = i;
            this.write = i2;
            this.RemoteActionCompatParcelizer = i3;
            this.IconCompatParcelizer = i4;
        }

        public write(write writeVar) {
            this.read = writeVar.read;
            this.write = writeVar.write;
            this.RemoteActionCompatParcelizer = writeVar.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = writeVar.IconCompatParcelizer;
        }

        public final void IconCompatParcelizer(View view) {
            InvalidTypeIdException.read(view, this.read, this.write, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
        }
    }

    public static void AudioAttributesCompatParcelizer(View view, AttributeSet attributeSet, int i, int i2, final RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Insets, i, i2);
        final boolean z = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        IconCompatParcelizer(view, new RemoteActionCompatParcelizer() { // from class: o.checkAndPeekStreamMarker.2
            @Override // o.checkAndPeekStreamMarker.RemoteActionCompatParcelizer
            public final WindowInsetsCompat RemoteActionCompatParcelizer(View view2, WindowInsetsCompat windowInsetsCompat, write writeVar) {
                if (z) {
                    writeVar.IconCompatParcelizer += windowInsetsCompat.AudioAttributesImplBaseParcelizer();
                }
                boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(view2);
                if (z2) {
                    if (zAudioAttributesImplBaseParcelizer) {
                        writeVar.RemoteActionCompatParcelizer += windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                    } else {
                        writeVar.read += windowInsetsCompat.AudioAttributesImplApi21Parcelizer();
                    }
                }
                if (z3) {
                    if (zAudioAttributesImplBaseParcelizer) {
                        writeVar.read += windowInsetsCompat.MediaBrowserCompatItemReceiver();
                    } else {
                        writeVar.RemoteActionCompatParcelizer += windowInsetsCompat.MediaBrowserCompatItemReceiver();
                    }
                }
                writeVar.IconCompatParcelizer(view2);
                RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
                return remoteActionCompatParcelizer2 != null ? remoteActionCompatParcelizer2.RemoteActionCompatParcelizer(view2, windowInsetsCompat, writeVar) : windowInsetsCompat;
            }
        });
    }

    public static void IconCompatParcelizer(View view, final RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        final write writeVar = new write(InvalidTypeIdException.onCommand(view), view.getPaddingTop(), InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view), view.getPaddingBottom());
        InvalidTypeIdException.read(view, new finishBranchObject() { // from class: o.checkAndPeekStreamMarker.4
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return remoteActionCompatParcelizer.RemoteActionCompatParcelizer(view2, windowInsetsCompat, new write(writeVar));
            }
        });
        RatingCompat(view);
    }

    private static void RatingCompat(View view) {
        if (InvalidTypeIdException.onPlayFromSearch(view)) {
            InvalidTypeIdException.onSetRepeatMode(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.checkAndPeekStreamMarker.3
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    InvalidTypeIdException.onSetRepeatMode(view2);
                }
            });
        }
    }

    public static float write(View view) {
        float fAudioAttributesImplBaseParcelizer = BitmapDescriptorFactory.HUE_RED;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fAudioAttributesImplBaseParcelizer += InvalidTypeIdException.AudioAttributesImplBaseParcelizer((View) parent);
        }
        return fAudioAttributesImplBaseParcelizer;
    }

    private static getFrameStartMarker MediaBrowserCompatItemReceiver(View view) {
        if (view == null) {
            return null;
        }
        return new peekId3Metadata(view);
    }

    public static ViewGroup AudioAttributesCompatParcelizer(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static getFrameStartMarker read(View view) {
        return MediaBrowserCompatItemReceiver(AudioAttributesCompatParcelizer(view));
    }

    public static void AudioAttributesCompatParcelizer(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void RemoteActionCompatParcelizer(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            write(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    private static void write(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static Integer RemoteActionCompatParcelizer(View view) {
        ColorStateList colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(view.getBackground());
        if (colorStateListIconCompatParcelizer != null) {
            return Integer.valueOf(colorStateListIconCompatParcelizer.getDefaultColor());
        }
        return null;
    }
}
