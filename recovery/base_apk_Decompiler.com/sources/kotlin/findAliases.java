package kotlin;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.collectDefaultAnnotations;
import kotlin.findAliases;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

/* JADX INFO: loaded from: classes2.dex */
public abstract class findAliases<T extends findAliases<T>> implements collectDefaultAnnotations.read {
    private static IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private static IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    private static IconCompatParcelizer MediaBrowserCompatItemReceiver;
    private static IconCompatParcelizer MediaBrowserCompatMediaItem;
    private static IconCompatParcelizer MediaMetadataCompat;
    private static IconCompatParcelizer RatingCompat;
    float AudioAttributesCompatParcelizer;
    float AudioAttributesImplApi26Parcelizer;
    float AudioAttributesImplBaseParcelizer;
    final Object IconCompatParcelizer;
    private long MediaBrowserCompatSearchResultReceiver;
    private final ArrayList<write> MediaDescriptionCompat;
    float RemoteActionCompatParcelizer;
    private float handleMediaPlayPauseIfPendingOnHandler;
    private final ArrayList<AudioAttributesCompatParcelizer> onCommand;
    private boolean onCustomAction;
    final collectFromBundle read;
    boolean write;

    public interface AudioAttributesCompatParcelizer {
        void RemoteActionCompatParcelizer(float f);
    }

    public interface write {
        void AudioAttributesCompatParcelizer(boolean z, float f);
    }

    abstract boolean write(float f, float f2);

    abstract boolean write(long j);

    public static abstract class IconCompatParcelizer extends collectFromBundle<View> {
        /* synthetic */ IconCompatParcelizer(String str, byte b) {
            this(str);
        }

        private IconCompatParcelizer(String str) {
            super(str);
        }
    }

    static {
        new IconCompatParcelizer("translationX") { // from class: o.findAliases.3
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return AudioAttributesCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* bridge */ /* synthetic */ void read(View view, float f) {
                read2(view, f);
            }

            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            private static void read2(View view, float f) {
                view.setTranslationX(f);
            }

            private static float AudioAttributesCompatParcelizer(View view) {
                return view.getTranslationX();
            }
        };
        new IconCompatParcelizer("translationY") { // from class: o.findAliases.9
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* bridge */ /* synthetic */ float IconCompatParcelizer(View view) {
                return IconCompatParcelizer2(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                RemoteActionCompatParcelizer(view, f);
            }

            private static void RemoteActionCompatParcelizer(View view, float f) {
                view.setTranslationY(f);
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static float IconCompatParcelizer2(View view) {
                return view.getTranslationY();
            }
        };
        new IconCompatParcelizer("translationZ") { // from class: o.findAliases.8
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return AudioAttributesCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                write(view, f);
            }

            private static void write(View view, float f) {
                InvalidTypeIdException.IconCompatParcelizer(view, f);
            }

            private static float AudioAttributesCompatParcelizer(View view) {
                return InvalidTypeIdException.onPlay(view);
            }
        };
        MediaBrowserCompatMediaItem = new IconCompatParcelizer("scaleX") { // from class: o.findAliases.7
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return AudioAttributesCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                IconCompatParcelizer(view, f);
            }

            private static void IconCompatParcelizer(View view, float f) {
                view.setScaleX(f);
            }

            private static float AudioAttributesCompatParcelizer(View view) {
                return view.getScaleX();
            }
        };
        MediaMetadataCompat = new IconCompatParcelizer("scaleY") { // from class: o.findAliases.13
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return AudioAttributesCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                RemoteActionCompatParcelizer(view, f);
            }

            private static void RemoteActionCompatParcelizer(View view, float f) {
                view.setScaleY(f);
            }

            private static float AudioAttributesCompatParcelizer(View view) {
                return view.getScaleY();
            }
        };
        MediaBrowserCompatItemReceiver = new IconCompatParcelizer("rotation") { // from class: o.findAliases.11
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return read(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                IconCompatParcelizer(view, f);
            }

            private static void IconCompatParcelizer(View view, float f) {
                view.setRotation(f);
            }

            private static float read(View view) {
                return view.getRotation();
            }
        };
        AudioAttributesImplApi21Parcelizer = new IconCompatParcelizer("rotationX") { // from class: o.findAliases.15
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return AudioAttributesCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                write(view, f);
            }

            private static void write(View view, float f) {
                view.setRotationX(f);
            }

