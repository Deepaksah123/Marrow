package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class getUserSubmissionTimestamp {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatMediaItem(long j) {
        return j * 1000000;
    }

    public static final long IconCompatParcelizer(int i, isAnonymous isanonymous) {
        toMagicModuleMetaRepoModel.write(isanonymous, "");
        if (isanonymous.compareTo(isAnonymous.AudioAttributesImplApi26Parcelizer) <= 0) {
            return MediaBrowserCompatCustomActionResultReceiver(isFromDetailApi.write(i, isanonymous, isAnonymous.read));
        }
        return read(i, isanonymous);
    }

    public static final long read(long j, isAnonymous isanonymous) {
        toMagicModuleMetaRepoModel.write(isanonymous, "");
        long jWrite = isFromDetailApi.write(4611686018426999999L, isAnonymous.read, isanonymous);
        if ((-jWrite) <= j && j <= jWrite) {
            return MediaBrowserCompatCustomActionResultReceiver(isFromDetailApi.write(j, isanonymous, isAnonymous.read));
        }
        return AudioAttributesImplApi26Parcelizer(getQues.AudioAttributesCompatParcelizer(isFromDetailApi.RemoteActionCompatParcelizer(j, isanonymous, isAnonymous.RemoteActionCompatParcelizer), -4611686018427387903L, 4611686018427387903L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaDescriptionCompat(long j) {
        return j / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long MediaBrowserCompatCustomActionResultReceiver(long j) {
        return getTestPattern.RemoteActionCompatParcelizer(j << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplApi26Parcelizer(long j) {
        return getTestPattern.RemoteActionCompatParcelizer((j << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesCompatParcelizer(long j, int i) {
        return getTestPattern.RemoteActionCompatParcelizer((j << 1) + ((long) i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplBaseParcelizer(long j) {
        if (-4611686018426999999L <= j && j < 4611686018427000000L) {
            return MediaBrowserCompatCustomActionResultReceiver(j);
        }
        return AudioAttributesImplApi26Parcelizer(MediaDescriptionCompat(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long AudioAttributesImplApi21Parcelizer(long j) {
        if (-4611686018426L <= j && j < 4611686018427L) {
            return MediaBrowserCompatCustomActionResultReceiver(MediaBrowserCompatMediaItem(j));
        }
        return AudioAttributesImplApi26Parcelizer(getQues.AudioAttributesCompatParcelizer(j, -4611686018427387903L, 4611686018427387903L));
    }
}
