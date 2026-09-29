package kotlin;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.modifyFieldName;

/* JADX INFO: loaded from: classes2.dex */
public class hasSuperClassStartingWith {
    private final AccessibilityNodeInfo RemoteActionCompatParcelizer;
    public int read = -1;
    private int write = -1;

    @Deprecated
    public void onSetCaptioningEnabled() {
    }

    public void write(CharSequence charSequence, View view) {
    }

    public static class read {
        public static final read MediaDescriptionCompat;
        public static final read MediaMetadataCompat;
        public static final read RatingCompat;
        public static final read onCommand;
        public static final read onPlayFromSearch;
        public static final read onSeekTo;
        public static final read onSkipToNext;
        protected final modifyFieldName MediaSessionCompatResultReceiverWrapper;
        private final int ParcelableVolumeInfo;
        private final Class<? extends modifyFieldName.IconCompatParcelizer> PlaybackStateCompat;
        final Object setSessionImpl;
        public static final read MediaBrowserCompatSearchResultReceiver = new read(1, null);
        public static final read read = new read(2, null);
        public static final read onSetShuffleMode = new read(4, null);
        public static final read IconCompatParcelizer = new read(8, null);
        public static final read write = new read(16, null);
        public static final read onAddQueueItem = new read(32, null);
        public static final read RemoteActionCompatParcelizer = new read(64, null);
        public static final read AudioAttributesCompatParcelizer = new read(128, null);
        public static final read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new read(256, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.write.class);
        public static final read onPrepareFromMediaId = new read(512, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.write.class);
        public static final read onPlayFromMediaId = new read(1024, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.read.class);
        public static final read onPrepare = new read(2048, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.read.class);
        public static final read onRemoveQueueItemAt = new read(4096, null);
        public static final read onPrepareFromSearch = new read(8192, null);
        public static final read AudioAttributesImplApi21Parcelizer = new read(16384, null);
        public static final read onPlayFromUri = new read(32768, null);
        public static final read MediaBrowserCompatCustomActionResultReceiver = new read(C.DEFAULT_BUFFER_SEGMENT_SIZE, null);
        public static final read onSetCaptioningEnabled = new read(131072, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.AudioAttributesImplApi26Parcelizer.class);
        public static final read MediaBrowserCompatMediaItem = new read(262144, null);
        public static final read MediaBrowserCompatItemReceiver = new read(524288, null);
        public static final read AudioAttributesImplApi26Parcelizer = new read(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
        public static final read onStop = new read(2097152, (CharSequence) null, (Class<? extends modifyFieldName.IconCompatParcelizer>) modifyFieldName.AudioAttributesImplBaseParcelizer.class);
        public static final read onSkipToQueueItem = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final read onSetPlaybackSpeed = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, modifyFieldName.RemoteActionCompatParcelizer.class);
        public static final read onSetRating = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        public static final read onRemoveQueueItem = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        public static final read onPrepareFromUri = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        public static final read onRewind = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        public static final read onPause = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
        public static final read onMediaButtonEvent = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
        public static final read onPlay = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
        public static final read onFastForward = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
        public static final read AudioAttributesImplBaseParcelizer = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        public static final read onSetRepeatMode = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, modifyFieldName.MediaBrowserCompatCustomActionResultReceiver.class);
        public static final read handleMediaPlayPauseIfPendingOnHandler = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, modifyFieldName.AudioAttributesCompatParcelizer.class);
        public static final read onSkipToPrevious = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        public static final read onCustomAction = new read(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);

        static {
            onPlayFromSearch = new read(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            onCommand = new read(Build.VERSION.SDK_INT >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            MediaDescriptionCompat = new read(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            MediaMetadataCompat = new read(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            RatingCompat = new read(Build.VERSION.SDK_INT >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            onSkipToNext = new read(Build.VERSION.SDK_INT >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            onSeekTo = new read(Build.VERSION.SDK_INT >= 34 ? AudioAttributesCompatParcelizer.IconCompatParcelizer() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public read(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public read(int i, CharSequence charSequence, modifyFieldName modifyfieldname) {
            this(null, i, charSequence, modifyfieldname, null);
        }

        read(Object obj) {
            this(obj, 0, null, null, null);
        }

        private read(int i, CharSequence charSequence, Class<? extends modifyFieldName.IconCompatParcelizer> cls) {
            this(null, i, charSequence, null, cls);
        }

        read(Object obj, int i, CharSequence charSequence, modifyFieldName modifyfieldname, Class<? extends modifyFieldName.IconCompatParcelizer> cls) {
            this.ParcelableVolumeInfo = i;
            this.MediaSessionCompatResultReceiverWrapper = modifyfieldname;
            if (obj == null) {
                this.setSessionImpl = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.setSessionImpl = obj;
            }
            this.PlaybackStateCompat = cls;
        }

        public int RemoteActionCompatParcelizer() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.setSessionImpl).getId();
        }

        public CharSequence IconCompatParcelizer() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.setSessionImpl).getLabel();
        }

        public boolean read(View view, Bundle bundle) {
            if (this.MediaSessionCompatResultReceiverWrapper == null) {
                return false;
            }
            Class<? extends modifyFieldName.IconCompatParcelizer> cls = this.PlaybackStateCompat;
            if (cls != null) {
                try {
                    cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception unused) {
                }
            }
            return this.MediaSessionCompatResultReceiverWrapper.read(view);
        }

        public read AudioAttributesCompatParcelizer(CharSequence charSequence, modifyFieldName modifyfieldname) {
            return new read(null, this.ParcelableVolumeInfo, charSequence, modifyfieldname, this.PlaybackStateCompat);
        }

        public int hashCode() {
            Object obj = this.setSessionImpl;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            Object obj2 = this.setSessionImpl;
            return obj2 == null ? readVar.setSessionImpl == null : obj2.equals(readVar.setSessionImpl);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strIconCompatParcelizer = hasSuperClassStartingWith.IconCompatParcelizer(this.ParcelableVolumeInfo);
            if (strIconCompatParcelizer.equals("ACTION_UNKNOWN") && IconCompatParcelizer() != null) {
                strIconCompatParcelizer = IconCompatParcelizer().toString();
            }
            sb.append(strIconCompatParcelizer);
            return sb.toString();
        }
    }

    public static class RemoteActionCompatParcelizer {
        final Object write;

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i, int i2, boolean z, int i3) {
            return new RemoteActionCompatParcelizer(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public static RemoteActionCompatParcelizer AudioAttributesCompatParcelizer(int i, int i2, boolean z) {
            return new RemoteActionCompatParcelizer(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        RemoteActionCompatParcelizer(Object obj) {
            this.write = obj;
        }
    }

    public static class AudioAttributesImplBaseParcelizer {
        final Object write;

        public static AudioAttributesImplBaseParcelizer read(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new AudioAttributesImplBaseParcelizer(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        AudioAttributesImplBaseParcelizer(Object obj) {
            this.write = obj;
        }
    }

    public static class MediaBrowserCompatItemReceiver {
        final Object RemoteActionCompatParcelizer;

        public static MediaBrowserCompatItemReceiver IconCompatParcelizer(int i, float f, float f2, float f3) {
            return new MediaBrowserCompatItemReceiver(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        MediaBrowserCompatItemReceiver(Object obj) {
            this.RemoteActionCompatParcelizer = obj;
        }
    }

    private hasSuperClassStartingWith(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.RemoteActionCompatParcelizer = accessibilityNodeInfo;
    }

    public static hasSuperClassStartingWith write(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new hasSuperClassStartingWith(accessibilityNodeInfo);
    }

    public AccessibilityNodeInfo onSetRating() {
        return this.RemoteActionCompatParcelizer;
    }

    public static hasSuperClassStartingWith read(View view) {
        return write(AccessibilityNodeInfo.obtain(view));
    }

    public static hasSuperClassStartingWith read() {
        return write(AccessibilityNodeInfo.obtain());
    }

    public static hasSuperClassStartingWith AudioAttributesCompatParcelizer(hasSuperClassStartingWith hassuperclassstartingwith) {
        return write(AccessibilityNodeInfo.obtain(hassuperclassstartingwith.RemoteActionCompatParcelizer));
    }

    public void write(View view) {
        this.write = -1;
        this.RemoteActionCompatParcelizer.setSource(view);
    }

    public void IconCompatParcelizer(View view, int i) {
        this.write = i;
        this.RemoteActionCompatParcelizer.setSource(view, i);
    }

    public int write() {
        return this.RemoteActionCompatParcelizer.getChildCount();
    }

    public void RemoteActionCompatParcelizer(View view) {
        this.RemoteActionCompatParcelizer.addChild(view);
    }

    public void read(View view, int i) {
        this.RemoteActionCompatParcelizer.addChild(view, i);
    }

    @Deprecated
    public int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getActions();
    }

    public void AudioAttributesCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer.addAction(i);
    }

    private List<Integer> AudioAttributesCompatParcelizer(String str) {
        ArrayList<Integer> integerArrayList = this.RemoteActionCompatParcelizer.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.RemoteActionCompatParcelizer.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void AudioAttributesCompatParcelizer(read readVar) {
        this.RemoteActionCompatParcelizer.addAction((AccessibilityNodeInfo.AccessibilityAction) readVar.setSessionImpl);
    }

    public boolean IconCompatParcelizer(read readVar) {
        return this.RemoteActionCompatParcelizer.removeAction((AccessibilityNodeInfo.AccessibilityAction) readVar.setSessionImpl);
    }

    public boolean read(int i, Bundle bundle) {
        return this.RemoteActionCompatParcelizer.performAction(i, bundle);
    }

    public void AudioAttributesImplApi26Parcelizer(int i) {
        this.RemoteActionCompatParcelizer.setMovementGranularities(i);
    }

    public int RatingCompat() {
        return this.RemoteActionCompatParcelizer.getMovementGranularities();
    }

    public void IconCompatParcelizer(View view) {
        this.read = -1;
        this.RemoteActionCompatParcelizer.setParent(view);
    }

    public void write(View view, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer.setParent(view, i);
    }

    @Deprecated
    public void AudioAttributesCompatParcelizer(Rect rect) {
        this.RemoteActionCompatParcelizer.getBoundsInParent(rect);
    }

    @Deprecated
    public void RemoteActionCompatParcelizer(Rect rect) {
        this.RemoteActionCompatParcelizer.setBoundsInParent(rect);
    }

    public void read(Rect rect) {
        this.RemoteActionCompatParcelizer.getBoundsInScreen(rect);
    }

    public void IconCompatParcelizer(Rect rect) {
        this.RemoteActionCompatParcelizer.setBoundsInScreen(rect);
    }

    public void write(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            AudioAttributesCompatParcelizer.read(this.RemoteActionCompatParcelizer, rect);
            return;
        }
        Rect rect2 = (Rect) this.RemoteActionCompatParcelizer.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.RemoteActionCompatParcelizer.isCheckable();
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setCheckable(z);
    }

    public boolean onMediaButtonEvent() {
        return this.RemoteActionCompatParcelizer.isChecked();
    }

    public void read(boolean z) {
        this.RemoteActionCompatParcelizer.setChecked(z);
    }

    public boolean onPlay() {
        return this.RemoteActionCompatParcelizer.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public boolean onPrepareFromSearch() {
        return this.RemoteActionCompatParcelizer.isFocusable();
    }

    public void MediaDescriptionCompat(boolean z) {
        this.RemoteActionCompatParcelizer.setFocusable(z);
    }

    public boolean onPlayFromUri() {
        return this.RemoteActionCompatParcelizer.isFocused();
    }

    public void MediaBrowserCompatMediaItem(boolean z) {
        this.RemoteActionCompatParcelizer.setFocused(z);
    }

    public boolean onSetShuffleMode() {
        return this.RemoteActionCompatParcelizer.isVisibleToUser();
    }

    public void onPlayFromMediaId(boolean z) {
        this.RemoteActionCompatParcelizer.setVisibleToUser(z);
    }

    public boolean onAddQueueItem() {
        return this.RemoteActionCompatParcelizer.isAccessibilityFocused();
    }

    public void RemoteActionCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setAccessibilityFocused(z);
    }

    public boolean onPrepareFromUri() {
        return this.RemoteActionCompatParcelizer.isSelected();
    }

    public void onCommand(boolean z) {
        this.RemoteActionCompatParcelizer.setSelected(z);
    }

    public boolean onFastForward() {
        return this.RemoteActionCompatParcelizer.isClickable();
    }

    public void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setClickable(z);
    }

    public boolean onPlayFromSearch() {
        return this.RemoteActionCompatParcelizer.isLongClickable();
    }

    public void MediaMetadataCompat(boolean z) {
        this.RemoteActionCompatParcelizer.setLongClickable(z);
    }

    public boolean onPlayFromMediaId() {
        return this.RemoteActionCompatParcelizer.isEnabled();
    }

    public void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.RemoteActionCompatParcelizer.setEnabled(z);
    }

    public boolean onSeekTo() {
        return this.RemoteActionCompatParcelizer.isPassword();
    }

    public void onAddQueueItem(boolean z) {
        this.RemoteActionCompatParcelizer.setPassword(z);
    }

    public boolean onRewind() {
        return this.RemoteActionCompatParcelizer.isScrollable();
    }

    public void handleMediaPlayPauseIfPendingOnHandler(boolean z) {
        this.RemoteActionCompatParcelizer.setScrollable(z);
    }

    public boolean onPrepareFromMediaId() {
        return MediaBrowserCompatCustomActionResultReceiver(67108864);
    }

    public boolean onRemoveQueueItemAt() {
        if (Build.VERSION.SDK_INT >= 33) {
            return IconCompatParcelizer.write(this.RemoteActionCompatParcelizer);
        }
        return MediaBrowserCompatCustomActionResultReceiver(8388608);
    }

    public boolean onPrepare() {
        return this.RemoteActionCompatParcelizer.isImportantForAccessibility();
    }

    public void RatingCompat(boolean z) {
        this.RemoteActionCompatParcelizer.setImportantForAccessibility(z);
    }

    public boolean onCommand() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return MediaBrowserCompatCustomActionResultReceiver(64);
    }

    public void write(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            AudioAttributesCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer, z);
        } else {
            write(64, z);
        }
    }

    public CharSequence MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer.getPackageName();
    }

    public void MediaBrowserCompatCustomActionResultReceiver(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setPackageName(charSequence);
    }

    public CharSequence AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.getClassName();
    }

    public void AudioAttributesCompatParcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setClassName(charSequence);
    }

    public CharSequence MediaBrowserCompatSearchResultReceiver() {
        if (onSetPlaybackSpeed()) {
            List<Integer> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> listAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> listAudioAttributesCompatParcelizer3 = AudioAttributesCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> listAudioAttributesCompatParcelizer4 = AudioAttributesCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.RemoteActionCompatParcelizer.getText(), 0, this.RemoteActionCompatParcelizer.getText().length()));
            for (int i = 0; i < listAudioAttributesCompatParcelizer.size(); i++) {
                spannableString.setSpan(new findNameForIsGetter(listAudioAttributesCompatParcelizer4.get(i).intValue(), this, MediaBrowserCompatCustomActionResultReceiver().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listAudioAttributesCompatParcelizer.get(i).intValue(), listAudioAttributesCompatParcelizer2.get(i).intValue(), listAudioAttributesCompatParcelizer3.get(i).intValue());
            }
            return spannableString;
        }
        return this.RemoteActionCompatParcelizer.getText();
    }

    public void MediaBrowserCompatItemReceiver(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setText(charSequence);
    }

    public static ClickableSpan[] write(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private boolean onSetPlaybackSpeed() {
        return !AudioAttributesCompatParcelizer("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public CharSequence MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer.getContentDescription();
    }

    public CharSequence MediaMetadataCompat() {
        if (Build.VERSION.SDK_INT >= 30) {
            return write.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return this.RemoteActionCompatParcelizer.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void IconCompatParcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setContentDescription(charSequence);
    }

    public void AudioAttributesImplApi26Parcelizer(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            write.write(this.RemoteActionCompatParcelizer, charSequence);
        } else {
            this.RemoteActionCompatParcelizer.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (Build.VERSION.SDK_INT >= 33) {
            return IconCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return this.RemoteActionCompatParcelizer.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public CharSequence AudioAttributesImplBaseParcelizer() {
        if (Build.VERSION.SDK_INT >= 34) {
            return AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        }
        return this.RemoteActionCompatParcelizer.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void write(String str) {
        this.RemoteActionCompatParcelizer.setViewIdResourceName(str);
    }

    public String onCustomAction() {
        return this.RemoteActionCompatParcelizer.getViewIdResourceName();
    }

    public void RemoteActionCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer.setLiveRegion(i);
    }

    public void write(int i) {
        this.RemoteActionCompatParcelizer.setDrawingOrder(i);
    }

    public void RemoteActionCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((RemoteActionCompatParcelizer) obj).write);
    }

    public void AudioAttributesCompatParcelizer(Object obj) {
        this.RemoteActionCompatParcelizer.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((AudioAttributesImplBaseParcelizer) obj).write);
    }

    public void RemoteActionCompatParcelizer(MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
        this.RemoteActionCompatParcelizer.setRangeInfo((AccessibilityNodeInfo.RangeInfo) mediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
    }

    public List<read> IconCompatParcelizer() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.RemoteActionCompatParcelizer.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new read(actionList.get(i)));
        }
        return arrayList;
    }

    public void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setContentInvalid(z);
    }

    public boolean onPause() {
        return this.RemoteActionCompatParcelizer.isContextClickable();
    }

    public void read(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setHintText(charSequence);
    }

    public void RemoteActionCompatParcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setError(charSequence);
    }

    public CharSequence AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer.getError();
    }

    public void AudioAttributesCompatParcelizer(View view) {
        this.RemoteActionCompatParcelizer.setLabelFor(view);
    }

    public void IconCompatParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setCanOpenPopup(z);
    }

    public Bundle MediaBrowserCompatCustomActionResultReceiver() {
        return this.RemoteActionCompatParcelizer.getExtras();
    }

    public void IconCompatParcelizer(List<String> list) {
        this.RemoteActionCompatParcelizer.setAvailableExtraData(list);
    }

    public void read(int i) {
        this.RemoteActionCompatParcelizer.setMaxTextLength(i);
    }

    public int AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer.getMaxTextLength();
    }

    public void read(int i, int i2) {
        this.RemoteActionCompatParcelizer.setTextSelection(i, i2);
    }

    public void AudioAttributesImplApi26Parcelizer(View view) {
        this.RemoteActionCompatParcelizer.setTraversalBefore(view);
    }

    public void RemoteActionCompatParcelizer(View view, int i) {
        this.RemoteActionCompatParcelizer.setTraversalBefore(view, i);
    }

    public void MediaBrowserCompatCustomActionResultReceiver(View view) {
        this.RemoteActionCompatParcelizer.setTraversalAfter(view);
    }

    public void AudioAttributesCompatParcelizer(View view, int i) {
        this.RemoteActionCompatParcelizer.setTraversalAfter(view, i);
    }

    public void MediaBrowserCompatItemReceiver(boolean z) {
        this.RemoteActionCompatParcelizer.setDismissable(z);
    }

    public void AudioAttributesImplBaseParcelizer(boolean z) {
        this.RemoteActionCompatParcelizer.setEditable(z);
    }

    public CharSequence MediaBrowserCompatMediaItem() {
        return this.RemoteActionCompatParcelizer.getTooltipText();
    }

    public void AudioAttributesImplApi21Parcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.setPaneTitle(charSequence);
    }

    public void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(boolean z) {
        this.RemoteActionCompatParcelizer.setScreenReaderFocusable(z);
    }

    public boolean onRemoveQueueItem() {
        return this.RemoteActionCompatParcelizer.isShowingHintText();
    }

    public void onCustomAction(boolean z) {
        this.RemoteActionCompatParcelizer.setShowingHintText(z);
    }

    public void MediaBrowserCompatSearchResultReceiver(boolean z) {
        this.RemoteActionCompatParcelizer.setHeading(z);
    }

    public void AudioAttributesImplBaseParcelizer(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.RemoteActionCompatParcelizer;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof hasSuperClassStartingWith)) {
            return false;
        }
        hasSuperClassStartingWith hassuperclassstartingwith = (hasSuperClassStartingWith) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.RemoteActionCompatParcelizer;
        if (accessibilityNodeInfo == null) {
            if (hassuperclassstartingwith.RemoteActionCompatParcelizer != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(hassuperclassstartingwith.RemoteActionCompatParcelizer)) {
            return false;
        }
        return this.write == hassuperclassstartingwith.write && this.read == hassuperclassstartingwith.read;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AudioAttributesCompatParcelizer(rect);
        sb.append("; boundsInParent: ".concat(String.valueOf(rect)));
        read(rect);
        sb.append("; boundsInScreen: ".concat(String.valueOf(rect)));
        write(rect);
        sb.append("; boundsInWindow: ".concat(String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(MediaDescriptionCompat());
        sb.append("; className: ");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append("; text: ");
        sb.append(MediaBrowserCompatSearchResultReceiver());
        sb.append("; error: ");
        sb.append(AudioAttributesImplApi21Parcelizer());
        sb.append("; maxTextLength: ");
        sb.append(AudioAttributesImplApi26Parcelizer());
        sb.append("; stateDescription: ");
        sb.append(MediaMetadataCompat());
        sb.append("; contentDescription: ");
        sb.append(MediaBrowserCompatItemReceiver());
        sb.append("; tooltipText: ");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append("; viewIdResName: ");
        sb.append(onCustomAction());
        sb.append("; uniqueId: ");
        sb.append(MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        sb.append("; checkable: ");
        sb.append(handleMediaPlayPauseIfPendingOnHandler());
        sb.append("; checked: ");
        sb.append(onMediaButtonEvent());
        sb.append("; fieldRequired: ");
        sb.append(onPlay());
        sb.append("; focusable: ");
        sb.append(onPrepareFromSearch());
        sb.append("; focused: ");
        sb.append(onPlayFromUri());
        sb.append("; selected: ");
        sb.append(onPrepareFromUri());
        sb.append("; clickable: ");
        sb.append(onFastForward());
        sb.append("; longClickable: ");
        sb.append(onPlayFromSearch());
        sb.append("; contextClickable: ");
        sb.append(onPause());
        sb.append("; enabled: ");
        sb.append(onPlayFromMediaId());
        sb.append("; password: ");
        sb.append(onSeekTo());
        StringBuilder sb2 = new StringBuilder("; scrollable: ");
        sb2.append(onRewind());
        sb.append(sb2.toString());
        sb.append("; containerTitle: ");
        sb.append(AudioAttributesImplBaseParcelizer());
        sb.append("; granularScrollingSupported: ");
        sb.append(onPrepareFromMediaId());
        sb.append("; importantForAccessibility: ");
        sb.append(onPrepare());
        sb.append("; visible: ");
        sb.append(onSetShuffleMode());
        sb.append("; isTextSelectable: ");
        sb.append(onRemoveQueueItemAt());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(onCommand());
        sb.append("; [");
        List<read> listIconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i < listIconCompatParcelizer.size(); i++) {
            read readVar = listIconCompatParcelizer.get(i);
            String strIconCompatParcelizer = IconCompatParcelizer(readVar.RemoteActionCompatParcelizer());
            if (strIconCompatParcelizer.equals("ACTION_UNKNOWN") && readVar.IconCompatParcelizer() != null) {
                strIconCompatParcelizer = readVar.IconCompatParcelizer().toString();
            }
            sb.append(strIconCompatParcelizer);
            if (i != listIconCompatParcelizer.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void write(int i, boolean z) {
        Bundle bundleMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (bundleMediaBrowserCompatCustomActionResultReceiver != null) {
            bundleMediaBrowserCompatCustomActionResultReceiver.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((~i) & bundleMediaBrowserCompatCustomActionResultReceiver.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0)) | (z ? i : 0));
        }
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(int i) {
        Bundle bundleMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        return bundleMediaBrowserCompatCustomActionResultReceiver != null && (bundleMediaBrowserCompatCustomActionResultReceiver.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    static String IconCompatParcelizer(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case C.DEFAULT_BUFFER_SEGMENT_SIZE /* 65536 */:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    static class write {
        public static void write(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }

        public static CharSequence IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }
    }

    static class IconCompatParcelizer {
        public static boolean write(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static String IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }
    }

    static class AudioAttributesCompatParcelizer {
        public static boolean IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void IconCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static CharSequence AudioAttributesCompatParcelizer(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static void read(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static AccessibilityNodeInfo.AccessibilityAction IconCompatParcelizer() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
    }
}
