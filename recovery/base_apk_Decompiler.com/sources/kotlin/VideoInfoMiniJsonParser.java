package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public interface VideoInfoMiniJsonParser<T> {
    public static final RemoteActionCompatParcelizer read = RemoteActionCompatParcelizer.read;

    T read(getNotesCount getnotescount);

    public static final class RemoteActionCompatParcelizer {
        static final /* synthetic */ RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();
        private static final VideoInfoMiniJsonParser RemoteActionCompatParcelizer = new setPsshData(VideoTimelineResponseBody.read());

        private RemoteActionCompatParcelizer() {
        }

        public static VideoInfoMiniJsonParser RemoteActionCompatParcelizer() {
            return RemoteActionCompatParcelizer;
        }
    }
}
