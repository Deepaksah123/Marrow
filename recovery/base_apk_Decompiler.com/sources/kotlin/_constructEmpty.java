package kotlin;

import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.ReferenceTypeDeserializer;

/* JADX INFO: loaded from: classes2.dex */
final class _constructEmpty implements Comparable<_constructEmpty> {
    private EnumMapDeserializer AudioAttributesImplApi26Parcelizer;
    private float handleMediaPlayPauseIfPendingOnHandler;
    int read;
    private float AudioAttributesCompatParcelizer = 1.0f;
    int write = 0;
    private boolean RemoteActionCompatParcelizer = false;
    private float MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    private float onCustomAction = BitmapDescriptorFactory.HUE_RED;
    private float onAddQueueItem = BitmapDescriptorFactory.HUE_RED;
    private float onCommand = BitmapDescriptorFactory.HUE_RED;
    private float onPlayFromMediaId = 1.0f;
    private float onMediaButtonEvent = 1.0f;
    private float RatingCompat = Float.NaN;
    private float MediaBrowserCompatMediaItem = Float.NaN;
    private float onFastForward = BitmapDescriptorFactory.HUE_RED;
    private float onPlay = BitmapDescriptorFactory.HUE_RED;
    private float onPause = BitmapDescriptorFactory.HUE_RED;
    private int MediaBrowserCompatItemReceiver = 0;
    private float MediaDescriptionCompat = Float.NaN;
    private float MediaMetadataCompat = Float.NaN;
    private int AudioAttributesImplApi21Parcelizer = -1;
    private LinkedHashMap<String, StackTraceElementDeserializer> IconCompatParcelizer = new LinkedHashMap<>();
    private int AudioAttributesImplBaseParcelizer = 0;
    private double[] MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new double[18];
    private double[] MediaBrowserCompatSearchResultReceiver = new double[18];

