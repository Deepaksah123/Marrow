package kotlin;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bR#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\b8\u0007¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012"}, d2 = {"Lo/ErrorViewModel;", "", "<init>", "()V", "Lo/getRelatedModuleAdapter;", "p0", "IconCompatParcelizer", "(Lo/getRelatedModuleAdapter;)Lo/getRelatedModuleAdapter;", "", "", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "read", "Ljava/util/Map;", "write", "", "Lo/SyncingActivity;", "[Lo/SyncingActivity;", "()[Lo/SyncingActivity;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ErrorViewModel {
    public static final ErrorViewModel INSTANCE = new ErrorViewModel();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final SyncingActivity[] read = {new SyncingActivity(SyncingActivity.TARGET_AUTHORITY, ""), new SyncingActivity(SyncingActivity.TARGET_METHOD, "GET"), new SyncingActivity(SyncingActivity.TARGET_METHOD, "POST"), new SyncingActivity(SyncingActivity.TARGET_PATH, "/"), new SyncingActivity(SyncingActivity.TARGET_PATH, "/index.html"), new SyncingActivity(SyncingActivity.TARGET_SCHEME, "http"), new SyncingActivity(SyncingActivity.TARGET_SCHEME, "https"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "200"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "204"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "206"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "304"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "400"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "404"), new SyncingActivity(SyncingActivity.RESPONSE_STATUS, "500"), new SyncingActivity("accept-charset", ""), new SyncingActivity("accept-encoding", "gzip, deflate"), new SyncingActivity("accept-language", ""), new SyncingActivity("accept-ranges", ""), new SyncingActivity("accept", ""), new SyncingActivity("access-control-allow-origin", ""), new SyncingActivity("age", ""), new SyncingActivity("allow", ""), new SyncingActivity("authorization", ""), new SyncingActivity("cache-control", ""), new SyncingActivity("content-disposition", ""), new SyncingActivity("content-encoding", ""), new SyncingActivity("content-language", ""), new SyncingActivity("content-length", ""), new SyncingActivity("content-location", ""), new SyncingActivity("content-range", ""), new SyncingActivity("content-type", ""), new SyncingActivity("cookie", ""), new SyncingActivity("date", ""), new SyncingActivity("etag", ""), new SyncingActivity("expect", ""), new SyncingActivity("expires", ""), new SyncingActivity("from", ""), new SyncingActivity("host", ""), new SyncingActivity("if-match", ""), new SyncingActivity("if-modified-since", ""), new SyncingActivity("if-none-match", ""), new SyncingActivity("if-range", ""), new SyncingActivity("if-unmodified-since", ""), new SyncingActivity("last-modified", ""), new SyncingActivity("link", ""), new SyncingActivity("location", ""), new SyncingActivity("max-forwards", ""), new SyncingActivity("proxy-authenticate", ""), new SyncingActivity("proxy-authorization", ""), new SyncingActivity(SessionDescription.ATTR_RANGE, ""), new SyncingActivity("referer", ""), new SyncingActivity("refresh", ""), new SyncingActivity("retry-after", ""), new SyncingActivity("server", ""), new SyncingActivity("set-cookie", ""), new SyncingActivity("strict-transport-security", ""), new SyncingActivity("transfer-encoding", ""), new SyncingActivity("user-agent", ""), new SyncingActivity("vary", ""), new SyncingActivity("via", ""), new SyncingActivity("www-authenticate", "")};

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final Map<getRelatedModuleAdapter, Integer> write = RemoteActionCompatParcelizer();

    private ErrorViewModel() {
    }

    public static SyncingActivity[] write() {
        return read;
    }

    public static Map<getRelatedModuleAdapter, Integer> read() {
        return write;
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0014J\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u001cJ\u001d\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010\u000bJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u000bR\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010%R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010%R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lo/ErrorViewModel$write;", "", "Lo/setLockedFromSeek;", "p0", "", "p1", "p2", "<init>", "(Lo/setLockedFromSeek;II)V", "", "write", "()V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "(I)I", "AudioAttributesCompatParcelizer", "", "Lo/SyncingActivity;", "()Ljava/util/List;", "Lo/getRelatedModuleAdapter;", "(I)Lo/getRelatedModuleAdapter;", "(Lo/SyncingActivity;)V", "", "read", "(I)Z", "()I", "AudioAttributesImplBaseParcelizer", "()Lo/getRelatedModuleAdapter;", "(I)V", "(II)I", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatItemReceiver", "", "dynamicTable", "[Lo/SyncingActivity;", "dynamicTableByteCount", "I", "headerCount", "", "headerList", "Ljava/util/List;", "headerTableSizeSetting", "maxDynamicTableByteCount", "nextHeaderIndex", "Lo/LessonCompletedDialog;", "source", "Lo/LessonCompletedDialog;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class write {
        public SyncingActivity[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<SyncingActivity> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final LessonCompletedDialog source;

        private write(setLockedFromSeek setlockedfromseek, int i, int i2) {
            toMagicModuleMetaRepoModel.write(setlockedfromseek, "");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = CustomAppBarLayout.AudioAttributesCompatParcelizer(setlockedfromseek);
            this.dynamicTable = new SyncingActivity[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ write(setLockedFromSeek setlockedfromseek, int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this(setlockedfromseek, i, (i3 & 4) != 0 ? i : i2);
        }

        public final List<SyncingActivity> AudioAttributesCompatParcelizer() {
            List<SyncingActivity> listOnPlay = IntermediateLoginResponseBody.onPlay(this.headerList);
            this.headerList.clear();
            return listOnPlay;
        }

        private final void write() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    RemoteActionCompatParcelizer();
                } else {
                    AudioAttributesCompatParcelizer(i2 - i);
                }
            }
        }

        private final void RemoteActionCompatParcelizer() {
            SyncingActivity[] syncingActivityArr = this.dynamicTable;
            getOrderDetails.AudioAttributesCompatParcelizer(syncingActivityArr, (Object) null, 0, syncingActivityArr.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int AudioAttributesCompatParcelizer(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    SyncingActivity syncingActivity = this.dynamicTable[length];
                    toMagicModuleMetaRepoModel.write(syncingActivity);
                    p0 -= syncingActivity.hpackSize;
                    this.dynamicTableByteCount -= syncingActivity.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                SyncingActivity[] syncingActivityArr = this.dynamicTable;
                int i3 = i + 1;
                System.arraycopy(syncingActivityArr, i3, syncingActivityArr, i3 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void IconCompatParcelizer() throws IOException {
            while (!this.source.MediaBrowserCompatCustomActionResultReceiver()) {
                int iWrite = FirebaseDataModule.write(this.source.MediaMetadataCompat());
                if (iWrite == 128) {
                    throw new IOException("index == 0");
                }
                if ((iWrite & 128) == 128) {
                    write(AudioAttributesCompatParcelizer(iWrite, 127) - 1);
                } else if (iWrite == 64) {
                    AudioAttributesImplApi21Parcelizer();
                } else if ((iWrite & 64) == 64) {
                    MediaBrowserCompatCustomActionResultReceiver(AudioAttributesCompatParcelizer(iWrite, 63) - 1);
                } else if ((iWrite & 32) == 32) {
                    int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(iWrite, 31);
                    this.maxDynamicTableByteCount = iAudioAttributesCompatParcelizer;
                    if (iAudioAttributesCompatParcelizer < 0 || iAudioAttributesCompatParcelizer > this.headerTableSizeSetting) {
                        StringBuilder sb = new StringBuilder("Invalid dynamic table size update ");
                        sb.append(this.maxDynamicTableByteCount);
                        throw new IOException(sb.toString());
                    }
                    write();
                } else if (iWrite == 16 || iWrite == 0) {
                    MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    MediaBrowserCompatItemReceiver(AudioAttributesCompatParcelizer(iWrite, 15) - 1);
                }
            }
        }

        private final void write(int p0) throws IOException {
            if (read(p0)) {
                ErrorViewModel errorViewModel = ErrorViewModel.INSTANCE;
                this.headerList.add(ErrorViewModel.write()[p0]);
                return;
            }
            ErrorViewModel errorViewModel2 = ErrorViewModel.INSTANCE;
            int iIconCompatParcelizer = IconCompatParcelizer(p0 - ErrorViewModel.write().length);
            if (iIconCompatParcelizer >= 0) {
                SyncingActivity[] syncingActivityArr = this.dynamicTable;
                if (iIconCompatParcelizer < syncingActivityArr.length) {
                    List<SyncingActivity> list = this.headerList;
                    SyncingActivity syncingActivity = syncingActivityArr[iIconCompatParcelizer];
                    toMagicModuleMetaRepoModel.write(syncingActivity);
                    list.add(syncingActivity);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(p0 + 1);
            throw new IOException(sb.toString());
        }

        private final int IconCompatParcelizer(int p0) {
            return this.nextHeaderIndex + 1 + p0;
        }

        private final void MediaBrowserCompatItemReceiver(int p0) throws IOException {
            this.headerList.add(new SyncingActivity(RemoteActionCompatParcelizer(p0), AudioAttributesImplBaseParcelizer()));
        }

        private final void MediaBrowserCompatCustomActionResultReceiver() throws IOException {
            ErrorViewModel errorViewModel = ErrorViewModel.INSTANCE;
            this.headerList.add(new SyncingActivity(ErrorViewModel.IconCompatParcelizer(AudioAttributesImplBaseParcelizer()), AudioAttributesImplBaseParcelizer()));
        }

        private final void MediaBrowserCompatCustomActionResultReceiver(int p0) throws IOException {
            AudioAttributesCompatParcelizer(new SyncingActivity(RemoteActionCompatParcelizer(p0), AudioAttributesImplBaseParcelizer()));
        }

        private final void AudioAttributesImplApi21Parcelizer() throws IOException {
            ErrorViewModel errorViewModel = ErrorViewModel.INSTANCE;
            AudioAttributesCompatParcelizer(new SyncingActivity(ErrorViewModel.IconCompatParcelizer(AudioAttributesImplBaseParcelizer()), AudioAttributesImplBaseParcelizer()));
        }

        private final getRelatedModuleAdapter RemoteActionCompatParcelizer(int p0) throws IOException {
            if (read(p0)) {
                ErrorViewModel errorViewModel = ErrorViewModel.INSTANCE;
                return ErrorViewModel.write()[p0].name;
            }
            ErrorViewModel errorViewModel2 = ErrorViewModel.INSTANCE;
            int iIconCompatParcelizer = IconCompatParcelizer(p0 - ErrorViewModel.write().length);
            if (iIconCompatParcelizer >= 0) {
                SyncingActivity[] syncingActivityArr = this.dynamicTable;
                if (iIconCompatParcelizer < syncingActivityArr.length) {
                    SyncingActivity syncingActivity = syncingActivityArr[iIconCompatParcelizer];
                    toMagicModuleMetaRepoModel.write(syncingActivity);
                    return syncingActivity.name;
                }
            }
            StringBuilder sb = new StringBuilder("Header index too large ");
            sb.append(p0 + 1);
            throw new IOException(sb.toString());
        }

        private static boolean read(int p0) {
            if (p0 < 0) {
                return false;
            }
            ErrorViewModel errorViewModel = ErrorViewModel.INSTANCE;
            return p0 <= ErrorViewModel.write().length - 1;
        }

        private final void AudioAttributesCompatParcelizer(SyncingActivity syncingActivity) {
            this.headerList.add(syncingActivity);
            int i = syncingActivity.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                RemoteActionCompatParcelizer();
                return;
            }
            AudioAttributesCompatParcelizer((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            SyncingActivity[] syncingActivityArr = this.dynamicTable;
            if (i3 + 1 > syncingActivityArr.length) {
                SyncingActivity[] syncingActivityArr2 = new SyncingActivity[syncingActivityArr.length << 1];
                System.arraycopy(syncingActivityArr, 0, syncingActivityArr2, syncingActivityArr.length, syncingActivityArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = syncingActivityArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = syncingActivity;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        private final int read() throws IOException {
            return FirebaseDataModule.write(this.source.MediaMetadataCompat());
        }

        private int AudioAttributesCompatParcelizer(int p0, int p1) throws IOException {
            int i = p0 & p1;
            if (i < p1) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int i3 = read();
                if ((i3 & 128) == 0) {
                    return p1 + (i3 << i2);
                }
                p1 += (i3 & 127) << i2;
                i2 += 7;
            }
        }

        private getRelatedModuleAdapter AudioAttributesImplBaseParcelizer() throws IOException {
            int i = read();
            boolean z = (i & 128) == 128;
            long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i, 127);
            if (z) {
                resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                LessonVideoActivity lessonVideoActivity = LessonVideoActivity.INSTANCE;
                LessonVideoActivity.IconCompatParcelizer(this.source, jAudioAttributesCompatParcelizer, resetcurrentselectedposition);
                return resetcurrentselectedposition.MediaDescriptionCompat();
            }
            return this.source.read(jAudioAttributesCompatParcelizer);
        }
    }

    private static Map<getRelatedModuleAdapter, Integer> RemoteActionCompatParcelizer() {
        SyncingActivity[] syncingActivityArr = read;
        LinkedHashMap linkedHashMap = new LinkedHashMap(syncingActivityArr.length);
        int length = syncingActivityArr.length;
        for (int i = 0; i < length; i++) {
            SyncingActivity[] syncingActivityArr2 = read;
            if (!linkedHashMap.containsKey(syncingActivityArr2[i].name)) {
                linkedHashMap.put(syncingActivityArr2[i].name, Integer.valueOf(i));
            }
        }
        Map<getRelatedModuleAdapter, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000e\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u000b\u0010\u0015J\u001b\u0010\u000e\u001a\u00020\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016¢\u0006\u0004\b\u000e\u0010\u0017J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0018R\u001e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0014\u0010$\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f"}, d2 = {"Lo/ErrorViewModel$AudioAttributesCompatParcelizer;", "", "", "p0", "", "p1", "Lo/resetCurrentSelectedPosition;", "p2", "<init>", "(IZLo/resetCurrentSelectedPosition;)V", "", "RemoteActionCompatParcelizer", "()V", "write", "AudioAttributesCompatParcelizer", "(I)I", "Lo/SyncingActivity;", "(Lo/SyncingActivity;)V", "IconCompatParcelizer", "(I)V", "Lo/getRelatedModuleAdapter;", "(Lo/getRelatedModuleAdapter;)V", "", "(Ljava/util/List;)V", "(III)V", "", "dynamicTable", "[Lo/SyncingActivity;", "dynamicTableByteCount", "I", "emitDynamicTableSizeUpdate", "Z", "headerCount", "headerTableSizeSetting", "maxDynamicTableByteCount", "nextHeaderIndex", "out", "Lo/resetCurrentSelectedPosition;", "smallestHeaderTableSizeSetting", "useCompression"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        public SyncingActivity[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final resetCurrentSelectedPosition out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        private AudioAttributesCompatParcelizer(int i, boolean z, resetCurrentSelectedPosition resetcurrentselectedposition) {
            toMagicModuleMetaRepoModel.write(resetcurrentselectedposition, "");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = resetcurrentselectedposition;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new SyncingActivity[8];
            this.nextHeaderIndex = 7;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(int i, boolean z, resetCurrentSelectedPosition resetcurrentselectedposition, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, resetcurrentselectedposition);
        }

        private final void write() {
            SyncingActivity[] syncingActivityArr = this.dynamicTable;
            getOrderDetails.AudioAttributesCompatParcelizer(syncingActivityArr, (Object) null, 0, syncingActivityArr.length);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int AudioAttributesCompatParcelizer(int p0) {
            int i;
            int i2 = 0;
            if (p0 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || p0 <= 0) {
                        break;
                    }
                    SyncingActivity syncingActivity = this.dynamicTable[length];
                    toMagicModuleMetaRepoModel.write(syncingActivity);
                    p0 -= syncingActivity.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    SyncingActivity syncingActivity2 = this.dynamicTable[length];
                    toMagicModuleMetaRepoModel.write(syncingActivity2);
                    this.dynamicTableByteCount = i3 - syncingActivity2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                SyncingActivity[] syncingActivityArr = this.dynamicTable;
                int i4 = i + 1;
                System.arraycopy(syncingActivityArr, i4, syncingActivityArr, i4 + i2, this.headerCount);
                SyncingActivity[] syncingActivityArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex + 1;
                Arrays.fill(syncingActivityArr2, i5, i5 + i2, (Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void RemoteActionCompatParcelizer(SyncingActivity p0) {
            int i = p0.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                write();
                return;
            }
            AudioAttributesCompatParcelizer((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount;
            SyncingActivity[] syncingActivityArr = this.dynamicTable;
            if (i3 + 1 > syncingActivityArr.length) {
                SyncingActivity[] syncingActivityArr2 = new SyncingActivity[syncingActivityArr.length << 1];
                System.arraycopy(syncingActivityArr, 0, syncingActivityArr2, syncingActivityArr.length, syncingActivityArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = syncingActivityArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = p0;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void AudioAttributesCompatParcelizer(java.util.List<kotlin.SyncingActivity> r13) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ErrorViewModel.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(java.util.List):void");
        }

        private void RemoteActionCompatParcelizer(int p0, int p1, int p2) {
            if (p0 < p1) {
                this.out.read(p0 | p2);
                return;
            }
            this.out.read(p2 | p1);
            int i = p0 - p1;
            while (i >= 128) {
                this.out.read(128 | (i & 127));
                i >>>= 7;
            }
            this.out.read(i);
        }

        private void RemoteActionCompatParcelizer(getRelatedModuleAdapter p0) throws IOException {
            toMagicModuleMetaRepoModel.write(p0, "");
            if (this.useCompression) {
                LessonVideoActivity lessonVideoActivity = LessonVideoActivity.INSTANCE;
                if (LessonVideoActivity.RemoteActionCompatParcelizer(p0) < p0.MediaBrowserCompatCustomActionResultReceiver()) {
                    resetCurrentSelectedPosition resetcurrentselectedposition = new resetCurrentSelectedPosition();
                    LessonVideoActivity lessonVideoActivity2 = LessonVideoActivity.INSTANCE;
                    LessonVideoActivity.IconCompatParcelizer(p0, resetcurrentselectedposition);
                    getRelatedModuleAdapter getrelatedmoduleadapterMediaDescriptionCompat = resetcurrentselectedposition.MediaDescriptionCompat();
                    RemoteActionCompatParcelizer(getrelatedmoduleadapterMediaDescriptionCompat.MediaBrowserCompatCustomActionResultReceiver(), 127, 128);
                    this.out.AudioAttributesCompatParcelizer(getrelatedmoduleadapterMediaDescriptionCompat);
                    return;
                }
            }
            RemoteActionCompatParcelizer(p0.MediaBrowserCompatCustomActionResultReceiver(), 127, 0);
            this.out.AudioAttributesCompatParcelizer(p0);
        }

        public final void IconCompatParcelizer(int p0) {
            this.headerTableSizeSetting = p0;
            int iMin = Math.min(p0, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == iMin) {
                return;
            }
            if (iMin < i) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, iMin);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = iMin;
            RemoteActionCompatParcelizer();
        }

        private final void RemoteActionCompatParcelizer() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    write();
                } else {
                    AudioAttributesCompatParcelizer(i2 - i);
                }
            }
        }
    }

    public static getRelatedModuleAdapter IconCompatParcelizer(getRelatedModuleAdapter p0) throws IOException {
        toMagicModuleMetaRepoModel.write(p0, "");
        int iMediaBrowserCompatCustomActionResultReceiver = p0.MediaBrowserCompatCustomActionResultReceiver();
        for (int i = 0; i < iMediaBrowserCompatCustomActionResultReceiver; i++) {
            byte b = p0.read(i);
            if (65 <= b && b < 91) {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                sb.append(p0.MediaDescriptionCompat());
                throw new IOException(sb.toString());
            }
        }
        return p0;
    }
}
