package kotlin;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class getGeneratorType {
    private final FragmentManager AudioAttributesCompatParcelizer;
    private final CopyOnWriteArrayList<write> RemoteActionCompatParcelizer;

    static final class write {
        private final boolean AudioAttributesCompatParcelizer;
        private final FragmentManager.IconCompatParcelizer IconCompatParcelizer;

        public write(FragmentManager.IconCompatParcelizer iconCompatParcelizer, boolean z) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.AudioAttributesCompatParcelizer = z;
        }

        public final FragmentManager.IconCompatParcelizer IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final boolean write() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    public getGeneratorType(FragmentManager fragmentManager) {
        toMagicModuleMetaRepoModel.write(fragmentManager, "");
        this.AudioAttributesCompatParcelizer = fragmentManager;
        this.RemoteActionCompatParcelizer = new CopyOnWriteArrayList<>();
    }

    public final void read(FragmentManager.IconCompatParcelizer iconCompatParcelizer, boolean z) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.RemoteActionCompatParcelizer.add(new write(iconCompatParcelizer, z));
    }

    public final void write(FragmentManager.IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        synchronized (this.RemoteActionCompatParcelizer) {
            int size = this.RemoteActionCompatParcelizer.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                if (this.RemoteActionCompatParcelizer.get(i).IconCompatParcelizer() == iconCompatParcelizer) {
                    this.RemoteActionCompatParcelizer.remove(i);
                    break;
                }
                i++;
            }
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    public final void read(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        this.AudioAttributesCompatParcelizer.onPlay().getRead();
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().read(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void IconCompatParcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        this.AudioAttributesCompatParcelizer.onPlay().getRead();
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().IconCompatParcelizer(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void read(Fragment fragment, Bundle bundle, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().read(fragment, bundle, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(Fragment fragment, Bundle bundle, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().RemoteActionCompatParcelizer(fragment, bundle, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void write(Fragment fragment, Bundle bundle, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().write(fragment, bundle, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void write(Fragment fragment, View view, Bundle bundle, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(view, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().write(fragment, view, bundle, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer().write(this.AudioAttributesCompatParcelizer, fragment, view);
            }
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().MediaBrowserCompatCustomActionResultReceiver(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void AudioAttributesImplApi21Parcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().AudioAttributesImplApi21Parcelizer(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer().read(this.AudioAttributesCompatParcelizer, fragment);
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().AudioAttributesCompatParcelizer(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, fragment);
            }
        }
    }

    public final void MediaBrowserCompatItemReceiver(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().MediaBrowserCompatItemReceiver(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer(Fragment fragment, Bundle bundle, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().AudioAttributesCompatParcelizer(fragment, bundle, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void AudioAttributesImplBaseParcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().AudioAttributesImplBaseParcelizer(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }

    public final void RemoteActionCompatParcelizer(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().RemoteActionCompatParcelizer(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer().IconCompatParcelizer(this.AudioAttributesCompatParcelizer, fragment);
            }
        }
    }

    public final void write(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        Fragment fragmentOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
        if (fragmentOnFastForward != null) {
            FragmentManager parentFragmentManager = fragmentOnFastForward.getParentFragmentManager();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
            parentFragmentManager.onPlayFromMediaId().write(fragment, true);
        }
        for (write writeVar : this.RemoteActionCompatParcelizer) {
            if (!z || writeVar.write()) {
                writeVar.IconCompatParcelizer();
            }
        }
    }
}
