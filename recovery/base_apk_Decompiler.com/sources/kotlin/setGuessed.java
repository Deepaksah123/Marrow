package kotlin;

import kotlin.setFirstAnswerIndex;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setGuessed {
    public static final setGuessed AudioAttributesCompatParcelizer;
    public static final setGuessed RemoteActionCompatParcelizer;
    public static final setGuessed read;
    public static final AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(0);

    public abstract String IconCompatParcelizer(dummyEditor dummyeditor, EnumC0173getDisplayname enumC0173getDisplayname);

    public abstract String IconCompatParcelizer(getSlidesCount getslidescount);

    public abstract String RemoteActionCompatParcelizer(getVariant getvariant);

    public abstract String read(String str, String str2, getTestTabItems gettesttabitems);

    public abstract String read(getLink getlink);

    public abstract String read(getRelatedLessonId getrelatedlessonid, boolean z);

    public abstract String write(setDefault setdefault);

    public final setGuessed AudioAttributesCompatParcelizer(getAnswerMap<? super setFirstAnswer, getShowPopup> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        toMagicModuleMetaRepoModel.read(this, "");
        setServerAnswer setserveranswer = ((isStarred) this).read().read();
        getanswermap.invoke(setserveranswer);
        setserveranswer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        return new isStarred(setserveranswer);
    }

    public interface MediaMetadataCompat {
        void IconCompatParcelizer(getMeta getmeta, StringBuilder sb);

        void RemoteActionCompatParcelizer(StringBuilder sb);

        void write(StringBuilder sb);

        void write(getMeta getmeta, int i, int i2, StringBuilder sb);

        public static final class RemoteActionCompatParcelizer implements MediaMetadataCompat {
            public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer();

            private RemoteActionCompatParcelizer() {
            }

            @Override // o.setGuessed.MediaMetadataCompat
            public final void write(StringBuilder sb) {
                toMagicModuleMetaRepoModel.write(sb, "");
                sb.append("(");
            }

            @Override // o.setGuessed.MediaMetadataCompat
            public final void RemoteActionCompatParcelizer(StringBuilder sb) {
                toMagicModuleMetaRepoModel.write(sb, "");
                sb.append(")");
            }

            @Override // o.setGuessed.MediaMetadataCompat
            public final void write(getMeta getmeta, int i, int i2, StringBuilder sb) {
                toMagicModuleMetaRepoModel.write(getmeta, "");
                toMagicModuleMetaRepoModel.write(sb, "");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }

            @Override // o.setGuessed.MediaMetadataCompat
            public final void IconCompatParcelizer(getMeta getmeta, StringBuilder sb) {
                toMagicModuleMetaRepoModel.write(getmeta, "");
                toMagicModuleMetaRepoModel.write(sb, "");
            }
        }
    }

    public static final class AudioAttributesCompatParcelizer {

        public final /* synthetic */ class write {
            public static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[getQuestionSource.values().length];
                try {
                    iArr[getQuestionSource.CLASS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[getQuestionSource.INTERFACE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[getQuestionSource.ENUM_CLASS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[getQuestionSource.OBJECT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[getQuestionSource.ANNOTATION_CLASS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[getQuestionSource.ENUM_ENTRY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                IconCompatParcelizer = iArr;
            }
        }

        private AudioAttributesCompatParcelizer() {
        }

        public static setGuessed IconCompatParcelizer(getAnswerMap<? super setFirstAnswer, getShowPopup> getanswermap) {
            toMagicModuleMetaRepoModel.write(getanswermap, "");
            setServerAnswer setserveranswer = new setServerAnswer();
            getanswermap.invoke(setserveranswer);
            setserveranswer.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return new isStarred(setserveranswer);
        }

        public static String write(getBadge getbadge) {
            toMagicModuleMetaRepoModel.write(getbadge, "");
            if (getbadge instanceof CourseConfigV2VideoProperties) {
                return "typealias";
            }
            if (getbadge instanceof CourseConfigV2CustomModuleQuestionSource) {
                CourseConfigV2CustomModuleQuestionSource courseConfigV2CustomModuleQuestionSource = (CourseConfigV2CustomModuleQuestionSource) getbadge;
                if (courseConfigV2CustomModuleQuestionSource.onAddQueueItem()) {
                    return "companion object";
                }
                switch (write.IconCompatParcelizer[courseConfigV2CustomModuleQuestionSource.AudioAttributesImplBaseParcelizer().ordinal()]) {
                    case 1:
                        return "class";
                    case 2:
                        return "interface";
                    case 3:
                        return "enum class";
                    case 4:
                        return "object";
                    case 5:
                        return "annotation class";
                    case 6:
                        return "enum entry";
                    default:
                        throw new RenewEligibleCreator();
                }
            }
            throw new AssertionError("Unexpected classifier: ".concat(String.valueOf(getbadge)));
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }
    }

    static final class read extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final read read = new read();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            AudioAttributesCompatParcelizer(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void AudioAttributesCompatParcelizer(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.AudioAttributesImplBaseParcelizer(false);
        }

        read() {
            super(1);
        }
    }

    static {
        AudioAttributesCompatParcelizer.IconCompatParcelizer(read.read);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(RemoteActionCompatParcelizer.IconCompatParcelizer);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(write.AudioAttributesCompatParcelizer);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.RemoteActionCompatParcelizer);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(AudioAttributesImplApi26Parcelizer.IconCompatParcelizer);
        read = AudioAttributesCompatParcelizer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer.read);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer);
        AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(RatingCompat.AudioAttributesCompatParcelizer);
        RemoteActionCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(MediaBrowserCompatItemReceiver.write);
        AudioAttributesCompatParcelizer.IconCompatParcelizer(AudioAttributesImplBaseParcelizer.read);
    }

    static final class RemoteActionCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            read(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void read(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.AudioAttributesImplBaseParcelizer(false);
            setfirstanswer.RemoteActionCompatParcelizer(getKycMessage.read());
        }

        RemoteActionCompatParcelizer() {
            super(1);
        }
    }

    static final class write extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final write AudioAttributesCompatParcelizer = new write();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            write(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void write(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.AudioAttributesImplBaseParcelizer(false);
            setfirstanswer.RemoteActionCompatParcelizer(getKycMessage.read());
            setfirstanswer.AudioAttributesImplApi26Parcelizer(true);
        }

        write() {
            super(1);
        }
    }

    static final class IconCompatParcelizer extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            IconCompatParcelizer(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void IconCompatParcelizer(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.RemoteActionCompatParcelizer(getKycMessage.read());
            setfirstanswer.AudioAttributesCompatParcelizer(setFirstAnswerIndex.read.AudioAttributesCompatParcelizer);
            setfirstanswer.IconCompatParcelizer(setRight.ONLY_NON_SYNTHESIZED);
        }

        IconCompatParcelizer() {
            super(1);
        }
    }

    static final class AudioAttributesImplApi26Parcelizer extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final AudioAttributesImplApi26Parcelizer IconCompatParcelizer = new AudioAttributesImplApi26Parcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            RemoteActionCompatParcelizer(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void RemoteActionCompatParcelizer(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.AudioAttributesImplBaseParcelizer(false);
            setfirstanswer.RemoteActionCompatParcelizer(getKycMessage.read());
            setfirstanswer.AudioAttributesCompatParcelizer(setFirstAnswerIndex.read.AudioAttributesCompatParcelizer);
            setfirstanswer.AudioAttributesImplApi21Parcelizer(true);
            setfirstanswer.IconCompatParcelizer(setRight.NONE);
            setfirstanswer.AudioAttributesCompatParcelizer(true);
            setfirstanswer.RemoteActionCompatParcelizer(true);
            setfirstanswer.AudioAttributesImplApi26Parcelizer(true);
            setfirstanswer.read(true);
        }

        AudioAttributesImplApi26Parcelizer() {
            super(1);
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final AudioAttributesImplApi21Parcelizer read = new AudioAttributesImplApi21Parcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            write(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void write(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.RemoteActionCompatParcelizer(isSillyMistake.read);
        }

        AudioAttributesImplApi21Parcelizer() {
            super(1);
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final MediaBrowserCompatCustomActionResultReceiver IconCompatParcelizer = new MediaBrowserCompatCustomActionResultReceiver();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            read(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void read(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.RemoteActionCompatParcelizer(isSillyMistake.RemoteActionCompatParcelizer);
        }

        MediaBrowserCompatCustomActionResultReceiver() {
            super(1);
        }
    }

    static final class RatingCompat extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final RatingCompat AudioAttributesCompatParcelizer = new RatingCompat();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            read(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void read(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.AudioAttributesCompatParcelizer(setFirstAnswerIndex.read.AudioAttributesCompatParcelizer);
            setfirstanswer.IconCompatParcelizer(setRight.ONLY_NON_SYNTHESIZED);
        }

        RatingCompat() {
            super(1);
        }
    }

    static final class MediaBrowserCompatItemReceiver extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final MediaBrowserCompatItemReceiver write = new MediaBrowserCompatItemReceiver();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            write(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void write(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.IconCompatParcelizer(true);
            setfirstanswer.AudioAttributesCompatParcelizer(setFirstAnswerIndex.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
            setfirstanswer.RemoteActionCompatParcelizer(isSillyMistake.RemoteActionCompatParcelizer);
        }

        MediaBrowserCompatItemReceiver() {
            super(1);
        }
    }

    static final class AudioAttributesImplBaseParcelizer extends MagicModuleUseCase implements getAnswerMap<setFirstAnswer, getShowPopup> {
        public static final AudioAttributesImplBaseParcelizer read = new AudioAttributesImplBaseParcelizer();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(setFirstAnswer setfirstanswer) {
            read(setfirstanswer);
            return getShowPopup.INSTANCE;
        }

        private static void read(setFirstAnswer setfirstanswer) {
            toMagicModuleMetaRepoModel.write(setfirstanswer, "");
            setfirstanswer.write(McqAnswerIndexModel.HTML);
            setfirstanswer.RemoteActionCompatParcelizer(isSillyMistake.RemoteActionCompatParcelizer);
        }

        AudioAttributesImplBaseParcelizer() {
            super(1);
        }
    }
}
