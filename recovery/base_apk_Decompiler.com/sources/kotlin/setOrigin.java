package kotlin;

import kotlin.getApplicationLabel;

/* JADX INFO: loaded from: classes3.dex */
public final class setOrigin<R, T extends getApplicationLabel> implements setSessionInfo<R, T> {
    private Object AudioAttributesCompatParcelizer;
    private final getAnswerMap<R, T> RemoteActionCompatParcelizer;
    private final getAnswerMap<T, getShowPopup> write;

    /* JADX WARN: Multi-variable type inference failed */
    private setOrigin(getAnswerMap<? super T, getShowPopup> getanswermap, getAnswerMap<? super R, ? extends T> getanswermap2) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.write(getanswermap2, "");
        this.write = getanswermap;
        this.RemoteActionCompatParcelizer = getanswermap2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setOrigin(getAnswerMap<? super R, ? extends T> getanswermap) {
        this(new getAnswerMap() { // from class: o.SessionDescriptionBuilder
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return setOrigin.IconCompatParcelizer((getApplicationLabel) obj);
            }
        }, getanswermap);
        toMagicModuleMetaRepoModel.write(getanswermap, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getApplicationLabel getapplicationlabel) {
        toMagicModuleMetaRepoModel.write(getapplicationlabel, "");
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlaybackConfigRootRequestBody
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public T read(R r, isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(r, "");
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        Object obj = this.AudioAttributesCompatParcelizer;
        T t = obj instanceof getApplicationLabel ? (T) obj : null;
        if (t != null) {
            return t;
        }
        T tInvoke = this.RemoteActionCompatParcelizer.invoke(r);
        this.AudioAttributesCompatParcelizer = tInvoke;
        return tInvoke;
    }
}
