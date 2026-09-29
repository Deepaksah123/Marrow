package kotlin;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class _checkNativeIds extends _appendValue {
    private int AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private List<getDefaultImpl> MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private List<getDefaultImpl> onAddQueueItem;
    private final int onCommand;
    private boolean onCustomAction;
    private final int onFastForward;
    private byte onMediaButtonEvent;
    private final int onPause;
    private byte onPlay;
    private boolean onPlayFromMediaId;
    private final long onPrepareFromSearch;
    private static final int[] read = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] RemoteActionCompatParcelizer = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] MediaBrowserCompatCustomActionResultReceiver = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] IconCompatParcelizer = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] write = {174, 176, PsExtractor.PRIVATE_STREAM_1, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] AudioAttributesImplBaseParcelizer = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, PsExtractor.AUDIO_STREAM, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] MediaBrowserCompatItemReceiver = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] AudioAttributesCompatParcelizer = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final AsPropertyTypeDeserializer MediaDescriptionCompat = new AsPropertyTypeDeserializer();
    private final ArrayList<IconCompatParcelizer> RatingCompat = new ArrayList<>();
    private IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer(0, 4);
    private int MediaBrowserCompatMediaItem = 0;

    private static boolean AudioAttributesImplApi21Parcelizer(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean AudioAttributesImplApi26Parcelizer(byte b) {
        return (b & 224) == 0;
    }

    private static boolean AudioAttributesImplBaseParcelizer(byte b) {
        return (b & 240) == 16;
    }

    private static boolean AudioAttributesImplBaseParcelizer(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean IconCompatParcelizer(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(byte b) {
        return (b & 246) == 20;
    }

    private static boolean MediaBrowserCompatCustomActionResultReceiver(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean MediaDescriptionCompat(byte b) {
        return b > 0 && b <= 15;
    }

    private static boolean RemoteActionCompatParcelizer(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static int write(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean write(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    @Override // kotlin._appendValue, kotlin._generateTypeId
    public final void write() {
    }

    @Override // kotlin._appendValue
    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver */
    public final /* bridge */ /* synthetic */ withLocale read() throws parseAsRFC1123 {
        return super.read();
    }

    @Override // kotlin._appendValue
    public final /* bridge */ /* synthetic */ void RemoteActionCompatParcelizer(withLocale withlocale) throws parseAsRFC1123 {
        super.RemoteActionCompatParcelizer(withlocale);
    }

    @Override // kotlin._appendValue, kotlin.parseAsISO8601
    public final /* bridge */ /* synthetic */ void write(long j) {
        super.write(j);
    }

    public _checkNativeIds(String str, int i) {
        buildTypeSerializer.IconCompatParcelizer(true);
        this.onPrepareFromSearch = 16000000L;
        this.onCommand = MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.onPause = 0;
            this.onFastForward = 0;
        } else if (i == 2) {
            this.onPause = 1;
            this.onFastForward = 0;
        } else if (i == 3) {
            this.onPause = 0;
            this.onFastForward = 1;
        } else if (i == 4) {
            this.onPause = 1;
            this.onFastForward = 1;
        } else {
            prune.RemoteActionCompatParcelizer("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.onPause = 0;
            this.onFastForward = 0;
        }
        IconCompatParcelizer(0);
        MediaBrowserCompatMediaItem();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
    }

    @Override // kotlin._appendValue, kotlin._generateTypeId
    public final void AudioAttributesCompatParcelizer() {
        super.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onAddQueueItem = null;
        IconCompatParcelizer(0);
        RemoteActionCompatParcelizer(4);
        MediaBrowserCompatMediaItem();
        this.onCustomAction = false;
        this.onPlayFromMediaId = false;
        this.onMediaButtonEvent = (byte) 0;
        this.onPlay = (byte) 0;
        this.MediaBrowserCompatMediaItem = 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
    }

    @Override // kotlin._appendValue, kotlin._generateTypeId
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer */
    public final setLenient IconCompatParcelizer() throws parseAsRFC1123 {
        setLenient setlenientAudioAttributesImplApi21Parcelizer;
        setLenient setlenientIconCompatParcelizer = super.IconCompatParcelizer();
        if (setlenientIconCompatParcelizer != null) {
            return setlenientIconCompatParcelizer;
        }
        if (!MediaMetadataCompat() || (setlenientAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer()) == null) {
            return null;
        }
        this.MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        setlenientAudioAttributesImplApi21Parcelizer.read(RatingCompat(), MediaBrowserCompatItemReceiver(), Long.MAX_VALUE);
        return setlenientAudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin._appendValue
    protected final boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatSearchResultReceiver != this.onAddQueueItem;
    }

    @Override // kotlin._appendValue
    protected final isLenient MediaBrowserCompatItemReceiver() {
        List<getDefaultImpl> list = this.MediaBrowserCompatSearchResultReceiver;
        this.onAddQueueItem = list;
        return new _appendStartMarker((List) buildTypeSerializer.IconCompatParcelizer(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    @Override // kotlin._appendValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void write(kotlin.withLocale r10) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin._checkNativeIds.write(o.withLocale):void");
    }

    private boolean MediaBrowserCompatMediaItem(byte b) {
        if (AudioAttributesImplApi26Parcelizer(b)) {
            this.MediaBrowserCompatMediaItem = write(b);
        }
        return this.MediaBrowserCompatMediaItem == this.onPause;
    }

    private boolean RemoteActionCompatParcelizer(boolean z, byte b, byte b2) {
        if (z && AudioAttributesImplBaseParcelizer(b)) {
            if (this.onPlayFromMediaId && this.onMediaButtonEvent == b && this.onPlay == b2) {
                this.onPlayFromMediaId = false;
                return true;
            }
            this.onPlayFromMediaId = true;
            this.onMediaButtonEvent = b;
            this.onPlay = b2;
        } else {
            this.onPlayFromMediaId = false;
        }
        return false;
    }

    private void MediaBrowserCompatItemReceiver(byte b) {
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(' ');
        this.MediaMetadataCompat.IconCompatParcelizer((b >> 1) & 7, (b & 1) == 1);
    }

    private void read(byte b, byte b2) {
        int i = read[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer) {
            if (this.AudioAttributesImplApi21Parcelizer != 1 && !this.MediaMetadataCompat.RemoteActionCompatParcelizer()) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
                this.MediaMetadataCompat = iconCompatParcelizer;
                this.RatingCompat.add(iconCompatParcelizer);
            }
            this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer = i;
        }
        boolean z = (b2 & 16) == 16;
        boolean z2 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.MediaMetadataCompat.IconCompatParcelizer(z ? 8 : i2, z2);
        if (z) {
            this.MediaMetadataCompat.read = RemoteActionCompatParcelizer[i2];
        }
    }

    private void AudioAttributesImplApi21Parcelizer(byte b) {
        if (b == 32) {
            IconCompatParcelizer(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    IconCompatParcelizer(1);
                    RemoteActionCompatParcelizer(2);
                    break;
                case 38:
                    IconCompatParcelizer(1);
                    RemoteActionCompatParcelizer(3);
                    break;
                case 39:
                    IconCompatParcelizer(1);
                    RemoteActionCompatParcelizer(4);
                    break;
                default:
                    int i = this.AudioAttributesImplApi21Parcelizer;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
                                    int i2 = this.AudioAttributesImplApi21Parcelizer;
                                    if (i2 == 1 || i2 == 3) {
                                        MediaBrowserCompatMediaItem();
                                    }
                                    break;
                                case 45:
                                    if (i == 1 && !this.MediaMetadataCompat.RemoteActionCompatParcelizer()) {
                                        this.MediaMetadataCompat.read();
                                        break;
                                    }
                                    break;
                                case 46:
                                    MediaBrowserCompatMediaItem();
                                    break;
                                case 47:
                                    this.MediaBrowserCompatSearchResultReceiver = MediaDescriptionCompat();
                                    MediaBrowserCompatMediaItem();
                                    break;
                            }
                        } else {
                            this.MediaMetadataCompat.write();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        IconCompatParcelizer(3);
    }

    private List<getDefaultImpl> MediaDescriptionCompat() {
        int size = this.RatingCompat.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            getDefaultImpl getdefaultimpl = this.RatingCompat.get(i).read(Integer.MIN_VALUE);
            arrayList.add(getdefaultimpl);
            if (getdefaultimpl != null) {
                iMin = Math.min(iMin, getdefaultimpl.AudioAttributesImplApi26Parcelizer);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            getDefaultImpl getdefaultimpl2 = (getDefaultImpl) arrayList.get(i2);
            if (getdefaultimpl2 != null) {
                if (getdefaultimpl2.AudioAttributesImplApi26Parcelizer != iMin) {
                    getdefaultimpl2 = (getDefaultImpl) buildTypeSerializer.IconCompatParcelizer(this.RatingCompat.get(i2).read(iMin));
                }
                arrayList2.add(getdefaultimpl2);
            }
        }
        return arrayList2;
    }

    private void IconCompatParcelizer(int i) {
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        if (i2 != i) {
            this.AudioAttributesImplApi21Parcelizer = i;
            if (i == 3) {
                for (int i3 = 0; i3 < this.RatingCompat.size(); i3++) {
                    this.RatingCompat.get(i3).AudioAttributesCompatParcelizer(i);
                }
                return;
            }
            MediaBrowserCompatMediaItem();
            if (i2 == 3 || i == 1 || i == 0) {
                this.MediaBrowserCompatSearchResultReceiver = Collections.emptyList();
            }
        }
    }

    private void RemoteActionCompatParcelizer(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.MediaMetadataCompat.RemoteActionCompatParcelizer(i);
    }

    private void MediaBrowserCompatMediaItem() {
        this.MediaMetadataCompat.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        this.RatingCompat.clear();
        this.RatingCompat.add(this.MediaMetadataCompat);
    }

    private void MediaBrowserCompatItemReceiver(byte b, byte b2) {
        if (MediaDescriptionCompat(b)) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
            return;
        }
        if (MediaBrowserCompatCustomActionResultReceiver(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
                                break;
                        }
                        return;
                }
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        }
    }

    private static char read(byte b) {
        return (char) IconCompatParcelizer[(b & 127) - 32];
    }

    private static char IconCompatParcelizer(byte b) {
        return (char) write[b & 15];
    }

    private static char AudioAttributesCompatParcelizer(byte b, byte b2) {
        if ((b & 1) == 0) {
            return RemoteActionCompatParcelizer(b2);
        }
        return AudioAttributesCompatParcelizer(b2);
    }

    private static char RemoteActionCompatParcelizer(byte b) {
        return (char) AudioAttributesImplBaseParcelizer[b & 31];
    }

    private static char AudioAttributesCompatParcelizer(byte b) {
        return (char) MediaBrowserCompatItemReceiver[b & 31];
    }

    static final class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private int AudioAttributesImplBaseParcelizer;
        private int IconCompatParcelizer;
        private int read;
        private final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList();
        private final List<SpannableString> MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
        private final StringBuilder write = new StringBuilder();

        public IconCompatParcelizer(int i, int i2) {
            IconCompatParcelizer(i);
            this.AudioAttributesCompatParcelizer = i2;
        }

        public final void IconCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
            this.RemoteActionCompatParcelizer.clear();
            this.MediaBrowserCompatCustomActionResultReceiver.clear();
            this.write.setLength(0);
            this.AudioAttributesImplApi26Parcelizer = 15;
            this.read = 0;
            this.AudioAttributesImplBaseParcelizer = 0;
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer.isEmpty() && this.MediaBrowserCompatCustomActionResultReceiver.isEmpty() && this.write.length() == 0;
        }

        public final void AudioAttributesCompatParcelizer(int i) {
            this.IconCompatParcelizer = i;
        }

        public final void RemoteActionCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        public final void IconCompatParcelizer(int i, boolean z) {
            this.RemoteActionCompatParcelizer.add(new RemoteActionCompatParcelizer(i, z, this.write.length()));
        }

        public final void write() {
            int length = this.write.length();
            if (length > 0) {
                this.write.delete(length - 1, length);
                for (int size = this.RemoteActionCompatParcelizer.size() - 1; size >= 0; size--) {
                    if (this.RemoteActionCompatParcelizer.get(size).read != length) {
                        return;
                    }
                    r2.read--;
                }
            }
        }

        public final void RemoteActionCompatParcelizer(char c) {
            if (this.write.length() < 32) {
                this.write.append(c);
            }
        }

        public final void read() {
            this.MediaBrowserCompatCustomActionResultReceiver.add(AudioAttributesCompatParcelizer());
            this.write.setLength(0);
            this.RemoteActionCompatParcelizer.clear();
            int iMin = Math.min(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
            while (this.MediaBrowserCompatCustomActionResultReceiver.size() >= iMin) {
                this.MediaBrowserCompatCustomActionResultReceiver.remove(0);
            }
        }

        public final getDefaultImpl read(int i) {
            float f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < this.MediaBrowserCompatCustomActionResultReceiver.size(); i2++) {
                spannableStringBuilder.append((CharSequence) this.MediaBrowserCompatCustomActionResultReceiver.get(i2));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) AudioAttributesCompatParcelizer());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i3 = this.read + this.AudioAttributesImplBaseParcelizer;
            int length = (32 - i3) - spannableStringBuilder.length();
            int i4 = i3 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.IconCompatParcelizer != 2 || (Math.abs(i4) >= 3 && length >= 0)) {
                    i = (this.IconCompatParcelizer != 2 || i4 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i3 = 32 - length;
                }
                f = ((i3 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i5 = this.AudioAttributesImplApi26Parcelizer;
            if (i5 > 7) {
                i5 -= 17;
            } else if (this.IconCompatParcelizer == 1) {
                i5 -= this.AudioAttributesCompatParcelizer - 1;
            }
            return new getDefaultImpl.write().RemoteActionCompatParcelizer(spannableStringBuilder).AudioAttributesCompatParcelizer(Layout.Alignment.ALIGN_NORMAL).write(i5, 1).RemoteActionCompatParcelizer(f).IconCompatParcelizer(i).write();
        }

        private SpannableString AudioAttributesCompatParcelizer() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.write);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            boolean z = false;
            int i6 = 0;
            while (i5 < this.RemoteActionCompatParcelizer.size()) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.get(i5);
                boolean z2 = remoteActionCompatParcelizer.RemoteActionCompatParcelizer;
                int i7 = remoteActionCompatParcelizer.IconCompatParcelizer;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i2 = _checkNativeIds.MediaBrowserCompatCustomActionResultReceiver[i7];
                    }
                    z = z3;
                }
                int i8 = remoteActionCompatParcelizer.read;
                i5++;
                if (i8 != (i5 < this.RemoteActionCompatParcelizer.size() ? this.RemoteActionCompatParcelizer.get(i5).read : length)) {
                    if (i != -1 && !z2) {
                        RemoteActionCompatParcelizer(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i3 != -1 && !z) {
                        read(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i2 != i4) {
                        IconCompatParcelizer(spannableStringBuilder, i6, i8, i4);
                        i4 = i2;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                RemoteActionCompatParcelizer(spannableStringBuilder, i, length);
            }
            if (i3 != -1 && i3 != length) {
                read(spannableStringBuilder, i3, length);
            }
            if (i6 != length) {
                IconCompatParcelizer(spannableStringBuilder, i6, length, i4);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void RemoteActionCompatParcelizer(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private static void read(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private static void IconCompatParcelizer(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        static class RemoteActionCompatParcelizer {
            public final int IconCompatParcelizer;
            public final boolean RemoteActionCompatParcelizer;
            public int read;

            public RemoteActionCompatParcelizer(int i, boolean z, int i2) {
                this.IconCompatParcelizer = i;
                this.RemoteActionCompatParcelizer = z;
                this.read = i2;
            }
        }
    }

    private boolean MediaMetadataCompat() {
        return (this.onPrepareFromSearch == C.TIME_UNSET || this.handleMediaPlayPauseIfPendingOnHandler == C.TIME_UNSET || RatingCompat() - this.handleMediaPlayPauseIfPendingOnHandler < this.onPrepareFromSearch) ? false : true;
    }
}
