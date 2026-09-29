package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import kotlin.ActivityResult;
import kotlin.InvalidTypeIdException;
import kotlin.ThrowableDeserializer;
import kotlin._init_lambda5;
import kotlin.hasSuperClassStartingWith;
import kotlin.removeOnContextAvailableListener;
import kotlin.removeOnNewIntentListener;
import kotlin.setTitle;

/* JADX INFO: loaded from: classes4.dex */
public class ActivityChooserView extends ViewGroup {
    final FrameLayout AudioAttributesCompatParcelizer;
    private final View AudioAttributesImplApi21Parcelizer;
    PopupWindow.OnDismissListener AudioAttributesImplApi26Parcelizer;
    final DataSetObserver AudioAttributesImplBaseParcelizer;
    final FrameLayout IconCompatParcelizer;
    ThrowableDeserializer MediaBrowserCompatCustomActionResultReceiver;
    private final Drawable MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private final ImageView MediaMetadataCompat;
    private final ImageView RatingCompat;
    final read RemoteActionCompatParcelizer;
    private final ViewTreeObserver.OnGlobalLayoutListener handleMediaPlayPauseIfPendingOnHandler;
    private ListPopupWindow onCustomAction;
    int read;
    boolean write;

    public ActivityChooserView(Context context) {
        this(context, null);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesImplBaseParcelizer = new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.5
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.RemoteActionCompatParcelizer.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public final void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.RemoteActionCompatParcelizer.notifyDataSetInvalidated();
            }
        };
        this.handleMediaPlayPauseIfPendingOnHandler = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.widget.ActivityChooserView.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                if (ActivityChooserView.this.AudioAttributesCompatParcelizer()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.IconCompatParcelizer().write();
                        return;
                    }
                    ActivityChooserView.this.IconCompatParcelizer().AudioAttributesImplBaseParcelizer();
                    if (ActivityChooserView.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                        ActivityChooserView.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(true);
                    }
                }
            }
        };
        this.read = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActivityChooserView, i, 0);
        InvalidTypeIdException.IconCompatParcelizer(this, context, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActivityChooserView, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        this.read = typedArrayObtainStyledAttributes.getInt(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_activity_chooser_view, (ViewGroup) this, true);
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();
        this.MediaDescriptionCompat = audioAttributesCompatParcelizer;
        View viewFindViewById = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.activity_chooser_view_content);
        this.AudioAttributesImplApi21Parcelizer = viewFindViewById;
        this.MediaBrowserCompatItemReceiver = viewFindViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.default_activity_button);
        this.IconCompatParcelizer = frameLayout;
        frameLayout.setOnClickListener(audioAttributesCompatParcelizer);
        frameLayout.setOnLongClickListener(audioAttributesCompatParcelizer);
        this.RatingCompat = (ImageView) frameLayout.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.image);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.expand_activities_button);
        frameLayout2.setOnClickListener(audioAttributesCompatParcelizer);
        frameLayout2.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: androidx.appcompat.widget.ActivityChooserView.1
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                hasSuperClassStartingWith.write(accessibilityNodeInfo).IconCompatParcelizer(true);
            }
        });
        frameLayout2.setOnTouchListener(new ActivityResult(frameLayout2) { // from class: androidx.appcompat.widget.ActivityChooserView.2
            @Override // kotlin.ActivityResult
            public final removeOnContextAvailableListener AudioAttributesCompatParcelizer() {
                return ActivityChooserView.this.IconCompatParcelizer();
            }

            @Override // kotlin.ActivityResult
            public final boolean read() {
                ActivityChooserView.this.RemoteActionCompatParcelizer();
                return true;
            }

            @Override // kotlin.ActivityResult
            public final boolean write() {
                ActivityChooserView.this.write();
                return true;
            }
        });
        this.AudioAttributesCompatParcelizer = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.image);
        this.MediaMetadataCompat = imageView;
        imageView.setImageDrawable(drawable);
        read readVar = new read();
        this.RemoteActionCompatParcelizer = readVar;
        readVar.registerDataSetObserver(new DataSetObserver() { // from class: androidx.appcompat.widget.ActivityChooserView.3
            @Override // android.database.DataSetObserver
            public final void onChanged() {
                super.onChanged();
                ActivityChooserView.this.read();
            }
        });
        Resources resources = context.getResources();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(_init_lambda5.AudioAttributesCompatParcelizer.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(removeOnNewIntentListener removeonnewintentlistener) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(removeonnewintentlistener);
        if (AudioAttributesCompatParcelizer()) {
            write();
            RemoteActionCompatParcelizer();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.MediaMetadataCompat.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.MediaMetadataCompat.setContentDescription(getContext().getString(i));
    }

    public void setProvider(ThrowableDeserializer throwableDeserializer) {
        this.MediaBrowserCompatCustomActionResultReceiver = throwableDeserializer;
    }

    public final boolean RemoteActionCompatParcelizer() {
        if (AudioAttributesCompatParcelizer() || !this.MediaBrowserCompatMediaItem) {
            return false;
        }
        this.write = false;
        IconCompatParcelizer(this.read);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void IconCompatParcelizer(int i) {
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.handleMediaPlayPauseIfPendingOnHandler);
        ?? r0 = this.IconCompatParcelizer.getVisibility() == 0 ? 1 : 0;
        int i2 = this.RemoteActionCompatParcelizer.read();
        if (i != Integer.MAX_VALUE && i2 > i + r0) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(true);
            this.RemoteActionCompatParcelizer.write(i - 1);
        } else {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(false);
            this.RemoteActionCompatParcelizer.write(i);
        }
        ListPopupWindow listPopupWindowIconCompatParcelizer = IconCompatParcelizer();
        if (listPopupWindowIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        if (this.write || r0 == 0) {
            this.RemoteActionCompatParcelizer.read(true, r0);
        } else {
            this.RemoteActionCompatParcelizer.read(false, false);
        }
        listPopupWindowIconCompatParcelizer.read(Math.min(this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        listPopupWindowIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
        ThrowableDeserializer throwableDeserializer = this.MediaBrowserCompatCustomActionResultReceiver;
        if (throwableDeserializer != null) {
            throwableDeserializer.RemoteActionCompatParcelizer(true);
        }
        listPopupWindowIconCompatParcelizer.a_().setContentDescription(getContext().getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_activitychooserview_choose_application));
        listPopupWindowIconCompatParcelizer.a_().setSelector(new ColorDrawable(0));
    }

    public final boolean write() {
        if (!AudioAttributesCompatParcelizer()) {
            return true;
        }
        IconCompatParcelizer().write();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.handleMediaPlayPauseIfPendingOnHandler);
        return true;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeOnNewIntentListener removeonnewintentlistenerIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (removeonnewintentlistenerIconCompatParcelizer != null) {
            removeonnewintentlistenerIconCompatParcelizer.registerObserver(this.AudioAttributesImplBaseParcelizer);
        }
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnNewIntentListener removeonnewintentlistenerIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (removeonnewintentlistenerIconCompatParcelizer != null) {
            removeonnewintentlistenerIconCompatParcelizer.unregisterObserver(this.AudioAttributesImplBaseParcelizer);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.handleMediaPlayPauseIfPendingOnHandler);
        }
        if (AudioAttributesCompatParcelizer()) {
            write();
        }
        this.MediaBrowserCompatMediaItem = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        View view = this.AudioAttributesImplApi21Parcelizer;
        if (this.IconCompatParcelizer.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(view, i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.AudioAttributesImplApi21Parcelizer.layout(0, 0, i3 - i, i4 - i2);
        if (AudioAttributesCompatParcelizer()) {
            return;
        }
        write();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.AudioAttributesImplApi26Parcelizer = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.read = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
    }

    final ListPopupWindow IconCompatParcelizer() {
        if (this.onCustomAction == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.onCustomAction = listPopupWindow;
            listPopupWindow.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            this.onCustomAction.RemoteActionCompatParcelizer(this);
            this.onCustomAction.IconCompatParcelizer(true);
            this.onCustomAction.write(this.MediaDescriptionCompat);
            this.onCustomAction.IconCompatParcelizer(this.MediaDescriptionCompat);
        }
        return this.onCustomAction;
    }

    final void read() {
        if (this.RemoteActionCompatParcelizer.getCount() > 0) {
            this.AudioAttributesCompatParcelizer.setEnabled(true);
        } else {
            this.AudioAttributesCompatParcelizer.setEnabled(false);
        }
        int i = this.RemoteActionCompatParcelizer.read();
        int iAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (i == 1 || (i > 1 && iAudioAttributesCompatParcelizer > 0)) {
            this.IconCompatParcelizer.setVisibility(0);
            ResolveInfo resolveInfoWrite = this.RemoteActionCompatParcelizer.write();
            PackageManager packageManager = getContext().getPackageManager();
            this.RatingCompat.setImageDrawable(resolveInfoWrite.loadIcon(packageManager));
            if (this.MediaBrowserCompatSearchResultReceiver != 0) {
                this.IconCompatParcelizer.setContentDescription(getContext().getString(this.MediaBrowserCompatSearchResultReceiver, resolveInfoWrite.loadLabel(packageManager)));
            }
        } else {
            this.IconCompatParcelizer.setVisibility(8);
        }
        if (this.IconCompatParcelizer.getVisibility() == 0) {
            this.AudioAttributesImplApi21Parcelizer.setBackgroundDrawable(this.MediaBrowserCompatItemReceiver);
        } else {
            this.AudioAttributesImplApi21Parcelizer.setBackgroundDrawable(null);
        }
    }

    class AudioAttributesCompatParcelizer implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int itemViewType = ((read) adapterView.getAdapter()).getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ActivityChooserView.this.IconCompatParcelizer(Integer.MAX_VALUE);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.write();
            if (!ActivityChooserView.this.write) {
                ActivityChooserView.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                ActivityChooserView.this.RemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
            } else if (i > 0) {
                ActivityChooserView.this.RemoteActionCompatParcelizer.IconCompatParcelizer().read(i);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view == ActivityChooserView.this.IconCompatParcelizer) {
                ActivityChooserView.this.write();
                ActivityChooserView.this.RemoteActionCompatParcelizer.IconCompatParcelizer().RemoteActionCompatParcelizer(ActivityChooserView.this.RemoteActionCompatParcelizer.write());
                ActivityChooserView.this.RemoteActionCompatParcelizer.IconCompatParcelizer().IconCompatParcelizer();
                return;
            }
            if (view == ActivityChooserView.this.AudioAttributesCompatParcelizer) {
                ActivityChooserView.this.write = false;
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                activityChooserView.IconCompatParcelizer(activityChooserView.read);
                return;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.IconCompatParcelizer) {
                if (ActivityChooserView.this.RemoteActionCompatParcelizer.getCount() > 0) {
                    ActivityChooserView.this.write = true;
                    ActivityChooserView activityChooserView = ActivityChooserView.this;
                    activityChooserView.IconCompatParcelizer(activityChooserView.read);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            AudioAttributesCompatParcelizer();
            if (ActivityChooserView.this.MediaBrowserCompatCustomActionResultReceiver != null) {
                ActivityChooserView.this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(false);
            }
        }

        private void AudioAttributesCompatParcelizer() {
            if (ActivityChooserView.this.AudioAttributesImplApi26Parcelizer != null) {
                ActivityChooserView.this.AudioAttributesImplApi26Parcelizer.onDismiss();
            }
        }
    }

    class read extends BaseAdapter {
        private boolean AudioAttributesCompatParcelizer;
        private boolean AudioAttributesImplBaseParcelizer;
        private boolean IconCompatParcelizer;
        private int RemoteActionCompatParcelizer = 4;
        private removeOnNewIntentListener write;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 3;
        }

        read() {
        }

        public final void IconCompatParcelizer(removeOnNewIntentListener removeonnewintentlistener) {
            removeOnNewIntentListener removeonnewintentlistenerIconCompatParcelizer = ActivityChooserView.this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (removeonnewintentlistenerIconCompatParcelizer != null && ActivityChooserView.this.isShown()) {
                removeonnewintentlistenerIconCompatParcelizer.unregisterObserver(ActivityChooserView.this.AudioAttributesImplBaseParcelizer);
            }
            this.write = removeonnewintentlistener;
            if (removeonnewintentlistener != null && ActivityChooserView.this.isShown()) {
                removeonnewintentlistener.registerObserver(ActivityChooserView.this.AudioAttributesImplBaseParcelizer);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return (this.AudioAttributesImplBaseParcelizer && i == getCount() - 1) ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int iWrite = this.write.write();
            if (!this.AudioAttributesCompatParcelizer && this.write.RemoteActionCompatParcelizer() != null) {
                iWrite--;
            }
            int iMin = Math.min(iWrite, this.RemoteActionCompatParcelizer);
            return this.AudioAttributesImplBaseParcelizer ? iMin + 1 : iMin;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    return null;
                }
                throw new IllegalArgumentException();
            }
            if (!this.AudioAttributesCompatParcelizer && this.write.RemoteActionCompatParcelizer() != null) {
                i++;
            }
            return this.write.RemoteActionCompatParcelizer(i);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    if (view != null && view.getId() == 1) {
                        return view;
                    }
                    View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_activity_chooser_view_list_item, viewGroup, false);
                    viewInflate.setId(1);
                    ((TextView) viewInflate.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title)).setText(ActivityChooserView.this.getContext().getString(_init_lambda5.AudioAttributesImplApi21Parcelizer.abc_activity_chooser_view_see_all));
                    return viewInflate;
                }
                throw new IllegalArgumentException();
            }
            if (view == null || view.getId() != _init_lambda5.AudioAttributesImplBaseParcelizer.list_item) {
                view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(_init_lambda5.MediaBrowserCompatCustomActionResultReceiver.abc_activity_chooser_view_list_item, viewGroup, false);
            }
            PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
            ImageView imageView = (ImageView) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.icon);
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
            ((TextView) view.findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.title)).setText(resolveInfo.loadLabel(packageManager));
            if (this.AudioAttributesCompatParcelizer && i == 0 && this.IconCompatParcelizer) {
                view.setActivated(true);
                return view;
            }
            view.setActivated(false);
            return view;
        }

        public final int AudioAttributesImplApi21Parcelizer() {
            int i = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int iMax = 0;
            View view = null;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.RemoteActionCompatParcelizer = i;
            return iMax;
        }

        public final void write(int i) {
            if (this.RemoteActionCompatParcelizer != i) {
                this.RemoteActionCompatParcelizer = i;
                notifyDataSetChanged();
            }
        }

        public final ResolveInfo write() {
            return this.write.RemoteActionCompatParcelizer();
        }

        public final void AudioAttributesCompatParcelizer(boolean z) {
            if (this.AudioAttributesImplBaseParcelizer != z) {
                this.AudioAttributesImplBaseParcelizer = z;
                notifyDataSetChanged();
            }
        }

        public final int read() {
            return this.write.write();
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.write.read();
        }

        public final removeOnNewIntentListener IconCompatParcelizer() {
            return this.write;
        }

        public final void read(boolean z, boolean z2) {
            if (this.AudioAttributesCompatParcelizer == z && this.IconCompatParcelizer == z2) {
                return;
            }
            this.AudioAttributesCompatParcelizer = z;
            this.IconCompatParcelizer = z2;
            notifyDataSetChanged();
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public static class InnerLayout extends LinearLayout {
        private static final int[] read = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            setTitle settitleIconCompatParcelizer = setTitle.IconCompatParcelizer(context, attributeSet, read);
            setBackgroundDrawable(settitleIconCompatParcelizer.IconCompatParcelizer(0));
            settitleIconCompatParcelizer.write();
        }
    }
}
