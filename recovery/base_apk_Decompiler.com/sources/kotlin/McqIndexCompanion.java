package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class McqIndexCompanion extends setOption8AnsweredCount {
    private final PageValue<setTags> IconCompatParcelizer;

    /* JADX WARN: Illegal instructions before constructor call */
    private /* synthetic */ McqIndexCompanion(getCreatedOnDateMs getcreatedondatems, byte b) {
        getMini getmini = getSchemaCompletion.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getmini, "");
        this(getmini, (getCreatedOnDateMs<? extends setTags>) getcreatedondatems);
    }

    public McqIndexCompanion(getMini getmini, getCreatedOnDateMs<? extends setTags> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getmini, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.IconCompatParcelizer = getmini.read(new read(getcreatedondatems));
    }

    static final class read extends MagicModuleUseCase implements getCreatedOnDateMs<setTags> {
        private /* synthetic */ getCreatedOnDateMs<setTags> read;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public setTags invoke() {
            setTags settagsInvoke = this.read.invoke();
            return settagsInvoke instanceof setOption8AnsweredCount ? ((setOption8AnsweredCount) settagsInvoke).IconCompatParcelizer() : settagsInvoke;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(getCreatedOnDateMs<? extends setTags> getcreatedondatems) {
            super(0);
            this.read = getcreatedondatems;
        }
    }

    @Override // kotlin.setOption8AnsweredCount
    protected final setTags write() {
        return this.IconCompatParcelizer.invoke();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public McqIndexCompanion(getCreatedOnDateMs<? extends setTags> getcreatedondatems) {
        this((getCreatedOnDateMs) getcreatedondatems, (byte) 0);
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
    }
}
