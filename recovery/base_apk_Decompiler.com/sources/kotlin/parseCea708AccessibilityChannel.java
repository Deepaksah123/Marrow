package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class parseCea708AccessibilityChannel {

    public interface RemoteActionCompatParcelizer<T> {
        T write();
    }

    public static <T> LessonDynamicResponseBody<T> write(final RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        return LessonDynamicResponseBody.read(new LessonResetResponseBody() { // from class: o.parseDateTime
            @Override // kotlin.LessonResetResponseBody
            public final void AudioAttributesCompatParcelizer(setUpdates setupdates) throws Exception {
                parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, setupdates);
            }
        });
    }

    static /* synthetic */ void AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setUpdates setupdates) throws Exception {
        try {
            Object objWrite = remoteActionCompatParcelizer.write();
            if (objWrite != null) {
                if (setupdates.write()) {
                    return;
                }
                setupdates.IconCompatParcelizer(objWrite);
            } else {
                if (setupdates.write()) {
                    return;
                }
                setupdates.AudioAttributesCompatParcelizer(new DashMediaSource());
            }
        } catch (Throwable th) {
            if (setupdates.write()) {
                return;
            }
            setupdates.AudioAttributesCompatParcelizer(th);
        }
    }

    public static <T> accessgetEmptyStatecp<T> AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        return read(remoteActionCompatParcelizer);
    }

    public static <T> accessgetEmptyStatecp<T> read(final RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        return accessgetEmptyStatecp.read(new getAttemptedOption() { // from class: o.parseDtsChannelConfiguration
            @Override // kotlin.getAttemptedOption
            public final void write(getCorrectOption getcorrectoption) throws Exception {
                parseCea708AccessibilityChannel.IconCompatParcelizer(remoteActionCompatParcelizer, getcorrectoption);
            }
        }, InteractiveVideoElementRSModel.BUFFER);
    }

    static /* synthetic */ void IconCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, getCorrectOption getcorrectoption) throws Exception {
        try {
            Object objWrite = remoteActionCompatParcelizer.write();
            if (objWrite != null) {
                if (!getcorrectoption.write()) {
                    getcorrectoption.IconCompatParcelizer(objWrite);
                }
            } else if (!getcorrectoption.write()) {
                getcorrectoption.RemoteActionCompatParcelizer(new DashMediaSource());
            }
        } catch (Throwable th) {
            if (!getcorrectoption.write()) {
                getcorrectoption.RemoteActionCompatParcelizer(th);
            }
        }
        if (getcorrectoption.write()) {
            return;
        }
        getcorrectoption.IconCompatParcelizer();
    }
}
