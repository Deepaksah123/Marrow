package kotlin;

import kotlin.ResponseErrorCompanion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8 extends MagicModuleUseCaseImpl implements ResponseErrorCompanion {
    public r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8() {
    }

    public r8lambdaU4a5cx80YG41YNi9N_hA0R1Dap8(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }

    @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
    protected isKycAuditIncomplete AudioAttributesImplApi26Parcelizer() {
        return toMagicModuleMetaDataUcModel.IconCompatParcelizer(this);
    }

    @Override // kotlin.getCreatedOnDateMs
    public Object invoke() {
        return read();
    }

    @Override // kotlin.isResolutionNotSupported
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ResponseErrorCompanion.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return ((ResponseErrorCompanion) RatingCompat()).RemoteActionCompatParcelizer();
    }
}
