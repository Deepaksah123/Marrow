package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class onRequestPermissionsResult implements handleNestedArrayForSingle {
    private static final int[] IconCompatParcelizer = {1, 4, 5, 3, 2, 0};
    private RemoteActionCompatParcelizer AudioAttributesCompatParcelizer;
    private CharSequence AudioAttributesImplApi21Parcelizer;
    private onRetainNonConfigurationInstance AudioAttributesImplApi26Parcelizer;
    private Drawable AudioAttributesImplBaseParcelizer;
    private View MediaBrowserCompatSearchResultReceiver;
    private boolean onCustomAction;
    private boolean onFastForward;
    private final Resources onMediaButtonEvent;
    private boolean onPlay;
    private final Context read;
    private ContextMenu.ContextMenuInfo write;
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    private boolean onPause = false;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
    private boolean onPlayFromMediaId = false;
    private boolean handleMediaPlayPauseIfPendingOnHandler = false;
    private boolean MediaDescriptionCompat = false;
    private ArrayList<onRetainNonConfigurationInstance> onPlayFromUri = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<peekAvailableContext>> onAddQueueItem = new CopyOnWriteArrayList<>();
    private boolean MediaBrowserCompatItemReceiver = false;
    private ArrayList<onRetainNonConfigurationInstance> MediaBrowserCompatMediaItem = new ArrayList<>();
    private ArrayList<onRetainNonConfigurationInstance> onPrepare = new ArrayList<>();
    private boolean MediaMetadataCompat = true;
    private ArrayList<onRetainNonConfigurationInstance> RemoteActionCompatParcelizer = new ArrayList<>();
    private ArrayList<onRetainNonConfigurationInstance> onCommand = new ArrayList<>();
    private boolean RatingCompat = true;

    public interface AudioAttributesCompatParcelizer {
        boolean RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance);
    }

    public interface RemoteActionCompatParcelizer {
        void read(onRequestPermissionsResult onrequestpermissionsresult);

        boolean write(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem);
    }

    public onRequestPermissionsResult MediaBrowserCompatMediaItem() {
        return this;
    }

    public onRequestPermissionsResult(Context context) {
        this.read = context;
        this.onMediaButtonEvent = context.getResources();
        onPlayFromMediaId();
    }

    public final onRequestPermissionsResult handleMediaPlayPauseIfPendingOnHandler() {
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
        return this;
    }

    public final void AudioAttributesCompatParcelizer(peekAvailableContext peekavailablecontext) {
        write(peekavailablecontext, this.read);
    }

    public final void write(peekAvailableContext peekavailablecontext, Context context) {
        this.onAddQueueItem.add(new WeakReference<>(peekavailablecontext));
        peekavailablecontext.read(context, this);
        this.RatingCompat = true;
    }

    public final void RemoteActionCompatParcelizer(peekAvailableContext peekavailablecontext) {
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext2 = weakReference.get();
            if (peekavailablecontext2 == null || peekavailablecontext2 == peekavailablecontext) {
                this.onAddQueueItem.remove(weakReference);
            }
        }
    }

    private void IconCompatParcelizer(boolean z) {
        if (this.onAddQueueItem.isEmpty()) {
            return;
        }
        onFastForward();
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext = weakReference.get();
            if (peekavailablecontext == null) {
                this.onAddQueueItem.remove(weakReference);
            } else {
                peekavailablecontext.AudioAttributesCompatParcelizer(z);
            }
        }
        onCustomAction();
    }

    private boolean write(removeOnTrimMemoryListener removeontrimmemorylistener, peekAvailableContext peekavailablecontext) {
        if (this.onAddQueueItem.isEmpty()) {
            return false;
        }
        boolean zWrite = peekavailablecontext != null ? peekavailablecontext.write(removeontrimmemorylistener) : false;
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext2 = weakReference.get();
            if (peekavailablecontext2 == null) {
                this.onAddQueueItem.remove(weakReference);
            } else if (!zWrite) {
                zWrite = peekavailablecontext2.write(removeontrimmemorylistener);
            }
        }
        return zWrite;
    }

    private void AudioAttributesImplBaseParcelizer(Bundle bundle) {
        Parcelable parcelableAudioAttributesImplApi26Parcelizer;
        if (this.onAddQueueItem.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext = weakReference.get();
            if (peekavailablecontext == null) {
                this.onAddQueueItem.remove(weakReference);
            } else {
                int iIconCompatParcelizer = peekavailablecontext.IconCompatParcelizer();
                if (iIconCompatParcelizer > 0 && (parcelableAudioAttributesImplApi26Parcelizer = peekavailablecontext.AudioAttributesImplApi26Parcelizer()) != null) {
                    sparseArray.put(iIconCompatParcelizer, parcelableAudioAttributesImplApi26Parcelizer);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
    }

    private void read(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || this.onAddQueueItem.isEmpty()) {
            return;
        }
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext = weakReference.get();
            if (peekavailablecontext == null) {
                this.onAddQueueItem.remove(weakReference);
            } else {
                int iIconCompatParcelizer = peekavailablecontext.IconCompatParcelizer();
                if (iIconCompatParcelizer > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(iIconCompatParcelizer)) != null) {
                    peekavailablecontext.IconCompatParcelizer(parcelable);
                }
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(Bundle bundle) {
        AudioAttributesImplBaseParcelizer(bundle);
    }

    public final void write(Bundle bundle) {
        read(bundle);
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((removeOnTrimMemoryListener) item.getSubMenu()).IconCompatParcelizer(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(write(), sparseArray);
        }
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(write());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (actionView != null && actionView.getId() != -1) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((removeOnTrimMemoryListener) item.getSubMenu()).RemoteActionCompatParcelizer(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
                return;
            }
            menuItemFindItem.expandActionView();
        }
    }

    protected String write() {
        return "android:menu:actionviewstates";
    }

    public void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = remoteActionCompatParcelizer;
    }

    public MenuItem write(int i, int i2, int i3, CharSequence charSequence) {
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i3);
        onRetainNonConfigurationInstance onretainnonconfigurationinstanceWrite = write(i, i2, i3, iRemoteActionCompatParcelizer, charSequence, this.MediaBrowserCompatCustomActionResultReceiver);
        ArrayList<onRetainNonConfigurationInstance> arrayList = this.MediaBrowserCompatMediaItem;
        arrayList.add(RemoteActionCompatParcelizer(arrayList, iRemoteActionCompatParcelizer), onretainnonconfigurationinstanceWrite);
        read(true);
        return onretainnonconfigurationinstanceWrite;
    }

    private onRetainNonConfigurationInstance write(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new onRetainNonConfigurationInstance(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return write(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return write(0, 0, 0, this.onMediaButtonEvent.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return write(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return write(i, i2, i3, this.onMediaButtonEvent.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.onMediaButtonEvent.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = (onRetainNonConfigurationInstance) write(i, i2, i3, charSequence);
        removeOnTrimMemoryListener removeontrimmemorylistener = new removeOnTrimMemoryListener(this.read, this, onretainnonconfigurationinstance);
        onretainnonconfigurationinstance.RemoteActionCompatParcelizer(removeontrimmemorylistener);
        return removeontrimmemorylistener;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.onMediaButtonEvent.getString(i4));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    public boolean MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.read.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(((PackageItemInfo) ((ComponentInfo) resolveInfo.activityInfo).applicationInfo).packageName, ((PackageItemInfo) resolveInfo.activityInfo).name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        read(AudioAttributesImplBaseParcelizer(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        if (iAudioAttributesCompatParcelizer >= 0) {
            int size = this.MediaBrowserCompatMediaItem.size();
            for (int i2 = 0; i2 < size - iAudioAttributesCompatParcelizer && this.MediaBrowserCompatMediaItem.get(iAudioAttributesCompatParcelizer).getGroupId() == i; i2++) {
                read(iAudioAttributesCompatParcelizer, false);
            }
            read(true);
        }
    }

    private void read(int i, boolean z) {
        if (i < 0 || i >= this.MediaBrowserCompatMediaItem.size()) {
            return;
        }
        this.MediaBrowserCompatMediaItem.remove(i);
        if (z) {
            read(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.AudioAttributesImplApi26Parcelizer;
        if (onretainnonconfigurationinstance != null) {
            RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
        }
        this.MediaBrowserCompatMediaItem.clear();
        read(true);
    }

    final void read(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.MediaBrowserCompatMediaItem.size();
        onFastForward();
        for (int i = 0; i < size; i++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i);
            if (onretainnonconfigurationinstance.getGroupId() == groupId && onretainnonconfigurationinstance.MediaBrowserCompatCustomActionResultReceiver() && onretainnonconfigurationinstance.isCheckable()) {
                onretainnonconfigurationinstance.RemoteActionCompatParcelizer(onretainnonconfigurationinstance == menuItem);
            }
        }
        onCustomAction();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i2 = 0; i2 < size; i2++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i2);
            if (onretainnonconfigurationinstance.getGroupId() == i) {
                onretainnonconfigurationinstance.write(z2);
                onretainnonconfigurationinstance.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.MediaBrowserCompatMediaItem.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i2);
            if (onretainnonconfigurationinstance.getGroupId() == i && onretainnonconfigurationinstance.AudioAttributesCompatParcelizer(z)) {
                z2 = true;
            }
        }
        if (z2) {
            read(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i2 = 0; i2 < size; i2++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i2);
            if (onretainnonconfigurationinstance.getGroupId() == i) {
                onretainnonconfigurationinstance.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.onCustomAction) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.MediaBrowserCompatMediaItem.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i2);
            if (onretainnonconfigurationinstance.getItemId() == i) {
                return onretainnonconfigurationinstance;
            }
            if (onretainnonconfigurationinstance.hasSubMenu() && (menuItemFindItem = onretainnonconfigurationinstance.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    private int AudioAttributesImplBaseParcelizer(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.MediaBrowserCompatMediaItem.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    private int AudioAttributesCompatParcelizer(int i) {
        return write(i);
    }

    private int write(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.MediaBrowserCompatMediaItem.get(i2).getGroupId() == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.MediaBrowserCompatMediaItem.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.MediaBrowserCompatMediaItem.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return write(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.onPlay = z;
        read(false);
    }

    private static int RemoteActionCompatParcelizer(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = IconCompatParcelizer;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    boolean MediaBrowserCompatSearchResultReceiver() {
        return this.onPlay;
    }

    private void onPlayFromMediaId() {
        this.onFastForward = this.onMediaButtonEvent.getConfiguration().keyboard != 1 && getDeserializerForJavaNioFilePath.write(ViewConfiguration.get(this.read), this.read);
    }

    public boolean onCommand() {
        return this.onFastForward;
    }

    private Resources onMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    public final Context IconCompatParcelizer() {
        return this.read;
    }

    boolean AudioAttributesCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, MenuItem menuItem) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        return remoteActionCompatParcelizer != null && remoteActionCompatParcelizer.write(onrequestpermissionsresult, menuItem);
    }

    public final void read() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.read(this);
        }
    }

    private static int RemoteActionCompatParcelizer(ArrayList<onRetainNonConfigurationInstance> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).write() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        onRetainNonConfigurationInstance onretainnonconfigurationinstanceWrite = write(i, keyEvent);
        boolean zIconCompatParcelizer = onretainnonconfigurationinstanceWrite != null ? IconCompatParcelizer(onretainnonconfigurationinstanceWrite, i2) : false;
        if ((i2 & 2) != 0) {
            RemoteActionCompatParcelizer(true);
        }
        return zIconCompatParcelizer;
    }

    private void read(List<onRetainNonConfigurationInstance> list, int i, KeyEvent keyEvent) {
        boolean zMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.MediaBrowserCompatMediaItem.size();
            for (int i2 = 0; i2 < size; i2++) {
                onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i2);
                if (onretainnonconfigurationinstance.hasSubMenu()) {
                    ((onRequestPermissionsResult) onretainnonconfigurationinstance.getSubMenu()).read(list, i, keyEvent);
                }
                char alphabeticShortcut = zMediaBrowserCompatSearchResultReceiver ? onretainnonconfigurationinstance.getAlphabeticShortcut() : onretainnonconfigurationinstance.getNumericShortcut();
                if ((modifiers & 69647) == ((zMediaBrowserCompatSearchResultReceiver ? onretainnonconfigurationinstance.getAlphabeticModifiers() : onretainnonconfigurationinstance.getNumericModifiers()) & 69647) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (zMediaBrowserCompatSearchResultReceiver && alphabeticShortcut == '\b' && i == 67)) && onretainnonconfigurationinstance.isEnabled())) {
                    list.add(onretainnonconfigurationinstance);
                }
            }
        }
    }

    private onRetainNonConfigurationInstance write(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<onRetainNonConfigurationInstance> arrayList = this.onPlayFromUri;
        arrayList.clear();
        read(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        for (int i2 = 0; i2 < size; i2++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = arrayList.get(i2);
            if (zMediaBrowserCompatSearchResultReceiver) {
                numericShortcut = onretainnonconfigurationinstance.getAlphabeticShortcut();
            } else {
                numericShortcut = onretainnonconfigurationinstance.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (zMediaBrowserCompatSearchResultReceiver && numericShortcut == '\b' && i == 67))) {
                return onretainnonconfigurationinstance;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return IconCompatParcelizer(findItem(i), i2);
    }

    public final boolean IconCompatParcelizer(MenuItem menuItem, int i) {
        return AudioAttributesCompatParcelizer(menuItem, null, i);
    }

    public final boolean AudioAttributesCompatParcelizer(MenuItem menuItem, peekAvailableContext peekavailablecontext, int i) {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = (onRetainNonConfigurationInstance) menuItem;
        if (onretainnonconfigurationinstance == null || !onretainnonconfigurationinstance.isEnabled()) {
            return false;
        }
        boolean zAudioAttributesImplBaseParcelizer = onretainnonconfigurationinstance.AudioAttributesImplBaseParcelizer();
        ThrowableDeserializer throwableDeserializerRemoteActionCompatParcelizer = onretainnonconfigurationinstance.RemoteActionCompatParcelizer();
        boolean z = throwableDeserializerRemoteActionCompatParcelizer != null && throwableDeserializerRemoteActionCompatParcelizer.read();
        if (onretainnonconfigurationinstance.AudioAttributesImplApi26Parcelizer()) {
            boolean zExpandActionView = onretainnonconfigurationinstance.expandActionView() | zAudioAttributesImplBaseParcelizer;
            if (zExpandActionView) {
                RemoteActionCompatParcelizer(true);
            }
            return zExpandActionView;
        }
        if (!onretainnonconfigurationinstance.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                RemoteActionCompatParcelizer(true);
            }
            return zAudioAttributesImplBaseParcelizer;
        }
        if ((i & 4) == 0) {
            RemoteActionCompatParcelizer(false);
        }
        if (!onretainnonconfigurationinstance.hasSubMenu()) {
            onretainnonconfigurationinstance.RemoteActionCompatParcelizer(new removeOnTrimMemoryListener(IconCompatParcelizer(), this, onretainnonconfigurationinstance));
        }
        removeOnTrimMemoryListener removeontrimmemorylistener = (removeOnTrimMemoryListener) onretainnonconfigurationinstance.getSubMenu();
        if (z) {
            throwableDeserializerRemoteActionCompatParcelizer.write(removeontrimmemorylistener);
        }
        boolean zWrite = write(removeontrimmemorylistener, peekavailablecontext) | zAudioAttributesImplBaseParcelizer;
        if (!zWrite) {
            RemoteActionCompatParcelizer(true);
        }
        return zWrite;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.MediaDescriptionCompat) {
            return;
        }
        this.MediaDescriptionCompat = true;
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext = weakReference.get();
            if (peekavailablecontext == null) {
                this.onAddQueueItem.remove(weakReference);
            } else {
                peekavailablecontext.IconCompatParcelizer(this, z);
            }
        }
        this.MediaDescriptionCompat = false;
    }

    @Override // android.view.Menu
    public void close() {
        RemoteActionCompatParcelizer(true);
    }

    public void read(boolean z) {
        if (!this.onPause) {
            if (z) {
                this.MediaMetadataCompat = true;
                this.RatingCompat = true;
            }
            IconCompatParcelizer(z);
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        if (z) {
            this.onPlayFromMediaId = true;
        }
    }

    public final void onFastForward() {
        if (this.onPause) {
            return;
        }
        this.onPause = true;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        this.onPlayFromMediaId = false;
    }

    public final void onCustomAction() {
        this.onPause = false;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
            read(this.onPlayFromMediaId);
        }
    }

    final void onAddQueueItem() {
        this.MediaMetadataCompat = true;
        read(true);
    }

    final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        this.RatingCompat = true;
        read(true);
    }

    public final ArrayList<onRetainNonConfigurationInstance> MediaDescriptionCompat() {
        if (!this.MediaMetadataCompat) {
            return this.onPrepare;
        }
        this.onPrepare.clear();
        int size = this.MediaBrowserCompatMediaItem.size();
        for (int i = 0; i < size; i++) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.MediaBrowserCompatMediaItem.get(i);
            if (onretainnonconfigurationinstance.isVisible()) {
                this.onPrepare.add(onretainnonconfigurationinstance);
            }
        }
        this.MediaMetadataCompat = false;
        this.RatingCompat = true;
        return this.onPrepare;
    }

    public final void AudioAttributesCompatParcelizer() {
        ArrayList<onRetainNonConfigurationInstance> arrayListMediaDescriptionCompat = MediaDescriptionCompat();
        if (this.RatingCompat) {
            boolean zAudioAttributesCompatParcelizer = false;
            for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
                peekAvailableContext peekavailablecontext = weakReference.get();
                if (peekavailablecontext == null) {
                    this.onAddQueueItem.remove(weakReference);
                } else {
                    zAudioAttributesCompatParcelizer |= peekavailablecontext.AudioAttributesCompatParcelizer();
                }
            }
            if (zAudioAttributesCompatParcelizer) {
                this.RemoteActionCompatParcelizer.clear();
                this.onCommand.clear();
                int size = arrayListMediaDescriptionCompat.size();
                for (int i = 0; i < size; i++) {
                    onRetainNonConfigurationInstance onretainnonconfigurationinstance = arrayListMediaDescriptionCompat.get(i);
                    if (onretainnonconfigurationinstance.AudioAttributesImplApi21Parcelizer()) {
                        this.RemoteActionCompatParcelizer.add(onretainnonconfigurationinstance);
                    } else {
                        this.onCommand.add(onretainnonconfigurationinstance);
                    }
                }
            } else {
                this.RemoteActionCompatParcelizer.clear();
                this.onCommand.clear();
                this.onCommand.addAll(MediaDescriptionCompat());
            }
            this.RatingCompat = false;
        }
    }

    public final ArrayList<onRetainNonConfigurationInstance> RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer();
        return this.RemoteActionCompatParcelizer;
    }

    public final ArrayList<onRetainNonConfigurationInstance> MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer();
        return this.onCommand;
    }

    public void clearHeader() {
        this.AudioAttributesImplBaseParcelizer = null;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.MediaBrowserCompatSearchResultReceiver = null;
        read(false);
    }

    private void IconCompatParcelizer(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesOnMediaButtonEvent = onMediaButtonEvent();
        if (view != null) {
            this.MediaBrowserCompatSearchResultReceiver = view;
            this.AudioAttributesImplApi21Parcelizer = null;
            this.AudioAttributesImplBaseParcelizer = null;
        } else {
            if (i > 0) {
                this.AudioAttributesImplApi21Parcelizer = resourcesOnMediaButtonEvent.getText(i);
            } else if (charSequence != null) {
                this.AudioAttributesImplApi21Parcelizer = charSequence;
            }
            if (i2 > 0) {
                this.AudioAttributesImplBaseParcelizer = _isNaN.getDrawable(IconCompatParcelizer(), i2);
            } else if (drawable != null) {
                this.AudioAttributesImplBaseParcelizer = drawable;
            }
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        read(false);
    }

    protected final onRequestPermissionsResult RemoteActionCompatParcelizer(CharSequence charSequence) {
        IconCompatParcelizer(0, charSequence, 0, null, null);
        return this;
    }

    protected final onRequestPermissionsResult IconCompatParcelizer(int i) {
        IconCompatParcelizer(i, null, 0, null, null);
        return this;
    }

    protected final onRequestPermissionsResult write(Drawable drawable) {
        IconCompatParcelizer(0, null, 0, drawable, null);
        return this;
    }

    protected final onRequestPermissionsResult read(int i) {
        IconCompatParcelizer(0, null, i, null, null);
        return this;
    }

    protected final onRequestPermissionsResult RemoteActionCompatParcelizer(View view) {
        IconCompatParcelizer(0, null, 0, null, view);
        return this;
    }

    public final CharSequence AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Drawable AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final View AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    final boolean RatingCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        boolean z = false;
        if (this.onAddQueueItem.isEmpty()) {
            return false;
        }
        onFastForward();
        for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
            peekAvailableContext peekavailablecontext = weakReference.get();
            if (peekavailablecontext == null) {
                this.onAddQueueItem.remove(weakReference);
            } else {
                z = peekavailablecontext.read(onretainnonconfigurationinstance);
                if (z) {
                    break;
                }
            }
        }
        onCustomAction();
        if (z) {
            this.AudioAttributesImplApi26Parcelizer = onretainnonconfigurationinstance;
        }
        return z;
    }

    public boolean RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        boolean zIconCompatParcelizer = false;
        if (!this.onAddQueueItem.isEmpty() && this.AudioAttributesImplApi26Parcelizer == onretainnonconfigurationinstance) {
            onFastForward();
            for (WeakReference<peekAvailableContext> weakReference : this.onAddQueueItem) {
                peekAvailableContext peekavailablecontext = weakReference.get();
                if (peekavailablecontext == null) {
                    this.onAddQueueItem.remove(weakReference);
                } else {
                    zIconCompatParcelizer = peekavailablecontext.IconCompatParcelizer(onretainnonconfigurationinstance);
                    if (zIconCompatParcelizer) {
                        break;
                    }
                }
            }
            onCustomAction();
            if (zIconCompatParcelizer) {
                this.AudioAttributesImplApi26Parcelizer = null;
            }
        }
        return zIconCompatParcelizer;
    }

    public final onRetainNonConfigurationInstance MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.onCustomAction = z;
    }
}
