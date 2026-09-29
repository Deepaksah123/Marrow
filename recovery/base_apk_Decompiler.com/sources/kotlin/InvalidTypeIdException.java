package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.NioPathSerializer;
import kotlin._byteOverflow;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes.dex */
public class InvalidTypeIdException {
    private static WeakHashMap<View, findTransient> IconCompatParcelizer;
    private static final int[] RemoteActionCompatParcelizer = {_byteOverflow.IconCompatParcelizer.accessibility_custom_action_0, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_1, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_2, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_3, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_4, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_5, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_6, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_7, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_8, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_9, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_10, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_11, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_12, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_13, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_14, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_15, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_16, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_17, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_18, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_19, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_20, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_21, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_22, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_23, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_24, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_25, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_26, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_27, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_28, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_29, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_30, _byteOverflow.IconCompatParcelizer.accessibility_custom_action_31};
    private static final finishRootArray AudioAttributesCompatParcelizer = new finishRootArray() { // from class: o.InvalidNullException
        @Override // kotlin.finishRootArray
        public final StringDeserializer RemoteActionCompatParcelizer(StringDeserializer stringDeserializer) {
            return InvalidTypeIdException.read(stringDeserializer);
        }
    };
    private static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

    static /* synthetic */ StringDeserializer read(StringDeserializer stringDeserializer) {
        return stringDeserializer;
    }

