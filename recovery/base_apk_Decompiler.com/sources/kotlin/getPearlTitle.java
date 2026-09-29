package kotlin;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class getPearlTitle {
    public static final Preference IconCompatParcelizer(setGroupDescription setgroupdescription, Preference preference) {
        toMagicModuleMetaRepoModel.write(setgroupdescription, "");
        toMagicModuleMetaRepoModel.write(preference, "");
        return AudioAttributesCompatParcelizer(setgroupdescription, preference, new HashSet());
    }

    private static final Preference AudioAttributesCompatParcelizer(setGroupDescription setgroupdescription, Preference preference, HashSet<isPermanent> hashSet) {
        Preference preferenceAudioAttributesCompatParcelizer;
        isPermanent ispermanentOnCustomAction = setgroupdescription.onCustomAction(preference);
        if (!hashSet.add(ispermanentOnCustomAction)) {
            return null;
        }
        getValueBoolean getvaluebooleanIconCompatParcelizer = setgroupdescription.IconCompatParcelizer(ispermanentOnCustomAction);
        if (getvaluebooleanIconCompatParcelizer != null) {
            Preference preferenceRemoteActionCompatParcelizer = setgroupdescription.RemoteActionCompatParcelizer(getvaluebooleanIconCompatParcelizer);
            Preference preferenceAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(setgroupdescription, preferenceRemoteActionCompatParcelizer, hashSet);
            if (preferenceAudioAttributesCompatParcelizer2 != null) {
                return ((preferenceAudioAttributesCompatParcelizer2 instanceof TaxPercentInfoCompanion) && setgroupdescription.AudioAttributesImplBaseParcelizer((TaxPercentInfoCompanion) preferenceAudioAttributesCompatParcelizer2) && setgroupdescription.RatingCompat(preference) && (setgroupdescription.AudioAttributesImplApi21Parcelizer(setgroupdescription.onCustomAction(preferenceRemoteActionCompatParcelizer)) || ((preferenceRemoteActionCompatParcelizer instanceof TaxPercentInfoCompanion) && setgroupdescription.AudioAttributesImplBaseParcelizer((TaxPercentInfoCompanion) preferenceRemoteActionCompatParcelizer)))) ? setgroupdescription.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(preferenceRemoteActionCompatParcelizer) : (setgroupdescription.RatingCompat(preferenceAudioAttributesCompatParcelizer2) || !setgroupdescription.MediaBrowserCompatMediaItem(preference)) ? preferenceAudioAttributesCompatParcelizer2 : setgroupdescription.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(preferenceAudioAttributesCompatParcelizer2);
            }
            return null;
        }
        if (setgroupdescription.AudioAttributesImplApi21Parcelizer(ispermanentOnCustomAction)) {
            Preference preferenceAudioAttributesImplBaseParcelizer = setgroupdescription.AudioAttributesImplBaseParcelizer(preference);
            if (preferenceAudioAttributesImplBaseParcelizer == null || (preferenceAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(setgroupdescription, preferenceAudioAttributesImplBaseParcelizer, hashSet)) == null) {
                return null;
            }
            if (!setgroupdescription.RatingCompat(preference)) {
                return preferenceAudioAttributesCompatParcelizer;
            }
            if (!setgroupdescription.RatingCompat(preferenceAudioAttributesCompatParcelizer) && (!(preferenceAudioAttributesCompatParcelizer instanceof TaxPercentInfoCompanion) || !setgroupdescription.AudioAttributesImplBaseParcelizer((TaxPercentInfoCompanion) preferenceAudioAttributesCompatParcelizer))) {
                return setgroupdescription.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(preferenceAudioAttributesCompatParcelizer);
            }
        }
        return preference;
    }
}
