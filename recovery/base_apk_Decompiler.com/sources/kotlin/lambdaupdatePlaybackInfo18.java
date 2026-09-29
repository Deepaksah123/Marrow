package kotlin;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import coil.size.PixelSize;
import coil.size.Size;
import kotlin.C0177getRfBanners;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public interface lambdaupdatePlaybackInfo18<T extends View> extends lambdaupdatePlaybackInfo15 {
    public static final read RemoteActionCompatParcelizer = read.IconCompatParcelizer;

    boolean IconCompatParcelizer();

    T write();

    public static final class IconCompatParcelizer {
        public static <T extends View> Object AudioAttributesCompatParcelizer(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18, SampleVideos<? super Size> sampleVideos) {
            PixelSize pixelSize = read(lambdaupdateplaybackinfo18);
            if (pixelSize != null) {
                return pixelSize;
            }
            setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
            setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
            setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
            ViewTreeObserver viewTreeObserver = lambdaupdateplaybackinfo18.write().getViewTreeObserver();
            read readVar = new read(lambdaupdateplaybackinfo18, viewTreeObserver, setstatesolvedcount2);
            viewTreeObserver.addOnPreDrawListener(readVar);
            setstatesolvedcount2.write((getAnswerMap<? super Throwable, getShowPopup>) new AnonymousClass4(lambdaupdateplaybackinfo18, viewTreeObserver, readVar));
            Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer;
        }

        public static final class read implements ViewTreeObserver.OnPreDrawListener {
            private boolean AudioAttributesCompatParcelizer;
            private /* synthetic */ setStateRank<Size> IconCompatParcelizer;
            private /* synthetic */ lambdaupdatePlaybackInfo18<T> read;
            private /* synthetic */ ViewTreeObserver write;

            /* JADX WARN: Multi-variable type inference failed */
            read(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18, ViewTreeObserver viewTreeObserver, setStateRank<? super Size> setstaterank) {
                this.read = lambdaupdateplaybackinfo18;
                this.write = viewTreeObserver;
                this.IconCompatParcelizer = setstaterank;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                PixelSize pixelSize = IconCompatParcelizer.read(this.read);
                if (pixelSize != null) {
                    lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18 = this.read;
                    ViewTreeObserver viewTreeObserver = this.write;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewTreeObserver, "");
                    IconCompatParcelizer.RemoteActionCompatParcelizer(lambdaupdateplaybackinfo18, viewTreeObserver, this);
                    if (!this.AudioAttributesCompatParcelizer) {
                        this.AudioAttributesCompatParcelizer = true;
                        setStateRank<Size> setstaterank = this.IconCompatParcelizer;
                        C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
                        setstaterank.resumeWith(C0177getRfBanners.read(pixelSize));
                    }
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: o.lambdaupdatePlaybackInfo18$IconCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "T", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 5, 1}, xi = 48)
        static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<Throwable, getShowPopup> {
            private /* synthetic */ ViewTreeObserver $AudioAttributesCompatParcelizer;
            private /* synthetic */ read $read;
            private /* synthetic */ lambdaupdatePlaybackInfo18<T> write;

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(Throwable th) {
                RemoteActionCompatParcelizer(th);
                return getShowPopup.INSTANCE;
            }

            public final void RemoteActionCompatParcelizer(Throwable th) {
                lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18 = this.write;
                ViewTreeObserver viewTreeObserver = this.$AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewTreeObserver, "");
                IconCompatParcelizer.RemoteActionCompatParcelizer(lambdaupdateplaybackinfo18, viewTreeObserver, this.$read);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18, ViewTreeObserver viewTreeObserver, read readVar) {
                super(1);
                this.write = lambdaupdateplaybackinfo18;
                this.$AudioAttributesCompatParcelizer = viewTreeObserver;
                this.$read = readVar;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends View> PixelSize read(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18) {
            int iIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lambdaupdateplaybackinfo18);
            if (iAudioAttributesCompatParcelizer > 0 && (iIconCompatParcelizer = IconCompatParcelizer(lambdaupdateplaybackinfo18)) > 0) {
                return new PixelSize(iAudioAttributesCompatParcelizer, iIconCompatParcelizer);
            }
            return null;
        }

        private static <T extends View> int AudioAttributesCompatParcelizer(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18) {
            ViewGroup.LayoutParams layoutParams = lambdaupdateplaybackinfo18.write().getLayoutParams();
            return AudioAttributesCompatParcelizer(lambdaupdateplaybackinfo18, layoutParams == null ? -1 : layoutParams.width, lambdaupdateplaybackinfo18.write().getWidth(), lambdaupdateplaybackinfo18.IconCompatParcelizer() ? lambdaupdateplaybackinfo18.write().getPaddingLeft() + lambdaupdateplaybackinfo18.write().getPaddingRight() : 0, true);
        }

        private static <T extends View> int IconCompatParcelizer(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18) {
            ViewGroup.LayoutParams layoutParams = lambdaupdateplaybackinfo18.write().getLayoutParams();
            return AudioAttributesCompatParcelizer(lambdaupdateplaybackinfo18, layoutParams == null ? -1 : layoutParams.height, lambdaupdateplaybackinfo18.write().getHeight(), lambdaupdateplaybackinfo18.IconCompatParcelizer() ? lambdaupdateplaybackinfo18.write().getPaddingTop() + lambdaupdateplaybackinfo18.write().getPaddingBottom() : 0, false);
        }

        private static <T extends View> int AudioAttributesCompatParcelizer(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18, int i, int i2, int i3, boolean z) {
            int i4 = i - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return i5;
            }
            if (i != -2) {
                return -1;
            }
            DisplayMetrics displayMetrics = lambdaupdateplaybackinfo18.write().getContext().getResources().getDisplayMetrics();
            return z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends View> void RemoteActionCompatParcelizer(lambdaupdatePlaybackInfo18<T> lambdaupdateplaybackinfo18, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                lambdaupdateplaybackinfo18.write().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }
    }

    public static final class read {
        static final /* synthetic */ read IconCompatParcelizer = new read();

        private read() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static <T extends View> lambdaupdatePlaybackInfo18<T> RemoteActionCompatParcelizer(T t, boolean z) {
            toMagicModuleMetaRepoModel.write(t, "");
            return new lambdasetVolume10(t, true);
        }
    }
}
