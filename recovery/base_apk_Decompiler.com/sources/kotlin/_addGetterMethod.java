package kotlin;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class _addGetterMethod extends getComponentEnabledSetting {
    private boolean IconCompatParcelizer;
    private final FragmentManager RemoteActionCompatParcelizer;
    private _doAddInjectable AudioAttributesCompatParcelizer = null;
    private Fragment read = null;
    private final int write = 1;

    private static long RemoteActionCompatParcelizer(int i) {
        return i;
    }

    public abstract Fragment AudioAttributesCompatParcelizer(int i);

    @Override // kotlin.getComponentEnabledSetting
    public final Parcelable RemoteActionCompatParcelizer() {
        return null;
    }

    public _addGetterMethod(FragmentManager fragmentManager) {
        this.RemoteActionCompatParcelizer = fragmentManager;
    }

    @Override // kotlin.getComponentEnabledSetting
    public final void IconCompatParcelizer(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sb = new StringBuilder("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }

    @Override // kotlin.getComponentEnabledSetting
    public Object read(ViewGroup viewGroup, int i) {
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
        long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        Fragment fragmentFindFragmentByTag = this.RemoteActionCompatParcelizer.findFragmentByTag(read(viewGroup.getId(), jRemoteActionCompatParcelizer));
        if (fragmentFindFragmentByTag != null) {
            this.AudioAttributesCompatParcelizer.write(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = AudioAttributesCompatParcelizer(i);
            this.AudioAttributesCompatParcelizer.read(viewGroup.getId(), fragmentFindFragmentByTag, read(viewGroup.getId(), jRemoteActionCompatParcelizer));
        }
        if (fragmentFindFragmentByTag != this.read) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.write == 1) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fragmentFindFragmentByTag, anyIgnorals.write.RemoteActionCompatParcelizer);
                return fragmentFindFragmentByTag;
            }
            fragmentFindFragmentByTag.setUserVisibleHint(false);
        }
        return fragmentFindFragmentByTag;
    }

    @Override // kotlin.getComponentEnabledSetting
    public final void IconCompatParcelizer(ViewGroup viewGroup, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.AudioAttributesCompatParcelizer == null) {
            this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fragment);
        if (fragment.equals(this.read)) {
            this.read = null;
        }
    }

    @Override // kotlin.getComponentEnabledSetting
    public final void RemoteActionCompatParcelizer(Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.read;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.write == 1) {
                    if (this.AudioAttributesCompatParcelizer == null) {
                        this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                    }
                    this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.read, anyIgnorals.write.RemoteActionCompatParcelizer);
                } else {
                    this.read.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.write == 1) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
                }
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fragment, anyIgnorals.write.write);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.read = fragment;
        }
    }

    @Override // kotlin.getComponentEnabledSetting
    public final void write() {
        _doAddInjectable _doaddinjectable = this.AudioAttributesCompatParcelizer;
        if (_doaddinjectable != null) {
            if (!this.IconCompatParcelizer) {
                try {
                    this.IconCompatParcelizer = true;
                    _doaddinjectable.IconCompatParcelizer();
                } finally {
                    this.IconCompatParcelizer = false;
                }
            }
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    @Override // kotlin.getComponentEnabledSetting
    public final boolean RemoteActionCompatParcelizer(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String read(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }
}