            private static float AudioAttributesCompatParcelizer(View view) {
                return view.getRotationX();
            }
        };
        RatingCompat = new IconCompatParcelizer("rotationY") { // from class: o.findAliases.12
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* bridge */ /* synthetic */ float IconCompatParcelizer(View view) {
                return IconCompatParcelizer2(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* bridge */ /* synthetic */ void read(View view, float f) {
                read2(view, f);
            }

            /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
            private static void read2(View view, float f) {
                view.setRotationY(f);
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static float IconCompatParcelizer2(View view) {
                return view.getRotationY();
            }
        };
        new IconCompatParcelizer("x") { // from class: o.findAliases.14
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* bridge */ /* synthetic */ float IconCompatParcelizer(View view) {
                return IconCompatParcelizer2(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                write(view, f);
            }

            private static void write(View view, float f) {
                view.setX(f);
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: avoid collision after fix types in other method */
            private static float IconCompatParcelizer2(View view) {
                return view.getX();
            }
        };
        new IconCompatParcelizer("y") { // from class: o.findAliases.1
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return read(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                RemoteActionCompatParcelizer(view, f);
            }

            private static void RemoteActionCompatParcelizer(View view, float f) {
                view.setY(f);
            }

            private static float read(View view) {
                return view.getY();
            }
        };
        new IconCompatParcelizer(CompressorStreamFactory.Z) { // from class: o.findAliases.4
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return write(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                IconCompatParcelizer(view, f);
            }

            private static void IconCompatParcelizer(View view, float f) {
                InvalidTypeIdException.RemoteActionCompatParcelizer(view, f);
            }

            private static float write(View view) {
                return InvalidTypeIdException.onPlayFromMediaId(view);
            }
        };
        MediaBrowserCompatCustomActionResultReceiver = new IconCompatParcelizer("alpha") { // from class: o.findAliases.5
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return read(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                AudioAttributesCompatParcelizer(view, f);
            }

            private static void AudioAttributesCompatParcelizer(View view, float f) {
                view.setAlpha(f);
            }

            private static float read(View view) {
                return view.getAlpha();
            }
        };
        new IconCompatParcelizer("scrollX") { // from class: o.findAliases.2
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return write(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                AudioAttributesCompatParcelizer(view, f);
            }

            private static void AudioAttributesCompatParcelizer(View view, float f) {
                view.setScrollX((int) f);
            }

            private static float write(View view) {
                return view.getScrollX();
            }
        };
        new IconCompatParcelizer("scrollY") { // from class: o.findAliases.10
            {
                byte b = 0;
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ float IconCompatParcelizer(View view) {
                return RemoteActionCompatParcelizer(view);
            }

            @Override // kotlin.collectFromBundle
            public final /* synthetic */ void read(View view, float f) {
                AudioAttributesCompatParcelizer(view, f);
            }

            private static void AudioAttributesCompatParcelizer(View view, float f) {
                view.setScrollY((int) f);
            }

            private static float RemoteActionCompatParcelizer(View view) {
                return view.getScrollY();
            }
        };
    }

    static class read {
        float IconCompatParcelizer;
        float RemoteActionCompatParcelizer;

        read() {
        }
    }

    findAliases(final collectDefaultFromBundle collectdefaultfrombundle) {
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.onCustomAction = false;
        this.write = false;
        this.AudioAttributesCompatParcelizer = Float.MAX_VALUE;
        this.RemoteActionCompatParcelizer = -3.4028235E38f;
        this.MediaBrowserCompatSearchResultReceiver = 0L;
        this.MediaDescriptionCompat = new ArrayList<>();
        this.onCommand = new ArrayList<>();
        this.IconCompatParcelizer = null;
        this.read = new collectFromBundle("FloatValueHolder") { // from class: o.findAliases.6
            @Override // kotlin.collectFromBundle
            public final float IconCompatParcelizer(Object obj) {
                return collectdefaultfrombundle.getValue();
            }

            @Override // kotlin.collectFromBundle
            public final void read(Object obj, float f) {
                collectdefaultfrombundle.setValue(f);
            }
        };
        this.handleMediaPlayPauseIfPendingOnHandler = 1.0f;
    }

    <K> findAliases(K k, collectFromBundle<K> collectfrombundle) {
        this.AudioAttributesImplApi26Parcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplBaseParcelizer = Float.MAX_VALUE;
        this.onCustomAction = false;
        this.write = false;
        this.AudioAttributesCompatParcelizer = Float.MAX_VALUE;
        this.RemoteActionCompatParcelizer = -3.4028235E38f;
        this.MediaBrowserCompatSearchResultReceiver = 0L;
        this.MediaDescriptionCompat = new ArrayList<>();
        this.onCommand = new ArrayList<>();
        this.IconCompatParcelizer = k;
        this.read = collectfrombundle;
        if (collectfrombundle == MediaBrowserCompatItemReceiver || collectfrombundle == AudioAttributesImplApi21Parcelizer || collectfrombundle == RatingCompat) {
            this.handleMediaPlayPauseIfPendingOnHandler = 0.1f;
            return;
        }
        if (collectfrombundle == MediaBrowserCompatCustomActionResultReceiver) {
            this.handleMediaPlayPauseIfPendingOnHandler = 0.00390625f;
        } else if (collectfrombundle == MediaBrowserCompatMediaItem || collectfrombundle == MediaMetadataCompat) {
            this.handleMediaPlayPauseIfPendingOnHandler = 0.00390625f;
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler = 1.0f;
        }
    }

    public final T AudioAttributesCompatParcelizer(float f) {
        this.AudioAttributesImplBaseParcelizer = f;
        this.onCustomAction = true;
        return this;
    }

    public final T RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
        return this;
    }

    public final T write(float f) {
        this.AudioAttributesCompatParcelizer = f;
        return this;
    }

    public final T read() {
        this.RemoteActionCompatParcelizer = -1.0f;
        return this;
    }

    public final T write(write writeVar) {
        if (!this.MediaDescriptionCompat.contains(writeVar)) {
            this.MediaDescriptionCompat.add(writeVar);
        }
        return this;
    }

    public final T write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (AudioAttributesCompatParcelizer()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.onCommand.contains(audioAttributesCompatParcelizer)) {
            this.onCommand.add(audioAttributesCompatParcelizer);
        }
        return this;
    }

    public final T IconCompatParcelizer() {
        this.handleMediaPlayPauseIfPendingOnHandler = 4.0f;
        return this;
    }

    private static <T> void AudioAttributesCompatParcelizer(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void write() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.write) {
            return;
        }
        MediaBrowserCompatItemReceiver();
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.write;
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.write) {
            return;
        }
        this.write = true;
        if (!this.onCustomAction) {
            this.AudioAttributesImplBaseParcelizer = AudioAttributesImplApi21Parcelizer();
        }
        float f = this.AudioAttributesImplBaseParcelizer;
        if (f > this.AudioAttributesCompatParcelizer || f < this.RemoteActionCompatParcelizer) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        collectDefaultAnnotations.RemoteActionCompatParcelizer().read(this);
    }

    @Override // o.collectDefaultAnnotations.read
    public final boolean AudioAttributesCompatParcelizer(long j) {
        long j2 = this.MediaBrowserCompatSearchResultReceiver;
        if (j2 == 0) {
            this.MediaBrowserCompatSearchResultReceiver = j;
            IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            return false;
        }
        this.MediaBrowserCompatSearchResultReceiver = j;
        boolean zWrite = write(j - j2);
        float fMin = Math.min(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = fMin;
        float fMax = Math.max(fMin, this.RemoteActionCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = fMax;
        IconCompatParcelizer(fMax);
        if (zWrite) {
            AudioAttributesImplApi26Parcelizer();
        }
        return zWrite;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.write = false;
        collectDefaultAnnotations.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this);
        this.MediaBrowserCompatSearchResultReceiver = 0L;
        this.onCustomAction = false;
        for (int i = 0; i < this.MediaDescriptionCompat.size(); i++) {
            if (this.MediaDescriptionCompat.get(i) != null) {
                this.MediaDescriptionCompat.get(i).AudioAttributesCompatParcelizer(false, this.AudioAttributesImplBaseParcelizer);
            }
        }
        AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
    }

    private void IconCompatParcelizer(float f) {
        this.read.read(this.IconCompatParcelizer, f);
        for (int i = 0; i < this.onCommand.size(); i++) {
            if (this.onCommand.get(i) != null) {
                this.onCommand.get(i).RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
            }
        }
        AudioAttributesCompatParcelizer(this.onCommand);
    }

    final float RemoteActionCompatParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler * 0.75f;
    }

    private float AudioAttributesImplApi21Parcelizer() {
        return this.read.IconCompatParcelizer(this.IconCompatParcelizer);
    }
}
