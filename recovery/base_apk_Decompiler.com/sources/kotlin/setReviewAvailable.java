package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setReviewAvailable {
    public static final <T> T write(CurrentQuery currentQuery, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super T>, ? extends Object> magicModuleSubmissionRequestBody) throws InterruptedException {
        CollegeJsonParser collegeJsonParserRemoteActionCompatParcelizer;
        CurrentQuery currentQuery2;
        Thread threadCurrentThread = Thread.currentThread();
        getPlaybackInterval getplaybackinterval = (getPlaybackInterval) currentQuery.get(getPlaybackInterval.INSTANCE);
        if (getplaybackinterval == null) {
            getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
            collegeJsonParserRemoteActionCompatParcelizer = getAddLine2.read();
            currentQuery2 = TestStat.read(getInstitute.INSTANCE, currentQuery.plus(collegeJsonParserRemoteActionCompatParcelizer));
        } else {
            if (getplaybackinterval instanceof CollegeJsonParser) {
            }
            getAddLine2 getaddline22 = getAddLine2.RemoteActionCompatParcelizer;
            collegeJsonParserRemoteActionCompatParcelizer = getAddLine2.RemoteActionCompatParcelizer();
            currentQuery2 = TestStat.read(getInstitute.INSTANCE, currentQuery);
        }
        setIsAnonymous setisanonymous = new setIsAnonymous(currentQuery2, threadCurrentThread, collegeJsonParserRemoteActionCompatParcelizer);
        setisanonymous.AudioAttributesCompatParcelizer(getCollegeName.write, setisanonymous, (MagicModuleSubmissionRequestBody<? super setIsAnonymous, ? super SampleVideos<? super T>, ? extends Object>) magicModuleSubmissionRequestBody);
        return (T) setisanonymous.AudioAttributesImplBaseParcelizer();
    }
}
