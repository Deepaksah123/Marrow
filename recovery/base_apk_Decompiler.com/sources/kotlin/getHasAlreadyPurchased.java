package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getHasAlreadyPurchased<T> extends setQuestion<T, T> {
    private getSubjectTitle<? super Throwable, ? extends T> RemoteActionCompatParcelizer;

    public getHasAlreadyPurchased(accessgetEmptyStatecp<T> accessgetemptystatecp, getSubjectTitle<? super Throwable, ? extends T> getsubjecttitle) {
        super(accessgetemptystatecp);
        this.RemoteActionCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        this.write.RemoteActionCompatParcelizer(new AudioAttributesCompatParcelizer(schemaUserStatusRSModel, this.RemoteActionCompatParcelizer));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class AudioAttributesCompatParcelizer<T> extends isFreeAccessAvailable<T, T> {
        private getSubjectTitle<? super Throwable, ? extends T> write;

        AudioAttributesCompatParcelizer(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel, getSubjectTitle<? super Throwable, ? extends T> getsubjecttitle) {
            super(schemaUserStatusRSModel);
            this.write = getsubjecttitle;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            this.AudioAttributesCompatParcelizer++;
            this.IconCompatParcelizer.a_((Object) t);
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void AudioAttributesCompatParcelizer(Throwable th) {
            try {
                read(setHasPyt.AudioAttributesCompatParcelizer(this.write.apply(th), "The valueSupplier returned a null value"));
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                this.IconCompatParcelizer.AudioAttributesCompatParcelizer(new getPytIds(th, th2));
            }
        }

        @Override // kotlin.SchemaUserStatusRSModel
        public final void aJ_() {
            this.IconCompatParcelizer.aJ_();
        }
    }
}
