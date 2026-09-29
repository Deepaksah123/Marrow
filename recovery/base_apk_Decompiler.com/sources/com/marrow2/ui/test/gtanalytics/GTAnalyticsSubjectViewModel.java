package com.marrow2.ui.test.gtanalytics;

import com.marrow2.ui.test.gtanalytics.GTAnalyticsSubjectViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.ceilDivide;
import kotlin.escapeFileName;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getBytesFromHexString;
import kotlin.getConfigExpirySeconds;
import kotlin.getCountryCode;
import kotlin.getCurrentDisplayModeSize;
import kotlin.getKycMessage;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getOnline;
import kotlin.getPaymentMethodTokenizationParameters;
import kotlin.getResolutionSize;
import kotlin.getShippingAddressRequirements;
import kotlin.getShowPopup;
import kotlin.getTransactionInfo;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isPhoneNumberRequired;
import kotlin.isSeekPending;
import kotlin.setPassingYear;
import kotlin.setPaymentMethodTokenizationParameters;
import kotlin.setPhoneNumberRequired;
import kotlin.setReferenceCounted;
import kotlin.setSdkPayload;
import kotlin.setShippingAddressRequired;
import kotlin.setStartTime;
import kotlin.setTransactionInfo;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.whenAll;
import kotlin.withSavedState;
import kotlin.withTimeout;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0011\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u0011\u0010\u001eJ'\u0010\u000e\u001a\u00020\"2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020!H\u0002¢\u0006\u0004\b\u000e\u0010#J'\u0010'\u001a\u00020&2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0013\u0010\u000e\u001a\u00020!*\u00020)H\u0002¢\u0006\u0004\b\u000e\u0010*J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020)0\u001fH\u0002¢\u0006\u0004\b\u000e\u0010+J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u001f2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u001f2\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b\u0019\u0010-R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\u000e\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00103R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00106R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000205078\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b\u0015\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130<8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010=R \u00108\u001a\b\u0012\u0004\u0012\u00020\u00130?8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010@\u001a\u0004\b'\u0010AR\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00100B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010D"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsSubjectViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "Lo/ceilDivide;", "p1", "Lo/LogLogLevel;", "p2", "Lo/isSeekPending;", "p3", "<init>", "(Lo/POJOPropertyBuilder5;Lo/ceilDivide;Lo/LogLogLevel;Lo/isSeekPending;)V", "Lo/setReferenceCounted;", "", "RemoteActionCompatParcelizer", "(Lo/setReferenceCounted;)V", "", "write", "(Ljava/lang/String;)V", "Lo/getPaymentMethodTokenizationParameters;", "Lo/setPassingYear;", "IconCompatParcelizer", "(Lo/getPaymentMethodTokenizationParameters;)Lo/setPassingYear;", "Lo/setReferenceCounted$write;", "(Lo/setReferenceCounted$write;)V", "read", "()V", "Lo/escapeFileName;", "", "Lo/getShippingAddressRequirements;", "(Lo/escapeFileName;Ljava/lang/String;Z)Lo/getShippingAddressRequirements;", "", "Lo/withTimeout;", "", "Lo/setPaymentMethodTokenizationParameters;", "(Ljava/util/List;I)Lo/setPaymentMethodTokenizationParameters;", "Lo/setShippingAddressRequired;", "Lo/withSavedState;", "Lo/getTransactionInfo;", "AudioAttributesCompatParcelizer", "(Ljava/util/List;Lo/withSavedState;)Lo/getTransactionInfo;", "Lo/getBytesFromHexString;", "(Lo/getBytesFromHexString;)I", "(Ljava/util/List;)Ljava/util/List;", "Lo/getCurrentDisplayModeSize;", "(Ljava/util/List;Lo/withSavedState;)Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ceilDivide;", "Lo/LogLogLevel;", "Lo/isSeekPending;", "Lo/whenAll;", "Lo/whenAll;", "Lo/getResolutionSize;", "Lo/isPhoneNumberRequired;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "AudioAttributesImplApi21Parcelizer", "Lo/fromCursor;", "Lo/fromCursor;", "AudioAttributesImplApi26Parcelizer", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "", "MediaBrowserCompatItemReceiver", "Ljava/util/Set;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GTAnalyticsSubjectViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final whenAll RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<getPaymentMethodTokenizationParameters> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<isPhoneNumberRequired> AudioAttributesImplApi21Parcelizer;
    private final isSeekPending IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final ceilDivide read;
    private Set<String> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final fromCursor<getPaymentMethodTokenizationParameters> AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final LogLogLevel write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getResolutionSize<isPhoneNumberRequired> AudioAttributesCompatParcelizer;

    @setSdkPayload
    public GTAnalyticsSubjectViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5, ceilDivide ceildivide, LogLogLevel logLogLevel, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        toMagicModuleMetaRepoModel.write(ceildivide, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.read = ceildivide;
        this.write = logLogLevel;
        this.IconCompatParcelizer = isseekpending;
        whenAll.Companion companion = whenAll.INSTANCE;
        this.RemoteActionCompatParcelizer = whenAll.Companion.IconCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<isPhoneNumberRequired> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(isPhoneNumberRequired.IconCompatParcelizer.INSTANCE);
        this.AudioAttributesCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer;
        this.AudioAttributesImplApi21Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<getPaymentMethodTokenizationParameters> fromcursor = getLastName.read(0, null, 7);
        this.AudioAttributesImplApi26Parcelizer = fromcursor;
        this.AudioAttributesImplBaseParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        this.MediaBrowserCompatItemReceiver = getKycMessage.read();
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AnonymousClass1(null), new MagicModuleSubmissionRequestBody() { // from class: o.createAndAddCallback
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GTAnalyticsSubjectViewModel.write(this.IconCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    public final setUpdatedStatus<isPhoneNumberRequired> IconCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final NewNumberOtpResendRequest<getPaymentMethodTokenizationParameters> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: com.marrow2.ui.test.gtanalytics.GTAnalyticsSubjectViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            escapeFileName escapefilename;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                GTAnalyticsSubjectViewModel.this.AudioAttributesCompatParcelizer.write(isPhoneNumberRequired.IconCompatParcelizer.INSTANCE);
                this.AudioAttributesCompatParcelizer = 1;
                obj = GTAnalyticsSubjectViewModel.this.read.AudioAttributesCompatParcelizer(GTAnalyticsSubjectViewModel.this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer(), GTAnalyticsSubjectViewModel.this.RemoteActionCompatParcelizer.getIconCompatParcelizer(), this);
                if (obj != objIconCompatParcelizer) {
                }
                return objIconCompatParcelizer;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                escapefilename = (escapeFileName) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                getResolutionSize getresolutionsize = GTAnalyticsSubjectViewModel.this.AudioAttributesCompatParcelizer;
                GTAnalyticsSubjectViewModel gTAnalyticsSubjectViewModel = GTAnalyticsSubjectViewModel.this;
                getresolutionsize.write(new isPhoneNumberRequired.read(gTAnalyticsSubjectViewModel.write(escapefilename, gTAnalyticsSubjectViewModel.RemoteActionCompatParcelizer.getRead(), zBooleanValue)));
                return getShowPopup.INSTANCE;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            escapeFileName escapefilename2 = (escapeFileName) obj;
            this.IconCompatParcelizer = escapefilename2;
            this.AudioAttributesCompatParcelizer = 2;
            Object objHandleMediaPlayPauseIfPendingOnHandler = GTAnalyticsSubjectViewModel.this.write.handleMediaPlayPauseIfPendingOnHandler(this);
            if (objHandleMediaPlayPauseIfPendingOnHandler != objIconCompatParcelizer) {
                escapefilename = escapefilename2;
                obj = objHandleMediaPlayPauseIfPendingOnHandler;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                getResolutionSize getresolutionsize2 = GTAnalyticsSubjectViewModel.this.AudioAttributesCompatParcelizer;
                GTAnalyticsSubjectViewModel gTAnalyticsSubjectViewModel2 = GTAnalyticsSubjectViewModel.this;
                getresolutionsize2.write(new isPhoneNumberRequired.read(gTAnalyticsSubjectViewModel2.write(escapefilename, gTAnalyticsSubjectViewModel2.RemoteActionCompatParcelizer.getRead(), zBooleanValue2)));
                return getShowPopup.INSTANCE;
            }
            return objIconCompatParcelizer;
        }

        AnonymousClass1(SampleVideos<? super AnonymousClass1> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GTAnalyticsSubjectViewModel.this.new AnonymousClass1(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AnonymousClass1) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(GTAnalyticsSubjectViewModel gTAnalyticsSubjectViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        gTAnalyticsSubjectViewModel.AudioAttributesCompatParcelizer.write(new isPhoneNumberRequired.RemoteActionCompatParcelizer(i, str));
        return getShowPopup.INSTANCE;
    }

    public final void RemoteActionCompatParcelizer(setReferenceCounted p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof setReferenceCounted.AudioAttributesImplBaseParcelizer) {
            read();
            return;
        }
        if (p0 instanceof setReferenceCounted.write) {
            write((setReferenceCounted.write) p0);
        } else if (p0 instanceof setReferenceCounted.MediaBrowserCompatMediaItem) {
            write(((setReferenceCounted.MediaBrowserCompatMediaItem) p0).write());
        } else if (p0 instanceof setReferenceCounted.AudioAttributesCompatParcelizer) {
            IconCompatParcelizer(getPaymentMethodTokenizationParameters.AudioAttributesCompatParcelizer.INSTANCE);
        }
    }

    private final void write(String p0) {
        getShippingAddressRequirements getshippingaddressrequirementsRemoteActionCompatParcelizer;
        Object next;
        Set<String> setIconCompatParcelizer;
        isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        isPhoneNumberRequired.read readVar = isphonenumberrequiredIconCompatParcelizer instanceof isPhoneNumberRequired.read ? (isPhoneNumberRequired.read) isphonenumberrequiredIconCompatParcelizer : null;
        if (readVar == null || (getshippingaddressrequirementsRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer()) == null) {
            return;
        }
        getTransactionInfo iconCompatParcelizer = getshippingaddressrequirementsRemoteActionCompatParcelizer.getIconCompatParcelizer();
        getTransactionInfo.read readVar2 = iconCompatParcelizer instanceof getTransactionInfo.read ? (getTransactionInfo.read) iconCompatParcelizer : null;
        if (readVar2 != null) {
            Iterator<T> it = readVar2.write().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((setShippingAddressRequired) next).getRemoteActionCompatParcelizer(), (Object) p0)) {
                        break;
                    }
                }
            }
            setShippingAddressRequired setshippingaddressrequired = (setShippingAddressRequired) next;
            if (setshippingaddressrequired != null) {
                if (setshippingaddressrequired.getAudioAttributesImplApi21Parcelizer() == 0) {
                    IconCompatParcelizer(new getPaymentMethodTokenizationParameters.read(this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()));
                    return;
                }
                boolean zContains = this.MediaBrowserCompatItemReceiver.contains(p0);
                if (!zContains) {
                    setIconCompatParcelizer = getKycMessage.write(this.MediaBrowserCompatItemReceiver, p0);
                } else {
                    setIconCompatParcelizer = getKycMessage.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, p0);
                }
                this.MediaBrowserCompatItemReceiver = setIconCompatParcelizer;
                if (!zContains) {
                    isSeekPending isseekpending = this.IconCompatParcelizer;
                    interceptEvent interceptevent = interceptEvent.INSTANCE;
                    isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
                this.AudioAttributesCompatParcelizer.write(new isPhoneNumberRequired.read(getShippingAddressRequirements.AudioAttributesCompatParcelizer(getshippingaddressrequirementsRemoteActionCompatParcelizer, null, null, getTransactionInfo.read.RemoteActionCompatParcelizer(readVar2, null, null, IntermediateLoginResponseBody.onPlay(this.MediaBrowserCompatItemReceiver), 3), false, 0, 27)));
            }
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ getPaymentMethodTokenizationParameters write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (GTAnalyticsSubjectViewModel.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.write, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(getPaymentMethodTokenizationParameters getpaymentmethodtokenizationparameters, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.write = getpaymentmethodtokenizationparameters;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GTAnalyticsSubjectViewModel.this.new RemoteActionCompatParcelizer(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear IconCompatParcelizer(getPaymentMethodTokenizationParameters p0) {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.OnSuccessListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GTAnalyticsSubjectViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    public static final class IconCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((setShippingAddressRequired) t2).getAudioAttributesImplBaseParcelizer()), Integer.valueOf(((setShippingAddressRequired) t).getAudioAttributesImplBaseParcelizer()));
        }
    }

    public static final class read<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((setShippingAddressRequired) t2).getAudioAttributesImplApi26Parcelizer()), Integer.valueOf(((setShippingAddressRequired) t).getAudioAttributesImplApi26Parcelizer()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void write(setReferenceCounted.write p0) {
        getShippingAddressRequirements getshippingaddressrequirementsRemoteActionCompatParcelizer;
        isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        isPhoneNumberRequired.read readVar = isphonenumberrequiredIconCompatParcelizer instanceof isPhoneNumberRequired.read ? (isPhoneNumberRequired.read) isphonenumberrequiredIconCompatParcelizer : null;
        if (readVar == null || (getshippingaddressrequirementsRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer()) == null) {
            return;
        }
        setPaymentMethodTokenizationParameters write2 = getshippingaddressrequirementsRemoteActionCompatParcelizer.getWrite();
        setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizer = write2 instanceof setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer ? (setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer) write2 : null;
        if (remoteActionCompatParcelizer == null || remoteActionCompatParcelizer.read() == p0.read()) {
            return;
        }
        this.AudioAttributesCompatParcelizer.write(new isPhoneNumberRequired.read(getShippingAddressRequirements.AudioAttributesCompatParcelizer(getshippingaddressrequirementsRemoteActionCompatParcelizer, null, setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer.read(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, p0.read()), null, false, 0, 29)));
    }

    private final void read() {
        getShippingAddressRequirements getshippingaddressrequirementsRemoteActionCompatParcelizer;
        withSavedState withsavedstate;
        isPhoneNumberRequired isphonenumberrequiredIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        isPhoneNumberRequired.read readVar = isphonenumberrequiredIconCompatParcelizer instanceof isPhoneNumberRequired.read ? (isPhoneNumberRequired.read) isphonenumberrequiredIconCompatParcelizer : null;
        if (readVar == null || (getshippingaddressrequirementsRemoteActionCompatParcelizer = readVar.RemoteActionCompatParcelizer()) == null) {
            return;
        }
        isSeekPending isseekpending = this.IconCompatParcelizer;
        interceptEvent interceptevent = interceptEvent.INSTANCE;
        isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(interceptEvent.read.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getTransactionInfo iconCompatParcelizer = getshippingaddressrequirementsRemoteActionCompatParcelizer.getIconCompatParcelizer();
        getTransactionInfo.read readVar2 = iconCompatParcelizer instanceof getTransactionInfo.read ? (getTransactionInfo.read) iconCompatParcelizer : null;
        if (readVar2 != null) {
            if (readVar2.getIconCompatParcelizer() == withSavedState.RemoteActionCompatParcelizer) {
                withsavedstate = withSavedState.IconCompatParcelizer;
            } else {
                withsavedstate = withSavedState.RemoteActionCompatParcelizer;
            }
            this.AudioAttributesCompatParcelizer.write(new isPhoneNumberRequired.read(getShippingAddressRequirements.AudioAttributesCompatParcelizer(getshippingaddressrequirementsRemoteActionCompatParcelizer, null, null, getTransactionInfo.read.RemoteActionCompatParcelizer(readVar2, IntermediateLoginResponseBody.handleMediaPlayPauseIfPendingOnHandler(readVar2.write()), withsavedstate, null, 4), false, 0, 27)));
        }
    }

    public static final class write<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String lowerCase = ((setShippingAddressRequired) t).getRead().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            String lowerCase2 = ((setShippingAddressRequired) t2).getRead().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            return getConfigExpirySeconds.read(lowerCase, lowerCase2);
        }

        public write(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getShippingAddressRequirements write(escapeFileName p0, String p1, boolean p2) {
        List<withTimeout> listRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0.IconCompatParcelizer());
        List<setShippingAddressRequired> list = read(p0.RemoteActionCompatParcelizer(), withSavedState.RemoteActionCompatParcelizer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listRemoteActionCompatParcelizer) {
            int mediaBrowserCompatCustomActionResultReceiver = ((withTimeout) obj).getMediaBrowserCompatCustomActionResultReceiver();
            setPhoneNumberRequired.Companion companion = setPhoneNumberRequired.INSTANCE;
            if (mediaBrowserCompatCustomActionResultReceiver != setPhoneNumberRequired.Companion.AudioAttributesCompatParcelizer()) {
                arrayList.add(obj);
            }
        }
        return new getShippingAddressRequirements(p1, RemoteActionCompatParcelizer(listRemoteActionCompatParcelizer, IntermediateLoginResponseBody.write((List) arrayList)), AudioAttributesCompatParcelizer(list, withSavedState.RemoteActionCompatParcelizer), p2, this.RemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer());
    }

    public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((setShippingAddressRequired) t2).getWrite()), Integer.valueOf(((setShippingAddressRequired) t).getWrite()));
        }

        public AudioAttributesCompatParcelizer(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    private static setPaymentMethodTokenizationParameters RemoteActionCompatParcelizer(List<withTimeout> p0, int p1) {
        if (p0 == null) {
            return setPaymentMethodTokenizationParameters.IconCompatParcelizer.INSTANCE;
        }
        return p0.isEmpty() ? setPaymentMethodTokenizationParameters.AudioAttributesCompatParcelizer.INSTANCE : new setPaymentMethodTokenizationParameters.RemoteActionCompatParcelizer(p0, p1);
    }

    private static getTransactionInfo AudioAttributesCompatParcelizer(List<setShippingAddressRequired> p0, withSavedState p1) {
        if (p0 == null) {
            return getTransactionInfo.IconCompatParcelizer.INSTANCE;
        }
        return p0.isEmpty() ? getTransactionInfo.write.INSTANCE : new getTransactionInfo.read(p0, p1, null, 4, null);
    }

    private static int RemoteActionCompatParcelizer(getBytesFromHexString getbytesfromhexstring) {
        return (int) Math.floor(getbytesfromhexstring.getAudioAttributesCompatParcelizer());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<kotlin.withTimeout> RemoteActionCompatParcelizer(java.util.List<kotlin.getBytesFromHexString> r21) {
        /*
            r0 = r21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L11:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r2.next()
            int r5 = r3 + 1
            if (r3 >= 0) goto L22
            kotlin.IntermediateLoginResponseBody.read()
        L22:
            o.getBytesFromHexString r4 = (kotlin.getBytesFromHexString) r4
            r6 = 0
            if (r3 <= 0) goto L4c
            int r7 = r3 + (-1)
            java.lang.Object r8 = r0.get(r7)
            o.getBytesFromHexString r8 = (kotlin.getBytesFromHexString) r8
            int r8 = r8.getIconCompatParcelizer()
            o.setPhoneNumberRequired$RemoteActionCompatParcelizer r9 = kotlin.setPhoneNumberRequired.INSTANCE
            int r9 = kotlin.setPhoneNumberRequired.Companion.AudioAttributesCompatParcelizer()
            if (r8 == r9) goto L4c
            java.lang.Object r7 = r0.get(r7)
            o.getBytesFromHexString r7 = (kotlin.getBytesFromHexString) r7
            int r7 = RemoteActionCompatParcelizer(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r16 = r7
            goto L4e
        L4c:
            r16 = r6
        L4e:
            int r7 = r21.size()
            int r7 = r7 + (-1)
            if (r3 >= r7) goto L76
            java.lang.Object r3 = r0.get(r5)
            o.getBytesFromHexString r3 = (kotlin.getBytesFromHexString) r3
            int r3 = r3.getIconCompatParcelizer()
            o.setPhoneNumberRequired$RemoteActionCompatParcelizer r7 = kotlin.setPhoneNumberRequired.INSTANCE
            int r7 = kotlin.setPhoneNumberRequired.Companion.AudioAttributesCompatParcelizer()
            if (r3 == r7) goto L76
            java.lang.Object r3 = r0.get(r5)
            o.getBytesFromHexString r3 = (kotlin.getBytesFromHexString) r3
            int r3 = RemoteActionCompatParcelizer(r3)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
        L76:
            r15 = r6
            java.lang.String r9 = r4.getRemoteActionCompatParcelizer()
            double r6 = r4.getWrite()
            double r6 = java.lang.Math.floor(r6)
            int r3 = (int) r6
            double r6 = r4.getAudioAttributesCompatParcelizer()
            double r6 = java.lang.Math.floor(r6)
            int r12 = (int) r6
            double r13 = r4.getAudioAttributesCompatParcelizer()
            java.lang.String r17 = r4.getRead()
            o.loadBitmap r6 = kotlin.loadBitmap.INSTANCE
            long r6 = r4.getMediaBrowserCompatCustomActionResultReceiver()
            long r18 = kotlin.loadBitmap.AudioAttributesImplBaseParcelizer(r6)
            int r20 = r4.getIconCompatParcelizer()
            o.withTimeout r4 = new o.withTimeout
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            r11 = 0
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r15, r16, r17, r18, r20)
            r1.add(r4)
            r3 = r5
            goto L11
        Lb4:
            kotlin.IntermediateLoginResponseBody.AudioAttributesImplApi21Parcelizer(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.gtanalytics.GTAnalyticsSubjectViewModel.RemoteActionCompatParcelizer(java.util.List):java.util.List");
    }

    private static List<setShippingAddressRequired> read(List<getCurrentDisplayModeSize> p0, withSavedState p1) {
        if (p0 == null) {
            return null;
        }
        List<getCurrentDisplayModeSize> list = p0;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
        for (getCurrentDisplayModeSize getcurrentdisplaymodesize : list) {
            String remoteActionCompatParcelizer = getcurrentdisplaymodesize.getRemoteActionCompatParcelizer();
            String audioAttributesImplApi26Parcelizer = getcurrentdisplaymodesize.getAudioAttributesImplApi26Parcelizer();
            int write2 = getcurrentdisplaymodesize.getWrite();
            int read2 = getcurrentdisplaymodesize.getRead();
            int iconCompatParcelizer = getcurrentdisplaymodesize.getIconCompatParcelizer();
            int audioAttributesCompatParcelizer = getcurrentdisplaymodesize.getAudioAttributesCompatParcelizer();
            int i = getOnline.read(getcurrentdisplaymodesize.getMediaBrowserCompatCustomActionResultReceiver());
            int audioAttributesImplBaseParcelizer = getcurrentdisplaymodesize.getAudioAttributesImplBaseParcelizer();
            List<getCountryCode> listAudioAttributesImplBaseParcelizer = getcurrentdisplaymodesize.AudioAttributesImplBaseParcelizer();
            ArrayList arrayList2 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) listAudioAttributesImplBaseParcelizer, 10));
            Iterator<T> it = listAudioAttributesImplBaseParcelizer.iterator();
            while (it.hasNext()) {
                arrayList2.add(new setTransactionInfo(((getCountryCode) it.next()).getRead()));
            }
            arrayList.add(new setShippingAddressRequired(remoteActionCompatParcelizer, audioAttributesImplApi26Parcelizer, write2, read2, iconCompatParcelizer, audioAttributesCompatParcelizer, i, audioAttributesImplBaseParcelizer, arrayList2));
        }
        List<setShippingAddressRequired> listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList, getConfigExpirySeconds.RemoteActionCompatParcelizer(new read(), new write(new AudioAttributesCompatParcelizer(new IconCompatParcelizer()))));
        return p1 == withSavedState.IconCompatParcelizer ? IntermediateLoginResponseBody.handleMediaPlayPauseIfPendingOnHandler(listAudioAttributesCompatParcelizer) : listAudioAttributesCompatParcelizer;
    }
}
