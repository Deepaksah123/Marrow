package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.findSubtypesCheckRepeatedNames;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00019B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u000b¢\u0006\u0004\b\u0004\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b%\u0010\u0010J\u001f\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010'J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u001bH\u0000¢\u0006\u0004\b)\u0010*J\u0019\u0010,\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b1\u0010\u0010R\u0018\u00103\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\r048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00106"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/FragmentManager;", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/FragmentManager;)V", "Landroid/view/View;", "", "read", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "", "", "drawChild", "(Landroid/graphics/Canvas;Landroid/view/View;J)Z", "endViewTransition", "onApplyWindowInsets", "removeAllViewsInLayout", "()V", "removeView", "removeViewAt", "(I)V", "removeViewInLayout", "removeViews", "(II)V", "removeViewsInLayout", "setDrawDisappearingViewsLast", "(Z)V", "Landroid/animation/LayoutTransition;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "startViewTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "AudioAttributesCompatParcelizer", "", "write", "Ljava/util/List;", "RemoteActionCompatParcelizer", "Z", "IconCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FragmentContainerView extends FrameLayout {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<View> write;
    private boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private View.OnApplyWindowInsetsListener AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<View> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        this.write = new ArrayList();
        this.RemoteActionCompatParcelizer = true;
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        String str;
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = new ArrayList();
        this.write = new ArrayList();
        this.RemoteActionCompatParcelizer = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.FragmentContainerView;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArr, "");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute != null) {
                str = "class";
            } else {
                classAttribute = typedArrayObtainStyledAttributes.getString(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.FragmentContainerView_android_name);
                str = "android:name";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
            sb.append(str);
            sb.append("=\"");
            sb.append(classAttribute);
            sb.append('\"');
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(attributeSet, "");
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        this.read = new ArrayList();
        this.write = new ArrayList();
        this.RemoteActionCompatParcelizer = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.FragmentContainerView;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iArr, "");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.FragmentContainerView_android_name) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.FragmentContainerView_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && fragmentFindFragmentById == null) {
            if (id == -1) {
                String strConcat = string != null ? " with tag ".concat(String.valueOf(string)) : "";
                StringBuilder sb = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb.append(classAttribute);
                sb.append(strConcat);
                throw new IllegalStateException(sb.toString());
            }
            Fragment fragment = fragmentManager.onCommand().read(context.getClassLoader(), classAttribute);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(fragment, "");
            fragment.mFragmentId = id;
            fragment.mContainerId = id;
            fragment.mTag = string;
            fragment.mFragmentManager = fragmentManager;
            fragment.mHost = fragmentManager.onPlay();
            fragment.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.IconCompatParcelizer().MediaDescriptionCompat().AudioAttributesCompatParcelizer(this, fragment, string).IconCompatParcelizer();
        }
        fragmentManager.AudioAttributesCompatParcelizer(this);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition p0) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.AudioAttributesCompatParcelizer = p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets p0) {
        WindowInsetsCompat windowInsetsCompatAudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(p0, "");
        WindowInsetsCompat windowInsetsCompatIconCompatParcelizer = WindowInsetsCompat.IconCompatParcelizer(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(windowInsetsCompatIconCompatParcelizer, "");
        if (this.AudioAttributesCompatParcelizer != null) {
            IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.INSTANCE;
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(onApplyWindowInsetsListener);
            windowInsetsCompatAudioAttributesCompatParcelizer = WindowInsetsCompat.IconCompatParcelizer(iconCompatParcelizer.RemoteActionCompatParcelizer(onApplyWindowInsetsListener, this, p0));
        } else {
            windowInsetsCompatAudioAttributesCompatParcelizer = InvalidTypeIdException.AudioAttributesCompatParcelizer(this, windowInsetsCompatIconCompatParcelizer);
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(windowInsetsCompatAudioAttributesCompatParcelizer, "");
        if (!windowInsetsCompatAudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                InvalidTypeIdException.write(getChildAt(i), windowInsetsCompatAudioAttributesCompatParcelizer);
            }
        }
        return p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (this.RemoteActionCompatParcelizer) {
            Iterator<T> it = this.read.iterator();
            while (it.hasNext()) {
                super.drawChild(p0, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(p0);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas p0, View p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (this.RemoteActionCompatParcelizer && !this.read.isEmpty() && this.read.contains(p1)) {
            return false;
        }
        return super.drawChild(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getParent() == this) {
            this.write.add(p0);
        }
        super.startViewTransition(p0);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write.remove(p0);
        if (this.read.remove(p0)) {
            this.RemoteActionCompatParcelizer = true;
        }
        super.endViewTransition(p0);
    }

    public final void setDrawDisappearingViewsLast(boolean p0) {
        this.RemoteActionCompatParcelizer = p0;
    }

    @Override // android.view.ViewGroup
    public final void addView(View p0, int p1, ViewGroup.LayoutParams p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (FragmentManager.write(p0) == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(p0);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString().toString());
        }
        super.addView(p0, p1, p2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int p0) {
        View childAt = getChildAt(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
        read(childAt);
        super.removeViewAt(p0);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read(p0);
        super.removeViewInLayout(p0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        read(p0);
        super.removeView(p0);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int p0, int p1) {
        for (int i = p0; i < p0 + p1; i++) {
            View childAt = getChildAt(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
            read(childAt);
        }
        super.removeViews(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int p0, int p1) {
        for (int i = p0; i < p0 + p1; i++) {
            View childAt = getChildAt(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
            read(childAt);
        }
        super.removeViewsInLayout(p0, p1);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childAt, "");
            read(childAt);
        }
        super.removeAllViewsInLayout();
    }

    private final void read(View p0) {
        if (this.write.contains(p0)) {
            this.read.add(p0);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/fragment/app/FragmentContainerView$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/view/View$OnApplyWindowInsetsListener;", "p0", "Landroid/view/View;", "p1", "Landroid/view/WindowInsets;", "p2", "RemoteActionCompatParcelizer", "(Landroid/view/View$OnApplyWindowInsetsListener;Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        public static final IconCompatParcelizer INSTANCE = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        public final WindowInsets RemoteActionCompatParcelizer(View.OnApplyWindowInsetsListener p0, View p1, WindowInsets p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            WindowInsets windowInsetsOnApplyWindowInsets = p0.onApplyWindowInsets(p1, p2);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(windowInsetsOnApplyWindowInsets, "");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0;
    }
}
