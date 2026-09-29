package kotlin;

import kotlin.ResponseErrorCompanion;
import kotlin.isLogoutRequired;

/* JADX INFO: loaded from: classes5.dex */
public abstract class downloadMagicModuleDetaildefault extends MagicModuleParentType implements isLogoutRequired {
    public downloadMagicModuleDetaildefault() {
    }

    public downloadMagicModuleDetaildefault(Object obj, Class cls, String str, String str2, int i) {
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
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public ResponseErrorCompanion.IconCompatParcelizer RemoteActionCompatParcelizer() {
        return ((isLogoutRequired) RatingCompat()).RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isDbFlushIgnored
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public isLogoutRequired.IconCompatParcelizer aN_() {
        return ((isLogoutRequired) RatingCompat()).aN_();
    }
}
