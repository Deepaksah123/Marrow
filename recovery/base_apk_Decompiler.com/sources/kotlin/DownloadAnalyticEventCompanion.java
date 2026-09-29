package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class DownloadAnalyticEventCompanion {
    private static final getAnswerMap<Object, Object> RemoteActionCompatParcelizer = new getAnswerMap() { // from class: o.DownloadOptionsUIModel
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return DownloadAnalyticEventCompanion.IconCompatParcelizer(obj);
        }
    };
    private static final MagicModuleSubmissionRequestBody<Object, Object, Boolean> AudioAttributesCompatParcelizer = new MagicModuleSubmissionRequestBody() { // from class: o.getAvailableThemes
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(DownloadAnalyticEventCompanion.AudioAttributesCompatParcelizer(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> NewNumberOtpResendRequest<T> IconCompatParcelizer(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest) {
        return newNumberOtpResendRequest instanceof setUpdatedStatus ? newNumberOtpResendRequest : write(newNumberOtpResendRequest, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AudioAttributesCompatParcelizer(Object obj, Object obj2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> NewNumberOtpResendRequest<T> write(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, getAnswerMap<? super T, ? extends Object> getanswermap, MagicModuleSubmissionRequestBody<Object, Object, Boolean> magicModuleSubmissionRequestBody) {
        if (newNumberOtpResendRequest instanceof getRcToken) {
            getRcToken getrctoken = (getRcToken) newNumberOtpResendRequest;
            if (getrctoken.IconCompatParcelizer == getanswermap && getrctoken.AudioAttributesCompatParcelizer == magicModuleSubmissionRequestBody) {
                return newNumberOtpResendRequest;
            }
        }
        return new getRcToken(newNumberOtpResendRequest, getanswermap, magicModuleSubmissionRequestBody);
    }
}
