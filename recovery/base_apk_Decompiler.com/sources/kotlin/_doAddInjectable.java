package kotlin;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlin.anyIgnorals;

/* JADX INFO: loaded from: classes.dex */
public abstract class _doAddInjectable {
    public int AudioAttributesCompatParcelizer;
    ArrayList<Runnable> AudioAttributesImplApi21Parcelizer;
    public int AudioAttributesImplApi26Parcelizer;
    public CharSequence AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    public CharSequence MediaBrowserCompatCustomActionResultReceiver;
    public int MediaBrowserCompatItemReceiver;
    public int MediaBrowserCompatMediaItem;
    public int MediaBrowserCompatSearchResultReceiver;
    public ArrayList<String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    public ArrayList<write> MediaDescriptionCompat;
    public int MediaMetadataCompat;
    public String RatingCompat;
    public boolean RemoteActionCompatParcelizer;
    public boolean handleMediaPlayPauseIfPendingOnHandler;
    public int onCommand;
    public ArrayList<String> onCustomAction;
    private final NopAnnotationIntrospector1 read;
    private final ClassLoader write;

    public abstract void IconCompatParcelizer();

    public abstract void RemoteActionCompatParcelizer();

    public abstract int read();

    public abstract int write();

    /* JADX INFO: loaded from: classes2.dex */
    public static final class write {
        public int AudioAttributesCompatParcelizer;
        public boolean AudioAttributesImplApi21Parcelizer;
        public int AudioAttributesImplApi26Parcelizer;
        public Fragment IconCompatParcelizer;
        public int MediaBrowserCompatCustomActionResultReceiver;
        public anyIgnorals.write MediaBrowserCompatItemReceiver;
        public anyIgnorals.write RemoteActionCompatParcelizer;
        public int read;
        public int write;

        public write() {
        }

        write(int i, Fragment fragment) {
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = fragment;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaBrowserCompatItemReceiver = anyIgnorals.write.write;
            this.RemoteActionCompatParcelizer = anyIgnorals.write.write;
        }

        write(int i, Fragment fragment, byte b) {
            this.AudioAttributesCompatParcelizer = i;
            this.IconCompatParcelizer = fragment;
            this.AudioAttributesImplApi21Parcelizer = true;
            this.MediaBrowserCompatItemReceiver = anyIgnorals.write.write;
            this.RemoteActionCompatParcelizer = anyIgnorals.write.write;
        }

        write(Fragment fragment, anyIgnorals.write writeVar) {
            this.AudioAttributesCompatParcelizer = 10;
            this.IconCompatParcelizer = fragment;
            this.AudioAttributesImplApi21Parcelizer = false;
            this.MediaBrowserCompatItemReceiver = fragment.mMaxState;
            this.RemoteActionCompatParcelizer = writeVar;
        }
    }

    @Deprecated
    public _doAddInjectable() {
        this.MediaDescriptionCompat = new ArrayList<>();
        this.IconCompatParcelizer = true;
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.read = null;
        this.write = null;
    }

    _doAddInjectable(NopAnnotationIntrospector1 nopAnnotationIntrospector1, ClassLoader classLoader) {
        this.MediaDescriptionCompat = new ArrayList<>();
        this.IconCompatParcelizer = true;
        this.handleMediaPlayPauseIfPendingOnHandler = false;
        this.read = nopAnnotationIntrospector1;
        this.write = classLoader;
    }

    public final void RemoteActionCompatParcelizer(write writeVar) {
        this.MediaDescriptionCompat.add(writeVar);
        writeVar.write = this.AudioAttributesImplApi26Parcelizer;
        writeVar.read = this.MediaBrowserCompatSearchResultReceiver;
        writeVar.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatMediaItem;
        writeVar.AudioAttributesImplApi26Parcelizer = this.MediaMetadataCompat;
    }

    public final _doAddInjectable IconCompatParcelizer(Fragment fragment, String str) {
        IconCompatParcelizer(0, fragment, str, 1);
        return this;
    }

    public final _doAddInjectable IconCompatParcelizer(int i, Fragment fragment) {
        IconCompatParcelizer(i, fragment, null, 1);
        return this;
    }

    public final _doAddInjectable read(int i, Fragment fragment, String str) {
        IconCompatParcelizer(i, fragment, str, 1);
        return this;
    }

    public final _doAddInjectable AudioAttributesCompatParcelizer(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return read(viewGroup.getId(), fragment, str);
    }

