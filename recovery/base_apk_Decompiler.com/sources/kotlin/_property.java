package kotlin;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class _property {
    private _addMethods IconCompatParcelizer;
    private final ArrayList<Fragment> RemoteActionCompatParcelizer = new ArrayList<>();
    private final HashMap<String, _addSetterMethod> read = new HashMap<>();
    private final HashMap<String, Bundle> write = new HashMap<>();

    public final void IconCompatParcelizer(_addMethods _addmethods) {
        this.IconCompatParcelizer = _addmethods;
    }

    public final _addMethods MediaBrowserCompatItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.read.clear();
    }

    public final void write(List<String> list) {
        this.RemoteActionCompatParcelizer.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentWrite = write(str);
                if (fragmentWrite == null) {
                    StringBuilder sb = new StringBuilder("No instantiated fragment for (");
                    sb.append(str);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                if (FragmentManager.write(2)) {
                    Objects.toString(fragmentWrite);
                }
                IconCompatParcelizer(fragmentWrite);
            }
        }
    }

    public final void IconCompatParcelizer(_addSetterMethod _addsettermethod) {
        Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
        if (AudioAttributesCompatParcelizer(fragmentIconCompatParcelizer.mWho)) {
            return;
        }
        this.read.put(fragmentIconCompatParcelizer.mWho, _addsettermethod);
        if (fragmentIconCompatParcelizer.mRetainInstanceChangedWhileDetached) {
            if (fragmentIconCompatParcelizer.mRetainInstance) {
                this.IconCompatParcelizer.read(fragmentIconCompatParcelizer);
            } else {
                this.IconCompatParcelizer.write(fragmentIconCompatParcelizer);
            }
            fragmentIconCompatParcelizer.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.write(2)) {
            Objects.toString(fragmentIconCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer(Fragment fragment) {
        if (this.RemoteActionCompatParcelizer.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: ".concat(String.valueOf(fragment)));
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final void write(int i) {
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                _addsettermethod.IconCompatParcelizer(i);
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        Iterator<Fragment> it = this.RemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            _addSetterMethod _addsettermethod = this.read.get(it.next().mWho);
            if (_addsettermethod != null) {
                _addsettermethod.RemoteActionCompatParcelizer();
            }
        }
        for (_addSetterMethod _addsettermethod2 : this.read.values()) {
            if (_addsettermethod2 != null) {
                _addsettermethod2.RemoteActionCompatParcelizer();
                Fragment fragmentIconCompatParcelizer = _addsettermethod2.IconCompatParcelizer();
                if (fragmentIconCompatParcelizer.mRemoving && !fragmentIconCompatParcelizer.isInBackStack()) {
                    if (fragmentIconCompatParcelizer.mBeingSaved && !this.write.containsKey(fragmentIconCompatParcelizer.mWho)) {
                        IconCompatParcelizer(fragmentIconCompatParcelizer.mWho, _addsettermethod2.MediaBrowserCompatItemReceiver());
                    }
                    RemoteActionCompatParcelizer(_addsettermethod2);
                }
            }
        }
    }

    public final void write(Fragment fragment) {
        synchronized (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer.remove(fragment);
        }
        fragment.mAdded = false;
    }

    final void RemoteActionCompatParcelizer(_addSetterMethod _addsettermethod) {
        Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
        if (fragmentIconCompatParcelizer.mRetainInstance) {
            this.IconCompatParcelizer.write(fragmentIconCompatParcelizer);
        }
        if (this.read.get(fragmentIconCompatParcelizer.mWho) == _addsettermethod && this.read.put(fragmentIconCompatParcelizer.mWho, null) != null && FragmentManager.write(2)) {
            Objects.toString(fragmentIconCompatParcelizer);
        }
    }

    public final void IconCompatParcelizer() {
        this.read.values().removeAll(Collections.singleton(null));
    }

    final Bundle AudioAttributesImplApi26Parcelizer(String str) {
        return this.write.get(str);
    }

    public final Bundle IconCompatParcelizer(String str, Bundle bundle) {
        if (bundle != null) {
            return this.write.put(str, bundle);
        }
        return this.write.remove(str);
    }

    public final void AudioAttributesCompatParcelizer(HashMap<String, Bundle> map) {
        this.write.clear();
        this.write.putAll(map);
    }

    public final HashMap<String, Bundle> RemoteActionCompatParcelizer() {
        return this.write;
    }

    public final ArrayList<String> AudioAttributesImplBaseParcelizer() {
        ArrayList<String> arrayList = new ArrayList<>(this.read.size());
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                IconCompatParcelizer(fragmentIconCompatParcelizer.mWho, _addsettermethod.MediaBrowserCompatItemReceiver());
                arrayList.add(fragmentIconCompatParcelizer.mWho);
                if (FragmentManager.write(2)) {
                    Objects.toString(fragmentIconCompatParcelizer);
                    Objects.toString(fragmentIconCompatParcelizer.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    public final ArrayList<String> MediaBrowserCompatCustomActionResultReceiver() {
        synchronized (this.RemoteActionCompatParcelizer) {
            if (this.RemoteActionCompatParcelizer.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.RemoteActionCompatParcelizer.size());
            for (Fragment fragment : this.RemoteActionCompatParcelizer) {
                arrayList.add(fragment.mWho);
                if (FragmentManager.write(2)) {
                    String str = fragment.mWho;
                    Objects.toString(fragment);
                }
            }
            return arrayList;
        }
    }

    public final List<_addSetterMethod> write() {
        ArrayList arrayList = new ArrayList();
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                arrayList.add(_addsettermethod);
            }
        }
        return arrayList;
    }

    public final List<Fragment> read() {
        ArrayList arrayList;
        if (this.RemoteActionCompatParcelizer.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.RemoteActionCompatParcelizer) {
            arrayList = new ArrayList(this.RemoteActionCompatParcelizer);
        }
        return arrayList;
    }

    public final List<Fragment> AudioAttributesCompatParcelizer() {
        ArrayList arrayList = new ArrayList();
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                arrayList.add(_addsettermethod.IconCompatParcelizer());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final Fragment RemoteActionCompatParcelizer(int i) {
        for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
            Fragment fragment = this.RemoteActionCompatParcelizer.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                if (fragmentIconCompatParcelizer.mFragmentId == i) {
                    return fragmentIconCompatParcelizer;
                }
            }
        }
        return null;
    }

    public final Fragment read(String str) {
        if (str != null) {
            for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                Fragment fragment = this.RemoteActionCompatParcelizer.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null) {
                Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                if (str.equals(fragmentIconCompatParcelizer.mTag)) {
                    return fragmentIconCompatParcelizer;
                }
            }
        }
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer(String str) {
        return this.read.get(str) != null;
    }

    public final _addSetterMethod IconCompatParcelizer(String str) {
        return this.read.get(str);
    }

    public final Fragment RemoteActionCompatParcelizer(String str) {
        Fragment fragmentFindFragmentByWho;
        for (_addSetterMethod _addsettermethod : this.read.values()) {
            if (_addsettermethod != null && (fragmentFindFragmentByWho = _addsettermethod.IconCompatParcelizer().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final Fragment write(String str) {
        _addSetterMethod _addsettermethod = this.read.get(str);
        if (_addsettermethod != null) {
            return _addsettermethod.IconCompatParcelizer();
        }
        return null;
    }

    final int read(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.RemoteActionCompatParcelizer.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.RemoteActionCompatParcelizer.get(i);
            if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                return viewGroup.indexOfChild(fragment2.mView) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.RemoteActionCompatParcelizer.size()) {
                return -1;
            }
            Fragment fragment3 = this.RemoteActionCompatParcelizer.get(iIndexOf);
            if (fragment3.mContainer == viewGroup && fragment3.mView != null) {
                return viewGroup.indexOfChild(fragment3.mView);
            }
        }
    }

    public final void RemoteActionCompatParcelizer(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String string = sb.toString();
        if (!this.read.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (_addSetterMethod _addsettermethod : this.read.values()) {
                printWriter.print(str);
                if (_addsettermethod != null) {
                    Fragment fragmentIconCompatParcelizer = _addsettermethod.IconCompatParcelizer();
                    printWriter.println(fragmentIconCompatParcelizer);
                    fragmentIconCompatParcelizer.dump(string, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.RemoteActionCompatParcelizer.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.RemoteActionCompatParcelizer.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }
}
