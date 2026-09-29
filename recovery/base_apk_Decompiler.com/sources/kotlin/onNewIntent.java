package kotlin;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin._init_lambda5;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes.dex */
final class onNewIntent extends onSaveInstanceState implements View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int MediaBrowserCompatItemReceiver = _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_cascading_menu_item_layout;
    private final Context AudioAttributesImplApi26Parcelizer;
    private View AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    ViewTreeObserver MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaMetadataCompat;
    View RemoteActionCompatParcelizer;
    private PopupWindow.OnDismissListener onAddQueueItem;
    private final int onCommand;
    private final boolean onCustomAction;
    private final int onMediaButtonEvent;
    private boolean onPause;
    private final int onPlay;
    private peekAvailableContext.AudioAttributesCompatParcelizer onPlayFromMediaId;
    private int onPlayFromSearch;
    private int onPrepareFromMediaId;
    final Handler read;
    private final List<onRequestPermissionsResult> handleMediaPlayPauseIfPendingOnHandler = new ArrayList();
    final List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener write = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.onNewIntent.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (!onNewIntent.this.MediaBrowserCompatCustomActionResultReceiver() || onNewIntent.this.AudioAttributesCompatParcelizer.size() <= 0 || onNewIntent.this.AudioAttributesCompatParcelizer.get(0).AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler()) {
                return;
            }
            View view = onNewIntent.this.RemoteActionCompatParcelizer;
            if (view == null || !view.isShown()) {
                onNewIntent.this.write();
                return;
            }
            Iterator<RemoteActionCompatParcelizer> it = onNewIntent.this.AudioAttributesCompatParcelizer.iterator();
            while (it.hasNext()) {
                it.next().AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        }
    };
    private final View.OnAttachStateChangeListener AudioAttributesImplApi21Parcelizer = new View.OnAttachStateChangeListener() { // from class: o.onNewIntent.5
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            if (onNewIntent.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                if (!onNewIntent.this.MediaBrowserCompatCustomActionResultReceiver.isAlive()) {
                    onNewIntent.this.MediaBrowserCompatCustomActionResultReceiver = view.getViewTreeObserver();
                }
                onNewIntent.this.MediaBrowserCompatCustomActionResultReceiver.removeGlobalOnLayoutListener(onNewIntent.this.write);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final create MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new create() { // from class: o.onNewIntent.2
        @Override // kotlin.create
        public final void write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
            onNewIntent.this.read.removeCallbacksAndMessages(onrequestpermissionsresult);
        }

        @Override // kotlin.create
        public final void AudioAttributesCompatParcelizer(final onRequestPermissionsResult onrequestpermissionsresult, final MenuItem menuItem) {
            onNewIntent.this.read.removeCallbacksAndMessages(null);
            int size = onNewIntent.this.AudioAttributesCompatParcelizer.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (onrequestpermissionsresult == onNewIntent.this.AudioAttributesCompatParcelizer.get(i).IconCompatParcelizer) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            final RemoteActionCompatParcelizer remoteActionCompatParcelizer = i2 < onNewIntent.this.AudioAttributesCompatParcelizer.size() ? onNewIntent.this.AudioAttributesCompatParcelizer.get(i2) : null;
            onNewIntent.this.read.postAtTime(new Runnable() { // from class: o.onNewIntent.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (remoteActionCompatParcelizer != null) {
                        onNewIntent.this.IconCompatParcelizer = true;
                        remoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
                        onNewIntent.this.IconCompatParcelizer = false;
                    }
                    if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                        onrequestpermissionsresult.IconCompatParcelizer(menuItem, 4);
                    }
                }
            }, onrequestpermissionsresult, SystemClock.uptimeMillis() + 200);
        }
    };
    private int onFastForward = 0;
    private int RatingCompat = 0;
    private boolean MediaDescriptionCompat = false;
    private int MediaBrowserCompatSearchResultReceiver = RatingCompat();

    @Override // kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        return null;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
    }

    @Override // kotlin.onSaveInstanceState
    protected final boolean RemoteActionCompatParcelizer() {
        return false;
    }

    public onNewIntent(Context context, View view, int i, int i2, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = context;
        this.AudioAttributesImplBaseParcelizer = view;
        this.onMediaButtonEvent = i;
        this.onPlay = i2;
        this.onCustomAction = z;
        Resources resources = context.getResources();
        this.onCommand = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_config_prefDialogWidth));
        this.read = new Handler();
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    private MenuPopupWindow MediaBrowserCompatItemReceiver() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.AudioAttributesImplApi26Parcelizer, this.onMediaButtonEvent, this.onPlay);
        menuPopupWindow.write(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        menuPopupWindow.write(this);
        menuPopupWindow.IconCompatParcelizer(this);
        menuPopupWindow.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        menuPopupWindow.AudioAttributesImplApi21Parcelizer(this.RatingCompat);
        menuPopupWindow.IconCompatParcelizer(true);
        menuPopupWindow.MediaBrowserCompatItemReceiver(2);
        return menuPopupWindow;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final void AudioAttributesImplBaseParcelizer() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        Iterator<onRequestPermissionsResult> it = this.handleMediaPlayPauseIfPendingOnHandler.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(it.next());
        }
        this.handleMediaPlayPauseIfPendingOnHandler.clear();
        View view = this.AudioAttributesImplBaseParcelizer;
        this.RemoteActionCompatParcelizer = view;
        if (view != null) {
            boolean z = this.MediaBrowserCompatCustomActionResultReceiver == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.MediaBrowserCompatCustomActionResultReceiver = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.write);
            }
            this.RemoteActionCompatParcelizer.addOnAttachStateChangeListener(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final void write() {
        int size = this.AudioAttributesCompatParcelizer.size();
        if (size <= 0) {
            return;
        }
        RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = (RemoteActionCompatParcelizer[]) this.AudioAttributesCompatParcelizer.toArray(new RemoteActionCompatParcelizer[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = remoteActionCompatParcelizerArr[size];
            if (remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.write();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        write();
        return true;
    }

    private int RatingCompat() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this.AudioAttributesImplBaseParcelizer) == 1 ? 0 : 1;
    }

    private int read(int i) {
        List<RemoteActionCompatParcelizer> list = this.AudioAttributesCompatParcelizer;
        ListView listViewAudioAttributesCompatParcelizer = list.get(list.size() - 1).AudioAttributesCompatParcelizer();
        int[] iArr = new int[2];
        listViewAudioAttributesCompatParcelizer.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.RemoteActionCompatParcelizer.getWindowVisibleDisplayFrame(rect);
        return this.MediaBrowserCompatSearchResultReceiver == 1 ? (iArr[0] + listViewAudioAttributesCompatParcelizer.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        onrequestpermissionsresult.write(this, this.AudioAttributesImplApi26Parcelizer);
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            AudioAttributesCompatParcelizer(onrequestpermissionsresult);
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler.add(onrequestpermissionsresult);
        }
    }

    private void AudioAttributesCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        View viewAudioAttributesCompatParcelizer;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.AudioAttributesImplApi26Parcelizer);
        onPreparePanel onpreparepanel = new onPreparePanel(onrequestpermissionsresult, layoutInflaterFrom, this.onCustomAction, MediaBrowserCompatItemReceiver);
        if (!MediaBrowserCompatCustomActionResultReceiver() && this.MediaDescriptionCompat) {
            onpreparepanel.write(true);
        } else if (MediaBrowserCompatCustomActionResultReceiver()) {
            onpreparepanel.write(onSaveInstanceState.IconCompatParcelizer(onrequestpermissionsresult));
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(onpreparepanel, this.AudioAttributesImplApi26Parcelizer, this.onCommand);
        MenuPopupWindow menuPopupWindowMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        menuPopupWindowMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(onpreparepanel);
        menuPopupWindowMediaBrowserCompatItemReceiver.read(iRemoteActionCompatParcelizer);
        menuPopupWindowMediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(this.RatingCompat);
        if (this.AudioAttributesCompatParcelizer.size() > 0) {
            List<RemoteActionCompatParcelizer> list = this.AudioAttributesCompatParcelizer;
            remoteActionCompatParcelizer = list.get(list.size() - 1);
            viewAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, onrequestpermissionsresult);
        } else {
            remoteActionCompatParcelizer = null;
            viewAudioAttributesCompatParcelizer = null;
        }
        if (viewAudioAttributesCompatParcelizer != null) {
            menuPopupWindowMediaBrowserCompatItemReceiver.onAddQueueItem();
            menuPopupWindowMediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver();
            int i = read(iRemoteActionCompatParcelizer);
            boolean z = i == 1;
            this.MediaBrowserCompatSearchResultReceiver = i;
            menuPopupWindowMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(viewAudioAttributesCompatParcelizer);
            if ((this.RatingCompat & 5) != 5) {
                iRemoteActionCompatParcelizer = z ? viewAudioAttributesCompatParcelizer.getWidth() : 0 - iRemoteActionCompatParcelizer;
            } else if (!z) {
                iRemoteActionCompatParcelizer = 0 - viewAudioAttributesCompatParcelizer.getWidth();
            }
            menuPopupWindowMediaBrowserCompatItemReceiver.write(iRemoteActionCompatParcelizer);
            menuPopupWindowMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(true);
            menuPopupWindowMediaBrowserCompatItemReceiver.IconCompatParcelizer(0);
        } else {
            if (this.MediaMetadataCompat) {
                menuPopupWindowMediaBrowserCompatItemReceiver.write(this.onPlayFromSearch);
            }
            if (this.MediaBrowserCompatMediaItem) {
                menuPopupWindowMediaBrowserCompatItemReceiver.IconCompatParcelizer(this.onPrepareFromMediaId);
            }
            menuPopupWindowMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer());
        }
        this.AudioAttributesCompatParcelizer.add(new RemoteActionCompatParcelizer(menuPopupWindowMediaBrowserCompatItemReceiver, onrequestpermissionsresult, this.MediaBrowserCompatSearchResultReceiver));
        menuPopupWindowMediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
        ListView listViewA_ = menuPopupWindowMediaBrowserCompatItemReceiver.a_();
        listViewA_.setOnKeyListener(this);
        if (remoteActionCompatParcelizer == null && this.onPause && onrequestpermissionsresult.AudioAttributesImplApi26Parcelizer() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_popup_menu_header_item_layout, (ViewGroup) listViewA_, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(onrequestpermissionsresult.AudioAttributesImplApi26Parcelizer());
            listViewA_.addHeaderView(frameLayout, null, false);
            menuPopupWindowMediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
        }
    }

    private static MenuItem IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, onRequestPermissionsResult onrequestpermissionsresult2) {
        int size = onrequestpermissionsresult.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = onrequestpermissionsresult.getItem(i);
            if (item.hasSubMenu() && onrequestpermissionsresult2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private static View AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, onRequestPermissionsResult onrequestpermissionsresult) {
        onPreparePanel onpreparepanel;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemIconCompatParcelizer = IconCompatParcelizer(remoteActionCompatParcelizer.IconCompatParcelizer, onrequestpermissionsresult);
        if (menuItemIconCompatParcelizer == null) {
            return null;
        }
        ListView listViewAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        ListAdapter adapter = listViewAudioAttributesCompatParcelizer.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            onpreparepanel = (onPreparePanel) headerViewListAdapter.getWrappedAdapter();
        } else {
            onpreparepanel = (onPreparePanel) adapter;
            headersCount = 0;
        }
        int count = onpreparepanel.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemIconCompatParcelizer == onpreparepanel.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewAudioAttributesCompatParcelizer.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewAudioAttributesCompatParcelizer.getChildCount()) {
            return listViewAudioAttributesCompatParcelizer.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer.size() > 0 && this.AudioAttributesCompatParcelizer.get(0).AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        int size = this.AudioAttributesCompatParcelizer.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                remoteActionCompatParcelizer = null;
                break;
            }
            remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.get(i);
            if (!remoteActionCompatParcelizer.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                break;
            } else {
                i++;
            }
        }
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(false);
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        Iterator<RemoteActionCompatParcelizer> it = this.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            write(it.next().AudioAttributesCompatParcelizer().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPlayFromMediaId = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer) {
            if (removeontrimmemorylistener == remoteActionCompatParcelizer.IconCompatParcelizer) {
                remoteActionCompatParcelizer.AudioAttributesCompatParcelizer().requestFocus();
                return true;
            }
        }
        if (!removeontrimmemorylistener.hasVisibleItems()) {
            return false;
        }
        RemoteActionCompatParcelizer(removeontrimmemorylistener);
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlayFromMediaId;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.read(removeontrimmemorylistener);
        }
        return true;
    }

    private int write(onRequestPermissionsResult onrequestpermissionsresult) {
        int size = this.AudioAttributesCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            if (onrequestpermissionsresult == this.AudioAttributesCompatParcelizer.get(i).IconCompatParcelizer) {
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        int iWrite = write(onrequestpermissionsresult);
        if (iWrite >= 0) {
            int i = iWrite + 1;
            if (i < this.AudioAttributesCompatParcelizer.size()) {
                this.AudioAttributesCompatParcelizer.get(i).IconCompatParcelizer.RemoteActionCompatParcelizer(false);
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizerRemove = this.AudioAttributesCompatParcelizer.remove(iWrite);
            remoteActionCompatParcelizerRemove.IconCompatParcelizer.RemoteActionCompatParcelizer(this);
            if (this.IconCompatParcelizer) {
                remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(0);
            }
            remoteActionCompatParcelizerRemove.AudioAttributesCompatParcelizer.write();
            int size = this.AudioAttributesCompatParcelizer.size();
            if (size > 0) {
                this.MediaBrowserCompatSearchResultReceiver = this.AudioAttributesCompatParcelizer.get(size - 1).RemoteActionCompatParcelizer;
            } else {
                this.MediaBrowserCompatSearchResultReceiver = RatingCompat();
            }
            if (size != 0) {
                if (z) {
                    this.AudioAttributesCompatParcelizer.get(0).IconCompatParcelizer.RemoteActionCompatParcelizer(false);
                    return;
                }
                return;
            }
            write();
            peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlayFromMediaId;
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, true);
            }
            ViewTreeObserver viewTreeObserver = this.MediaBrowserCompatCustomActionResultReceiver;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.MediaBrowserCompatCustomActionResultReceiver.removeGlobalOnLayoutListener(this.write);
                }
                this.MediaBrowserCompatCustomActionResultReceiver = null;
            }
            this.RemoteActionCompatParcelizer.removeOnAttachStateChangeListener(this.AudioAttributesImplApi21Parcelizer);
            this.onAddQueueItem.onDismiss();
        }
    }

    @Override // kotlin.onSaveInstanceState
    public final void IconCompatParcelizer(int i) {
        if (this.onFastForward != i) {
            this.onFastForward = i;
            this.RatingCompat = _clearIfStdImpl.write(i, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.AudioAttributesImplBaseParcelizer));
        }
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(View view) {
        if (this.AudioAttributesImplBaseParcelizer != view) {
            this.AudioAttributesImplBaseParcelizer = view;
            this.RatingCompat = _clearIfStdImpl.write(this.onFastForward, InvalidTypeIdException.MediaBrowserCompatMediaItem(view));
        }
    }

    @Override // kotlin.onSaveInstanceState
    public final void AudioAttributesCompatParcelizer(PopupWindow.OnDismissListener onDismissListener) {
        this.onAddQueueItem = onDismissListener;
    }

    @Override // kotlin.removeOnContextAvailableListener
    public final ListView a_() {
        if (this.AudioAttributesCompatParcelizer.isEmpty()) {
            return null;
        }
        return this.AudioAttributesCompatParcelizer.get(r1.size() - 1).AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.onSaveInstanceState
    public final void RemoteActionCompatParcelizer(int i) {
        this.MediaMetadataCompat = true;
        this.onPlayFromSearch = i;
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(int i) {
        this.MediaBrowserCompatMediaItem = true;
        this.onPrepareFromMediaId = i;
    }

    @Override // kotlin.onSaveInstanceState
    public final void write(boolean z) {
        this.onPause = z;
    }

    static class RemoteActionCompatParcelizer {
        public final MenuPopupWindow AudioAttributesCompatParcelizer;
        public final onRequestPermissionsResult IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;

        public RemoteActionCompatParcelizer(MenuPopupWindow menuPopupWindow, onRequestPermissionsResult onrequestpermissionsresult, int i) {
            this.AudioAttributesCompatParcelizer = menuPopupWindow;
            this.IconCompatParcelizer = onrequestpermissionsresult;
            this.RemoteActionCompatParcelizer = i;
        }

        public final ListView AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer.a_();
        }
    }
}
