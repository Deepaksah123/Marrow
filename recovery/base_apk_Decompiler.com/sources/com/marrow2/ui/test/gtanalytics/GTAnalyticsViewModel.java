package com.marrow2.ui.test.gtanalytics;

import com.marrow2.ui.test.gtanalytics.GTAnalyticsViewModel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LogLogLevel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.Pair;
import kotlin.PaymentDataRequestBuilder;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.ceilDivide;
import kotlin.createHandlerForCurrentOrMainLooper;
import kotlin.fromCursor;
import kotlin.fromUtf8Bytes;
import kotlin.getAnswerMap;
import kotlin.getBytesFromHexString;
import kotlin.getConfigExpirySeconds;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getOnline;
import kotlin.getResolutionSize;
import kotlin.getSavedState;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.interceptEvent;
import kotlin.isEmailRequired;
import kotlin.isSeekPending;
import kotlin.isShippingAddressRequired;
import kotlin.isUiRequired;
import kotlin.setCardRequirements;
import kotlin.setEmailRequired;
import kotlin.setPassingYear;
import kotlin.setReferenceCounted;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import kotlin.withSavedState;
import kotlin.withTimeout;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u000e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u0016\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0002¢\u0006\u0004\b#\u0010\fJ\u0017\u0010\u001d\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020$H\u0002¢\u0006\u0004\b\u001d\u0010&J\u001f\u0010!\u001a\u00020)2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'H\u0002¢\u0006\u0004\b!\u0010*J\u001f\u0010\u001d\u001a\u00020,2\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010'H\u0002¢\u0006\u0004\b\u001d\u0010-J#\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020(0'2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020.0'H\u0002¢\u0006\u0004\b\u0016\u0010/J3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020+0'2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002000'2\u0006\u0010\u0005\u001a\u0002012\u0006\u0010\u0007\u001a\u000202H\u0002¢\u0006\u0004\b\u0016\u00103J\u0013\u0010\u001d\u001a\u000204*\u00020.H\u0002¢\u0006\u0004\b\u001d\u00105J\u001b\u0010\u001d\u001a\u000204*\u0002002\u0006\u0010\u0003\u001a\u000202H\u0002¢\u0006\u0004\b\u001d\u00106J\u001b\u0010\u000e\u001a\u000207*\u0002002\u0006\u0010\u0003\u001a\u000202H\u0002¢\u0006\u0004\b\u000e\u00108J\u001b\u0010\u0016\u001a\u000207*\u0002002\u0006\u0010\u0003\u001a\u000202H\u0002¢\u0006\u0004\b\u0016\u00108R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00109R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010;R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010>R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020=0?8\u0007¢\u0006\f\n\u0004\b!\u0010@\u001a\u0004\b\u0011\u0010AR\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00150B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010CR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150E8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010F\u001a\u0004\b\u0016\u0010GR\u0016\u0010J\u001a\u00020H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010I"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/ceilDivide;", "p0", "Lo/LogLogLevel;", "p1", "Lo/isSeekPending;", "p2", "<init>", "(Lo/ceilDivide;Lo/LogLogLevel;Lo/isSeekPending;)V", "", "AudioAttributesImplApi21Parcelizer", "()V", "Lo/setReferenceCounted;", "AudioAttributesCompatParcelizer", "(Lo/setReferenceCounted;)V", "", "read", "(Z)V", "Lo/setPassingYear;", "()Lo/setPassingYear;", "Lo/isShippingAddressRequired;", "IconCompatParcelizer", "(Lo/isShippingAddressRequired;)Lo/setPassingYear;", "Lo/setReferenceCounted$write;", "(Lo/setReferenceCounted$write;)V", "Lo/setReferenceCounted$IconCompatParcelizer;", "(Lo/setReferenceCounted$IconCompatParcelizer;)V", "Lo/setReferenceCounted$MediaBrowserCompatItemReceiver;", "RemoteActionCompatParcelizer", "(Lo/setReferenceCounted$MediaBrowserCompatItemReceiver;)V", "AudioAttributesImplApi26Parcelizer", "", "write", "(Ljava/lang/String;)V", "MediaBrowserCompatCustomActionResultReceiver", "Lo/createHandlerForCurrentOrMainLooper;", "Lo/getSavedState;", "(Lo/createHandlerForCurrentOrMainLooper;)Lo/getSavedState;", "", "Lo/withTimeout;", "Lo/setEmailRequired;", "(Ljava/util/List;)Lo/setEmailRequired;", "Lo/setCardRequirements;", "Lo/isUiRequired;", "(Ljava/util/List;)Lo/isUiRequired;", "Lo/getBytesFromHexString;", "(Ljava/util/List;)Ljava/util/List;", "Lo/fromUtf8Bytes;", "Lo/withSavedState;", "Lo/PaymentDataRequestBuilder;", "(Ljava/util/List;Lo/withSavedState;Lo/PaymentDataRequestBuilder;)Ljava/util/List;", "", "(Lo/getBytesFromHexString;)I", "(Lo/fromUtf8Bytes;Lo/PaymentDataRequestBuilder;)I", "", "(Lo/fromUtf8Bytes;Lo/PaymentDataRequestBuilder;)D", "Lo/ceilDivide;", "Lo/LogLogLevel;", "Lo/isSeekPending;", "Lo/getResolutionSize;", "Lo/isEmailRequired;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/fromCursor;", "MediaBrowserCompatItemReceiver", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel$IconCompatParcelizer;", "Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel$IconCompatParcelizer;", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GTAnalyticsViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<isEmailRequired> write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private IconCompatParcelizer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<isShippingAddressRequired> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final LogLogLevel RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final ceilDivide IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final isSeekPending AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<isShippingAddressRequired> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setUpdatedStatus<isEmailRequired> read;

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[PaymentDataRequestBuilder.values().length];
            try {
                iArr[PaymentDataRequestBuilder.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentDataRequestBuilder.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    @setSdkPayload
    public GTAnalyticsViewModel(ceilDivide ceildivide, LogLogLevel logLogLevel, isSeekPending isseekpending) {
        toMagicModuleMetaRepoModel.write(ceildivide, "");
        toMagicModuleMetaRepoModel.write(logLogLevel, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.IconCompatParcelizer = ceildivide;
        this.RemoteActionCompatParcelizer = logLogLevel;
        this.AudioAttributesCompatParcelizer = isseekpending;
        getResolutionSize<isEmailRequired> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(isEmailRequired.AudioAttributesCompatParcelizer.INSTANCE);
        this.write = getresolutionsizeRemoteActionCompatParcelizer;
        this.read = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        fromCursor<isShippingAddressRequired> fromcursor = getLastName.read(0, null, 7);
        this.MediaBrowserCompatItemReceiver = fromcursor;
        this.MediaBrowserCompatCustomActionResultReceiver = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
        this.AudioAttributesImplBaseParcelizer = new IconCompatParcelizer(null, null, null, null, 0, 0, false, 127, null);
        AudioAttributesImplApi21Parcelizer();
    }

    public final setUpdatedStatus<isEmailRequired> read() {
        return this.read;
    }

    public final NewNumberOtpResendRequest<isShippingAddressRequired> IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private Object IconCompatParcelizer;
        private int MediaBrowserCompatItemReceiver;
        private Object RemoteActionCompatParcelizer;
        private Object read;
        private boolean write;

        /* JADX WARN: Removed duplicated region for block: B:20:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 313
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.gtanalytics.GTAnalyticsViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GTAnalyticsViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.addOnCanceledListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GTAnalyticsViewModel.write(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(GTAnalyticsViewModel gTAnalyticsViewModel, int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        gTAnalyticsViewModel.write.write(new isEmailRequired.read(i, str));
        return getShowPopup.INSTANCE;
    }

    public final void AudioAttributesCompatParcelizer(setReferenceCounted p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof setReferenceCounted.MediaBrowserCompatCustomActionResultReceiver) {
            setReferenceCounted.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver = (setReferenceCounted.MediaBrowserCompatCustomActionResultReceiver) p0;
            write(mediaBrowserCompatCustomActionResultReceiver.read());
            IconCompatParcelizer(new isShippingAddressRequired.write(mediaBrowserCompatCustomActionResultReceiver.read(), mediaBrowserCompatCustomActionResultReceiver.write(), this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer()));
            return;
        }
        if (p0 instanceof setReferenceCounted.MediaDescriptionCompat) {
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            setReferenceCounted.MediaDescriptionCompat mediaDescriptionCompat = (setReferenceCounted.MediaDescriptionCompat) p0;
            isseekpending.write(interceptEvent.write(mediaDescriptionCompat.write()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            IconCompatParcelizer(new isShippingAddressRequired.read(mediaDescriptionCompat.write()));
            return;
        }
        if (p0 instanceof setReferenceCounted.AudioAttributesImplBaseParcelizer) {
            AudioAttributesImplApi26Parcelizer();
            return;
        }
        if (p0 instanceof setReferenceCounted.MediaBrowserCompatItemReceiver) {
            RemoteActionCompatParcelizer((setReferenceCounted.MediaBrowserCompatItemReceiver) p0);
            return;
        }
        if (p0 instanceof setReferenceCounted.IconCompatParcelizer) {
            IconCompatParcelizer((setReferenceCounted.IconCompatParcelizer) p0);
            return;
        }
        if (p0 instanceof setReferenceCounted.write) {
            IconCompatParcelizer((setReferenceCounted.write) p0);
            return;
        }
        if (p0 instanceof setReferenceCounted.AudioAttributesImplApi26Parcelizer) {
            AudioAttributesCompatParcelizer();
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setReferenceCounted.AudioAttributesImplApi21Parcelizer.INSTANCE)) {
            IconCompatParcelizer(isShippingAddressRequired.IconCompatParcelizer.INSTANCE);
        } else if (!(p0 instanceof setReferenceCounted.RemoteActionCompatParcelizer) && !(p0 instanceof setReferenceCounted.MediaBrowserCompatMediaItem) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, setReferenceCounted.AudioAttributesCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
    }

    public static final class AudioAttributesCompatParcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Long.valueOf(((getBytesFromHexString) t).getMediaBrowserCompatCustomActionResultReceiver()), Long.valueOf(((getBytesFromHexString) t2).getMediaBrowserCompatCustomActionResultReceiver()));
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Long.valueOf(((getBytesFromHexString) t).getMediaBrowserCompatCustomActionResultReceiver()), Long.valueOf(((getBytesFromHexString) t2).getMediaBrowserCompatCustomActionResultReceiver()));
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer<T> implements Comparator {
        private /* synthetic */ PaymentDataRequestBuilder IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Double.valueOf(GTAnalyticsViewModel.AudioAttributesCompatParcelizer((fromUtf8Bytes) t2, this.IconCompatParcelizer)), Double.valueOf(GTAnalyticsViewModel.AudioAttributesCompatParcelizer((fromUtf8Bytes) t, this.IconCompatParcelizer)));
        }

        public AudioAttributesImplApi21Parcelizer(PaymentDataRequestBuilder paymentDataRequestBuilder) {
            this.IconCompatParcelizer = paymentDataRequestBuilder;
        }
    }

    public static final class MediaBrowserCompatItemReceiver<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((fromUtf8Bytes) t2).getIconCompatParcelizer()), Integer.valueOf(((fromUtf8Bytes) t).getIconCompatParcelizer()));
        }
    }

    public static final class MediaMetadataCompat<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Double.valueOf(((fromUtf8Bytes) t2).getRead()), Double.valueOf(((fromUtf8Bytes) t).getRead()));
        }
    }

    public static final class AudioAttributesImplBaseParcelizer<T> implements Comparator {
        private /* synthetic */ Comparator IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.IconCompatParcelizer.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String lowerCase = ((fromUtf8Bytes) t).getRemoteActionCompatParcelizer().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            String lowerCase2 = ((fromUtf8Bytes) t2).getRemoteActionCompatParcelizer().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            return getConfigExpirySeconds.read(lowerCase, lowerCase2);
        }

        public AudioAttributesImplBaseParcelizer(Comparator comparator) {
            this.IconCompatParcelizer = comparator;
        }
    }

    public static final class MediaBrowserCompatMediaItem<T> implements Comparator {
        private /* synthetic */ Comparator write;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.write.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            String lowerCase = ((fromUtf8Bytes) t).getRemoteActionCompatParcelizer().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            String lowerCase2 = ((fromUtf8Bytes) t2).getRemoteActionCompatParcelizer().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase2, "");
            return getConfigExpirySeconds.read(lowerCase, lowerCase2);
        }

        public MediaBrowserCompatMediaItem(Comparator comparator) {
            this.write = comparator;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(boolean p0) {
        getSavedState getsavedstate;
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer, null, null, null, null, 0, 0, false, 63);
        isEmailRequired isemailrequiredIconCompatParcelizer = this.write.IconCompatParcelizer();
        isEmailRequired.write writeVar = isemailrequiredIconCompatParcelizer instanceof isEmailRequired.write ? (isEmailRequired.write) isemailrequiredIconCompatParcelizer : null;
        if (writeVar == null || (getsavedstate = writeVar.read()) == null) {
            return;
        }
        this.write.write(new isEmailRequired.write(getSavedState.write(getsavedstate, 0, null, null, false, 7)));
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                GTAnalyticsViewModel.this.read(false);
                this.RemoteActionCompatParcelizer = 1;
                if (GTAnalyticsViewModel.this.IconCompatParcelizer.read(this) == objIconCompatParcelizer) {
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GTAnalyticsViewModel.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear AudioAttributesCompatParcelizer() {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new RemoteActionCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.RuntimeExecutionException
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GTAnalyticsViewModel.read((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ isShippingAddressRequired RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (GTAnalyticsViewModel.this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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
        MediaBrowserCompatSearchResultReceiver(isShippingAddressRequired isshippingaddressrequired, SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = isshippingaddressrequired;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return GTAnalyticsViewModel.this.new MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final setPassingYear IconCompatParcelizer(isShippingAddressRequired p0) {
        return CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new MediaBrowserCompatSearchResultReceiver(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.OnTokenCanceledListener
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return GTAnalyticsViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(setReferenceCounted.write p0) {
        getSavedState getsavedstate;
        if (this.AudioAttributesImplBaseParcelizer.getAudioAttributesImplApi26Parcelizer() != p0.read()) {
            this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer, null, null, null, null, 0, p0.read(), false, 95);
            isEmailRequired isemailrequiredIconCompatParcelizer = this.write.IconCompatParcelizer();
            isEmailRequired.write writeVar = isemailrequiredIconCompatParcelizer instanceof isEmailRequired.write ? (isEmailRequired.write) isemailrequiredIconCompatParcelizer : null;
            if (writeVar == null || (getsavedstate = writeVar.read()) == null) {
                return;
            }
            setEmailRequired audioAttributesCompatParcelizer = getsavedstate.getAudioAttributesCompatParcelizer();
            setEmailRequired.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = audioAttributesCompatParcelizer instanceof setEmailRequired.AudioAttributesCompatParcelizer ? (setEmailRequired.AudioAttributesCompatParcelizer) audioAttributesCompatParcelizer : null;
            if (audioAttributesCompatParcelizer2 != null) {
                this.write.write(new isEmailRequired.write(getSavedState.write(getsavedstate, 0, setEmailRequired.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer2.read, audioAttributesCompatParcelizer2.write, audioAttributesCompatParcelizer2.AudioAttributesCompatParcelizer, p0.read()), null, false, 13)));
            }
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver<T> implements Comparator {
        private /* synthetic */ GTAnalyticsViewModel IconCompatParcelizer;
        private /* synthetic */ Comparator RemoteActionCompatParcelizer;
        private /* synthetic */ PaymentDataRequestBuilder read;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.RemoteActionCompatParcelizer.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Double.valueOf(GTAnalyticsViewModel.IconCompatParcelizer((fromUtf8Bytes) t2, this.read)), Double.valueOf(GTAnalyticsViewModel.IconCompatParcelizer((fromUtf8Bytes) t, this.read)));
        }

        public MediaBrowserCompatCustomActionResultReceiver(Comparator comparator, GTAnalyticsViewModel gTAnalyticsViewModel, PaymentDataRequestBuilder paymentDataRequestBuilder) {
            this.RemoteActionCompatParcelizer = comparator;
            this.IconCompatParcelizer = gTAnalyticsViewModel;
            this.read = paymentDataRequestBuilder;
        }
    }

    public static final class MediaDescriptionCompat<T> implements Comparator {
        private /* synthetic */ Comparator AudioAttributesCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.AudioAttributesCompatParcelizer.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Integer.valueOf(((fromUtf8Bytes) t2).getIconCompatParcelizer()), Integer.valueOf(((fromUtf8Bytes) t).getIconCompatParcelizer()));
        }

        public MediaDescriptionCompat(Comparator comparator) {
            this.AudioAttributesCompatParcelizer = comparator;
        }
    }

    public static final class RatingCompat<T> implements Comparator {
        private /* synthetic */ Comparator IconCompatParcelizer;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.IconCompatParcelizer.compare(t, t2);
            return iCompare != 0 ? iCompare : getConfigExpirySeconds.read(Double.valueOf(((fromUtf8Bytes) t2).getAudioAttributesCompatParcelizer()), Double.valueOf(((fromUtf8Bytes) t).getAudioAttributesCompatParcelizer()));
        }

        public RatingCompat(Comparator comparator) {
            this.IconCompatParcelizer = comparator;
        }
    }

    private final void IconCompatParcelizer(setReferenceCounted.IconCompatParcelizer p0) {
        if (this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer() != p0.RemoteActionCompatParcelizer()) {
            this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer, null, null, null, null, p0.RemoteActionCompatParcelizer(), 0, false, 111);
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.read(p0.RemoteActionCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            AudioAttributesImplApi21Parcelizer();
        }
    }

    private final void RemoteActionCompatParcelizer(setReferenceCounted.MediaBrowserCompatItemReceiver p0) {
        if (this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer() != p0.IconCompatParcelizer()) {
            this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(this.AudioAttributesImplBaseParcelizer, null, null, null, p0.IconCompatParcelizer(), 0, 0, false, 119);
            if (p0.IconCompatParcelizer() == PaymentDataRequestBuilder.read) {
                isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
                interceptEvent interceptevent = interceptEvent.INSTANCE;
                isseekpending.write(interceptEvent.write(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        withSavedState withsavedstate;
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (iconCompatParcelizer.getAudioAttributesImplApi21Parcelizer() == withSavedState.RemoteActionCompatParcelizer) {
            withsavedstate = withSavedState.IconCompatParcelizer;
        } else {
            withsavedstate = withSavedState.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(iconCompatParcelizer, null, null, withsavedstate, null, 0, 0, false, 123);
        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
        interceptEvent interceptevent = interceptEvent.INSTANCE;
        isseekpending.write(interceptEvent.RemoteActionCompatParcelizer(interceptEvent.read.write, this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private final void write(String p0) {
        List<fromUtf8Bytes> list;
        createHandlerForCurrentOrMainLooper read2 = this.AudioAttributesImplBaseParcelizer.getRead();
        if (read2 == null || (list = read2.read()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!this.AudioAttributesImplBaseParcelizer.write().contains(((fromUtf8Bytes) obj).getWrite())) {
                arrayList.add(obj);
            }
        }
        List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList, (Comparator) new MediaBrowserCompatMediaItem(new RatingCompat(new MediaDescriptionCompat(new MediaMetadataCompat()))));
        Iterator it = listAudioAttributesCompatParcelizer.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((fromUtf8Bytes) it.next()).getWrite(), (Object) p0)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            fromUtf8Bytes fromutf8bytes = (fromUtf8Bytes) listAudioAttributesCompatParcelizer.get(i);
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            interceptEvent interceptevent = interceptEvent.INSTANCE;
            isseekpending.write(interceptEvent.AudioAttributesCompatParcelizer(fromutf8bytes.getWrite(), fromutf8bytes.getRemoteActionCompatParcelizer(), (int) Math.floor(fromutf8bytes.getRead()), (int) Math.floor(fromutf8bytes.getAudioAttributesCompatParcelizer()), this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        createHandlerForCurrentOrMainLooper read2 = this.AudioAttributesImplBaseParcelizer.getRead();
        if (read2 == null) {
            return;
        }
        this.write.write(new isEmailRequired.write(RemoteActionCompatParcelizer(read2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final getSavedState RemoteActionCompatParcelizer(createHandlerForCurrentOrMainLooper p0) {
        int iWrite;
        List<withTimeout> listIconCompatParcelizer = IconCompatParcelizer(p0.AudioAttributesCompatParcelizer());
        List<setCardRequirements> listIconCompatParcelizer2 = IconCompatParcelizer(p0.read(), this.AudioAttributesImplBaseParcelizer.getAudioAttributesImplApi21Parcelizer(), this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer());
        int iNextIndex = -1;
        if (this.AudioAttributesImplBaseParcelizer.getAudioAttributesImplApi26Parcelizer() == -1) {
            IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
            ListIterator<withTimeout> listIterator = listIconCompatParcelizer.listIterator(listIconCompatParcelizer.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (listIterator.previous().getRemoteActionCompatParcelizer()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            Integer numValueOf = Integer.valueOf(iNextIndex);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iWrite = numValueOf.intValue();
            } else {
                iWrite = IntermediateLoginResponseBody.write((List) listIconCompatParcelizer);
            }
            this.AudioAttributesImplBaseParcelizer = IconCompatParcelizer.write(iconCompatParcelizer, null, null, null, null, 0, iWrite, false, 95);
        }
        return new getSavedState(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer(), write(listIconCompatParcelizer), RemoteActionCompatParcelizer(listIconCompatParcelizer2), this.AudioAttributesImplBaseParcelizer.getWrite());
    }

    private final setEmailRequired write(List<withTimeout> p0) {
        if (p0 == null) {
            return setEmailRequired.read.INSTANCE;
        }
        return p0.isEmpty() ? setEmailRequired.RemoteActionCompatParcelizer.INSTANCE : new setEmailRequired.AudioAttributesCompatParcelizer(p0, this.AudioAttributesImplBaseParcelizer.getAudioAttributesImplApi21Parcelizer(), this.AudioAttributesImplBaseParcelizer.getRemoteActionCompatParcelizer(), this.AudioAttributesImplBaseParcelizer.getAudioAttributesImplApi26Parcelizer());
    }

    private static isUiRequired RemoteActionCompatParcelizer(List<setCardRequirements> p0) {
        if (p0 == null) {
            return isUiRequired.RemoteActionCompatParcelizer.INSTANCE;
        }
        return p0.isEmpty() ? isUiRequired.AudioAttributesCompatParcelizer.INSTANCE : new isUiRequired.IconCompatParcelizer(p0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<kotlin.withTimeout> IconCompatParcelizer(java.util.List<kotlin.getBytesFromHexString> r23) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.test.gtanalytics.GTAnalyticsViewModel.IconCompatParcelizer(java.util.List):java.util.List");
    }

    private final List<setCardRequirements> IconCompatParcelizer(List<fromUtf8Bytes> p0, withSavedState p1, PaymentDataRequestBuilder p2) {
        ArrayList arrayList = new ArrayList();
        if (!p0.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : p0) {
                if (!this.AudioAttributesImplBaseParcelizer.write().contains(((fromUtf8Bytes) obj).getWrite())) {
                    arrayList2.add(obj);
                }
            }
            List listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList2, getConfigExpirySeconds.RemoteActionCompatParcelizer(new AudioAttributesImplApi21Parcelizer(p2), new AudioAttributesImplBaseParcelizer(new MediaBrowserCompatCustomActionResultReceiver(new MediaBrowserCompatItemReceiver(), this, p2))));
            if (p1 == withSavedState.IconCompatParcelizer) {
                listAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.handleMediaPlayPauseIfPendingOnHandler(listAudioAttributesCompatParcelizer);
            }
            int i = 0;
            for (Object obj2 : listAudioAttributesCompatParcelizer) {
                int i2 = i + 1;
                if (i < 0) {
                    IntermediateLoginResponseBody.read();
                }
                fromUtf8Bytes fromutf8bytes = (fromUtf8Bytes) obj2;
                String remoteActionCompatParcelizer = fromutf8bytes.getRemoteActionCompatParcelizer();
                int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fromutf8bytes, p2);
                arrayList.add(new setCardRequirements(fromutf8bytes.getWrite(), remoteActionCompatParcelizer, iRemoteActionCompatParcelizer, new Pair(Integer.valueOf(iRemoteActionCompatParcelizer), Integer.valueOf(i2 < listAudioAttributesCompatParcelizer.size() ? RemoteActionCompatParcelizer((fromUtf8Bytes) listAudioAttributesCompatParcelizer.get(i2), p2) : iRemoteActionCompatParcelizer))));
                i = i2;
            }
        }
        return arrayList;
    }

    private static int RemoteActionCompatParcelizer(getBytesFromHexString getbytesfromhexstring) {
        return (int) Math.floor(getbytesfromhexstring.getAudioAttributesCompatParcelizer());
    }

    private static int RemoteActionCompatParcelizer(fromUtf8Bytes fromutf8bytes, PaymentDataRequestBuilder paymentDataRequestBuilder) {
        int i = write.IconCompatParcelizer[paymentDataRequestBuilder.ordinal()];
        if (i == 1) {
            return (int) Math.floor(AudioAttributesCompatParcelizer(fromutf8bytes, paymentDataRequestBuilder));
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return getOnline.read(AudioAttributesCompatParcelizer(fromutf8bytes, paymentDataRequestBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double AudioAttributesCompatParcelizer(fromUtf8Bytes fromutf8bytes, PaymentDataRequestBuilder paymentDataRequestBuilder) {
        int i = write.IconCompatParcelizer[paymentDataRequestBuilder.ordinal()];
        if (i == 1) {
            return fromutf8bytes.getRead();
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return fromutf8bytes.getAudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double IconCompatParcelizer(fromUtf8Bytes fromutf8bytes, PaymentDataRequestBuilder paymentDataRequestBuilder) {
        int i = write.IconCompatParcelizer[paymentDataRequestBuilder.ordinal()];
        if (i == 1) {
            return fromutf8bytes.getAudioAttributesCompatParcelizer();
        }
        if (i != 2) {
            throw new RenewEligibleCreator();
        }
        return fromutf8bytes.getRead();
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0082\b\u0018\u00002\u00020\u0001BU\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\u000fHÆ\u0003JW\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010'\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006+"}, d2 = {"Lcom/marrow2/ui/test/gtanalytics/GTAnalyticsViewModel$GtAnalyticsState;", "", "restrictedSubjects", "", "", "gtAnalyticsData", "Lcom/marrow2/domain/test/model/GTAnalyticsV2UCModel;", "sort", "Lcom/marrow2/ui/test/gtanalytics/model/SubjectSort;", "metric", "Lcom/marrow2/ui/test/gtanalytics/model/SubjectMetric;", "limit", "", "selectedIndex", "popupVisible", "", "<init>", "(Ljava/util/List;Lcom/marrow2/domain/test/model/GTAnalyticsV2UCModel;Lcom/marrow2/ui/test/gtanalytics/model/SubjectSort;Lcom/marrow2/ui/test/gtanalytics/model/SubjectMetric;IIZ)V", "getRestrictedSubjects", "()Ljava/util/List;", "getGtAnalyticsData", "()Lcom/marrow2/domain/test/model/GTAnalyticsV2UCModel;", "getSort", "()Lcom/marrow2/ui/test/gtanalytics/model/SubjectSort;", "getMetric", "()Lcom/marrow2/ui/test/gtanalytics/model/SubjectMetric;", "getLimit", "()I", "getSelectedIndex", "getPopupVisible", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final /* data */ class IconCompatParcelizer {
        private final List<String> AudioAttributesCompatParcelizer;
        private final withSavedState AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplApi26Parcelizer;
        private final int IconCompatParcelizer;
        private final PaymentDataRequestBuilder RemoteActionCompatParcelizer;
        private final createHandlerForCurrentOrMainLooper read;
        private final boolean write;

        private IconCompatParcelizer(List<String> list, createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i, int i2, boolean z) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(withsavedstate, "");
            toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
            this.AudioAttributesCompatParcelizer = list;
            this.read = createhandlerforcurrentormainlooper;
            this.AudioAttributesImplApi21Parcelizer = withsavedstate;
            this.RemoteActionCompatParcelizer = paymentDataRequestBuilder;
            this.IconCompatParcelizer = i;
            this.AudioAttributesImplApi26Parcelizer = i2;
            this.write = z;
        }

        public /* synthetic */ IconCompatParcelizer(List list, createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i, int i2, boolean z, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i3 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 2) != 0 ? null : createhandlerforcurrentormainlooper, (i3 & 4) != 0 ? withSavedState.RemoteActionCompatParcelizer : withsavedstate, (i3 & 8) != 0 ? PaymentDataRequestBuilder.RemoteActionCompatParcelizer : paymentDataRequestBuilder, (i3 & 16) != 0 ? 20 : i, (i3 & 32) != 0 ? -1 : i2, (i3 & 64) != 0 ? true : z);
        }

        public final List<String> write() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final createHandlerForCurrentOrMainLooper getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
        public final withSavedState getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final PaymentDataRequestBuilder getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getIconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
        public final int getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final boolean getWrite() {
            return this.write;
        }

        public IconCompatParcelizer() {
            this(null, null, null, null, 0, 0, false, 127, null);
        }

        public static /* synthetic */ IconCompatParcelizer write(IconCompatParcelizer iconCompatParcelizer, List list, createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i, int i2, boolean z, int i3) {
            if ((i3 & 1) != 0) {
                list = iconCompatParcelizer.AudioAttributesCompatParcelizer;
            }
            if ((i3 & 2) != 0) {
                createhandlerforcurrentormainlooper = iconCompatParcelizer.read;
            }
            createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper2 = createhandlerforcurrentormainlooper;
            if ((i3 & 4) != 0) {
                withsavedstate = iconCompatParcelizer.AudioAttributesImplApi21Parcelizer;
            }
            withSavedState withsavedstate2 = withsavedstate;
            if ((i3 & 8) != 0) {
                paymentDataRequestBuilder = iconCompatParcelizer.RemoteActionCompatParcelizer;
            }
            PaymentDataRequestBuilder paymentDataRequestBuilder2 = paymentDataRequestBuilder;
            if ((i3 & 16) != 0) {
                i = iconCompatParcelizer.IconCompatParcelizer;
            }
            int i4 = i;
            if ((i3 & 32) != 0) {
                i2 = iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
            }
            int i5 = i2;
            if ((i3 & 64) != 0) {
                z = iconCompatParcelizer.write;
            }
            return AudioAttributesCompatParcelizer(list, createhandlerforcurrentormainlooper2, withsavedstate2, paymentDataRequestBuilder2, i4, i5, z);
        }

        private static IconCompatParcelizer AudioAttributesCompatParcelizer(List<String> list, createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper, withSavedState withsavedstate, PaymentDataRequestBuilder paymentDataRequestBuilder, int i, int i2, boolean z) {
            toMagicModuleMetaRepoModel.write(list, "");
            toMagicModuleMetaRepoModel.write(withsavedstate, "");
            toMagicModuleMetaRepoModel.write(paymentDataRequestBuilder, "");
            return new IconCompatParcelizer(list, createhandlerforcurrentormainlooper, withsavedstate, paymentDataRequestBuilder, i, i2, z);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) other;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, iconCompatParcelizer.read) && this.AudioAttributesImplApi21Parcelizer == iconCompatParcelizer.AudioAttributesImplApi21Parcelizer && this.RemoteActionCompatParcelizer == iconCompatParcelizer.RemoteActionCompatParcelizer && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == iconCompatParcelizer.AudioAttributesImplApi26Parcelizer && this.write == iconCompatParcelizer.write;
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper = this.read;
            return (((((((((((iHashCode * 31) + (createhandlerforcurrentormainlooper == null ? 0 : createhandlerforcurrentormainlooper.hashCode())) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.write);
        }

        public final String toString() {
            List<String> list = this.AudioAttributesCompatParcelizer;
            createHandlerForCurrentOrMainLooper createhandlerforcurrentormainlooper = this.read;
            withSavedState withsavedstate = this.AudioAttributesImplApi21Parcelizer;
            PaymentDataRequestBuilder paymentDataRequestBuilder = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesImplApi26Parcelizer;
            boolean z = this.write;
            StringBuilder sb = new StringBuilder("GtAnalyticsState(restrictedSubjects=");
            sb.append(list);
            sb.append(", gtAnalyticsData=");
            sb.append(createhandlerforcurrentormainlooper);
            sb.append(", sort=");
            sb.append(withsavedstate);
            sb.append(", metric=");
            sb.append(paymentDataRequestBuilder);
            sb.append(", limit=");
            sb.append(i);
            sb.append(", selectedIndex=");
            sb.append(i2);
            sb.append(", popupVisible=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }
    }
}
