package kotlin;

import android.R;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class getPrice {
    public static <T, R> boolean AudioAttributesCompatParcelizer(SchemaCompletionStatusRSModel<T> schemaCompletionStatusRSModel, SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends R>> getsubjecttitle) {
        if (!(schemaCompletionStatusRSModel instanceof Callable)) {
            return false;
        }
        try {
            R.bool boolVar = (Object) ((Callable) schemaCompletionStatusRSModel).call();
            if (boolVar == null) {
                FreeAccessCouponResponse.AudioAttributesCompatParcelizer(schemaUserStatusRSModel);
                return true;
            }
            try {
                SchemaCompletionStatusRSModel schemaCompletionStatusRSModel2 = (SchemaCompletionStatusRSModel) setHasPyt.AudioAttributesCompatParcelizer(getsubjecttitle.apply(boolVar), "The mapper returned a null Publisher");
                if (schemaCompletionStatusRSModel2 instanceof Callable) {
                    try {
                        Object objCall = ((Callable) schemaCompletionStatusRSModel2).call();
                        if (objCall == null) {
                            FreeAccessCouponResponse.AudioAttributesCompatParcelizer(schemaUserStatusRSModel);
                            return true;
                        }
                        schemaUserStatusRSModel.AudioAttributesCompatParcelizer(new setSubscriptionPeriod(schemaUserStatusRSModel, objCall));
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        FreeAccessCouponResponse.IconCompatParcelizer(th, schemaUserStatusRSModel);
                        return true;
                    }
                } else {
                    schemaCompletionStatusRSModel2.write(schemaUserStatusRSModel);
                }
                return true;
            } catch (Throwable th2) {
                getEndTimeMs.RemoteActionCompatParcelizer(th2);
                FreeAccessCouponResponse.IconCompatParcelizer(th2, schemaUserStatusRSModel);
                return true;
            }
        } catch (Throwable th3) {
            getEndTimeMs.RemoteActionCompatParcelizer(th3);
            FreeAccessCouponResponse.IconCompatParcelizer(th3, schemaUserStatusRSModel);
            return true;
        }
    }

    public static <T, U> accessgetEmptyStatecp<U> IconCompatParcelizer(T t, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends U>> getsubjecttitle) {
        return getPaymentRefIds.read(new RemoteActionCompatParcelizer(t, getsubjecttitle));
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer<T, R> extends accessgetEmptyStatecp<R> {
        private getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends R>> AudioAttributesCompatParcelizer;
        private T write;

        RemoteActionCompatParcelizer(T t, getSubjectTitle<? super T, ? extends SchemaCompletionStatusRSModel<? extends R>> getsubjecttitle) {
            this.write = t;
            this.AudioAttributesCompatParcelizer = getsubjecttitle;
        }

        @Override // kotlin.accessgetEmptyStatecp
        public final void read(SchemaUserStatusRSModel<? super R> schemaUserStatusRSModel) {
            try {
                SchemaCompletionStatusRSModel schemaCompletionStatusRSModel = (SchemaCompletionStatusRSModel) setHasPyt.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.apply(this.write), "The mapper returned a null Publisher");
                if (schemaCompletionStatusRSModel instanceof Callable) {
                    try {
                        Object objCall = ((Callable) schemaCompletionStatusRSModel).call();
                        if (objCall == null) {
                            FreeAccessCouponResponse.AudioAttributesCompatParcelizer(schemaUserStatusRSModel);
                            return;
                        } else {
                            schemaUserStatusRSModel.AudioAttributesCompatParcelizer(new setSubscriptionPeriod(schemaUserStatusRSModel, objCall));
                            return;
                        }
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        FreeAccessCouponResponse.IconCompatParcelizer(th, schemaUserStatusRSModel);
                        return;
                    }
                }
                schemaCompletionStatusRSModel.write(schemaUserStatusRSModel);
            } catch (Throwable th2) {
                FreeAccessCouponResponse.IconCompatParcelizer(th2, schemaUserStatusRSModel);
            }
        }
    }
}
