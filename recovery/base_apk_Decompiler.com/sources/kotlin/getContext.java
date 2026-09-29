package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.getSavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public final class getContext {
    private static getContext IconCompatParcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private WeakHashMap<Context, setSupportButtonTintList<ColorStateList>> AudioAttributesImplBaseParcelizer;
    private TypedValue MediaBrowserCompatItemReceiver;
    private final WeakHashMap<Context, setPresenter<WeakReference<Drawable.ConstantState>>> read = new WeakHashMap<>(0);
    private boolean write;
    private static final PorterDuff.Mode AudioAttributesCompatParcelizer = PorterDuff.Mode.SRC_IN;
    private static final write RemoteActionCompatParcelizer = new write();

    public interface RemoteActionCompatParcelizer {
        boolean AudioAttributesCompatParcelizer(Context context, int i, Drawable drawable);

        PorterDuff.Mode RemoteActionCompatParcelizer(int i);

        ColorStateList read(Context context, int i);

        boolean read(Context context, int i, Drawable drawable);

        Drawable write(getContext getcontext, Context context, int i);
    }

    public static getContext AudioAttributesCompatParcelizer() {
        getContext getcontext;
        synchronized (getContext.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new getContext();
            }
            getcontext = IconCompatParcelizer;
        }
        return getcontext;
    }

    public final void write(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        synchronized (this) {
            this.AudioAttributesImplApi21Parcelizer = remoteActionCompatParcelizer;
        }
    }

    public final Drawable read(Context context, int i) {
        Drawable drawable;
        synchronized (this) {
            drawable = read(context, i, false);
        }
        return drawable;
    }

    final Drawable read(Context context, int i, boolean z) {
        Drawable drawableRemoteActionCompatParcelizer;
        synchronized (this) {
            RemoteActionCompatParcelizer(context);
            drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, i);
            if (drawableRemoteActionCompatParcelizer == null) {
                drawableRemoteActionCompatParcelizer = _isNaN.getDrawable(context, i);
            }
            if (drawableRemoteActionCompatParcelizer != null) {
                drawableRemoteActionCompatParcelizer = write(context, i, z, drawableRemoteActionCompatParcelizer);
            }
            if (drawableRemoteActionCompatParcelizer != null) {
                IntentSenderRequest.read(drawableRemoteActionCompatParcelizer);
            }
        }
        return drawableRemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(Context context) {
        synchronized (this) {
            setPresenter<WeakReference<Drawable.ConstantState>> setpresenter = this.read.get(context);
            if (setpresenter != null) {
                setpresenter.IconCompatParcelizer();
            }
        }
    }

    private static long AudioAttributesCompatParcelizer(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable RemoteActionCompatParcelizer(Context context, int i) {
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new TypedValue();
        }
        TypedValue typedValue = this.MediaBrowserCompatItemReceiver;
        context.getResources().getValue(i, typedValue, true);
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(typedValue);
        Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, jAudioAttributesCompatParcelizer);
        if (drawableRemoteActionCompatParcelizer != null) {
            return drawableRemoteActionCompatParcelizer;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        Drawable drawableWrite = remoteActionCompatParcelizer == null ? null : remoteActionCompatParcelizer.write(this, context, i);
        if (drawableWrite != null) {
            drawableWrite.setChangingConfigurations(typedValue.changingConfigurations);
            RemoteActionCompatParcelizer(context, jAudioAttributesCompatParcelizer, drawableWrite);
        }
        return drawableWrite;
    }

    private Drawable write(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, i);
        if (colorStateListAudioAttributesCompatParcelizer != null) {
            IntentSenderRequest.write();
            Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
            findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, colorStateListAudioAttributesCompatParcelizer);
            PorterDuff.Mode modeIconCompatParcelizer = IconCompatParcelizer(i);
            if (modeIconCompatParcelizer != null) {
                findFormatOverrides.read(drawableAudioAttributesImplApi26Parcelizer, modeIconCompatParcelizer);
            }
            return drawableAudioAttributesImplApi26Parcelizer;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if ((remoteActionCompatParcelizer == null || !remoteActionCompatParcelizer.read(context, i, drawable)) && !read(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private Drawable RemoteActionCompatParcelizer(Context context, long j) {
        synchronized (this) {
            setPresenter<WeakReference<Drawable.ConstantState>> setpresenter = this.read.get(context);
            if (setpresenter == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReferenceIconCompatParcelizer = setpresenter.IconCompatParcelizer(j);
            if (weakReferenceIconCompatParcelizer != null) {
                Drawable.ConstantState constantState = weakReferenceIconCompatParcelizer.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                setpresenter.RemoteActionCompatParcelizer(j);
            }
            return null;
        }
    }

    private boolean RemoteActionCompatParcelizer(Context context, long j, Drawable drawable) {
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            setPresenter<WeakReference<Drawable.ConstantState>> setpresenter = this.read.get(context);
            if (setpresenter == null) {
                setpresenter = new setPresenter<>();
                this.read.put(context, setpresenter);
            }
            setpresenter.write(j, new WeakReference<>(constantState));
            return true;
        }
    }

    final boolean read(Context context, int i, Drawable drawable) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        return remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(context, i, drawable);
    }

    private PorterDuff.Mode IconCompatParcelizer(int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        if (remoteActionCompatParcelizer == null) {
            return null;
        }
        return remoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    final ColorStateList AudioAttributesCompatParcelizer(Context context, int i) {
        ColorStateList colorStateListWrite;
        synchronized (this) {
            colorStateListWrite = write(context, i);
            if (colorStateListWrite == null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
                colorStateListWrite = remoteActionCompatParcelizer == null ? null : remoteActionCompatParcelizer.read(context, i);
                if (colorStateListWrite != null) {
                    write(context, i, colorStateListWrite);
                }
            }
        }
        return colorStateListWrite;
    }

    private ColorStateList write(Context context, int i) {
        setSupportButtonTintList<ColorStateList> setsupportbuttontintlist;
        WeakHashMap<Context, setSupportButtonTintList<ColorStateList>> weakHashMap = this.AudioAttributesImplBaseParcelizer;
        if (weakHashMap == null || (setsupportbuttontintlist = weakHashMap.get(context)) == null) {
            return null;
        }
        return setsupportbuttontintlist.IconCompatParcelizer(i);
    }

    private void write(Context context, int i, ColorStateList colorStateList) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new WeakHashMap<>();
        }
        setSupportButtonTintList<ColorStateList> setsupportbuttontintlist = this.AudioAttributesImplBaseParcelizer.get(context);
        if (setsupportbuttontintlist == null) {
            setsupportbuttontintlist = new setSupportButtonTintList<>();
            this.AudioAttributesImplBaseParcelizer.put(context, setsupportbuttontintlist);
        }
        setsupportbuttontintlist.write(i, colorStateList);
    }

    static class write extends ActionMenuViewLayoutParams<Integer, PorterDuffColorFilter> {
        public write() {
            super(6);
        }

        final PorterDuffColorFilter read(int i, PorterDuff.Mode mode) {
            return get(Integer.valueOf(IconCompatParcelizer(i, mode)));
        }

        final PorterDuffColorFilter RemoteActionCompatParcelizer(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(IconCompatParcelizer(i, mode)), porterDuffColorFilter);
        }

        private static int IconCompatParcelizer(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static void read(Drawable drawable, setView setview, int[] iArr) {
        int[] state = drawable.getState();
        IntentSenderRequest.write();
        if (drawable.mutate() != drawable) {
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        if (setview.AudioAttributesCompatParcelizer || setview.IconCompatParcelizer) {
            drawable.setColorFilter(write(setview.AudioAttributesCompatParcelizer ? setview.RemoteActionCompatParcelizer : null, setview.IconCompatParcelizer ? setview.write : AudioAttributesCompatParcelizer, iArr));
        } else {
            drawable.clearColorFilter();
        }
    }

    private static PorterDuffColorFilter write(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return IconCompatParcelizer(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static PorterDuffColorFilter IconCompatParcelizer(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (getContext.class) {
            write writeVar = RemoteActionCompatParcelizer;
            porterDuffColorFilter = writeVar.read(i, mode);
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                writeVar.RemoteActionCompatParcelizer(i, mode, porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    private void RemoteActionCompatParcelizer(Context context) {
        if (this.write) {
            return;
        }
        this.write = true;
        Drawable drawable = read(context, getSavedStateRegistry.read.abc_vector_test);
        if (drawable == null || !RemoteActionCompatParcelizer(drawable)) {
            this.write = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static boolean RemoteActionCompatParcelizer(Drawable drawable) {
        return (drawable instanceof getActivityInfo) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }
}
