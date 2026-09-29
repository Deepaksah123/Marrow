package com.marrow2.ui.dialogs.new_edition;

import com.marrow.R;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel;
import kotlin.CmcdHeadersFactoryCmcdObjectBuilder;
import kotlin.HashAccumulator;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.NewNumberOtpResendRequest;
import kotlin.POJOPropertyBuilder5;
import kotlin.POJOPropertyBuilderWithMember;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SignInConfiguration;
import kotlin.TopUserCompanion;
import kotlin.TypeResolutionContextBasic;
import kotlin.VerifyNewNumberRequest;
import kotlin.addObject;
import kotlin.fromCursor;
import kotlin.getAnswerMap;
import kotlin.getLastName;
import kotlin.getMagicModuleStats;
import kotlin.getMinApkVersion;
import kotlin.getPytMcqIds;
import kotlin.getShowPopup;
import kotlin.getTotalMcq;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.setLogger;
import kotlin.setSdkPayload;
import kotlin.setUpdatedStatus;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\b\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001dR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u000f\u0010 R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0018\u0010%\u001a\u00020#*\u00020\r8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010$"}, d2 = {"Lcom/marrow2/ui/dialogs/new_edition/NewEditionDialogViewModel;", "Lo/POJOPropertyBuilderWithMember;", "Lo/POJOPropertyBuilder5;", "p0", "<init>", "(Lo/POJOPropertyBuilder5;)V", "Lo/addObject;", "", "AudioAttributesCompatParcelizer", "(Lo/addObject;)V", "", "write", "(Z)V", "Lo/setLogger$write;", "Lo/HashAccumulator;", "IconCompatParcelizer", "(Lo/setLogger$write;)Lo/HashAccumulator;", "Lo/POJOPropertyBuilder5;", "read", "Lo/HashAccumulator;", "()Lo/HashAccumulator;", "RemoteActionCompatParcelizer", "Lo/setUpdatedStatus;", "Lo/getMinApkVersion;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/setUpdatedStatus;", "()Lo/setUpdatedStatus;", "Lo/fromCursor;", "Lo/SignInConfiguration;", "Lo/fromCursor;", "Lo/NewNumberOtpResendRequest;", "Lo/NewNumberOtpResendRequest;", "()Lo/NewNumberOtpResendRequest;", "Z", "AudioAttributesImplApi21Parcelizer", "", "(Lo/setLogger$write;)I", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewEditionDialogViewModel extends POJOPropertyBuilderWithMember {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final HashAccumulator RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final NewNumberOtpResendRequest<SignInConfiguration> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final setUpdatedStatus<getMinApkVersion> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final fromCursor<SignInConfiguration> IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final POJOPropertyBuilder5 read;

    public static final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[setLogger.write.values().length];
            try {
                iArr[setLogger.write.read.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[setLogger.write.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[setLogger.write.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[setLogger.write.IconCompatParcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            write = iArr;
        }
    }

    @setSdkPayload
    public NewEditionDialogViewModel(POJOPropertyBuilder5 pOJOPropertyBuilder5) {
        toMagicModuleMetaRepoModel.write(pOJOPropertyBuilder5, "");
        this.read = pOJOPropertyBuilder5;
        String str = (String) pOJOPropertyBuilder5.write(CourseConfigKeyConstantsKt.KEY_EDITION_UPDATE_POPUP_VARIANT);
        this.RemoteActionCompatParcelizer = IconCompatParcelizer(setLogger.write.valueOf(str != null ? str : ""));
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(pOJOPropertyBuilder5.write("isSwitching", Boolean.FALSE));
        TopUserCompanion topUserCompanionWrite = TypeResolutionContextBasic.write(this);
        getPytMcqIds.Companion companion = getPytMcqIds.INSTANCE;
        this.write = VerifyNewNumberRequest.IconCompatParcelizer(remoteActionCompatParcelizer, topUserCompanionWrite, getPytMcqIds.Companion.write(0L, Long.MAX_VALUE), getMinApkVersion.write.INSTANCE);
        fromCursor<SignInConfiguration> fromcursor = getLastName.read(0, null, 7);
        this.IconCompatParcelizer = fromcursor;
        this.AudioAttributesCompatParcelizer = VerifyNewNumberRequest.AudioAttributesCompatParcelizer(fromcursor);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final HashAccumulator getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public static final class RemoteActionCompatParcelizer implements NewNumberOtpResendRequest<getMinApkVersion> {
        private /* synthetic */ NewNumberOtpResendRequest IconCompatParcelizer;

        /* JADX INFO: renamed from: com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel$RemoteActionCompatParcelizer$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements getValidationToken {
            private /* synthetic */ getValidationToken write;

            /* JADX INFO: renamed from: com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel$RemoteActionCompatParcelizer$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00061 extends getTotalMcq {
                Object AudioAttributesCompatParcelizer;
                int AudioAttributesImplApi21Parcelizer;
                /* synthetic */ Object AudioAttributesImplBaseParcelizer;
                Object IconCompatParcelizer;
                int RemoteActionCompatParcelizer;
                Object read;
                Object write;

                public C00061(SampleVideos sampleVideos) {
                    super(sampleVideos);
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.AudioAttributesImplBaseParcelizer = obj;
                    this.AudioAttributesImplApi21Parcelizer |= Integer.MIN_VALUE;
                    return AnonymousClass1.this.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(java.lang.Object r5, kotlin.SampleVideos r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.RemoteActionCompatParcelizer.AnonymousClass1.C00061
                    if (r0 == 0) goto L14
                    r0 = r6
                    com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel$RemoteActionCompatParcelizer$1$1 r0 = (com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.RemoteActionCompatParcelizer.AnonymousClass1.C00061) r0
                    int r1 = r0.AudioAttributesImplApi21Parcelizer
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r6 = r0.AudioAttributesImplApi21Parcelizer
                    int r6 = r6 + r2
                    r0.AudioAttributesImplApi21Parcelizer = r6
                    goto L19
                L14:
                    com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel$RemoteActionCompatParcelizer$1$1 r0 = new com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel$RemoteActionCompatParcelizer$1$1
                    r0.<init>(r6)
                L19:
                    java.lang.Object r6 = r0.AudioAttributesImplBaseParcelizer
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.AudioAttributesImplApi21Parcelizer
                    r3 = 1
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    int r4 = r0.RemoteActionCompatParcelizer
                    java.lang.Object r4 = r0.AudioAttributesCompatParcelizer
                    java.lang.Object r4 = r0.write
                    java.lang.Object r4 = r0.read
                    java.lang.Object r4 = r0.IconCompatParcelizer
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    goto L68
                L34:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L3c:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                    o.getValidationToken r4 = r4.write
                    r6 = r0
                    o.SampleVideos r6 = (kotlin.SampleVideos) r6
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L4f
                    o.getMinApkVersion$AudioAttributesCompatParcelizer r5 = o.getMinApkVersion.AudioAttributesCompatParcelizer.INSTANCE
                    goto L51
                L4f:
                    o.getMinApkVersion$write r5 = o.getMinApkVersion.write.INSTANCE
                L51:
                    o.getMinApkVersion r5 = (kotlin.getMinApkVersion) r5
                    r6 = 0
                    r0.IconCompatParcelizer = r6
                    r0.read = r6
                    r0.write = r6
                    r0.AudioAttributesCompatParcelizer = r6
                    r6 = 0
                    r0.RemoteActionCompatParcelizer = r6
                    r0.AudioAttributesImplApi21Parcelizer = r3
                    java.lang.Object r4 = r4.IconCompatParcelizer(r5, r0)
                    if (r4 != r1) goto L68
                    return r1
                L68:
                    o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.RemoteActionCompatParcelizer.AnonymousClass1.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
            }

            public AnonymousClass1(getValidationToken getvalidationtoken) {
                this.write = getvalidationtoken;
            }
        }

        public RemoteActionCompatParcelizer(NewNumberOtpResendRequest newNumberOtpResendRequest) {
            this.IconCompatParcelizer = newNumberOtpResendRequest;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super getMinApkVersion> getvalidationtoken, SampleVideos sampleVideos) {
            Object objWrite = this.IconCompatParcelizer.write(new AnonymousClass1(getvalidationtoken), sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
    }

    public final setUpdatedStatus<getMinApkVersion> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final NewNumberOtpResendRequest<SignInConfiguration> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(addObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, addObject.IconCompatParcelizer.INSTANCE)) {
            write(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer());
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, addObject.write.INSTANCE)) {
                throw new RenewEligibleCreator();
            }
            write(false);
        }
    }

    private final void write(boolean p0) {
        if (this.AudioAttributesImplApi21Parcelizer || toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read.write("isSwitching"), Boolean.TRUE)) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = true;
        if (p0) {
            this.read.AudioAttributesCompatParcelizer("isSwitching", Boolean.TRUE);
        }
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(TypeResolutionContextBasic.write(this), new IconCompatParcelizer(p0, null), new MagicModuleSubmissionRequestBody() { // from class: o.getStartServiceAction
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return NewEditionDialogViewModel.RemoteActionCompatParcelizer((String) obj2);
            }
        });
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r5.RemoteActionCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer(o.SignInConfiguration.IconCompatParcelizer.INSTANCE, r5) == r0) goto L19;
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
                int r1 = r5.AudioAttributesCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L51
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                goto L39
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r6)
                com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel r6 = com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.this
                o.fromCursor r6 = com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.AudioAttributesCompatParcelizer(r6)
                o.SignInConfiguration$RemoteActionCompatParcelizer r1 = new o.SignInConfiguration$RemoteActionCompatParcelizer
                boolean r4 = r5.IconCompatParcelizer
                r1.<init>(r4)
                r4 = r5
                o.SampleVideos r4 = (kotlin.SampleVideos) r4
                r5.AudioAttributesCompatParcelizer = r3
                java.lang.Object r6 = r6.RemoteActionCompatParcelizer(r1, r4)
                if (r6 == r0) goto L54
            L39:
                boolean r6 = r5.IconCompatParcelizer
                if (r6 != 0) goto L51
                com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel r6 = com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.this
                o.fromCursor r6 = com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.AudioAttributesCompatParcelizer(r6)
                o.SignInConfiguration$IconCompatParcelizer r1 = o.SignInConfiguration.IconCompatParcelizer.INSTANCE
                r3 = r5
                o.SampleVideos r3 = (kotlin.SampleVideos) r3
                r5.AudioAttributesCompatParcelizer = r2
                java.lang.Object r5 = r6.RemoteActionCompatParcelizer(r1, r3)
                if (r5 != r0) goto L51
                goto L54
            L51:
                o.getShowPopup r5 = kotlin.getShowPopup.INSTANCE
                return r5
            L54:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.dialogs.new_edition.NewEditionDialogViewModel.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = z;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return NewEditionDialogViewModel.this.new IconCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return getShowPopup.INSTANCE;
    }

    private static HashAccumulator IconCompatParcelizer(setLogger.write writeVar) {
        int i = AudioAttributesCompatParcelizer.write[writeVar.ordinal()];
        if (i == 1 || i == 2) {
            return new HashAccumulator(R.string.new_edition_e8_title, AudioAttributesCompatParcelizer(writeVar), Integer.valueOf(R.string.new_edition_e8_note), R.string.new_edition_cta_got_it, null, null, writeVar.getIconCompatParcelizer());
        }
        if (i != 3 && i != 4) {
            throw new RenewEligibleCreator();
        }
        return new HashAccumulator(R.string.new_edition_e6_5_title, AudioAttributesCompatParcelizer(writeVar), null, R.string.new_edition_cta_switch, Integer.valueOf(R.string.new_edition_switch_back_note), Integer.valueOf(R.string.new_edition_stay_with_e6_5), writeVar.getIconCompatParcelizer());
    }

    private static int AudioAttributesCompatParcelizer(setLogger.write writeVar) {
        int i = AudioAttributesCompatParcelizer.write[writeVar.ordinal()];
        if (i == 1) {
            return R.array.new_edition_highlights_neetpg;
        }
        if (i == 2) {
            return R.array.new_edition_highlights_fmge;
        }
        if (i == 3) {
            return R.array.new_edition_highlights_neetpg;
        }
        if (i == 4) {
            return R.array.new_edition_highlights_fmge;
        }
        throw new RenewEligibleCreator();
    }
}
