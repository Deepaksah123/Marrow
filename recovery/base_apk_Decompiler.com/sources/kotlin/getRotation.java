package kotlin;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ViewPager2SavedState;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JM\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J%\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0003J!\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0012\u0010\u0017JK\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u00192\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\b2\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0014\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010$R\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010#8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&"}, d2 = {"Lo/getRotation;", "Lo/ViewPager2SavedState;", "<init>", "()V", "Lo/hasValueTypeDeserializer;", "p0", "Lo/KeyDeserializers;", "p1", "Lkotlin/Function1;", "", "Lo/findBeanDeserializer;", "", "p2", "Lo/ResolvableDeserializer;", "p3", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/KeyDeserializers;Lo/getAnswerMap;Lo/getAnswerMap;)V", "Lo/WindowAreaComponentApi3Requirements;", "AudioAttributesCompatParcelizer", "(Lo/getAnswerMap;)V", "read", "(Lo/hasValueTypeDeserializer;Lo/hasValueTypeDeserializer;)V", "Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)V", "Lo/SettableBeanProperty;", "Lo/deserializeFromNumber;", "Lo/resetWithShared;", "p4", "p5", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/getAnswerMap;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)V", "write", "Lo/setPassingYear;", "Lo/setPassingYear;", "IconCompatParcelizer", "Lo/WindowAreaComponentApi3Requirements;", "Lo/ThemeState;", "Lo/ThemeState;", "MediaBrowserCompatItemReceiver", "()Lo/ThemeState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getRotation extends ViewPager2SavedState {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private ThemeState<getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private WindowAreaComponentApi3Requirements read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setPassingYear AudioAttributesCompatParcelizer;

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeState<getShowPopup> MediaBrowserCompatItemReceiver() {
        ThemeState<getShowPopup> themeState = this.IconCompatParcelizer;
        if (themeState != null) {
            return themeState;
        }
        if (!getLocalMatrix.write()) {
            return null;
        }
        ThemeState<getShowPopup> themeStateAudioAttributesCompatParcelizer = getThemeState.AudioAttributesCompatParcelizer(1, 0, setAddressLine2.IconCompatParcelizer, 2);
        this.IconCompatParcelizer = themeStateAudioAttributesCompatParcelizer;
        return themeStateAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer(final hasValueTypeDeserializer p0, final KeyDeserializers p1, final getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> p2, final getAnswerMap<? super ResolvableDeserializer, getShowPopup> p3) {
        AudioAttributesCompatParcelizer(new getAnswerMap() { // from class: o.getScaleY
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return getRotation.write(p0, this, p1, p2, p3, (WindowAreaComponentApi3Requirements) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(hasValueTypeDeserializer hasvaluetypedeserializer, getRotation getrotation, KeyDeserializers keyDeserializers, getAnswerMap getanswermap, getAnswerMap getanswermap2, WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements) {
        windowAreaComponentApi3Requirements.AudioAttributesCompatParcelizer(hasvaluetypedeserializer, getrotation.getRead(), keyDeserializers, getanswermap, getanswermap2);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer() {
        AudioAttributesCompatParcelizer((getAnswerMap<? super WindowAreaComponentApi3Requirements, getShowPopup>) null);
    }

    private final void AudioAttributesCompatParcelizer(getAnswerMap<? super WindowAreaComponentApi3Requirements, getShowPopup> p0) {
        ViewPager2SavedState.read readVarIconCompatParcelizer = getRead();
        if (readVarIconCompatParcelizer == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer = readVarIconCompatParcelizer.write(new IconCompatParcelizer(p0, this, readVarIconCompatParcelizer, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(ViewPager2SavedState.read readVar, float[] fArr) {
        isAbstract isabstract = readVar.read();
        if (isabstract != null) {
            if (!isabstract.MediaBrowserCompatItemReceiver()) {
                isabstract = null;
            }
            if (isabstract != null) {
                isabstract.AudioAttributesCompatParcelizer(fArr);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSession;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<JsonTypeIdResolver, SampleVideos<?>, Object> {
        private /* synthetic */ Object AudioAttributesCompatParcelizer;
        final /* synthetic */ getAnswerMap<WindowAreaComponentApi3Requirements, getShowPopup> IconCompatParcelizer;
        int RemoteActionCompatParcelizer;
        final /* synthetic */ getRotation read;
        final /* synthetic */ ViewPager2SavedState.read write;

        /* JADX INFO: renamed from: o.getRotation$IconCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<?>, Object> {
            final /* synthetic */ JsonTypeIdResolver AudioAttributesCompatParcelizer;
            private /* synthetic */ Object AudioAttributesImplApi26Parcelizer;
            int IconCompatParcelizer;
            final /* synthetic */ getRotation RemoteActionCompatParcelizer;
            final /* synthetic */ ViewPager2SavedState.read read;
            final /* synthetic */ getAnswerMap<WindowAreaComponentApi3Requirements, getShowPopup> write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                try {
                    if (i == 0) {
                        SdkPayloadData.IconCompatParcelizer(obj);
                        TopUserCompanion topUserCompanion = (TopUserCompanion) this.AudioAttributesImplApi26Parcelizer;
                        ViewPagerSavedState viewPagerSavedStateInvoke = getWindowAreaDisplayMetrics.read().invoke(this.AudioAttributesCompatParcelizer.IconCompatParcelizer());
                        WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements = new WindowAreaComponentApi3Requirements(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(), new C0104IconCompatParcelizer(this.read), viewPagerSavedStateInvoke);
                        if (getLocalMatrix.write()) {
                            C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, new C01034(this.RemoteActionCompatParcelizer, viewPagerSavedStateInvoke, null), 3);
                        }
                        getAnswerMap<WindowAreaComponentApi3Requirements, getShowPopup> getanswermap = this.write;
                        if (getanswermap != null) {
                            getanswermap.invoke(windowAreaComponentApi3Requirements);
                        }
                        this.RemoteActionCompatParcelizer.read = windowAreaComponentApi3Requirements;
                        this.IconCompatParcelizer = 1;
                        if (this.AudioAttributesCompatParcelizer.read(windowAreaComponentApi3Requirements, this) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        SdkPayloadData.IconCompatParcelizer(obj);
                    }
                    throw new PlanDetailsCreator();
                } catch (Throwable th) {
                    this.RemoteActionCompatParcelizer.read = null;
                    throw th;
                }
            }

            /* JADX INFO: renamed from: o.getRotation$IconCompatParcelizer$4$IconCompatParcelizer, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final /* synthetic */ class C0104IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements getAnswerMap<resetWithShared, getShowPopup> {
                final /* synthetic */ ViewPager2SavedState.read AudioAttributesCompatParcelizer;

                @Override // kotlin.getAnswerMap
                public final /* synthetic */ getShowPopup invoke(resetWithShared resetwithshared) {
                    write(resetwithshared.getIconCompatParcelizer());
                    return getShowPopup.INSTANCE;
                }

                public final void write(float[] fArr) {
                    getRotation.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, fArr);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0104IconCompatParcelizer(ViewPager2SavedState.read readVar) {
                    super(1, toMagicModuleMetaRepoModel.IconCompatParcelizer.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
                    this.AudioAttributesCompatParcelizer = readVar;
                }
            }

            /* JADX INFO: renamed from: o.getRotation$IconCompatParcelizer$4$4, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C01034 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
                final /* synthetic */ getRotation AudioAttributesCompatParcelizer;
                int IconCompatParcelizer;
                final /* synthetic */ ViewPagerSavedState RemoteActionCompatParcelizer;

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
                
                    if (r5.write(new o.getRotation.IconCompatParcelizer.AnonymousClass4.C01034.AnonymousClass1(), r4) == r0) goto L21;
                 */
                @Override // kotlin.getMonthName
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                        int r1 = r4.IconCompatParcelizer
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L1e
                        if (r1 == r3) goto L1a
                        if (r1 == r2) goto L16
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L16:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        goto L4e
                    L1a:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        goto L31
                    L1e:
                        kotlin.SdkPayloadData.IconCompatParcelizer(r5)
                        o.getTranslateY r5 = new o.getTranslateY
                        r5.<init>()
                        r1 = r4
                        o.SampleVideos r1 = (kotlin.SampleVideos) r1
                        r4.IconCompatParcelizer = r3
                        java.lang.Object r5 = kotlin.TokenFilterInclusion.read(r5, r1)
                        if (r5 == r0) goto L57
                    L31:
                        o.getRotation r5 = r4.AudioAttributesCompatParcelizer
                        o.ThemeState r5 = kotlin.getRotation.read(r5)
                        if (r5 == 0) goto L54
                        o.getRotation$IconCompatParcelizer$4$4$1 r1 = new o.getRotation$IconCompatParcelizer$4$4$1
                        o.ViewPagerSavedState r3 = r4.RemoteActionCompatParcelizer
                        r1.<init>()
                        o.getValidationToken r1 = (kotlin.getValidationToken) r1
                        r3 = r4
                        o.SampleVideos r3 = (kotlin.SampleVideos) r3
                        r4.IconCompatParcelizer = r2
                        java.lang.Object r4 = r5.write(r1, r3)
                        if (r4 != r0) goto L4e
                        goto L57
                    L4e:
                        o.PlanDetailsCreator r4 = new o.PlanDetailsCreator
                        r4.<init>()
                        throw r4
                    L54:
                        o.getShowPopup r4 = kotlin.getShowPopup.INSTANCE
                        return r4
                    L57:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o.getRotation.IconCompatParcelizer.AnonymousClass4.C01034.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final getShowPopup read(long j) {
                    return getShowPopup.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01034(getRotation getrotation, ViewPagerSavedState viewPagerSavedState, SampleVideos<? super C01034> sampleVideos) {
                    super(2, sampleVideos);
                    this.AudioAttributesCompatParcelizer = getrotation;
                    this.RemoteActionCompatParcelizer = viewPagerSavedState;
                }

                @Override // kotlin.getMonthName
                public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                    return new C01034(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
                }

                @Override // kotlin.MagicModuleSubmissionRequestBody
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                    return ((C01034) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass4(JsonTypeIdResolver jsonTypeIdResolver, getAnswerMap<? super WindowAreaComponentApi3Requirements, getShowPopup> getanswermap, getRotation getrotation, ViewPager2SavedState.read readVar, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesCompatParcelizer = jsonTypeIdResolver;
                this.write = getanswermap;
                this.RemoteActionCompatParcelizer = getrotation;
                this.read = readVar;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.AudioAttributesCompatParcelizer, this.write, this.RemoteActionCompatParcelizer, this.read, sampleVideos);
                anonymousClass4.AudioAttributesImplApi26Parcelizer = obj;
                return anonymousClass4;
            }

            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<?> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (College.IconCompatParcelizer(new AnonymousClass4((JsonTypeIdResolver) this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read, this.write, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(getAnswerMap<? super WindowAreaComponentApi3Requirements, getShowPopup> getanswermap, getRotation getrotation, ViewPager2SavedState.read readVar, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.IconCompatParcelizer = getanswermap;
            this.read = getrotation;
            this.write = readVar;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, this.read, this.write, sampleVideos);
            iconCompatParcelizer.AudioAttributesCompatParcelizer = obj;
            return iconCompatParcelizer;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JsonTypeIdResolver jsonTypeIdResolver, SampleVideos<?> sampleVideos) {
            return ((IconCompatParcelizer) create(jsonTypeIdResolver, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void read() {
        setPassingYear setpassingyear = this.AudioAttributesCompatParcelizer;
        if (setpassingyear != null) {
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
        }
        this.AudioAttributesCompatParcelizer = null;
        ThemeState<getShowPopup> themeStateMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (themeStateMediaBrowserCompatItemReceiver != null) {
            themeStateMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, hasValueTypeDeserializer p1) {
        WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements = this.read;
        if (windowAreaComponentApi3Requirements != null) {
            windowAreaComponentApi3Requirements.AudioAttributesCompatParcelizer(p0, p1);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void AudioAttributesCompatParcelizer(WritableTypeIdInclusion p0) {
        WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements = this.read;
        if (windowAreaComponentApi3Requirements != null) {
            windowAreaComponentApi3Requirements.RemoteActionCompatParcelizer(p0);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void read(hasValueTypeDeserializer p0, SettableBeanProperty p1, deserializeFromNumber p2, getAnswerMap<? super resetWithShared, getShowPopup> p3, WritableTypeIdInclusion p4, WritableTypeIdInclusion p5) {
        WindowAreaComponentApi3Requirements windowAreaComponentApi3Requirements = this.read;
        if (windowAreaComponentApi3Requirements != null) {
            windowAreaComponentApi3Requirements.RemoteActionCompatParcelizer(p0, p1, p2, p4, p5);
        }
    }

    @Override // kotlin.ViewPager2SavedState
    public final void write() {
        ThemeState<getShowPopup> themeStateMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (themeStateMediaBrowserCompatItemReceiver != null) {
            themeStateMediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(getShowPopup.INSTANCE);
        }
    }
}
