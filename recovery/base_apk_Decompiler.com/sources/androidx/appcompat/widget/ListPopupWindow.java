package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import kotlin.AnnotatedClassCreators;
import kotlin.InvalidTypeIdException;
import kotlin.Keep;
import kotlin._init_lambda5;
import kotlin.removeOnContextAvailableListener;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements removeOnContextAvailableListener {
    final Handler AudioAttributesCompatParcelizer;
    final MediaBrowserCompatItemReceiver AudioAttributesImplApi21Parcelizer;
    private View AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    Keep IconCompatParcelizer;
    PopupWindow MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private Drawable MediaMetadataCompat;
    private boolean RatingCompat;
    private ListAdapter RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private Rect onCommand;
    private final AudioAttributesCompatParcelizer onCustomAction;
    private AdapterView.OnItemClickListener onFastForward;
    private DataSetObserver onMediaButtonEvent;
    private AdapterView.OnItemSelectedListener onPause;
    private boolean onPlay;
    private boolean onPlayFromMediaId;
    private final IconCompatParcelizer onPlayFromSearch;
    private View onPlayFromUri;
    private Runnable onPrepare;
    private int onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private final Rect onRemoveQueueItem;
    private final MediaBrowserCompatCustomActionResultReceiver onRewind;
    int read;
    private Context write;

    public ListPopupWindow(Context context) {
        this(context, null, _init_lambda5.read.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MediaBrowserCompatMediaItem = -2;
        this.handleMediaPlayPauseIfPendingOnHandler = -2;
        this.onAddQueueItem = 1002;
        this.AudioAttributesImplBaseParcelizer = 0;
        this.MediaBrowserCompatItemReceiver = false;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        this.read = Integer.MAX_VALUE;
        this.onPrepareFromMediaId = 0;
        this.AudioAttributesImplApi21Parcelizer = new MediaBrowserCompatItemReceiver();
        this.onRewind = new MediaBrowserCompatCustomActionResultReceiver();
        this.onPlayFromSearch = new IconCompatParcelizer();
        this.onCustomAction = new AudioAttributesCompatParcelizer();
        this.onRemoveQueueItem = new Rect();
        this.write = context;
        this.AudioAttributesCompatParcelizer = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ListPopupWindow, i, i2);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelOffset(_init_lambda5.AudioAttributesImplApi26Parcelizer.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(_init_lambda5.AudioAttributesImplApi26Parcelizer.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.MediaDescriptionCompat = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.RatingCompat = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.MediaBrowserCompatCustomActionResultReceiver = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }

    public void RemoteActionCompatParcelizer(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.onMediaButtonEvent;
        if (dataSetObserver == null) {
            this.onMediaButtonEvent = new read();
        } else {
            ListAdapter listAdapter2 = this.RemoteActionCompatParcelizer;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.RemoteActionCompatParcelizer = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.onMediaButtonEvent);
        }
        Keep keep = this.IconCompatParcelizer;
        if (keep != null) {
            keep.setAdapter(this.RemoteActionCompatParcelizer);
        }
    }

    public void AudioAttributesImplBaseParcelizer(int i) {
        this.onPrepareFromMediaId = i;
    }

    public void IconCompatParcelizer(boolean z) {
        this.onPlayFromMediaId = z;
        this.MediaBrowserCompatCustomActionResultReceiver.setFocusable(z);
    }

    public boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.onPlayFromMediaId;
    }

    public Drawable RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.getBackground();
    }

    public void write(Drawable drawable) {
        this.MediaBrowserCompatCustomActionResultReceiver.setBackgroundDrawable(drawable);
    }

    public void AudioAttributesCompatParcelizer(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.setAnimationStyle(i);
    }

    public View MediaBrowserCompatSearchResultReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public void RemoteActionCompatParcelizer(View view) {
        this.AudioAttributesImplApi26Parcelizer = view;
    }

    public int AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public void write(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
    }

    public int IconCompatParcelizer() {
        if (this.RatingCompat) {
            return this.MediaDescriptionCompat;
        }
        return 0;
    }

    public void IconCompatParcelizer(int i) {
        this.MediaDescriptionCompat = i;
        this.RatingCompat = true;
    }

    public void AudioAttributesCompatParcelizer(Rect rect) {
        this.onCommand = rect != null ? new Rect(rect) : null;
    }

    public void AudioAttributesImplApi21Parcelizer(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
    }

    public int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public void MediaBrowserCompatCustomActionResultReceiver(int i) {
        this.handleMediaPlayPauseIfPendingOnHandler = i;
    }

    public void read(int i) {
        Drawable background = this.MediaBrowserCompatCustomActionResultReceiver.getBackground();
        if (background != null) {
            background.getPadding(this.onRemoveQueueItem);
            this.handleMediaPlayPauseIfPendingOnHandler = this.onRemoveQueueItem.left + this.onRemoveQueueItem.right + i;
        } else {
            MediaBrowserCompatCustomActionResultReceiver(i);
        }
    }

    public void write(AdapterView.OnItemClickListener onItemClickListener) {
        this.onFastForward = onItemClickListener;
    }

    public void IconCompatParcelizer(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.onPause = onItemSelectedListener;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public void AudioAttributesImplBaseParcelizer() {
        int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        boolean zOnCommand = onCommand();
        AnnotatedClassCreators.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.onAddQueueItem);
        boolean z = false;
        if (this.MediaBrowserCompatCustomActionResultReceiver.isShowing()) {
            if (InvalidTypeIdException.onPlayFromSearch(MediaBrowserCompatSearchResultReceiver())) {
                int width = this.handleMediaPlayPauseIfPendingOnHandler;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = MediaBrowserCompatSearchResultReceiver().getWidth();
                }
                int i = this.MediaBrowserCompatMediaItem;
                if (i == -1) {
                    if (!zOnCommand) {
                        iMediaBrowserCompatItemReceiver = -1;
                    }
                    if (zOnCommand) {
                        this.MediaBrowserCompatCustomActionResultReceiver.setWidth(this.handleMediaPlayPauseIfPendingOnHandler == -1 ? -1 : 0);
                        this.MediaBrowserCompatCustomActionResultReceiver.setHeight(0);
                    } else {
                        this.MediaBrowserCompatCustomActionResultReceiver.setWidth(this.handleMediaPlayPauseIfPendingOnHandler == -1 ? -1 : 0);
                        this.MediaBrowserCompatCustomActionResultReceiver.setHeight(-1);
                    }
                } else if (i != -2) {
                    iMediaBrowserCompatItemReceiver = i;
                }
                PopupWindow popupWindow = this.MediaBrowserCompatCustomActionResultReceiver;
                if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && !this.MediaBrowserCompatItemReceiver) {
                    z = true;
                }
                popupWindow.setOutsideTouchable(z);
                this.MediaBrowserCompatCustomActionResultReceiver.update(MediaBrowserCompatSearchResultReceiver(), this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, width < 0 ? -1 : width, iMediaBrowserCompatItemReceiver < 0 ? -1 : iMediaBrowserCompatItemReceiver);
                return;
            }
            return;
        }
        int width2 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = MediaBrowserCompatSearchResultReceiver().getWidth();
        }
        int i2 = this.MediaBrowserCompatMediaItem;
        if (i2 == -1) {
            iMediaBrowserCompatItemReceiver = -1;
        } else if (i2 != -2) {
            iMediaBrowserCompatItemReceiver = i2;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.setWidth(width2);
        this.MediaBrowserCompatCustomActionResultReceiver.setHeight(iMediaBrowserCompatItemReceiver);
        write(true);
        PopupWindow popupWindow2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && !this.MediaBrowserCompatItemReceiver) {
            z = true;
        }
        popupWindow2.setOutsideTouchable(z);
        this.MediaBrowserCompatCustomActionResultReceiver.setTouchInterceptor(this.onRewind);
        if (this.onPrepareFromSearch) {
            AnnotatedClassCreators.read(this.MediaBrowserCompatCustomActionResultReceiver, this.onPlay);
        }
        write.read(this.MediaBrowserCompatCustomActionResultReceiver, this.onCommand);
        AnnotatedClassCreators.read(this.MediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatSearchResultReceiver(), this.MediaBrowserCompatSearchResultReceiver, this.MediaDescriptionCompat, this.AudioAttributesImplBaseParcelizer);
        this.IconCompatParcelizer.setSelection(-1);
        if (!this.onPlayFromMediaId || this.IconCompatParcelizer.isInTouchMode()) {
            AudioAttributesImplApi26Parcelizer();
        }
        if (this.onPlayFromMediaId) {
            return;
        }
        this.AudioAttributesCompatParcelizer.post(this.onCustomAction);
    }

    @Override // kotlin.removeOnContextAvailableListener
    public void write() {
        this.MediaBrowserCompatCustomActionResultReceiver.dismiss();
        AudioAttributesImplApi21Parcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.setContentView(null);
        this.IconCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer.removeCallbacks(this.AudioAttributesImplApi21Parcelizer);
    }

    public void IconCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.MediaBrowserCompatCustomActionResultReceiver.setOnDismissListener(onDismissListener);
    }

    private void AudioAttributesImplApi21Parcelizer() {
        View view = this.onPlayFromUri;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.onPlayFromUri);
            }
        }
    }

    public void MediaBrowserCompatItemReceiver(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver.setInputMethodMode(i);
    }

    public void AudioAttributesImplApi26Parcelizer(int i) {
        Keep keep = this.IconCompatParcelizer;
        if (!MediaBrowserCompatCustomActionResultReceiver() || keep == null) {
            return;
        }
        keep.RemoteActionCompatParcelizer(false);
        keep.setSelection(i);
        if (keep.getChoiceMode() != 0) {
            keep.setItemChecked(i, true);
        }
    }

    public void AudioAttributesImplApi26Parcelizer() {
        Keep keep = this.IconCompatParcelizer;
        if (keep != null) {
            keep.RemoteActionCompatParcelizer(true);
            keep.requestLayout();
        }
    }

    @Override // kotlin.removeOnContextAvailableListener
    public boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver.isShowing();
    }

    public boolean onCommand() {
        return this.MediaBrowserCompatCustomActionResultReceiver.getInputMethodMode() == 2;
    }

    public Object MediaDescriptionCompat() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return this.IconCompatParcelizer.getSelectedItem();
        }
        return null;
    }

    public int RatingCompat() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return this.IconCompatParcelizer.getSelectedItemPosition();
        }
        return -1;
    }

    public long MediaMetadataCompat() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return this.IconCompatParcelizer.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public View MediaBrowserCompatMediaItem() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return this.IconCompatParcelizer.getSelectedView();
        }
        return null;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public ListView a_() {
        return this.IconCompatParcelizer;
    }

    Keep AudioAttributesCompatParcelizer(Context context, boolean z) {
        return new Keep(context, z);
    }

    private int MediaBrowserCompatItemReceiver() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int i2;
        if (this.IconCompatParcelizer == null) {
            Context context = this.write;
            this.onPrepare = new Runnable() { // from class: androidx.appcompat.widget.ListPopupWindow.3
                @Override // java.lang.Runnable
                public final void run() {
                    View viewMediaBrowserCompatSearchResultReceiver = ListPopupWindow.this.MediaBrowserCompatSearchResultReceiver();
                    if (viewMediaBrowserCompatSearchResultReceiver == null || viewMediaBrowserCompatSearchResultReceiver.getWindowToken() == null) {
                        return;
                    }
                    ListPopupWindow.this.AudioAttributesImplBaseParcelizer();
                }
            };
            Keep keepAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context, !this.onPlayFromMediaId);
            this.IconCompatParcelizer = keepAudioAttributesCompatParcelizer;
            Drawable drawable = this.MediaMetadataCompat;
            if (drawable != null) {
                keepAudioAttributesCompatParcelizer.setSelector(drawable);
            }
            this.IconCompatParcelizer.setAdapter(this.RemoteActionCompatParcelizer);
            this.IconCompatParcelizer.setOnItemClickListener(this.onFastForward);
            this.IconCompatParcelizer.setFocusable(true);
            this.IconCompatParcelizer.setFocusableInTouchMode(true);
            this.IconCompatParcelizer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.ListPopupWindow.2
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView<?> adapterView, View view2, int i3, long j) {
                    Keep keep;
                    if (i3 == -1 || (keep = ListPopupWindow.this.IconCompatParcelizer) == null) {
                        return;
                    }
                    keep.RemoteActionCompatParcelizer(false);
                }
            });
            this.IconCompatParcelizer.setOnScrollListener(this.onPlayFromSearch);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.onPause;
            if (onItemSelectedListener != null) {
                this.IconCompatParcelizer.setOnItemSelectedListener(onItemSelectedListener);
            }
            Keep keep = this.IconCompatParcelizer;
            View view2 = this.onPlayFromUri;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.onPrepareFromMediaId;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(keep, layoutParams);
                } else if (i3 == 1) {
                    linearLayout.addView(keep, layoutParams);
                    linearLayout.addView(view2);
                }
                int i4 = this.handleMediaPlayPauseIfPendingOnHandler;
                if (i4 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = keep;
            }
            this.MediaBrowserCompatCustomActionResultReceiver.setContentView(view);
        } else {
            View view3 = this.onPlayFromUri;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.MediaBrowserCompatCustomActionResultReceiver.getBackground();
        if (background != null) {
            background.getPadding(this.onRemoveQueueItem);
            i = this.onRemoveQueueItem.top + this.onRemoveQueueItem.bottom;
            if (!this.RatingCompat) {
                this.MediaDescriptionCompat = -this.onRemoveQueueItem.top;
            }
        } else {
            this.onRemoveQueueItem.setEmpty();
            i = 0;
        }
        int iWrite = write(MediaBrowserCompatSearchResultReceiver(), this.MediaDescriptionCompat, this.MediaBrowserCompatCustomActionResultReceiver.getInputMethodMode() == 2);
        if (this.MediaBrowserCompatItemReceiver || this.MediaBrowserCompatMediaItem == -1) {
            return iWrite + i;
        }
        int i5 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (i5 == -2) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.write.getResources().getDisplayMetrics().widthPixels - (this.onRemoveQueueItem.left + this.onRemoveQueueItem.right), Integer.MIN_VALUE);
        } else if (i5 == -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.write.getResources().getDisplayMetrics().widthPixels - (this.onRemoveQueueItem.left + this.onRemoveQueueItem.right), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        int i6 = this.IconCompatParcelizer.read(iMakeMeasureSpec, 0, -1, iWrite - measuredHeight, -1);
        if (i6 > 0) {
            measuredHeight += i + this.IconCompatParcelizer.getPaddingTop() + this.IconCompatParcelizer.getPaddingBottom();
        }
        return i6 + measuredHeight;
    }

    public void AudioAttributesCompatParcelizer(boolean z) {
        this.onPrepareFromSearch = true;
        this.onPlay = z;
    }

    class read extends DataSetObserver {
        read() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver()) {
                ListPopupWindow.this.AudioAttributesImplBaseParcelizer();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.write();
        }
    }

    class AudioAttributesCompatParcelizer implements Runnable {
        AudioAttributesCompatParcelizer() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow.this.AudioAttributesImplApi26Parcelizer();
        }
    }

    class MediaBrowserCompatItemReceiver implements Runnable {
        MediaBrowserCompatItemReceiver() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ListPopupWindow.this.IconCompatParcelizer == null || !InvalidTypeIdException.onPlayFromSearch(ListPopupWindow.this.IconCompatParcelizer) || ListPopupWindow.this.IconCompatParcelizer.getCount() <= ListPopupWindow.this.IconCompatParcelizer.getChildCount() || ListPopupWindow.this.IconCompatParcelizer.getChildCount() > ListPopupWindow.this.read) {
                return;
            }
            ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver.setInputMethodMode(2);
            ListPopupWindow.this.AudioAttributesImplBaseParcelizer();
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver implements View.OnTouchListener {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver != null && ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver.isShowing() && x >= 0 && x < ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver.getWidth() && y >= 0 && y < ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver.getHeight()) {
                ListPopupWindow.this.AudioAttributesCompatParcelizer.postDelayed(ListPopupWindow.this.AudioAttributesImplApi21Parcelizer, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            ListPopupWindow.this.AudioAttributesCompatParcelizer.removeCallbacks(ListPopupWindow.this.AudioAttributesImplApi21Parcelizer);
            return false;
        }
    }

    class IconCompatParcelizer implements AbsListView.OnScrollListener {
        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        IconCompatParcelizer() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || ListPopupWindow.this.onCommand() || ListPopupWindow.this.MediaBrowserCompatCustomActionResultReceiver.getContentView() == null) {
                return;
            }
            ListPopupWindow.this.AudioAttributesCompatParcelizer.removeCallbacks(ListPopupWindow.this.AudioAttributesImplApi21Parcelizer);
            ListPopupWindow.this.AudioAttributesImplApi21Parcelizer.run();
        }
    }

    private void write(boolean z) {
        write.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, z);
    }

    private int write(View view, int i, boolean z) {
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, view, i, z);
    }

    static class write {
        static void read(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        static void IconCompatParcelizer(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    static class RemoteActionCompatParcelizer {
        static int AudioAttributesCompatParcelizer(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }
}
