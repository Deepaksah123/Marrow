package kotlin;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: o.setMcqCount, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0201setMcqCount {
    public static /* synthetic */ setPassingYear IconCompatParcelizer(TopUserCompanion topUserCompanion, CurrentQuery currentQuery, getCollegeName getcollegename, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i) {
        if ((i & 1) != 0) {
            currentQuery = VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            getcollegename = getCollegeName.write;
        }
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(topUserCompanion, currentQuery, getcollegename, magicModuleSubmissionRequestBody);
    }

    public static final setPassingYear write(TopUserCompanion topUserCompanion, CurrentQuery currentQuery, getCollegeName getcollegename, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        setDefaultCourseEdition showlegalpopup;
        CurrentQuery currentQuery2 = TestStat.read(topUserCompanion, currentQuery);
        if (getcollegename.RemoteActionCompatParcelizer()) {
            showlegalpopup = new setDefaultCourseEdition(currentQuery2, magicModuleSubmissionRequestBody);
        } else {
            showlegalpopup = new showLegalPopup(currentQuery2, true);
        }
        showlegalpopup.AudioAttributesCompatParcelizer(getcollegename, showlegalpopup, (MagicModuleSubmissionRequestBody<? super showLegalPopup, ? super SampleVideos<? super T>, ? extends Object>) magicModuleSubmissionRequestBody);
        return showlegalpopup;
    }

    public static final <T> getYearOfAdmission<T> RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, CurrentQuery currentQuery, getCollegeName getcollegename, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody) {
        isSignedIn getmbbsverificationyear;
        CurrentQuery currentQuery2 = TestStat.read(topUserCompanion, currentQuery);
        if (getcollegename.RemoteActionCompatParcelizer()) {
            getmbbsverificationyear = new isSignedIn(currentQuery2, magicModuleSubmissionRequestBody);
        } else {
            getmbbsverificationyear = new getMbbsVerificationYear(currentQuery2, true);
        }
        getmbbsverificationyear.AudioAttributesCompatParcelizer(getcollegename, getmbbsverificationyear, (MagicModuleSubmissionRequestBody<? super getMbbsVerificationYear, ? super SampleVideos<? super T>, ? extends Object>) magicModuleSubmissionRequestBody);
        return getmbbsverificationyear;
    }

    public static final <T> Object write(CurrentQuery currentQuery, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super T> sampleVideos) {
        Object objAudioAttributesImplApi26Parcelizer;
        CurrentQuery context = sampleVideos.getWrite();
        CurrentQuery currentQueryIconCompatParcelizer = TestStat.IconCompatParcelizer(context, currentQuery);
        getUserConfig.read(currentQueryIconCompatParcelizer);
        if (currentQueryIconCompatParcelizer == context) {
            setWvVideoLevel setwvvideolevel = new setWvVideoLevel(currentQueryIconCompatParcelizer, sampleVideos);
            objAudioAttributesImplApi26Parcelizer = getReferenceId.IconCompatParcelizer(setwvvideolevel, setwvvideolevel, magicModuleSubmissionRequestBody);
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(currentQueryIconCompatParcelizer.get(getPlaybackInterval.INSTANCE), context.get(getPlaybackInterval.INSTANCE))) {
            NestfgetmNationalNumber nestfgetmNationalNumber = new NestfgetmNationalNumber(currentQueryIconCompatParcelizer, sampleVideos);
            CurrentQuery context2 = nestfgetmNationalNumber.getWrite();
            Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(context2, null);
            try {
                Object objIconCompatParcelizer = getReferenceId.IconCompatParcelizer(nestfgetmNationalNumber, nestfgetmNationalNumber, magicModuleSubmissionRequestBody);
                getBufferMultiplier.AudioAttributesCompatParcelizer(context2, objRemoteActionCompatParcelizer);
                objAudioAttributesImplApi26Parcelizer = objIconCompatParcelizer;
            } catch (Throwable th) {
                getBufferMultiplier.AudioAttributesCompatParcelizer(context2, objRemoteActionCompatParcelizer);
                throw th;
            }
        } else {
            setCollegeId setcollegeid = new setCollegeId(currentQueryIconCompatParcelizer, sampleVideos);
            setResumeTimeMs.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, setcollegeid, setcollegeid);
            objAudioAttributesImplApi26Parcelizer = setcollegeid.AudioAttributesImplApi26Parcelizer();
        }
        if (objAudioAttributesImplApi26Parcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesImplApi26Parcelizer;
    }
}
