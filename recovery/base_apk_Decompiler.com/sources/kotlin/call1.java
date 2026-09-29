package kotlin;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.resolveFully;

/* JADX INFO: loaded from: classes2.dex */
public abstract class call1 extends deserializeUsingCustom {
    private final AccessibilityManager AudioAttributesImplApi21Parcelizer;
    private RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final View MediaBrowserCompatItemReceiver;
    private static final Rect RemoteActionCompatParcelizer = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final resolveFully.RemoteActionCompatParcelizer<hasSuperClassStartingWith> read = new resolveFully.RemoteActionCompatParcelizer<hasSuperClassStartingWith>() { // from class: o.call1.3
        @Override // o.resolveFully.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ void read(hasSuperClassStartingWith hassuperclassstartingwith, Rect rect) {
            read2(hassuperclassstartingwith, rect);
        }

        /* JADX INFO: renamed from: read, reason: avoid collision after fix types in other method */
        private static void read2(hasSuperClassStartingWith hassuperclassstartingwith, Rect rect) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(rect);
        }
    };
    private static final resolveFully.IconCompatParcelizer<setSupportButtonTintList<hasSuperClassStartingWith>, hasSuperClassStartingWith> AudioAttributesCompatParcelizer = new resolveFully.IconCompatParcelizer<setSupportButtonTintList<hasSuperClassStartingWith>, hasSuperClassStartingWith>() { // from class: o.call1.4
        @Override // o.resolveFully.IconCompatParcelizer
        public final /* synthetic */ int IconCompatParcelizer(setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist) {
            return read(setsupportbuttontintlist);
        }

        @Override // o.resolveFully.IconCompatParcelizer
        public final /* synthetic */ hasSuperClassStartingWith read(setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist, int i) {
            return AudioAttributesCompatParcelizer(setsupportbuttontintlist, i);
        }

        private static hasSuperClassStartingWith AudioAttributesCompatParcelizer(setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist, int i) {
            return setsupportbuttontintlist.MediaBrowserCompatCustomActionResultReceiver(i);
        }

        private static int read(setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist) {
            return setsupportbuttontintlist.read();
        }
    };
    private final Rect MediaDescriptionCompat = new Rect();
    private final Rect MediaMetadataCompat = new Rect();
    private final Rect MediaBrowserCompatMediaItem = new Rect();
    private final int[] MediaBrowserCompatCustomActionResultReceiver = new int[2];
    int write = Integer.MIN_VALUE;
    int IconCompatParcelizer = Integer.MIN_VALUE;
    private int AudioAttributesImplBaseParcelizer = Integer.MIN_VALUE;

    private static int AudioAttributesImplApi21Parcelizer(int i) {
        if (i == 19) {
            return 33;
        }
        if (i == 21) {
            return 17;
        }
        if (i != 22) {
            return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        }
        return 66;
    }

    protected abstract int IconCompatParcelizer(float f, float f2);

    protected abstract boolean IconCompatParcelizer(int i, int i2, Bundle bundle);

    protected void RemoteActionCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
    }

    protected abstract void read(int i, hasSuperClassStartingWith hassuperclassstartingwith);

    protected void read(int i, boolean z) {
    }

    protected abstract void read(List<Integer> list);

    public call1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.MediaBrowserCompatItemReceiver = view;
        this.AudioAttributesImplApi21Parcelizer = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (InvalidTypeIdException.MediaBrowserCompatItemReceiver(view) == 0) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(view, 1);
        }
    }

    @Override // kotlin.deserializeUsingCustom
    public AccessorNamingStrategyProvider getAccessibilityNodeProvider(View view) {
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi26Parcelizer = new RemoteActionCompatParcelizer();
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        if (this.AudioAttributesImplApi21Parcelizer.isEnabled() && this.AudioAttributesImplApi21Parcelizer.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int iIconCompatParcelizer = IconCompatParcelizer(motionEvent.getX(), motionEvent.getY());
                MediaBrowserCompatCustomActionResultReceiver(iIconCompatParcelizer);
                if (iIconCompatParcelizer != Integer.MIN_VALUE) {
                    return true;
                }
            } else {
                if (action != 10 || this.AudioAttributesImplBaseParcelizer == Integer.MIN_VALUE) {
                    return false;
                }
                MediaBrowserCompatCustomActionResultReceiver(Integer.MIN_VALUE);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AudioAttributesCompatParcelizer(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5e
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L47
            r3 = 66
            if (r0 == r3) goto L37
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L37;
                default: goto L18;
            }
        L18:
            goto L5e
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5e
            int r0 = AudioAttributesImplApi21Parcelizer(r0)
            int r7 = r7.getRepeatCount()
            r3 = r1
        L28:
            int r5 = r7 + 1
            if (r1 >= r5) goto L36
            boolean r5 = r6.IconCompatParcelizer(r0, r4)
            if (r5 == 0) goto L36
            int r1 = r1 + 1
            r3 = r2
            goto L28
        L36:
            return r3
        L37:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5e
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5e
            r6.RemoteActionCompatParcelizer()
            return r2
        L47:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L53
            r7 = 2
            boolean r6 = r6.IconCompatParcelizer(r7, r4)
            return r6
        L53:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5e
            boolean r6 = r6.IconCompatParcelizer(r2, r4)
            return r6
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.call1.AudioAttributesCompatParcelizer(android.view.KeyEvent):boolean");
    }

    public final void read(boolean z, int i, Rect rect) {
        int i2 = this.IconCompatParcelizer;
        if (i2 != Integer.MIN_VALUE) {
            read(i2);
        }
        if (z) {
            IconCompatParcelizer(i, rect);
        }
    }

    public final int IconCompatParcelizer() {
        return this.write;
    }

    public final int write() {
        return this.IconCompatParcelizer;
    }

    private void AudioAttributesCompatParcelizer(int i, Rect rect) {
        IconCompatParcelizer(i).AudioAttributesCompatParcelizer(rect);
    }

    private boolean IconCompatParcelizer(int i, Rect rect) {
        hasSuperClassStartingWith hassuperclassstartingwith;
        setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist = read();
        int i2 = this.IconCompatParcelizer;
        hasSuperClassStartingWith hassuperclassstartingwithIconCompatParcelizer = i2 == Integer.MIN_VALUE ? null : setsupportbuttontintlist.IconCompatParcelizer(i2);
        if (i == 1 || i == 2) {
            hassuperclassstartingwith = (hasSuperClassStartingWith) resolveFully.write(setsupportbuttontintlist, AudioAttributesCompatParcelizer, read, hassuperclassstartingwithIconCompatParcelizer, i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.MediaBrowserCompatItemReceiver) == 1);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i3 = this.IconCompatParcelizer;
            if (i3 != Integer.MIN_VALUE) {
                AudioAttributesCompatParcelizer(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, i, rect2);
            }
            hassuperclassstartingwith = (hasSuperClassStartingWith) resolveFully.IconCompatParcelizer(setsupportbuttontintlist, AudioAttributesCompatParcelizer, read, hassuperclassstartingwithIconCompatParcelizer, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return AudioAttributesCompatParcelizer(hassuperclassstartingwith != null ? setsupportbuttontintlist.AudioAttributesCompatParcelizer(setsupportbuttontintlist.RemoteActionCompatParcelizer(hassuperclassstartingwith)) : Integer.MIN_VALUE);
    }

    private setSupportButtonTintList<hasSuperClassStartingWith> read() {
        ArrayList arrayList = new ArrayList();
        read(arrayList);
        setSupportButtonTintList<hasSuperClassStartingWith> setsupportbuttontintlist = new setSupportButtonTintList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            setsupportbuttontintlist.AudioAttributesCompatParcelizer(arrayList.get(i).intValue(), MediaBrowserCompatItemReceiver(arrayList.get(i).intValue()));
        }
        return setsupportbuttontintlist;
    }

    private static Rect IconCompatParcelizer(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i == 130) {
            rect.set(0, -1, width, -1);
            return rect;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private boolean RemoteActionCompatParcelizer() {
        int i = this.IconCompatParcelizer;
        return i != Integer.MIN_VALUE && IconCompatParcelizer(i, 16, (Bundle) null);
    }

    public final boolean write(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.AudioAttributesImplApi21Parcelizer.isEnabled() || (parent = this.MediaBrowserCompatItemReceiver.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.MediaBrowserCompatItemReceiver, AudioAttributesCompatParcelizer(i, i2));
    }

    public final void write(int i) {
        MediaBrowserCompatSearchResultReceiver(i);
    }

    private void MediaBrowserCompatSearchResultReceiver(int i) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.AudioAttributesImplApi21Parcelizer.isEnabled() || (parent = this.MediaBrowserCompatItemReceiver.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, 2048);
        findNameForRegularGetter.read(accessibilityEventAudioAttributesCompatParcelizer, 0);
        parent.requestSendAccessibilityEvent(this.MediaBrowserCompatItemReceiver, accessibilityEventAudioAttributesCompatParcelizer);
    }

    private void MediaBrowserCompatCustomActionResultReceiver(int i) {
        int i2 = this.AudioAttributesImplBaseParcelizer;
        if (i2 == i) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = i;
        write(i, 128);
        write(i2, 256);
    }

    private AccessibilityEvent AudioAttributesCompatParcelizer(int i, int i2) {
        if (i == -1) {
            return AudioAttributesImplApi26Parcelizer(i2);
        }
        return RemoteActionCompatParcelizer(i, i2);
    }

    private AccessibilityEvent AudioAttributesImplApi26Parcelizer(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.MediaBrowserCompatItemReceiver.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @Override // kotlin.deserializeUsingCustom
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    private AccessibilityEvent RemoteActionCompatParcelizer(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        hasSuperClassStartingWith hassuperclassstartingwithIconCompatParcelizer = IconCompatParcelizer(i);
        accessibilityEventObtain.getText().add(hassuperclassstartingwithIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver());
        accessibilityEventObtain.setContentDescription(hassuperclassstartingwithIconCompatParcelizer.MediaBrowserCompatItemReceiver());
        accessibilityEventObtain.setScrollable(hassuperclassstartingwithIconCompatParcelizer.onRewind());
        accessibilityEventObtain.setPassword(hassuperclassstartingwithIconCompatParcelizer.onSeekTo());
        accessibilityEventObtain.setEnabled(hassuperclassstartingwithIconCompatParcelizer.onPlayFromMediaId());
        accessibilityEventObtain.setChecked(hassuperclassstartingwithIconCompatParcelizer.onMediaButtonEvent());
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(hassuperclassstartingwithIconCompatParcelizer.AudioAttributesCompatParcelizer());
        forPOJO.IconCompatParcelizer(accessibilityEventObtain, this.MediaBrowserCompatItemReceiver, i);
        accessibilityEventObtain.setPackageName(this.MediaBrowserCompatItemReceiver.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    final hasSuperClassStartingWith IconCompatParcelizer(int i) {
        if (i == -1) {
            return AudioAttributesCompatParcelizer();
        }
        return MediaBrowserCompatItemReceiver(i);
    }

    private hasSuperClassStartingWith AudioAttributesCompatParcelizer() {
        hasSuperClassStartingWith hassuperclassstartingwith = hasSuperClassStartingWith.read(this.MediaBrowserCompatItemReceiver);
        InvalidTypeIdException.read(this.MediaBrowserCompatItemReceiver, hassuperclassstartingwith);
        ArrayList arrayList = new ArrayList();
        read(arrayList);
        if (hassuperclassstartingwith.write() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hassuperclassstartingwith.read(this.MediaBrowserCompatItemReceiver, ((Integer) arrayList.get(i)).intValue());
        }
        return hassuperclassstartingwith;
    }

    @Override // kotlin.deserializeUsingCustom
    public void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
        RemoteActionCompatParcelizer(hassuperclassstartingwith);
    }

    private hasSuperClassStartingWith MediaBrowserCompatItemReceiver(int i) {
        hasSuperClassStartingWith hassuperclassstartingwith = hasSuperClassStartingWith.read();
        hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(true);
        hassuperclassstartingwith.MediaDescriptionCompat(true);
        hassuperclassstartingwith.AudioAttributesCompatParcelizer("android.view.View");
        Rect rect = RemoteActionCompatParcelizer;
        hassuperclassstartingwith.RemoteActionCompatParcelizer(rect);
        hassuperclassstartingwith.IconCompatParcelizer(rect);
        hassuperclassstartingwith.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        read(i, hassuperclassstartingwith);
        if (hassuperclassstartingwith.MediaBrowserCompatSearchResultReceiver() == null && hassuperclassstartingwith.MediaBrowserCompatItemReceiver() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        hassuperclassstartingwith.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        if (this.MediaMetadataCompat.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iRemoteActionCompatParcelizer = hassuperclassstartingwith.RemoteActionCompatParcelizer();
        if ((iRemoteActionCompatParcelizer & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iRemoteActionCompatParcelizer & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(this.MediaBrowserCompatItemReceiver.getContext().getPackageName());
        hassuperclassstartingwith.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, i);
        if (this.write == i) {
            hassuperclassstartingwith.RemoteActionCompatParcelizer(true);
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(128);
        } else {
            hassuperclassstartingwith.RemoteActionCompatParcelizer(false);
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(64);
        }
        boolean z = this.IconCompatParcelizer == i;
        if (z) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(2);
        } else if (hassuperclassstartingwith.onPrepareFromSearch()) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(1);
        }
        hassuperclassstartingwith.MediaBrowserCompatMediaItem(z);
        this.MediaBrowserCompatItemReceiver.getLocationOnScreen(this.MediaBrowserCompatCustomActionResultReceiver);
        hassuperclassstartingwith.read(this.MediaDescriptionCompat);
        if (this.MediaDescriptionCompat.equals(rect)) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
            if (hassuperclassstartingwith.read != -1) {
                hasSuperClassStartingWith hassuperclassstartingwith2 = hasSuperClassStartingWith.read();
                for (int i2 = hassuperclassstartingwith.read; i2 != -1; i2 = hassuperclassstartingwith2.read) {
                    hassuperclassstartingwith2.write(this.MediaBrowserCompatItemReceiver, -1);
                    hassuperclassstartingwith2.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer);
                    read(i2, hassuperclassstartingwith2);
                    hassuperclassstartingwith2.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
                    this.MediaDescriptionCompat.offset(this.MediaMetadataCompat.left, this.MediaMetadataCompat.top);
                }
                hassuperclassstartingwith2.onSetCaptioningEnabled();
            }
            this.MediaDescriptionCompat.offset(this.MediaBrowserCompatCustomActionResultReceiver[0] - this.MediaBrowserCompatItemReceiver.getScrollX(), this.MediaBrowserCompatCustomActionResultReceiver[1] - this.MediaBrowserCompatItemReceiver.getScrollY());
        }
        if (this.MediaBrowserCompatItemReceiver.getLocalVisibleRect(this.MediaBrowserCompatMediaItem)) {
            this.MediaBrowserCompatMediaItem.offset(this.MediaBrowserCompatCustomActionResultReceiver[0] - this.MediaBrowserCompatItemReceiver.getScrollX(), this.MediaBrowserCompatCustomActionResultReceiver[1] - this.MediaBrowserCompatItemReceiver.getScrollY());
            if (this.MediaDescriptionCompat.intersect(this.MediaBrowserCompatMediaItem)) {
                hassuperclassstartingwith.IconCompatParcelizer(this.MediaDescriptionCompat);
                if (write(this.MediaDescriptionCompat)) {
                    hassuperclassstartingwith.onPlayFromMediaId(true);
                }
            }
        }
        return hassuperclassstartingwith;
    }

    final boolean AudioAttributesCompatParcelizer(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return IconCompatParcelizer(i2, bundle);
        }
        return RemoteActionCompatParcelizer(i, i2, bundle);
    }

    private boolean IconCompatParcelizer(int i, Bundle bundle) {
        return InvalidTypeIdException.write(this.MediaBrowserCompatItemReceiver, i, bundle);
    }

    private boolean RemoteActionCompatParcelizer(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return AudioAttributesCompatParcelizer(i);
        }
        if (i2 == 2) {
            return read(i);
        }
        if (i2 == 64) {
            return AudioAttributesImplBaseParcelizer(i);
        }
        if (i2 == 128) {
            return RemoteActionCompatParcelizer(i);
        }
        return IconCompatParcelizer(i, i2, bundle);
    }

    private boolean write(Rect rect) {
        if (rect == null || rect.isEmpty() || this.MediaBrowserCompatItemReceiver.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.MediaBrowserCompatItemReceiver.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private boolean AudioAttributesImplBaseParcelizer(int i) {
        int i2;
        if (!this.AudioAttributesImplApi21Parcelizer.isEnabled() || !this.AudioAttributesImplApi21Parcelizer.isTouchExplorationEnabled() || (i2 = this.write) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            RemoteActionCompatParcelizer(i2);
        }
        this.write = i;
        this.MediaBrowserCompatItemReceiver.invalidate();
        write(i, 32768);
        return true;
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        if (this.write != i) {
            return false;
        }
        this.write = Integer.MIN_VALUE;
        this.MediaBrowserCompatItemReceiver.invalidate();
        write(i, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer(int i) {
        int i2;
        if ((!this.MediaBrowserCompatItemReceiver.isFocused() && !this.MediaBrowserCompatItemReceiver.requestFocus()) || (i2 = this.IconCompatParcelizer) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            read(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.IconCompatParcelizer = i;
        read(i, true);
        write(i, 8);
        return true;
    }

    public final boolean read(int i) {
        if (this.IconCompatParcelizer != i) {
            return false;
        }
        this.IconCompatParcelizer = Integer.MIN_VALUE;
        read(i, false);
        write(i, 8);
        return true;
    }

    class RemoteActionCompatParcelizer extends AccessorNamingStrategyProvider {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final hasSuperClassStartingWith read(int i) {
            return hasSuperClassStartingWith.AudioAttributesCompatParcelizer(call1.this.IconCompatParcelizer(i));
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final boolean AudioAttributesCompatParcelizer(int i, int i2, Bundle bundle) {
            return call1.this.AudioAttributesCompatParcelizer(i, i2, bundle);
        }

        @Override // kotlin.AccessorNamingStrategyProvider
        public final hasSuperClassStartingWith RemoteActionCompatParcelizer(int i) {
            int i2 = i == 2 ? call1.this.write : call1.this.IconCompatParcelizer;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return read(i2);
        }
    }
}
