package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class getBookmark<V> extends refreshSubscription<V> {
    private volatile timestampInvalid<V> AudioAttributesCompatParcelizer;

    public getBookmark(getAnswerMap<? super Class<?>, ? extends V> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        this.AudioAttributesCompatParcelizer = new timestampInvalid<>(getanswermap);
    }

    @Override // kotlin.refreshSubscription
    public final V write(Class<?> cls) {
        toMagicModuleMetaRepoModel.write(cls, "");
        timestampInvalid<V> timestampinvalid = this.AudioAttributesCompatParcelizer;
        V v = timestampinvalid.get(cls).get();
        if (v != null) {
            return v;
        }
        timestampinvalid.remove(cls);
        V v2 = timestampinvalid.get(cls).get();
        return v2 != null ? v2 : timestampinvalid.IconCompatParcelizer.invoke(cls);
    }
}
