package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import kotlin.Keep;
import kotlin.create;
import kotlin.onPreparePanel;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;

/* JADX INFO: loaded from: classes.dex */
public final class MenuPopupWindow extends ListPopupWindow implements create {
    private create RemoteActionCompatParcelizer;

    public MenuPopupWindow(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    final Keep AudioAttributesCompatParcelizer(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public final void MediaBrowserCompatItemReceiver() {
        IconCompatParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, null);
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, null);
    }

    public final void write(create createVar) {
        this.RemoteActionCompatParcelizer = createVar;
    }

    public final void onAddQueueItem() {
        read.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, false);
    }

    @Override // kotlin.create
    public final void AudioAttributesCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        create createVar = this.RemoteActionCompatParcelizer;
        if (createVar != null) {
            createVar.AudioAttributesCompatParcelizer(onrequestpermissionsresult, menuItem);
        }
    }

    @Override // kotlin.create
    public final void write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        create createVar = this.RemoteActionCompatParcelizer;
        if (createVar != null) {
            createVar.write(onrequestpermissionsresult, menuItem);
        }
    }

    public static class MenuDropDownListView extends Keep {
        final int IconCompatParcelizer;
        final int RemoteActionCompatParcelizer;
        private create read;
        private MenuItem write;

        @Override // kotlin.Keep
        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(MotionEvent motionEvent, int i) {
            return super.IconCompatParcelizer(motionEvent, i);
        }

        @Override // kotlin.Keep, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // kotlin.Keep, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // kotlin.Keep, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // kotlin.Keep, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // kotlin.Keep, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // kotlin.Keep
        public final /* bridge */ /* synthetic */ int read(int i, int i2, int i3, int i4, int i5) {
            return super.read(i, i2, i3, i4, i5);
        }

        @Override // kotlin.Keep, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == IconCompatParcelizer.IconCompatParcelizer(context.getResources().getConfiguration())) {
                this.IconCompatParcelizer = 21;
                this.RemoteActionCompatParcelizer = 22;
            } else {
                this.IconCompatParcelizer = 22;
                this.RemoteActionCompatParcelizer = 21;
            }
        }

        public void setHoverListener(create createVar) {
            this.read = createVar;
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            onPreparePanel onpreparepanel;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.IconCompatParcelizer) {
                if (listMenuItemView.isEnabled() && listMenuItemView.IconCompatParcelizer().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i == this.RemoteActionCompatParcelizer) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    onpreparepanel = (onPreparePanel) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    onpreparepanel = (onPreparePanel) adapter;
                }
                onpreparepanel.write().RemoteActionCompatParcelizer(false);
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        @Override // kotlin.Keep, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            onPreparePanel onpreparepanel;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.read != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    onpreparepanel = (onPreparePanel) headerViewListAdapter.getWrappedAdapter();
                } else {
                    onpreparepanel = (onPreparePanel) adapter;
                    headersCount = 0;
                }
                onRetainNonConfigurationInstance item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= onpreparepanel.getCount()) ? null : onpreparepanel.getItem(i);
                MenuItem menuItem = this.write;
                if (menuItem != item) {
                    onRequestPermissionsResult onrequestpermissionsresultWrite = onpreparepanel.write();
                    if (menuItem != null) {
                        this.read.write(onrequestpermissionsresultWrite, menuItem);
                    }
                    this.write = item;
                    if (item != null) {
                        this.read.AudioAttributesCompatParcelizer(onrequestpermissionsresultWrite, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        static class IconCompatParcelizer {
            static int IconCompatParcelizer(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }
    }

    static class IconCompatParcelizer {
        static void AudioAttributesCompatParcelizer(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void IconCompatParcelizer(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class read {
        static void AudioAttributesCompatParcelizer(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }
}
