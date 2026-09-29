package kotlin;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;
import kotlin.calculateNextSearchBytePosition;
import kotlin.hasSuperClassStartingWith;
import kotlin.peekAvailableContext;

/* JADX INFO: loaded from: classes5.dex */
public final class checkBitsPerSample implements peekAvailableContext {
    boolean AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    int AudioAttributesImplApi26Parcelizer;
    Drawable AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    ColorStateList MediaBrowserCompatCustomActionResultReceiver;
    RippleDrawable MediaBrowserCompatItemReceiver;
    int MediaBrowserCompatSearchResultReceiver;
    int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    LayoutInflater MediaDescriptionCompat;
    onRequestPermissionsResult MediaMetadataCompat;
    int RatingCompat;
    write RemoteActionCompatParcelizer;
    ColorStateList handleMediaPlayPauseIfPendingOnHandler;
    int onCommand;
    int onCustomAction;
    ColorStateList onPause;
    private peekAvailableContext.AudioAttributesCompatParcelizer onPlay;
    private int onPlayFromMediaId;
    private NavigationMenuView onPlayFromUri;
    private int onPrepareFromMediaId;
    private int onPrepareFromSearch;
    int read;
    LinearLayout write;
    int onAddQueueItem = 0;
    int onFastForward = 0;
    boolean onMediaButtonEvent = true;
    private boolean onPlayFromSearch = true;
    private int onPrepare = -1;
    final View.OnClickListener MediaBrowserCompatMediaItem = new View.OnClickListener() { // from class: o.checkBitsPerSample.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            boolean z = true;
            checkBitsPerSample.this.read(true);
            onRetainNonConfigurationInstance onretainnonconfigurationinstanceIconCompatParcelizer = ((NavigationMenuItemView) view).IconCompatParcelizer();
            boolean zAudioAttributesCompatParcelizer = checkBitsPerSample.this.MediaMetadataCompat.AudioAttributesCompatParcelizer(onretainnonconfigurationinstanceIconCompatParcelizer, checkBitsPerSample.this, 0);
            if (onretainnonconfigurationinstanceIconCompatParcelizer != null && onretainnonconfigurationinstanceIconCompatParcelizer.isCheckable() && zAudioAttributesCompatParcelizer) {
                checkBitsPerSample.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onretainnonconfigurationinstanceIconCompatParcelizer);
            } else {
                z = false;
            }
            checkBitsPerSample.this.read(false);
            if (z) {
                checkBitsPerSample.this.AudioAttributesCompatParcelizer(false);
            }
        }
    };

    interface RemoteActionCompatParcelizer {
    }

    @Override // kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean IconCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean read(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        return false;
    }

    @Override // kotlin.peekAvailableContext
    public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
        this.MediaDescriptionCompat = LayoutInflater.from(context);
        this.MediaMetadataCompat = onrequestpermissionsresult;
        this.onCommand = context.getResources().getDimensionPixelOffset(calculateNextSearchBytePosition.write.design_navigation_separator_vertical_padding);
    }

    public final registerForActivityResult RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        if (this.onPlayFromUri == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.MediaDescriptionCompat.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_menu, viewGroup, false);
            this.onPlayFromUri = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new MediaBrowserCompatCustomActionResultReceiver(this.onPlayFromUri));
            if (this.RemoteActionCompatParcelizer == null) {
                this.RemoteActionCompatParcelizer = new write();
            }
            int i = this.onPrepare;
            if (i != -1) {
                this.onPlayFromUri.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.MediaDescriptionCompat.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_item_header, (ViewGroup) this.onPlayFromUri, false);
            this.write = linearLayout;
            InvalidTypeIdException.AudioAttributesImplBaseParcelizer(linearLayout, 2);
            this.onPlayFromUri.setAdapter(this.RemoteActionCompatParcelizer);
        }
        return this.onPlayFromUri;
    }

    @Override // kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        write writeVar = this.RemoteActionCompatParcelizer;
        if (writeVar != null) {
            writeVar.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.peekAvailableContext
    public final void read(peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.onPlay = audioAttributesCompatParcelizer;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlay;
        if (audioAttributesCompatParcelizer != null) {
            audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, z);
        }
    }

    @Override // kotlin.peekAvailableContext
    public final int IconCompatParcelizer() {
        return this.onPlayFromMediaId;
    }

    public final void read() {
        this.onPlayFromMediaId = 1;
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        Bundle bundle = new Bundle();
        if (this.onPlayFromUri != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.onPlayFromUri.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        write writeVar = this.RemoteActionCompatParcelizer;
        if (writeVar != null) {
            bundle.putBundle("android:menu:adapter", writeVar.IconCompatParcelizer());
        }
        if (this.write != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.write.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.onPlayFromUri.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.write.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
    }

    public final View IconCompatParcelizer(int i) {
        View viewInflate = this.MediaDescriptionCompat.inflate(i, (ViewGroup) this.write, false);
        read(viewInflate);
        return viewInflate;
    }

    private void read(View view) {
        this.write.addView(view);
        NavigationMenuView navigationMenuView = this.onPlayFromUri;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    private int AudioAttributesImplApi21Parcelizer() {
        return this.write.getChildCount();
    }

    private boolean write() {
        return AudioAttributesImplApi21Parcelizer() > 0;
    }

    public final void IconCompatParcelizer(ColorStateList colorStateList) {
        this.handleMediaPlayPauseIfPendingOnHandler = colorStateList;
        AudioAttributesCompatParcelizer(false);
    }

    public final void MediaBrowserCompatSearchResultReceiver(int i) {
        this.onAddQueueItem = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void write(ColorStateList colorStateList) {
        this.MediaBrowserCompatCustomActionResultReceiver = colorStateList;
        AudioAttributesCompatParcelizer(false);
    }

    public final void AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        this.onPause = colorStateList;
        AudioAttributesCompatParcelizer(false);
    }

    public final void MediaBrowserCompatItemReceiver(int i) {
        this.onFastForward = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.onMediaButtonEvent = z;
        AudioAttributesCompatParcelizer(false);
    }

    public final void read(Drawable drawable) {
        this.AudioAttributesImplBaseParcelizer = drawable;
        AudioAttributesCompatParcelizer(false);
    }

    public final void write(RippleDrawable rippleDrawable) {
        this.MediaBrowserCompatItemReceiver = rippleDrawable;
        AudioAttributesCompatParcelizer(false);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void read(int i) {
        this.IconCompatParcelizer = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void write(int i) {
        this.read = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void MediaMetadataCompat(int i) {
        this.onCustomAction = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void MediaDescriptionCompat(int i) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void AudioAttributesImplBaseParcelizer(int i) {
        this.onPrepareFromMediaId = i;
        AudioAttributesCompatParcelizer(false);
    }

    public final void AudioAttributesImplApi26Parcelizer(int i) {
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesCompatParcelizer(false);
        }
    }

    public final void read(boolean z) {
        write writeVar = this.RemoteActionCompatParcelizer;
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(z);
        }
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        if (this.onPlayFromSearch != z) {
            this.onPlayFromSearch = z;
            RemoteActionCompatParcelizer();
        }
    }

    private void RemoteActionCompatParcelizer() {
        int i = (write() || !this.onPlayFromSearch) ? 0 : this.onPrepareFromSearch;
        NavigationMenuView navigationMenuView = this.onPlayFromUri;
        navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
    }

    public final void read(WindowInsetsCompat windowInsetsCompat) {
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
        if (this.onPrepareFromSearch != iMediaBrowserCompatCustomActionResultReceiver) {
            this.onPrepareFromSearch = iMediaBrowserCompatCustomActionResultReceiver;
            RemoteActionCompatParcelizer();
        }
        NavigationMenuView navigationMenuView = this.onPlayFromUri;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.AudioAttributesImplBaseParcelizer());
        InvalidTypeIdException.write(this.write, windowInsetsCompat);
    }

    public final void AudioAttributesImplApi21Parcelizer(int i) {
        this.onPrepare = i;
        NavigationMenuView navigationMenuView = this.onPlayFromUri;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i);
        }
    }

    static abstract class MediaDescriptionCompat extends RecyclerView.onMediaButtonEvent {
        public MediaDescriptionCompat(View view) {
            super(view);
        }
    }

    static class AudioAttributesImplBaseParcelizer extends MediaDescriptionCompat {
        public AudioAttributesImplBaseParcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    static class MediaBrowserCompatItemReceiver extends MediaDescriptionCompat {
        public MediaBrowserCompatItemReceiver(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_item_subheader, viewGroup, false));
        }
    }

    static class AudioAttributesImplApi21Parcelizer extends MediaDescriptionCompat {
        public AudioAttributesImplApi21Parcelizer(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.design_navigation_item_separator, viewGroup, false));
        }
    }

    static class AudioAttributesCompatParcelizer extends MediaDescriptionCompat {
        public AudioAttributesCompatParcelizer(View view) {
            super(view);
        }
    }

    class write extends RecyclerView.IconCompatParcelizer<MediaDescriptionCompat> {
        private boolean IconCompatParcelizer;
        private onRetainNonConfigurationInstance read;
        private final ArrayList<RemoteActionCompatParcelizer> write = new ArrayList<>();

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final /* synthetic */ void onViewRecycled(RecyclerView.onMediaButtonEvent onmediabuttonevent) {
            read((MediaDescriptionCompat) onmediabuttonevent);
        }

        write() {
            write();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.write.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemViewType(int i) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write.get(i);
            if (remoteActionCompatParcelizer instanceof read) {
                return 2;
            }
            if (remoteActionCompatParcelizer instanceof IconCompatParcelizer) {
                return 3;
            }
            if (remoteActionCompatParcelizer instanceof AudioAttributesImplApi26Parcelizer) {
                return ((AudioAttributesImplApi26Parcelizer) remoteActionCompatParcelizer).write().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new AudioAttributesImplBaseParcelizer(checkBitsPerSample.this.MediaDescriptionCompat, viewGroup, checkBitsPerSample.this.MediaBrowserCompatMediaItem);
            }
            if (i == 1) {
                return new MediaBrowserCompatItemReceiver(checkBitsPerSample.this.MediaDescriptionCompat, viewGroup);
            }
            if (i == 2) {
                return new AudioAttributesImplApi21Parcelizer(checkBitsPerSample.this.MediaDescriptionCompat, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new AudioAttributesCompatParcelizer(checkBitsPerSample.this.write);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    if (itemViewType != 2) {
                        return;
                    }
                    read readVar = (read) this.write.get(i);
                    mediaDescriptionCompat.itemView.setPadding(checkBitsPerSample.this.IconCompatParcelizer, readVar.AudioAttributesCompatParcelizer(), checkBitsPerSample.this.read, readVar.RemoteActionCompatParcelizer());
                    return;
                }
                TextView textView = (TextView) mediaDescriptionCompat.itemView;
                textView.setText(((AudioAttributesImplApi26Parcelizer) this.write.get(i)).write().getTitle());
                _addSuperTypes.RemoteActionCompatParcelizer(textView, checkBitsPerSample.this.onAddQueueItem);
                textView.setPadding(checkBitsPerSample.this.onCustomAction, textView.getPaddingTop(), checkBitsPerSample.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, textView.getPaddingBottom());
                if (checkBitsPerSample.this.handleMediaPlayPauseIfPendingOnHandler != null) {
                    textView.setTextColor(checkBitsPerSample.this.handleMediaPlayPauseIfPendingOnHandler);
                }
                read(textView, i, true);
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) mediaDescriptionCompat.itemView;
            navigationMenuItemView.IconCompatParcelizer(checkBitsPerSample.this.MediaBrowserCompatCustomActionResultReceiver);
            navigationMenuItemView.setTextAppearance(checkBitsPerSample.this.onFastForward);
            if (checkBitsPerSample.this.onPause != null) {
                navigationMenuItemView.setTextColor(checkBitsPerSample.this.onPause);
            }
            InvalidTypeIdException.read(navigationMenuItemView, checkBitsPerSample.this.AudioAttributesImplBaseParcelizer != null ? checkBitsPerSample.this.AudioAttributesImplBaseParcelizer.getConstantState().newDrawable() : null);
            if (checkBitsPerSample.this.MediaBrowserCompatItemReceiver != null) {
                navigationMenuItemView.setForeground(checkBitsPerSample.this.MediaBrowserCompatItemReceiver.getConstantState().newDrawable());
            }
            AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = (AudioAttributesImplApi26Parcelizer) this.write.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(audioAttributesImplApi26Parcelizer.IconCompatParcelizer);
            navigationMenuItemView.setPadding(checkBitsPerSample.this.AudioAttributesImplApi26Parcelizer, checkBitsPerSample.this.MediaBrowserCompatSearchResultReceiver, checkBitsPerSample.this.AudioAttributesImplApi26Parcelizer, checkBitsPerSample.this.MediaBrowserCompatSearchResultReceiver);
            navigationMenuItemView.setIconPadding(checkBitsPerSample.this.AudioAttributesImplApi21Parcelizer);
            if (checkBitsPerSample.this.AudioAttributesCompatParcelizer) {
                navigationMenuItemView.setIconSize(checkBitsPerSample.this.RatingCompat);
            }
            navigationMenuItemView.setMaxLines(checkBitsPerSample.this.onPrepareFromMediaId);
            navigationMenuItemView.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer.write(), checkBitsPerSample.this.onMediaButtonEvent);
            read(navigationMenuItemView, i, false);
        }

        private void read(View view, final int i, final boolean z) {
            InvalidTypeIdException.AudioAttributesCompatParcelizer(view, new deserializeUsingCustom() { // from class: o.checkBitsPerSample.write.2
                @Override // kotlin.deserializeUsingCustom
                public final void onInitializeAccessibilityNodeInfo(View view2, hasSuperClassStartingWith hassuperclassstartingwith) {
                    super.onInitializeAccessibilityNodeInfo(view2, hassuperclassstartingwith);
                    hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(write.this.AudioAttributesCompatParcelizer(i), 1, 1, 1, z, view2.isSelected()));
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int AudioAttributesCompatParcelizer(int i) {
            int i2 = i;
            for (int i3 = 0; i3 < i; i3++) {
                if (checkBitsPerSample.this.RemoteActionCompatParcelizer.getItemViewType(i3) == 2 || checkBitsPerSample.this.RemoteActionCompatParcelizer.getItemViewType(i3) == 3) {
                    i2--;
                }
            }
            return i2;
        }

        private static void read(MediaDescriptionCompat mediaDescriptionCompat) {
            if (mediaDescriptionCompat instanceof AudioAttributesImplBaseParcelizer) {
                ((NavigationMenuItemView) mediaDescriptionCompat.itemView).read();
            }
        }

        public final void RemoteActionCompatParcelizer() {
            write();
            notifyDataSetChanged();
        }

        private void write() {
            if (this.IconCompatParcelizer) {
                return;
            }
            boolean z = true;
            this.IconCompatParcelizer = true;
            this.write.clear();
            this.write.add(new IconCompatParcelizer());
            int size = checkBitsPerSample.this.MediaMetadataCompat.MediaDescriptionCompat().size();
            int i = -1;
            int i2 = 0;
            boolean z2 = false;
            int size2 = 0;
            while (i2 < size) {
                onRetainNonConfigurationInstance onretainnonconfigurationinstance = checkBitsPerSample.this.MediaMetadataCompat.MediaDescriptionCompat().get(i2);
                if (onretainnonconfigurationinstance.isChecked()) {
                    RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
                }
                if (onretainnonconfigurationinstance.isCheckable()) {
                    onretainnonconfigurationinstance.write(false);
                }
                if (onretainnonconfigurationinstance.hasSubMenu()) {
                    SubMenu subMenu = onretainnonconfigurationinstance.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i2 != 0) {
                            this.write.add(new read(checkBitsPerSample.this.onCommand, 0));
                        }
                        this.write.add(new AudioAttributesImplApi26Parcelizer(onretainnonconfigurationinstance));
                        int size3 = this.write.size();
                        int size4 = subMenu.size();
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < size4) {
                            onRetainNonConfigurationInstance onretainnonconfigurationinstance2 = (onRetainNonConfigurationInstance) subMenu.getItem(i3);
                            if (onretainnonconfigurationinstance2.isVisible()) {
                                if (!z3 && onretainnonconfigurationinstance2.getIcon() != null) {
                                    z3 = z;
                                }
                                if (onretainnonconfigurationinstance2.isCheckable()) {
                                    onretainnonconfigurationinstance2.write(false);
                                }
                                if (onretainnonconfigurationinstance.isChecked()) {
                                    RemoteActionCompatParcelizer(onretainnonconfigurationinstance);
                                }
                                this.write.add(new AudioAttributesImplApi26Parcelizer(onretainnonconfigurationinstance2));
                            }
                            i3++;
                            z = true;
                        }
                        if (z3) {
                            IconCompatParcelizer(size3, this.write.size());
                        }
                    }
                } else {
                    int groupId = onretainnonconfigurationinstance.getGroupId();
                    if (groupId != i) {
                        size2 = this.write.size();
                        z2 = onretainnonconfigurationinstance.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            this.write.add(new read(checkBitsPerSample.this.onCommand, checkBitsPerSample.this.onCommand));
                        }
                    } else if (!z2 && onretainnonconfigurationinstance.getIcon() != null) {
                        IconCompatParcelizer(size2, this.write.size());
                        z2 = true;
                    }
                    AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = new AudioAttributesImplApi26Parcelizer(onretainnonconfigurationinstance);
                    audioAttributesImplApi26Parcelizer.IconCompatParcelizer = z2;
                    this.write.add(audioAttributesImplApi26Parcelizer);
                    i = groupId;
                }
                i2++;
                z = true;
            }
            this.IconCompatParcelizer = false;
        }

        private void IconCompatParcelizer(int i, int i2) {
            while (i < i2) {
                ((AudioAttributesImplApi26Parcelizer) this.write.get(i)).IconCompatParcelizer = true;
                i++;
            }
        }

        public final void RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
            if (this.read == onretainnonconfigurationinstance || !onretainnonconfigurationinstance.isCheckable()) {
                return;
            }
            onRetainNonConfigurationInstance onretainnonconfigurationinstance2 = this.read;
            if (onretainnonconfigurationinstance2 != null) {
                onretainnonconfigurationinstance2.setChecked(false);
            }
            this.read = onretainnonconfigurationinstance;
            onretainnonconfigurationinstance.setChecked(true);
        }

        public final Bundle IconCompatParcelizer() {
            Bundle bundle = new Bundle();
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.read;
            if (onretainnonconfigurationinstance != null) {
                bundle.putInt("android:menu:checked", onretainnonconfigurationinstance.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.write.size();
            for (int i = 0; i < size; i++) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write.get(i);
                if (remoteActionCompatParcelizer instanceof AudioAttributesImplApi26Parcelizer) {
                    onRetainNonConfigurationInstance onretainnonconfigurationinstanceWrite = ((AudioAttributesImplApi26Parcelizer) remoteActionCompatParcelizer).write();
                    View actionView = onretainnonconfigurationinstanceWrite != null ? onretainnonconfigurationinstanceWrite.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(onretainnonconfigurationinstanceWrite.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public final void IconCompatParcelizer(Bundle bundle) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstanceWrite;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            onRetainNonConfigurationInstance onretainnonconfigurationinstanceWrite2;
            int i = bundle.getInt("android:menu:checked", 0);
            if (i != 0) {
                this.IconCompatParcelizer = true;
                int size = this.write.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.write.get(i2);
                    if ((remoteActionCompatParcelizer instanceof AudioAttributesImplApi26Parcelizer) && (onretainnonconfigurationinstanceWrite2 = ((AudioAttributesImplApi26Parcelizer) remoteActionCompatParcelizer).write()) != null && onretainnonconfigurationinstanceWrite2.getItemId() == i) {
                        RemoteActionCompatParcelizer(onretainnonconfigurationinstanceWrite2);
                        break;
                    }
                    i2++;
                }
                this.IconCompatParcelizer = false;
                write();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = this.write.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.write.get(i3);
                    if ((remoteActionCompatParcelizer2 instanceof AudioAttributesImplApi26Parcelizer) && (onretainnonconfigurationinstanceWrite = ((AudioAttributesImplApi26Parcelizer) remoteActionCompatParcelizer2).write()) != null && (actionView = onretainnonconfigurationinstanceWrite.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(onretainnonconfigurationinstanceWrite.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            this.IconCompatParcelizer = z;
        }

        final int AudioAttributesCompatParcelizer() {
            int i = 0;
            for (int i2 = 0; i2 < checkBitsPerSample.this.RemoteActionCompatParcelizer.getItemCount(); i2++) {
                int itemViewType = checkBitsPerSample.this.RemoteActionCompatParcelizer.getItemViewType(i2);
                if (itemViewType == 0 || itemViewType == 1) {
                    i++;
                }
            }
            return i;
        }
    }

    static class AudioAttributesImplApi26Parcelizer implements RemoteActionCompatParcelizer {
        boolean IconCompatParcelizer;
        private final onRetainNonConfigurationInstance write;

        AudioAttributesImplApi26Parcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
            this.write = onretainnonconfigurationinstance;
        }

        public final onRetainNonConfigurationInstance write() {
            return this.write;
        }
    }

    static class read implements RemoteActionCompatParcelizer {
        private final int RemoteActionCompatParcelizer;
        private final int write;

        public read(int i, int i2) {
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    static class IconCompatParcelizer implements RemoteActionCompatParcelizer {
        IconCompatParcelizer() {
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver extends UIntKeyDeserializer {
        MediaBrowserCompatCustomActionResultReceiver(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // kotlin.UIntKeyDeserializer, kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hasSuperClassStartingWith.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(checkBitsPerSample.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), 1, false));
        }
    }
}
