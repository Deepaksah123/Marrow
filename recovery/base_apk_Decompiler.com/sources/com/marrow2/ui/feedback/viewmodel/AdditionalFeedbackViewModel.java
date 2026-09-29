package com.marrow2.ui.feedback.viewmodel;

import com.marrow2.ui.feedback.viewmodel.AdditionalFeedbackViewModel;
import kotlin.BlockingServiceConnection;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.MimeTypes;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.SampleVideos;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.getAnswerMap;
import kotlin.getMagicModuleStats;
import kotlin.getResolutionSize;
import kotlin.getServiceWithTimeout;
import kotlin.getShowPopup;
import kotlin.setSdkPayload;
import kotlin.setStartTime;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\fH\u0002¢\u0006\u0004\b\n\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000e\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00168\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0010\u0010\u0019R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\n\u0010\u0019"}, d2 = {"Lcom/marrow2/ui/feedback/viewmodel/AdditionalFeedbackViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/MimeTypes;", "p0", "Lo/POJOPropertyBuilder5;", "p1", "<init>", "(Lo/MimeTypes;Lo/POJOPropertyBuilder5;)V", "Lo/getServiceWithTimeout;", "", "read", "(Lo/getServiceWithTimeout;)V", "", "(Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "Lo/MimeTypes;", "AudioAttributesCompatParcelizer", "Lo/BlockingServiceConnection;", "IconCompatParcelizer", "Lo/BlockingServiceConnection;", "Lo/getResolutionSize;", "Lo/getResolutionSize;", "Lo/setUpdatedStatus;", "AudioAttributesImplBaseParcelizer", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "write", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AdditionalFeedbackViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final getResolutionSize<getServiceWithTimeout> read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final setUpdatedStatus<getServiceWithTimeout> write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final BlockingServiceConnection RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final MimeTypes AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getResolutionSize<String> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final setUpdatedStatus<String> AudioAttributesImplApi26Parcelizer;

    @setSdkPayload
    public AdditionalFeedbackViewModel(MimeTypes mimeTypes, POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(mimeTypes, "");
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.AudioAttributesCompatParcelizer = mimeTypes;
        BlockingServiceConnection.Companion companion = BlockingServiceConnection.INSTANCE;
        this.RemoteActionCompatParcelizer = BlockingServiceConnection.Companion.AudioAttributesCompatParcelizer(pOJOPropertyBuilder5);
        getResolutionSize<getServiceWithTimeout> getresolutionsizeRemoteActionCompatParcelizer = setStartTime.RemoteActionCompatParcelizer(getServiceWithTimeout.IconCompatParcelizer.INSTANCE);
        this.read = getresolutionsizeRemoteActionCompatParcelizer;
        this.write = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer);
        getResolutionSize<String> getresolutionsizeRemoteActionCompatParcelizer2 = setStartTime.RemoteActionCompatParcelizer("");
        this.IconCompatParcelizer = getresolutionsizeRemoteActionCompatParcelizer2;
        this.AudioAttributesImplApi26Parcelizer = VerifyNewNumberRequest.read((getResolutionSize) getresolutionsizeRemoteActionCompatParcelizer2);
    }

    public final setUpdatedStatus<getServiceWithTimeout> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final setUpdatedStatus<String> read() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final void read(getServiceWithTimeout p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0 instanceof getServiceWithTimeout.read) {
            read(((getServiceWithTimeout.read) p0).IconCompatParcelizer());
        }
    }

    public static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        public static int IconCompatParcelizer;
        public static int RemoteActionCompatParcelizer;
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ String write;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
        
            if (r11.read.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r11.read.RemoteActionCompatParcelizer.getWrite(), r11.read.RemoteActionCompatParcelizer.getIconCompatParcelizer(), r11.write, kotlin.IntermediateLoginResponseBody.onPlay(r11.read.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver()), r11) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
        
            if (r11.read.AudioAttributesCompatParcelizer.IconCompatParcelizer(r11.read.RemoteActionCompatParcelizer.getRead(), r11.read.RemoteActionCompatParcelizer.getIconCompatParcelizer(), r11) != r0) goto L22;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.feedback.viewmodel.AdditionalFeedbackViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(String str, SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
            this.write = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return AdditionalFeedbackViewModel.this.new read(this.write, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }

        public static int RemoteActionCompatParcelizer() {
            int i = IconCompatParcelizer;
            int i2 = i % 5763937;
            IconCompatParcelizer = i + 1;
            if (i2 != 0) {
                return RemoteActionCompatParcelizer;
            }
            int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
            RemoteActionCompatParcelizer = iFreeMemory;
            return iFreeMemory;
        }
    }

    private final void read(String p0) {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getResolution
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return AdditionalFeedbackViewModel.write(this.IconCompatParcelizer, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(AdditionalFeedbackViewModel additionalFeedbackViewModel, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        additionalFeedbackViewModel.IconCompatParcelizer.write(str);
        return getShowPopup.INSTANCE;
    }
}