    static boolean write(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void IconCompatParcelizer(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(view, context, iArr, attributeSet, typedArray, i, i2);
    }

    @Deprecated
    public static void read(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
        view.onInitializeAccessibilityNodeInfo(hassuperclassstartingwith.onSetRating());
    }

    public static void AudioAttributesCompatParcelizer(View view, deserializeUsingCustom deserializeusingcustom) {
        if (deserializeusingcustom == null && (onSetShuffleMode(view) instanceof deserializeUsingCustom.write)) {
            deserializeusingcustom = new deserializeUsingCustom();
        }
        setSessionImpl(view);
        view.setAccessibilityDelegate(deserializeusingcustom == null ? null : deserializeusingcustom.getBridge());
    }

    public static int MediaMetadataCompat(View view) {
        return MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(view);
    }

    public static void MediaBrowserCompatCustomActionResultReceiver(View view, int i) {
        MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(view, i);
    }

    public static boolean onPrepareFromSearch(View view) {
        return onSetShuffleMode(view) != null;
    }

    public static deserializeUsingCustom RemoteActionCompatParcelizer(View view) {
        View.AccessibilityDelegate accessibilityDelegateOnSetShuffleMode = onSetShuffleMode(view);
        if (accessibilityDelegateOnSetShuffleMode == null) {
            return null;
        }
        if (accessibilityDelegateOnSetShuffleMode instanceof deserializeUsingCustom.write) {
            return ((deserializeUsingCustom.write) accessibilityDelegateOnSetShuffleMode).write;
        }
        return new deserializeUsingCustom(accessibilityDelegateOnSetShuffleMode);
    }

    static void IconCompatParcelizer(View view) {
        deserializeUsingCustom deserializeusingcustomRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        if (deserializeusingcustomRemoteActionCompatParcelizer == null) {
            deserializeusingcustomRemoteActionCompatParcelizer = new deserializeUsingCustom();
        }
        AudioAttributesCompatParcelizer(view, deserializeusingcustomRemoteActionCompatParcelizer);
    }

    private static View.AccessibilityDelegate onSetShuffleMode(View view) {
        return AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(view);
    }

    @Deprecated
    public static boolean onPrepare(View view) {
        return view.hasTransientState();
    }

    @Deprecated
    public static void onRemoveQueueItem(View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void AudioAttributesCompatParcelizer(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @Deprecated
    public static void read(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Deprecated
    public static int MediaBrowserCompatItemReceiver(View view) {
        return view.getImportantForAccessibility();
    }

    @Deprecated
    public static void AudioAttributesImplBaseParcelizer(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Deprecated
    public static boolean write(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static boolean read(View view, int i) {
        int i2 = intFromChars.read(i);
        if (i2 == -1) {
            return false;
        }
        return view.performHapticFeedback(i2);
    }

    public static int RemoteActionCompatParcelizer(View view, CharSequence charSequence, modifyFieldName modifyfieldname) {
        int iIconCompatParcelizer = IconCompatParcelizer(view, charSequence);
        if (iIconCompatParcelizer != -1) {
            read(view, new hasSuperClassStartingWith.read(iIconCompatParcelizer, charSequence, modifyfieldname));
        }
        return iIconCompatParcelizer;
    }

    private static int IconCompatParcelizer(View view, CharSequence charSequence) {
        List<hasSuperClassStartingWith.read> listOnSetRating = onSetRating(view);
        for (int i = 0; i < listOnSetRating.size(); i++) {
            if (TextUtils.equals(charSequence, listOnSetRating.get(i).IconCompatParcelizer())) {
                return listOnSetRating.get(i).RemoteActionCompatParcelizer();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = RemoteActionCompatParcelizer;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < listOnSetRating.size(); i5++) {
                z &= listOnSetRating.get(i5).RemoteActionCompatParcelizer() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    public static void IconCompatParcelizer(View view, hasSuperClassStartingWith.read readVar, CharSequence charSequence, modifyFieldName modifyfieldname) {
        if (modifyfieldname == null && charSequence == null) {
            RemoteActionCompatParcelizer(view, readVar.RemoteActionCompatParcelizer());
        } else {
            read(view, readVar.AudioAttributesCompatParcelizer(charSequence, modifyfieldname));
        }
    }

    private static void read(View view, hasSuperClassStartingWith.read readVar) {
        IconCompatParcelizer(view);
        AudioAttributesCompatParcelizer(readVar.RemoteActionCompatParcelizer(), view);
        onSetRating(view).add(readVar);
        write(view, 0);
    }

    public static void RemoteActionCompatParcelizer(View view, int i) {
        AudioAttributesCompatParcelizer(i, view);
        write(view, 0);
    }

    private static void AudioAttributesCompatParcelizer(int i, View view) {
        List<hasSuperClassStartingWith.read> listOnSetRating = onSetRating(view);
        for (int i2 = 0; i2 < listOnSetRating.size(); i2++) {
            if (listOnSetRating.get(i2).RemoteActionCompatParcelizer() == i) {
                listOnSetRating.remove(i2);
                return;
            }
        }
    }

    private static List<hasSuperClassStartingWith.read> onSetRating(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(_byteOverflow.IconCompatParcelizer.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(_byteOverflow.IconCompatParcelizer.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void RemoteActionCompatParcelizer(View view, CharSequence charSequence) {
        RemoteActionCompatParcelizer().write(view, charSequence);
    }

    public static CharSequence onAddQueueItem(View view) {
        return RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(view);
    }

    @Deprecated
    public static void MediaBrowserCompatItemReceiver(View view, int i) {
        view.setLabelFor(i);
    }

    @Deprecated
    public static void IconCompatParcelizer(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static int MediaBrowserCompatMediaItem(View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    public static ViewParent onCustomAction(View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static void AudioAttributesImplApi21Parcelizer(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @Deprecated
    public static int onCommand(View view) {
        return view.getPaddingStart();
    }

    @Deprecated
    public static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    public static void read(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    @Deprecated
    public static int MediaBrowserCompatSearchResultReceiver(View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    public static int RatingCompat(View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static findTransient AudioAttributesCompatParcelizer(View view) {
        if (IconCompatParcelizer == null) {
            IconCompatParcelizer = new WeakHashMap<>();
        }
        findTransient findtransient = IconCompatParcelizer.get(view);
        if (findtransient != null) {
            return findtransient;
        }
        findTransient findtransient2 = new findTransient(view);
        IconCompatParcelizer.put(view, findtransient2);
        return findtransient2;
    }

    public static void write(View view, float f) {
        write.write(view, f);
    }

    public static float AudioAttributesImplBaseParcelizer(View view) {
        return write.write(view);
    }

    public static void IconCompatParcelizer(View view, float f) {
        write.IconCompatParcelizer(view, f);
    }

    public static float onPlay(View view) {
        return write.IconCompatParcelizer(view);
    }

    public static void RemoteActionCompatParcelizer(View view, String str) {
        write.write(view, str);
    }

    public static String onMediaButtonEvent(View view) {
        return write.read(view);
    }

    public static void write(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        AnnotatedAndMetadata.AudioAttributesCompatParcelizer((View) view.getParent(), viewGroup);
    }

    @Deprecated
    public static int onPause(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void onSetRepeatMode(View view) {
        read.AudioAttributesCompatParcelizer(view);
    }

    @Deprecated
    public static boolean MediaBrowserCompatCustomActionResultReceiver(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void AudioAttributesCompatParcelizer(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void read(View view, finishBranchObject finishbranchobject) {
        write.RemoteActionCompatParcelizer(view, finishbranchobject);
    }

    public static WindowInsetsCompat AudioAttributesCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsMediaBrowserCompatMediaItem = windowInsetsCompat.MediaBrowserCompatMediaItem();
        if (windowInsetsMediaBrowserCompatMediaItem != null) {
            WindowInsets windowInsetsIconCompatParcelizer = read.IconCompatParcelizer(view, windowInsetsMediaBrowserCompatMediaItem);
            if (!windowInsetsIconCompatParcelizer.equals(windowInsetsMediaBrowserCompatMediaItem)) {
                return WindowInsetsCompat.write(windowInsetsIconCompatParcelizer, view);
            }
        }
        return windowInsetsCompat;
    }

    public static WindowInsetsCompat write(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets windowInsetsAudioAttributesCompatParcelizer;
        WindowInsets windowInsetsMediaBrowserCompatMediaItem = windowInsetsCompat.MediaBrowserCompatMediaItem();
        if (windowInsetsMediaBrowserCompatMediaItem != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsAudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver.write(view, windowInsetsMediaBrowserCompatMediaItem);
            } else {
                windowInsetsAudioAttributesCompatParcelizer = read.AudioAttributesCompatParcelizer(view, windowInsetsMediaBrowserCompatMediaItem);
            }
            if (!windowInsetsAudioAttributesCompatParcelizer.equals(windowInsetsMediaBrowserCompatMediaItem)) {
                return WindowInsetsCompat.write(windowInsetsAudioAttributesCompatParcelizer, view);
            }
        }
        return windowInsetsCompat;
    }

    public static WindowInsetsCompat handleMediaPlayPauseIfPendingOnHandler(View view) {
        return AudioAttributesCompatParcelizer.write(view);
    }

    public static WindowInsetsCompat AudioAttributesCompatParcelizer(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        return write.read(view, windowInsetsCompat, rect);
    }

    @Deprecated
    public static findNameForMutator onFastForward(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return MediaBrowserCompatItemReceiver.IconCompatParcelizer(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return _IsXOfY.IconCompatParcelizer(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void IconCompatParcelizer(View view, NioPathSerializer.read readVar) {
        NioPathSerializer.IconCompatParcelizer(view, readVar);
    }

    public static String[] MediaDescriptionCompat(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return MediaBrowserCompatSearchResultReceiver.write(view);
        }
        return (String[]) view.getTag(_byteOverflow.IconCompatParcelizer.tag_on_receive_content_mime_types);
    }

    public static StringDeserializer read(View view, StringDeserializer stringDeserializer) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(stringDeserializer);
            view.getClass().getSimpleName();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(view, stringDeserializer);
        }
        finishBranchArray finishbrancharray = (finishBranchArray) view.getTag(_byteOverflow.IconCompatParcelizer.tag_on_receive_content_listener);
        if (finishbrancharray != null) {
            StringDeserializer stringDeserializer2 = finishbrancharray.read(view, stringDeserializer);
            if (stringDeserializer2 == null) {
                return null;
            }
            return onSetPlaybackSpeed(view).RemoteActionCompatParcelizer(stringDeserializer2);
        }
        return onSetPlaybackSpeed(view).RemoteActionCompatParcelizer(stringDeserializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static finishRootArray onSetPlaybackSpeed(View view) {
        if (view instanceof finishRootArray) {
            return (finishRootArray) view;
        }
        return AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class MediaBrowserCompatSearchResultReceiver {
        public static String[] write(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static StringDeserializer IconCompatParcelizer(View view, StringDeserializer stringDeserializer) {
            ContentInfo contentInfoCt_ = stringDeserializer.ct_();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoCt_);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoCt_ ? stringDeserializer : StringDeserializer.cs_(contentInfoPerformReceiveContent);
        }
    }

    @Deprecated
    public static boolean onRewind(View view) {
        return view.isPaddingRelative();
    }

    @Deprecated
    public static void read(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList write(View view) {
        return write.AudioAttributesCompatParcelizer(view);
    }

    public static void RemoteActionCompatParcelizer(View view, ColorStateList colorStateList) {
        write.write(view, colorStateList);
    }

    public static PorterDuff.Mode AudioAttributesImplApi21Parcelizer(View view) {
        return write.RemoteActionCompatParcelizer(view);
    }

    public static void AudioAttributesCompatParcelizer(View view, PorterDuff.Mode mode) {
        write.write(view, mode);
    }

    public static void RemoteActionCompatParcelizer(View view, boolean z) {
        write.write(view, z);
    }

    public static boolean onRemoveQueueItemAt(View view) {
        return write.AudioAttributesImplApi21Parcelizer(view);
    }

    public static void onSetCaptioningEnabled(View view) {
        write.MediaBrowserCompatCustomActionResultReceiver(view);
    }

    @Deprecated
    public static boolean onSeekTo(View view) {
        return view.isLaidOut();
    }

    public static float onPlayFromMediaId(View view) {
        return write.AudioAttributesImplApi26Parcelizer(view);
    }

    public static void RemoteActionCompatParcelizer(View view, float f) {
        write.AudioAttributesCompatParcelizer(view, f);
    }

    public static void IconCompatParcelizer(View view, int i) {
        view.offsetTopAndBottom(i);
    }

    public static void AudioAttributesCompatParcelizer(View view, int i) {
        view.offsetLeftAndRight(i);
    }

    @Deprecated
    public static void IconCompatParcelizer(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    @Deprecated
    public static boolean onPlayFromSearch(View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    public static boolean onPrepareFromMediaId(View view) {
        return view.hasOnClickListeners();
    }

    public static void RemoteActionCompatParcelizer(View view, int i, int i2) {
        AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(view, i, i2);
    }

    public static void read(View view, childObject childobject) {
        AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(view, (PointerIcon) (childobject != null ? childobject.write() : null));
    }

    @Deprecated
    public static Display AudioAttributesImplApi26Parcelizer(View view) {
        return view.getDisplay();
    }

    @Deprecated
    public static int read() {
        return View.generateViewId();
    }

    @Deprecated
    protected InvalidTypeIdException() {
    }

    public static boolean onPrepareFromUri(View view) {
        Boolean boolRemoteActionCompatParcelizer = write().RemoteActionCompatParcelizer(view);
        return boolRemoteActionCompatParcelizer != null && boolRemoteActionCompatParcelizer.booleanValue();
    }

    private static IconCompatParcelizer<Boolean> write() {
        return new IconCompatParcelizer<Boolean>(_byteOverflow.IconCompatParcelizer.tag_screen_reader_focusable, Boolean.class, 28) { // from class: o.InvalidTypeIdException.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Boolean write(View view) {
                return Boolean.valueOf(AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            public void AudioAttributesCompatParcelizer(View view, Boolean bool) {
                AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public boolean AudioAttributesCompatParcelizer(Boolean bool, Boolean bool2) {
                return !AudioAttributesCompatParcelizer(bool, bool2);
            }
        };
    }

    public static void read(View view, CharSequence charSequence) {
        IconCompatParcelizer().write(view, charSequence);
        if (charSequence != null) {
            write.IconCompatParcelizer(view);
        } else {
            write.RemoteActionCompatParcelizer(view);
        }
    }

    public static CharSequence read(View view) {
        return IconCompatParcelizer().RemoteActionCompatParcelizer(view);
    }

    private static IconCompatParcelizer<CharSequence> IconCompatParcelizer() {
        return new IconCompatParcelizer<CharSequence>(_byteOverflow.IconCompatParcelizer.tag_accessibility_pane_title, CharSequence.class, 8, 28) { // from class: o.InvalidTypeIdException.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public CharSequence write(View view) {
                return AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            public void AudioAttributesCompatParcelizer(View view, CharSequence charSequence) {
                AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public boolean AudioAttributesCompatParcelizer(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static IconCompatParcelizer<CharSequence> RemoteActionCompatParcelizer() {
        return new IconCompatParcelizer<CharSequence>(_byteOverflow.IconCompatParcelizer.tag_state_description, CharSequence.class, 64, 30) { // from class: o.InvalidTypeIdException.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public CharSequence write(View view) {
                return MediaBrowserCompatItemReceiver.read(view);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public void AudioAttributesCompatParcelizer(View view, CharSequence charSequence) {
                MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(view, charSequence);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            public boolean AudioAttributesCompatParcelizer(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean onPlayFromUri(View view) {
        Boolean boolRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(view);
        return boolRemoteActionCompatParcelizer != null && boolRemoteActionCompatParcelizer.booleanValue();
    }

    public static void read(View view, boolean z) {
        AudioAttributesCompatParcelizer().write(view, Boolean.valueOf(z));
    }

    private static IconCompatParcelizer<Boolean> AudioAttributesCompatParcelizer() {
        return new IconCompatParcelizer<Boolean>(_byteOverflow.IconCompatParcelizer.tag_accessibility_heading, Boolean.class, 28) { // from class: o.InvalidTypeIdException.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Boolean write(View view) {
                return Boolean.valueOf(AudioAttributesImplBaseParcelizer.write(view));
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            public void AudioAttributesCompatParcelizer(View view, Boolean bool) {
                AudioAttributesImplBaseParcelizer.IconCompatParcelizer(view, bool.booleanValue());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.InvalidTypeIdException.IconCompatParcelizer
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public boolean AudioAttributesCompatParcelizer(Boolean bool, Boolean bool2) {
                return !AudioAttributesCompatParcelizer(bool, bool2);
            }
        };
    }

    /* JADX INFO: loaded from: classes2.dex */
    static abstract class IconCompatParcelizer<T> {
        private final Class<T> IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;
        private final int read;
        private final int write;

        abstract void AudioAttributesCompatParcelizer(View view, T t);

        abstract T write(View view);

        IconCompatParcelizer(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        IconCompatParcelizer(int i, Class<T> cls, int i2, int i3) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = cls;
            this.read = i2;
            this.write = i3;
        }

        void write(View view, T t) {
            if (RemoteActionCompatParcelizer()) {
                AudioAttributesCompatParcelizer(view, (Object) t);
            } else if (AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer(view), t)) {
                InvalidTypeIdException.IconCompatParcelizer(view);
                view.setTag(this.RemoteActionCompatParcelizer, t);
                InvalidTypeIdException.write(view, this.read);
            }
        }

        T RemoteActionCompatParcelizer(View view) {
            if (RemoteActionCompatParcelizer()) {
                return write(view);
            }
            T t = (T) view.getTag(this.RemoteActionCompatParcelizer);
            if (this.IconCompatParcelizer.isInstance(t)) {
                return t;
            }
            return null;
        }

        private boolean RemoteActionCompatParcelizer() {
            return Build.VERSION.SDK_INT >= this.write;
        }

        boolean AudioAttributesCompatParcelizer(T t, T t2) {
            return !t2.equals(t);
        }

        boolean AudioAttributesCompatParcelizer(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }
    }

    static void write(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = read(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(read(view));
                    setSessionImpl(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(read(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass().getSimpleName();
                }
            }
        }
    }

    private static void setSessionImpl(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> IconCompatParcelizer = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        RemoteActionCompatParcelizer() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            write(view);
        }

        void IconCompatParcelizer(View view) {
            this.IconCompatParcelizer.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                write(view);
            }
        }

        void RemoteActionCompatParcelizer(View view) {
            this.IconCompatParcelizer.remove(view);
            view.removeOnAttachStateChangeListener(this);
            read(view);
        }

        private void write(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void read(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class write {
        static WindowInsetsCompat read(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets windowInsetsMediaBrowserCompatMediaItem = windowInsetsCompat.MediaBrowserCompatMediaItem();
            if (windowInsetsMediaBrowserCompatMediaItem != null) {
                return WindowInsetsCompat.write(view.computeSystemWindowInsets(windowInsetsMediaBrowserCompatMediaItem, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        static void RemoteActionCompatParcelizer(final View view, final finishBranchObject finishbranchobject) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = finishbranchobject != null ? new View.OnApplyWindowInsetsListener() { // from class: o.InvalidTypeIdException.write.3
                WindowInsetsCompat RemoteActionCompatParcelizer = null;

                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsetsCompat windowInsetsCompatWrite = WindowInsetsCompat.write(windowInsets, view2);
                    if (Build.VERSION.SDK_INT < 30) {
                        write.read(windowInsets, view);
                        if (windowInsetsCompatWrite.equals(this.RemoteActionCompatParcelizer)) {
                            return finishbranchobject.onApplyWindowInsets(view2, windowInsetsCompatWrite).MediaBrowserCompatMediaItem();
                        }
                    }
                    this.RemoteActionCompatParcelizer = windowInsetsCompatWrite;
                    WindowInsetsCompat windowInsetsCompatOnApplyWindowInsets = finishbranchobject.onApplyWindowInsets(view2, windowInsetsCompatWrite);
                    if (Build.VERSION.SDK_INT >= 30) {
                        return windowInsetsCompatOnApplyWindowInsets.MediaBrowserCompatMediaItem();
                    }
                    InvalidTypeIdException.onSetRepeatMode(view2);
                    return windowInsetsCompatOnApplyWindowInsets.MediaBrowserCompatMediaItem();
                }
            } : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(_byteOverflow.IconCompatParcelizer.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (view.getTag(_byteOverflow.IconCompatParcelizer.tag_compat_insets_dispatch) != null) {
                return;
            }
            if (onApplyWindowInsetsListener != null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(_byteOverflow.IconCompatParcelizer.tag_window_insets_animation_callback));
            }
        }

        static void read(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(_byteOverflow.IconCompatParcelizer.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static float AudioAttributesImplApi26Parcelizer(View view) {
            return view.getZ();
        }

        static void AudioAttributesCompatParcelizer(View view, float f) {
            view.setZ(f);
        }

        static void write(View view, float f) {
            view.setElevation(f);
        }

        static void IconCompatParcelizer(View view, float f) {
            view.setTranslationZ(f);
        }

        static float IconCompatParcelizer(View view) {
            return view.getTranslationZ();
        }

        static void write(View view, String str) {
            view.setTransitionName(str);
        }

        static float write(View view) {
            return view.getElevation();
        }

        static String read(View view) {
            return view.getTransitionName();
        }

        static void write(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static ColorStateList AudioAttributesCompatParcelizer(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode RemoteActionCompatParcelizer(View view) {
            return view.getBackgroundTintMode();
        }

        static void write(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void write(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        static boolean AudioAttributesImplApi21Parcelizer(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void MediaBrowserCompatCustomActionResultReceiver(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer {
        public static WindowInsetsCompat write(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat windowInsetsCompatIconCompatParcelizer = WindowInsetsCompat.IconCompatParcelizer(rootWindowInsets);
            windowInsetsCompatIconCompatParcelizer.write(windowInsetsCompatIconCompatParcelizer);
            windowInsetsCompatIconCompatParcelizer.AudioAttributesCompatParcelizer(view.getRootView());
            return windowInsetsCompatIconCompatParcelizer;
        }

        static void RemoteActionCompatParcelizer(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesImplApi21Parcelizer {
        static void IconCompatParcelizer(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        static View.AccessibilityDelegate RemoteActionCompatParcelizer(View view) {
            return view.getAccessibilityDelegate();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class MediaBrowserCompatItemReceiver {
        public static findNameForMutator IconCompatParcelizer(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return findNameForMutator.cF_(windowInsetsController);
            }
            return null;
        }

        static void RemoteActionCompatParcelizer(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        static CharSequence read(View view) {
            return view.getStateDescription();
        }

        static WindowInsets write(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class MediaBrowserCompatCustomActionResultReceiver {
        static int IconCompatParcelizer(View view) {
            return view.getImportantForAutofill();
        }

        static void IconCompatParcelizer(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesImplApi26Parcelizer {
        static void RemoteActionCompatParcelizer(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesImplBaseParcelizer {
        static CharSequence RemoteActionCompatParcelizer(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static void RemoteActionCompatParcelizer(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void IconCompatParcelizer(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        static boolean write(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean AudioAttributesCompatParcelizer(View view) {
            return view.isScreenReaderFocusable();
        }

        static void AudioAttributesCompatParcelizer(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class read {
        static void AudioAttributesCompatParcelizer(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets IconCompatParcelizer(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static WindowInsets AudioAttributesCompatParcelizer(View view, WindowInsets windowInsets) {
            if (Java7Handlers.AudioAttributesCompatParcelizer) {
                return Java7Handlers.RemoteActionCompatParcelizer(view, windowInsets);
            }
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }
}
