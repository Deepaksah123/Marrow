package kotlin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class _addMethods extends POJOPropertyBuilderWithMember {
    private static final VisibilityChecker.RemoteActionCompatParcelizer read = new VisibilityChecker.RemoteActionCompatParcelizer() { // from class: o._addMethods.5
        @Override // o.VisibilityChecker.RemoteActionCompatParcelizer
        public final <T extends POJOPropertyBuilderWithMember> T read(Class<T> cls) {
            return new _addMethods(true);
        }
    };
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final HashMap<String, Fragment> MediaBrowserCompatItemReceiver = new HashMap<>();
    private final HashMap<String, _addMethods> AudioAttributesCompatParcelizer = new HashMap<>();
    private final HashMap<String, hasMixIns> AudioAttributesImplApi21Parcelizer = new HashMap<>();
    private boolean RemoteActionCompatParcelizer = false;
    private boolean IconCompatParcelizer = false;
    private boolean write = false;

    public static _addMethods AudioAttributesCompatParcelizer(hasMixIns hasmixins) {
        return (_addMethods) new VisibilityChecker(hasmixins, read).RemoteActionCompatParcelizer(_addMethods.class);
    }

    public _addMethods(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final void read(boolean z) {
        this.write = z;
    }

    @Override // kotlin.POJOPropertyBuilderWithMember
    public final void write() {
        if (FragmentManager.write(3)) {
            toString();
        }
        this.RemoteActionCompatParcelizer = true;
    }

    public final boolean read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(Fragment fragment) {
        if (this.write) {
            FragmentManager.write(2);
        } else {
            if (this.MediaBrowserCompatItemReceiver.containsKey(fragment.mWho)) {
                return;
            }
            this.MediaBrowserCompatItemReceiver.put(fragment.mWho, fragment);
            if (FragmentManager.write(2)) {
                Objects.toString(fragment);
            }
        }
    }

    public final Fragment write(String str) {
        return this.MediaBrowserCompatItemReceiver.get(str);
    }

    public final Collection<Fragment> IconCompatParcelizer() {
        return new ArrayList(this.MediaBrowserCompatItemReceiver.values());
    }

    final boolean IconCompatParcelizer(Fragment fragment) {
        if (this.MediaBrowserCompatItemReceiver.containsKey(fragment.mWho) && this.MediaBrowserCompatCustomActionResultReceiver) {
            return this.RemoteActionCompatParcelizer;
        }
        return true;
    }

    public final void write(Fragment fragment) {
        if (this.write) {
            FragmentManager.write(2);
        } else {
            if (this.MediaBrowserCompatItemReceiver.remove(fragment.mWho) == null || !FragmentManager.write(2)) {
                return;
            }
            Objects.toString(fragment);
        }
    }

    public final _addMethods AudioAttributesCompatParcelizer(Fragment fragment) {
        _addMethods _addmethods = this.AudioAttributesCompatParcelizer.get(fragment.mWho);
        if (_addmethods != null) {
            return _addmethods;
        }
        _addMethods _addmethods2 = new _addMethods(this.MediaBrowserCompatCustomActionResultReceiver);
        this.AudioAttributesCompatParcelizer.put(fragment.mWho, _addmethods2);
        return _addmethods2;
    }

    public final hasMixIns RemoteActionCompatParcelizer(Fragment fragment) {
        hasMixIns hasmixins = this.AudioAttributesImplApi21Parcelizer.get(fragment.mWho);
        if (hasmixins != null) {
            return hasmixins;
        }
        hasMixIns hasmixins2 = new hasMixIns();
        this.AudioAttributesImplApi21Parcelizer.put(fragment.mWho, hasmixins2);
        return hasmixins2;
    }

    final void RemoteActionCompatParcelizer(Fragment fragment, boolean z) {
        if (FragmentManager.write(3)) {
            Objects.toString(fragment);
        }
        write(fragment.mWho, z);
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        FragmentManager.write(3);
        write(str, z);
    }

    private void write(String str, boolean z) {
        _addMethods _addmethods = this.AudioAttributesCompatParcelizer.get(str);
        if (_addmethods != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(_addmethods.AudioAttributesCompatParcelizer.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    _addmethods.IconCompatParcelizer((String) it.next(), true);
                }
            }
            _addmethods.write();
            this.AudioAttributesCompatParcelizer.remove(str);
        }
        hasMixIns hasmixins = this.AudioAttributesImplApi21Parcelizer.get(str);
        if (hasmixins != null) {
            hasmixins.IconCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        _addMethods _addmethods = (_addMethods) obj;
        return this.MediaBrowserCompatItemReceiver.equals(_addmethods.MediaBrowserCompatItemReceiver) && this.AudioAttributesCompatParcelizer.equals(_addmethods.AudioAttributesCompatParcelizer) && this.AudioAttributesImplApi21Parcelizer.equals(_addmethods.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        return (((this.MediaBrowserCompatItemReceiver.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.MediaBrowserCompatItemReceiver.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.AudioAttributesCompatParcelizer.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.AudioAttributesImplApi21Parcelizer.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
