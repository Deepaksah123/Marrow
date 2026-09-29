package kotlin;

import com.marrow2.data.test.remote.model.TestStatModel;
import com.marrow2.data.test.remote.model.TestSubjectStatModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class setMaxLines {
    public static final setExpandedTitleTextColor IconCompatParcelizer(getCurrentOrMainLooper getcurrentormainlooper, getCodecCountOfType getcodeccountoftype, boolean z) {
        toMagicModuleMetaRepoModel.write(getcurrentormainlooper, "");
        toMagicModuleMetaRepoModel.write(getcodeccountoftype, "");
        boolean z2 = getcurrentormainlooper.onCommand() && !z;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean z3 = !getcurrentormainlooper.handleMediaPlayPauseIfPendingOnHandler() && getcurrentormainlooper.MediaBrowserCompatItemReceiver() == 1;
        TestStatModel testStatModelAudioAttributesImplApi26Parcelizer = getcodeccountoftype.AudioAttributesImplApi26Parcelizer();
        Boolean boolValueOf = testStatModelAudioAttributesImplApi26Parcelizer != null ? Boolean.valueOf(testStatModelAudioAttributesImplApi26Parcelizer.getScore() > 0) : null;
        long jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = getcurrentormainlooper.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() - getcurrentormainlooper.onCustomAction();
        if (jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver > ((long) getcurrentormainlooper.AudioAttributesCompatParcelizer()) * 1000) {
            jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = ((long) getcurrentormainlooper.AudioAttributesCompatParcelizer()) * 1000;
        }
        long j = jMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (!getcodeccountoftype.RatingCompat().isEmpty() && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "subject", (Object) getcurrentormainlooper.MediaBrowserCompatSearchResultReceiver())) {
            for (TestSubjectStatModel testSubjectStatModel : getcodeccountoftype.RatingCompat()) {
                String str = getcodeccountoftype.read().get(testSubjectStatModel.getSubjectId());
                uncaughtException uncaughtexception = new uncaughtException(0, 0, 0, 0, null, 0, 0, 0, null, null, false, false, 0, null, 16383, null);
                uncaughtexception.RemoteActionCompatParcelizer(testSubjectStatModel.getSubjectId());
                if (str != null) {
                    uncaughtexception.AudioAttributesCompatParcelizer(str);
                }
                uncaughtexception.IconCompatParcelizer(getcurrentormainlooper.RemoteActionCompatParcelizer());
                uncaughtexception.read(testSubjectStatModel.getCorrect());
                uncaughtexception.AudioAttributesCompatParcelizer(testSubjectStatModel.getTotal());
                uncaughtexception.write(getAudioUsageForStreamType.IconCompatParcelizer(getDataUriForString.read(getcurrentormainlooper), testSubjectStatModel.getScore()));
                uncaughtexception.AudioAttributesImplBaseParcelizer(testSubjectStatModel.getPossibleScore());
                uncaughtexception.AudioAttributesImplApi26Parcelizer(testSubjectStatModel.getWrong());
                uncaughtexception.IconCompatParcelizer(testSubjectStatModel.getTotal() - (testSubjectStatModel.getCorrect() + testSubjectStatModel.getWrong()));
                uncaughtexception.RemoteActionCompatParcelizer((int) testSubjectStatModel.getPercentile());
                uncaughtexception.write((testSubjectStatModel.getCorrect() * 100) / testSubjectStatModel.getTotal());
                uncaughtexception.MediaBrowserCompatCustomActionResultReceiver(1);
                arrayList.add(uncaughtexception);
            }
        }
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                ((uncaughtException) arrayList.get(0)).write(false);
                ((uncaughtException) arrayList.get(0)).IconCompatParcelizer(false);
            } else if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "grand", (Object) getcurrentormainlooper.MediaBrowserCompatSearchResultReceiver())) {
                ((uncaughtException) arrayList.get(0)).IconCompatParcelizer(true);
                ((uncaughtException) arrayList.get(arrayList.size() - 1)).write(true);
            } else {
                uncaughtException uncaughtexception2 = new uncaughtException(0, 0, 0, 0, null, 0, 0, 0, null, null, false, false, 0, null, 16383, null);
                uncaughtexception2.MediaBrowserCompatCustomActionResultReceiver(2);
                arrayList2.add(0, arrayList.get(0));
                arrayList2.add(1, uncaughtexception2);
                arrayList2.add(2, arrayList.get(arrayList.size() - 1));
                ((uncaughtException) arrayList2.get(0)).IconCompatParcelizer(((uncaughtException) arrayList2.get(0)).getMediaBrowserCompatItemReceiver() != -1);
                ((uncaughtException) arrayList2.get(2)).write(((uncaughtException) arrayList2.get(2)).getMediaBrowserCompatItemReceiver() != -1);
            }
        }
        if (!z3) {
            getcodeccountoftype.MediaBrowserCompatCustomActionResultReceiver().isEmpty();
        }
        String strRemoteActionCompatParcelizer = getcurrentormainlooper.RemoteActionCompatParcelizer();
        String strMediaMetadataCompat = getcurrentormainlooper.MediaMetadataCompat();
        String strMediaBrowserCompatSearchResultReceiver = getcurrentormainlooper.MediaBrowserCompatSearchResultReceiver();
        boolean zOnPlay = getcurrentormainlooper.onPlay();
        boolean zHandleMediaPlayPauseIfPendingOnHandler = getcurrentormainlooper.handleMediaPlayPauseIfPendingOnHandler();
        int iMediaDescriptionCompat = getcurrentormainlooper.handleMediaPlayPauseIfPendingOnHandler() ? getcurrentormainlooper.MediaDescriptionCompat() : getcurrentormainlooper.AudioAttributesImplApi26Parcelizer();
        int iMediaBrowserCompatItemReceiver = getcurrentormainlooper.MediaBrowserCompatItemReceiver();
        int iWrite = getcurrentormainlooper.write();
        int iOnAddQueueItem = getcurrentormainlooper.onAddQueueItem();
        int iAudioAttributesImplApi21Parcelizer = getcurrentormainlooper.AudioAttributesImplApi21Parcelizer();
        int iWrite2 = getcurrentormainlooper.write();
        int iOnAddQueueItem2 = getcurrentormainlooper.onAddQueueItem();
        int iAudioAttributesImplApi21Parcelizer2 = getcurrentormainlooper.AudioAttributesImplApi21Parcelizer();
        int iAudioAttributesImplBaseParcelizer = getcurrentormainlooper.AudioAttributesImplBaseParcelizer();
        double dMediaBrowserCompatCustomActionResultReceiver = getcurrentormainlooper.MediaBrowserCompatCustomActionResultReceiver();
        double d = getcurrentormainlooper.read();
        long jIconCompatParcelizer = getcurrentormainlooper.IconCompatParcelizer();
        TestStatModel testStatModelAudioAttributesImplApi26Parcelizer2 = getcodeccountoftype.AudioAttributesImplApi26Parcelizer();
        boolean z4 = testStatModelAudioAttributesImplApi26Parcelizer2 != null && testStatModelAudioAttributesImplApi26Parcelizer2.getScore() == 0;
        boolean z5 = getcodeccountoftype.AudioAttributesImplApi26Parcelizer() != null;
        boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
        TestStatModel testStatModelAudioAttributesImplApi26Parcelizer3 = getcodeccountoftype.AudioAttributesImplApi26Parcelizer();
        int total = testStatModelAudioAttributesImplApi26Parcelizer3 != null ? testStatModelAudioAttributesImplApi26Parcelizer3.getTotal() : 0;
        TestStatModel testStatModelAudioAttributesImplApi26Parcelizer4 = getcodeccountoftype.AudioAttributesImplApi26Parcelizer();
        int correct = testStatModelAudioAttributesImplApi26Parcelizer4 != null ? testStatModelAudioAttributesImplApi26Parcelizer4.getCorrect() : 0;
        TestStatModel testStatModelAudioAttributesImplApi26Parcelizer5 = getcodeccountoftype.AudioAttributesImplApi26Parcelizer();
        return new setExpandedTitleTextColor(strRemoteActionCompatParcelizer, strMediaMetadataCompat, strMediaBrowserCompatSearchResultReceiver, zOnPlay, z2, zHandleMediaPlayPauseIfPendingOnHandler, iMediaDescriptionCompat, iMediaBrowserCompatItemReceiver, iWrite, iOnAddQueueItem, iAudioAttributesImplApi21Parcelizer, iWrite2 + iOnAddQueueItem2 + iAudioAttributesImplApi21Parcelizer2, iAudioAttributesImplBaseParcelizer, dMediaBrowserCompatCustomActionResultReceiver, d, jIconCompatParcelizer, z4, z5, zBooleanValue, Integer.valueOf(total), correct, testStatModelAudioAttributesImplApi26Parcelizer5 != null ? testStatModelAudioAttributesImplApi26Parcelizer5.getScore() : 0, getcodeccountoftype.IconCompatParcelizer(), getcodeccountoftype.RemoteActionCompatParcelizer(), getcodeccountoftype.AudioAttributesCompatParcelizer(), ((Integer) getCodecCountOfType.RemoteActionCompatParcelizer(321299342, new Object[]{getcodeccountoftype}, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), -321299342, DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed(), DefaultDrmSessionExternalSyntheticLambda3.onSetPlaybackSpeed())).intValue(), getcodeccountoftype.AudioAttributesImplApi21Parcelizer(), j, getcodeccountoftype.write(), null, z3, null, null, arrayList, arrayList2, getcodeccountoftype.AudioAttributesImplBaseParcelizer(), null, -1610612736, 17, null);
    }

    public static final setExpandedTitleMarginBottom write(setExpandedTitleTextColor setexpandedtitletextcolor) {
        toMagicModuleMetaRepoModel.write(setexpandedtitletextcolor, "");
        setExpandedTitleMarginBottom setexpandedtitlemarginbottom = new setExpandedTitleMarginBottom(false, false, 0, null, 0, 31, null);
        setexpandedtitlemarginbottom.read(setexpandedtitletextcolor.getOnAddQueueItem());
        setexpandedtitlemarginbottom.IconCompatParcelizer(setexpandedtitletextcolor.getOnCustomAction());
        setexpandedtitlemarginbottom.AudioAttributesCompatParcelizer(setexpandedtitletextcolor.getOnMediaButtonEvent());
        setexpandedtitlemarginbottom.AudioAttributesCompatParcelizer(setexpandedtitletextcolor.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        setexpandedtitlemarginbottom.IconCompatParcelizer(setexpandedtitletextcolor.getOnPlayFromMediaId());
        return setexpandedtitlemarginbottom;
    }

    public static final setLineSpacingMultiplier read(setExpandedTitleTextColor setexpandedtitletextcolor) {
        toMagicModuleMetaRepoModel.write(setexpandedtitletextcolor, "");
        setLineSpacingMultiplier setlinespacingmultiplier = new setLineSpacingMultiplier(0L, 0, 0, 0, 15, null);
        setlinespacingmultiplier.IconCompatParcelizer(setexpandedtitletextcolor.getOnPrepare());
        setlinespacingmultiplier.write(setexpandedtitletextcolor.getOnPrepareFromMediaId());
        setlinespacingmultiplier.AudioAttributesCompatParcelizer(setexpandedtitletextcolor.getOnPlayFromSearch());
        setlinespacingmultiplier.IconCompatParcelizer(setexpandedtitletextcolor.getOnPrepareFromSearch());
        return setlinespacingmultiplier;
    }

    public static final setExpandedTitleMargin AudioAttributesCompatParcelizer(setExpandedTitleTextColor setexpandedtitletextcolor) {
        toMagicModuleMetaRepoModel.write(setexpandedtitletextcolor, "");
        setExpandedTitleMargin setexpandedtitlemargin = new setExpandedTitleMargin(0, 0, 0, 0, false, false, false, false, false, false, false, 2047, null);
        setexpandedtitlemargin.write(setexpandedtitletextcolor.getOnPause());
        setexpandedtitlemargin.read(setexpandedtitletextcolor.getOnFastForward());
        setexpandedtitlemargin.IconCompatParcelizer(setexpandedtitletextcolor.getOnPlay());
        setexpandedtitlemargin.RemoteActionCompatParcelizer(setexpandedtitlemargin.getWrite() - (setexpandedtitlemargin.getRead() + setexpandedtitlemargin.getIconCompatParcelizer()));
        setexpandedtitlemargin.read(setexpandedtitlemargin.getRead() > 0);
        setexpandedtitlemargin.MediaBrowserCompatCustomActionResultReceiver(setexpandedtitlemargin.getIconCompatParcelizer() > 0);
        setexpandedtitlemargin.AudioAttributesCompatParcelizer(setexpandedtitlemargin.getAudioAttributesCompatParcelizer() > 0);
        setexpandedtitlemargin.RemoteActionCompatParcelizer(setexpandedtitlemargin.getRemoteActionCompatParcelizer() && setexpandedtitlemargin.getMediaBrowserCompatItemReceiver());
        setexpandedtitlemargin.IconCompatParcelizer(setexpandedtitlemargin.getRemoteActionCompatParcelizer() && setexpandedtitlemargin.getAudioAttributesImplBaseParcelizer());
        setexpandedtitlemargin.AudioAttributesImplApi21Parcelizer(setexpandedtitlemargin.getMediaBrowserCompatItemReceiver() && setexpandedtitlemargin.getAudioAttributesImplBaseParcelizer());
        setexpandedtitlemargin.write(setexpandedtitlemargin.getMediaBrowserCompatCustomActionResultReceiver() && setexpandedtitlemargin.getAudioAttributesImplBaseParcelizer());
        return setexpandedtitlemargin;
    }
}
