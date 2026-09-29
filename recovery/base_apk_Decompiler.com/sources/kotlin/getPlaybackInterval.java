package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005J)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H&¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\n*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/getPlaybackInterval;", "Lo/CurrentQuery$write;", "T", "Lo/SampleVideos;", "p0", "RemoteActionCompatParcelizer", "(Lo/SampleVideos;)Lo/SampleVideos;", "", "AudioAttributesCompatParcelizer", "(Lo/SampleVideos;)V", "E", "Lo/CurrentQuery$IconCompatParcelizer;", "get", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery$write;", "Lo/CurrentQuery;", "minusKey", "(Lo/CurrentQuery$IconCompatParcelizer;)Lo/CurrentQuery;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface getPlaybackInterval extends CurrentQuery.write {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    void AudioAttributesCompatParcelizer(SampleVideos<?> p0);

    <T> SampleVideos<T> RemoteActionCompatParcelizer(SampleVideos<? super T> p0);

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> p0);

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> p0);

    /* JADX INFO: renamed from: o.getPlaybackInterval$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes4.dex */
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<getPlaybackInterval> {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static <E extends CurrentQuery.write> E get(getPlaybackInterval getplaybackinterval, CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            if (iconCompatParcelizer instanceof PlaybackSettingsCompanion) {
                PlaybackSettingsCompanion playbackSettingsCompanion = (PlaybackSettingsCompanion) iconCompatParcelizer;
                if (playbackSettingsCompanion.write(getplaybackinterval.getKey())) {
                    E e = (E) playbackSettingsCompanion.RemoteActionCompatParcelizer(getplaybackinterval);
                    if (e instanceof CurrentQuery.write) {
                        return e;
                    }
                }
                return null;
            }
            if (getPlaybackInterval.INSTANCE != iconCompatParcelizer) {
                return null;
            }
            toMagicModuleMetaRepoModel.read(getplaybackinterval, "");
            return getplaybackinterval;
        }

        public static CurrentQuery minusKey(getPlaybackInterval getplaybackinterval, CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
            toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
            if (!(iconCompatParcelizer instanceof PlaybackSettingsCompanion)) {
                return getPlaybackInterval.INSTANCE == iconCompatParcelizer ? VideoSessionResponseBody.RemoteActionCompatParcelizer : getplaybackinterval;
            }
            PlaybackSettingsCompanion playbackSettingsCompanion = (PlaybackSettingsCompanion) iconCompatParcelizer;
            return (!playbackSettingsCompanion.write(getplaybackinterval.getKey()) || playbackSettingsCompanion.RemoteActionCompatParcelizer(getplaybackinterval) == null) ? getplaybackinterval : VideoSessionResponseBody.RemoteActionCompatParcelizer;
        }
    }
}
