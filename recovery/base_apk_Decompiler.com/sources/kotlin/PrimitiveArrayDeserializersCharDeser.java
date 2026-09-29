package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class PrimitiveArrayDeserializersCharDeser extends NumberDeserializersNumberDeserializer {
    private float MediaBrowserCompatMediaItem;
    private int MediaMetadataCompat = -1;
    private String MediaBrowserCompatSearchResultReceiver = null;
    private int onPrepareFromMediaId = -1;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    private String onAddQueueItem = null;
    private int onPlayFromMediaId = -1;
    private int onMediaButtonEvent = -1;
    private View onFastForward = null;
    float MediaBrowserCompatItemReceiver = 0.1f;
    private boolean MediaDescriptionCompat = true;
    private boolean RatingCompat = true;
    private boolean onCustomAction = true;
    private float onCommand = Float.NaN;
    private boolean onPlay = false;
    int AudioAttributesImplBaseParcelizer = -1;
    int MediaBrowserCompatCustomActionResultReceiver = -1;
    int AudioAttributesImplApi21Parcelizer = -1;
    private RectF AudioAttributesImplApi26Parcelizer = new RectF();
    private RectF onPause = new RectF();
    private HashMap<String, Method> handleMediaPlayPauseIfPendingOnHandler = new HashMap<>();

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void AudioAttributesCompatParcelizer(HashSet<String> hashSet) {
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void read(HashMap<String, NumberDeserializersDoubleDeserializer> map) {
    }

    public PrimitiveArrayDeserializersCharDeser() {
        this.RemoteActionCompatParcelizer = 5;
        this.AudioAttributesCompatParcelizer = new HashMap<>();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final void write(Context context, AttributeSet attributeSet) {
        RemoteActionCompatParcelizer.read(this, context.obtainStyledAttributes(attributeSet, _isBlank.read.KeyTrigger));
    }

    private static void AudioAttributesCompatParcelizer(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(float r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersCharDeser.RemoteActionCompatParcelizer(float, android.view.View):void");
    }

    private void AudioAttributesCompatParcelizer(String str, View view) {
        Method method;
        if (str != null) {
            if (str.startsWith(".")) {
                IconCompatParcelizer(str, view);
                return;
            }
            if (this.handleMediaPlayPauseIfPendingOnHandler.containsKey(str)) {
                method = this.handleMediaPlayPauseIfPendingOnHandler.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.handleMediaPlayPauseIfPendingOnHandler.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.handleMediaPlayPauseIfPendingOnHandler.put(str, null);
                    view.getClass().getSimpleName();
                    NumberDeserializersShortDeserializer.write(view);
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception unused2) {
                view.getClass().getSimpleName();
                NumberDeserializersShortDeserializer.write(view);
            }
        }
    }

    private void IconCompatParcelizer(String str, View view) {
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.AudioAttributesCompatParcelizer.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                StackTraceElementDeserializer stackTraceElementDeserializer = this.AudioAttributesCompatParcelizer.get(str2);
                if (stackTraceElementDeserializer != null) {
                    stackTraceElementDeserializer.RemoteActionCompatParcelizer(view);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class RemoteActionCompatParcelizer {
        private static SparseIntArray IconCompatParcelizer;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            IconCompatParcelizer = sparseIntArray;
            sparseIntArray.append(_isBlank.read.KeyTrigger_framePosition, 8);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_onCross, 4);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_onNegativeCross, 1);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_onPositiveCross, 2);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_motionTarget, 7);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_triggerId, 6);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_triggerSlack, 5);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_motion_triggerOnCollision, 9);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_motion_postLayoutCollision, 10);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_triggerReceiver, 11);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_viewTransitionOnCross, 12);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_viewTransitionOnNegativeCross, 13);
            IconCompatParcelizer.append(_isBlank.read.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void read(PrimitiveArrayDeserializersCharDeser primitiveArrayDeserializersCharDeser, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (IconCompatParcelizer.get(index)) {
                    case 1:
                        primitiveArrayDeserializersCharDeser.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getString(index);
                        break;
                    case 2:
                        primitiveArrayDeserializersCharDeser.onAddQueueItem = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Integer.toHexString(index);
                        IconCompatParcelizer.get(index);
                        break;
                    case 4:
                        primitiveArrayDeserializersCharDeser.MediaBrowserCompatSearchResultReceiver = typedArray.getString(index);
                        break;
                    case 5:
                        primitiveArrayDeserializersCharDeser.MediaBrowserCompatItemReceiver = typedArray.getFloat(index, primitiveArrayDeserializersCharDeser.MediaBrowserCompatItemReceiver);
                        break;
                    case 6:
                        primitiveArrayDeserializersCharDeser.onPlayFromMediaId = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.onPlayFromMediaId);
                        break;
                    case 7:
                        if (MotionLayout.RemoteActionCompatParcelizer) {
                            primitiveArrayDeserializersCharDeser.write = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.write);
                            if (primitiveArrayDeserializersCharDeser.write == -1) {
                                primitiveArrayDeserializersCharDeser.IconCompatParcelizer = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            primitiveArrayDeserializersCharDeser.IconCompatParcelizer = typedArray.getString(index);
                        } else {
                            primitiveArrayDeserializersCharDeser.write = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.write);
                        }
                        break;
                    case 8:
                        primitiveArrayDeserializersCharDeser.read = typedArray.getInteger(index, primitiveArrayDeserializersCharDeser.read);
                        primitiveArrayDeserializersCharDeser.onCommand = (primitiveArrayDeserializersCharDeser.read + 0.5f) / 100.0f;
                        break;
                    case 9:
                        primitiveArrayDeserializersCharDeser.onMediaButtonEvent = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.onMediaButtonEvent);
                        break;
                    case 10:
                        primitiveArrayDeserializersCharDeser.onPlay = typedArray.getBoolean(index, primitiveArrayDeserializersCharDeser.onPlay);
                        break;
                    case 11:
                        primitiveArrayDeserializersCharDeser.onPrepareFromMediaId = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.onPrepareFromMediaId);
                        break;
                    case 12:
                        primitiveArrayDeserializersCharDeser.AudioAttributesImplApi21Parcelizer = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.AudioAttributesImplApi21Parcelizer);
                        break;
                    case 13:
                        primitiveArrayDeserializersCharDeser.AudioAttributesImplBaseParcelizer = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.AudioAttributesImplBaseParcelizer);
                        break;
                    case 14:
                        primitiveArrayDeserializersCharDeser.MediaBrowserCompatCustomActionResultReceiver = typedArray.getResourceId(index, primitiveArrayDeserializersCharDeser.MediaBrowserCompatCustomActionResultReceiver);
                        break;
                }
            }
        }
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    public final NumberDeserializersNumberDeserializer IconCompatParcelizer(NumberDeserializersNumberDeserializer numberDeserializersNumberDeserializer) {
        super.IconCompatParcelizer(numberDeserializersNumberDeserializer);
        PrimitiveArrayDeserializersCharDeser primitiveArrayDeserializersCharDeser = (PrimitiveArrayDeserializersCharDeser) numberDeserializersNumberDeserializer;
        this.MediaMetadataCompat = primitiveArrayDeserializersCharDeser.MediaMetadataCompat;
        this.MediaBrowserCompatSearchResultReceiver = primitiveArrayDeserializersCharDeser.MediaBrowserCompatSearchResultReceiver;
        this.onPrepareFromMediaId = primitiveArrayDeserializersCharDeser.onPrepareFromMediaId;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = primitiveArrayDeserializersCharDeser.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.onAddQueueItem = primitiveArrayDeserializersCharDeser.onAddQueueItem;
        this.onPlayFromMediaId = primitiveArrayDeserializersCharDeser.onPlayFromMediaId;
        this.onMediaButtonEvent = primitiveArrayDeserializersCharDeser.onMediaButtonEvent;
        this.onFastForward = primitiveArrayDeserializersCharDeser.onFastForward;
        this.MediaBrowserCompatItemReceiver = primitiveArrayDeserializersCharDeser.MediaBrowserCompatItemReceiver;
        this.MediaDescriptionCompat = primitiveArrayDeserializersCharDeser.MediaDescriptionCompat;
        this.RatingCompat = primitiveArrayDeserializersCharDeser.RatingCompat;
        this.onCustomAction = primitiveArrayDeserializersCharDeser.onCustomAction;
        this.onCommand = primitiveArrayDeserializersCharDeser.onCommand;
        this.MediaBrowserCompatMediaItem = primitiveArrayDeserializersCharDeser.MediaBrowserCompatMediaItem;
        this.onPlay = primitiveArrayDeserializersCharDeser.onPlay;
        this.AudioAttributesImplApi26Parcelizer = primitiveArrayDeserializersCharDeser.AudioAttributesImplApi26Parcelizer;
        this.onPause = primitiveArrayDeserializersCharDeser.onPause;
        this.handleMediaPlayPauseIfPendingOnHandler = primitiveArrayDeserializersCharDeser.handleMediaPlayPauseIfPendingOnHandler;
        return this;
    }

    @Override // kotlin.NumberDeserializersNumberDeserializer
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final NumberDeserializersNumberDeserializer clone() {
        return new PrimitiveArrayDeserializersCharDeser().IconCompatParcelizer((NumberDeserializersNumberDeserializer) this);
    }
}
