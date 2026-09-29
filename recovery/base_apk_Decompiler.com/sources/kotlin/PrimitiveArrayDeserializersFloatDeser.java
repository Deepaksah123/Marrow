package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.ResponseError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin._isBlank;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class PrimitiveArrayDeserializersFloatDeser {
    private float MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private MotionEvent RatingCompat;
    public final constructValue RemoteActionCompatParcelizer;
    private final MotionLayout handleMediaPlayPauseIfPendingOnHandler;
    private boolean onCommand;
    private MotionLayout.write onFastForward;
    public _convertIfNonNull read = null;
    public AudioAttributesCompatParcelizer write = null;
    private boolean MediaDescriptionCompat = false;
    private ArrayList<AudioAttributesCompatParcelizer> onAddQueueItem = new ArrayList<>();
    private AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer = null;
    private ArrayList<AudioAttributesCompatParcelizer> IconCompatParcelizer = new ArrayList<>();
    private SparseArray<ReferenceTypeDeserializer> AudioAttributesImplApi26Parcelizer = new SparseArray<>();
    private HashMap<String, Integer> MediaBrowserCompatItemReceiver = new HashMap<>();
    private SparseIntArray AudioAttributesImplApi21Parcelizer = new SparseIntArray();
    private boolean AudioAttributesCompatParcelizer = false;
    private int MediaBrowserCompatCustomActionResultReceiver = ResponseError.NO_INTERNET_ERROR;
    private int onCustomAction = 0;
    private boolean MediaMetadataCompat = false;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void RemoteActionCompatParcelizer(int r7, int r8) {
        /*
            r6 = this;
            o._convertIfNonNull r0 = r6.read
            r1 = -1
            if (r0 == 0) goto L15
            int r0 = r0.read(r7, r1, r1)
            if (r0 != r1) goto Lc
            r0 = r7
        Lc:
            o._convertIfNonNull r2 = r6.read
            int r2 = r2.read(r8, r1, r1)
            if (r2 == r1) goto L16
            goto L17
        L15:
            r0 = r7
        L16:
            r2 = r8
        L17:
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r3 = r6.write
            if (r3 == 0) goto L29
            int r3 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.read(r3)
            if (r3 != r8) goto L29
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r3 = r6.write
            int r3 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.write(r3)
            if (r3 == r7) goto L68
        L29:
            java.util.ArrayList<o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer> r3 = r6.onAddQueueItem
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L69
            java.lang.Object r4 = r3.next()
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r4 = (o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer) r4
            int r5 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.read(r4)
            if (r5 != r2) goto L47
            int r5 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.write(r4)
            if (r5 == r0) goto L53
        L47:
            int r5 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.read(r4)
            if (r5 != r8) goto L2f
            int r5 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.write(r4)
            if (r5 != r7) goto L2f
        L53:
            r6.write = r4
            if (r4 == 0) goto L68
            o.PrimitiveArrayDeserializersShortDeser r7 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(r4)
            if (r7 == 0) goto L68
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r7 = r6.write
            o.PrimitiveArrayDeserializersShortDeser r7 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(r7)
            boolean r6 = r6.onCommand
            r7.IconCompatParcelizer(r6)
        L68:
            return
        L69:
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r7 = r6.AudioAttributesImplBaseParcelizer
            java.util.ArrayList<o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer> r3 = r6.IconCompatParcelizer
            java.util.Iterator r3 = r3.iterator()
        L71:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r3.next()
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r4 = (o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer) r4
            int r5 = o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.read(r4)
            if (r5 != r8) goto L71
            r7 = r4
            goto L71
        L85:
            o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer r8 = new o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer
            r8.<init>(r6, r7)
            o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r8, r0)
            o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(r8, r2)
            if (r0 == r1) goto L97
            java.util.ArrayList<o.PrimitiveArrayDeserializersFloatDeser$AudioAttributesCompatParcelizer> r7 = r6.onAddQueueItem
            r7.add(r8)
        L97:
            r6.write = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(int, int):void");
    }

    public final void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.write = audioAttributesCompatParcelizer;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return;
        }
        this.write.onAddQueueItem.IconCompatParcelizer(this.onCommand);
    }

    private int read(int i) {
        int i2;
        _convertIfNonNull _convertifnonnull = this.read;
        return (_convertifnonnull == null || (i2 = _convertifnonnull.read(i, -1, -1)) == -1) ? i : i2;
    }

    private List<AudioAttributesCompatParcelizer> MediaBrowserCompatItemReceiver(int i) {
        int i2 = read(i);
        ArrayList arrayList = new ArrayList();
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.onAddQueueItem) {
            if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer == i2 || audioAttributesCompatParcelizer.read == i2) {
                arrayList.add(audioAttributesCompatParcelizer);
            }
        }
        return arrayList;
    }

    public final void write(MotionLayout motionLayout, int i) {
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.onAddQueueItem) {
            if (audioAttributesCompatParcelizer.RatingCompat.size() > 0) {
                Iterator it = audioAttributesCompatParcelizer.RatingCompat.iterator();
                while (it.hasNext()) {
                    ((AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) it.next()).IconCompatParcelizer(motionLayout);
                }
            }
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : this.IconCompatParcelizer) {
            if (audioAttributesCompatParcelizer2.RatingCompat.size() > 0) {
                Iterator it2 = audioAttributesCompatParcelizer2.RatingCompat.iterator();
                while (it2.hasNext()) {
                    ((AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) it2.next()).IconCompatParcelizer(motionLayout);
                }
            }
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer3 : this.onAddQueueItem) {
            if (audioAttributesCompatParcelizer3.RatingCompat.size() > 0) {
                Iterator it3 = audioAttributesCompatParcelizer3.RatingCompat.iterator();
                while (it3.hasNext()) {
                    ((AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) it3.next()).IconCompatParcelizer(motionLayout, i, audioAttributesCompatParcelizer3);
                }
            }
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer4 : this.IconCompatParcelizer) {
            if (audioAttributesCompatParcelizer4.RatingCompat.size() > 0) {
                Iterator it4 = audioAttributesCompatParcelizer4.RatingCompat.iterator();
                while (it4.hasNext()) {
                    ((AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer) it4.next()).IconCompatParcelizer(motionLayout, i, audioAttributesCompatParcelizer4);
                }
            }
        }
    }

    private AudioAttributesCompatParcelizer RemoteActionCompatParcelizer(int i, float f, float f2, MotionEvent motionEvent) {
        if (i != -1) {
            List<AudioAttributesCompatParcelizer> listMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(i);
            RectF rectF = new RectF();
            float f3 = BitmapDescriptorFactory.HUE_RED;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = null;
            for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : listMediaBrowserCompatItemReceiver) {
                if (!audioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer && audioAttributesCompatParcelizer2.onAddQueueItem != null) {
                    audioAttributesCompatParcelizer2.onAddQueueItem.IconCompatParcelizer(this.onCommand);
                    RectF rectFAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2.onAddQueueItem.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, rectF);
                    if (rectFAudioAttributesCompatParcelizer == null || motionEvent == null || rectFAudioAttributesCompatParcelizer.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF rectFRemoteActionCompatParcelizer = audioAttributesCompatParcelizer2.onAddQueueItem.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, rectF);
                        if (rectFRemoteActionCompatParcelizer == null || motionEvent == null || rectFRemoteActionCompatParcelizer.contains(motionEvent.getX(), motionEvent.getY())) {
                            float fAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer2.onAddQueueItem.AudioAttributesCompatParcelizer(f, f2);
                            if (audioAttributesCompatParcelizer2.onAddQueueItem.IconCompatParcelizer && motionEvent != null) {
                                fAudioAttributesCompatParcelizer = ((float) (Math.atan2(f2 + r6, f + r5) - Math.atan2(motionEvent.getX() - audioAttributesCompatParcelizer2.onAddQueueItem.RemoteActionCompatParcelizer, motionEvent.getY() - audioAttributesCompatParcelizer2.onAddQueueItem.write))) * 10.0f;
                            }
                            float f4 = fAudioAttributesCompatParcelizer * (audioAttributesCompatParcelizer2.read == i ? -1.0f : 1.1f);
                            if (f4 > f3) {
                                audioAttributesCompatParcelizer = audioAttributesCompatParcelizer2;
                                f3 = f4;
                            }
                        }
                    }
                }
            }
            return audioAttributesCompatParcelizer;
        }
        return this.write;
    }

    public final ArrayList<AudioAttributesCompatParcelizer> IconCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final AudioAttributesCompatParcelizer write(int i) {
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : this.onAddQueueItem) {
            if (audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer == i) {
                return audioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    public final int[] read() {
        int size = this.AudioAttributesImplApi26Parcelizer.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.AudioAttributesImplApi26Parcelizer.keyAt(i);
        }
        return iArr;
    }

    public final boolean AudioAttributesCompatParcelizer(MotionLayout motionLayout, int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            return false;
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 : this.onAddQueueItem) {
            if (audioAttributesCompatParcelizer2.write != 0 && ((audioAttributesCompatParcelizer = this.write) != audioAttributesCompatParcelizer2 || !audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(2))) {
                if (i == audioAttributesCompatParcelizer2.RemoteActionCompatParcelizer && (audioAttributesCompatParcelizer2.write == 4 || audioAttributesCompatParcelizer2.write == 2)) {
                    motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                    motionLayout.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer2);
                    if (audioAttributesCompatParcelizer2.write == 4) {
                        motionLayout.MediaMetadataCompat();
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.SETUP);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.RemoteActionCompatParcelizer(true);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.SETUP);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.MOVING);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                        motionLayout.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    return true;
                }
                if (i == audioAttributesCompatParcelizer2.read && (audioAttributesCompatParcelizer2.write == 3 || audioAttributesCompatParcelizer2.write == 1)) {
                    motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                    motionLayout.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer2);
                    if (audioAttributesCompatParcelizer2.write == 3) {
                        motionLayout.MediaBrowserCompatSearchResultReceiver();
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.SETUP);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.MOVING);
                    } else {
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                        motionLayout.RemoteActionCompatParcelizer(true);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.SETUP);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.MOVING);
                        motionLayout.write(MotionLayout.AudioAttributesImplApi21Parcelizer.FINISHED);
                        motionLayout.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onFastForward != null;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onCommand = z;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return;
        }
        this.write.onAddQueueItem.IconCompatParcelizer(this.onCommand);
    }

    public final void read(int i, View... viewArr) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i, viewArr);
    }

    public final boolean RemoteActionCompatParcelizer(int i, handleSingleElementUnwrapped handlesingleelementunwrapped) {
        return this.RemoteActionCompatParcelizer.write(i, handlesingleelementunwrapped);
    }

    public static class AudioAttributesCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private String MediaBrowserCompatItemReceiver;
        private final PrimitiveArrayDeserializersFloatDeser MediaBrowserCompatMediaItem;
        private int MediaBrowserCompatSearchResultReceiver;
        private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        private int MediaDescriptionCompat;
        private ArrayList<ObjectArrayDeserializer> MediaMetadataCompat;
        private ArrayList<RemoteActionCompatParcelizer> RatingCompat;
        private int RemoteActionCompatParcelizer;
        private PrimitiveArrayDeserializersShortDeser onAddQueueItem;
        private float onCustomAction;
        private int read;
        private int write;

        public final int AudioAttributesCompatParcelizer() {
            return this.MediaBrowserCompatSearchResultReceiver;
        }

        public final void AudioAttributesCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
            this.RatingCompat.add(new RemoteActionCompatParcelizer(context, this, xmlPullParser));
        }

        public final int IconCompatParcelizer() {
            return this.write;
        }

        public final int write() {
            return this.read;
        }

        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final void write(int i) {
            this.MediaBrowserCompatCustomActionResultReceiver = Math.max(i, 8);
        }

        public final void RemoteActionCompatParcelizer(ObjectArrayDeserializer objectArrayDeserializer) {
            this.MediaMetadataCompat.add(objectArrayDeserializer);
        }

        public final PrimitiveArrayDeserializersShortDeser RemoteActionCompatParcelizer() {
            return this.onAddQueueItem;
        }

        public final void RemoteActionCompatParcelizer(int i) {
            this.MediaDescriptionCompat = i;
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return !this.AudioAttributesImplApi21Parcelizer;
        }

        public final void write(boolean z) {
            this.AudioAttributesImplApi21Parcelizer = !z;
        }

        public final boolean AudioAttributesCompatParcelizer(int i) {
            return (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver & i) != 0;
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            PrimitiveArrayDeserializersShortDeser primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer != null) {
                primitiveArrayDeserializersShortDeserRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(5);
            }
        }

        public static class RemoteActionCompatParcelizer implements View.OnClickListener {
            private final AudioAttributesCompatParcelizer IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private int write;

            public RemoteActionCompatParcelizer(Context context, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, XmlPullParser xmlPullParser) {
                this.RemoteActionCompatParcelizer = -1;
                this.write = 17;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == _isBlank.read.OnClick_targetId) {
                        this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.RemoteActionCompatParcelizer);
                    } else if (index == _isBlank.read.OnClick_clickAction) {
                        this.write = typedArrayObtainStyledAttributes.getInt(index, this.write);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public final void IconCompatParcelizer(MotionLayout motionLayout, int i, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
                int i2 = this.RemoteActionCompatParcelizer;
                View viewFindViewById = motionLayout;
                if (i2 != -1) {
                    viewFindViewById = motionLayout.findViewById(i2);
                }
                if (viewFindViewById == null) {
                    return;
                }
                int i3 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                int i4 = audioAttributesCompatParcelizer.read;
                if (i3 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.write;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = i6 != 0 && i == i3;
                boolean z3 = (i5 & 256) != 0 && i == i3;
                boolean z4 = i6 != 0 && i == i3;
                boolean z5 = (i5 & 16) != 0 && i == i4;
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if ((z2 | z3 | z4 | z5) || z) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            public final void IconCompatParcelizer(MotionLayout motionLayout) {
                View viewFindViewById;
                int i = this.RemoteActionCompatParcelizer;
                if (i == -1 || (viewFindViewById = motionLayout.findViewById(i)) == null) {
                    return;
                }
                viewFindViewById.setOnClickListener(null);
            }

            private boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, MotionLayout motionLayout) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.IconCompatParcelizer;
                if (audioAttributesCompatParcelizer2 == audioAttributesCompatParcelizer) {
                    return true;
                }
                int i = audioAttributesCompatParcelizer2.read;
                int i2 = this.IconCompatParcelizer.RemoteActionCompatParcelizer;
                return i2 == -1 ? motionLayout.AudioAttributesCompatParcelizer != i : motionLayout.AudioAttributesCompatParcelizer == i2 || motionLayout.AudioAttributesCompatParcelizer == i;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
            /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r7) {
                /*
                    Method dump skipped, instruction units count: 227
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.onClick(android.view.View):void");
            }
        }

        AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser, AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.AudioAttributesImplBaseParcelizer = false;
            this.read = -1;
            this.RemoteActionCompatParcelizer = -1;
            this.AudioAttributesCompatParcelizer = 0;
            this.MediaBrowserCompatItemReceiver = null;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = ResponseError.NO_INTERNET_ERROR;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.MediaMetadataCompat = new ArrayList<>();
            this.onAddQueueItem = null;
            this.RatingCompat = new ArrayList<>();
            this.write = 0;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
            this.MediaBrowserCompatMediaItem = primitiveArrayDeserializersFloatDeser;
            this.MediaBrowserCompatCustomActionResultReceiver = primitiveArrayDeserializersFloatDeser.MediaBrowserCompatCustomActionResultReceiver;
            if (audioAttributesCompatParcelizer != null) {
                this.MediaDescriptionCompat = audioAttributesCompatParcelizer.MediaDescriptionCompat;
                this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                this.MediaBrowserCompatItemReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                this.IconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer;
                this.MediaBrowserCompatCustomActionResultReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
                this.MediaMetadataCompat = audioAttributesCompatParcelizer.MediaMetadataCompat;
                this.onCustomAction = audioAttributesCompatParcelizer.onCustomAction;
                this.MediaBrowserCompatSearchResultReceiver = audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
            }
        }

        public AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser, int i, int i2) {
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.AudioAttributesImplBaseParcelizer = false;
            this.read = -1;
            this.RemoteActionCompatParcelizer = -1;
            this.AudioAttributesCompatParcelizer = 0;
            this.MediaBrowserCompatItemReceiver = null;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = ResponseError.NO_INTERNET_ERROR;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.MediaMetadataCompat = new ArrayList<>();
            this.onAddQueueItem = null;
            this.RatingCompat = new ArrayList<>();
            this.write = 0;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.MediaBrowserCompatMediaItem = primitiveArrayDeserializersFloatDeser;
            this.RemoteActionCompatParcelizer = i;
            this.read = i2;
            this.MediaBrowserCompatCustomActionResultReceiver = primitiveArrayDeserializersFloatDeser.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = primitiveArrayDeserializersFloatDeser.onCustomAction;
        }

        AudioAttributesCompatParcelizer(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser, Context context, XmlPullParser xmlPullParser) {
            this.AudioAttributesImplApi26Parcelizer = -1;
            this.AudioAttributesImplBaseParcelizer = false;
            this.read = -1;
            this.RemoteActionCompatParcelizer = -1;
            this.AudioAttributesCompatParcelizer = 0;
            this.MediaBrowserCompatItemReceiver = null;
            this.IconCompatParcelizer = -1;
            this.MediaBrowserCompatCustomActionResultReceiver = ResponseError.NO_INTERNET_ERROR;
            this.onCustomAction = BitmapDescriptorFactory.HUE_RED;
            this.MediaMetadataCompat = new ArrayList<>();
            this.onAddQueueItem = null;
            this.RatingCompat = new ArrayList<>();
            this.write = 0;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompatSearchResultReceiver = 0;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
            this.MediaBrowserCompatCustomActionResultReceiver = primitiveArrayDeserializersFloatDeser.MediaBrowserCompatCustomActionResultReceiver;
            this.MediaBrowserCompatSearchResultReceiver = primitiveArrayDeserializersFloatDeser.onCustomAction;
            this.MediaBrowserCompatMediaItem = primitiveArrayDeserializersFloatDeser;
            write(primitiveArrayDeserializersFloatDeser, context, Xml.asAttributeSet(xmlPullParser));
        }

        public final void read(int i, String str, int i2) {
            this.AudioAttributesCompatParcelizer = i;
            this.MediaBrowserCompatItemReceiver = str;
            this.IconCompatParcelizer = i2;
        }

        private void write(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.Transition);
            read(primitiveArrayDeserializersFloatDeser, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        private void read(PrimitiveArrayDeserializersFloatDeser primitiveArrayDeserializersFloatDeser, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == _isBlank.read.Transition_constraintSetEnd) {
                    this.read = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.read);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
                        referenceTypeDeserializer.read(context, this.read);
                        primitiveArrayDeserializersFloatDeser.AudioAttributesImplApi26Parcelizer.append(this.read, referenceTypeDeserializer);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.read = primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(context, this.read);
                    }
                } else if (index == _isBlank.read.Transition_constraintSetStart) {
                    this.RemoteActionCompatParcelizer = typedArray.getResourceId(index, this.RemoteActionCompatParcelizer);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.RemoteActionCompatParcelizer);
                    if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName2)) {
                        ReferenceTypeDeserializer referenceTypeDeserializer2 = new ReferenceTypeDeserializer();
                        referenceTypeDeserializer2.read(context, this.RemoteActionCompatParcelizer);
                        primitiveArrayDeserializersFloatDeser.AudioAttributesImplApi26Parcelizer.append(this.RemoteActionCompatParcelizer, referenceTypeDeserializer2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.RemoteActionCompatParcelizer = primitiveArrayDeserializersFloatDeser.RemoteActionCompatParcelizer(context, this.RemoteActionCompatParcelizer);
                    }
                } else if (index == _isBlank.read.Transition_motionInterpolator) {
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.IconCompatParcelizer = resourceId;
                        if (resourceId != -1) {
                            this.AudioAttributesCompatParcelizer = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        String string = typedArray.getString(index);
                        this.MediaBrowserCompatItemReceiver = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.IconCompatParcelizer = typedArray.getResourceId(index, -1);
                                this.AudioAttributesCompatParcelizer = -2;
                            } else {
                                this.AudioAttributesCompatParcelizer = -1;
                            }
                        }
                    } else {
                        this.AudioAttributesCompatParcelizer = typedArray.getInteger(index, this.AudioAttributesCompatParcelizer);
                    }
                } else if (index == _isBlank.read.Transition_duration) {
                    int i2 = typedArray.getInt(index, this.MediaBrowserCompatCustomActionResultReceiver);
                    this.MediaBrowserCompatCustomActionResultReceiver = i2;
                    if (i2 < 8) {
                        this.MediaBrowserCompatCustomActionResultReceiver = 8;
                    }
                } else if (index == _isBlank.read.Transition_staggered) {
                    this.onCustomAction = typedArray.getFloat(index, this.onCustomAction);
                } else if (index == _isBlank.read.Transition_autoTransition) {
                    this.write = typedArray.getInteger(index, this.write);
                } else if (index == _isBlank.read.Transition_android_id) {
                    this.AudioAttributesImplApi26Parcelizer = typedArray.getResourceId(index, this.AudioAttributesImplApi26Parcelizer);
                } else if (index == _isBlank.read.Transition_transitionDisable) {
                    this.AudioAttributesImplApi21Parcelizer = typedArray.getBoolean(index, this.AudioAttributesImplApi21Parcelizer);
                } else if (index == _isBlank.read.Transition_pathMotionArc) {
                    this.MediaDescriptionCompat = typedArray.getInteger(index, -1);
                } else if (index == _isBlank.read.Transition_layoutDuringTransition) {
                    this.MediaBrowserCompatSearchResultReceiver = typedArray.getInteger(index, 0);
                } else if (index == _isBlank.read.Transition_transitionFlags) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArray.getInteger(index, 0);
                }
            }
            if (this.RemoteActionCompatParcelizer == -1) {
                this.AudioAttributesImplBaseParcelizer = true;
            }
        }
    }

    public PrimitiveArrayDeserializersFloatDeser(Context context, MotionLayout motionLayout, int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = motionLayout;
        this.RemoteActionCompatParcelizer = new constructValue(motionLayout);
        write(context, i);
        this.AudioAttributesImplApi26Parcelizer.put(_isBlank.write.motion_base, new ReferenceTypeDeserializer());
        this.MediaBrowserCompatItemReceiver.put("motion_base", Integer.valueOf(_isBlank.write.motion_base));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(android.content.Context r8, int r9) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersFloatDeser.write(android.content.Context, int):void");
    }

    private void write(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == _isBlank.read.MotionScene_defaultDuration) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.MediaBrowserCompatCustomActionResultReceiver);
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
                if (i2 < 8) {
                    this.MediaBrowserCompatCustomActionResultReceiver = 8;
                }
            } else if (index == _isBlank.read.MotionScene_layoutDuringTransition) {
                this.onCustomAction = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private int read(Context context, String str) {
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        return (identifier != -1 || str == null || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    private void IconCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), _isBlank.read.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == _isBlank.read.include_constraintSet) {
                RemoteActionCompatParcelizer(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int RemoteActionCompatParcelizer(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return AudioAttributesCompatParcelizer(context, xml);
                }
            }
            return -1;
        } catch (IOException e) {
            e.printStackTrace();
            return -1;
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int AudioAttributesCompatParcelizer(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PrimitiveArrayDeserializersFloatDeser.AudioAttributesCompatParcelizer(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    public final ReferenceTypeDeserializer RemoteActionCompatParcelizer(int i) {
        return AudioAttributesImplApi26Parcelizer(i);
    }

    private ReferenceTypeDeserializer AudioAttributesImplApi26Parcelizer(int i) {
        int i2;
        _convertIfNonNull _convertifnonnull = this.read;
        if (_convertifnonnull != null && (i2 = _convertifnonnull.read(i, -1, -1)) != -1) {
            i = i2;
        }
        if (this.AudioAttributesImplApi26Parcelizer.get(i) == null) {
            NumberDeserializersShortDeserializer.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), i);
            SparseArray<ReferenceTypeDeserializer> sparseArray = this.AudioAttributesImplApi26Parcelizer;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.AudioAttributesImplApi26Parcelizer.get(i);
    }

    public final void read(int i, ReferenceTypeDeserializer referenceTypeDeserializer) {
        this.AudioAttributesImplApi26Parcelizer.put(i, referenceTypeDeserializer);
    }

    public final void write(handleSingleElementUnwrapped handlesingleelementunwrapped) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            Iterator it = audioAttributesCompatParcelizer.MediaMetadataCompat.iterator();
            while (it.hasNext()) {
                ((ObjectArrayDeserializer) it.next()).RemoteActionCompatParcelizer(handlesingleelementunwrapped);
            }
        } else {
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer;
            if (audioAttributesCompatParcelizer2 != null) {
                Iterator it2 = audioAttributesCompatParcelizer2.MediaMetadataCompat.iterator();
                while (it2.hasNext()) {
                    ((ObjectArrayDeserializer) it2.next()).RemoteActionCompatParcelizer(handlesingleelementunwrapped);
                }
            }
        }
    }

    public final boolean onCommand() {
        Iterator<AudioAttributesCompatParcelizer> it = this.onAddQueueItem.iterator();
        while (it.hasNext()) {
            if (it.next().onAddQueueItem != null) {
                return true;
            }
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? false : true;
    }

    public final void AudioAttributesCompatParcelizer(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        MotionLayout.write writeVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.onFastForward == null) {
            this.onFastForward = MotionLayout.AudioAttributesImplApi26Parcelizer();
        }
        this.onFastForward.RemoteActionCompatParcelizer(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.MediaBrowserCompatMediaItem = motionEvent.getRawX();
                this.MediaBrowserCompatSearchResultReceiver = motionEvent.getRawY();
                this.RatingCompat = motionEvent;
                this.MediaMetadataCompat = false;
                if (this.write.onAddQueueItem != null) {
                    RectF rectFRemoteActionCompatParcelizer = this.write.onAddQueueItem.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, rectF);
                    if (rectFRemoteActionCompatParcelizer == null || rectFRemoteActionCompatParcelizer.contains(this.RatingCompat.getX(), this.RatingCompat.getY())) {
                        RectF rectFAudioAttributesCompatParcelizer = this.write.onAddQueueItem.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, rectF);
                        if (rectFAudioAttributesCompatParcelizer != null && !rectFAudioAttributesCompatParcelizer.contains(this.RatingCompat.getX(), this.RatingCompat.getY())) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
                        } else {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
                        }
                        this.write.onAddQueueItem.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatSearchResultReceiver);
                        return;
                    }
                    this.RatingCompat = null;
                    this.MediaMetadataCompat = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.MediaMetadataCompat) {
                float rawY = motionEvent.getRawY() - this.MediaBrowserCompatSearchResultReceiver;
                float rawX = motionEvent.getRawX() - this.MediaBrowserCompatMediaItem;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.RatingCompat) == null) {
                    return;
                }
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, rawX, rawY, motionEvent2);
                if (audioAttributesCompatParcelizerRemoteActionCompatParcelizer != null) {
                    motionLayout.RemoteActionCompatParcelizer(audioAttributesCompatParcelizerRemoteActionCompatParcelizer);
                    RectF rectFAudioAttributesCompatParcelizer2 = this.write.onAddQueueItem.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, rectF);
                    if (rectFAudioAttributesCompatParcelizer2 != null && !rectFAudioAttributesCompatParcelizer2.contains(this.RatingCompat.getX(), this.RatingCompat.getY())) {
                        z = true;
                    }
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
                    this.write.onAddQueueItem.MediaBrowserCompatItemReceiver(this.MediaBrowserCompatMediaItem, this.MediaBrowserCompatSearchResultReceiver);
                }
            }
        }
        if (this.MediaMetadataCompat) {
            return;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.onAddQueueItem != null && !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.write.onAddQueueItem.write(motionEvent, this.onFastForward);
        }
        this.MediaBrowserCompatMediaItem = motionEvent.getRawX();
        this.MediaBrowserCompatSearchResultReceiver = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (writeVar = this.onFastForward) == null) {
            return;
        }
        writeVar.write();
        this.onFastForward = null;
        if (motionLayout.AudioAttributesCompatParcelizer != -1) {
            AudioAttributesCompatParcelizer(motionLayout, motionLayout.AudioAttributesCompatParcelizer);
        }
    }

    public final void RemoteActionCompatParcelizer(float f, float f2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return;
        }
        this.write.onAddQueueItem.write(f, f2);
    }

    public final void write(float f, float f2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return;
        }
        this.write.onAddQueueItem.IconCompatParcelizer(f, f2);
    }

    public final float AudioAttributesCompatParcelizer(float f, float f2) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.read(f, f2);
    }

    public final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null) {
            return -1;
        }
        return audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null) {
            return -1;
        }
        return audioAttributesCompatParcelizer.read;
    }

    public final Interpolator AudioAttributesImplBaseParcelizer() {
        int i = this.write.AudioAttributesCompatParcelizer;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), this.write.IconCompatParcelizer);
        }
        if (i == -1) {
            final EnumMapDeserializer enumMapDeserializerIconCompatParcelizer = EnumMapDeserializer.IconCompatParcelizer(this.write.MediaBrowserCompatItemReceiver);
            return new Interpolator() { // from class: o.PrimitiveArrayDeserializersFloatDeser.3
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) enumMapDeserializerIconCompatParcelizer.AudioAttributesCompatParcelizer(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final int write() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(int i) {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.write(i);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
        }
    }

    public final int RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer.MediaDescriptionCompat;
        }
        return -1;
    }

    public final float onCustomAction() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return audioAttributesCompatParcelizer != null ? audioAttributesCompatParcelizer.onCustomAction : BitmapDescriptorFactory.HUE_RED;
    }

    public final float AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.RemoteActionCompatParcelizer();
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.AudioAttributesCompatParcelizer();
    }

    public final float MediaBrowserCompatMediaItem() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.AudioAttributesImplApi21Parcelizer();
    }

    public final float MediaDescriptionCompat() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.MediaBrowserCompatCustomActionResultReceiver();
    }

    public final float MediaBrowserCompatSearchResultReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.MediaBrowserCompatItemReceiver();
    }

    public final float MediaMetadataCompat() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        return (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) ? BitmapDescriptorFactory.HUE_RED : this.write.onAddQueueItem.AudioAttributesImplApi26Parcelizer();
    }

    public final int RatingCompat() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return 0;
        }
        return this.write.onAddQueueItem.AudioAttributesImplBaseParcelizer();
    }

    public final int AudioAttributesCompatParcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return 0;
        }
        return this.write.onAddQueueItem.read();
    }

    public final void onAddQueueItem() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return;
        }
        this.write.onAddQueueItem.MediaBrowserCompatSearchResultReceiver();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
        if (audioAttributesCompatParcelizer == null || audioAttributesCompatParcelizer.onAddQueueItem == null) {
            return false;
        }
        return this.write.onAddQueueItem.write();
    }

    public final void IconCompatParcelizer(MotionLayout motionLayout) {
        for (int i = 0; i < this.AudioAttributesImplApi26Parcelizer.size(); i++) {
            int iKeyAt = this.AudioAttributesImplApi26Parcelizer.keyAt(i);
            if (AudioAttributesCompatParcelizer(iKeyAt)) {
                return;
            }
            IconCompatParcelizer(iKeyAt, motionLayout);
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i) {
        int i2 = this.AudioAttributesImplApi21Parcelizer.get(i);
        int size = this.AudioAttributesImplApi21Parcelizer.size();
        while (i2 > 0) {
            if (i2 == i || size < 0) {
                return true;
            }
            i2 = this.AudioAttributesImplApi21Parcelizer.get(i2);
            size--;
        }
        return false;
    }

    private void IconCompatParcelizer(int i, MotionLayout motionLayout) {
        ReferenceTypeDeserializer referenceTypeDeserializer = this.AudioAttributesImplApi26Parcelizer.get(i);
        referenceTypeDeserializer.write = referenceTypeDeserializer.AudioAttributesCompatParcelizer;
        int i2 = this.AudioAttributesImplApi21Parcelizer.get(i);
        if (i2 > 0) {
            IconCompatParcelizer(i2, motionLayout);
            ReferenceTypeDeserializer referenceTypeDeserializer2 = this.AudioAttributesImplApi26Parcelizer.get(i2);
            if (referenceTypeDeserializer2 == null) {
                NumberDeserializersShortDeserializer.IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler.getContext(), i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(referenceTypeDeserializer.write);
            sb.append("/");
            sb.append(referenceTypeDeserializer2.write);
            referenceTypeDeserializer.write = sb.toString();
            referenceTypeDeserializer.read(referenceTypeDeserializer2);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(referenceTypeDeserializer.write);
            sb2.append("  layout");
            referenceTypeDeserializer.write = sb2.toString();
            referenceTypeDeserializer.read(motionLayout);
        }
        referenceTypeDeserializer.RemoteActionCompatParcelizer(referenceTypeDeserializer);
    }

    private static String IconCompatParcelizer(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }
}
