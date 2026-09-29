package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class getGroupMcqId<T, U> extends setQuestion<T, U> {
    private getSubjectTitle<? super T, ? extends U> IconCompatParcelizer;

    public getGroupMcqId(accessgetEmptyStatecp<T> accessgetemptystatecp, getSubjectTitle<? super T, ? extends U> getsubjecttitle) {
        super(accessgetemptystatecp);
        this.IconCompatParcelizer = getsubjecttitle;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super U> schemaUserStatusRSModel) {
        if (schemaUserStatusRSModel instanceof getVideoIdEditionId) {
            this.write.RemoteActionCompatParcelizer(new RemoteActionCompatParcelizer((getVideoIdEditionId) schemaUserStatusRSModel, this.IconCompatParcelizer));
        } else {
            this.write.RemoteActionCompatParcelizer(new IconCompatParcelizer(schemaUserStatusRSModel, this.IconCompatParcelizer));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class IconCompatParcelizer<T, U> extends setCouponType<T, U> {
        private getSubjectTitle<? super T, ? extends U> AudioAttributesCompatParcelizer;

        IconCompatParcelizer(SchemaUserStatusRSModel<? super U> schemaUserStatusRSModel, getSubjectTitle<? super T, ? extends U> getsubjecttitle) {
            super(schemaUserStatusRSModel);
            this.AudioAttributesCompatParcelizer = getsubjecttitle;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            if (this.write != 0) {
                this.IconCompatParcelizer.a_(null);
                return;
            }
            try {
                this.IconCompatParcelizer.a_((Object) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                write(th);
            }
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.toLSModel
        public final U read() throws Exception {
            T t = this.read.read();
            if (t != null) {
                return (U) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply(t), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T, U> extends setDiscount<T, U> {
        private getSubjectTitle<? super T, ? extends U> read;

        RemoteActionCompatParcelizer(getVideoIdEditionId<? super U> getvideoideditionid, getSubjectTitle<? super T, ? extends U> getsubjecttitle) {
            super(getvideoideditionid);
            this.read = getsubjecttitle;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.SchemaUserStatusRSModel
        public final void a_(T t) {
            if (this.write) {
                return;
            }
            if (this.IconCompatParcelizer != 0) {
                this.RemoteActionCompatParcelizer.a_(null);
                return;
            }
            try {
                this.RemoteActionCompatParcelizer.a_((Object) setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                write(th);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.getVideoIdEditionId
        public final boolean IconCompatParcelizer(T t) {
            if (this.write) {
                return false;
            }
            try {
                return this.RemoteActionCompatParcelizer.IconCompatParcelizer((Object) setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The mapper function returned a null value."));
            } catch (Throwable th) {
                write(th);
                return true;
            }
        }

        @Override // kotlin.isShown
        public final int write(int i) {
            return IconCompatParcelizer(i);
        }

        @Override // kotlin.toLSModel
        public final U read() throws Exception {
            T t = this.AudioAttributesCompatParcelizer.read();
            if (t != null) {
                return (U) setHasPyt.AudioAttributesCompatParcelizer(this.read.apply(t), "The mapper function returned a null value.");
            }
            return null;
        }
    }
}