    static {
        new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    private static boolean read(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    final void RemoteActionCompatParcelizer(_constructEmpty _constructempty, HashSet<String> hashSet) {
        if (read(this.AudioAttributesCompatParcelizer, _constructempty.AudioAttributesCompatParcelizer)) {
            hashSet.add("alpha");
        }
        if (read(this.MediaBrowserCompatCustomActionResultReceiver, _constructempty.MediaBrowserCompatCustomActionResultReceiver)) {
            hashSet.add("elevation");
        }
        int i = this.read;
        int i2 = _constructempty.read;
        if (i != i2 && this.write == 0 && (i == 0 || i2 == 0)) {
            hashSet.add("alpha");
        }
        if (read(this.onCustomAction, _constructempty.onCustomAction)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.MediaDescriptionCompat) || !Float.isNaN(_constructempty.MediaDescriptionCompat)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.MediaMetadataCompat) || !Float.isNaN(_constructempty.MediaMetadataCompat)) {
            hashSet.add("progress");
        }
        if (read(this.onAddQueueItem, _constructempty.onAddQueueItem)) {
            hashSet.add("rotationX");
        }
        if (read(this.onCommand, _constructempty.onCommand)) {
            hashSet.add("rotationY");
        }
        if (read(this.RatingCompat, _constructempty.RatingCompat)) {
            hashSet.add("transformPivotX");
        }
        if (read(this.MediaBrowserCompatMediaItem, _constructempty.MediaBrowserCompatMediaItem)) {
            hashSet.add("transformPivotY");
        }
        if (read(this.onPlayFromMediaId, _constructempty.onPlayFromMediaId)) {
            hashSet.add("scaleX");
        }
        if (read(this.onMediaButtonEvent, _constructempty.onMediaButtonEvent)) {
            hashSet.add("scaleY");
        }
        if (read(this.onFastForward, _constructempty.onFastForward)) {
            hashSet.add("translationX");
        }
        if (read(this.onPlay, _constructempty.onPlay)) {
            hashSet.add("translationY");
        }
        if (read(this.onPause, _constructempty.onPause)) {
            hashSet.add("translationZ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public int compareTo(_constructEmpty _constructempty) {
        return Float.compare(this.handleMediaPlayPauseIfPendingOnHandler, _constructempty.handleMediaPlayPauseIfPendingOnHandler);
    }

    private void RemoteActionCompatParcelizer(View view) {
        this.read = view.getVisibility();
        this.AudioAttributesCompatParcelizer = view.getVisibility() != 0 ? BitmapDescriptorFactory.HUE_RED : view.getAlpha();
        this.RemoteActionCompatParcelizer = false;
        this.MediaBrowserCompatCustomActionResultReceiver = view.getElevation();
        this.onCustomAction = view.getRotation();
        this.onAddQueueItem = view.getRotationX();
        this.onCommand = view.getRotationY();
        this.onPlayFromMediaId = view.getScaleX();
        this.onMediaButtonEvent = view.getScaleY();
        this.RatingCompat = view.getPivotX();
        this.MediaBrowserCompatMediaItem = view.getPivotY();
        this.onFastForward = view.getTranslationX();
        this.onPlay = view.getTranslationY();
        this.onPause = view.getTranslationZ();
    }

    private void IconCompatParcelizer(ReferenceTypeDeserializer.write writeVar) {
        this.write = writeVar.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
        this.read = writeVar.AudioAttributesImplApi26Parcelizer.read;
        this.AudioAttributesCompatParcelizer = (writeVar.AudioAttributesImplApi26Parcelizer.read == 0 || this.write != 0) ? writeVar.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer : BitmapDescriptorFactory.HUE_RED;
        this.RemoteActionCompatParcelizer = writeVar.MediaBrowserCompatCustomActionResultReceiver.write;
        this.MediaBrowserCompatCustomActionResultReceiver = writeVar.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        this.onCustomAction = writeVar.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        this.onAddQueueItem = writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer;
        this.onCommand = writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer;
        this.onPlayFromMediaId = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver;
        this.onMediaButtonEvent = writeVar.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer;
        this.RatingCompat = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver;
        this.MediaBrowserCompatMediaItem = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem;
        this.onFastForward = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat;
        this.onPlay = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat;
        this.onPause = writeVar.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver;
        this.AudioAttributesImplApi26Parcelizer = EnumMapDeserializer.IconCompatParcelizer(writeVar.AudioAttributesImplBaseParcelizer.MediaDescriptionCompat);
        this.MediaDescriptionCompat = writeVar.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer;
        this.MediaBrowserCompatItemReceiver = writeVar.AudioAttributesImplBaseParcelizer.read;
        this.AudioAttributesImplApi21Parcelizer = writeVar.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer;
        this.MediaMetadataCompat = writeVar.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        for (String str : writeVar.read.keySet()) {
            StackTraceElementDeserializer stackTraceElementDeserializer = writeVar.read.get(str);
            if (stackTraceElementDeserializer.IconCompatParcelizer()) {
                this.IconCompatParcelizer.put(str, stackTraceElementDeserializer);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(java.util.HashMap<java.lang.String, kotlin.NumberDeserializersDoubleDeserializer> r8, int r9) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._constructEmpty.AudioAttributesCompatParcelizer(java.util.HashMap, int):void");
    }

    public final void write(View view) {
        view.getX();
        view.getY();
        view.getWidth();
        view.getHeight();
        RemoteActionCompatParcelizer(view);
    }

    public final void IconCompatParcelizer(Rect rect, View view, int i, float f) {
        int i2 = rect.left;
        int i3 = rect.top;
        rect.width();
        rect.height();
        RemoteActionCompatParcelizer(view);
        this.RatingCompat = Float.NaN;
        this.MediaBrowserCompatMediaItem = Float.NaN;
        if (i == 1) {
            this.onCustomAction = f - 90.0f;
        } else {
            if (i != 2) {
                return;
            }
            this.onCustomAction = f + 90.0f;
        }
    }

    public final void RemoteActionCompatParcelizer(Rect rect, ReferenceTypeDeserializer referenceTypeDeserializer, int i, int i2) {
        int i3 = rect.left;
        int i4 = rect.top;
        rect.width();
        rect.height();
        IconCompatParcelizer(referenceTypeDeserializer.IconCompatParcelizer(i2));
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.onCustomAction + 90.0f;
            this.onCustomAction = f;
            if (f > 180.0f) {
                this.onCustomAction = f - 360.0f;
                return;
            }
            return;
        }
        this.onCustomAction -= 90.0f;
    }
}
