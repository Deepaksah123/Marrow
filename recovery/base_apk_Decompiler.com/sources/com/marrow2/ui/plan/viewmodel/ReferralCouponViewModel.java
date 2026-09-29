package com.marrow2.ui.plan.viewmodel;

import com.marrow2.ui.plan.viewmodel.ReferralCouponViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.PackageManagerWrapper;
import kotlin.QBankStatsResponse;
import kotlin.RenewEligibleCreator;
import kotlin.ReusableBufferedOutputStream;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.checkCallingOrSelfPermission;
import kotlin.getAnswerMap;
import kotlin.getApplicationLabelAndIcon;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.isInstantApp;
import kotlin.isSeekPending;
import kotlin.readSynchSafeInt;
import kotlin.readUnsignedIntToInt;
import kotlin.setCountry;
import kotlin.setFastestInterval;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\n\u0010\u0019R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u000f\u0010\u0019R\u0016\u0010\f\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 "}, d2 = {"Lcom/marrow2/ui/plan/viewmodel/ReferralCouponViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readSynchSafeInt;", "p0", "Lo/isSeekPending;", "p1", "<init>", "(Lo/readSynchSafeInt;Lo/isSeekPending;)V", "Lo/checkCallingOrSelfPermission;", "", "IconCompatParcelizer", "(Lo/checkCallingOrSelfPermission;)V", "MediaBrowserCompatItemReceiver", "()V", "Lo/readSynchSafeInt;", "read", "AudioAttributesCompatParcelizer", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/getApplicationLabelAndIcon;", "Lo/getResolutionSize;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "write", "Lo/isInstantApp;", "AudioAttributesImplApi21Parcelizer", "", "AudioAttributesImplBaseParcelizer", "", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReferralCouponViewModel extends POJOPropertyBuilderWithMember {
    private final isSeekPending AudioAttributesCompatParcelizer;
    private final setUpdatedStatus<isInstantApp> AudioAttributesImplApi21Parcelizer;
    private final setUpdatedStatus<Boolean> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getApplicationLabelAndIcon> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<getApplicationLabelAndIcon> write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final readSynchSafeInt read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<isInstantApp> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<Boolean> MediaBrowserCompatCustomActionResultReceiver;

    @setSdkPayload
    public ReferralCouponViewModel(readSynchSafeInt readsynchsafeint, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(readsynchsafeint, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.read = readsynchsafeint;
        this.AudioAttributesCompatParcelizer = isseekpending;
        getResolutionSize<getApplicationLabelAndIcon> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(new getApplicationLabelAndIcon(null, 0, 0, null, 15, null));
        this.RemoteActionCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<isInstantApp> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer(isInstantApp.AudioAttributesCompatParcelizer.INSTANCE);
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
        getResolutionSize<Boolean> getresolutionsizeRemoteActionCompatParcelizer3 = setStartTime.RemoteActionCompatParcelizer(Boolean.FALSE);
        this.MediaBrowserCompatCustomActionResultReceiver = getresolutionsizeRemoteActionCompatParcelizer3;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer3);
        MediaBrowserCompatItemReceiver();
    }

    public final setUpdatedStatus<getApplicationLabelAndIcon> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final setUpdatedStatus<isInstantApp> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final setUpdatedStatus<Boolean> read() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(100L, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ReferralCouponViewModel.this.IconCompatParcelizer.write(isInstantApp.AudioAttributesCompatParcelizer.INSTANCE);
            return getShowPopup.INSTANCE;
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReferralCouponViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(checkCallingOrSelfPermission p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, checkCallingOrSelfPermission.read.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getIsDiscoverableCredential
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ReferralCouponViewModel.AudioAttributesCompatParcelizer((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, checkCallingOrSelfPermission.AudioAttributesCompatParcelizer.INSTANCE)) {
            this.IconCompatParcelizer.write(new isInstantApp.IconCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRead()));
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, checkCallingOrSelfPermission.write.INSTANCE)) {
            this.IconCompatParcelizer.write(new isInstantApp.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.IconCompatParcelizer().getRead()));
            isSeekPending isseekpending2 = this.AudioAttributesCompatParcelizer;
            setFastestInterval setfastestinterval2 = setFastestInterval.INSTANCE;
            isseekpending2.write(setFastestInterval.write(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        if (!(p0 instanceof checkCallingOrSelfPermission.RemoteActionCompatParcelizer)) {
            throw new RenewEligibleCreator();
        }
        this.IconCompatParcelizer.write(new isInstantApp.read(this.write.IconCompatParcelizer().getRead(), this.MediaBrowserCompatItemReceiver, ((checkCallingOrSelfPermission.RemoteActionCompatParcelizer) p0).IconCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            String couponCode;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                ReferralCouponViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(true));
                this.AudioAttributesCompatParcelizer = 1;
                obj = ReferralCouponViewModel.this.read.IconCompatParcelizer(this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            int numberOfExtensionDays = 0;
            ReferralCouponViewModel.this.MediaBrowserCompatCustomActionResultReceiver.write(QBankStatsResponse.AudioAttributesCompatParcelizer(false));
            readUnsignedIntToInt readunsignedinttoint = (readUnsignedIntToInt) ((List) obj).get(0);
            if (!readunsignedinttoint.AudioAttributesImplBaseParcelizer() && System.currentTimeMillis() < readunsignedinttoint.write()) {
                ReferralCouponViewModel.this.IconCompatParcelizer.write(isInstantApp.AudioAttributesImplBaseParcelizer.INSTANCE);
            }
            ArrayList arrayList = new ArrayList();
            if (readunsignedinttoint.IconCompatParcelizer() > 0) {
                ReferralCouponViewModel.this.IconCompatParcelizer.write(isInstantApp.AudioAttributesImplApi21Parcelizer.INSTANCE);
                ReferralCouponViewModel.this.MediaBrowserCompatItemReceiver = readunsignedinttoint.MediaBrowserCompatItemReceiver() / readunsignedinttoint.IconCompatParcelizer();
                int iIconCompatParcelizer = readunsignedinttoint.IconCompatParcelizer();
                for (int i2 = 0; i2 < iIconCompatParcelizer; i2++) {
                    arrayList.add(new PackageManagerWrapper(ReferralCouponViewModel.this.MediaBrowserCompatItemReceiver, null, false, 2, null));
                }
            } else {
                ReferralCouponViewModel.this.IconCompatParcelizer.write(isInstantApp.write.INSTANCE);
            }
            int i3 = 0;
            for (Object obj2 : readunsignedinttoint.read()) {
                if (i3 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                ReusableBufferedOutputStream reusableBufferedOutputStream = (ReusableBufferedOutputStream) obj2;
                PackageManagerWrapper packageManagerWrapper = new PackageManagerWrapper(reusableBufferedOutputStream.getNumberOfExtensionDays(), null, true, 2, null);
                numberOfExtensionDays += reusableBufferedOutputStream.getNumberOfExtensionDays();
                if (reusableBufferedOutputStream.getUserDetail() != null) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) readunsignedinttoint.AudioAttributesCompatParcelizer(), (Object) reusableBufferedOutputStream.getUserDetail().getUserId())) {
                        couponCode = reusableBufferedOutputStream.getCouponCode();
                    } else {
                        couponCode = "";
                    }
                    packageManagerWrapper.RemoteActionCompatParcelizer(couponCode);
                } else {
                    packageManagerWrapper.RemoteActionCompatParcelizer(null);
                }
                arrayList.set(i3, packageManagerWrapper);
                i3++;
            }
            getResolutionSize getresolutionsize = ReferralCouponViewModel.this.RemoteActionCompatParcelizer;
            getresolutionsize.write(getApplicationLabelAndIcon.IconCompatParcelizer(readunsignedinttoint.RemoteActionCompatParcelizer(), numberOfExtensionDays, readunsignedinttoint.MediaBrowserCompatItemReceiver(), arrayList));
            return getShowPopup.INSTANCE;
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return ReferralCouponViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setUserVerificationMethodEntries
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ReferralCouponViewModel.IconCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ReferralCouponViewModel referralCouponViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        referralCouponViewModel.MediaBrowserCompatCustomActionResultReceiver.write(Boolean.FALSE);
        if (i == 502) {
            referralCouponViewModel.IconCompatParcelizer.write(isInstantApp.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        } else {
            referralCouponViewModel.IconCompatParcelizer.write(isInstantApp.AudioAttributesImplApi21Parcelizer.INSTANCE);
            referralCouponViewModel.IconCompatParcelizer.write(new isInstantApp.MediaBrowserCompatItemReceiver(str));
        }
        return getShowPopup.INSTANCE;
    }
}
