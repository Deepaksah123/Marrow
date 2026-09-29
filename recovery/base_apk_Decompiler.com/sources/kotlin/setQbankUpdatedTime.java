package kotlin;

import kotlin.getQbankUpdatedTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setQbankUpdatedTime implements getQbankUpdatedTime {
    private final String AudioAttributesCompatParcelizer;
    private final getAnswerMap<getTestTabItems, getLink> read;
    private final String write;

    /* JADX WARN: Multi-variable type inference failed */
    private setQbankUpdatedTime(String str, getAnswerMap<? super getTestTabItems, ? extends getLink> getanswermap) {
        this.write = str;
        this.read = getanswermap;
        this.AudioAttributesCompatParcelizer = "must return ".concat(String.valueOf(str));
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return getQbankUpdatedTime.AudioAttributesCompatParcelizer.write(this, courseConfigV2NavDrawerItemRateUs);
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public static final class write extends setQbankUpdatedTime {
        public static final write IconCompatParcelizer = new write();

        /* JADX INFO: renamed from: o.setQbankUpdatedTime$write$5, reason: invalid class name */
        static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<getTestTabItems, getLink> {
            public static final AnonymousClass5 read = new AnonymousClass5();

            private static getLink AudioAttributesCompatParcelizer(getTestTabItems gettesttabitems) {
                toMagicModuleMetaRepoModel.write(gettesttabitems, "");
                getHref gethrefRemoteActionCompatParcelizer = gettesttabitems.RemoteActionCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefRemoteActionCompatParcelizer, "");
                return gethrefRemoteActionCompatParcelizer;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getLink invoke(getTestTabItems gettesttabitems) {
                return AudioAttributesCompatParcelizer(gettesttabitems);
            }

            AnonymousClass5() {
                super(1);
            }
        }

        private write() {
            super("Boolean", AnonymousClass5.read, (byte) 0);
        }
    }

    @Override // kotlin.getQbankUpdatedTime
    public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(courseConfigV2NavDrawerItemRateUs.AudioAttributesImplBaseParcelizer(), this.read.invoke(setLocked.AudioAttributesCompatParcelizer((getVariant) courseConfigV2NavDrawerItemRateUs)));
    }

    public static final class AudioAttributesCompatParcelizer extends setQbankUpdatedTime {
        public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer();

        /* JADX INFO: renamed from: o.setQbankUpdatedTime$AudioAttributesCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<getTestTabItems, getLink> {
            public static final AnonymousClass1 RemoteActionCompatParcelizer = new AnonymousClass1();

            private static getLink RemoteActionCompatParcelizer(getTestTabItems gettesttabitems) {
                toMagicModuleMetaRepoModel.write(gettesttabitems, "");
                getHref gethrefOnCustomAction = gettesttabitems.onCustomAction();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnCustomAction, "");
                return gethrefOnCustomAction;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getLink invoke(getTestTabItems gettesttabitems) {
                return RemoteActionCompatParcelizer(gettesttabitems);
            }

            AnonymousClass1() {
                super(1);
            }
        }

        private AudioAttributesCompatParcelizer() {
            super("Int", AnonymousClass1.RemoteActionCompatParcelizer, (byte) 0);
        }
    }

    public /* synthetic */ setQbankUpdatedTime(String str, getAnswerMap getanswermap, byte b) {
        this(str, getanswermap);
    }

    public static final class IconCompatParcelizer extends setQbankUpdatedTime {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        /* JADX INFO: renamed from: o.setQbankUpdatedTime$IconCompatParcelizer$5, reason: invalid class name */
        static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<getTestTabItems, getLink> {
            public static final AnonymousClass5 AudioAttributesCompatParcelizer = new AnonymousClass5();

            private static getLink RemoteActionCompatParcelizer(getTestTabItems gettesttabitems) {
                toMagicModuleMetaRepoModel.write(gettesttabitems, "");
                getHref gethrefOnPrepare = gettesttabitems.onPrepare();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(gethrefOnPrepare, "");
                return gethrefOnPrepare;
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getLink invoke(getTestTabItems gettesttabitems) {
                return RemoteActionCompatParcelizer(gettesttabitems);
            }

            AnonymousClass5() {
                super(1);
            }
        }

        private IconCompatParcelizer() {
            super("Unit", AnonymousClass5.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
