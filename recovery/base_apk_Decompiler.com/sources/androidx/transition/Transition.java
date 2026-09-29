package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.transition.Transition;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import kotlin.ConcreteBeanPropertyBase;
import kotlin.GoogleConversionReporter1;
import kotlin.InvalidTypeIdException;
import kotlin.Rcolor;
import kotlin.Rdrawable;
import kotlin.Rstring;
import kotlin._parseLongPrimitive;
import kotlin.aa;
import kotlin.collectDefaultFromBundle;
import kotlin.findAliases;
import kotlin.legacyManglePropertyName;
import kotlin.onReceive;
import kotlin.recordRemarketingPing;
import kotlin.setPresenter;
import kotlin.setTitleOptional;
import kotlin.wrapAsJsonMappingException;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Transition implements Cloneable {
    long AudioAttributesImplApi26Parcelizer;
    long AudioAttributesImplBaseParcelizer;
    private ArrayList<Rstring> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private AudioAttributesCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private RemoteActionCompatParcelizer[] onCommand;
    private setTitleOptional<String, String> onMediaButtonEvent;
    private Rcolor onPlayFromSearch;
    private IconCompatParcelizer onPrepareFromMediaId;
    private ArrayList<Rstring> onSeekTo;
    private static final Animator[] AudioAttributesImplApi21Parcelizer = new Animator[0];
    private static final int[] RemoteActionCompatParcelizer = {2, 1, 3, 4};
    private static final PathMotion MediaBrowserCompatSearchResultReceiver = new PathMotion() { // from class: androidx.transition.Transition.3
        @Override // androidx.transition.PathMotion
        public final Path write(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    };
    private static ThreadLocal<setTitleOptional<Animator, write>> RatingCompat = new ThreadLocal<>();
    private String onPlay = getClass().getName();
    private long onPrepareFromSearch = -1;
    long IconCompatParcelizer = -1;
    private TimeInterpolator onCustomAction = null;
    private ArrayList<Integer> onSetCaptioningEnabled = new ArrayList<>();
    private ArrayList<View> onSkipToNext = new ArrayList<>();
    private ArrayList<String> onSetPlaybackSpeed = null;
    private ArrayList<Class<?>> setSessionImpl = null;
    private ArrayList<Integer> onPrepareFromUri = null;
    private ArrayList<View> onRemoveQueueItemAt = null;
    private ArrayList<Class<?>> onSetShuffleMode = null;
    private ArrayList<String> onSetRepeatMode = null;
    private ArrayList<Integer> onRemoveQueueItem = null;
    private ArrayList<View> onRewind = null;
    private ArrayList<Class<?>> onSetRating = null;
    private Rdrawable onPlayFromUri = new Rdrawable();
    private Rdrawable MediaMetadataCompat = new Rdrawable();
    TransitionSet MediaBrowserCompatCustomActionResultReceiver = null;
    private int[] onPlayFromMediaId = RemoteActionCompatParcelizer;
    boolean AudioAttributesCompatParcelizer = false;
    ArrayList<Animator> write = new ArrayList<>();
    private Animator[] MediaBrowserCompatMediaItem = AudioAttributesImplApi21Parcelizer;
    private int onFastForward = 0;
    private boolean onPrepare = false;
    boolean MediaBrowserCompatItemReceiver = false;
    private Transition MediaDescriptionCompat = null;
    private ArrayList<RemoteActionCompatParcelizer> onAddQueueItem = null;
    ArrayList<Animator> read = new ArrayList<>();
    private PathMotion onPause = MediaBrowserCompatSearchResultReceiver;

    public static abstract class AudioAttributesCompatParcelizer {
        public abstract Rect IconCompatParcelizer();
    }

    private static boolean AudioAttributesCompatParcelizer(int i) {
        return i > 0 && i <= 4;
    }

    public abstract void RemoteActionCompatParcelizer(Rstring rstring);

    public Animator read(ViewGroup viewGroup, Rstring rstring, Rstring rstring2) {
        return null;
    }

    public abstract void read(Rstring rstring);

    public boolean read() {
        return false;
    }

    public String[] write() {
        return null;
    }

    static /* synthetic */ Transition read(Transition transition) {
        transition.MediaDescriptionCompat = null;
        return null;
    }

    public Transition() {
    }

    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, recordRemarketingPing.MediaBrowserCompatCustomActionResultReceiver);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long j = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) xmlResourceParser, "duration", 1, -1);
        if (j >= 0) {
            RemoteActionCompatParcelizer(j);
        }
        long j2 = _parseLongPrimitive.read(typedArrayObtainStyledAttributes, (XmlPullParser) xmlResourceParser, "startDelay", 2, -1);
        if (j2 > 0) {
            read(j2);
        }
        int iIconCompatParcelizer = _parseLongPrimitive.IconCompatParcelizer(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator");
        if (iIconCompatParcelizer > 0) {
            write(AnimationUtils.loadInterpolator(context, iIconCompatParcelizer));
        }
        String strRemoteActionCompatParcelizer = _parseLongPrimitive.RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strRemoteActionCompatParcelizer != null) {
            read(AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int[] AudioAttributesCompatParcelizer(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else if (strTrim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                StringBuilder sb = new StringBuilder("Unknown match type in matchOrder: '");
                sb.append(strTrim);
                sb.append("'");
                throw new InflateException(sb.toString());
            }
            i++;
        }
        return iArr;
    }

    public final Transition MediaBrowserCompatSearchResultReceiver() {
        TransitionSet transitionSet = this.MediaBrowserCompatCustomActionResultReceiver;
        return transitionSet != null ? transitionSet.MediaBrowserCompatSearchResultReceiver() : this;
    }

    public Transition RemoteActionCompatParcelizer(long j) {
        this.IconCompatParcelizer = j;
        return this;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    public Transition read(long j) {
        this.onPrepareFromSearch = j;
        return this;
    }

    public final long MediaMetadataCompat() {
        return this.onPrepareFromSearch;
    }

    public Transition write(TimeInterpolator timeInterpolator) {
        this.onCustomAction = timeInterpolator;
        return this;
    }

    public final TimeInterpolator MediaBrowserCompatCustomActionResultReceiver() {
        return this.onCustomAction;
    }

    public final onReceive IconCompatParcelizer() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        this.onPrepareFromMediaId = iconCompatParcelizer;
        RemoteActionCompatParcelizer(iconCompatParcelizer);
        return this.onPrepareFromMediaId;
    }

    private void read(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.onPlayFromMediaId = RemoteActionCompatParcelizer;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!AudioAttributesCompatParcelizer(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (RemoteActionCompatParcelizer(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.onPlayFromMediaId = (int[]) iArr.clone();
    }

    private static boolean RemoteActionCompatParcelizer(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void AudioAttributesCompatParcelizer(setTitleOptional<View, Rstring> settitleoptional, setTitleOptional<View, Rstring> settitleoptional2) {
        Rstring rstringRemove;
        for (int remoteActionCompatParcelizer = settitleoptional.getRemoteActionCompatParcelizer() - 1; remoteActionCompatParcelizer >= 0; remoteActionCompatParcelizer--) {
            View viewWrite = settitleoptional.write(remoteActionCompatParcelizer);
            if (viewWrite != null && read(viewWrite) && (rstringRemove = settitleoptional2.remove(viewWrite)) != null && read(rstringRemove.AudioAttributesCompatParcelizer)) {
                this.onSeekTo.add(settitleoptional.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer));
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(rstringRemove);
            }
        }
    }

    private void AudioAttributesCompatParcelizer(setTitleOptional<View, Rstring> settitleoptional, setTitleOptional<View, Rstring> settitleoptional2, setPresenter<View> setpresenter, setPresenter<View> setpresenter2) {
        View viewIconCompatParcelizer;
        int iWrite = setpresenter.write();
        for (int i = 0; i < iWrite; i++) {
            View viewIconCompatParcelizer2 = setpresenter.IconCompatParcelizer(i);
            if (viewIconCompatParcelizer2 != null && read(viewIconCompatParcelizer2) && (viewIconCompatParcelizer = setpresenter2.IconCompatParcelizer(setpresenter.AudioAttributesCompatParcelizer(i))) != null && read(viewIconCompatParcelizer)) {
                Rstring rstring = settitleoptional.get(viewIconCompatParcelizer2);
                Rstring rstring2 = settitleoptional2.get(viewIconCompatParcelizer);
                if (rstring != null && rstring2 != null) {
                    this.onSeekTo.add(rstring);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(rstring2);
                    settitleoptional.remove(viewIconCompatParcelizer2);
                    settitleoptional2.remove(viewIconCompatParcelizer);
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(setTitleOptional<View, Rstring> settitleoptional, setTitleOptional<View, Rstring> settitleoptional2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && read(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && read(view)) {
                Rstring rstring = settitleoptional.get(viewValueAt);
                Rstring rstring2 = settitleoptional2.get(view);
                if (rstring != null && rstring2 != null) {
                    this.onSeekTo.add(rstring);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(rstring2);
                    settitleoptional.remove(viewValueAt);
                    settitleoptional2.remove(view);
                }
            }
        }
    }

    private void AudioAttributesCompatParcelizer(setTitleOptional<View, Rstring> settitleoptional, setTitleOptional<View, Rstring> settitleoptional2, setTitleOptional<String, View> settitleoptional3, setTitleOptional<String, View> settitleoptional4) {
        View view;
        int remoteActionCompatParcelizer = settitleoptional3.getRemoteActionCompatParcelizer();
        for (int i = 0; i < remoteActionCompatParcelizer; i++) {
            View viewIconCompatParcelizer = settitleoptional3.IconCompatParcelizer(i);
            if (viewIconCompatParcelizer != null && read(viewIconCompatParcelizer) && (view = settitleoptional4.get(settitleoptional3.write(i))) != null && read(view)) {
                Rstring rstring = settitleoptional.get(viewIconCompatParcelizer);
                Rstring rstring2 = settitleoptional2.get(view);
                if (rstring != null && rstring2 != null) {
                    this.onSeekTo.add(rstring);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(rstring2);
                    settitleoptional.remove(viewIconCompatParcelizer);
                    settitleoptional2.remove(view);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(setTitleOptional<View, Rstring> settitleoptional, setTitleOptional<View, Rstring> settitleoptional2) {
        for (int i = 0; i < settitleoptional.getRemoteActionCompatParcelizer(); i++) {
            Rstring rstringIconCompatParcelizer = settitleoptional.IconCompatParcelizer(i);
            if (read(rstringIconCompatParcelizer.AudioAttributesCompatParcelizer)) {
                this.onSeekTo.add(rstringIconCompatParcelizer);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(null);
            }
        }
        for (int i2 = 0; i2 < settitleoptional2.getRemoteActionCompatParcelizer(); i2++) {
            Rstring rstringIconCompatParcelizer2 = settitleoptional2.IconCompatParcelizer(i2);
            if (read(rstringIconCompatParcelizer2.AudioAttributesCompatParcelizer)) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(rstringIconCompatParcelizer2);
                this.onSeekTo.add(null);
            }
        }
    }

    private void IconCompatParcelizer(Rdrawable rdrawable, Rdrawable rdrawable2) {
        setTitleOptional<View, Rstring> settitleoptional = new setTitleOptional<>(rdrawable.write);
        setTitleOptional<View, Rstring> settitleoptional2 = new setTitleOptional<>(rdrawable2.write);
        int i = 0;
        while (true) {
            int[] iArr = this.onPlayFromMediaId;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    AudioAttributesCompatParcelizer(settitleoptional, settitleoptional2);
                } else if (i2 == 2) {
                    AudioAttributesCompatParcelizer(settitleoptional, settitleoptional2, rdrawable.AudioAttributesCompatParcelizer, rdrawable2.AudioAttributesCompatParcelizer);
                } else if (i2 == 3) {
                    AudioAttributesCompatParcelizer(settitleoptional, settitleoptional2, rdrawable.read, rdrawable2.read);
                } else if (i2 == 4) {
                    AudioAttributesCompatParcelizer(settitleoptional, settitleoptional2, rdrawable.IconCompatParcelizer, rdrawable2.IconCompatParcelizer);
                }
                i++;
            } else {
                RemoteActionCompatParcelizer(settitleoptional, settitleoptional2);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void AudioAttributesCompatParcelizer(android.view.ViewGroup r22, kotlin.Rdrawable r23, kotlin.Rdrawable r24, java.util.ArrayList<kotlin.Rstring> r25, java.util.ArrayList<kotlin.Rstring> r26) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.AudioAttributesCompatParcelizer(android.view.ViewGroup, o.Rdrawable, o.Rdrawable, java.util.ArrayList, java.util.ArrayList):void");
    }

    final boolean read(View view) {
        return (this.onSetCaptioningEnabled.size() == 0 && this.onSkipToNext.size() == 0) || this.onSetCaptioningEnabled.contains(Integer.valueOf(view.getId())) || this.onSkipToNext.contains(view);
    }

    private static setTitleOptional<Animator, write> onFastForward() {
        setTitleOptional<Animator, write> settitleoptional = RatingCompat.get();
        if (settitleoptional != null) {
            return settitleoptional;
        }
        setTitleOptional<Animator, write> settitleoptional2 = new setTitleOptional<>();
        RatingCompat.set(settitleoptional2);
        return settitleoptional2;
    }

    protected void onMediaButtonEvent() {
        onPlay();
        setTitleOptional<Animator, write> settitleoptionalOnFastForward = onFastForward();
        for (Animator animator : this.read) {
            if (settitleoptionalOnFastForward.containsKey(animator)) {
                onPlay();
                write(animator, settitleoptionalOnFastForward);
            }
        }
        this.read.clear();
        MediaBrowserCompatItemReceiver();
    }

    private void write(Animator animator, final setTitleOptional<Animator, write> settitleoptional) {
        if (animator != null) {
            animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator2) {
                    Transition.this.write.add(animator2);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator2) {
                    settitleoptional.remove(animator2);
                    Transition.this.write.remove(animator2);
                }
            });
            read(animator);
        }
    }

    void onPause() {
        setTitleOptional<Animator, write> settitleoptionalOnFastForward = onFastForward();
        this.AudioAttributesImplBaseParcelizer = 0L;
        for (int i = 0; i < this.read.size(); i++) {
            Animator animator = this.read.get(i);
            write writeVar = settitleoptionalOnFastForward.get(animator);
            if (animator != null && writeVar != null) {
                if (AudioAttributesImplBaseParcelizer() >= 0) {
                    writeVar.read.setDuration(AudioAttributesImplBaseParcelizer());
                }
                if (MediaMetadataCompat() >= 0) {
                    writeVar.read.setStartDelay(MediaMetadataCompat() + writeVar.read.getStartDelay());
                }
                if (MediaBrowserCompatCustomActionResultReceiver() != null) {
                    writeVar.read.setInterpolator(MediaBrowserCompatCustomActionResultReceiver());
                }
                this.write.add(animator);
                this.AudioAttributesImplBaseParcelizer = Math.max(this.AudioAttributesImplBaseParcelizer, read.read(animator));
            }
        }
        this.read.clear();
    }

    public Transition AudioAttributesCompatParcelizer(View view) {
        this.onSkipToNext.add(view);
        return this;
    }

    public Transition RemoteActionCompatParcelizer(View view) {
        this.onSkipToNext.remove(view);
        return this;
    }

    public final List<Integer> MediaBrowserCompatMediaItem() {
        return this.onSetCaptioningEnabled;
    }

    public final List<View> onCustomAction() {
        return this.onSkipToNext;
    }

    public final List<String> onAddQueueItem() {
        return this.onSetPlaybackSpeed;
    }

    public final List<Class<?>> onCommand() {
        return this.setSessionImpl;
    }

    public final void write(ViewGroup viewGroup, boolean z) {
        AudioAttributesCompatParcelizer(z);
        if (this.onSetCaptioningEnabled.size() > 0 || this.onSkipToNext.size() > 0) {
            for (int i = 0; i < this.onSetCaptioningEnabled.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.onSetCaptioningEnabled.get(i).intValue());
                if (viewFindViewById != null) {
                    Rstring rstring = new Rstring(viewFindViewById);
                    if (z) {
                        read(rstring);
                    } else {
                        RemoteActionCompatParcelizer(rstring);
                    }
                    rstring.IconCompatParcelizer.add(this);
                    write(rstring);
                    if (z) {
                        write(this.onPlayFromUri, viewFindViewById, rstring);
                    } else {
                        write(this.MediaMetadataCompat, viewFindViewById, rstring);
                    }
                }
            }
            for (int i2 = 0; i2 < this.onSkipToNext.size(); i2++) {
                View view = this.onSkipToNext.get(i2);
                Rstring rstring2 = new Rstring(view);
                if (z) {
                    read(rstring2);
                } else {
                    RemoteActionCompatParcelizer(rstring2);
                }
                rstring2.IconCompatParcelizer.add(this);
                write(rstring2);
                if (z) {
                    write(this.onPlayFromUri, view, rstring2);
                } else {
                    write(this.MediaMetadataCompat, view, rstring2);
                }
            }
            return;
        }
        read(viewGroup, z);
    }

    private static void write(Rdrawable rdrawable, View view, Rstring rstring) {
        rdrawable.write.put(view, rstring);
        int id = view.getId();
        if (id >= 0) {
            if (rdrawable.read.indexOfKey(id) >= 0) {
                rdrawable.read.put(id, null);
            } else {
                rdrawable.read.put(id, view);
            }
        }
        String strOnMediaButtonEvent = InvalidTypeIdException.onMediaButtonEvent(view);
        if (strOnMediaButtonEvent != null) {
            if (rdrawable.AudioAttributesCompatParcelizer.containsKey(strOnMediaButtonEvent)) {
                rdrawable.AudioAttributesCompatParcelizer.put(strOnMediaButtonEvent, null);
            } else {
                rdrawable.AudioAttributesCompatParcelizer.put(strOnMediaButtonEvent, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (rdrawable.IconCompatParcelizer.write(itemIdAtPosition) >= 0) {
                    View viewIconCompatParcelizer = rdrawable.IconCompatParcelizer.IconCompatParcelizer(itemIdAtPosition);
                    if (viewIconCompatParcelizer != null) {
                        viewIconCompatParcelizer.setHasTransientState(false);
                        rdrawable.IconCompatParcelizer.write(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                rdrawable.IconCompatParcelizer.write(itemIdAtPosition, view);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            this.onPlayFromUri.write.clear();
            this.onPlayFromUri.read.clear();
            this.onPlayFromUri.IconCompatParcelizer.IconCompatParcelizer();
        } else {
            this.MediaMetadataCompat.write.clear();
            this.MediaMetadataCompat.read.clear();
            this.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer();
        }
    }

    private void read(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                Rstring rstring = new Rstring(view);
                if (z) {
                    read(rstring);
                } else {
                    RemoteActionCompatParcelizer(rstring);
                }
                rstring.IconCompatParcelizer.add(this);
                write(rstring);
                if (z) {
                    write(this.onPlayFromUri, view, rstring);
                } else {
                    write(this.MediaMetadataCompat, view, rstring);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    read(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public final Rstring RemoteActionCompatParcelizer(View view, boolean z) {
        TransitionSet transitionSet = this.MediaBrowserCompatCustomActionResultReceiver;
        if (transitionSet != null) {
            return transitionSet.RemoteActionCompatParcelizer(view, z);
        }
        return (z ? this.onPlayFromUri : this.MediaMetadataCompat).write.get(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r3 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r7 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r5.onSeekTo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return r5.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final kotlin.Rstring IconCompatParcelizer(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            androidx.transition.TransitionSet r0 = r5.MediaBrowserCompatCustomActionResultReceiver
            if (r0 == 0) goto L9
            o.Rstring r5 = r0.IconCompatParcelizer(r6, r7)
            return r5
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList<o.Rstring> r0 = r5.onSeekTo
            goto L10
        Le:
            java.util.ArrayList<o.Rstring> r0 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2b
            java.lang.Object r4 = r0.get(r3)
            o.Rstring r4 = (kotlin.Rstring) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.AudioAttributesCompatParcelizer
            if (r4 == r6) goto L2c
            int r3 = r3 + 1
            goto L19
        L2b:
            r3 = -1
        L2c:
            if (r3 < 0) goto L3c
            if (r7 == 0) goto L33
            java.util.ArrayList<o.Rstring> r5 = r5.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            goto L35
        L33:
            java.util.ArrayList<o.Rstring> r5 = r5.onSeekTo
        L35:
            java.lang.Object r5 = r5.get(r3)
            o.Rstring r5 = (kotlin.Rstring) r5
            return r5
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.IconCompatParcelizer(android.view.View, boolean):o.Rstring");
    }

    public void IconCompatParcelizer(View view) {
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        int size = this.write.size();
        Animator[] animatorArr = (Animator[]) this.write.toArray(this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem = AudioAttributesImplApi21Parcelizer;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.pause();
            } else {
                this.MediaBrowserCompatMediaItem = animatorArr;
                read(AudioAttributesImplBaseParcelizer.IconCompatParcelizer, false);
                this.onPrepare = true;
                return;
            }
        }
    }

    public void MediaBrowserCompatCustomActionResultReceiver(View view) {
        if (this.onPrepare) {
            if (!this.MediaBrowserCompatItemReceiver) {
                int size = this.write.size();
                Animator[] animatorArr = (Animator[]) this.write.toArray(this.MediaBrowserCompatMediaItem);
                this.MediaBrowserCompatMediaItem = AudioAttributesImplApi21Parcelizer;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.MediaBrowserCompatMediaItem = animatorArr;
                read(AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer, false);
            }
            this.onPrepare = false;
        }
    }

    boolean handleMediaPlayPauseIfPendingOnHandler() {
        return !this.write.isEmpty();
    }

    public final void AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
        write writeVar;
        this.onSeekTo = new ArrayList<>();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList<>();
        IconCompatParcelizer(this.onPlayFromUri, this.MediaMetadataCompat);
        setTitleOptional<Animator, write> settitleoptionalOnFastForward = onFastForward();
        int remoteActionCompatParcelizer = settitleoptionalOnFastForward.getRemoteActionCompatParcelizer();
        WindowId windowId = viewGroup.getWindowId();
        ArrayList arrayList = new ArrayList();
        while (true) {
            remoteActionCompatParcelizer--;
            if (remoteActionCompatParcelizer < 0) {
                break;
            }
            Animator animatorWrite = settitleoptionalOnFastForward.write(remoteActionCompatParcelizer);
            if (animatorWrite != null && (writeVar = settitleoptionalOnFastForward.get(animatorWrite)) != null && writeVar.RemoteActionCompatParcelizer != null && windowId.equals(writeVar.AudioAttributesImplApi21Parcelizer)) {
                Rstring rstring = writeVar.write;
                View view = writeVar.RemoteActionCompatParcelizer;
                Rstring rstringRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view, true);
                Rstring rstringIconCompatParcelizer = IconCompatParcelizer(view, true);
                if (rstringRemoteActionCompatParcelizer == null && rstringIconCompatParcelizer == null) {
                    rstringIconCompatParcelizer = this.MediaMetadataCompat.write.get(view);
                }
                if (rstringRemoteActionCompatParcelizer != null || rstringIconCompatParcelizer != null) {
                    if (writeVar.IconCompatParcelizer.RemoteActionCompatParcelizer(rstring, rstringIconCompatParcelizer)) {
                        Transition transition = writeVar.IconCompatParcelizer;
                        if (transition.MediaBrowserCompatSearchResultReceiver().onPrepareFromMediaId != null) {
                            animatorWrite.cancel();
                            transition.write.remove(animatorWrite);
                            settitleoptionalOnFastForward.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
                            if (transition.write.size() == 0) {
                                arrayList.add(transition);
                            }
                        } else if (animatorWrite.isRunning() || animatorWrite.isStarted()) {
                            animatorWrite.cancel();
                        } else {
                            settitleoptionalOnFastForward.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Transition transition2 = (Transition) arrayList.get(i);
            transition2.read(AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer, false);
            if (!transition2.MediaBrowserCompatItemReceiver) {
                transition2.MediaBrowserCompatItemReceiver = true;
                transition2.read(AudioAttributesImplBaseParcelizer.read, false);
            }
        }
        AudioAttributesCompatParcelizer(viewGroup, this.onPlayFromUri, this.MediaMetadataCompat, this.onSeekTo, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (this.onPrepareFromMediaId == null) {
            onMediaButtonEvent();
        } else if (Build.VERSION.SDK_INT >= 34) {
            onPause();
            this.onPrepareFromMediaId.RemoteActionCompatParcelizer();
            this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer();
        }
    }

    public boolean RemoteActionCompatParcelizer(Rstring rstring, Rstring rstring2) {
        if (rstring != null && rstring2 != null) {
            String[] strArrWrite = write();
            if (strArrWrite != null) {
                for (String str : strArrWrite) {
                    if (read(rstring, rstring2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = rstring.read.keySet().iterator();
                while (it.hasNext()) {
                    if (read(rstring, rstring2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean read(Rstring rstring, Rstring rstring2, String str) {
        Object obj = rstring.read.get(str);
        Object obj2 = rstring2.read.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void read(Animator animator) {
        if (animator == null) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        if (AudioAttributesImplBaseParcelizer() >= 0) {
            animator.setDuration(AudioAttributesImplBaseParcelizer());
        }
        if (MediaMetadataCompat() >= 0) {
            animator.setStartDelay(MediaMetadataCompat() + animator.getStartDelay());
        }
        if (MediaBrowserCompatCustomActionResultReceiver() != null) {
            animator.setInterpolator(MediaBrowserCompatCustomActionResultReceiver());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                Transition.this.MediaBrowserCompatItemReceiver();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    protected final void onPlay() {
        if (this.onFastForward == 0) {
            read(AudioAttributesImplBaseParcelizer.write, false);
            this.MediaBrowserCompatItemReceiver = false;
        }
        this.onFastForward++;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = this.onFastForward - 1;
        this.onFastForward = i;
        if (i == 0) {
            read(AudioAttributesImplBaseParcelizer.read, false);
            for (int i2 = 0; i2 < this.onPlayFromUri.IconCompatParcelizer.write(); i2++) {
                View viewIconCompatParcelizer = this.onPlayFromUri.IconCompatParcelizer.IconCompatParcelizer(i2);
                if (viewIconCompatParcelizer != null) {
                    viewIconCompatParcelizer.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.MediaMetadataCompat.IconCompatParcelizer.write(); i3++) {
                View viewIconCompatParcelizer2 = this.MediaMetadataCompat.IconCompatParcelizer.IconCompatParcelizer(i3);
                if (viewIconCompatParcelizer2 != null) {
                    viewIconCompatParcelizer2.setHasTransientState(false);
                }
            }
            this.MediaBrowserCompatItemReceiver = true;
        }
    }

    public void AudioAttributesCompatParcelizer() {
        int size = this.write.size();
        Animator[] animatorArr = (Animator[]) this.write.toArray(this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem = AudioAttributesImplApi21Parcelizer;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.MediaBrowserCompatMediaItem = animatorArr;
                read(AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer, false);
                return;
            }
        }
    }

    public Transition RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.onAddQueueItem == null) {
            this.onAddQueueItem = new ArrayList<>();
        }
        this.onAddQueueItem.add(remoteActionCompatParcelizer);
        return this;
    }

    public Transition AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        Transition transition;
        ArrayList<RemoteActionCompatParcelizer> arrayList = this.onAddQueueItem;
        if (arrayList != null) {
            if (!arrayList.remove(remoteActionCompatParcelizer) && (transition = this.MediaDescriptionCompat) != null) {
                transition.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer);
            }
            if (this.onAddQueueItem.size() == 0) {
                this.onAddQueueItem = null;
            }
        }
        return this;
    }

    public void IconCompatParcelizer(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.onPause = MediaBrowserCompatSearchResultReceiver;
        } else {
            this.onPause = pathMotion;
        }
    }

    public final PathMotion MediaDescriptionCompat() {
        return this.onPause;
    }

    public void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.handleMediaPlayPauseIfPendingOnHandler = audioAttributesCompatParcelizer;
    }

    public final AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final Rect AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler;
        if (audioAttributesCompatParcelizer == null) {
            return null;
        }
        return audioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    public void read(Rcolor rcolor) {
        this.onPlayFromSearch = rcolor;
    }

    public final Rcolor RatingCompat() {
        return this.onPlayFromSearch;
    }

    void write(Rstring rstring) {
        String[] strArr;
        if (this.onPlayFromSearch == null || rstring.read.isEmpty() || (strArr = this.onPlayFromSearch.read()) == null) {
            return;
        }
        for (String str : strArr) {
            if (!rstring.read.containsKey(str)) {
                this.onPlayFromSearch.RemoteActionCompatParcelizer(rstring);
                return;
            }
        }
    }

    public String toString() {
        return write("");
    }

    @Override // 
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.read = new ArrayList<>();
            transition.onPlayFromUri = new Rdrawable();
            transition.MediaMetadataCompat = new Rdrawable();
            transition.onSeekTo = null;
            transition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            transition.onPrepareFromMediaId = null;
            transition.MediaDescriptionCompat = this;
            transition.onAddQueueItem = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private String onPlayFromMediaId() {
        return this.onPlay;
    }

    final void read(AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, boolean z) {
        IconCompatParcelizer(this, audioAttributesImplBaseParcelizer, z);
    }

    private void IconCompatParcelizer(Transition transition, AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, boolean z) {
        Transition transition2 = this.MediaDescriptionCompat;
        if (transition2 != null) {
            transition2.IconCompatParcelizer(transition, audioAttributesImplBaseParcelizer, z);
        }
        ArrayList<RemoteActionCompatParcelizer> arrayList = this.onAddQueueItem;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.onAddQueueItem.size();
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = this.onCommand;
        if (remoteActionCompatParcelizerArr == null) {
            remoteActionCompatParcelizerArr = new RemoteActionCompatParcelizer[size];
        }
        this.onCommand = null;
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr2 = (RemoteActionCompatParcelizer[]) this.onAddQueueItem.toArray(remoteActionCompatParcelizerArr);
        for (int i = 0; i < size; i++) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerArr2[i], transition);
            remoteActionCompatParcelizerArr2[i] = null;
        }
        this.onCommand = remoteActionCompatParcelizerArr2;
    }

    final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    void write(long j, long j2) {
        long jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && j <= jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            this.MediaBrowserCompatItemReceiver = false;
            read(AudioAttributesImplBaseParcelizer.write, z);
        }
        int size = this.write.size();
        Animator[] animatorArr = (Animator[]) this.write.toArray(this.MediaBrowserCompatMediaItem);
        this.MediaBrowserCompatMediaItem = AudioAttributesImplApi21Parcelizer;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            read.read(animator, Math.min(Math.max(0L, j), read.read(animator)));
        }
        this.MediaBrowserCompatMediaItem = animatorArr;
        if ((j <= jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver || j2 > jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.MediaBrowserCompatItemReceiver = true;
        }
        read(AudioAttributesImplBaseParcelizer.read, z);
    }

    String write(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.IconCompatParcelizer != -1) {
            sb.append("dur(");
            sb.append(this.IconCompatParcelizer);
            sb.append(") ");
        }
        if (this.onPrepareFromSearch != -1) {
            sb.append("dly(");
            sb.append(this.onPrepareFromSearch);
            sb.append(") ");
        }
        if (this.onCustomAction != null) {
            sb.append("interp(");
            sb.append(this.onCustomAction);
            sb.append(") ");
        }
        if (this.onSetCaptioningEnabled.size() > 0 || this.onSkipToNext.size() > 0) {
            sb.append("tgts(");
            if (this.onSetCaptioningEnabled.size() > 0) {
                for (int i = 0; i < this.onSetCaptioningEnabled.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.onSetCaptioningEnabled.get(i));
                }
            }
            if (this.onSkipToNext.size() > 0) {
                for (int i2 = 0; i2 < this.onSkipToNext.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.onSkipToNext.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public interface RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void AudioAttributesCompatParcelizer(Transition transition);

        void IconCompatParcelizer();

        void IconCompatParcelizer(Transition transition);

        void read(Transition transition);

        default void write(Transition transition) {
            IconCompatParcelizer(transition);
        }

        default void RemoteActionCompatParcelizer(Transition transition) {
            read(transition);
        }
    }

    static class write {
        String AudioAttributesCompatParcelizer;
        WindowId AudioAttributesImplApi21Parcelizer;
        Transition IconCompatParcelizer;
        View RemoteActionCompatParcelizer;
        Animator read;
        Rstring write;

        write(View view, String str, Transition transition, WindowId windowId, Rstring rstring, Animator animator) {
            this.RemoteActionCompatParcelizer = view;
            this.AudioAttributesCompatParcelizer = str;
            this.write = rstring;
            this.AudioAttributesImplApi21Parcelizer = windowId;
            this.IconCompatParcelizer = transition;
            this.read = animator;
        }
    }

    public interface AudioAttributesImplBaseParcelizer {
        public static final AudioAttributesImplBaseParcelizer write = new AudioAttributesImplBaseParcelizer() { // from class: o.GoogleConversionPingConversionType
            @Override // androidx.transition.Transition.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition) {
                remoteActionCompatParcelizer.write(transition);
            }
        };
        public static final AudioAttributesImplBaseParcelizer read = new AudioAttributesImplBaseParcelizer() { // from class: o.recordConversionPing
            @Override // androidx.transition.Transition.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(transition);
            }
        };
        public static final AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer = new AudioAttributesImplBaseParcelizer() { // from class: o.IAPConversionReporter
            @Override // androidx.transition.Transition.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(transition);
            }
        };
        public static final AudioAttributesImplBaseParcelizer IconCompatParcelizer = new AudioAttributesImplBaseParcelizer() { // from class: o.GoogleConversionReporter
            @Override // androidx.transition.Transition.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition) {
                remoteActionCompatParcelizer.IconCompatParcelizer();
            }
        };
        public static final AudioAttributesImplBaseParcelizer AudioAttributesCompatParcelizer = new AudioAttributesImplBaseParcelizer() { // from class: o.InstallReceiver
            @Override // androidx.transition.Transition.AudioAttributesImplBaseParcelizer
            public final void AudioAttributesCompatParcelizer(Transition.RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            }
        };

        void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Transition transition);
    }

    static class read {
        static long read(Animator animator) {
            return animator.getTotalDuration();
        }

        static void read(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    public class IconCompatParcelizer extends GoogleConversionReporter1 implements onReceive, findAliases.AudioAttributesCompatParcelizer {
        private ConcreteBeanPropertyBase AudioAttributesImplApi26Parcelizer;
        private boolean IconCompatParcelizer;
        private Runnable MediaBrowserCompatCustomActionResultReceiver;
        private boolean write;
        private long RemoteActionCompatParcelizer = -1;
        private ArrayList<wrapAsJsonMappingException<onReceive>> AudioAttributesImplBaseParcelizer = null;
        private ArrayList<wrapAsJsonMappingException<onReceive>> MediaBrowserCompatItemReceiver = null;
        private int AudioAttributesImplApi21Parcelizer = 0;
        private wrapAsJsonMappingException<onReceive>[] AudioAttributesCompatParcelizer = null;
        private final aa MediaBrowserCompatMediaItem = new aa();

        IconCompatParcelizer() {
        }

        @Override // kotlin.onReceive
        public final long read() {
            return Transition.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        @Override // kotlin.onReceive
        public final boolean MediaBrowserCompatItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public final void AudioAttributesImplApi26Parcelizer() {
            this.IconCompatParcelizer = true;
            int i = this.AudioAttributesImplApi21Parcelizer;
            if (i == 1) {
                this.AudioAttributesImplApi21Parcelizer = 0;
                write();
            } else if (i == 2) {
                this.AudioAttributesImplApi21Parcelizer = 0;
                read(this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }

        @Override // kotlin.onReceive
        public final void read(long j) {
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j == this.RemoteActionCompatParcelizer || !MediaBrowserCompatItemReceiver()) {
                return;
            }
            if (!this.write) {
                if (j != 0 || this.RemoteActionCompatParcelizer <= 0) {
                    long j2 = read();
                    if (j == j2 && this.RemoteActionCompatParcelizer < j2) {
                        j = j2 + 1;
                    }
                } else {
                    j = -1;
                }
                long j3 = this.RemoteActionCompatParcelizer;
                if (j != j3) {
                    Transition.this.write(j, j3);
                    this.RemoteActionCompatParcelizer = j;
                }
            }
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(AnimationUtils.currentAnimationTimeMillis(), j);
        }

        final void RemoteActionCompatParcelizer() {
            long j = read() == 0 ? 1L : 0L;
            Transition.this.write(j, this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.GoogleConversionReporter1, androidx.transition.Transition.RemoteActionCompatParcelizer
        public final void AudioAttributesCompatParcelizer(Transition transition) {
            this.write = true;
        }

        @Override // o.findAliases.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(float f) {
            long jMax = Math.max(-1L, Math.min(read() + 1, Math.round(f)));
            Transition.this.write(jMax, this.RemoteActionCompatParcelizer);
            this.RemoteActionCompatParcelizer = jMax;
        }

        private void MediaBrowserCompatCustomActionResultReceiver() {
            if (this.AudioAttributesImplApi26Parcelizer != null) {
                return;
            }
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(AnimationUtils.currentAnimationTimeMillis(), this.RemoteActionCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer = new ConcreteBeanPropertyBase(new collectDefaultFromBundle());
            legacyManglePropertyName legacymanglepropertyname = new legacyManglePropertyName();
            legacymanglepropertyname.write();
            legacymanglepropertyname.AudioAttributesCompatParcelizer(200.0f);
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(legacymanglepropertyname);
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.AudioAttributesImplApi26Parcelizer.write(this);
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer());
            this.AudioAttributesImplApi26Parcelizer.write(read() + 1);
            this.AudioAttributesImplApi26Parcelizer.read();
            this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
            this.AudioAttributesImplApi26Parcelizer.write(new findAliases.write() { // from class: o.GoogleConversionPing
                @Override // o.findAliases.write
                public final void AudioAttributesCompatParcelizer(boolean z, float f) {
                    this.IconCompatParcelizer.IconCompatParcelizer(false, f);
                }
            });
        }

        public final /* synthetic */ void IconCompatParcelizer(boolean z, float f) {
            if (z) {
                return;
            }
            if (f < 1.0f) {
                long j = read();
                Transition transitionAudioAttributesCompatParcelizer = ((TransitionSet) Transition.this).AudioAttributesCompatParcelizer(0);
                Transition transition = transitionAudioAttributesCompatParcelizer.MediaDescriptionCompat;
                Transition.read(transitionAudioAttributesCompatParcelizer);
                Transition.this.write(-1L, this.RemoteActionCompatParcelizer);
                Transition.this.write(j, -1L);
                this.RemoteActionCompatParcelizer = j;
                Runnable runnable = this.MediaBrowserCompatCustomActionResultReceiver;
                if (runnable != null) {
                    runnable.run();
                }
                Transition.this.read.clear();
                if (transition != null) {
                    transition.read(AudioAttributesImplBaseParcelizer.read, true);
                    return;
                }
                return;
            }
            Transition.this.read(AudioAttributesImplBaseParcelizer.read, false);
        }

        @Override // kotlin.onReceive
        public final void write() {
            if (!this.IconCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer = 1;
                this.MediaBrowserCompatCustomActionResultReceiver = null;
            } else {
                MediaBrowserCompatCustomActionResultReceiver();
                this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(read() + 1);
            }
        }

        @Override // kotlin.onReceive
        public final void read(Runnable runnable) {
            this.MediaBrowserCompatCustomActionResultReceiver = runnable;
            if (!this.IconCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer = 2;
            } else {
                MediaBrowserCompatCustomActionResultReceiver();
                this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }
}
