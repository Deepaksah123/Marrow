package com.marrow2.ui.plan.post_purchase.notespurchase;

import com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel;
import kotlin.AttachmentUnsupportedAttachmentException;
import kotlin.AuthenticationExtensionsBuilder;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.readUnsignedLongToLong;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00118\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014"}, d2 = {"Lcom/marrow2/ui/plan/post_purchase/notespurchase/NotesPurchaseThankYouViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/readUnsignedLongToLong;", "p0", "<init>", "(Lo/readUnsignedLongToLong;)V", "Lo/AuthenticationExtensionsBuilder;", "", "IconCompatParcelizer", "(Lo/AuthenticationExtensionsBuilder;)V", "AudioAttributesCompatParcelizer", "()V", "Lo/readUnsignedLongToLong;", "read", "Lo/fromCursor;", "Lo/AttachmentUnsupportedAttachmentException;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "write", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NotesPurchaseThankYouViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final readUnsignedLongToLong read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<AttachmentUnsupportedAttachmentException> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<AttachmentUnsupportedAttachmentException> IconCompatParcelizer;

    @setSdkPayload
    public NotesPurchaseThankYouViewModel(readUnsignedLongToLong readunsignedlongtolong) {
        toMagicModuleMetaRepoModel.write(readunsignedlongtolong, "");
        this.read = readunsignedlongtolong;
        fromCursor<AttachmentUnsupportedAttachmentException> fromcursor = getLastName.read(0, null, 7);
        this.AudioAttributesCompatParcelizer = fromcursor;
        this.IconCompatParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
    }

    public final NewNumberOtpResendRequest<AttachmentUnsupportedAttachmentException> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(AuthenticationExtensionsBuilder p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.AudioAttributesCompatParcelizer.INSTANCE) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.read.INSTANCE) || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.IconCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.getCredProps
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NotesPurchaseThankYouViewModel.MediaBrowserCompatCustomActionResultReceiver((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.MediaBrowserCompatItemReceiver.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new AudioAttributesCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.setCredProps
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NotesPurchaseThankYouViewModel.MediaBrowserCompatItemReceiver((String) obj2);
                }
            });
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.RemoteActionCompatParcelizer.INSTANCE)) {
            CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(null), new MagicModuleSubmissionRequestBody() { // from class: o.AuthenticationExtensionsClientOutputsBuilder
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return NotesPurchaseThankYouViewModel.AudioAttributesImplApi26Parcelizer((String) obj2);
                }
            });
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, AuthenticationExtensionsBuilder.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesCompatParcelizer();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (NotesPurchaseThankYouViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(AttachmentUnsupportedAttachmentException.RemoteActionCompatParcelizer.INSTANCE, this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseThankYouViewModel.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (NotesPurchaseThankYouViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new AttachmentUnsupportedAttachmentException.IconCompatParcelizer("https://www.marrow.com/notes/order-details"), this) == objIconCompatParcelizer) {
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
            return NotesPurchaseThankYouViewModel.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (NotesPurchaseThankYouViewModel.this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new AttachmentUnsupportedAttachmentException.read(null, null), this) == objIconCompatParcelizer) {
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

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseThankYouViewModel.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int read;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        
            if (r5.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(new o.AttachmentUnsupportedAttachmentException.read(r6.read(), r6.RemoteActionCompatParcelizer()), r5) == r0) goto L17;
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
                int r1 = r5.read
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
                com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel r6 = com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel.this
                o.readUnsignedLongToLong r6 = com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel.IconCompatParcelizer(r6)
                r1 = r5
                o.SampleVideos r1 = (kotlin.SampleVideos) r1
                r5.read = r3
                java.lang.Object r6 = r6.write(r1)
                if (r6 == r0) goto L59
            L32:
                o.shouldSkipByte r6 = (kotlin.shouldSkipByte) r6
                com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel r1 = com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel.this
                o.fromCursor r1 = com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel.write(r1)
                java.lang.String r3 = r6.read()
                java.lang.String r6 = r6.RemoteActionCompatParcelizer()
                o.AttachmentUnsupportedAttachmentException$read r4 = new o.AttachmentUnsupportedAttachmentException$read
                r4.<init>(r3, r6)
                r6 = r5
                o.SampleVideos r6 = (kotlin.SampleVideos) r6
                r3 = 0
                r5.IconCompatParcelizer = r3
                r5.read = r2
                java.lang.Object r5 = r1.RemoteActionCompatParcelizer(r4, r6)
                if (r5 != r0) goto L56
                goto L59
            L56:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L59:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.plan.post_purchase.notespurchase.NotesPurchaseThankYouViewModel.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NotesPurchaseThankYouViewModel.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new read(null), new MagicModuleSubmissionRequestBody() { // from class: o.AuthenticationExtensionsClientOutputs
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NotesPurchaseThankYouViewModel.AudioAttributesImplApi21Parcelizer((String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }
}
