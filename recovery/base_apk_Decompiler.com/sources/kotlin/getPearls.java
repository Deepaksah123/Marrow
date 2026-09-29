package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class getPearls<T> extends accessgetEmptyStatecp<T> {
    private Callable<? extends SchemaCompletionStatusRSModel<? extends T>> write;

    public getPearls(Callable<? extends SchemaCompletionStatusRSModel<? extends T>> callable) {
        this.write = callable;
    }

    @Override // kotlin.accessgetEmptyStatecp
    public final void read(SchemaUserStatusRSModel<? super T> schemaUserStatusRSModel) {
        try {
            ((SchemaCompletionStatusRSModel) setHasPyt.AudioAttributesCompatParcelizer(this.write.call(), "The publisher supplied is null")).write(schemaUserStatusRSModel);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            FreeAccessCouponResponse.IconCompatParcelizer(th, schemaUserStatusRSModel);
        }
    }
}
