package kotlin;

import kotlin.Metadata;
import kotlin._handleOddName;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\fH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0013R\u001a\u0010\u0011\u001a\u00020\u00158\u0017X\u0097D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017"}, d2 = {"Lo/SpliceInsertCommand;", "Lo/_handleOddName$IconCompatParcelizer;", "Lo/getDefaultMergeable;", "Lo/_writeCloseable;", "Lo/SpliceCommand;", "p0", "<init>", "(Lo/SpliceCommand;)V", "Lo/isAbstract;", "", "write", "(Lo/isAbstract;)V", "Lkotlin/Function0;", "Lo/WritableTypeIdInclusion;", "p1", "read", "(Lo/isAbstract;Lo/getCreatedOnDateMs;Lo/SampleVideos;)Ljava/lang/Object;", "RemoteActionCompatParcelizer", "Lo/SpliceCommand;", "()Lo/SpliceCommand;", "IconCompatParcelizer", "", "AudioAttributesCompatParcelizer", "Z", "AudioAttributesImplBaseParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SpliceInsertCommand extends _handleOddName.IconCompatParcelizer implements getDefaultMergeable, _writeCloseable {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private SpliceCommand IconCompatParcelizer;
    private boolean read;

    public SpliceInsertCommand(SpliceCommand spliceCommand) {
        this.IconCompatParcelizer = spliceCommand;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final SpliceCommand getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // o._handleOddName.IconCompatParcelizer
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin._writeCloseable
    public final void write(isAbstract p0) {
        this.read = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion IconCompatParcelizer(SpliceInsertCommand spliceInsertCommand, isAbstract isabstract, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems) {
        WritableTypeIdInclusion writableTypeIdInclusionInvoke;
        if (!spliceInsertCommand.getRatingCompat() || !spliceInsertCommand.read) {
            return null;
        }
        isAbstract isabstractAudioAttributesImplApi21Parcelizer = collectLongDefaults.AudioAttributesImplApi21Parcelizer(spliceInsertCommand);
        if (!isabstract.MediaBrowserCompatItemReceiver()) {
            isabstract = null;
        }
        if (isabstract == null || (writableTypeIdInclusionInvoke = getcreatedondatems.invoke()) == null) {
            return null;
        }
        return SpliceNullCommand.read(isabstractAudioAttributesImplApi21Parcelizer, isabstract, writableTypeIdInclusionInvoke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WritableTypeIdInclusion RemoteActionCompatParcelizer(SpliceInsertCommand spliceInsertCommand, isAbstract isabstract, getCreatedOnDateMs getcreatedondatems) {
        WritableTypeIdInclusion writableTypeIdInclusionIconCompatParcelizer = IconCompatParcelizer(spliceInsertCommand, isabstract, getcreatedondatems);
        if (writableTypeIdInclusionIconCompatParcelizer != null) {
            return spliceInsertCommand.IconCompatParcelizer.read(writableTypeIdInclusionIconCompatParcelizer);
        }
        return null;
    }

    @Override // kotlin.getDefaultMergeable
    public final Object read(final isAbstract isabstract, final getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = College.IconCompatParcelizer(new write(isabstract, getcreatedondatems, new getCreatedOnDateMs() { // from class: o.setAspectRatioListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return SpliceInsertCommand.RemoteActionCompatParcelizer(this.read, isabstract, getcreatedondatems);
            }
        }, null), sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super setPassingYear>, Object> {
        private /* synthetic */ Object AudioAttributesImplApi21Parcelizer;
        final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ isAbstract read;
        final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            getYear.IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesImplApi21Parcelizer;
                C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AnonymousClass2(SpliceInsertCommand.this, this.read, this.IconCompatParcelizer, null), 3);
                return C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new AnonymousClass5(SpliceInsertCommand.this, this.write, null), 3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: o.SpliceInsertCommand$write$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> AudioAttributesCompatParcelizer;
            int RemoteActionCompatParcelizer;
            final /* synthetic */ SpliceInsertCommand read;
            final /* synthetic */ isAbstract write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.RemoteActionCompatParcelizer = 1;
                    if (this.read.getIconCompatParcelizer().write(new AnonymousClass1(this.read, this.write, this.AudioAttributesCompatParcelizer), this) == objIconCompatParcelizer) {
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

            /* JADX INFO: renamed from: o.SpliceInsertCommand$write$2$1, reason: invalid class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final /* synthetic */ class AnonymousClass1 extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<WritableTypeIdInclusion> {
                final /* synthetic */ isAbstract AudioAttributesCompatParcelizer;
                final /* synthetic */ SpliceInsertCommand read;
                final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> write;

                @Override // kotlin.getCreatedOnDateMs
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public final WritableTypeIdInclusion invoke() {
                    return SpliceInsertCommand.IconCompatParcelizer(this.read, this.AudioAttributesCompatParcelizer, this.write);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(SpliceInsertCommand spliceInsertCommand, isAbstract isabstract, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems) {
                    super(0, toMagicModuleMetaRepoModel.IconCompatParcelizer.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                    this.read = spliceInsertCommand;
                    this.AudioAttributesCompatParcelizer = isabstract;
                    this.write = getcreatedondatems;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SpliceInsertCommand spliceInsertCommand, isAbstract isabstract, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.read = spliceInsertCommand;
                this.write = isabstract;
                this.AudioAttributesCompatParcelizer = getcreatedondatems;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass2(this.read, this.write, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: o.SpliceInsertCommand$write$5, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass5 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            int IconCompatParcelizer;
            final /* synthetic */ getCreatedOnDateMs<WritableTypeIdInclusion> read;
            final /* synthetic */ SpliceInsertCommand write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    this.IconCompatParcelizer = 1;
                    if (ConstructorDetector.read(this.write, this.read, this) == objIconCompatParcelizer) {
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
            AnonymousClass5(SpliceInsertCommand spliceInsertCommand, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, SampleVideos<? super AnonymousClass5> sampleVideos) {
                super(2, sampleVideos);
                this.write = spliceInsertCommand;
                this.read = getcreatedondatems;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass5(this.write, this.read, sampleVideos);
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass5) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(isAbstract isabstract, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems, getCreatedOnDateMs<WritableTypeIdInclusion> getcreatedondatems2, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.read = isabstract;
            this.IconCompatParcelizer = getcreatedondatems;
            this.write = getcreatedondatems2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            write writeVar = SpliceInsertCommand.this.new write(this.read, this.IconCompatParcelizer, this.write, sampleVideos);
            writeVar.AudioAttributesImplApi21Parcelizer = obj;
            return writeVar;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super setPassingYear> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }
}
