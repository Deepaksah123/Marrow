package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import kotlin.ActivityResult;
import kotlin.ThrowableDeserializer;
import kotlin._init_lambda5;
import kotlin.findFormatOverrides;
import kotlin.getFullyDrawnReporter;
import kotlin.onConfigurationChanged;
import kotlin.onRequestPermissionsResult;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.onTrimMemory;
import kotlin.peekAvailableContext;
import kotlin.registerForActivityResult;
import kotlin.removeOnContextAvailableListener;
import kotlin.removeOnTrimMemoryListener;
import kotlin.setItemInvoker;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuPresenter extends onConfigurationChanged implements ThrowableDeserializer.RemoteActionCompatParcelizer {
    int AudioAttributesImplApi21Parcelizer;
    write AudioAttributesImplApi26Parcelizer;
    IconCompatParcelizer AudioAttributesImplBaseParcelizer;
    RemoteActionCompatParcelizer IconCompatParcelizer;
    AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver;
    final MediaBrowserCompatCustomActionResultReceiver MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private final SparseBooleanArray RatingCompat;
    private Drawable handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private boolean onCommand;
    private read onCustomAction;
    private boolean onFastForward;
    private boolean onPause;
    private boolean onPlay;
    private int onPlayFromMediaId;

    public ActionMenuPresenter(Context context) {
        super(context, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_action_menu_layout, _init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_action_menu_item_layout);
        this.RatingCompat = new SparseBooleanArray();
        this.MediaBrowserCompatItemReceiver = new MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.onConfigurationChanged, kotlin.peekAvailableContext
    public final void read(Context context, onRequestPermissionsResult onrequestpermissionsresult) {
        super.read(context, onrequestpermissionsresult);
        Resources resources = context.getResources();
        getFullyDrawnReporter getfullydrawnreporterRemoteActionCompatParcelizer = getFullyDrawnReporter.RemoteActionCompatParcelizer(context);
        if (!this.onFastForward) {
            this.onAddQueueItem = true;
        }
        this.onPlayFromMediaId = getfullydrawnreporterRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = getfullydrawnreporterRemoteActionCompatParcelizer.read();
        int measuredWidth = this.onPlayFromMediaId;
        if (this.onAddQueueItem) {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                write writeVar = new write(this.write);
                this.AudioAttributesImplApi26Parcelizer = writeVar;
                if (this.onCommand) {
                    writeVar.setImageDrawable(this.handleMediaPlayPauseIfPendingOnHandler);
                    this.handleMediaPlayPauseIfPendingOnHandler = null;
                    this.onCommand = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.AudioAttributesImplApi26Parcelizer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.AudioAttributesImplApi26Parcelizer.getMeasuredWidth();
        } else {
            this.AudioAttributesImplApi26Parcelizer = null;
        }
        this.MediaBrowserCompatMediaItem = measuredWidth;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        this.MediaMetadataCompat = getFullyDrawnReporter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer).read();
        if (this.read != null) {
            this.read.read(true);
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        this.onAddQueueItem = true;
        this.onFastForward = true;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public final void IconCompatParcelizer(Drawable drawable) {
        write writeVar = this.AudioAttributesImplApi26Parcelizer;
        if (writeVar != null) {
            writeVar.setImageDrawable(drawable);
        } else {
            this.onCommand = true;
            this.handleMediaPlayPauseIfPendingOnHandler = drawable;
        }
    }

    @Override // kotlin.onConfigurationChanged
    public final registerForActivityResult RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        registerForActivityResult registerforactivityresult = this.AudioAttributesCompatParcelizer;
        registerForActivityResult registerforactivityresultRemoteActionCompatParcelizer = super.RemoteActionCompatParcelizer(viewGroup);
        if (registerforactivityresult != registerforactivityresultRemoteActionCompatParcelizer) {
            ((ActionMenuView) registerforactivityresultRemoteActionCompatParcelizer).setPresenter(this);
        }
        return registerforactivityresultRemoteActionCompatParcelizer;
    }

    @Override // kotlin.onConfigurationChanged
    public final View RemoteActionCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance, View view, ViewGroup viewGroup) {
        View actionView = onretainnonconfigurationinstance.getActionView();
        if (actionView == null || onretainnonconfigurationinstance.AudioAttributesImplApi26Parcelizer()) {
            actionView = super.RemoteActionCompatParcelizer(onretainnonconfigurationinstance, view, viewGroup);
        }
        actionView.setVisibility(onretainnonconfigurationinstance.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.write(layoutParams));
        }
        return actionView;
    }

    @Override // kotlin.onConfigurationChanged
    public final void read(onRetainNonConfigurationInstance onretainnonconfigurationinstance, registerForActivityResult.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(onretainnonconfigurationinstance);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) audioAttributesCompatParcelizer;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.AudioAttributesCompatParcelizer);
        if (this.onCustomAction == null) {
            this.onCustomAction = new read();
        }
        actionMenuItemView.setPopupCallback(this.onCustomAction);
    }

    @Override // kotlin.onConfigurationChanged
    public final boolean write(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        return onretainnonconfigurationinstance.AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.onConfigurationChanged, kotlin.peekAvailableContext
    public final void AudioAttributesCompatParcelizer(boolean z) {
        int size;
        super.AudioAttributesCompatParcelizer(z);
        ((View) this.AudioAttributesCompatParcelizer).requestLayout();
        if (this.read != null) {
            ArrayList<onRetainNonConfigurationInstance> arrayListRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
            int size2 = arrayListRemoteActionCompatParcelizer.size();
            for (int i = 0; i < size2; i++) {
                ThrowableDeserializer throwableDeserializerRemoteActionCompatParcelizer = arrayListRemoteActionCompatParcelizer.get(i).RemoteActionCompatParcelizer();
                if (throwableDeserializerRemoteActionCompatParcelizer != null) {
                    throwableDeserializerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
                }
            }
        }
        ArrayList<onRetainNonConfigurationInstance> arrayListMediaBrowserCompatCustomActionResultReceiver = this.read != null ? this.read.MediaBrowserCompatCustomActionResultReceiver() : null;
        if (this.onAddQueueItem && arrayListMediaBrowserCompatCustomActionResultReceiver != null && ((size = arrayListMediaBrowserCompatCustomActionResultReceiver.size()) != 1 ? size > 0 : (!arrayListMediaBrowserCompatCustomActionResultReceiver.get(0).isActionViewExpanded()))) {
            if (this.AudioAttributesImplApi26Parcelizer == null) {
                this.AudioAttributesImplApi26Parcelizer = new write(this.write);
            }
            ViewGroup viewGroup = (ViewGroup) this.AudioAttributesImplApi26Parcelizer.getParent();
            if (viewGroup != this.AudioAttributesCompatParcelizer) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.AudioAttributesImplApi26Parcelizer);
                }
                ((ActionMenuView) this.AudioAttributesCompatParcelizer).addView(this.AudioAttributesImplApi26Parcelizer, ActionMenuView.write());
            }
        } else {
            write writeVar = this.AudioAttributesImplApi26Parcelizer;
            if (writeVar != null && writeVar.getParent() == this.AudioAttributesCompatParcelizer) {
                ((ViewGroup) this.AudioAttributesCompatParcelizer).removeView(this.AudioAttributesImplApi26Parcelizer);
            }
        }
        ((ActionMenuView) this.AudioAttributesCompatParcelizer).setOverflowReserved(this.onAddQueueItem);
    }

    @Override // kotlin.onConfigurationChanged
    public final boolean AudioAttributesCompatParcelizer(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.AudioAttributesImplApi26Parcelizer) {
            return false;
        }
        return super.AudioAttributesCompatParcelizer(viewGroup, i);
    }

    @Override // kotlin.onConfigurationChanged, kotlin.peekAvailableContext
    public final boolean write(removeOnTrimMemoryListener removeontrimmemorylistener) {
        boolean z = false;
        if (!removeontrimmemorylistener.hasVisibleItems()) {
            return false;
        }
        removeOnTrimMemoryListener removeontrimmemorylistener2 = removeontrimmemorylistener;
        while (removeontrimmemorylistener2.onPlay() != this.read) {
            removeontrimmemorylistener2 = (removeOnTrimMemoryListener) removeontrimmemorylistener2.onPlay();
        }
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(removeontrimmemorylistener2.getItem());
        if (viewRemoteActionCompatParcelizer == null) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer = removeontrimmemorylistener.getItem().getItemId();
        int size = removeontrimmemorylistener.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = removeontrimmemorylistener.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, removeontrimmemorylistener, viewRemoteActionCompatParcelizer);
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(z);
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        super.write(removeontrimmemorylistener);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View RemoteActionCompatParcelizer(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.AudioAttributesCompatParcelizer;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof registerForActivityResult.AudioAttributesCompatParcelizer) && ((registerForActivityResult.AudioAttributesCompatParcelizer) childAt).IconCompatParcelizer() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        if (!this.onAddQueueItem || AudioAttributesImplBaseParcelizer() || this.read == null || this.AudioAttributesCompatParcelizer == null || this.AudioAttributesImplBaseParcelizer != null || this.read.MediaBrowserCompatCustomActionResultReceiver().isEmpty()) {
            return false;
        }
        this.AudioAttributesImplBaseParcelizer = new IconCompatParcelizer(new AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.read, this.AudioAttributesImplApi26Parcelizer));
        ((View) this.AudioAttributesCompatParcelizer).post(this.AudioAttributesImplBaseParcelizer);
        return true;
    }

    public final boolean write() {
        if (this.AudioAttributesImplBaseParcelizer != null && this.AudioAttributesCompatParcelizer != null) {
            ((View) this.AudioAttributesCompatParcelizer).removeCallbacks(this.AudioAttributesImplBaseParcelizer);
            this.AudioAttributesImplBaseParcelizer = null;
            return true;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (audioAttributesCompatParcelizer == null) {
            return false;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        return true;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer() | write();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.IconCompatParcelizer;
        if (remoteActionCompatParcelizer == null) {
            return false;
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
        return true;
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver;
        return audioAttributesCompatParcelizer != null && audioAttributesCompatParcelizer.write();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer != null || AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.onConfigurationChanged, kotlin.peekAvailableContext
    public final boolean AudioAttributesCompatParcelizer() {
        ArrayList<onRetainNonConfigurationInstance> arrayListMediaDescriptionCompat;
        int size;
        boolean z;
        boolean z2;
        View view = null;
        boolean z3 = false;
        if (this.read != null) {
            arrayListMediaDescriptionCompat = this.read.MediaDescriptionCompat();
            size = arrayListMediaDescriptionCompat.size();
        } else {
            arrayListMediaDescriptionCompat = null;
            size = 0;
        }
        int i = this.MediaMetadataCompat;
        int i2 = this.MediaBrowserCompatMediaItem;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.AudioAttributesCompatParcelizer;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            z = true;
            if (i3 >= size) {
                break;
            }
            onRetainNonConfigurationInstance onretainnonconfigurationinstance = arrayListMediaDescriptionCompat.get(i3);
            if (onretainnonconfigurationinstance.MediaBrowserCompatMediaItem()) {
                i4++;
            } else if (onretainnonconfigurationinstance.MediaBrowserCompatItemReceiver()) {
                i5++;
            } else {
                z4 = true;
            }
            if (this.MediaDescriptionCompat && onretainnonconfigurationinstance.isActionViewExpanded()) {
                i = 0;
            }
            i3++;
        }
        if (this.onAddQueueItem && (z4 || i5 + i4 > i)) {
            i--;
        }
        int i6 = i - i4;
        SparseBooleanArray sparseBooleanArray = this.RatingCompat;
        sparseBooleanArray.clear();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            onRetainNonConfigurationInstance onretainnonconfigurationinstance2 = arrayListMediaDescriptionCompat.get(i7);
            if (onretainnonconfigurationinstance2.MediaBrowserCompatMediaItem()) {
                View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(onretainnonconfigurationinstance2, view, viewGroup);
                viewRemoteActionCompatParcelizer.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewRemoteActionCompatParcelizer.getMeasuredWidth();
                i2 -= measuredWidth;
                if (i8 == 0) {
                    i8 = measuredWidth;
                }
                int groupId = onretainnonconfigurationinstance2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                onretainnonconfigurationinstance2.read(z);
                z2 = z3;
            } else if (onretainnonconfigurationinstance2.MediaBrowserCompatItemReceiver()) {
                int groupId2 = onretainnonconfigurationinstance2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = ((i6 > 0 || z5) && i2 > 0) ? z : z3;
                if (z6) {
                    View viewRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(onretainnonconfigurationinstance2, view, viewGroup);
                    viewRemoteActionCompatParcelizer2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewRemoteActionCompatParcelizer2.getMeasuredWidth();
                    i2 -= measuredWidth2;
                    if (i8 == 0) {
                        i8 = measuredWidth2;
                    }
                    z6 &= i2 + i8 > 0 ? z : false;
                }
                boolean z7 = z6;
                if (z7 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i9 = 0; i9 < i7; i9++) {
                        onRetainNonConfigurationInstance onretainnonconfigurationinstance3 = arrayListMediaDescriptionCompat.get(i9);
                        if (onretainnonconfigurationinstance3.getGroupId() == groupId2) {
                            if (onretainnonconfigurationinstance3.AudioAttributesImplApi21Parcelizer()) {
                                i6++;
                            }
                            onretainnonconfigurationinstance3.read(false);
                        }
                    }
                }
                if (z7) {
                    i6--;
                }
                onretainnonconfigurationinstance2.read(z7);
                z2 = false;
            } else {
                z2 = z3;
                onretainnonconfigurationinstance2.read(z2);
            }
            i7++;
            z3 = z2;
            view = null;
            z = true;
        }
        return z;
    }

    @Override // kotlin.onConfigurationChanged, kotlin.peekAvailableContext
    public final void IconCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
        RemoteActionCompatParcelizer();
        super.IconCompatParcelizer(onrequestpermissionsresult, z);
    }

    @Override // kotlin.peekAvailableContext
    public final Parcelable AudioAttributesImplApi26Parcelizer() {
        SavedState savedState = new SavedState();
        savedState.AudioAttributesCompatParcelizer = this.AudioAttributesImplApi21Parcelizer;
        return savedState;
    }

    @Override // kotlin.peekAvailableContext
    public final void IconCompatParcelizer(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            if (savedState.AudioAttributesCompatParcelizer <= 0 || (menuItemFindItem = this.read.findItem(savedState.AudioAttributesCompatParcelizer)) == null) {
                return;
            }
            write((removeOnTrimMemoryListener) menuItemFindItem.getSubMenu());
        }
    }

    @Override // o.ThrowableDeserializer.RemoteActionCompatParcelizer
    public final void read(boolean z) {
        if (z) {
            super.write((removeOnTrimMemoryListener) null);
        } else if (this.read != null) {
            this.read.RemoteActionCompatParcelizer(false);
        }
    }

    public final void IconCompatParcelizer(ActionMenuView actionMenuView) {
        this.AudioAttributesCompatParcelizer = actionMenuView;
        actionMenuView.RemoteActionCompatParcelizer(this.read);
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.appcompat.widget.ActionMenuPresenter.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        public int AudioAttributesCompatParcelizer;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        SavedState() {
        }

        SavedState(Parcel parcel) {
            this.AudioAttributesCompatParcelizer = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
        }
    }

    class write extends AppCompatImageView implements ActionMenuView.write {
        @Override // androidx.appcompat.widget.ActionMenuView.write
        public final boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.write
        public final boolean RemoteActionCompatParcelizer() {
            return false;
        }

        public write(Context context) {
            super(context, null, _init_lambda5.read.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setItemInvoker.AudioAttributesCompatParcelizer(this, getContentDescription());
            setOnTouchListener(new ActivityResult(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.write.5
                @Override // kotlin.ActivityResult
                public final removeOnContextAvailableListener AudioAttributesCompatParcelizer() {
                    if (ActionMenuPresenter.this.MediaBrowserCompatCustomActionResultReceiver == null) {
                        return null;
                    }
                    return ActionMenuPresenter.this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
                }

                @Override // kotlin.ActivityResult
                public final boolean read() {
                    ActionMenuPresenter.this.MediaBrowserCompatSearchResultReceiver();
                    return true;
                }

                @Override // kotlin.ActivityResult
                public final boolean write() {
                    if (ActionMenuPresenter.this.AudioAttributesImplBaseParcelizer != null) {
                        return false;
                    }
                    ActionMenuPresenter.this.write();
                    return true;
                }
            });
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.MediaBrowserCompatSearchResultReceiver();
            return true;
        }

        @Override // android.widget.ImageView
        protected final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                findFormatOverrides.write(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    class AudioAttributesCompatParcelizer extends onTrimMemory {
        public AudioAttributesCompatParcelizer(Context context, onRequestPermissionsResult onrequestpermissionsresult, View view) {
            super(context, onrequestpermissionsresult, view, true, _init_lambda5.read.actionOverflowMenuStyle);
            read();
            AudioAttributesCompatParcelizer(ActionMenuPresenter.this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.onTrimMemory
        public final void AudioAttributesCompatParcelizer() {
            if (ActionMenuPresenter.this.read != null) {
                ActionMenuPresenter.this.read.close();
            }
            ActionMenuPresenter.this.MediaBrowserCompatCustomActionResultReceiver = null;
            super.AudioAttributesCompatParcelizer();
        }
    }

    class RemoteActionCompatParcelizer extends onTrimMemory {
        public RemoteActionCompatParcelizer(Context context, removeOnTrimMemoryListener removeontrimmemorylistener, View view) {
            super(context, removeontrimmemorylistener, view, false, _init_lambda5.read.actionOverflowMenuStyle);
            if (!((onRetainNonConfigurationInstance) removeontrimmemorylistener.getItem()).AudioAttributesImplApi21Parcelizer()) {
                write(ActionMenuPresenter.this.AudioAttributesImplApi26Parcelizer == null ? (View) ActionMenuPresenter.this.AudioAttributesCompatParcelizer : ActionMenuPresenter.this.AudioAttributesImplApi26Parcelizer);
            }
            AudioAttributesCompatParcelizer(ActionMenuPresenter.this.MediaBrowserCompatItemReceiver);
        }

        @Override // kotlin.onTrimMemory
        public final void AudioAttributesCompatParcelizer() {
            ActionMenuPresenter.this.IconCompatParcelizer = null;
            ActionMenuPresenter.this.AudioAttributesImplApi21Parcelizer = 0;
            super.AudioAttributesCompatParcelizer();
        }
    }

    class MediaBrowserCompatCustomActionResultReceiver implements peekAvailableContext.AudioAttributesCompatParcelizer {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final boolean read(onRequestPermissionsResult onrequestpermissionsresult) {
            if (onrequestpermissionsresult == ActionMenuPresenter.this.read) {
                return false;
            }
            ActionMenuPresenter.this.AudioAttributesImplApi21Parcelizer = ((removeOnTrimMemoryListener) onrequestpermissionsresult).getItem().getItemId();
            peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ActionMenuPresenter.this.read();
            if (audioAttributesCompatParcelizer != null) {
                return audioAttributesCompatParcelizer.read(onrequestpermissionsresult);
            }
            return false;
        }

        @Override // o.peekAvailableContext.AudioAttributesCompatParcelizer
        public final void RemoteActionCompatParcelizer(onRequestPermissionsResult onrequestpermissionsresult, boolean z) {
            if (onrequestpermissionsresult instanceof removeOnTrimMemoryListener) {
                onrequestpermissionsresult.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(false);
            }
            peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = ActionMenuPresenter.this.read();
            if (audioAttributesCompatParcelizer != null) {
                audioAttributesCompatParcelizer.RemoteActionCompatParcelizer(onrequestpermissionsresult, z);
            }
        }
    }

    class IconCompatParcelizer implements Runnable {
        private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

        public IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ActionMenuPresenter.this.read != null) {
                ActionMenuPresenter.this.read.read();
            }
            View view = (View) ActionMenuPresenter.this.AudioAttributesCompatParcelizer;
            if (view != null && view.getWindowToken() != null && this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                ActionMenuPresenter.this.MediaBrowserCompatCustomActionResultReceiver = this.AudioAttributesCompatParcelizer;
            }
            ActionMenuPresenter.this.AudioAttributesImplBaseParcelizer = null;
        }
    }

    class read extends ActionMenuItemView.read {
        read() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.read
        public final removeOnContextAvailableListener IconCompatParcelizer() {
            if (ActionMenuPresenter.this.IconCompatParcelizer != null) {
                return ActionMenuPresenter.this.IconCompatParcelizer.IconCompatParcelizer();
            }
            return null;
        }
    }
}
