package kotlin;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import java.util.Objects;
import kotlin.findSubtypesCheckRepeatedNames;

/* JADX INFO: loaded from: classes2.dex */
public final class getResolverType implements LayoutInflater.Factory2 {
    final FragmentManager read;

    public getResolverType(FragmentManager fragmentManager) {
        this.read = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        final _addSetterMethod _addsettermethodWrite;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.read);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(findSubtypesCheckRepeatedNames.RemoteActionCompatParcelizer.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !NopAnnotationIntrospector1.write(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(attributeSet.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(attributeValue);
            throw new IllegalArgumentException(sb.toString());
        }
        Fragment fragmentFindFragmentById = resourceId != -1 ? this.read.findFragmentById(resourceId) : null;
        if (fragmentFindFragmentById == null && string != null) {
            fragmentFindFragmentById = this.read.findFragmentByTag(string);
        }
        if (fragmentFindFragmentById == null && id != -1) {
            fragmentFindFragmentById = this.read.findFragmentById(id);
        }
        if (fragmentFindFragmentById == null) {
            fragmentFindFragmentById = this.read.onCommand().read(context.getClassLoader(), attributeValue);
            fragmentFindFragmentById.mFromLayout = true;
            fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentFindFragmentById.mContainerId = id;
            fragmentFindFragmentById.mTag = string;
            fragmentFindFragmentById.mInLayout = true;
            fragmentFindFragmentById.mFragmentManager = this.read;
            fragmentFindFragmentById.mHost = this.read.onPlay();
            fragmentFindFragmentById.onInflate(this.read.onPlay().getRead(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
            _addsettermethodWrite = this.read.write(fragmentFindFragmentById);
            if (FragmentManager.write(2)) {
                Objects.toString(fragmentFindFragmentById);
                Integer.toHexString(resourceId);
            }
        } else {
            if (fragmentFindFragmentById.mInLayout) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(attributeSet.getPositionDescription());
                sb2.append(": Duplicate id 0x");
                sb2.append(Integer.toHexString(resourceId));
                sb2.append(", tag ");
                sb2.append(string);
                sb2.append(", or parent id 0x");
                sb2.append(Integer.toHexString(id));
                sb2.append(" with another fragment for ");
                sb2.append(attributeValue);
                throw new IllegalArgumentException(sb2.toString());
            }
            fragmentFindFragmentById.mInLayout = true;
            fragmentFindFragmentById.mFragmentManager = this.read;
            fragmentFindFragmentById.mHost = this.read.onPlay();
            fragmentFindFragmentById.onInflate(this.read.onPlay().getRead(), attributeSet, fragmentFindFragmentById.mSavedFragmentState);
            _addsettermethodWrite = this.read.read(fragmentFindFragmentById);
            if (FragmentManager.write(2)) {
                Objects.toString(fragmentFindFragmentById);
                Integer.toHexString(resourceId);
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        getJsonValueAccessor.read(fragmentFindFragmentById, viewGroup);
        fragmentFindFragmentById.mContainer = viewGroup;
        _addsettermethodWrite.RemoteActionCompatParcelizer();
        _addsettermethodWrite.read();
        if (fragmentFindFragmentById.mView == null) {
            StringBuilder sb3 = new StringBuilder("Fragment ");
            sb3.append(attributeValue);
            sb3.append(" did not create a view.");
            throw new IllegalStateException(sb3.toString());
        }
        if (resourceId != 0) {
            fragmentFindFragmentById.mView.setId(resourceId);
        }
        if (fragmentFindFragmentById.mView.getTag() == null) {
            fragmentFindFragmentById.mView.setTag(string);
        }
        fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: o.getResolverType.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                Fragment fragmentIconCompatParcelizer = _addsettermethodWrite.IconCompatParcelizer();
                _addsettermethodWrite.RemoteActionCompatParcelizer();
                _renameUsing.read((ViewGroup) fragmentIconCompatParcelizer.mView.getParent(), getResolverType.this.read).IconCompatParcelizer();
            }
        });
        return fragmentFindFragmentById.mView;
    }
}
