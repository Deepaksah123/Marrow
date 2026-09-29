package com.marrow.ui.activities.blocking;

import com.marrow.ui.activities.blocking.BlockingViewModel;
import kotlin.CeaDecoderCeaOutputBuffer;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.DvbDecoder;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.endSectionV18;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.setMbbsVerificationYear;
import kotlin.setModifiedEndTimestampMs;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lcom/marrow/ui/activities/blocking/BlockingViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/endSectionV18;", "p0", "<init>", "(Lo/endSectionV18;)V", "Lo/CeaDecoderCeaOutputBuffer;", "", "IconCompatParcelizer", "(Lo/CeaDecoderCeaOutputBuffer;)V", "AudioAttributesCompatParcelizer", "()V", "Lo/endSectionV18;", "()Lo/endSectionV18;", "write", "Lo/fromCursor;", "Lo/DvbDecoder;", "RemoteActionCompatParcelizer", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "read", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BlockingViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final endSectionV18 write;
    private final fromCursor<DvbDecoder> RemoteActionCompatParcelizer;
    private final NewNumberOtpResendRequest<DvbDecoder> read;

    @setSdkPayload
    public BlockingViewModel(endSectionV18 endsectionv18) {
        toMagicModuleMetaRepoModel.write(endsectionv18, "");
        this.write = endsectionv18;
        fromCursor<DvbDecoder> fromcursor = getLastName.read(0, null, 7);
        this.RemoteActionCompatParcelizer = fromcursor;
        this.read = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final endSectionV18 getWrite() {
        return this.write;
    }

    public final NewNumberOtpResendRequest<DvbDecoder> read() {
        return this.read;
    }

    public final void IconCompatParcelizer(CeaDecoderCeaOutputBuffer p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, CeaDecoderCeaOutputBuffer.AudioAttributesCompatParcelizer.INSTANCE)) {
            throw new RenewEligibleCreator();
        }
        AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow.ui.activities.blocking.BlockingViewModel$AudioAttributesCompatParcelizer$3, reason: invalid class name */
        static final class AnonymousClass3 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ BlockingViewModel IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private Object write;

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
            
                if (r5.IconCompatParcelizer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(new o.DvbDecoder.RemoteActionCompatParcelizer(r6.AudioAttributesCompatParcelizer(), r6.write()), r5) == r0) goto L17;
             */
            @Override // kotlin.getMonthName
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                    int r1 = r5.RemoteActionCompatParcelizer
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L56
                L12:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L1a:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L32
                L1e:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    com.marrow.ui.activities.blocking.BlockingViewModel r6 = r5.IconCompatParcelizer
                    o.endSectionV18 r6 = r6.getWrite()
                    r1 = r5
                    o.SampleVideos r1 = (kotlin.SampleVideos) r1
                    r5.RemoteActionCompatParcelizer = r3
                    java.lang.Object r6 = r6.read(r1)
                    if (r6 == r0) goto L59
                L32:
                    o.removeQueryParameter r6 = (kotlin.removeQueryParameter) r6
                    com.marrow.ui.activities.blocking.BlockingViewModel r1 = r5.IconCompatParcelizer
                    o.fromCursor r1 = com.marrow.ui.activities.blocking.BlockingViewModel.AudioAttributesCompatParcelizer(r1)
                    java.lang.String r3 = r6.AudioAttributesCompatParcelizer()
                    boolean r6 = r6.write()
                    o.DvbDecoder$RemoteActionCompatParcelizer r4 = new o.DvbDecoder$RemoteActionCompatParcelizer
                    r4.<init>(r3, r6)
                    r6 = r5
                    o.SampleVideos r6 = (kotlin.SampleVideos) r6
                    r3 = 0
                    r5.write = r3
                    r5.RemoteActionCompatParcelizer = r2
                    java.lang.Object r5 = r1.RemoteActionCompatParcelizer(r4, r6)
                    if (r5 != r0) goto L56
                    goto L59
                L56:
                    o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                    return r5
                L59:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.blocking.BlockingViewModel.AudioAttributesCompatParcelizer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(BlockingViewModel blockingViewModel, SampleVideos<? super AnonymousClass3> sampleVideos) {
                super(2, sampleVideos);
                this.IconCompatParcelizer = blockingViewModel;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass3(this.IconCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass3) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(setMbbsVerificationYear.write(), new AnonymousClass3(BlockingViewModel.this, null), this) == objIconCompatParcelizer) {
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

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return BlockingViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.CeaDecoderCeaInputBuffer
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return BlockingViewModel.write((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
