package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.menuHostHelperlambda0;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {
    Button AudioAttributesCompatParcelizer;
    Button AudioAttributesImplApi21Parcelizer;
    Handler AudioAttributesImplApi26Parcelizer;
    Message IconCompatParcelizer;
    Message MediaBrowserCompatCustomActionResultReceiver;
    final menuHostHelperlambda0 MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    int MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    ListView MediaDescriptionCompat;
    int MediaMetadataCompat;
    int RatingCompat;
    Message RemoteActionCompatParcelizer;
    private CharSequence onAddQueueItem;
    private Drawable onCommand;
    private Drawable onCustomAction;
    private CharSequence onFastForward;
    private Drawable onMediaButtonEvent;
    private CharSequence onPause;
    private int onPlay;
    private ImageView onPlayFromSearch;
    private View onPlayFromUri;
    private Drawable onPrepareFromMediaId;
    private final Context onPrepareFromSearch;
    private boolean onPrepareFromUri;
    private TextView onRemoveQueueItem;
    private NestedScrollView onRemoveQueueItemAt;
    private int onRewind;
    private CharSequence onSeekTo;
    private TextView onSetCaptioningEnabled;
    private View onSetRating;
    private int onSetRepeatMode;
    private CharSequence onSetShuffleMode;
    private final Window onSkipToPrevious;
    Button read;
    ListAdapter write;
    private boolean onSetPlaybackSpeed = false;
    private int onPrepare = 0;
    int AudioAttributesImplBaseParcelizer = -1;
    private int onPlayFromMediaId = 0;
    private final View.OnClickListener handleMediaPlayPauseIfPendingOnHandler = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message messageObtain;
            if (view == AlertController.this.AudioAttributesImplApi21Parcelizer && AlertController.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                messageObtain = Message.obtain(AlertController.this.MediaBrowserCompatCustomActionResultReceiver);
            } else if (view == AlertController.this.read && AlertController.this.IconCompatParcelizer != null) {
                messageObtain = Message.obtain(AlertController.this.IconCompatParcelizer);
            } else {
                messageObtain = (view != AlertController.this.AudioAttributesCompatParcelizer || AlertController.this.RemoteActionCompatParcelizer == null) ? null : Message.obtain(AlertController.this.RemoteActionCompatParcelizer);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController.this.AudioAttributesImplApi26Parcelizer.obtainMessage(1, AlertController.this.MediaBrowserCompatItemReceiver).sendToTarget();
        }
    };

    static final class AudioAttributesCompatParcelizer extends Handler {
        private WeakReference<DialogInterface> IconCompatParcelizer;

        public AudioAttributesCompatParcelizer(DialogInterface dialogInterface) {
            this.IconCompatParcelizer = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.IconCompatParcelizer.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static boolean read(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(_init_lambda5.read.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public AlertController(Context context, menuHostHelperlambda0 menuhosthelperlambda0, Window window) {
        this.onPrepareFromSearch = context;
        this.MediaBrowserCompatItemReceiver = menuhosthelperlambda0;
        this.onSkipToPrevious = window;
        this.AudioAttributesImplApi26Parcelizer = new AudioAttributesCompatParcelizer(menuhosthelperlambda0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, _init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog, _init_lambda5.read.alertDialogStyle, 0);
        this.MediaBrowserCompatMediaItem = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_android_layout, 0);
        this.onPlay = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_buttonPanelSideLayout, 0);
        this.MediaMetadataCompat = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_listLayout, 0);
        this.onRewind = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_multiChoiceItemLayout, 0);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_singleChoiceItemLayout, 0);
        this.RatingCompat = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_listItemLayout, 0);
        this.onPrepareFromUri = typedArrayObtainStyledAttributes.getBoolean(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_showTitle, true);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        menuhosthelperlambda0.IconCompatParcelizer(1);
    }

    private static boolean read(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (read(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void read() {
        this.MediaBrowserCompatItemReceiver.setContentView(RemoteActionCompatParcelizer());
        write();
    }

    private int RemoteActionCompatParcelizer() {
        if (this.onPlay == 0) {
            return this.MediaBrowserCompatMediaItem;
        }
        return this.MediaBrowserCompatMediaItem;
    }

    public final void read(CharSequence charSequence) {
        this.onSetShuffleMode = charSequence;
        TextView textView = this.onSetCaptioningEnabled;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void write(View view) {
        this.onPlayFromUri = view;
    }

    public final void RemoteActionCompatParcelizer(View view) {
        this.onSetRating = view;
        this.onSetRepeatMode = 0;
        this.onSetPlaybackSpeed = false;
    }

    public final void IconCompatParcelizer(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message messageObtainMessage = onClickListener != null ? this.AudioAttributesImplApi26Parcelizer.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.onPause = charSequence;
            this.RemoteActionCompatParcelizer = messageObtainMessage;
            this.onCommand = drawable;
        } else if (i == -2) {
            this.onAddQueueItem = charSequence;
            this.IconCompatParcelizer = messageObtainMessage;
            this.onCustomAction = drawable;
        } else {
            if (i == -1) {
                this.onFastForward = charSequence;
                this.MediaBrowserCompatCustomActionResultReceiver = messageObtainMessage;
                this.onMediaButtonEvent = drawable;
                return;
            }
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public final void write(Drawable drawable) {
        this.onPrepareFromMediaId = drawable;
        this.onPrepare = 0;
        ImageView imageView = this.onPlayFromSearch;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.onPlayFromSearch.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public final ListView IconCompatParcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final boolean write(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.onRemoveQueueItemAt;
        return nestedScrollView != null && nestedScrollView.write(keyEvent);
    }

    public final boolean IconCompatParcelizer(KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.onRemoveQueueItemAt;
        return nestedScrollView != null && nestedScrollView.write(keyEvent);
    }

    private static ViewGroup read(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void write() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.parentPanel);
        View viewFindViewById4 = viewFindViewById3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.topPanel);
        View viewFindViewById5 = viewFindViewById3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.contentPanel);
        View viewFindViewById6 = viewFindViewById3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.customPanel);
        write(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.topPanel);
        View viewFindViewById8 = viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.contentPanel);
        View viewFindViewById9 = viewGroup.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.buttonPanel);
        ViewGroup viewGroup2 = read(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroup3 = read(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroup4 = read(viewFindViewById9, viewFindViewById6);
        RemoteActionCompatParcelizer(viewGroup3);
        read(viewGroup4);
        IconCompatParcelizer(viewGroup2);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (viewGroup2 == null || viewGroup2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = (viewGroup4 == null || viewGroup4.getVisibility() == 8) ? false : true;
        if (!z3 && viewGroup3 != null && (viewFindViewById2 = viewGroup3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.textSpacerNoButtons)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z2 != 0) {
            NestedScrollView nestedScrollView = this.onRemoveQueueItemAt;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = this.MediaDescriptionCompat == null ? null : viewGroup2.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.titleDividerNoCustom);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroup3 != null && (viewFindViewById = viewGroup3.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.textSpacerNoTitle)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.MediaDescriptionCompat;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).setHasDecor(z2, z3);
        }
        if (!z) {
            View view = this.MediaDescriptionCompat;
            if (view == null) {
                view = this.onRemoveQueueItemAt;
            }
            if (view != null) {
                RemoteActionCompatParcelizer(viewGroup3, view, z2 | (z3 ? 2 : 0));
            }
        }
        ListView listView2 = this.MediaDescriptionCompat;
        if (listView2 == null || (listAdapter = this.write) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i = this.AudioAttributesImplBaseParcelizer;
        if (i >= 0) {
            listView2.setItemChecked(i, true);
            listView2.setSelection(i);
        }
    }

    private void RemoteActionCompatParcelizer(ViewGroup viewGroup, View view, int i) {
        View viewFindViewById = this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.scrollIndicatorUp);
        View viewFindViewById2 = this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.scrollIndicatorDown);
        InvalidTypeIdException.RemoteActionCompatParcelizer(view, i, 3);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void write(ViewGroup viewGroup) {
        View view = this.onSetRating;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !read(view)) {
            this.onSkipToPrevious.setFlags(131072, 131072);
        }
        if (z) {
            ((FrameLayout) this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.custom)).addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.MediaDescriptionCompat != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = BitmapDescriptorFactory.HUE_RED;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void IconCompatParcelizer(ViewGroup viewGroup) {
        if (this.onPlayFromUri != null) {
            viewGroup.addView(this.onPlayFromUri, 0, new ViewGroup.LayoutParams(-1, -2));
            this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title_template).setVisibility(8);
            return;
        }
        this.onPlayFromSearch = (ImageView) this.onSkipToPrevious.findViewById(R.id.icon);
        if (!TextUtils.isEmpty(this.onSetShuffleMode) && this.onPrepareFromUri) {
            TextView textView = (TextView) this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.alertTitle);
            this.onSetCaptioningEnabled = textView;
            textView.setText(this.onSetShuffleMode);
            Drawable drawable = this.onPrepareFromMediaId;
            if (drawable != null) {
                this.onPlayFromSearch.setImageDrawable(drawable);
                return;
            } else {
                this.onSetCaptioningEnabled.setPadding(this.onPlayFromSearch.getPaddingLeft(), this.onPlayFromSearch.getPaddingTop(), this.onPlayFromSearch.getPaddingRight(), this.onPlayFromSearch.getPaddingBottom());
                this.onPlayFromSearch.setVisibility(8);
                return;
            }
        }
        this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title_template).setVisibility(8);
        this.onPlayFromSearch.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private void RemoteActionCompatParcelizer(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.onSkipToPrevious.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.scrollView);
        this.onRemoveQueueItemAt = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.onRemoveQueueItemAt.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.onRemoveQueueItem = textView;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
        this.onRemoveQueueItemAt.removeView(this.onRemoveQueueItem);
        if (this.MediaDescriptionCompat != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.onRemoveQueueItemAt.getParent();
            int iIndexOfChild = viewGroup2.indexOfChild(this.onRemoveQueueItemAt);
            viewGroup2.removeViewAt(iIndexOfChild);
            viewGroup2.addView(this.MediaDescriptionCompat, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void read(ViewGroup viewGroup) {
        int i;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.AudioAttributesImplApi21Parcelizer = button;
        button.setOnClickListener(this.handleMediaPlayPauseIfPendingOnHandler);
        if (TextUtils.isEmpty(this.onFastForward) && this.onMediaButtonEvent == null) {
            this.AudioAttributesImplApi21Parcelizer.setVisibility(8);
            i = 0;
        } else {
            this.AudioAttributesImplApi21Parcelizer.setText(this.onFastForward);
            Drawable drawable = this.onMediaButtonEvent;
            if (drawable != null) {
                int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                drawable.setBounds(0, 0, i2, i2);
                this.AudioAttributesImplApi21Parcelizer.setCompoundDrawables(this.onMediaButtonEvent, null, null, null);
            }
            this.AudioAttributesImplApi21Parcelizer.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.read = button2;
        button2.setOnClickListener(this.handleMediaPlayPauseIfPendingOnHandler);
        if (TextUtils.isEmpty(this.onAddQueueItem) && this.onCustomAction == null) {
            this.read.setVisibility(8);
        } else {
            this.read.setText(this.onAddQueueItem);
            Drawable drawable2 = this.onCustomAction;
            if (drawable2 != null) {
                int i3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                drawable2.setBounds(0, 0, i3, i3);
                this.read.setCompoundDrawables(this.onCustomAction, null, null, null);
            }
            this.read.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.AudioAttributesCompatParcelizer = button3;
        button3.setOnClickListener(this.handleMediaPlayPauseIfPendingOnHandler);
        if (TextUtils.isEmpty(this.onPause) && this.onCommand == null) {
            this.AudioAttributesCompatParcelizer.setVisibility(8);
        } else {
            this.AudioAttributesCompatParcelizer.setText(this.onPause);
            Drawable drawable3 = this.onCommand;
            if (drawable3 != null) {
                int i4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                drawable3.setBounds(0, 0, i4, i4);
                this.AudioAttributesCompatParcelizer.setCompoundDrawables(this.onCommand, null, null, null);
            }
            this.AudioAttributesCompatParcelizer.setVisibility(0);
            i |= 4;
        }
        if (read(this.onPrepareFromSearch)) {
            if (i == 1) {
                RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            } else if (i == 2) {
                RemoteActionCompatParcelizer(this.read);
            } else if (i == 4) {
                RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        }
        if (i != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private static void RemoteActionCompatParcelizer(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static class RecycleListView extends ListView {
        private final int IconCompatParcelizer;
        private final int write;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.RecycleListView);
            this.write = typedArrayObtainStyledAttributes.getDimensionPixelOffset(_init_lambda5.AudioAttributesImplApi26Parcelizer.RecycleListView_paddingBottomNoButtons, -1);
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelOffset(_init_lambda5.AudioAttributesImplApi26Parcelizer.RecycleListView_paddingTopNoTitle, -1);
        }

        public void setHasDecor(boolean z, boolean z2) {
            if (z2 && z) {
                return;
            }
            setPadding(getPaddingLeft(), z ? getPaddingTop() : this.IconCompatParcelizer, getPaddingRight(), z2 ? getPaddingBottom() : this.write);
        }
    }

    public static class IconCompatParcelizer {
        public View AudioAttributesCompatParcelizer;
        public CharSequence AudioAttributesImplApi21Parcelizer;
        public DialogInterface.OnClickListener AudioAttributesImplApi26Parcelizer;
        public final LayoutInflater AudioAttributesImplBaseParcelizer;
        public ListAdapter IconCompatParcelizer;
        public boolean MediaBrowserCompatCustomActionResultReceiver;
        public Drawable MediaBrowserCompatItemReceiver;
        public DialogInterface.OnDismissListener MediaBrowserCompatMediaItem;
        public DialogInterface.OnClickListener MediaBrowserCompatSearchResultReceiver;
        public View MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        public DialogInterface.OnCancelListener MediaDescriptionCompat;
        public DialogInterface.OnClickListener MediaMetadataCompat;
        public DialogInterface.OnKeyListener RatingCompat;
        public CharSequence handleMediaPlayPauseIfPendingOnHandler;
        public int onAddQueueItem;
        public CharSequence onCommand;
        private Cursor onMediaButtonEvent;
        private CharSequence[] onPause;
        private boolean onPlayFromMediaId;
        private CharSequence onPlayFromSearch;
        private Drawable onPlayFromUri;
        private DialogInterface.OnMultiChoiceClickListener onPrepare;
        private Drawable onPrepareFromMediaId;
        private CharSequence onPrepareFromSearch;
        private AdapterView.OnItemSelectedListener onRemoveQueueItem;
        private AudioAttributesCompatParcelizer onRewind;
        private Drawable onSeekTo;
        public final Context read;
        private int onPlay = 0;
        private int onFastForward = 0;
        public boolean onCustomAction = false;
        public int RemoteActionCompatParcelizer = -1;
        private boolean onPrepareFromUri = true;
        public boolean write = true;

        public interface AudioAttributesCompatParcelizer {
        }

        public IconCompatParcelizer(Context context) {
            this.read = context;
            this.AudioAttributesImplBaseParcelizer = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public final void IconCompatParcelizer(AlertController alertController) {
            View view = this.AudioAttributesCompatParcelizer;
            if (view != null) {
                alertController.write(view);
            } else {
                CharSequence charSequence = this.onCommand;
                if (charSequence != null) {
                    alertController.read(charSequence);
                }
                Drawable drawable = this.MediaBrowserCompatItemReceiver;
                if (drawable != null) {
                    alertController.write(drawable);
                }
            }
            CharSequence charSequence2 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (charSequence2 != null) {
                alertController.IconCompatParcelizer(-1, charSequence2, this.MediaBrowserCompatSearchResultReceiver, this.onSeekTo);
            }
            CharSequence charSequence3 = this.AudioAttributesImplApi21Parcelizer;
            if (charSequence3 != null) {
                alertController.IconCompatParcelizer(-2, charSequence3, this.AudioAttributesImplApi26Parcelizer, this.onPlayFromUri);
            }
            if (this.IconCompatParcelizer != null) {
                AudioAttributesCompatParcelizer(alertController);
            }
            View view2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            if (view2 != null) {
                alertController.RemoteActionCompatParcelizer(view2);
            }
        }

        private void AudioAttributesCompatParcelizer(final AlertController alertController) {
            int i;
            RecycleListView recycleListView = (RecycleListView) this.AudioAttributesImplBaseParcelizer.inflate(alertController.MediaMetadataCompat, (ViewGroup) null);
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                i = alertController.MediaBrowserCompatSearchResultReceiver;
            } else {
                i = alertController.RatingCompat;
            }
            ListAdapter remoteActionCompatParcelizer = this.IconCompatParcelizer;
            if (remoteActionCompatParcelizer == null) {
                remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this.read, i, this.onPause);
            }
            alertController.write = remoteActionCompatParcelizer;
            alertController.AudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer;
            if (this.MediaMetadataCompat != null) {
                recycleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.IconCompatParcelizer.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        IconCompatParcelizer.this.MediaMetadataCompat.onClick(alertController.MediaBrowserCompatItemReceiver, i2);
                        if (IconCompatParcelizer.this.MediaBrowserCompatCustomActionResultReceiver) {
                            return;
                        }
                        alertController.MediaBrowserCompatItemReceiver.dismiss();
                    }
                });
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                recycleListView.setChoiceMode(1);
            }
            alertController.MediaDescriptionCompat = recycleListView;
        }
    }

    static class RemoteActionCompatParcelizer extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }

        public RemoteActionCompatParcelizer(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, R.id.text1, charSequenceArr);
        }
    }
}
