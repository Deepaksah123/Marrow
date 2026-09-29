package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class isActiveLessonPaid extends getAnswerPointer {
    private final getLink write;

    /* JADX INFO: renamed from: o.isActiveLessonPaid$4, reason: invalid class name */
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<getTopSection, getLink> {
        private /* synthetic */ getLink read;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public getLink invoke(getTopSection gettopsection) {
            toMagicModuleMetaRepoModel.write(gettopsection, "");
            return this.read;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(getLink getlink) {
            super(1);
            this.read = getlink;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isActiveLessonPaid(List<? extends getMagicLine<?>> list, getLink getlink) {
        super(list, new AnonymousClass4(getlink));
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(getlink, "");
        this.write = getlink;
    }

    public final getLink IconCompatParcelizer() {
        return this.write;
    }
}
