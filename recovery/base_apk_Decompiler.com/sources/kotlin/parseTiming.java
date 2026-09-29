package kotlin;

import kotlin.argCount;
import kotlin.getApplicationLabel;

/* JADX INFO: loaded from: classes3.dex */
final class parseTiming<F extends argCount, T extends getApplicationLabel> extends addMediaDescription<F, T> {
    private final boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public parseTiming(boolean z, getAnswerMap<? super F, ? extends T> getanswermap, getAnswerMap<? super T, getShowPopup> getanswermap2) {
        super(getanswermap, getanswermap2);
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.write = z;
    }

    @Override // kotlin.addMediaDescription
    public final /* synthetic */ hasGetter AudioAttributesCompatParcelizer(Object obj) {
        return RemoteActionCompatParcelizer((argCount) obj);
    }

    private static hasGetter RemoteActionCompatParcelizer(F f) {
        toMagicModuleMetaRepoModel.write(f, "");
        if (f.getView() == null) {
            return f;
        }
        try {
            hasGetter viewLifecycleOwner = f.getViewLifecycleOwner();
            toMagicModuleMetaRepoModel.write(viewLifecycleOwner);
            return viewLifecycleOwner;
        } catch (IllegalStateException unused) {
            throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.addMediaDescription
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public boolean RemoteActionCompatParcelizer(F f) {
        toMagicModuleMetaRepoModel.write(f, "");
        if (this.write) {
            return f.getShowsDialog() ? f.getDialog() != null : f.getView() != null;
        }
        return true;
    }
}
