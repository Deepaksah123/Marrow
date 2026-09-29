package kotlin;

import kotlin.Metadata;
import kotlin.setActiveRecallQbankId;

/* JADX INFO: loaded from: classes4.dex */
public final class stopAllServices {
    public static final <R> getErrorMessageId<R> IconCompatParcelizer(setRenewGrpId<? extends R> setrenewgrpid) {
        toMagicModuleMetaRepoModel.write(setrenewgrpid, "");
        Metadata metadata = (Metadata) setrenewgrpid.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        Pair<incrementCorrect, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer> pairIconCompatParcelizer = getCompletedARQBankCount.IconCompatParcelizer(strArrD1, metadata.d2());
        incrementCorrect incrementcorrectRemoteActionCompatParcelizer = pairIconCompatParcelizer.RemoteActionCompatParcelizer();
        setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer = pairIconCompatParcelizer.read();
        incrementTotalCount incrementtotalcount = new incrementTotalCount(metadata.mv(), (metadata.xi() & 8) != 0);
        setActiveRecallQbankId.onAddQueueItem onaddqueueitemOnCustomAction = audioAttributesImplApi26Parcelizer.onCustomAction();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onaddqueueitemOnCustomAction, "");
        return new component17(getAllowResetAfter.INSTANCE, (CourseConfigV2SupportItem) getCourseStrings.read(setrenewgrpid.getClass(), audioAttributesImplApi26Parcelizer, incrementcorrectRemoteActionCompatParcelizer, new setTagActive(onaddqueueitemOnCustomAction), incrementtotalcount, RemoteActionCompatParcelizer.write));
    }

    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepoModelsKt implements MagicModuleSubmissionRequestBody<allFilterItem, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer, CourseConfigV2SupportItem> {
        public static final RemoteActionCompatParcelizer write = new RemoteActionCompatParcelizer();

        private static CourseConfigV2SupportItem IconCompatParcelizer(allFilterItem allfilteritem, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            toMagicModuleMetaRepoModel.write(allfilteritem, "");
            toMagicModuleMetaRepoModel.write(audioAttributesImplApi26Parcelizer, "");
            return allfilteritem.AudioAttributesCompatParcelizer(audioAttributesImplApi26Parcelizer);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA, kotlin.isKycAuditIncomplete
        public final String MediaBrowserCompatCustomActionResultReceiver() {
            return "loadFunction";
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final isAuthError MediaDescriptionCompat() {
            return toMagicModuleMetaDataUcModel.write(allFilterItem.class);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ CourseConfigV2SupportItem invoke(allFilterItem allfilteritem, setActiveRecallQbankId.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
            return IconCompatParcelizer(allfilteritem, audioAttributesImplApi26Parcelizer);
        }

        RemoteActionCompatParcelizer() {
            super(2);
        }

        @Override // kotlin.r8lambdawOOzi0yme1vxdgON3UOSQJBjUQA
        public final String MediaBrowserCompatMediaItem() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }
}
