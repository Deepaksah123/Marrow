package kotlin;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.component22;
import kotlin.getEditionUpdatePopup;

/* JADX INFO: loaded from: classes4.dex */
public final class component24 {
    private static Object write(component22.AudioAttributesCompatParcelizer<?, ?> audioAttributesCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        return audioAttributesCompatParcelizer.read().onCustomAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getDefaultBottomTab<?> RemoteActionCompatParcelizer(o.component22.AudioAttributesCompatParcelizer<?, ?> r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.component24.RemoteActionCompatParcelizer(o.component22$AudioAttributesCompatParcelizer, boolean):o.getDefaultBottomTab");
    }

    private static final boolean AudioAttributesCompatParcelizer(component22.AudioAttributesCompatParcelizer<?, ?> audioAttributesCompatParcelizer) {
        return audioAttributesCompatParcelizer.read().RatingCompat().RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(getCourseStrings.read());
    }

    private static final boolean RemoteActionCompatParcelizer(component22.AudioAttributesCompatParcelizer<?, ?> audioAttributesCompatParcelizer) {
        return !setPlanAddOns.write(audioAttributesCompatParcelizer.read().RatingCompat().onPrepareFromMediaId());
    }

    private static final getEditionUpdatePopup<Field> write(component22.AudioAttributesCompatParcelizer<?, ?> audioAttributesCompatParcelizer, boolean z, Field field) {
        if (read(audioAttributesCompatParcelizer.read().RatingCompat()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                return audioAttributesCompatParcelizer.MediaDescriptionCompat() ? new getEditionUpdatePopup.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(field, write(audioAttributesCompatParcelizer)) : new getEditionUpdatePopup.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(field);
            }
            return audioAttributesCompatParcelizer.MediaDescriptionCompat() ? new getEditionUpdatePopup.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(field, RemoteActionCompatParcelizer(audioAttributesCompatParcelizer), write(audioAttributesCompatParcelizer)) : new getEditionUpdatePopup.AudioAttributesImplBaseParcelizer.write(field, RemoteActionCompatParcelizer(audioAttributesCompatParcelizer));
        }
        if (AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer)) {
            if (z) {
                return audioAttributesCompatParcelizer.MediaDescriptionCompat() ? new getEditionUpdatePopup.MediaBrowserCompatItemReceiver.IconCompatParcelizer(field) : new getEditionUpdatePopup.MediaBrowserCompatItemReceiver.write(field);
            }
            return audioAttributesCompatParcelizer.MediaDescriptionCompat() ? new getEditionUpdatePopup.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(field, RemoteActionCompatParcelizer(audioAttributesCompatParcelizer)) : new getEditionUpdatePopup.AudioAttributesImplBaseParcelizer.read(field, RemoteActionCompatParcelizer(audioAttributesCompatParcelizer));
        }
        if (z) {
            return new getEditionUpdatePopup.MediaBrowserCompatItemReceiver.read(field);
        }
        return new getEditionUpdatePopup.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(field, RemoteActionCompatParcelizer(audioAttributesCompatParcelizer));
    }

    private static final boolean read(CourseConfigV2SettingsItems courseConfigV2SettingsItems) {
        getVariant getvariantAudioAttributesImplApi21Parcelizer = courseConfigV2SettingsItems.onPlayFromMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getvariantAudioAttributesImplApi21Parcelizer, "");
        if (!getAnswerDescription.AudioAttributesImplApi21Parcelizer(getvariantAudioAttributesImplApi21Parcelizer)) {
            return false;
        }
        getVariant getvariantAudioAttributesImplApi21Parcelizer2 = getvariantAudioAttributesImplApi21Parcelizer.onPlayFromMediaId();
        if (getAnswerDescription.MediaMetadataCompat(getvariantAudioAttributesImplApi21Parcelizer2) || getAnswerDescription.AudioAttributesImplBaseParcelizer(getvariantAudioAttributesImplApi21Parcelizer2)) {
            return (courseConfigV2SettingsItems instanceof SchemaItemCreator) && getCompletedARQBankCount.IconCompatParcelizer(((SchemaItemCreator) courseConfigV2SettingsItems).onSetRepeatMode());
        }
        return true;
    }
}