    void IconCompatParcelizer(int i, Fragment fragment, String str, int i2) {
        if (fragment.mPreviousWho != null) {
            getJsonValueAccessor.RemoteActionCompatParcelizer(fragment, fragment.mPreviousWho);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        if (str != null) {
            if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                sb2.append(fragment.mTag);
                sb2.append(" now ");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mTag = str;
        }
        if (i != 0) {
            if (i == -1) {
                StringBuilder sb3 = new StringBuilder("Can't add fragment ");
                sb3.append(fragment);
                sb3.append(" with tag ");
                sb3.append(str);
                sb3.append(" to container view with no id");
                throw new IllegalArgumentException(sb3.toString());
            }
            if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                StringBuilder sb4 = new StringBuilder("Can't change container ID of fragment ");
                sb4.append(fragment);
                sb4.append(": was ");
                sb4.append(fragment.mFragmentId);
                sb4.append(" now ");
                sb4.append(i);
                throw new IllegalStateException(sb4.toString());
            }
            fragment.mFragmentId = i;
            fragment.mContainerId = i;
        }
        RemoteActionCompatParcelizer(new write(i2, fragment));
    }

    public final _doAddInjectable write(int i, Fragment fragment) {
        return write(i, fragment, null);
    }

    public final _doAddInjectable write(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        IconCompatParcelizer(i, fragment, str, 2);
        return this;
    }

    public _doAddInjectable read(Fragment fragment) {
        RemoteActionCompatParcelizer(new write(3, fragment));
        return this;
    }

    public _doAddInjectable AudioAttributesCompatParcelizer(Fragment fragment) {
        RemoteActionCompatParcelizer(new write(4, fragment));
        return this;
    }

    public _doAddInjectable IconCompatParcelizer(Fragment fragment) {
        RemoteActionCompatParcelizer(new write(5, fragment));
        return this;
    }

    public _doAddInjectable RemoteActionCompatParcelizer(Fragment fragment) {
        RemoteActionCompatParcelizer(new write(6, fragment));
        return this;
    }

    public final _doAddInjectable write(Fragment fragment) {
        RemoteActionCompatParcelizer(new write(7, fragment));
        return this;
    }

    public _doAddInjectable RemoteActionCompatParcelizer(Fragment fragment, anyIgnorals.write writeVar) {
        RemoteActionCompatParcelizer(new write(fragment, writeVar));
        return this;
    }

    public boolean AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat.isEmpty();
    }

    public final _doAddInjectable MediaBrowserCompatSearchResultReceiver() {
        return RemoteActionCompatParcelizer(R.animator.fade_in, R.animator.fade_out, 0, 0);
    }

    public final _doAddInjectable RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaBrowserCompatSearchResultReceiver = i2;
        this.MediaBrowserCompatMediaItem = i3;
        this.MediaMetadataCompat = i4;
        return this;
    }

    public final _doAddInjectable RemoteActionCompatParcelizer(View view, String str) {
        if (!_collectIgnorals.write()) {
            return this;
        }
        String strOnMediaButtonEvent = InvalidTypeIdException.onMediaButtonEvent(view);
        if (strOnMediaButtonEvent == null) {
            throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new ArrayList<>();
            this.onCustomAction = new ArrayList<>();
        } else {
            if (this.onCustomAction.contains(str)) {
                StringBuilder sb = new StringBuilder("A shared element with the target name '");
                sb.append(str);
                sb.append("' has already been added to the transaction.");
                throw new IllegalArgumentException(sb.toString());
            }
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.contains(strOnMediaButtonEvent)) {
                StringBuilder sb2 = new StringBuilder("A shared element with the source name '");
                sb2.append(strOnMediaButtonEvent);
                sb2.append("' has already been added to the transaction.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.add(strOnMediaButtonEvent);
        this.onCustomAction.add(str);
        return this;
    }

    public final _doAddInjectable read(String str) {
        if (!this.IconCompatParcelizer) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.RemoteActionCompatParcelizer = true;
        this.RatingCompat = str;
        return this;
    }

    public final _doAddInjectable MediaMetadataCompat() {
        if (this.RemoteActionCompatParcelizer) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.IconCompatParcelizer = false;
        return this;
    }

    public final _doAddInjectable MediaDescriptionCompat() {
        this.handleMediaPlayPauseIfPendingOnHandler = true;
        return this;
    }

    public final _doAddInjectable read(Runnable runnable) {
        if (this.AudioAttributesImplApi21Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        }
        this.AudioAttributesImplApi21Parcelizer.add(runnable);
        return this;
    }
}
