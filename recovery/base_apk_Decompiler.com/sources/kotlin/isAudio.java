package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.AccessorNamingStrategy;
import kotlin.calculateNextSearchBytePosition;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
final class isAudio extends getMimeTypeFromTag {
    private static final boolean AudioAttributesCompatParcelizer = true;
    private AutoCompleteTextView AudioAttributesImplApi21Parcelizer;
    private final TimeInterpolator AudioAttributesImplApi26Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private AccessibilityManager MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private ValueAnimator MediaBrowserCompatSearchResultReceiver;
    private final View.OnClickListener MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ValueAnimator MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private boolean onAddQueueItem;
    private final View.OnFocusChangeListener onCommand;
    private final AccessorNamingStrategy.IconCompatParcelizer onCustomAction;

    @Override // kotlin.getMimeTypeFromTag
    final boolean MediaMetadataCompat() {
        return true;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean ab_() {
        return true;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean onCommand() {
        return true;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean write(int i) {
        return i != 0;
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(boolean z) {
        this.MediaMetadataCompat = z;
        handleMediaPlayPauseIfPendingOnHandler();
        if (z) {
            return;
        }
        write(false);
        this.MediaBrowserCompatMediaItem = false;
    }

    final /* synthetic */ void IconCompatParcelizer(boolean z) {
        AutoCompleteTextView autoCompleteTextView = this.AudioAttributesImplApi21Parcelizer;
        if (autoCompleteTextView == null || StreamFormatChunk.read(autoCompleteTextView)) {
            return;
        }
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this.write, z ? 2 : 1);
    }

    isAudio(parseBitmapInfoHeader parsebitmapinfoheader) {
        super(parsebitmapinfoheader);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new View.OnClickListener() { // from class: o.getMimeTypeFromCompression
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.RemoteActionCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            }
        };
        this.onCommand = new View.OnFocusChangeListener() { // from class: o.ListChunk
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                this.write.RemoteActionCompatParcelizer(z);
            }
        };
        this.onCustomAction = new AccessorNamingStrategy.IconCompatParcelizer() { // from class: o.createBox
            @Override // o.AccessorNamingStrategy.IconCompatParcelizer
            public final void read(boolean z) {
                this.write.IconCompatParcelizer(z);
            }
        };
        this.RatingCompat = Long.MAX_VALUE;
        this.AudioAttributesImplBaseParcelizer = getSampleRateLookupKey.write(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3, 67);
        this.MediaBrowserCompatItemReceiver = getSampleRateLookupKey.write(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3, 50);
        this.AudioAttributesImplApi26Parcelizer = getSampleRateLookupKey.read(parsebitmapinfoheader.getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingLinearInterpolator, BinarySearchSeekerSeekOperationParams.write);
    }

    @Override // kotlin.getMimeTypeFromTag
    final void MediaBrowserCompatCustomActionResultReceiver() {
        onCustomAction();
        this.MediaBrowserCompatCustomActionResultReceiver = (AccessibilityManager) this.RemoteActionCompatParcelizer.getSystemService("accessibility");
    }

    @Override // kotlin.getMimeTypeFromTag
    final void RatingCompat() {
        AutoCompleteTextView autoCompleteTextView = this.AudioAttributesImplApi21Parcelizer;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (AudioAttributesCompatParcelizer) {
                this.AudioAttributesImplApi21Parcelizer.setOnDismissListener(null);
            }
        }
    }

    @Override // kotlin.getMimeTypeFromTag
    public final AccessorNamingStrategy.IconCompatParcelizer aa_() {
        return this.onCustomAction;
    }

    @Override // kotlin.getMimeTypeFromTag
    final int AudioAttributesCompatParcelizer() {
        return AudioAttributesCompatParcelizer ? calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_dropdown_arrow : calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_ic_arrow_drop_down;
    }

