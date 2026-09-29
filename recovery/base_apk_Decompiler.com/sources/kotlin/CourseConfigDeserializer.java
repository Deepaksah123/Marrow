package kotlin;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.ContentResetResponseLesson;
import kotlin.HomeLessonIndexV2;
import kotlin.Metadata;
import kotlin.getSchemaTitle;
import kotlin.setActiveRecallQbankId;
import kotlin.toHomeLessonIndex;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e"}, d2 = {"Lo/CourseConfigDeserializer;", "", "<init>", "()V", "", "IconCompatParcelizer", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "read", "Lo/CourseConfigDeserializer$RemoteActionCompatParcelizer;", "Lo/CourseConfigDeserializer$AudioAttributesCompatParcelizer;", "Lo/CourseConfigDeserializer$write;", "Lo/CourseConfigDeserializer$read;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CourseConfigDeserializer {
    public abstract String IconCompatParcelizer();

    private CourseConfigDeserializer() {
    }

    public /* synthetic */ CourseConfigDeserializer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class write extends CourseConfigDeserializer {
        private final CourseConfigV2SettingsItems AudioAttributesCompatParcelizer;
        private final setTagActive AudioAttributesImplBaseParcelizer;
        private final toHomeLessonIndex.AudioAttributesCompatParcelizer IconCompatParcelizer;
        private final setRatingCount RemoteActionCompatParcelizer;
        private final setActiveRecallQbankId.MediaBrowserCompatMediaItem read;
        private final String write;

        public final CourseConfigV2SettingsItems RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final setActiveRecallQbankId.MediaBrowserCompatMediaItem AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final toHomeLessonIndex.AudioAttributesCompatParcelizer write() {
            return this.IconCompatParcelizer;
        }

        public final setRatingCount read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final setTagActive AudioAttributesImplBaseParcelizer() {
            return this.AudioAttributesImplBaseParcelizer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(CourseConfigV2SettingsItems courseConfigV2SettingsItems, setActiveRecallQbankId.MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem, toHomeLessonIndex.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, setRatingCount setratingcount, setTagActive settagactive) {
            String string;
            super(null);
            toMagicModuleMetaRepoModel.write(courseConfigV2SettingsItems, "");
            toMagicModuleMetaRepoModel.write(mediaBrowserCompatMediaItem, "");
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(setratingcount, "");
            toMagicModuleMetaRepoModel.write(settagactive, "");
            this.AudioAttributesCompatParcelizer = courseConfigV2SettingsItems;
            this.read = mediaBrowserCompatMediaItem;
            this.IconCompatParcelizer = audioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = setratingcount;
            this.AudioAttributesImplBaseParcelizer = settagactive;
            if (audioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
                StringBuilder sb = new StringBuilder();
                sb.append(setratingcount.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer().IconCompatParcelizer()));
                sb.append(setratingcount.AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer()));
                string = sb.toString();
            } else {
                getCompletedARQBankCount getcompletedarqbankcount = getCompletedARQBankCount.IconCompatParcelizer;
                getSchemaTitle.write writeVarIconCompatParcelizer = getCompletedARQBankCount.IconCompatParcelizer(mediaBrowserCompatMediaItem, setratingcount, settagactive, true);
                if (writeVarIconCompatParcelizer != null) {
                    String strRemoteActionCompatParcelizer = writeVarIconCompatParcelizer.RemoteActionCompatParcelizer();
                    String str = writeVarIconCompatParcelizer.read();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(VideoInfoMini.write(strRemoteActionCompatParcelizer));
                    sb2.append(MediaBrowserCompatItemReceiver());
                    sb2.append("()");
                    sb2.append(str);
                    string = sb2.toString();
                } else {
                    throw new component28("No field signature for property: ".concat(String.valueOf(courseConfigV2SettingsItems)));
                }
            }
            this.write = string;
        }

        private final String MediaBrowserCompatItemReceiver() {
            String strAudioAttributesCompatParcelizer;
            getVariant getvariantAudioAttributesImplApi21Parcelizer = this.AudioAttributesCompatParcelizer.onPlayFromMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.onCustomAction(), CourseConfigV2NavDrawerItemFaq.IconCompatParcelizer) && (getvariantAudioAttributesImplApi21Parcelizer instanceof SchemaItem)) {
                setActiveRecallQbankId.RemoteActionCompatParcelizer remoteActionCompatParcelizerOnRewind = ((SchemaItem) getvariantAudioAttributesImplApi21Parcelizer).onRewind();
                HomeLessonIndexV2.IconCompatParcelizer<setActiveRecallQbankId.RemoteActionCompatParcelizer, Integer> iconCompatParcelizer = toHomeLessonIndex.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCompatParcelizer, "");
                Integer num = (Integer) setTagLabel.read(remoteActionCompatParcelizerOnRewind, iconCompatParcelizer);
                if (num == null || (strAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(num.intValue())) == null) {
                    strAudioAttributesCompatParcelizer = "main";
                }
                StringBuilder sb = new StringBuilder("$");
                sb.append(getReadTime.IconCompatParcelizer(strAudioAttributesCompatParcelizer));
                return sb.toString();
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer.onCustomAction(), CourseConfigV2NavDrawerItemFaq.AudioAttributesImplBaseParcelizer) && (getvariantAudioAttributesImplApi21Parcelizer instanceof getShouldShowEmptyPlanScreen)) {
                CourseConfigV2SettingsItems courseConfigV2SettingsItems = this.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.read(courseConfigV2SettingsItems, "");
                setQuestions setquestionsOnSetRating = ((SchemaItemCreator) courseConfigV2SettingsItems).onSetRating();
                if (setquestionsOnSetRating instanceof getIntro) {
                    getIntro getintro = (getIntro) setquestionsOnSetRating;
                    if (getintro.RemoteActionCompatParcelizer() != null) {
                        StringBuilder sb2 = new StringBuilder("$");
                        sb2.append(getintro.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer());
                        return sb2.toString();
                    }
                }
            }
            return "";
        }

        @Override // kotlin.CourseConfigDeserializer
        public final String IconCompatParcelizer() {
            return this.write;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends CourseConfigDeserializer {
        private final Method IconCompatParcelizer;
        private final Method RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AudioAttributesCompatParcelizer(Method method, Method method2) {
            super(null);
            toMagicModuleMetaRepoModel.write(method, "");
            this.RemoteActionCompatParcelizer = method;
            this.IconCompatParcelizer = method2;
        }

        public final Method AudioAttributesCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final Method RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.CourseConfigDeserializer
        public final String IconCompatParcelizer() {
            return getAnnouncementBanners.write(this.RemoteActionCompatParcelizer);
        }
    }

    public static final class RemoteActionCompatParcelizer extends CourseConfigDeserializer {
        private final Field write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Field field) {
            super(null);
            toMagicModuleMetaRepoModel.write(field, "");
            this.write = field;
        }

        public final Field RemoteActionCompatParcelizer() {
            return this.write;
        }

        @Override // kotlin.CourseConfigDeserializer
        public final String IconCompatParcelizer() {
            StringBuilder sb = new StringBuilder();
            String name = this.write.getName();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
            sb.append(VideoInfoMini.write(name));
            sb.append("()");
            Class<?> type = this.write.getType();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
            sb.append(getFinalImageUrl.IconCompatParcelizer(type));
            return sb.toString();
        }
    }

    public static final class read extends CourseConfigDeserializer {
        private final ContentResetResponseLesson.IconCompatParcelizer RemoteActionCompatParcelizer;
        private final ContentResetResponseLesson.IconCompatParcelizer write;

        public final ContentResetResponseLesson.IconCompatParcelizer RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        public final ContentResetResponseLesson.IconCompatParcelizer AudioAttributesCompatParcelizer() {
            return this.write;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(ContentResetResponseLesson.IconCompatParcelizer iconCompatParcelizer, ContentResetResponseLesson.IconCompatParcelizer iconCompatParcelizer2) {
            super(null);
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            this.write = iconCompatParcelizer2;
        }

        @Override // kotlin.CourseConfigDeserializer
        public final String IconCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }
}
