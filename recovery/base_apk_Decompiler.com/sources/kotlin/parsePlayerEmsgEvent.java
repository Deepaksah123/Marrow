package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0004*\u00020\u00012\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/parsePlayerEmsgEvent;", "", "<init>", "()V", "T", "Lkotlin/Function1;", "Lo/SampleVideos;", "p0", "Lo/LessonDynamicResponseBody;", "read", "(Lo/getAnswerMap;)Lo/LessonDynamicResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class parsePlayerEmsgEvent {
    public static final parsePlayerEmsgEvent INSTANCE = new parsePlayerEmsgEvent();

    private parsePlayerEmsgEvent() {
    }

    @getMagicModuleMeta
    public static final <T> LessonDynamicResponseBody<T> read(final getAnswerMap<? super SampleVideos<? super T>, ? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        LessonDynamicResponseBody<T> lessonDynamicResponseBody = LessonDynamicResponseBody.read(new LessonResetResponseBody() { // from class: o.parseAndDiscardSamples
            @Override // kotlin.LessonResetResponseBody
            public final void AudioAttributesCompatParcelizer(setUpdates setupdates) {
                parsePlayerEmsgEvent.AudioAttributesCompatParcelizer(p0, setupdates);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBody, "");
        return lessonDynamicResponseBody;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    static final class write<T> extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super T>, Object> {
        private /* synthetic */ getAnswerMap<SampleVideos<? super T>, Object> RemoteActionCompatParcelizer;
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                return obj;
            }
            SdkPayloadData.IconCompatParcelizer(obj);
            getAnswerMap<SampleVideos<? super T>, Object> getanswermap = this.RemoteActionCompatParcelizer;
            this.write = 1;
            Object objInvoke = getanswermap.invoke(this);
            return objInvoke == objIconCompatParcelizer ? objIconCompatParcelizer : objInvoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        write(getAnswerMap<? super SampleVideos<? super T>, ? extends Object> getanswermap, SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getanswermap;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new write(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super T> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesCompatParcelizer(getAnswerMap getanswermap, setUpdates setupdates) {
        toMagicModuleMetaRepoModel.write(setupdates, "");
        try {
            Object objAudioAttributesCompatParcelizer = setModifiedEndTimestampMs.AudioAttributesCompatParcelizer(VideoSessionResponseBody.RemoteActionCompatParcelizer, new write(getanswermap, null));
            if (setupdates.write()) {
                return;
            }
            setupdates.IconCompatParcelizer(objAudioAttributesCompatParcelizer);
        } catch (Throwable th) {
            if (setupdates.write()) {
                return;
            }
            setupdates.AudioAttributesCompatParcelizer(th);
        }
    }
}
