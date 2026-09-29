package kotlin;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class DownloadHelperExternalSyntheticLambda4 implements Closeable {
    private int[] AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private final Reader IconCompatParcelizer;
    private String[] MediaBrowserCompatItemReceiver;
    private int[] MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private boolean read = false;
    private final char[] write = new char[1024];
    private int MediaBrowserCompatMediaItem = 0;
    private int AudioAttributesCompatParcelizer = 0;
    private int AudioAttributesImplBaseParcelizer = 0;
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    int RemoteActionCompatParcelizer = 0;
    private int RatingCompat = 1;

    public DownloadHelperExternalSyntheticLambda4(Reader reader) {
        int[] iArr = new int[32];
        this.MediaBrowserCompatSearchResultReceiver = iArr;
        iArr[0] = 6;
        this.MediaBrowserCompatItemReceiver = new String[32];
        this.AudioAttributesImplApi21Parcelizer = new int[32];
        this.IconCompatParcelizer = (Reader) Objects.requireNonNull(reader, "in == null");
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read = z;
    }

    public final boolean onCommand() {
        return this.read;
    }

    public void read() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 3) {
            write(1);
            this.AudioAttributesImplApi21Parcelizer[this.RatingCompat - 1] = 0;
            this.RemoteActionCompatParcelizer = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(onCustomAction());
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void IconCompatParcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 4) {
            int i = this.RatingCompat;
            this.RatingCompat = i - 1;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.RemoteActionCompatParcelizer = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(onCustomAction());
        sb.append(onMediaButtonEvent());
        throw new IllegalStateException(sb.toString());
    }

    public void AudioAttributesCompatParcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 1) {
            write(3);
            this.RemoteActionCompatParcelizer = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(onCustomAction());
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void RemoteActionCompatParcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2) {
            int i = this.RatingCompat;
            int i2 = i - 1;
            this.RatingCompat = i2;
            this.MediaBrowserCompatItemReceiver[i2] = null;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.RemoteActionCompatParcelizer = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(onCustomAction());
        sb.append(onMediaButtonEvent());
        throw new IllegalStateException(sb.toString());
    }

    public boolean AudioAttributesImplApi21Parcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 2 || iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 4 || iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 17) ? false : true;
    }

    public DownloadHelperExternalSyntheticLambda2 onCustomAction() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        switch (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            case 1:
                return DownloadHelperExternalSyntheticLambda2.BEGIN_OBJECT;
            case 2:
                return DownloadHelperExternalSyntheticLambda2.END_OBJECT;
            case 3:
                return DownloadHelperExternalSyntheticLambda2.BEGIN_ARRAY;
            case 4:
                return DownloadHelperExternalSyntheticLambda2.END_ARRAY;
            case 5:
            case 6:
                return DownloadHelperExternalSyntheticLambda2.BOOLEAN;
            case 7:
                return DownloadHelperExternalSyntheticLambda2.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return DownloadHelperExternalSyntheticLambda2.STRING;
            case 12:
            case 13:
            case 14:
                return DownloadHelperExternalSyntheticLambda2.NAME;
            case 15:
            case 16:
                return DownloadHelperExternalSyntheticLambda2.NUMBER;
            case 17:
                return DownloadHelperExternalSyntheticLambda2.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        int i;
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        int i2 = this.RatingCompat - 1;
        int i3 = iArr[i2];
        if (i3 == 1) {
            iArr[i2] = 2;
        } else if (i3 == 2) {
            int i4 = read(true);
            if (i4 != 44) {
                if (i4 != 59) {
                    if (i4 == 93) {
                        this.RemoteActionCompatParcelizer = 4;
                        return 4;
                    }
                    throw read("Unterminated array");
                }
                MediaMetadataCompat();
            }
        } else {
            if (i3 == 3 || i3 == 5) {
                iArr[i2] = 4;
                if (i3 == 5 && (i = read(true)) != 44) {
                    if (i != 59) {
                        if (i == 125) {
                            this.RemoteActionCompatParcelizer = 2;
                            return 2;
                        }
                        throw read("Unterminated object");
                    }
                    MediaMetadataCompat();
                }
                int i5 = read(true);
                if (i5 == 34) {
                    this.RemoteActionCompatParcelizer = 13;
                    return 13;
                }
                if (i5 == 39) {
                    MediaMetadataCompat();
                    this.RemoteActionCompatParcelizer = 12;
                    return 12;
                }
                if (i5 == 125) {
                    if (i3 != 5) {
                        this.RemoteActionCompatParcelizer = 2;
                        return 2;
                    }
                    throw read("Expected name");
                }
                MediaMetadataCompat();
                this.MediaBrowserCompatMediaItem--;
                if (RemoteActionCompatParcelizer((char) i5)) {
                    this.RemoteActionCompatParcelizer = 14;
                    return 14;
                }
                throw read("Expected name");
            }
            if (i3 == 4) {
                iArr[i2] = 5;
                int i6 = read(true);
                if (i6 != 58) {
                    if (i6 == 61) {
                        MediaMetadataCompat();
                        if (this.MediaBrowserCompatMediaItem < this.AudioAttributesCompatParcelizer || IconCompatParcelizer(1)) {
                            char[] cArr = this.write;
                            int i7 = this.MediaBrowserCompatMediaItem;
                            if (cArr[i7] == '>') {
                                this.MediaBrowserCompatMediaItem = i7 + 1;
                            }
                        }
                    } else {
                        throw read("Expected ':'");
                    }
                }
            } else if (i3 == 6) {
                if (this.read) {
                    onAddQueueItem();
                }
                this.MediaBrowserCompatSearchResultReceiver[this.RatingCompat - 1] = 7;
            } else if (i3 == 7) {
                if (read(false) == -1) {
                    this.RemoteActionCompatParcelizer = 17;
                    return 17;
                }
                MediaMetadataCompat();
                this.MediaBrowserCompatMediaItem--;
            } else if (i3 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int i8 = read(true);
        if (i8 == 34) {
            this.RemoteActionCompatParcelizer = 9;
            return 9;
        }
        if (i8 == 39) {
            MediaMetadataCompat();
            this.RemoteActionCompatParcelizer = 8;
            return 8;
        }
        if (i8 != 44 && i8 != 59) {
            if (i8 == 91) {
                this.RemoteActionCompatParcelizer = 3;
                return 3;
            }
            if (i8 != 93) {
                if (i8 == 123) {
                    this.RemoteActionCompatParcelizer = 1;
                    return 1;
                }
                this.MediaBrowserCompatMediaItem--;
                int iOnPlayFromMediaId = onPlayFromMediaId();
                if (iOnPlayFromMediaId != 0) {
                    return iOnPlayFromMediaId;
                }
                int iOnFastForward = onFastForward();
                if (iOnFastForward != 0) {
                    return iOnFastForward;
                }
                if (!RemoteActionCompatParcelizer(this.write[this.MediaBrowserCompatMediaItem])) {
                    throw read("Expected value");
                }
                MediaMetadataCompat();
                this.RemoteActionCompatParcelizer = 10;
                return 10;
            }
            if (i3 == 1) {
                this.RemoteActionCompatParcelizer = 4;
                return 4;
            }
        }
        if (i3 == 1 || i3 == 2) {
            MediaMetadataCompat();
            this.MediaBrowserCompatMediaItem--;
            this.RemoteActionCompatParcelizer = 7;
            return 7;
        }
        throw read("Unexpected value");
    }

    private int onPlayFromMediaId() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.write[this.MediaBrowserCompatMediaItem];
        if (c == 't' || c == 'T') {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.MediaBrowserCompatMediaItem + i2 >= this.AudioAttributesCompatParcelizer && !IconCompatParcelizer(i2 + 1)) {
                return 0;
            }
            char c2 = this.write[this.MediaBrowserCompatMediaItem + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.MediaBrowserCompatMediaItem + length < this.AudioAttributesCompatParcelizer || IconCompatParcelizer(length + 1)) && RemoteActionCompatParcelizer(this.write[this.MediaBrowserCompatMediaItem + length])) {
            return 0;
        }
        this.MediaBrowserCompatMediaItem += length;
        this.RemoteActionCompatParcelizer = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (RemoteActionCompatParcelizer(r14) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008c, code lost:
    
        if (r9 != 2) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        if (r10 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0094, code lost:
    
        if (r12 != Long.MIN_VALUE) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0096, code lost:
    
        if (r11 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r12 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009e, code lost:
    
        if (r11 != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        if (r11 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        r12 = -r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a3, code lost:
    
        r18.AudioAttributesImplApi26Parcelizer = r12;
        r18.MediaBrowserCompatMediaItem += r8;
        r18.RemoteActionCompatParcelizer = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00af, code lost:
    
        if (r9 == 2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b2, code lost:
    
        if (r9 == 4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00b5, code lost:
    
        if (r9 == 7) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b7, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b9, code lost:
    
        r18.MediaDescriptionCompat = r8;
        r18.RemoteActionCompatParcelizer = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bf, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c0, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int onFastForward() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelperExternalSyntheticLambda4.onFastForward():int");
    }

    private boolean RemoteActionCompatParcelizer(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        MediaMetadataCompat();
        return false;
    }

    public String MediaBrowserCompatMediaItem() throws IOException {
        String strWrite;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 14) {
            strWrite = onPause();
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 12) {
            strWrite = write('\'');
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 13) {
            strWrite = write('\"');
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(onCustomAction());
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
        this.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatItemReceiver[this.RatingCompat - 1] = strWrite;
        return strWrite;
    }

    public String MediaBrowserCompatSearchResultReceiver() throws IOException {
        String str;
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 10) {
            str = onPause();
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 8) {
            str = write('\'');
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 9) {
            str = write('\"');
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 11) {
            str = this.MediaMetadataCompat;
            this.MediaMetadataCompat = null;
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 15) {
            str = Long.toString(this.AudioAttributesImplApi26Parcelizer);
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 16) {
            str = new String(this.write, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
            this.MediaBrowserCompatMediaItem += this.MediaDescriptionCompat;
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(onCustomAction());
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
        this.RemoteActionCompatParcelizer = 0;
        int[] iArr = this.AudioAttributesImplApi21Parcelizer;
        int i = this.RatingCompat - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public boolean AudioAttributesImplApi26Parcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 5) {
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i = this.RatingCompat - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 6) {
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.RatingCompat - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(onCustomAction());
        sb.append(onMediaButtonEvent());
        throw new IllegalStateException(sb.toString());
    }

    public void MediaDescriptionCompat() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 7) {
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i = this.RatingCompat - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected null but was ");
        sb.append(onCustomAction());
        sb.append(onMediaButtonEvent());
        throw new IllegalStateException(sb.toString());
    }

    public double AudioAttributesImplBaseParcelizer() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 15) {
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i = this.RatingCompat - 1;
            iArr[i] = iArr[i] + 1;
            return this.AudioAttributesImplApi26Parcelizer;
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 16) {
            this.MediaMetadataCompat = new String(this.write, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
            this.MediaBrowserCompatMediaItem += this.MediaDescriptionCompat;
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 8 || iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 9) {
            this.MediaMetadataCompat = write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 8 ? '\'' : '\"');
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 10) {
            this.MediaMetadataCompat = onPause();
        } else if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(onCustomAction());
            sb.append(onMediaButtonEvent());
            throw new IllegalStateException(sb.toString());
        }
        this.RemoteActionCompatParcelizer = 11;
        double d = Double.parseDouble(this.MediaMetadataCompat);
        if (!this.read && (Double.isNaN(d) || Double.isInfinite(d))) {
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(d);
            sb2.append(onMediaButtonEvent());
            throw new DownloadHelperExternalSyntheticLambda6(sb2.toString());
        }
        this.MediaMetadataCompat = null;
        this.RemoteActionCompatParcelizer = 0;
        int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.RatingCompat - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public long RatingCompat() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 15) {
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i = this.RatingCompat - 1;
            iArr[i] = iArr[i] + 1;
            return this.AudioAttributesImplApi26Parcelizer;
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 16) {
            this.MediaMetadataCompat = new String(this.write, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
            this.MediaBrowserCompatMediaItem += this.MediaDescriptionCompat;
        } else {
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 8 && iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 9 && iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 10) {
                StringBuilder sb = new StringBuilder("Expected a long but was ");
                sb.append(onCustomAction());
                sb.append(onMediaButtonEvent());
                throw new IllegalStateException(sb.toString());
            }
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 10) {
                this.MediaMetadataCompat = onPause();
            } else {
                this.MediaMetadataCompat = write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 8 ? '\'' : '\"');
            }
            try {
                long j = Long.parseLong(this.MediaMetadataCompat);
                this.RemoteActionCompatParcelizer = 0;
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i2 = this.RatingCompat - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.RemoteActionCompatParcelizer = 11;
        double d = Double.parseDouble(this.MediaMetadataCompat);
        long j2 = (long) d;
        if (j2 != d) {
            StringBuilder sb2 = new StringBuilder("Expected a long but was ");
            sb2.append(this.MediaMetadataCompat);
            sb2.append(onMediaButtonEvent());
            throw new NumberFormatException(sb2.toString());
        }
        this.MediaMetadataCompat = null;
        this.RemoteActionCompatParcelizer = 0;
        int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
        int i3 = this.RatingCompat - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r4 - r2) << 1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r1.append(r0, r2, r4 - r2);
        r9.MediaBrowserCompatMediaItem = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String write(char r10) throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.write
            r1 = 0
        L3:
            int r2 = r9.MediaBrowserCompatMediaItem
            int r3 = r9.AudioAttributesCompatParcelizer
        L7:
            r4 = r2
        L8:
            r5 = 16
            r6 = 1
            if (r4 >= r3) goto L59
            int r7 = r4 + 1
            char r4 = r0[r4]
            if (r4 != r10) goto L27
            r9.MediaBrowserCompatMediaItem = r7
            int r7 = r7 - r2
            int r7 = r7 - r6
            if (r1 != 0) goto L1f
            java.lang.String r9 = new java.lang.String
            r9.<init>(r0, r2, r7)
            return r9
        L1f:
            r1.append(r0, r2, r7)
            java.lang.String r9 = r1.toString()
            return r9
        L27:
            r8 = 92
            if (r4 != r8) goto L4c
            r9.MediaBrowserCompatMediaItem = r7
            int r7 = r7 - r2
            if (r1 != 0) goto L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r7 << 1
            int r3 = java.lang.Math.max(r3, r5)
            r1.<init>(r3)
        L3b:
            int r7 = r7 + (-1)
            r1.append(r0, r2, r7)
            char r2 = r9.onPlay()
            r1.append(r2)
            int r2 = r9.MediaBrowserCompatMediaItem
            int r3 = r9.AudioAttributesCompatParcelizer
            goto L7
        L4c:
            r5 = 10
            if (r4 != r5) goto L57
            int r4 = r9.AudioAttributesImplBaseParcelizer
            int r4 = r4 + r6
            r9.AudioAttributesImplBaseParcelizer = r4
            r9.MediaBrowserCompatCustomActionResultReceiver = r7
        L57:
            r4 = r7
            goto L8
        L59:
            if (r1 != 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r4 - r2
            int r3 = r3 << r6
            int r3 = java.lang.Math.max(r3, r5)
            r1.<init>(r3)
        L67:
            int r3 = r4 - r2
            r1.append(r0, r2, r3)
            r9.MediaBrowserCompatMediaItem = r4
            boolean r2 = r9.IconCompatParcelizer(r6)
            if (r2 == 0) goto L75
            goto L3
        L75:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r9 = r9.read(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelperExternalSyntheticLambda4.write(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        MediaMetadataCompat();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String onPause() throws java.io.IOException {
        /*
            r5 = this;
            r0 = 0
        L1:
            r1 = 0
            r2 = r1
        L3:
            int r3 = r5.MediaBrowserCompatMediaItem
            int r3 = r3 + r2
            int r4 = r5.AudioAttributesCompatParcelizer
            if (r3 >= r4) goto L4c
            char[] r4 = r5.write
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.MediaMetadataCompat()
            goto L59
        L4c:
            char[] r3 = r5.write
            int r3 = r3.length
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.IconCompatParcelizer(r3)
            if (r3 != 0) goto L3
        L59:
            r1 = r2
            goto L7b
        L5b:
            if (r0 != 0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L68:
            char[] r3 = r5.write
            int r4 = r5.MediaBrowserCompatMediaItem
            r0.append(r3, r4, r2)
            int r3 = r5.MediaBrowserCompatMediaItem
            int r3 = r3 + r2
            r5.MediaBrowserCompatMediaItem = r3
            r2 = 1
            boolean r2 = r5.IconCompatParcelizer(r2)
            if (r2 != 0) goto L1
        L7b:
            if (r0 != 0) goto L87
            java.lang.String r0 = new java.lang.String
            char[] r2 = r5.write
            int r3 = r5.MediaBrowserCompatMediaItem
            r0.<init>(r2, r3, r1)
            goto L92
        L87:
            char[] r2 = r5.write
            int r3 = r5.MediaBrowserCompatMediaItem
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L92:
            int r2 = r5.MediaBrowserCompatMediaItem
            int r2 = r2 + r1
            r5.MediaBrowserCompatMediaItem = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelperExternalSyntheticLambda4.onPause():java.lang.String");
    }

    private void read(char c) throws IOException {
        char[] cArr = this.write;
        while (true) {
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = this.AudioAttributesCompatParcelizer;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.MediaBrowserCompatMediaItem = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.MediaBrowserCompatMediaItem = i3;
                        onPlay();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.AudioAttributesImplBaseParcelizer++;
                            this.MediaBrowserCompatCustomActionResultReceiver = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.MediaBrowserCompatMediaItem = i;
                    if (!IconCompatParcelizer(1)) {
                        throw read("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        MediaMetadataCompat();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onPrepare() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r3.MediaBrowserCompatMediaItem
            int r1 = r1 + r0
            int r2 = r3.AudioAttributesCompatParcelizer
            if (r1 >= r2) goto L4f
            char[] r2 = r3.write
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L49
            r2 = 10
            if (r1 == r2) goto L49
            r2 = 12
            if (r1 == r2) goto L49
            r2 = 13
            if (r1 == r2) goto L49
            r2 = 32
            if (r1 == r2) goto L49
            r2 = 35
            if (r1 == r2) goto L46
            r2 = 44
            if (r1 == r2) goto L49
            r2 = 47
            if (r1 == r2) goto L46
            r2 = 61
            if (r1 == r2) goto L46
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L49
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L49
            r2 = 58
            if (r1 == r2) goto L49
            r2 = 59
            if (r1 == r2) goto L46
            switch(r1) {
                case 91: goto L49;
                case 92: goto L46;
                case 93: goto L49;
                default: goto L43;
            }
        L43:
            int r0 = r0 + 1
            goto L1
        L46:
            r3.MediaMetadataCompat()
        L49:
            int r1 = r3.MediaBrowserCompatMediaItem
            int r1 = r1 + r0
            r3.MediaBrowserCompatMediaItem = r1
            return
        L4f:
            r3.MediaBrowserCompatMediaItem = r1
            r0 = 1
            boolean r0 = r3.IconCompatParcelizer(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelperExternalSyntheticLambda4.onPrepare():void");
    }

    public int MediaBrowserCompatItemReceiver() throws IOException {
        int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
            iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 15) {
            long j = this.AudioAttributesImplApi26Parcelizer;
            int i = (int) j;
            if (j != i) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(this.AudioAttributesImplApi26Parcelizer);
                sb.append(onMediaButtonEvent());
                throw new NumberFormatException(sb.toString());
            }
            this.RemoteActionCompatParcelizer = 0;
            int[] iArr = this.AudioAttributesImplApi21Parcelizer;
            int i2 = this.RatingCompat - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 16) {
            this.MediaMetadataCompat = new String(this.write, this.MediaBrowserCompatMediaItem, this.MediaDescriptionCompat);
            this.MediaBrowserCompatMediaItem += this.MediaDescriptionCompat;
        } else {
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 8 && iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 9 && iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 10) {
                StringBuilder sb2 = new StringBuilder("Expected an int but was ");
                sb2.append(onCustomAction());
                sb2.append(onMediaButtonEvent());
                throw new IllegalStateException(sb2.toString());
            }
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 10) {
                this.MediaMetadataCompat = onPause();
            } else {
                this.MediaMetadataCompat = write(iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.MediaMetadataCompat);
                this.RemoteActionCompatParcelizer = 0;
                int[] iArr2 = this.AudioAttributesImplApi21Parcelizer;
                int i4 = this.RatingCompat - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.RemoteActionCompatParcelizer = 11;
        double d = Double.parseDouble(this.MediaMetadataCompat);
        int i5 = (int) d;
        if (i5 != d) {
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(this.MediaMetadataCompat);
            sb3.append(onMediaButtonEvent());
            throw new NumberFormatException(sb3.toString());
        }
        this.MediaMetadataCompat = null;
        this.RemoteActionCompatParcelizer = 0;
        int[] iArr3 = this.AudioAttributesImplApi21Parcelizer;
        int i6 = this.RatingCompat - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.RemoteActionCompatParcelizer = 0;
        this.MediaBrowserCompatSearchResultReceiver[0] = 8;
        this.RatingCompat = 1;
        this.IconCompatParcelizer.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void handleMediaPlayPauseIfPendingOnHandler() throws IOException {
        int i = 0;
        do {
            int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.RemoteActionCompatParcelizer;
            if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
            switch (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                case 1:
                    write(3);
                    i++;
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.MediaBrowserCompatItemReceiver[this.RatingCompat - 1] = null;
                    }
                    this.RatingCompat--;
                    i--;
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 3:
                    write(1);
                    i++;
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 4:
                    this.RatingCompat--;
                    i--;
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 8:
                    read('\'');
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 9:
                    read('\"');
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 10:
                    onPrepare();
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 12:
                    read('\'');
                    if (i == 0) {
                        this.MediaBrowserCompatItemReceiver[this.RatingCompat - 1] = "<skipped>";
                    }
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 13:
                    read('\"');
                    if (i == 0) {
                        this.MediaBrowserCompatItemReceiver[this.RatingCompat - 1] = "<skipped>";
                    }
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 14:
                    onPrepare();
                    if (i == 0) {
                        this.MediaBrowserCompatItemReceiver[this.RatingCompat - 1] = "<skipped>";
                    }
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 16:
                    this.MediaBrowserCompatMediaItem += this.MediaDescriptionCompat;
                    this.RemoteActionCompatParcelizer = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.RatingCompat - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    private void write(int i) {
        int i2 = this.RatingCompat;
        int[] iArr = this.MediaBrowserCompatSearchResultReceiver;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.MediaBrowserCompatSearchResultReceiver = Arrays.copyOf(iArr, i3);
            this.AudioAttributesImplApi21Parcelizer = Arrays.copyOf(this.AudioAttributesImplApi21Parcelizer, i3);
            this.MediaBrowserCompatItemReceiver = (String[]) Arrays.copyOf(this.MediaBrowserCompatItemReceiver, i3);
        }
        int[] iArr2 = this.MediaBrowserCompatSearchResultReceiver;
        int i4 = this.RatingCompat;
        this.RatingCompat = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean IconCompatParcelizer(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.write;
        int i4 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i5 = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatCustomActionResultReceiver = i4 - i5;
        int i6 = this.AudioAttributesCompatParcelizer;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.AudioAttributesCompatParcelizer = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.AudioAttributesCompatParcelizer = 0;
        }
        this.MediaBrowserCompatMediaItem = 0;
        do {
            Reader reader = this.IconCompatParcelizer;
            int i8 = this.AudioAttributesCompatParcelizer;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.AudioAttributesCompatParcelizer + i9;
            this.AudioAttributesCompatParcelizer = i2;
            if (this.AudioAttributesImplBaseParcelizer == 0 && (i3 = this.MediaBrowserCompatCustomActionResultReceiver) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.MediaBrowserCompatMediaItem++;
                this.MediaBrowserCompatCustomActionResultReceiver = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int read(boolean r9) throws java.io.IOException {
        /*
            r8 = this;
            char[] r0 = r8.write
            int r1 = r8.MediaBrowserCompatMediaItem
            int r2 = r8.AudioAttributesCompatParcelizer
        L6:
            r3 = 1
            if (r1 != r2) goto L31
            r8.MediaBrowserCompatMediaItem = r1
            boolean r1 = r8.IconCompatParcelizer(r3)
            if (r1 != 0) goto L2d
            if (r9 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of input"
            r0.<init>(r1)
            java.lang.String r8 = r8.onMediaButtonEvent()
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.<init>(r8)
            throw r9
        L2d:
            int r1 = r8.MediaBrowserCompatMediaItem
            int r2 = r8.AudioAttributesCompatParcelizer
        L31:
            int r4 = r1 + 1
            char r5 = r0[r1]
            r6 = 10
            if (r5 != r6) goto L41
            int r1 = r8.AudioAttributesImplBaseParcelizer
            int r1 = r1 + r3
            r8.AudioAttributesImplBaseParcelizer = r1
            r8.MediaBrowserCompatCustomActionResultReceiver = r4
            goto Lac
        L41:
            r6 = 32
            if (r5 == r6) goto Lac
            r6 = 13
            if (r5 == r6) goto Lac
            r6 = 9
            if (r5 == r6) goto Lac
            r6 = 47
            if (r5 != r6) goto L97
            r8.MediaBrowserCompatMediaItem = r4
            r7 = 2
            if (r4 != r2) goto L63
            r8.MediaBrowserCompatMediaItem = r1
            boolean r1 = r8.IconCompatParcelizer(r7)
            int r2 = r8.MediaBrowserCompatMediaItem
            int r2 = r2 + r3
            r8.MediaBrowserCompatMediaItem = r2
            if (r1 == 0) goto L70
        L63:
            r8.MediaMetadataCompat()
            int r1 = r8.MediaBrowserCompatMediaItem
            char r2 = r0[r1]
            r3 = 42
            if (r2 == r3) goto L7d
            if (r2 == r6) goto L71
        L70:
            return r5
        L71:
            int r1 = r1 + 1
            r8.MediaBrowserCompatMediaItem = r1
            r8.onPrepareFromSearch()
            int r1 = r8.MediaBrowserCompatMediaItem
            int r2 = r8.AudioAttributesCompatParcelizer
            goto L6
        L7d:
            int r1 = r1 + 1
            r8.MediaBrowserCompatMediaItem = r1
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r8.AudioAttributesCompatParcelizer(r1)
            if (r1 == 0) goto L90
            int r1 = r8.MediaBrowserCompatMediaItem
            int r1 = r1 + r7
            int r2 = r8.AudioAttributesCompatParcelizer
            goto L6
        L90:
            java.lang.String r9 = "Unterminated comment"
            java.io.IOException r8 = r8.read(r9)
            throw r8
        L97:
            r1 = 35
            if (r5 != r1) goto La9
            r8.MediaBrowserCompatMediaItem = r4
            r8.MediaMetadataCompat()
            r8.onPrepareFromSearch()
            int r1 = r8.MediaBrowserCompatMediaItem
            int r2 = r8.AudioAttributesCompatParcelizer
            goto L6
        La9:
            r8.MediaBrowserCompatMediaItem = r4
            return r5
        Lac:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DownloadHelperExternalSyntheticLambda4.read(boolean):int");
    }

    private void MediaMetadataCompat() throws IOException {
        if (!this.read) {
            throw read("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void onPrepareFromSearch() throws IOException {
        char c;
        do {
            if (this.MediaBrowserCompatMediaItem >= this.AudioAttributesCompatParcelizer && !IconCompatParcelizer(1)) {
                return;
            }
            char[] cArr = this.write;
            int i = this.MediaBrowserCompatMediaItem;
            int i2 = i + 1;
            this.MediaBrowserCompatMediaItem = i2;
            c = cArr[i];
            if (c == '\n') {
                this.AudioAttributesImplBaseParcelizer++;
                this.MediaBrowserCompatCustomActionResultReceiver = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean AudioAttributesCompatParcelizer(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.MediaBrowserCompatMediaItem + length > this.AudioAttributesCompatParcelizer && !IconCompatParcelizer(length)) {
                return false;
            }
            char[] cArr = this.write;
            int i = this.MediaBrowserCompatMediaItem;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.write[this.MediaBrowserCompatMediaItem + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.AudioAttributesImplBaseParcelizer++;
            this.MediaBrowserCompatCustomActionResultReceiver = i + 1;
            this.MediaBrowserCompatMediaItem++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(onMediaButtonEvent());
        return sb.toString();
    }

    final String onMediaButtonEvent() {
        int i = this.AudioAttributesImplBaseParcelizer;
        int i2 = this.MediaBrowserCompatMediaItem;
        int i3 = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(write());
        return sb.toString();
    }

    private String RemoteActionCompatParcelizer(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.RatingCompat;
            if (i < i2) {
                int i3 = this.MediaBrowserCompatSearchResultReceiver[i];
                if (i3 == 1 || i3 == 2) {
                    int i4 = this.AudioAttributesImplApi21Parcelizer[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb.append('.');
                    String str = this.MediaBrowserCompatItemReceiver[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }

    public String MediaBrowserCompatCustomActionResultReceiver() {
        return RemoteActionCompatParcelizer(true);
    }

    public String write() {
        return RemoteActionCompatParcelizer(false);
    }

    private char onPlay() throws IOException {
        int i;
        if (this.MediaBrowserCompatMediaItem == this.AudioAttributesCompatParcelizer && !IconCompatParcelizer(1)) {
            throw read("Unterminated escape sequence");
        }
        char[] cArr = this.write;
        int i2 = this.MediaBrowserCompatMediaItem;
        int i3 = i2 + 1;
        this.MediaBrowserCompatMediaItem = i3;
        char c = cArr[i2];
        if (c == '\n') {
            this.AudioAttributesImplBaseParcelizer++;
            this.MediaBrowserCompatCustomActionResultReceiver = i3;
            return c;
        }
        if (c == '\"' || c == '\'' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c == 'u') {
            if (i2 + 5 > this.AudioAttributesCompatParcelizer && !IconCompatParcelizer(4)) {
                throw read("Unterminated escape sequence");
            }
            int i4 = this.MediaBrowserCompatMediaItem;
            char c2 = 0;
            for (int i5 = i4; i5 < i4 + 4; i5++) {
                char c3 = this.write[i5];
                char c4 = (char) (c2 << 4);
                if (c3 >= '0' && c3 <= '9') {
                    i = c3 - '0';
                } else if (c3 >= 'a' && c3 <= 'f') {
                    i = c3 - 'W';
                } else {
                    if (c3 < 'A' || c3 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(this.write, this.MediaBrowserCompatMediaItem, 4)));
                    }
                    i = c3 - '7';
                }
                c2 = (char) (c4 + i);
            }
            this.MediaBrowserCompatMediaItem += 4;
            return c2;
        }
        throw read("Invalid escape sequence");
    }

    private IOException read(String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(onMediaButtonEvent());
        throw new DownloadHelperExternalSyntheticLambda6(sb.toString());
    }

    private void onAddQueueItem() throws IOException {
        read(true);
        int i = this.MediaBrowserCompatMediaItem;
        this.MediaBrowserCompatMediaItem = i - 1;
        if (i + 4 <= this.AudioAttributesCompatParcelizer || IconCompatParcelizer(5)) {
            int i2 = this.MediaBrowserCompatMediaItem;
            char[] cArr = this.write;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.MediaBrowserCompatMediaItem = i2 + 5;
            }
        }
    }

    static {
        createMediaSourceInternal.IconCompatParcelizer = new createMediaSourceInternal() { // from class: o.DownloadHelperExternalSyntheticLambda4.1
            @Override // kotlin.createMediaSourceInternal
            public final void write(DownloadHelperExternalSyntheticLambda4 downloadHelperExternalSyntheticLambda4) throws IOException {
                if (downloadHelperExternalSyntheticLambda4 instanceof addAudioLanguagesToSelection) {
                    ((addAudioLanguagesToSelection) downloadHelperExternalSyntheticLambda4).onAddQueueItem();
                    return;
                }
                int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer;
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 0) {
                    iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = downloadHelperExternalSyntheticLambda4.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 13) {
                    downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer = 9;
                    return;
                }
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 12) {
                    downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer = 8;
                } else {
                    if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == 14) {
                        downloadHelperExternalSyntheticLambda4.RemoteActionCompatParcelizer = 10;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Expected a name but was ");
                    sb.append(downloadHelperExternalSyntheticLambda4.onCustomAction());
                    sb.append(downloadHelperExternalSyntheticLambda4.onMediaButtonEvent());
                    throw new IllegalStateException(sb.toString());
                }
            }
        };
    }
}
