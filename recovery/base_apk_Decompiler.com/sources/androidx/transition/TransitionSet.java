package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.GoogleConversionReporter1;
import kotlin.Rcolor;
import kotlin.Rdrawable;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.recordRemarketingPing;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionSet extends Transition {
    boolean AudioAttributesImplApi21Parcelizer;
    ArrayList<Transition> MediaBrowserCompatMediaItem;
    private Transition[] MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int RatingCompat;
    int RemoteActionCompatParcelizer;

    @Override // androidx.transition.Transition
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    public TransitionSet() {
        this.MediaBrowserCompatMediaItem = new ArrayList<>();
        this.MediaMetadataCompat = true;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.RatingCompat = 0;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatMediaItem = new ArrayList<>();
        this.MediaMetadataCompat = true;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.RatingCompat = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.AudioAttributesImplApi26Parcelizer);
        RemoteActionCompatParcelizer(_parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final TransitionSet RemoteActionCompatParcelizer(int i) {
        if (i == 0) {
            this.MediaMetadataCompat = true;
            return this;
        }
        if (i == 1) {
            this.MediaMetadataCompat = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: ".concat(String.valueOf(i)));
    }

    public final TransitionSet IconCompatParcelizer(Transition transition) {
        RemoteActionCompatParcelizer(transition);
        if (this.IconCompatParcelizer >= 0) {
            transition.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        }
        if ((this.RatingCompat & 1) != 0) {
            transition.write(MediaBrowserCompatCustomActionResultReceiver());
        }
        if ((this.RatingCompat & 2) != 0) {
            transition.read(RatingCompat());
        }
        if ((this.RatingCompat & 4) != 0) {
            transition.IconCompatParcelizer(MediaDescriptionCompat());
        }
        if ((this.RatingCompat & 8) != 0) {
            transition.read(AudioAttributesImplApi21Parcelizer());
        }
        return this;
    }

    private void RemoteActionCompatParcelizer(Transition transition) {
        this.MediaBrowserCompatMediaItem.add(transition);
        transition.MediaBrowserCompatCustomActionResultReceiver = this;
    }

    public final int onPlayFromMediaId() {
        return this.MediaBrowserCompatMediaItem.size();
    }

    public final Transition AudioAttributesCompatParcelizer(int i) {
        if (i < 0 || i >= this.MediaBrowserCompatMediaItem.size()) {
            return null;
        }
        return this.MediaBrowserCompatMediaItem.get(i);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final TransitionSet RemoteActionCompatParcelizer(long j) {
        ArrayList<Transition> arrayList;
        super.RemoteActionCompatParcelizer(j);
        if (this.IconCompatParcelizer >= 0 && (arrayList = this.MediaBrowserCompatMediaItem) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompatMediaItem.get(i).RemoteActionCompatParcelizer(j);
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public TransitionSet read(long j) {
        return (TransitionSet) super.read(j);
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final TransitionSet write(TimeInterpolator timeInterpolator) {
        this.RatingCompat |= 1;
        ArrayList<Transition> arrayList = this.MediaBrowserCompatMediaItem;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.MediaBrowserCompatMediaItem.get(i).write(timeInterpolator);
            }
        }
        return (TransitionSet) super.write(timeInterpolator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public TransitionSet AudioAttributesCompatParcelizer(View view) {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            this.MediaBrowserCompatMediaItem.get(i).AudioAttributesCompatParcelizer(view);
        }
        return (TransitionSet) super.AudioAttributesCompatParcelizer(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public TransitionSet RemoteActionCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return (TransitionSet) super.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: merged with bridge method [inline-methods] */
    public TransitionSet RemoteActionCompatParcelizer(View view) {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            this.MediaBrowserCompatMediaItem.get(i).RemoteActionCompatParcelizer(view);
        }
        return (TransitionSet) super.RemoteActionCompatParcelizer(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public TransitionSet AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return (TransitionSet) super.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
    }

    @Override // androidx.transition.Transition
    public final void IconCompatParcelizer(PathMotion pathMotion) {
        super.IconCompatParcelizer(pathMotion);
        this.RatingCompat |= 4;
        if (this.MediaBrowserCompatMediaItem != null) {
            for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
                this.MediaBrowserCompatMediaItem.get(i).IconCompatParcelizer(pathMotion);
            }
        }
    }

    private void onFastForward() {
        read readVar = new read(this);
        Iterator<Transition> it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(readVar);
        }
        this.RemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.size();
    }

    static class read extends GoogleConversionReporter1 {
        private TransitionSet write;

        read(TransitionSet transitionSet) {
            this.write = transitionSet;
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void IconCompatParcelizer(Transition transition) {
            if (this.write.AudioAttributesImplApi21Parcelizer) {
                return;
            }
            this.write.onPlay();
            this.write.AudioAttributesImplApi21Parcelizer = true;
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void read(Transition transition) {
            TransitionSet transitionSet = this.write;
            transitionSet.RemoteActionCompatParcelizer--;
            if (this.write.RemoteActionCompatParcelizer == 0) {
                this.write.AudioAttributesImplApi21Parcelizer = false;
                this.write.MediaBrowserCompatItemReceiver();
            }
            transition.AudioAttributesCompatParcelizer(this);
        }
    }

    @Override // androidx.transition.Transition
    final void AudioAttributesCompatParcelizer(ViewGroup viewGroup, Rdrawable rdrawable, Rdrawable rdrawable2, ArrayList<Rstring> arrayList, ArrayList<Rstring> arrayList2) {
        long jMediaMetadataCompat = MediaMetadataCompat();
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.MediaBrowserCompatMediaItem.get(i);
            if (jMediaMetadataCompat > 0 && (this.MediaMetadataCompat || i == 0)) {
                long jMediaMetadataCompat2 = transition.MediaMetadataCompat();
                if (jMediaMetadataCompat2 > 0) {
                    transition.read(jMediaMetadataCompat2 + jMediaMetadataCompat);
                } else {
                    transition.read(jMediaMetadataCompat);
                }
            }
            transition.AudioAttributesCompatParcelizer(viewGroup, rdrawable, rdrawable2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    protected final void onMediaButtonEvent() {
        if (this.MediaBrowserCompatMediaItem.isEmpty()) {
            onPlay();
            MediaBrowserCompatItemReceiver();
            return;
        }
        onFastForward();
        if (!this.MediaMetadataCompat) {
            for (int i = 1; i < this.MediaBrowserCompatMediaItem.size(); i++) {
                Transition transition = this.MediaBrowserCompatMediaItem.get(i - 1);
                final Transition transition2 = this.MediaBrowserCompatMediaItem.get(i);
                transition.RemoteActionCompatParcelizer(new GoogleConversionReporter1() { // from class: androidx.transition.TransitionSet.1
                    @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
                    public final void read(Transition transition3) {
                        transition2.onMediaButtonEvent();
                        transition3.AudioAttributesCompatParcelizer(this);
                    }
                });
            }
            Transition transition3 = this.MediaBrowserCompatMediaItem.get(0);
            if (transition3 != null) {
                transition3.onMediaButtonEvent();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            it.next().onMediaButtonEvent();
        }
    }

    @Override // androidx.transition.Transition
    final boolean handleMediaPlayPauseIfPendingOnHandler() {
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            if (this.MediaBrowserCompatMediaItem.get(i).handleMediaPlayPauseIfPendingOnHandler()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    final void onPause() {
        this.AudioAttributesImplBaseParcelizer = 0L;
        GoogleConversionReporter1 googleConversionReporter1 = new GoogleConversionReporter1() { // from class: androidx.transition.TransitionSet.3
            @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
            public final void AudioAttributesCompatParcelizer(Transition transition) {
                TransitionSet.this.MediaBrowserCompatMediaItem.remove(transition);
                if (TransitionSet.this.handleMediaPlayPauseIfPendingOnHandler()) {
                    return;
                }
                TransitionSet.this.read(Transition.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer, false);
                TransitionSet.this.MediaBrowserCompatItemReceiver = true;
                TransitionSet.this.read(Transition.AudioAttributesImplBaseParcelizer.read, false);
            }
        };
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            Transition transition = this.MediaBrowserCompatMediaItem.get(i);
            transition.RemoteActionCompatParcelizer(googleConversionReporter1);
            transition.onPause();
            long jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = transition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            if (this.MediaMetadataCompat) {
                this.AudioAttributesImplBaseParcelizer = Math.max(this.AudioAttributesImplBaseParcelizer, jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            } else {
                transition.AudioAttributesImplApi26Parcelizer = this.AudioAttributesImplBaseParcelizer;
                this.AudioAttributesImplBaseParcelizer += jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            }
        }
    }

    private int write(long j) {
        for (int i = 1; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            if (this.MediaBrowserCompatMediaItem.get(i).AudioAttributesImplApi26Parcelizer > j) {
                return i - 1;
            }
        }
        return this.MediaBrowserCompatMediaItem.size() - 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void write(long r19, long r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r3 = r21
            long r5 = r18.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            androidx.transition.TransitionSet r7 = r0.MediaBrowserCompatCustomActionResultReceiver
            r8 = 0
            if (r7 == 0) goto L20
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc0
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto Lc0
        L20:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            if (r7 >= 0) goto L27
            r12 = 1
            goto L28
        L27:
            r12 = r10
        L28:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L30
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L38
        L30:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L3f
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L3f
        L38:
            r0.MediaBrowserCompatItemReceiver = r10
            androidx.transition.Transition$AudioAttributesImplBaseParcelizer r14 = androidx.transition.Transition.AudioAttributesImplBaseParcelizer.write
            r0.read(r14, r12)
        L3f:
            boolean r14 = r0.MediaMetadataCompat
            if (r14 == 0) goto L5c
        L43:
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.MediaBrowserCompatMediaItem
            int r7 = r7.size()
            if (r10 >= r7) goto L59
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.MediaBrowserCompatMediaItem
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            r7.write(r1, r3)
            int r10 = r10 + 1
            goto L43
        L59:
            r16 = r12
            goto La2
        L5c:
            int r10 = r0.write(r3)
            if (r7 < 0) goto L86
        L62:
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.MediaBrowserCompatMediaItem
            int r7 = r7.size()
            if (r10 >= r7) goto L59
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.MediaBrowserCompatMediaItem
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            long r14 = r7.AudioAttributesImplApi26Parcelizer
            r16 = r12
            long r11 = r1 - r14
            int r17 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r17 < 0) goto La2
            long r14 = r3 - r14
            r7.write(r11, r14)
            int r10 = r10 + 1
            r12 = r16
            goto L62
        L86:
            r16 = r12
        L88:
            if (r10 < 0) goto La2
            java.util.ArrayList<androidx.transition.Transition> r7 = r0.MediaBrowserCompatMediaItem
            java.lang.Object r7 = r7.get(r10)
            androidx.transition.Transition r7 = (androidx.transition.Transition) r7
            long r11 = r7.AudioAttributesImplApi26Parcelizer
            long r14 = r1 - r11
            long r11 = r3 - r11
            r7.write(r14, r11)
            int r7 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r7 >= 0) goto La2
            int r10 = r10 + (-1)
            goto L88
        La2:
            androidx.transition.TransitionSet r7 = r0.MediaBrowserCompatCustomActionResultReceiver
            if (r7 == 0) goto Lc0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lae
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb4
        Lae:
            if (r13 >= 0) goto Lc0
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 < 0) goto Lc0
        Lb4:
            if (r1 <= 0) goto Lb9
            r1 = 1
            r0.MediaBrowserCompatItemReceiver = r1
        Lb9:
            androidx.transition.Transition$AudioAttributesImplBaseParcelizer r1 = androidx.transition.Transition.AudioAttributesImplBaseParcelizer.read
            r11 = r16
            r0.read(r1, r11)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionSet.write(long, long):void");
    }

    @Override // androidx.transition.Transition
    public final boolean read() {
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            if (!this.MediaBrowserCompatMediaItem.get(i).read()) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.transition.Transition
    public final void read(Rstring rstring) {
        if (read(rstring.AudioAttributesCompatParcelizer)) {
            for (Transition transition : this.MediaBrowserCompatMediaItem) {
                if (transition.read(rstring.AudioAttributesCompatParcelizer)) {
                    transition.read(rstring);
                    rstring.IconCompatParcelizer.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void RemoteActionCompatParcelizer(Rstring rstring) {
        if (read(rstring.AudioAttributesCompatParcelizer)) {
            for (Transition transition : this.MediaBrowserCompatMediaItem) {
                if (transition.read(rstring.AudioAttributesCompatParcelizer)) {
                    transition.RemoteActionCompatParcelizer(rstring);
                    rstring.IconCompatParcelizer.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    final void write(Rstring rstring) {
        super.write(rstring);
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatMediaItem.get(i).write(rstring);
        }
    }

    @Override // androidx.transition.Transition
    public final void IconCompatParcelizer(View view) {
        super.IconCompatParcelizer(view);
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatMediaItem.get(i).IconCompatParcelizer(view);
        }
    }

    private Transition[] onPrepareFromMediaId() {
        Transition[] transitionArr = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.MediaBrowserCompatMediaItem.size()];
        }
        return (Transition[]) this.MediaBrowserCompatMediaItem.toArray(transitionArr);
    }

    private void IconCompatParcelizer(Transition[] transitionArr) {
        Arrays.fill(transitionArr, (Object) null);
        this.MediaDescriptionCompat = transitionArr;
    }

    @Override // androidx.transition.Transition
    public final void MediaBrowserCompatCustomActionResultReceiver(View view) {
        super.MediaBrowserCompatCustomActionResultReceiver(view);
        Transition[] transitionArrOnPrepareFromMediaId = onPrepareFromMediaId();
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            transitionArrOnPrepareFromMediaId[i].MediaBrowserCompatCustomActionResultReceiver(view);
        }
        IconCompatParcelizer(transitionArrOnPrepareFromMediaId);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.transition.Transition
    public final void AudioAttributesCompatParcelizer() {
        super.AudioAttributesCompatParcelizer();
        Transition[] transitionArrOnPrepareFromMediaId = onPrepareFromMediaId();
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            transitionArrOnPrepareFromMediaId[i].AudioAttributesCompatParcelizer();
        }
        IconCompatParcelizer(transitionArrOnPrepareFromMediaId);
    }

    @Override // androidx.transition.Transition
    public final void read(Rcolor rcolor) {
        super.read(rcolor);
        this.RatingCompat |= 2;
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatMediaItem.get(i).read(rcolor);
        }
    }

    @Override // androidx.transition.Transition
    public final void read(Transition.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super.read(audioAttributesCompatParcelizer);
        this.RatingCompat |= 8;
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompatMediaItem.get(i).read(audioAttributesCompatParcelizer);
        }
    }

    @Override // androidx.transition.Transition
    final String write(String str) {
        String strWrite = super.write(str);
        for (int i = 0; i < this.MediaBrowserCompatMediaItem.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strWrite);
            sb.append("\n");
            Transition transition = this.MediaBrowserCompatMediaItem.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(transition.write(sb2.toString()));
            strWrite = sb.toString();
        }
        return strWrite;
    }

    @Override // androidx.transition.Transition
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.MediaBrowserCompatMediaItem = new ArrayList<>();
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            transitionSet.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.get(i).clone());
        }
        return transitionSet;
    }
}
