package kotlin;

import android.graphics.Bitmap;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.lambdamaybeNotifySurfaceSizeChanged27;
import kotlin.lambdasetRepeatMode3;
import kotlin.setBandwidthMeter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000 \u00112\u00020\u0001:\u0002\u0011\u000bJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0011\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0018J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u000b\u0010\u001aJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\r\u0010\u001cJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u0011\u0010\u001eJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0018J\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0011\u0010 J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\u0017\u0010 J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setBandwidthMeter;", "Lo/lambdamaybeNotifySurfaceSizeChanged27$RemoteActionCompatParcelizer;", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "p0", "Lo/ExoPlayerBuilderExternalSyntheticLambda21;", "p1", "Lo/ExoPlayerBuilderExternalSyntheticLambda4;", "p2", "Lo/ExoPlayerBuilderExternalSyntheticLambda17;", "p3", "", "AudioAttributesCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lo/ExoPlayerBuilderExternalSyntheticLambda21;Lo/ExoPlayerBuilderExternalSyntheticLambda4;Lo/ExoPlayerBuilderExternalSyntheticLambda17;)V", "RemoteActionCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lo/ExoPlayerBuilderExternalSyntheticLambda21;Lo/ExoPlayerBuilderExternalSyntheticLambda4;)V", "Lo/ExoPlayerBuilderExternalSyntheticLambda9;", "Lo/ExoPlayerDeviceComponent;", "read", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lo/ExoPlayerBuilderExternalSyntheticLambda9;Lo/ExoPlayerBuilderExternalSyntheticLambda4;Lo/ExoPlayerDeviceComponent;)V", "write", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lo/ExoPlayerBuilderExternalSyntheticLambda9;Lo/ExoPlayerBuilderExternalSyntheticLambda4;)V", "", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Ljava/lang/Object;)V", "IconCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;)V", "", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Ljava/lang/Throwable;)V", "Lo/lambdasetRepeatMode3$AudioAttributesCompatParcelizer;", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lo/lambdasetRepeatMode3$AudioAttributesCompatParcelizer;)V", "Lcoil/size/Size;", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Lcoil/size/Size;)V", "Landroid/graphics/Bitmap;", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;Landroid/graphics/Bitmap;)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface setBandwidthMeter extends lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;
    public static final setBandwidthMeter write = new IconCompatParcelizer();

    public static final class DefaultImpls {
        public static void AudioAttributesCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, ExoPlayerBuilderExternalSyntheticLambda17 exoPlayerBuilderExternalSyntheticLambda17) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda21, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda4, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda17, "");
        }

        public static void RemoteActionCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda21, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda4, "");
        }

        public static void read(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda9<?> exoPlayerBuilderExternalSyntheticLambda9, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, ExoPlayerDeviceComponent exoPlayerDeviceComponent) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda9, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda4, "");
            toMagicModuleMetaRepoModel.write(exoPlayerDeviceComponent, "");
        }

        public static void write(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda9<?> exoPlayerBuilderExternalSyntheticLambda9, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda9, "");
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda4, "");
        }

        public static void read(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Object obj) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(obj, "");
        }

        public static void IconCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Object obj) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(obj, "");
        }

        public static void RemoteActionCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        }

        public static void AudioAttributesCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Throwable th) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(th, "");
        }

        public static void write(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        }

        public static void RemoteActionCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        }

        public static void read(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Size size) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(size, "");
        }

        public static void AudioAttributesCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        }

        public static void read(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Bitmap bitmap) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(bitmap, "");
        }

        public static void IconCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Bitmap bitmap) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
            toMagicModuleMetaRepoModel.write(bitmap, "");
        }

        public static void read(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        }

        public static void IconCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
            toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        }
    }

    void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0);

    @Override // o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
    void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, Throwable p1);

    void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, ExoPlayerBuilderExternalSyntheticLambda21 p1, ExoPlayerBuilderExternalSyntheticLambda4 p2, ExoPlayerBuilderExternalSyntheticLambda17 p3);

    void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0);

    void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, Bitmap p1);

    void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, Object p1);

    @Override // o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
    void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0);

    void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, ExoPlayerBuilderExternalSyntheticLambda21 p1, ExoPlayerBuilderExternalSyntheticLambda4 p2);

    @Override // o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
    void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0, lambdasetRepeatMode3.AudioAttributesCompatParcelizer p1);

    void read(lambdamaybeNotifySurfaceSizeChanged27 p0);

    void read(lambdamaybeNotifySurfaceSizeChanged27 p0, Bitmap p1);

    void read(lambdamaybeNotifySurfaceSizeChanged27 p0, Size p1);

    void read(lambdamaybeNotifySurfaceSizeChanged27 p0, Object p1);

    void read(lambdamaybeNotifySurfaceSizeChanged27 p0, ExoPlayerBuilderExternalSyntheticLambda9<?> p1, ExoPlayerBuilderExternalSyntheticLambda4 p2, ExoPlayerDeviceComponent p3);

    @Override // o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
    void write(lambdamaybeNotifySurfaceSizeChanged27 p0);

    void write(lambdamaybeNotifySurfaceSizeChanged27 p0, ExoPlayerBuilderExternalSyntheticLambda9<?> p1, ExoPlayerBuilderExternalSyntheticLambda4 p2);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/setBandwidthMeter$AudioAttributesCompatParcelizer;", "", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "p0", "Lo/setBandwidthMeter;", "RemoteActionCompatParcelizer", "(Lo/lambdamaybeNotifySurfaceSizeChanged27;)Lo/setBandwidthMeter;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AudioAttributesCompatParcelizer {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.IconCompatParcelizer;
        public static final AudioAttributesCompatParcelizer IconCompatParcelizer = Companion.read(setBandwidthMeter.write);

        setBandwidthMeter RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 p0);

        /* JADX INFO: renamed from: o.setBandwidthMeter$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

            private Companion() {
            }

            @getMagicModuleMeta
            public static AudioAttributesCompatParcelizer read(final setBandwidthMeter setbandwidthmeter) {
                toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
                return new AudioAttributesCompatParcelizer() { // from class: o.buildSimpleExoPlayer
                    @Override // o.setBandwidthMeter.AudioAttributesCompatParcelizer
                    public final setBandwidthMeter RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
                        return setBandwidthMeter.AudioAttributesCompatParcelizer.Companion.RemoteActionCompatParcelizer(setbandwidthmeter, lambdamaybenotifysurfacesizechanged27);
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final setBandwidthMeter RemoteActionCompatParcelizer(setBandwidthMeter setbandwidthmeter, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
                toMagicModuleMetaRepoModel.write(setbandwidthmeter, "");
                toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
                return setbandwidthmeter;
            }
        }
    }

    /* JADX INFO: renamed from: o.setBandwidthMeter$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        private Companion() {
        }
    }

    public static final class IconCompatParcelizer implements setBandwidthMeter {
        IconCompatParcelizer() {
        }

        @Override // kotlin.setBandwidthMeter
        public final void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            DefaultImpls.AudioAttributesCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27);
        }

        @Override // kotlin.setBandwidthMeter, o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Throwable th) {
            DefaultImpls.AudioAttributesCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27, th);
        }

        @Override // kotlin.setBandwidthMeter
        public final void AudioAttributesCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, ExoPlayerBuilderExternalSyntheticLambda17 exoPlayerBuilderExternalSyntheticLambda17) {
            DefaultImpls.AudioAttributesCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27, exoPlayerBuilderExternalSyntheticLambda21, exoPlayerBuilderExternalSyntheticLambda4, exoPlayerBuilderExternalSyntheticLambda17);
        }

        @Override // kotlin.setBandwidthMeter
        public final void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            DefaultImpls.IconCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27);
        }

        @Override // kotlin.setBandwidthMeter
        public final void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Bitmap bitmap) {
            DefaultImpls.IconCompatParcelizer((setBandwidthMeter) this, lambdamaybenotifysurfacesizechanged27, bitmap);
        }

        @Override // kotlin.setBandwidthMeter
        public final void IconCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Object obj) {
            DefaultImpls.IconCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27, obj);
        }

        @Override // kotlin.setBandwidthMeter, o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            DefaultImpls.RemoteActionCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27);
        }

        @Override // kotlin.setBandwidthMeter
        public final void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda21 exoPlayerBuilderExternalSyntheticLambda21, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
            DefaultImpls.RemoteActionCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27, exoPlayerBuilderExternalSyntheticLambda21, exoPlayerBuilderExternalSyntheticLambda4);
        }

        @Override // kotlin.setBandwidthMeter, o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
        public final void RemoteActionCompatParcelizer(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, lambdasetRepeatMode3.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            DefaultImpls.RemoteActionCompatParcelizer(this, lambdamaybenotifysurfacesizechanged27, audioAttributesCompatParcelizer);
        }

        @Override // kotlin.setBandwidthMeter
        public final void read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            DefaultImpls.read(this, lambdamaybenotifysurfacesizechanged27);
        }

        @Override // kotlin.setBandwidthMeter
        public final void read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Bitmap bitmap) {
            DefaultImpls.read((setBandwidthMeter) this, lambdamaybenotifysurfacesizechanged27, bitmap);
        }

        @Override // kotlin.setBandwidthMeter
        public final void read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Size size) {
            DefaultImpls.read((setBandwidthMeter) this, lambdamaybenotifysurfacesizechanged27, size);
        }

        @Override // kotlin.setBandwidthMeter
        public final void read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, Object obj) {
            DefaultImpls.read(this, lambdamaybenotifysurfacesizechanged27, obj);
        }

        @Override // kotlin.setBandwidthMeter
        public final void read(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda9<?> exoPlayerBuilderExternalSyntheticLambda9, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, ExoPlayerDeviceComponent exoPlayerDeviceComponent) {
            DefaultImpls.read(this, lambdamaybenotifysurfacesizechanged27, exoPlayerBuilderExternalSyntheticLambda9, exoPlayerBuilderExternalSyntheticLambda4, exoPlayerDeviceComponent);
        }

        @Override // kotlin.setBandwidthMeter, o.lambdamaybeNotifySurfaceSizeChanged27.RemoteActionCompatParcelizer
        public final void write(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27) {
            DefaultImpls.write(this, lambdamaybenotifysurfacesizechanged27);
        }

        @Override // kotlin.setBandwidthMeter
        public final void write(lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, ExoPlayerBuilderExternalSyntheticLambda9<?> exoPlayerBuilderExternalSyntheticLambda9, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4) {
            DefaultImpls.write(this, lambdamaybenotifysurfacesizechanged27, exoPlayerBuilderExternalSyntheticLambda9, exoPlayerBuilderExternalSyntheticLambda4);
        }
    }
}
