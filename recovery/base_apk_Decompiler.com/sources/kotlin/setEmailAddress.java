package kotlin;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import kotlin.getApplicationLabel;

/* JADX INFO: loaded from: classes3.dex */
final class setEmailAddress<F extends Fragment, T extends getApplicationLabel> extends addMediaDescription<F, T> {
    private final boolean AudioAttributesCompatParcelizer;
    private FragmentManager.IconCompatParcelizer IconCompatParcelizer;
    private Reference<FragmentManager> read;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setEmailAddress(boolean z, getAnswerMap<? super F, ? extends T> getanswermap, getAnswerMap<? super T, getShowPopup> getanswermap2) {
        super(getanswermap, getanswermap2);
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // kotlin.addMediaDescription
    public final /* bridge */ /* synthetic */ hasGetter AudioAttributesCompatParcelizer(Object obj) {
        return AudioAttributesCompatParcelizer((Fragment) obj);
    }

    @Override // kotlin.addMediaDescription, kotlin.PlaybackConfigRootRequestBody
    public final /* synthetic */ Object read(Object obj, isResolutionNotSupported isresolutionnotsupported) {
        return write((Fragment) obj, (isResolutionNotSupported<?>) isresolutionnotsupported);
    }

    @Override // kotlin.addMediaDescription
    /* JADX INFO: renamed from: write */
    public final /* bridge */ /* synthetic */ getApplicationLabel read(Object obj, isResolutionNotSupported isresolutionnotsupported) {
        return write((Fragment) obj, (isResolutionNotSupported<?>) isresolutionnotsupported);
    }

    private T write(F f, isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(f, "");
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        T t = (T) super.read(f, isresolutionnotsupported);
        write(f);
        return t;
    }

    private final void write(Fragment fragment) {
        if (this.IconCompatParcelizer != null) {
            return;
        }
        FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
        this.read = new WeakReference(parentFragmentManager);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentFragmentManager, "");
        write writeVar = new write(this, fragment);
        parentFragmentManager.write((FragmentManager.IconCompatParcelizer) writeVar, false);
        this.IconCompatParcelizer = writeVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addMediaDescription
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(F f) {
        toMagicModuleMetaRepoModel.write(f, "");
        if (!this.AudioAttributesCompatParcelizer) {
            return true;
        }
        if (!f.isAdded() || f.isDetached()) {
            return false;
        }
        if (f instanceof argCount) {
            return super.RemoteActionCompatParcelizer(f);
        }
        return f.getView() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addMediaDescription
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public String read(F f) {
        toMagicModuleMetaRepoModel.write(f, "");
        if (!f.isAdded()) {
            return "Fragment's view can't be accessed. Fragment isn't added";
        }
        if (f.isDetached()) {
            return "Fragment's view can't be accessed. Fragment is detached";
        }
        if (!(f instanceof argCount) && f.getView() == null) {
            return "Fragment's view can't be accessed. Fragment's view is null. Maybe you try to access view before onViewCreated() or after onDestroyView(). Add check `if (view != null)` before call ViewBinding";
        }
        return super.read(f);
    }

    @Override // kotlin.addMediaDescription
    public final void AudioAttributesCompatParcelizer() {
        FragmentManager fragmentManager;
        FragmentManager.IconCompatParcelizer iconCompatParcelizer;
        super.AudioAttributesCompatParcelizer();
        Reference<FragmentManager> reference = this.read;
        if (reference != null && (fragmentManager = reference.get()) != null && (iconCompatParcelizer = this.IconCompatParcelizer) != null) {
            fragmentManager.IconCompatParcelizer(iconCompatParcelizer);
        }
        this.read = null;
        this.IconCompatParcelizer = null;
    }

    private static hasGetter AudioAttributesCompatParcelizer(F f) {
        toMagicModuleMetaRepoModel.write(f, "");
        try {
            hasGetter viewLifecycleOwner = f.getViewLifecycleOwner();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewLifecycleOwner, "");
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed".toString());
        }
    }

    final class write extends FragmentManager.IconCompatParcelizer {
        private /* synthetic */ setEmailAddress<F, T> AudioAttributesCompatParcelizer;
        private Reference<Fragment> read;

        public write(setEmailAddress setemailaddress, Fragment fragment) {
            toMagicModuleMetaRepoModel.write(fragment, "");
            this.AudioAttributesCompatParcelizer = setemailaddress;
            this.read = new WeakReference(fragment);
        }

        @Override // androidx.fragment.app.FragmentManager.IconCompatParcelizer
        public final void IconCompatParcelizer(FragmentManager fragmentManager, Fragment fragment) {
            toMagicModuleMetaRepoModel.write(fragmentManager, "");
            toMagicModuleMetaRepoModel.write(fragment, "");
            if (this.read.get() == fragment) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        }
    }
}
