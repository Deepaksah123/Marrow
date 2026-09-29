package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.InvalidTypeIdException;
import kotlin.StringCollectionDeserializer;
import kotlin._fromBytes;
import kotlin._verifyEndArrayForSingle;
import kotlin.configureFromStringCreator;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat IconCompatParcelizer;
    private final Impl write;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            IconCompatParcelizer = Impl34.CONSUMED;
        } else if (Build.VERSION.SDK_INT >= 30) {
            IconCompatParcelizer = Impl30.CONSUMED;
        } else {
            IconCompatParcelizer = Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.write = new Impl34(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 30) {
            this.write = new Impl30(this, windowInsets);
        } else {
            this.write = new Impl29(this, windowInsets);
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.write;
            if (Build.VERSION.SDK_INT >= 34 && (impl instanceof Impl34)) {
                this.write = new Impl34(this, (Impl34) impl);
            } else if (Build.VERSION.SDK_INT >= 30 && (impl instanceof Impl30)) {
                this.write = new Impl30(this, (Impl30) impl);
            } else if (impl instanceof Impl29) {
                this.write = new Impl29(this, (Impl29) impl);
            } else if (impl instanceof Impl28) {
                this.write = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.write = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.write = new Impl20(this, (Impl20) impl);
            } else {
                this.write = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.write = new Impl(this);
    }

    public static WindowInsetsCompat IconCompatParcelizer(WindowInsets windowInsets) {
        return write(windowInsets, null);
    }

    public static WindowInsetsCompat write(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) StringCollectionDeserializer.RemoteActionCompatParcelizer(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            windowInsetsCompat.write(InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(view));
            windowInsetsCompat.AudioAttributesCompatParcelizer(view.getRootView());
            windowInsetsCompat.write(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public int AudioAttributesImplApi21Parcelizer() {
        return this.write.getSystemWindowInsets().read;
    }

    @Deprecated
    public int MediaBrowserCompatCustomActionResultReceiver() {
        return this.write.getSystemWindowInsets().write;
    }

    @Deprecated
    public int MediaBrowserCompatItemReceiver() {
        return this.write.getSystemWindowInsets().IconCompatParcelizer;
    }

    @Deprecated
    public int AudioAttributesImplBaseParcelizer() {
        return this.write.getSystemWindowInsets().AudioAttributesCompatParcelizer;
    }

    @Deprecated
    public boolean RatingCompat() {
        return !this.write.getSystemWindowInsets().equals(_verifyEndArrayForSingle.RemoteActionCompatParcelizer);
    }

    public boolean MediaMetadataCompat() {
        return (read(MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()).equals(_verifyEndArrayForSingle.RemoteActionCompatParcelizer) && RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer() ^ MediaBrowserCompatItemReceiver.IconCompatParcelizer()).equals(_verifyEndArrayForSingle.RemoteActionCompatParcelizer) && RemoteActionCompatParcelizer() == null) ? false : true;
    }

    public boolean MediaBrowserCompatSearchResultReceiver() {
        return this.write.isConsumed();
    }

    @Deprecated
    public WindowInsetsCompat IconCompatParcelizer() {
        return this.write.consumeSystemWindowInsets();
    }

    @Deprecated
    public WindowInsetsCompat read(int i, int i2, int i3, int i4) {
        return new RemoteActionCompatParcelizer(this).write(_verifyEndArrayForSingle.read(i, i2, i3, i4)).write();
    }

    @Deprecated
    public WindowInsetsCompat write() {
        return this.write.consumeStableInsets();
    }

    public _fromBytes RemoteActionCompatParcelizer() {
        return this.write.getDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat read() {
        return this.write.consumeDisplayCutout();
    }

    @Deprecated
    public _verifyEndArrayForSingle AudioAttributesCompatParcelizer() {
        return this.write.getStableInsets();
    }

    @Deprecated
    public _verifyEndArrayForSingle AudioAttributesImplApi26Parcelizer() {
        return this.write.getSystemGestureInsets();
    }

    public WindowInsetsCompat IconCompatParcelizer(int i, int i2, int i3, int i4) {
        return this.write.inset(i, i2, i3, i4);
    }

    public _verifyEndArrayForSingle read(int i) {
        return this.write.getInsets(i);
    }

    public _verifyEndArrayForSingle RemoteActionCompatParcelizer(int i) {
        return this.write.getInsetsIgnoringVisibility(i);
    }

    public boolean AudioAttributesCompatParcelizer(int i) {
        return this.write.isVisible(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return configureFromStringCreator.RemoteActionCompatParcelizer(this.write, ((WindowInsetsCompat) obj).write);
        }
        return false;
    }

    public int hashCode() {
        Impl impl = this.write;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public WindowInsets MediaBrowserCompatMediaItem() {
        Impl impl = this.write;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl {
        static final WindowInsetsCompat CONSUMED = new RemoteActionCompatParcelizer().write().read().write().IconCompatParcelizer();
        final WindowInsetsCompat mHost;

        void copyRootViewBounds(View view) {
        }

        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        _fromBytes getDisplayCutout() {
            return null;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i) {
            return true;
        }

        public void setOverriddenInsets(_verifyEndArrayForSingle[] _verifyendarrayforsingleArr) {
        }

        void setRootViewData(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void setSystemUiVisibility(int i) {
        }

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        _verifyEndArrayForSingle getSystemWindowInsets() {
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        _verifyEndArrayForSingle getStableInsets() {
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        _verifyEndArrayForSingle getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        _verifyEndArrayForSingle getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        _verifyEndArrayForSingle getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        _verifyEndArrayForSingle getInsets(int i) {
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        _verifyEndArrayForSingle getInsetsIgnoringVisibility(int i) {
            if ((i & 8) != 0) {
                throw new IllegalArgumentException("Unable to query the maximum insets for IME");
            }
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && configureFromStringCreator.RemoteActionCompatParcelizer(getSystemWindowInsets(), impl.getSystemWindowInsets()) && configureFromStringCreator.RemoteActionCompatParcelizer(getStableInsets(), impl.getStableInsets()) && configureFromStringCreator.RemoteActionCompatParcelizer(getDisplayCutout(), impl.getDisplayCutout());
        }

        public int hashCode() {
            boolean zIsRound = isRound();
            boolean zIsConsumed = isConsumed();
            return configureFromStringCreator.RemoteActionCompatParcelizer(Boolean.valueOf(zIsRound), Boolean.valueOf(zIsConsumed), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl20 extends Impl {
        private static final int SYSTEM_BAR_VISIBILITY_MASK = 6;
        private static Class<?> sAttachInfoClass = null;
        private static Field sAttachInfoField = null;
        private static Method sGetViewRootImplMethod = null;
        private static Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        private _verifyEndArrayForSingle[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        _verifyEndArrayForSingle mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        int mSystemUiVisibility;
        private _verifyEndArrayForSingle mSystemWindowInsets;

        static boolean systemBarVisibilityEquals(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        private _verifyEndArrayForSingle getInsets(int i, boolean z) {
            _verifyEndArrayForSingle _verifyendarrayforsingleRemoteActionCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    _verifyendarrayforsingleRemoteActionCompatParcelizer = _verifyEndArrayForSingle.RemoteActionCompatParcelizer(_verifyendarrayforsingleRemoteActionCompatParcelizer, getInsetsForType(i2, z));
                }
            }
            return _verifyendarrayforsingleRemoteActionCompatParcelizer;
        }

        protected _verifyEndArrayForSingle getInsetsForType(int i, boolean z) {
            _verifyEndArrayForSingle _verifyendarrayforsingleAudioAttributesCompatParcelizer;
            _fromBytes displayCutout;
            if (i == 1) {
                if (z) {
                    return _verifyEndArrayForSingle.read(0, Math.max(getRootStableInsets().write, getSystemWindowInsets().write), 0, 0);
                }
                if ((this.mSystemUiVisibility & 4) != 0) {
                    return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
                }
                return _verifyEndArrayForSingle.read(0, getSystemWindowInsets().write, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    _verifyEndArrayForSingle rootStableInsets = getRootStableInsets();
                    _verifyEndArrayForSingle stableInsets = getStableInsets();
                    return _verifyEndArrayForSingle.read(Math.max(rootStableInsets.read, stableInsets.read), 0, Math.max(rootStableInsets.IconCompatParcelizer, stableInsets.IconCompatParcelizer), Math.max(rootStableInsets.AudioAttributesCompatParcelizer, stableInsets.AudioAttributesCompatParcelizer));
                }
                if ((this.mSystemUiVisibility & 2) != 0) {
                    return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
                }
                _verifyEndArrayForSingle systemWindowInsets = getSystemWindowInsets();
                WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                _verifyendarrayforsingleAudioAttributesCompatParcelizer = windowInsetsCompat != null ? windowInsetsCompat.AudioAttributesCompatParcelizer() : null;
                int iMin = systemWindowInsets.AudioAttributesCompatParcelizer;
                if (_verifyendarrayforsingleAudioAttributesCompatParcelizer != null) {
                    iMin = Math.min(iMin, _verifyendarrayforsingleAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
                }
                return _verifyEndArrayForSingle.read(systemWindowInsets.read, 0, systemWindowInsets.IconCompatParcelizer, iMin);
            }
            if (i == 8) {
                _verifyEndArrayForSingle[] _verifyendarrayforsingleArr = this.mOverriddenInsets;
                _verifyendarrayforsingleAudioAttributesCompatParcelizer = _verifyendarrayforsingleArr != null ? _verifyendarrayforsingleArr[MediaBrowserCompatItemReceiver.IconCompatParcelizer(8)] : null;
                if (_verifyendarrayforsingleAudioAttributesCompatParcelizer != null) {
                    return _verifyendarrayforsingleAudioAttributesCompatParcelizer;
                }
                _verifyEndArrayForSingle systemWindowInsets2 = getSystemWindowInsets();
                _verifyEndArrayForSingle rootStableInsets2 = getRootStableInsets();
                if (systemWindowInsets2.AudioAttributesCompatParcelizer > rootStableInsets2.AudioAttributesCompatParcelizer) {
                    return _verifyEndArrayForSingle.read(0, 0, 0, systemWindowInsets2.AudioAttributesCompatParcelizer);
                }
                _verifyEndArrayForSingle _verifyendarrayforsingle = this.mRootViewVisibleInsets;
                if (_verifyendarrayforsingle != null && !_verifyendarrayforsingle.equals(_verifyEndArrayForSingle.RemoteActionCompatParcelizer) && this.mRootViewVisibleInsets.AudioAttributesCompatParcelizer > rootStableInsets2.AudioAttributesCompatParcelizer) {
                    return _verifyEndArrayForSingle.read(0, 0, 0, this.mRootViewVisibleInsets.AudioAttributesCompatParcelizer);
                }
                return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            }
            if (i == 16) {
                return getSystemGestureInsets();
            }
            if (i == 32) {
                return getMandatorySystemGestureInsets();
            }
            if (i == 64) {
                return getTappableElementInsets();
            }
            if (i == 128) {
                WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                if (windowInsetsCompat2 != null) {
                    displayCutout = windowInsetsCompat2.RemoteActionCompatParcelizer();
                } else {
                    displayCutout = getDisplayCutout();
                }
                if (displayCutout != null) {
                    return _verifyEndArrayForSingle.read(displayCutout.write(), displayCutout.AudioAttributesImplBaseParcelizer(), displayCutout.AudioAttributesCompatParcelizer(), displayCutout.read());
                }
                return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            }
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        protected boolean isTypeVisible(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(_verifyEndArrayForSingle.RemoteActionCompatParcelizer);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final _verifyEndArrayForSingle getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = _verifyEndArrayForSingle.read(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(WindowInsetsCompat.IconCompatParcelizer(this.mPlatformInsets));
            remoteActionCompatParcelizer.write(WindowInsetsCompat.AudioAttributesCompatParcelizer(getSystemWindowInsets(), i, i2, i3, i4));
            remoteActionCompatParcelizer.read(WindowInsetsCompat.AudioAttributesCompatParcelizer(getStableInsets(), i, i2, i3, i4));
            return remoteActionCompatParcelizer.write();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.write(this.mRootWindowInsets);
            windowInsetsCompat.read(this.mRootViewVisibleInsets);
            windowInsetsCompat.write(this.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.mRootViewVisibleInsets = _verifyendarrayforsingle;
        }

        private _verifyEndArrayForSingle getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.AudioAttributesCompatParcelizer();
            }
            return _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(View view) {
            _verifyEndArrayForSingle visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = _verifyEndArrayForSingle.RemoteActionCompatParcelizer;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setSystemUiVisibility(int i) {
            this.mSystemUiVisibility = i;
        }

        private _verifyEndArrayForSingle getVisibleInsets(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(objInvoke));
                    if (rect != null) {
                        return _verifyEndArrayForSingle.read(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(_verifyEndArrayForSingle[] _verifyendarrayforsingleArr) {
            this.mOverriddenInsets = _verifyendarrayforsingleArr;
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Impl20 impl20 = (Impl20) obj;
            return Objects.equals(this.mRootViewVisibleInsets, impl20.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl20.mSystemUiVisibility);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl21 extends Impl20 {
        private _verifyEndArrayForSingle mStableInsets;

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.IconCompatParcelizer(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.IconCompatParcelizer(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final _verifyEndArrayForSingle getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = _verifyEndArrayForSingle.read(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.mStableInsets = _verifyendarrayforsingle;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        _fromBytes getDisplayCutout() {
            return _fromBytes.AudioAttributesCompatParcelizer(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.IconCompatParcelizer(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl28.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl29 extends Impl28 {
        private _verifyEndArrayForSingle mMandatorySystemGestureInsets;
        private _verifyEndArrayForSingle mSystemGestureInsets;
        private _verifyEndArrayForSingle mTappableElementInsets;

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        _verifyEndArrayForSingle getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = _verifyEndArrayForSingle.write(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        _verifyEndArrayForSingle getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = _verifyEndArrayForSingle.write(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        _verifyEndArrayForSingle getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = _verifyEndArrayForSingle.write(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.IconCompatParcelizer(this.mPlatformInsets.inset(i, i2, i3, i4));
        }
    }

    public static _verifyEndArrayForSingle AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, _verifyendarrayforsingle.read - i);
        int iMax2 = Math.max(0, _verifyendarrayforsingle.write - i2);
        int iMax3 = Math.max(0, _verifyendarrayforsingle.IconCompatParcelizer - i3);
        int iMax4 = Math.max(0, _verifyendarrayforsingle.AudioAttributesCompatParcelizer - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? _verifyendarrayforsingle : _verifyEndArrayForSingle.read(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.IconCompatParcelizer(WindowInsets.CONSUMED);

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(View view) {
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsets(int i) {
            return _verifyEndArrayForSingle.write(this.mPlatformInsets.getInsets(AudioAttributesImplApi21Parcelizer.read(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsetsIgnoringVisibility(int i) {
            return _verifyEndArrayForSingle.write(this.mPlatformInsets.getInsetsIgnoringVisibility(AudioAttributesImplApi21Parcelizer.read(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(AudioAttributesImplApi21Parcelizer.read(i));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class Impl34 extends Impl30 {
        static final WindowInsetsCompat CONSUMED = WindowInsetsCompat.IconCompatParcelizer(WindowInsets.CONSUMED);

        Impl34(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl34(WindowInsetsCompat windowInsetsCompat, Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsets(int i) {
            return _verifyEndArrayForSingle.write(this.mPlatformInsets.getInsets(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public _verifyEndArrayForSingle getInsetsIgnoringVisibility(int i) {
            return _verifyEndArrayForSingle.write(this.mPlatformInsets.getInsetsIgnoringVisibility(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class RemoteActionCompatParcelizer {
        private final IconCompatParcelizer write;

        public RemoteActionCompatParcelizer() {
            if (Build.VERSION.SDK_INT >= 34) {
                this.write = new write();
            } else if (Build.VERSION.SDK_INT >= 30) {
                this.write = new AudioAttributesCompatParcelizer();
            } else {
                this.write = new read();
            }
        }

        public RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.write = new write(windowInsetsCompat);
            } else if (Build.VERSION.SDK_INT >= 30) {
                this.write = new AudioAttributesCompatParcelizer(windowInsetsCompat);
            } else {
                this.write = new read(windowInsetsCompat);
            }
        }

        @Deprecated
        public final RemoteActionCompatParcelizer write(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.write.IconCompatParcelizer(_verifyendarrayforsingle);
            return this;
        }

        public final RemoteActionCompatParcelizer write(int i, _verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.write.IconCompatParcelizer(i, _verifyendarrayforsingle);
            return this;
        }

        @Deprecated
        public final RemoteActionCompatParcelizer read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.write.read(_verifyendarrayforsingle);
            return this;
        }

        public final WindowInsetsCompat write() {
            return this.write.IconCompatParcelizer();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class IconCompatParcelizer {
        private final WindowInsetsCompat IconCompatParcelizer;
        _verifyEndArrayForSingle[] write;

        void AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void IconCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void RemoteActionCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        void write(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        }

        IconCompatParcelizer() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        IconCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
            this.IconCompatParcelizer = windowInsetsCompat;
        }

        void IconCompatParcelizer(int i, _verifyEndArrayForSingle _verifyendarrayforsingle) {
            if (this.write == null) {
                this.write = new _verifyEndArrayForSingle[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.write[MediaBrowserCompatItemReceiver.IconCompatParcelizer(i2)] = _verifyendarrayforsingle;
                }
            }
        }

        protected final void RemoteActionCompatParcelizer() {
            _verifyEndArrayForSingle[] _verifyendarrayforsingleArr = this.write;
            if (_verifyendarrayforsingleArr != null) {
                _verifyEndArrayForSingle _verifyendarrayforsingle = _verifyendarrayforsingleArr[MediaBrowserCompatItemReceiver.IconCompatParcelizer(1)];
                _verifyEndArrayForSingle _verifyendarrayforsingle2 = this.write[MediaBrowserCompatItemReceiver.IconCompatParcelizer(2)];
                if (_verifyendarrayforsingle2 == null) {
                    _verifyendarrayforsingle2 = this.IconCompatParcelizer.read(2);
                }
                if (_verifyendarrayforsingle == null) {
                    _verifyendarrayforsingle = this.IconCompatParcelizer.read(1);
                }
                IconCompatParcelizer(_verifyEndArrayForSingle.RemoteActionCompatParcelizer(_verifyendarrayforsingle, _verifyendarrayforsingle2));
                _verifyEndArrayForSingle _verifyendarrayforsingle3 = this.write[MediaBrowserCompatItemReceiver.IconCompatParcelizer(16)];
                if (_verifyendarrayforsingle3 != null) {
                    AudioAttributesCompatParcelizer(_verifyendarrayforsingle3);
                }
                _verifyEndArrayForSingle _verifyendarrayforsingle4 = this.write[MediaBrowserCompatItemReceiver.IconCompatParcelizer(32)];
                if (_verifyendarrayforsingle4 != null) {
                    RemoteActionCompatParcelizer(_verifyendarrayforsingle4);
                }
                _verifyEndArrayForSingle _verifyendarrayforsingle5 = this.write[MediaBrowserCompatItemReceiver.IconCompatParcelizer(64)];
                if (_verifyendarrayforsingle5 != null) {
                    write(_verifyendarrayforsingle5);
                }
            }
        }

        WindowInsetsCompat IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
            return this.IconCompatParcelizer;
        }
    }

    void read(_verifyEndArrayForSingle[] _verifyendarrayforsingleArr) {
        this.write.setOverriddenInsets(_verifyendarrayforsingleArr);
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class read extends IconCompatParcelizer {
        final WindowInsets.Builder AudioAttributesCompatParcelizer;

        read() {
            this.AudioAttributesCompatParcelizer = new WindowInsets.Builder();
        }

        read(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builder;
            super(windowInsetsCompat);
            WindowInsets windowInsetsMediaBrowserCompatMediaItem = windowInsetsCompat.MediaBrowserCompatMediaItem();
            if (windowInsetsMediaBrowserCompatMediaItem != null) {
                builder = new WindowInsets.Builder(windowInsetsMediaBrowserCompatMediaItem);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.AudioAttributesCompatParcelizer = builder;
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void IconCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setSystemWindowInsets(_verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void AudioAttributesCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setSystemGestureInsets(_verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void RemoteActionCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setMandatorySystemGestureInsets(_verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void write(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setTappableElementInsets(_verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setStableInsets(_verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        WindowInsetsCompat IconCompatParcelizer() {
            RemoteActionCompatParcelizer();
            WindowInsetsCompat windowInsetsCompatIconCompatParcelizer = WindowInsetsCompat.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.build());
            windowInsetsCompatIconCompatParcelizer.read(this.write);
            return windowInsetsCompatIconCompatParcelizer;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer extends read {
        AudioAttributesCompatParcelizer() {
        }

        AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void IconCompatParcelizer(int i, _verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setInsets(AudioAttributesImplApi21Parcelizer.read(i), _verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class write extends AudioAttributesCompatParcelizer {
        write() {
        }

        write(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.AudioAttributesCompatParcelizer, androidx.core.view.WindowInsetsCompat.IconCompatParcelizer
        void IconCompatParcelizer(int i, _verifyEndArrayForSingle _verifyendarrayforsingle) {
            this.AudioAttributesCompatParcelizer.setInsets(AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i), _verifyendarrayforsingle.RemoteActionCompatParcelizer());
        }
    }

    public static final class MediaBrowserCompatItemReceiver {
        public static int AudioAttributesCompatParcelizer() {
            return 4;
        }

        public static int AudioAttributesImplApi21Parcelizer() {
            return 64;
        }

        public static int AudioAttributesImplApi26Parcelizer() {
            return 16;
        }

        public static int AudioAttributesImplBaseParcelizer() {
            return 519;
        }

        public static int IconCompatParcelizer() {
            return 8;
        }

        public static int MediaBrowserCompatCustomActionResultReceiver() {
            return 1;
        }

        public static int MediaBrowserCompatItemReceiver() {
            return 2;
        }

        static int RemoteActionCompatParcelizer() {
            return -1;
        }

        public static int read() {
            return 128;
        }

        public static int write() {
            return 32;
        }

        static int IconCompatParcelizer(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class AudioAttributesImplApi21Parcelizer {
        static int read(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class AudioAttributesImplApi26Parcelizer {
        static int AudioAttributesCompatParcelizer(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    public void write(WindowInsetsCompat windowInsetsCompat) {
        this.write.setRootWindowInsets(windowInsetsCompat);
    }

    void read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
        this.write.setRootViewData(_verifyendarrayforsingle);
    }

    public void AudioAttributesCompatParcelizer(View view) {
        this.write.copyRootViewBounds(view);
    }

    void write(int i) {
        this.write.setSystemUiVisibility(i);
    }
}
