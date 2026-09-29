package kotlin;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.data.models.pearl.PearlMini;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0010\u0010\u000bR$\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\r\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u0019\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\r\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b\u001f\u0010\u000bR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016"}, d2 = {"Lo/buildCacheKey;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "read", "RatingCompat", "RemoteActionCompatParcelizer", "", "Lo/buildCacheKey$IconCompatParcelizer;", "Ljava/util/List;", "write", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "MediaDescriptionCompat", "MediaMetadataCompat", "Lo/buildCacheKey$write;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class buildCacheKey {
    private static int write = 8;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private List<IconCompatParcelizer> write;
    private String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private List<write> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private String MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String MediaDescriptionCompat;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final List<IconCompatParcelizer> write() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final List<write> MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0003\u0014\u0017\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016"}, d2 = {"Lo/buildCacheKey$write;", "", "", "p0", "Lo/buildCacheKey$write$read;", "p1", "<init>", "(Ljava/lang/String;Lo/buildCacheKey$write$read;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "read", "Lo/buildCacheKey$write$read;", "()Lo/buildCacheKey$write$read;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @isLast(AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer.class)
    public static final /* data */ class write {
        private final read read;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String AudioAttributesCompatParcelizer;

        public write(String str, read readVar) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.AudioAttributesCompatParcelizer = str;
            this.read = readVar;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final String getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final read getRead() {
            return this.read;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof write)) {
                return false;
            }
            write writeVar = (write) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) writeVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, writeVar.read);
        }

        public final int hashCode() {
            int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
            read readVar = this.read;
            return (iHashCode * 31) + (readVar == null ? 0 : readVar.hashCode());
        }

        public final String toString() {
            String str = this.AudioAttributesCompatParcelizer;
            read readVar = this.read;
            StringBuilder sb = new StringBuilder("write(AudioAttributesCompatParcelizer=");
            sb.append(str);
            sb.append(", read=");
            sb.append(readVar);
            sb.append(")");
            return sb.toString();
        }

        public interface read {

            public static final class IconCompatParcelizer implements read {

                @isFirst(RemoteActionCompatParcelizer = PearlMini.KEY_THUMBNAIL)
                private final String RemoteActionCompatParcelizer;

                @isFirst(RemoteActionCompatParcelizer = "android_url")
                private final String read;

                @isFirst(RemoteActionCompatParcelizer = "url")
                private final String write;

                public final int hashCode() {
                    return 0;
                }

                public final String write() {
                    return this.write;
                }

                public final String RemoteActionCompatParcelizer() {
                    return this.read;
                }

                public final String AudioAttributesCompatParcelizer() {
                    return this.RemoteActionCompatParcelizer;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof IconCompatParcelizer)) {
                        return false;
                    }
                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                    return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) iconCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Video(url=");
                    sb.append((String) null);
                    sb.append(", androidUrl=");
                    sb.append((String) null);
                    sb.append(", thumbnail=");
                    sb.append((String) null);
                    sb.append(")");
                    return sb.toString();
                }
            }

            /* JADX INFO: renamed from: o.buildCacheKey$write$read$write, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes5.dex */
            public static final class C0064write implements read {
                private final createDownloader AudioAttributesCompatParcelizer;

                public C0064write(createDownloader createdownloader) {
                    toMagicModuleMetaRepoModel.write(createdownloader, "");
                    this.AudioAttributesCompatParcelizer = createdownloader;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0064write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((C0064write) obj).AudioAttributesCompatParcelizer);
                }

                public final int hashCode() {
                    return this.AudioAttributesCompatParcelizer.hashCode();
                }

                public final String toString() {
                    createDownloader createdownloader = this.AudioAttributesCompatParcelizer;
                    StringBuilder sb = new StringBuilder("Unknown(raw=");
                    sb.append(createdownloader);
                    sb.append(")");
                    return sb.toString();
                }
            }
        }

        /* JADX INFO: loaded from: classes5.dex */
        public static final class RemoteActionCompatParcelizer implements DefaultDownloadIndex1<write> {
            @Override // kotlin.DefaultDownloadIndex1
            public final /* synthetic */ write RemoteActionCompatParcelizer(getCount getcount, Type type, isClosed isclosed) {
                return read(getcount, type, isclosed);
            }

            private static write read(getCount getcount, Type type, isClosed isclosed) {
                toMagicModuleMetaRepoModel.write(getcount, "");
                toMagicModuleMetaRepoModel.write(type, "");
                toMagicModuleMetaRepoModel.write(isclosed, "");
                createDownloader createdownloaderAudioAttributesImplBaseParcelizer = getcount.AudioAttributesImplBaseParcelizer();
                getCount getcountAudioAttributesCompatParcelizer = createdownloaderAudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer("type");
                read.C0064write c0064write = null;
                String strAudioAttributesImplApi26Parcelizer = getcountAudioAttributesCompatParcelizer != null ? getcountAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer() : null;
                String str = strAudioAttributesImplApi26Parcelizer != null ? strAudioAttributesImplApi26Parcelizer : "";
                createDownloader createdownloaderIconCompatParcelizer = createdownloaderAudioAttributesImplBaseParcelizer.IconCompatParcelizer("properties");
                if (createdownloaderIconCompatParcelizer != null) {
                    if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "video")) {
                        c0064write = (read) isclosed.read(createdownloaderIconCompatParcelizer, read.IconCompatParcelizer.class);
                    } else {
                        c0064write = new read.C0064write(createdownloaderIconCompatParcelizer);
                    }
                }
                return new write(str, c0064write);
            }
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof buildCacheKey)) {
            return false;
        }
        buildCacheKey buildcachekey = (buildCacheKey) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) buildcachekey.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) buildcachekey.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, buildcachekey.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) buildcachekey.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) buildcachekey.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) buildcachekey.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) buildcachekey.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) buildcachekey.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) buildcachekey.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) buildcachekey.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) buildcachekey.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) buildcachekey.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) buildcachekey.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, buildcachekey.MediaBrowserCompatSearchResultReceiver);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        List<IconCompatParcelizer> list = this.write;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        String str = this.AudioAttributesCompatParcelizer;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.MediaBrowserCompatItemReceiver;
        int iHashCode8 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AudioAttributesImplApi21Parcelizer;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.AudioAttributesImplBaseParcelizer;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.MediaBrowserCompatMediaItem;
        int iHashCode11 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.MediaMetadataCompat;
        int iHashCode12 = str8 == null ? 0 : str8.hashCode();
        int iHashCode13 = this.MediaDescriptionCompat.hashCode();
        List<write> list2 = this.MediaBrowserCompatSearchResultReceiver;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.RemoteActionCompatParcelizer;
        List<IconCompatParcelizer> list = this.write;
        String str3 = this.IconCompatParcelizer;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str6 = this.AudioAttributesImplApi26Parcelizer;
        String str7 = this.MediaBrowserCompatItemReceiver;
        String str8 = this.AudioAttributesImplApi21Parcelizer;
        String str9 = this.AudioAttributesImplBaseParcelizer;
        String str10 = this.MediaBrowserCompatMediaItem;
        String str11 = this.MediaMetadataCompat;
        String str12 = this.MediaDescriptionCompat;
        List<write> list2 = this.MediaBrowserCompatSearchResultReceiver;
        StringBuilder sb = new StringBuilder("buildCacheKey(read=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(list);
        sb.append(", IconCompatParcelizer=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str5);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str6);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str7);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str8);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str9);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(str10);
        sb.append(", MediaMetadataCompat=");
        sb.append(str11);
        sb.append(", MediaDescriptionCompat=");
        sb.append(str12);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        downloadHelper2.RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
        downloadHelper2.IconCompatParcelizer();
    }

    private /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 0);
        downloadHelper2.AudioAttributesCompatParcelizer(this.read);
        if (this != this.write) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, TarConstants.CHKSUM_OFFSET);
            CacheSpan cacheSpan = new CacheSpan();
            List<IconCompatParcelizer> list = this.write;
            sendSetRequirements.write(setdownloadingstatestoqueued, cacheSpan, list).read(downloadHelper2, list);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 180);
        downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 75);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 54);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 71);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 145);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 116);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 152);
        downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 36);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatMediaItem);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 161);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaMetadataCompat);
        if (this != this.MediaBrowserCompatSearchResultReceiver) {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 127);
            CacheKeyFactoryExternalSyntheticLambda0 cacheKeyFactoryExternalSyntheticLambda0 = new CacheKeyFactoryExternalSyntheticLambda0();
            List<write> list2 = this.MediaBrowserCompatSearchResultReceiver;
            sendSetRequirements.write(setdownloadingstatestoqueued, cacheKeyFactoryExternalSyntheticLambda0, list2).read(downloadHelper2, list2);
        }
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 117);
        downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        sendsetstopreason.IconCompatParcelizer(downloadHelper2, 73);
        downloadHelper2.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat);
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
        downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
            RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
        }
        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
        boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
        switch (i) {
            case 22:
                if (!z) {
                    this.AudioAttributesCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 27:
                if (!z) {
                    this.MediaMetadataCompat = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaMetadataCompat = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaMetadataCompat = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 36:
                if (!z) {
                    this.read = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 64:
                if (!z) {
                    this.IconCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.IconCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 67:
                if (!z) {
                    this.write = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else {
                    this.write = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new CacheSpan()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }
                break;
            case 71:
                if (!z) {
                    this.MediaBrowserCompatMediaItem = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaBrowserCompatMediaItem = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaBrowserCompatMediaItem = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 105:
                if (!z) {
                    this.AudioAttributesImplApi26Parcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplApi26Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplApi26Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 119:
                if (!z) {
                    this.RemoteActionCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 122:
                if (!z) {
                    this.AudioAttributesImplBaseParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplBaseParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplBaseParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS /* 130 */:
                if (!z) {
                    this.MediaDescriptionCompat = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaDescriptionCompat = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaDescriptionCompat = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 154:
                if (!z) {
                    this.MediaBrowserCompatCustomActionResultReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaBrowserCompatCustomActionResultReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaBrowserCompatCustomActionResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case TarConstants.PREFIXLEN /* 155 */:
                if (!z) {
                    this.MediaBrowserCompatSearchResultReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else {
                    this.MediaBrowserCompatSearchResultReceiver = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new CacheKeyFactoryExternalSyntheticLambda0()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                }
                break;
            case 173:
                if (!z) {
                    this.MediaBrowserCompatItemReceiver = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.MediaBrowserCompatItemReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.MediaBrowserCompatItemReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            case 187:
                if (!z) {
                    this.AudioAttributesImplApi21Parcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() == DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplApi21Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                } else {
                    this.AudioAttributesImplApi21Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                }
                break;
            default:
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                break;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aBS\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001a\u0010#R\u001a\u0010$\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010 \u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0017\u0010&"}, d2 = {"Lo/buildCacheKey$IconCompatParcelizer;", "", "", "p0", "", "p1", "", "Lo/buildCacheKey$IconCompatParcelizer$RemoteActionCompatParcelizer;", "p2", "p3", "", "p4", "p5", "", "p6", "<init>", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;JJZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "write", "RemoteActionCompatParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "AudioAttributesImplApi26Parcelizer", "read", "J", "()J", "AudioAttributesImplApi21Parcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconCompatParcelizer {
        private static int AudioAttributesCompatParcelizer = 8;

        /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
        private boolean AudioAttributesImplApi26Parcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
        private String read;

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private String RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
        private List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private long write;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private long AudioAttributesImplApi21Parcelizer;

        public IconCompatParcelizer(String str, int i, List<RemoteActionCompatParcelizer> list, String str2, long j, long j2, boolean z) {
            toMagicModuleMetaRepoModel.write(str2, "");
            this.RemoteActionCompatParcelizer = str;
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = list;
            this.read = str2;
            this.write = j;
            this.AudioAttributesImplApi21Parcelizer = j2;
            this.AudioAttributesImplApi26Parcelizer = z;
        }

        /* JADX INFO: renamed from: write, reason: from getter */
        public final String getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ IconCompatParcelizer(String str, int i, List list, String str2, long j, long j2, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            List listRemoteActionCompatParcelizer = (i2 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list;
            long jCurrentTimeMillis = (i2 & 16) != 0 ? System.currentTimeMillis() : j;
            this(str, i, listRemoteActionCompatParcelizer, str2, jCurrentTimeMillis, (i2 & 32) != 0 ? 7776000000L + jCurrentTimeMillis : j2, (i2 & 64) != 0 ? false : z);
        }

        public final List<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
        public final String getRead() {
            return this.read;
        }

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
        public final long getWrite() {
            return this.write;
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final long getAudioAttributesImplApi21Parcelizer() {
            return this.AudioAttributesImplApi21Parcelizer;
        }

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
        public final boolean getAudioAttributesImplApi26Parcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) iconCompatParcelizer.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == iconCompatParcelizer.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iconCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) iconCompatParcelizer.read) && this.write == iconCompatParcelizer.write && this.AudioAttributesImplApi21Parcelizer == iconCompatParcelizer.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == iconCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019"}, d2 = {"Lo/buildCacheKey$IconCompatParcelizer$RemoteActionCompatParcelizer;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "read", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "I", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "AudioAttributesImplBaseParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RemoteActionCompatParcelizer {
            private static int IconCompatParcelizer;

            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
            private int RemoteActionCompatParcelizer;

            /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
            private String MediaBrowserCompatCustomActionResultReceiver;

            /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
            private String AudioAttributesImplBaseParcelizer;

            /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
            private String IconCompatParcelizer;

            /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
            private String AudioAttributesImplApi21Parcelizer;

            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
            private String write;
            private String read;

            /* JADX INFO: renamed from: write, reason: from kotlin metadata */
            private String AudioAttributesCompatParcelizer;

            public RemoteActionCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                toMagicModuleMetaRepoModel.write(str, "");
                toMagicModuleMetaRepoModel.write(str2, "");
                toMagicModuleMetaRepoModel.write(str3, "");
                toMagicModuleMetaRepoModel.write(str4, "");
                toMagicModuleMetaRepoModel.write(str5, "");
                this.RemoteActionCompatParcelizer = -1;
                this.write = str;
                this.read = str2;
                this.AudioAttributesCompatParcelizer = str3;
                this.IconCompatParcelizer = str4;
                this.AudioAttributesImplBaseParcelizer = str5;
                this.MediaBrowserCompatCustomActionResultReceiver = str6;
                this.AudioAttributesImplApi21Parcelizer = str7;
            }

            /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
            public final String getIconCompatParcelizer() {
                return this.IconCompatParcelizer;
            }

            public final String read() {
                String str = this.AudioAttributesImplApi21Parcelizer;
                if (str != null && str.length() != 0) {
                    setMaximumRequestedThroughputKbps setmaximumrequestedthroughputkbps = setMaximumRequestedThroughputKbps.INSTANCE;
                    return setMaximumRequestedThroughputKbps.read(this.AudioAttributesImplApi21Parcelizer);
                }
                return this.MediaBrowserCompatCustomActionResultReceiver;
            }

            public final String AudioAttributesCompatParcelizer() {
                StringBuilder sb = new StringBuilder("");
                String str = this.read;
                if (str != null && str.length() != 0) {
                    sb.append("Source: ");
                    sb.append(this.read);
                    sb.append("\n\n");
                }
                String str2 = this.write;
                if (str2 != null && str2.length() != 0) {
                    sb.append("Author: ");
                    sb.append(this.write);
                    sb.append("\n\n");
                }
                String str3 = this.IconCompatParcelizer;
                if (str3 != null && str3.length() != 0) {
                    sb.append("License: ");
                    sb.append(this.IconCompatParcelizer);
                }
                String string = sb.toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                return string;
            }

            public final boolean equals(Object p0) {
                if (this == p0) {
                    return true;
                }
                if (!(p0 instanceof RemoteActionCompatParcelizer)) {
                    return false;
                }
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) p0;
                return this.RemoteActionCompatParcelizer == remoteActionCompatParcelizer.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) remoteActionCompatParcelizer.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) remoteActionCompatParcelizer.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) remoteActionCompatParcelizer.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer);
            }

            public final int hashCode() {
                int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
                int iHashCode2 = this.write.hashCode();
                int iHashCode3 = this.read.hashCode();
                int iHashCode4 = this.AudioAttributesCompatParcelizer.hashCode();
                int iHashCode5 = this.IconCompatParcelizer.hashCode();
                int iHashCode6 = this.AudioAttributesImplBaseParcelizer.hashCode();
                String str = this.MediaBrowserCompatCustomActionResultReceiver;
                int iHashCode7 = str == null ? 0 : str.hashCode();
                String str2 = this.AudioAttributesImplApi21Parcelizer;
                return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                int i = this.RemoteActionCompatParcelizer;
                String str = this.write;
                String str2 = this.read;
                String str3 = this.AudioAttributesCompatParcelizer;
                String str4 = this.IconCompatParcelizer;
                String str5 = this.AudioAttributesImplBaseParcelizer;
                String str6 = this.MediaBrowserCompatCustomActionResultReceiver;
                String str7 = this.AudioAttributesImplApi21Parcelizer;
                StringBuilder sb = new StringBuilder("RemoteActionCompatParcelizer(RemoteActionCompatParcelizer=");
                sb.append(i);
                sb.append(", write=");
                sb.append(str);
                sb.append(", read=");
                sb.append(str2);
                sb.append(", AudioAttributesCompatParcelizer=");
                sb.append(str3);
                sb.append(", IconCompatParcelizer=");
                sb.append(str4);
                sb.append(", AudioAttributesImplBaseParcelizer=");
                sb.append(str5);
                sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
                sb.append(str6);
                sb.append(", AudioAttributesImplApi21Parcelizer=");
                sb.append(str7);
                sb.append(")");
                return sb.toString();
            }

            public final /* synthetic */ void write(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
                downloadHelper2.RemoteActionCompatParcelizer();
                read(downloadHelper2, sendsetstopreason);
                downloadHelper2.IconCompatParcelizer();
            }

            private /* synthetic */ void read(DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 180);
                downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.RemoteActionCompatParcelizer));
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 31);
                downloadHelper2.AudioAttributesCompatParcelizer(this.read);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 23);
                downloadHelper2.AudioAttributesCompatParcelizer(this.write);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 24);
                downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 165);
                downloadHelper2.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 106);
                downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 123);
                downloadHelper2.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 14);
                downloadHelper2.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            }

            public /* synthetic */ RemoteActionCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
                downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                    IconCompatParcelizer(downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
                }
                downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
            }

            private /* synthetic */ void IconCompatParcelizer(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
                boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
                if (i == 9) {
                    if (!z) {
                        this.AudioAttributesCompatParcelizer = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.AudioAttributesCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.AudioAttributesCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i == 64) {
                    if (!z) {
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    }
                    try {
                        this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                        return;
                    } catch (NumberFormatException e) {
                        throw new getPercentDownloaded(e);
                    }
                }
                if (i == 66) {
                    if (!z) {
                        this.read = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i == 90) {
                    if (!z) {
                        this.MediaBrowserCompatCustomActionResultReceiver = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.MediaBrowserCompatCustomActionResultReceiver = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.MediaBrowserCompatCustomActionResultReceiver = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i == 112) {
                    if (!z) {
                        this.write = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.write = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.write = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i == 114) {
                    if (!z) {
                        this.AudioAttributesImplBaseParcelizer = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.AudioAttributesImplBaseParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.AudioAttributesImplBaseParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i == 127) {
                    if (!z) {
                        this.IconCompatParcelizer = null;
                        downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                        return;
                    } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                        this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                        return;
                    } else {
                        this.IconCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                        return;
                    }
                }
                if (i != 169) {
                    downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                    return;
                }
                if (!z) {
                    this.AudioAttributesImplApi21Parcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.AudioAttributesImplApi21Parcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                } else {
                    this.AudioAttributesImplApi21Parcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                }
            }
        }

        public final int hashCode() {
            String str = this.RemoteActionCompatParcelizer;
            int iHashCode = str == null ? 0 : str.hashCode();
            int iHashCode2 = Integer.hashCode(this.IconCompatParcelizer);
            List<RemoteActionCompatParcelizer> list = this.AudioAttributesCompatParcelizer;
            return (((((((((((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.read.hashCode()) * 31) + Long.hashCode(this.write)) * 31) + Long.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        }

        public final String toString() {
            String str = this.RemoteActionCompatParcelizer;
            int i = this.IconCompatParcelizer;
            List<RemoteActionCompatParcelizer> list = this.AudioAttributesCompatParcelizer;
            String str2 = this.read;
            long j = this.write;
            long j2 = this.AudioAttributesImplApi21Parcelizer;
            boolean z = this.AudioAttributesImplApi26Parcelizer;
            StringBuilder sb = new StringBuilder("IconCompatParcelizer(RemoteActionCompatParcelizer=");
            sb.append(str);
            sb.append(", IconCompatParcelizer=");
            sb.append(i);
            sb.append(", AudioAttributesCompatParcelizer=");
            sb.append(list);
            sb.append(", read=");
            sb.append(str2);
            sb.append(", write=");
            sb.append(j);
            sb.append(", AudioAttributesImplApi21Parcelizer=");
            sb.append(j2);
            sb.append(", AudioAttributesImplApi26Parcelizer=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
            downloadHelper2.RemoteActionCompatParcelizer();
            RemoteActionCompatParcelizer(setdownloadingstatestoqueued, downloadHelper2, sendsetstopreason);
            downloadHelper2.IconCompatParcelizer();
        }

        private /* synthetic */ void RemoteActionCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelper2 downloadHelper2, sendSetStopReason sendsetstopreason) throws IOException {
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 164);
            downloadHelper2.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 180);
            downloadHelper2.AudioAttributesCompatParcelizer(Integer.valueOf(this.IconCompatParcelizer));
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 110);
            Class cls = Long.TYPE;
            Long lValueOf = Long.valueOf(this.AudioAttributesImplApi21Parcelizer);
            sendSetRequirements.write(setdownloadingstatestoqueued, cls, lValueOf).read(downloadHelper2, lValueOf);
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 109);
            Class cls2 = Long.TYPE;
            Long lValueOf2 = Long.valueOf(this.write);
            sendSetRequirements.write(setdownloadingstatestoqueued, cls2, lValueOf2).read(downloadHelper2, lValueOf2);
            if (this != this.AudioAttributesCompatParcelizer) {
                sendsetstopreason.IconCompatParcelizer(downloadHelper2, 147);
                CacheKeyFactory cacheKeyFactory = new CacheKeyFactory();
                List<RemoteActionCompatParcelizer> list = this.AudioAttributesCompatParcelizer;
                sendSetRequirements.write(setdownloadingstatestoqueued, cacheKeyFactory, list).read(downloadHelper2, list);
            }
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 140);
            downloadHelper2.write(this.AudioAttributesImplApi26Parcelizer);
            sendsetstopreason.IconCompatParcelizer(downloadHelper2, 5);
            downloadHelper2.AudioAttributesCompatParcelizer(this.read);
        }

        public /* synthetic */ IconCompatParcelizer() {
        }

        public final /* synthetic */ void AudioAttributesCompatParcelizer(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, sendRemoveDownload sendremovedownload) throws IOException {
            downloadHelperExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            while (downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi21Parcelizer()) {
                read(setdownloadingstatestoqueued, downloadHelperExternalSyntheticLambda4, sendremovedownload.AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4));
            }
            downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer();
        }

        private /* synthetic */ void read(setDownloadingStatesToQueued setdownloadingstatestoqueued, DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4, int i) throws IOException {
            boolean z = downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.NULL;
            if (i == 53) {
                if (z) {
                    this.write = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                    return;
                } else {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            }
            if (i == 64) {
                if (!z) {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
                try {
                    this.IconCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatItemReceiver();
                    return;
                } catch (NumberFormatException e) {
                    throw new getPercentDownloaded(e);
                }
            }
            if (i == 88) {
                if (z) {
                    this.AudioAttributesImplApi26Parcelizer = ((Boolean) setdownloadingstatestoqueued.read(Boolean.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).booleanValue();
                    return;
                } else {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            }
            if (i == 95) {
                if (z) {
                    this.AudioAttributesImplApi21Parcelizer = ((Long) setdownloadingstatestoqueued.read(Long.class).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4)).longValue();
                    return;
                } else {
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            }
            if (i == 147) {
                if (z) {
                    this.AudioAttributesCompatParcelizer = (List) setdownloadingstatestoqueued.IconCompatParcelizer(new CacheKeyFactory()).AudioAttributesCompatParcelizer(downloadHelperExternalSyntheticLambda4);
                    return;
                } else {
                    this.AudioAttributesCompatParcelizer = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                }
            }
            if (i == 158) {
                if (!z) {
                    this.read = null;
                    downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
                    return;
                } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                    this.read = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
                    return;
                } else {
                    this.read = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
                    return;
                }
            }
            if (i != 186) {
                downloadHelperExternalSyntheticLambda4.handleMediaPlayPauseIfPendingOnHandler();
                return;
            }
            if (!z) {
                this.RemoteActionCompatParcelizer = null;
                downloadHelperExternalSyntheticLambda4.MediaDescriptionCompat();
            } else if (downloadHelperExternalSyntheticLambda4.onCustomAction() != DownloadHelperExternalSyntheticLambda2.BOOLEAN) {
                this.RemoteActionCompatParcelizer = downloadHelperExternalSyntheticLambda4.MediaBrowserCompatSearchResultReceiver();
            } else {
                this.RemoteActionCompatParcelizer = Boolean.toString(downloadHelperExternalSyntheticLambda4.AudioAttributesImplApi26Parcelizer());
            }
        }
    }
}
