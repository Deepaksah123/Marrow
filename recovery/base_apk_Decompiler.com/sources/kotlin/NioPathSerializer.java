package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin._byteOverflow;

/* JADX INFO: loaded from: classes2.dex */
public final class NioPathSerializer {
    private write read;

    public NioPathSerializer(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.read = new IconCompatParcelizer(i, interpolator, j);
        } else {
            this.read = new AudioAttributesCompatParcelizer(i, interpolator, j);
        }
    }

    private NioPathSerializer(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.read = new IconCompatParcelizer(windowInsetsAnimation);
        }
    }

    public final int IconCompatParcelizer() {
        return this.read.read();
    }

    public final float AudioAttributesCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public final long write() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.read.write(f);
    }

    public final float RemoteActionCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    public static final class RemoteActionCompatParcelizer {
        private final _verifyEndArrayForSingle AudioAttributesCompatParcelizer;
        private final _verifyEndArrayForSingle RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(_verifyEndArrayForSingle _verifyendarrayforsingle, _verifyEndArrayForSingle _verifyendarrayforsingle2) {
            this.AudioAttributesCompatParcelizer = _verifyendarrayforsingle;
            this.RemoteActionCompatParcelizer = _verifyendarrayforsingle2;
        }

        private RemoteActionCompatParcelizer(WindowInsetsAnimation.Bounds bounds) {
            this.AudioAttributesCompatParcelizer = IconCompatParcelizer.cD_(bounds);
            this.RemoteActionCompatParcelizer = IconCompatParcelizer.cC_(bounds);
        }

        public final _verifyEndArrayForSingle IconCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final _verifyEndArrayForSingle write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final RemoteActionCompatParcelizer read(_verifyEndArrayForSingle _verifyendarrayforsingle) {
            return new RemoteActionCompatParcelizer(WindowInsetsCompat.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, _verifyendarrayforsingle.read, _verifyendarrayforsingle.write, _verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle.AudioAttributesCompatParcelizer), WindowInsetsCompat.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, _verifyendarrayforsingle.read, _verifyendarrayforsingle.write, _verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle.AudioAttributesCompatParcelizer));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bounds{lower=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(" upper=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }

        public final WindowInsetsAnimation.Bounds cA_() {
            return IconCompatParcelizer.cB_(this);
        }

        public static RemoteActionCompatParcelizer cz_(WindowInsetsAnimation.Bounds bounds) {
            return new RemoteActionCompatParcelizer(bounds);
        }
    }

    static NioPathSerializer cy_(WindowInsetsAnimation windowInsetsAnimation) {
        return new NioPathSerializer(windowInsetsAnimation);
    }

    public static abstract class read {
        WindowInsetsCompat RemoteActionCompatParcelizer;
        private final int write;

        public abstract WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat, List<NioPathSerializer> list);

        public void IconCompatParcelizer(NioPathSerializer nioPathSerializer) {
        }

        public RemoteActionCompatParcelizer write(NioPathSerializer nioPathSerializer, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return remoteActionCompatParcelizer;
        }

        public void write(NioPathSerializer nioPathSerializer) {
        }

        public read(int i) {
            this.write = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }
    }

    static void IconCompatParcelizer(View view, read readVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            IconCompatParcelizer.read(view, readVar);
        } else {
            AudioAttributesCompatParcelizer.IconCompatParcelizer(view, readVar);
        }
    }

    static class write {
        private final int AudioAttributesCompatParcelizer;
        private float IconCompatParcelizer = 1.0f;
        private float RemoteActionCompatParcelizer;
        private final Interpolator read;
        private final long write;

        write(int i, Interpolator interpolator, long j) {
            this.AudioAttributesCompatParcelizer = i;
            this.read = interpolator;
            this.write = j;
        }

        public int read() {
            return this.AudioAttributesCompatParcelizer;
        }

        public float IconCompatParcelizer() {
            Interpolator interpolator = this.read;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.RemoteActionCompatParcelizer);
            }
            return this.RemoteActionCompatParcelizer;
        }

        public long AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public float RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public void write(float f) {
            this.RemoteActionCompatParcelizer = f;
        }
    }

    static class AudioAttributesCompatParcelizer extends write {
        private static final Interpolator read = new PathInterpolator(BitmapDescriptorFactory.HUE_RED, 1.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        private static final Interpolator IconCompatParcelizer = new _findExplicitNames();
        private static final Interpolator AudioAttributesCompatParcelizer = new DecelerateInterpolator(1.5f);
        private static final Interpolator RemoteActionCompatParcelizer = new AccelerateInterpolator(1.5f);

        AudioAttributesCompatParcelizer(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        static void IconCompatParcelizer(View view, read readVar) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerAudioAttributesCompatParcelizer = readVar != null ? AudioAttributesCompatParcelizer(view, readVar) : null;
            view.setTag(_byteOverflow.IconCompatParcelizer.tag_window_insets_animation_callback, onApplyWindowInsetsListenerAudioAttributesCompatParcelizer);
            if (view.getTag(_byteOverflow.IconCompatParcelizer.tag_compat_insets_dispatch) == null && view.getTag(_byteOverflow.IconCompatParcelizer.tag_on_apply_window_listener) == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerAudioAttributesCompatParcelizer);
            }
        }

        private static View.OnApplyWindowInsetsListener AudioAttributesCompatParcelizer(View view, read readVar) {
            return new read(view, readVar);
        }

        static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i) {
            _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(i);
            _verifyEndArrayForSingle _verifyendarrayforsingle2 = windowInsetsCompat2.read(i);
            return new RemoteActionCompatParcelizer(_verifyEndArrayForSingle.read(Math.min(_verifyendarrayforsingle.read, _verifyendarrayforsingle2.read), Math.min(_verifyendarrayforsingle.write, _verifyendarrayforsingle2.write), Math.min(_verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle2.IconCompatParcelizer), Math.min(_verifyendarrayforsingle.AudioAttributesCompatParcelizer, _verifyendarrayforsingle2.AudioAttributesCompatParcelizer)), _verifyEndArrayForSingle.read(Math.max(_verifyendarrayforsingle.read, _verifyendarrayforsingle2.read), Math.max(_verifyendarrayforsingle.write, _verifyendarrayforsingle2.write), Math.max(_verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle2.IconCompatParcelizer), Math.max(_verifyendarrayforsingle.AudioAttributesCompatParcelizer, _verifyendarrayforsingle2.AudioAttributesCompatParcelizer)));
        }

        static void write(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int[] iArr, int[] iArr2) {
            for (int i = 1; i <= 512; i <<= 1) {
                _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(i);
                _verifyEndArrayForSingle _verifyendarrayforsingle2 = windowInsetsCompat2.read(i);
                boolean z = _verifyendarrayforsingle.read > _verifyendarrayforsingle2.read || _verifyendarrayforsingle.write > _verifyendarrayforsingle2.write || _verifyendarrayforsingle.IconCompatParcelizer > _verifyendarrayforsingle2.IconCompatParcelizer || _verifyendarrayforsingle.AudioAttributesCompatParcelizer > _verifyendarrayforsingle2.AudioAttributesCompatParcelizer;
                if (z != (_verifyendarrayforsingle.read < _verifyendarrayforsingle2.read || _verifyendarrayforsingle.write < _verifyendarrayforsingle2.write || _verifyendarrayforsingle.IconCompatParcelizer < _verifyendarrayforsingle2.IconCompatParcelizer || _verifyendarrayforsingle.AudioAttributesCompatParcelizer < _verifyendarrayforsingle2.AudioAttributesCompatParcelizer)) {
                    if (z) {
                        iArr[0] = iArr[0] | i;
                    } else {
                        iArr2[0] = iArr2[0] | i;
                    }
                }
            }
        }

        static Interpolator AudioAttributesCompatParcelizer(int i, int i2) {
            if ((WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer() & i) != 0) {
                return read;
            }
            if ((WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer() & i2) != 0) {
                return IconCompatParcelizer;
            }
            if ((i & WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer()) != 0) {
                return AudioAttributesCompatParcelizer;
            }
            if ((WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer() & i2) != 0) {
                return RemoteActionCompatParcelizer;
            }
            return null;
        }

        static WindowInsetsCompat write(WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            WindowInsetsCompat.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new WindowInsetsCompat.RemoteActionCompatParcelizer(windowInsetsCompat);
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) == 0) {
                    remoteActionCompatParcelizer.write(i2, windowInsetsCompat.read(i2));
                } else {
                    _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(i2);
                    _verifyEndArrayForSingle _verifyendarrayforsingle2 = windowInsetsCompat2.read(i2);
                    float f2 = 1.0f - f;
                    remoteActionCompatParcelizer.write(i2, WindowInsetsCompat.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, (int) (((double) ((_verifyendarrayforsingle.read - _verifyendarrayforsingle2.read) * f2)) + 0.5d), (int) (((double) ((_verifyendarrayforsingle.write - _verifyendarrayforsingle2.write) * f2)) + 0.5d), (int) (((double) ((_verifyendarrayforsingle.IconCompatParcelizer - _verifyendarrayforsingle2.IconCompatParcelizer) * f2)) + 0.5d), (int) (((double) ((_verifyendarrayforsingle.AudioAttributesCompatParcelizer - _verifyendarrayforsingle2.AudioAttributesCompatParcelizer) * f2)) + 0.5d)));
                }
            }
            return remoteActionCompatParcelizer.write();
        }

        static class read implements View.OnApplyWindowInsetsListener {
            private WindowInsetsCompat RemoteActionCompatParcelizer;
            final read read;

            read(View view, read readVar) {
                this.read = readVar;
                WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(view);
                this.RemoteActionCompatParcelizer = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler != null ? new WindowInsetsCompat.RemoteActionCompatParcelizer(windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler).write() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(final View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.RemoteActionCompatParcelizer = WindowInsetsCompat.write(windowInsets, view);
                    return AudioAttributesCompatParcelizer.read(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompatWrite = WindowInsetsCompat.write(windowInsets, view);
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(view);
                }
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = windowInsetsCompatWrite;
                    return AudioAttributesCompatParcelizer.read(view, windowInsets);
                }
                read readVarIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(view);
                if (readVarIconCompatParcelizer != null && Objects.equals(readVarIconCompatParcelizer.RemoteActionCompatParcelizer, windowInsetsCompatWrite)) {
                    return AudioAttributesCompatParcelizer.read(view, windowInsets);
                }
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                AudioAttributesCompatParcelizer.write(windowInsetsCompatWrite, this.RemoteActionCompatParcelizer, iArr, iArr2);
                int i = iArr[0];
                int i2 = iArr2[0];
                final int i3 = i | i2;
                if (i3 == 0) {
                    this.RemoteActionCompatParcelizer = windowInsetsCompatWrite;
                    return AudioAttributesCompatParcelizer.read(view, windowInsets);
                }
                final WindowInsetsCompat windowInsetsCompat = this.RemoteActionCompatParcelizer;
                final NioPathSerializer nioPathSerializer = new NioPathSerializer(i3, AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(i, i2), (WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer() & i3) != 0 ? 160L : 250L);
                nioPathSerializer.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
                final ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f).setDuration(nioPathSerializer.write());
                final RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(windowInsetsCompatWrite, windowInsetsCompat, i3);
                AudioAttributesCompatParcelizer.write(view, nioPathSerializer, windowInsetsCompatWrite, false);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.NioPathSerializer.AudioAttributesCompatParcelizer.read.4
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        nioPathSerializer.RemoteActionCompatParcelizer(valueAnimator.getAnimatedFraction());
                        AudioAttributesCompatParcelizer.IconCompatParcelizer(view, AudioAttributesCompatParcelizer.write(windowInsetsCompatWrite, windowInsetsCompat, nioPathSerializer.AudioAttributesCompatParcelizer(), i3), Collections.singletonList(nioPathSerializer));
                    }
                });
                duration.addListener(new AnimatorListenerAdapter() { // from class: o.NioPathSerializer.AudioAttributesCompatParcelizer.read.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        nioPathSerializer.RemoteActionCompatParcelizer(1.0f);
                        AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(view, nioPathSerializer);
                    }
                });
                childArray.RemoteActionCompatParcelizer(view, new Runnable() { // from class: o.NioPathSerializer.AudioAttributesCompatParcelizer.read.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AudioAttributesCompatParcelizer.write(view, nioPathSerializer, remoteActionCompatParcelizerAudioAttributesCompatParcelizer);
                        duration.start();
                    }
                });
                this.RemoteActionCompatParcelizer = windowInsetsCompatWrite;
                return AudioAttributesCompatParcelizer.read(view, windowInsets);
            }
        }

        static WindowInsets read(View view, WindowInsets windowInsets) {
            return view.getTag(_byteOverflow.IconCompatParcelizer.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static void write(View view, NioPathSerializer nioPathSerializer, WindowInsetsCompat windowInsetsCompat, boolean z) {
            read readVarIconCompatParcelizer = IconCompatParcelizer(view);
            if (readVarIconCompatParcelizer != null) {
                readVarIconCompatParcelizer.RemoteActionCompatParcelizer = windowInsetsCompat;
                if (!z) {
                    readVarIconCompatParcelizer.write(nioPathSerializer);
                    z = readVarIconCompatParcelizer.AudioAttributesCompatParcelizer() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    write(viewGroup.getChildAt(i), nioPathSerializer, windowInsetsCompat, z);
                }
            }
        }

        static void write(View view, NioPathSerializer nioPathSerializer, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            read readVarIconCompatParcelizer = IconCompatParcelizer(view);
            if (readVarIconCompatParcelizer != null) {
                readVarIconCompatParcelizer.write(nioPathSerializer, remoteActionCompatParcelizer);
                if (readVarIconCompatParcelizer.AudioAttributesCompatParcelizer() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    write(viewGroup.getChildAt(i), nioPathSerializer, remoteActionCompatParcelizer);
                }
            }
        }

        static void IconCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, List<NioPathSerializer> list) {
            read readVarIconCompatParcelizer = IconCompatParcelizer(view);
            if (readVarIconCompatParcelizer != null) {
                windowInsetsCompat = readVarIconCompatParcelizer.AudioAttributesCompatParcelizer(windowInsetsCompat, list);
                if (readVarIconCompatParcelizer.AudioAttributesCompatParcelizer() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    IconCompatParcelizer(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        static void RemoteActionCompatParcelizer(View view, NioPathSerializer nioPathSerializer) {
            read readVarIconCompatParcelizer = IconCompatParcelizer(view);
            if (readVarIconCompatParcelizer != null) {
                readVarIconCompatParcelizer.IconCompatParcelizer(nioPathSerializer);
                if (readVarIconCompatParcelizer.AudioAttributesCompatParcelizer() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    RemoteActionCompatParcelizer(viewGroup.getChildAt(i), nioPathSerializer);
                }
            }
        }

        static read IconCompatParcelizer(View view) {
            Object tag = view.getTag(_byteOverflow.IconCompatParcelizer.tag_window_insets_animation_callback);
            if (tag instanceof read) {
                return ((read) tag).read;
            }
            return null;
        }
    }

    static class IconCompatParcelizer extends write {
        private final WindowInsetsAnimation IconCompatParcelizer;

        IconCompatParcelizer(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.IconCompatParcelizer = windowInsetsAnimation;
        }

        IconCompatParcelizer(int i, Interpolator interpolator, long j) {
            this(new WindowInsetsAnimation(i, interpolator, j));
        }

        @Override // o.NioPathSerializer.write
        public int read() {
            return this.IconCompatParcelizer.getTypeMask();
        }

        @Override // o.NioPathSerializer.write
        public long AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer.getDurationMillis();
        }

        @Override // o.NioPathSerializer.write
        public void write(float f) {
            this.IconCompatParcelizer.setFraction(f);
        }

        @Override // o.NioPathSerializer.write
        public float IconCompatParcelizer() {
            return this.IconCompatParcelizer.getInterpolatedFraction();
        }

        @Override // o.NioPathSerializer.write
        public float RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer.getAlpha();
        }

        static class read extends WindowInsetsAnimation.Callback {
            private ArrayList<NioPathSerializer> AudioAttributesCompatParcelizer;
            private final read IconCompatParcelizer;
            private List<NioPathSerializer> read;
            private final HashMap<WindowInsetsAnimation, NioPathSerializer> write;

            read(read readVar) {
                super(readVar.AudioAttributesCompatParcelizer());
                this.write = new HashMap<>();
                this.IconCompatParcelizer = readVar;
            }

            private NioPathSerializer cE_(WindowInsetsAnimation windowInsetsAnimation) {
                NioPathSerializer nioPathSerializer = this.write.get(windowInsetsAnimation);
                if (nioPathSerializer != null) {
                    return nioPathSerializer;
                }
                NioPathSerializer nioPathSerializerCy_ = NioPathSerializer.cy_(windowInsetsAnimation);
                this.write.put(windowInsetsAnimation, nioPathSerializerCy_);
                return nioPathSerializerCy_;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.IconCompatParcelizer.write(cE_(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.IconCompatParcelizer.write(cE_(windowInsetsAnimation), RemoteActionCompatParcelizer.cz_(bounds)).cA_();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<NioPathSerializer> arrayList = this.AudioAttributesCompatParcelizer;
                if (arrayList == null) {
                    ArrayList<NioPathSerializer> arrayList2 = new ArrayList<>(list.size());
                    this.AudioAttributesCompatParcelizer = arrayList2;
                    this.read = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    NioPathSerializer nioPathSerializerCE_ = cE_(windowInsetsAnimation);
                    nioPathSerializerCE_.RemoteActionCompatParcelizer(windowInsetsAnimation.getFraction());
                    this.AudioAttributesCompatParcelizer.add(nioPathSerializerCE_);
                }
                return this.IconCompatParcelizer.AudioAttributesCompatParcelizer(WindowInsetsCompat.IconCompatParcelizer(windowInsets), this.read).MediaBrowserCompatMediaItem();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.IconCompatParcelizer.IconCompatParcelizer(cE_(windowInsetsAnimation));
                this.write.remove(windowInsetsAnimation);
            }
        }

        public static void read(View view, read readVar) {
            view.setWindowInsetsAnimationCallback(readVar != null ? new read(readVar) : null);
        }

        public static WindowInsetsAnimation.Bounds cB_(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            return new WindowInsetsAnimation.Bounds(remoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer(), remoteActionCompatParcelizer.write().RemoteActionCompatParcelizer());
        }

        public static _verifyEndArrayForSingle cD_(WindowInsetsAnimation.Bounds bounds) {
            return _verifyEndArrayForSingle.write(bounds.getLowerBound());
        }

        public static _verifyEndArrayForSingle cC_(WindowInsetsAnimation.Bounds bounds) {
            return _verifyEndArrayForSingle.write(bounds.getUpperBound());
        }
    }
}