    @Override // kotlin.getMimeTypeFromTag
    final int RemoteActionCompatParcelizer() {
        return calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.exposed_dropdown_menu_content_description;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean MediaDescriptionCompat() {
        return this.onAddQueueItem;
    }

    @Override // kotlin.getMimeTypeFromTag
    final boolean ac_() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnClickListener IconCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.getMimeTypeFromTag
    public final void AudioAttributesCompatParcelizer(EditText editText) {
        this.AudioAttributesImplApi21Parcelizer = read(editText);
        onFastForward();
        this.IconCompatParcelizer.setErrorIconDrawable((Drawable) null);
        if (!StreamFormatChunk.read(editText) && this.MediaBrowserCompatCustomActionResultReceiver.isTouchExplorationEnabled()) {
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this.write, 2);
        }
        this.IconCompatParcelizer.setEndIconVisible(true);
    }

    @Override // kotlin.getMimeTypeFromTag
    public final void read() {
        if (this.MediaBrowserCompatCustomActionResultReceiver.isTouchExplorationEnabled() && StreamFormatChunk.read(this.AudioAttributesImplApi21Parcelizer) && !this.write.hasFocus()) {
            this.AudioAttributesImplApi21Parcelizer.dismissDropDown();
        }
        this.AudioAttributesImplApi21Parcelizer.post(new Runnable() { // from class: o.getChild
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
            }
        });
    }

    final /* synthetic */ void MediaBrowserCompatMediaItem() {
        boolean zIsPopupShowing = this.AudioAttributesImplApi21Parcelizer.isPopupShowing();
        write(zIsPopupShowing);
        this.MediaBrowserCompatMediaItem = zIsPopupShowing;
    }

    @Override // kotlin.getMimeTypeFromTag
    final View.OnFocusChangeListener write() {
        return this.onCommand;
    }

    @Override // kotlin.getMimeTypeFromTag
    public final void IconCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
        if (!StreamFormatChunk.read(this.AudioAttributesImplApi21Parcelizer)) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) Spinner.class.getName());
        }
        if (hassuperclassstartingwith.onRemoveQueueItem()) {
            hassuperclassstartingwith.read((CharSequence) null);
        }
    }

    @Override // kotlin.getMimeTypeFromTag
    public final void write(AccessibilityEvent accessibilityEvent) {
        if (!this.MediaBrowserCompatCustomActionResultReceiver.isEnabled() || StreamFormatChunk.read(this.AudioAttributesImplApi21Parcelizer)) {
            return;
        }
        boolean z = accessibilityEvent.getEventType() == 32768 && this.onAddQueueItem && !this.AudioAttributesImplApi21Parcelizer.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            MediaBrowserCompatSearchResultReceiver();
            onPlay();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onPause, reason: merged with bridge method [inline-methods] */
    public void MediaBrowserCompatSearchResultReceiver() {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            return;
        }
        if (onPlayFromMediaId()) {
            this.MediaBrowserCompatMediaItem = false;
        }
        if (!this.MediaBrowserCompatMediaItem) {
            if (AudioAttributesCompatParcelizer) {
                write(!this.onAddQueueItem);
            } else {
                this.onAddQueueItem = !this.onAddQueueItem;
                handleMediaPlayPauseIfPendingOnHandler();
            }
            if (this.onAddQueueItem) {
                this.AudioAttributesImplApi21Parcelizer.requestFocus();
                this.AudioAttributesImplApi21Parcelizer.showDropDown();
                return;
            } else {
                this.AudioAttributesImplApi21Parcelizer.dismissDropDown();
                return;
            }
        }
        this.MediaBrowserCompatMediaItem = false;
    }

    private void onFastForward() {
        this.AudioAttributesImplApi21Parcelizer.setOnTouchListener(new View.OnTouchListener() { // from class: o.onChunkStart
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(motionEvent);
            }
        });
        if (AudioAttributesCompatParcelizer) {
            this.AudioAttributesImplApi21Parcelizer.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: o.isVideo
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    this.AudioAttributesCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            });
        }
        this.AudioAttributesImplApi21Parcelizer.setThreshold(0);
    }

    final /* synthetic */ boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (onPlayFromMediaId()) {
                this.MediaBrowserCompatMediaItem = false;
            }
            MediaBrowserCompatSearchResultReceiver();
            onPlay();
        }
        return false;
    }

    final /* synthetic */ void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        onPlay();
        write(false);
    }

    private boolean onPlayFromMediaId() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.RatingCompat;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    private static AutoCompleteTextView read(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        return (AutoCompleteTextView) editText;
    }

    private void onPlay() {
        this.MediaBrowserCompatMediaItem = true;
        this.RatingCompat = System.currentTimeMillis();
    }

    private void write(boolean z) {
        if (this.onAddQueueItem != z) {
            this.onAddQueueItem = z;
            this.MediaDescriptionCompat.cancel();
            this.MediaBrowserCompatSearchResultReceiver.start();
        }
    }

    private void onCustomAction() {
        this.MediaDescriptionCompat = write(this.AudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED, 1.0f);
        ValueAnimator valueAnimatorWrite = write(this.MediaBrowserCompatItemReceiver, 1.0f, BitmapDescriptorFactory.HUE_RED);
        this.MediaBrowserCompatSearchResultReceiver = valueAnimatorWrite;
        valueAnimatorWrite.addListener(new AnimatorListenerAdapter() { // from class: o.isAudio.5
            private static int AudioAttributesCompatParcelizer;
            private static int RemoteActionCompatParcelizer;
            private static int[] read;
            private static long write;
            private static final byte[] $$c = {19, -74, 60, -114};
            private static final int $$d = 25;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {19, -74, 60, -114, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
            private static final int $$b = 28;
            private static final byte[] MediaBrowserCompatCustomActionResultReceiver = {64, -102, 72, -66, 13, -10, 14, -3, -6, -5, -54, 72, -13, -4, 18, -73, 29, 26, 20, -52, TarConstants.LF_LINK, -17, 9, 6, 1, 3, -5, -12, 11, -3, 17, -21, -24, 24, 15, -19, -14, 33, -19, 19, -15, 13, -10, 14, -3, -6, -5, -54, 73, -14, -5, 3, -2, 15, -70, 23, TarConstants.LF_CHR, -8, -15, 13, -10, -3, 1, 10, -7, -25, 29, 10, 1, -30, 19, -4, 18, -2, 15, -36, 17, 2, 8, -6, -1, -20, 31, 4, -10, 11, -11, 6, -1, -43, 37, 1, 3, -8, -9, 21, -21, -51, 62, -11, 13, -7, -57, 37, 33, -2, -9, 5, -7, -3, -4, -3, 11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 27, 37, 6, -15, 2, -2, 13, -21, 11, 9, -16, -22, 23, 5, 6, -30, 11, 11, 9, -16, -2, 15, -36, 17, 2, 8, -6, -1, -20, 31, 4, -10, 11, -11, 6, -1, -26, 37, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 38, 20, 10, -3, 8, -22, 1, 10, -7, -2, 15, -49, 30, 20, -2, -14, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -9, 21, -21, -51, 62, -11, 13, -7, -57, 30, 35, -1, -7, 5, -9, -11, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 19, 34, 0, 2, 14, 0, -10, -7, 10, -7, -22, 19, 8, -5, -2, 17, -14, 15, -51, 34, 0, 2, 14, 0, -10, -7, 10, -7, -9, 21, -21, -51, 62, -11, 13, -7, -57, 68, -13, 1, 6, -7, -2, 17, -70, 31, 24, 15, -12, 7, -11, 5, 8, -7, -4, -6, -15, 30, -9, 21, -21, -51, 62, -11, 13, -7, -57, 33, 19, 8, -5, -2, 17, -57};
            private static final int AudioAttributesImplBaseParcelizer = 5;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static java.lang.String $$e(short r6, short r7, byte r8) {
                /*
                    int r7 = r7 * 4
                    int r7 = r7 + 4
                    int r8 = r8 * 3
                    int r8 = 104 - r8
                    int r6 = r6 * 3
                    int r0 = r6 + 1
                    byte[] r1 = kotlin.isAudio.AnonymousClass5.$$c
                    byte[] r0 = new byte[r0]
                    r2 = 0
                    if (r1 != 0) goto L17
                    r3 = r8
                    r4 = r2
                    r8 = r7
                    goto L2d
                L17:
                    r3 = r2
                L18:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                    byte r4 = (byte) r7
                    r0[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L28
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r0, r2)
                    return r6
                L28:
                    r3 = r1[r8]
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L2d:
                    int r7 = r7 + 1
                    int r3 = -r3
                    int r8 = r8 + r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.isAudio.AnonymousClass5.$$e(short, short, byte):java.lang.String");
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(byte r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 * 3
                    int r8 = 73 - r8
                    byte[] r0 = kotlin.isAudio.AnonymousClass5.$$a
                    int r7 = r7 * 2
                    int r1 = 20 - r7
                    int r6 = r6 * 2
                    int r6 = 4 - r6
                    byte[] r1 = new byte[r1]
                    int r7 = 19 - r7
                    r2 = 0
                    if (r0 != 0) goto L18
                    r3 = r7
                    r4 = r2
                    goto L2e
                L18:
                    r3 = r2
                L19:
                    byte r4 = (byte) r8
                    r1[r3] = r4
                    if (r3 != r7) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    int r3 = r3 + 1
                    r4 = r0[r6]
                    r5 = r3
                    r3 = r8
                    r8 = r4
                    r4 = r5
                L2e:
                    int r8 = -r8
                    int r8 = r8 + r3
                    int r6 = r6 + 1
                    r3 = r4
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.isAudio.AnonymousClass5.d(byte, int, short, java.lang.Object[]):void");
            }

            private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
                buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
                char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
                buildsetrequirementsintent.write = 4;
                while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                    buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                    int i2 = buildsetrequirementsintent.write;
                    try {
                        Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getMode(0), KeyEvent.normalizeMetaState(0) + 12424, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                        }
                        cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 1868 - Color.blue(0), Drawable.resolveOpacity(0, 0) + 10, 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
            }

            private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = read;
                long j = 0;
                int i4 = -470782045;
                int i5 = 43695;
                int i6 = 0;
                if (iArr2 != null) {
                    int i7 = $11 + 115;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i9 = 0;
                    while (i9 < length) {
                        int i10 = $11 + 57;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.makeMeasureSpec(0, 0) + i5), (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 23296, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                            i9++;
                            j = 0;
                            i5 = 43695;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = read;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i12 = 0;
                    while (i12 < length3) {
                        int i13 = $11 + 81;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = Integer.valueOf(iArr5[i12]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i4);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43695), AndroidCharacter.getMirror('0') + 23249, 14 - MotionEvent.axisFromString(""), -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(iArr5[i12])};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (ViewConfiguration.getLongPressTimeout() >> 16)), 23297 - Color.argb(0, 0, 0, 0), 15 - TextUtils.getCapsMode("", 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                        }
                        i12++;
                        i4 = -470782045;
                        i6 = 0;
                    }
                    i2 = i6;
                    iArr5 = iArr6;
                } else {
                    i2 = 0;
                }
                System.arraycopy(iArr5, i2, iArr4, i2, length2);
                buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
                while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                    cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                    cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                    cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                    cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                    buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                    buildRemoveAllDownloadsIntent.read(iArr4);
                    int i14 = 0;
                    for (int i15 = 16; i14 < i15; i15 = 16) {
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i14];
                        Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.alpha(0) + 43695), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23296, '?' - AndroidCharacter.getMirror('0'), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                        buildremovealldownloadsintent.read = iIntValue;
                        i14++;
                    }
                    int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = i16;
                    buildremovealldownloadsintent.read ^= iArr4[16];
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
                    int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                    int i18 = buildremovealldownloadsintent.read;
                    cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
                    cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                    cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
                    cArr[3] = (char) buildremovealldownloadsintent.read;
                    buildRemoveAllDownloadsIntent.read(iArr4);
                    cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
                    cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
                    cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
                    cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
                    Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 48194), 20126 - TextUtils.getCapsMode("", 0, 0), 20 - Color.red(0), 1620047497, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    i2 = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                int i = 2 % 2;
                int i2 = AudioAttributesCompatParcelizer + 73;
                RemoteActionCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    isAudio.this.handleMediaPlayPauseIfPendingOnHandler();
                    isAudio.this.MediaDescriptionCompat.start();
                } else {
                    isAudio.this.handleMediaPlayPauseIfPendingOnHandler();
                    isAudio.this.MediaDescriptionCompat.start();
                    throw null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:197:0x078d  */
            /* JADX WARN: Removed duplicated region for block: B:261:0x079b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0264 A[Catch: all -> 0x0461, TryCatch #2 {all -> 0x0461, blocks: (B:31:0x0246, B:45:0x025e, B:47:0x0264, B:48:0x0265, B:51:0x0271, B:53:0x02ab, B:52:0x0286, B:55:0x02bc, B:57:0x0309, B:59:0x030d, B:61:0x0313, B:62:0x0314, B:63:0x0315, B:69:0x033d, B:70:0x034e, B:71:0x034f, B:72:0x0383, B:74:0x03e1, B:76:0x03e6, B:78:0x03ec, B:79:0x03ed, B:80:0x03ee, B:87:0x0410, B:90:0x0426, B:91:0x0440, B:73:0x0397, B:56:0x02cf), top: B:210:0x0246, inners: #5, #8 }] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0265 A[Catch: all -> 0x0461, TryCatch #2 {all -> 0x0461, blocks: (B:31:0x0246, B:45:0x025e, B:47:0x0264, B:48:0x0265, B:51:0x0271, B:53:0x02ab, B:52:0x0286, B:55:0x02bc, B:57:0x0309, B:59:0x030d, B:61:0x0313, B:62:0x0314, B:63:0x0315, B:69:0x033d, B:70:0x034e, B:71:0x034f, B:72:0x0383, B:74:0x03e1, B:76:0x03e6, B:78:0x03ec, B:79:0x03ed, B:80:0x03ee, B:87:0x0410, B:90:0x0426, B:91:0x0440, B:73:0x0397, B:56:0x02cf), top: B:210:0x0246, inners: #5, #8 }] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public static void RemoteActionCompatParcelizer(android.content.Context r22, long r23, long r25) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2383
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.isAudio.AnonymousClass5.RemoteActionCompatParcelizer(android.content.Context, long, long):void");
            }

            static {
                RemoteActionCompatParcelizer();
                AudioAttributesCompatParcelizer = 0;
                RemoteActionCompatParcelizer = 1;
                read = new int[]{167128113, 1524723807, 1084611664, -424493691, -1234811995, -706430559, -1783802808, 1571105982, 503311700, -506283260, 812609202, -1806038357, -2009126530, 1897983200, -422494215, -1452963250, -2037028824, 285570042};
            }

            static void RemoteActionCompatParcelizer() {
                write = -9136062141279394611L;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(short r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    int r8 = r8 + 4
                    int r9 = r9 + 4
                    int r7 = 118 - r7
                    byte[] r0 = kotlin.isAudio.AnonymousClass5.MediaBrowserCompatCustomActionResultReceiver
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L11
                    r7 = r8
                    r3 = r9
                    r4 = r2
                    goto L26
                L11:
                    r3 = r2
                L12:
                    int r4 = r3 + 1
                    byte r5 = (byte) r7
                    r1[r3] = r5
                    if (r4 != r8) goto L21
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L21:
                    r3 = r0[r9]
                    r6 = r3
                    r3 = r9
                    r9 = r6
                L26:
                    int r7 = r7 + r9
                    int r9 = r3 + 1
                    r3 = r4
                    goto L12
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.isAudio.AnonymousClass5.a(short, byte, short, java.lang.Object[]):void");
            }
        });
    }

    private ValueAnimator write(int i, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.AudioAttributesImplApi26Parcelizer);
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.isCurrentFrameAKeyFrame
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.IconCompatParcelizer.write(valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    final /* synthetic */ void write(ValueAnimator valueAnimator) {
        this.write.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
