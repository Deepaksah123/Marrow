package kotlin;

import java.io.EOFException;
import java.io.IOException;
import kotlin.Format1;

/* JADX INFO: loaded from: classes2.dex */
final class access2800 extends Format1 {
    private int MediaBrowserCompatMediaItem;
    private final resetCurrentSelectedPosition MediaBrowserCompatSearchResultReceiver;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private long MediaDescriptionCompat;
    private int MediaMetadataCompat = 0;
    private final LessonCompletedDialog onCustomAction;
    private static final getRelatedModuleAdapter AudioAttributesImplApi26Parcelizer = getRelatedModuleAdapter.read("'\\");
    private static final getRelatedModuleAdapter MediaBrowserCompatItemReceiver = getRelatedModuleAdapter.read("\"\\");
    private static final getRelatedModuleAdapter RatingCompat = getRelatedModuleAdapter.read("{}[]:, \n\t\r\f/\\;#=");
    private static final getRelatedModuleAdapter MediaBrowserCompatCustomActionResultReceiver = getRelatedModuleAdapter.read("\n\r");
    private static final getRelatedModuleAdapter AudioAttributesImplApi21Parcelizer = getRelatedModuleAdapter.read("*/");

    access2800(LessonCompletedDialog lessonCompletedDialog) {
        if (lessonCompletedDialog == null) {
            throw new NullPointerException("source == null");
        }
        this.onCustomAction = lessonCompletedDialog;
        this.MediaBrowserCompatSearchResultReceiver = lessonCompletedDialog.read();
        RemoteActionCompatParcelizer(6);
    }

    @Override // kotlin.Format1
    public final void read() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 3) {
            RemoteActionCompatParcelizer(1);
            this.write[this.AudioAttributesImplBaseParcelizer - 1] = 0;
            this.MediaMetadataCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
    }

    @Override // kotlin.Format1
    public final void write() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 4) {
            this.AudioAttributesImplBaseParcelizer--;
            int[] iArr = this.write;
            int i = this.AudioAttributesImplBaseParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            this.MediaMetadataCompat = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(" at path ");
        sb.append(RemoteActionCompatParcelizer());
        throw new FormatBuilder(sb.toString());
    }

    @Override // kotlin.Format1
    public final void AudioAttributesCompatParcelizer() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 1) {
            RemoteActionCompatParcelizer(3);
            this.MediaMetadataCompat = 0;
        } else {
            StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
    }

    @Override // kotlin.Format1
    public final void IconCompatParcelizer() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 2) {
            this.AudioAttributesImplBaseParcelizer--;
            this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer] = null;
            int[] iArr = this.write;
            int i = this.AudioAttributesImplBaseParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            this.MediaMetadataCompat = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(" at path ");
        sb.append(RemoteActionCompatParcelizer());
        throw new FormatBuilder(sb.toString());
    }

    @Override // kotlin.Format1
    public final boolean MediaBrowserCompatCustomActionResultReceiver() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        return (iOnAddQueueItem == 2 || iOnAddQueueItem == 4 || iOnAddQueueItem == 18) ? false : true;
    }

    @Override // kotlin.Format1
    public final Format1.IconCompatParcelizer MediaBrowserCompatMediaItem() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        switch (iOnAddQueueItem) {
            case 1:
                return Format1.IconCompatParcelizer.BEGIN_OBJECT;
            case 2:
                return Format1.IconCompatParcelizer.END_OBJECT;
            case 3:
                return Format1.IconCompatParcelizer.BEGIN_ARRAY;
            case 4:
                return Format1.IconCompatParcelizer.END_ARRAY;
            case 5:
            case 6:
                return Format1.IconCompatParcelizer.BOOLEAN;
            case 7:
                return Format1.IconCompatParcelizer.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return Format1.IconCompatParcelizer.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return Format1.IconCompatParcelizer.NAME;
            case 16:
            case 17:
                return Format1.IconCompatParcelizer.NUMBER;
            case 18:
                return Format1.IconCompatParcelizer.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    private int onAddQueueItem() throws IOException {
        int i = this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1];
        if (i == 1) {
            this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = 2;
        } else if (i == 2) {
            int iWrite = write(true);
            this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
            if (iWrite != 44) {
                if (iWrite != 59) {
                    if (iWrite == 93) {
                        this.MediaMetadataCompat = 4;
                        return 4;
                    }
                    throw AudioAttributesCompatParcelizer("Unterminated array");
                }
                MediaMetadataCompat();
            }
        } else {
            if (i == 3 || i == 5) {
                this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = 4;
                if (i == 5) {
                    int iWrite2 = write(true);
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    if (iWrite2 != 44) {
                        if (iWrite2 != 59) {
                            if (iWrite2 == 125) {
                                this.MediaMetadataCompat = 2;
                                return 2;
                            }
                            throw AudioAttributesCompatParcelizer("Unterminated object");
                        }
                        MediaMetadataCompat();
                    }
                }
                int iWrite3 = write(true);
                if (iWrite3 == 34) {
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    this.MediaMetadataCompat = 13;
                    return 13;
                }
                if (iWrite3 == 39) {
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    MediaMetadataCompat();
                    this.MediaMetadataCompat = 12;
                    return 12;
                }
                if (iWrite3 != 125) {
                    MediaMetadataCompat();
                    if (AudioAttributesCompatParcelizer((char) iWrite3)) {
                        this.MediaMetadataCompat = 14;
                        return 14;
                    }
                    throw AudioAttributesCompatParcelizer("Expected name");
                }
                if (i != 5) {
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    this.MediaMetadataCompat = 2;
                    return 2;
                }
                throw AudioAttributesCompatParcelizer("Expected name");
            }
            if (i == 4) {
                this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = 5;
                int iWrite4 = write(true);
                this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                if (iWrite4 != 58) {
                    if (iWrite4 == 61) {
                        MediaMetadataCompat();
                        if (this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(1L) && this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(0L) == 62) {
                            this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                        }
                    } else {
                        throw AudioAttributesCompatParcelizer("Expected ':'");
                    }
                }
            } else if (i == 6) {
                this.RemoteActionCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = 7;
            } else if (i == 7) {
                if (write(false) == -1) {
                    this.MediaMetadataCompat = 18;
                    return 18;
                }
                MediaMetadataCompat();
            } else if (i == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iWrite5 = write(true);
        if (iWrite5 == 34) {
            this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
            this.MediaMetadataCompat = 9;
            return 9;
        }
        if (iWrite5 == 39) {
            MediaMetadataCompat();
            this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
            this.MediaMetadataCompat = 8;
            return 8;
        }
        if (iWrite5 != 44 && iWrite5 != 59) {
            if (iWrite5 == 91) {
                this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                this.MediaMetadataCompat = 3;
                return 3;
            }
            if (iWrite5 != 93) {
                if (iWrite5 == 123) {
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    this.MediaMetadataCompat = 1;
                    return 1;
                }
                int iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                if (iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != 0) {
                    return iMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                }
                int iHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
                if (iHandleMediaPlayPauseIfPendingOnHandler != 0) {
                    return iHandleMediaPlayPauseIfPendingOnHandler;
                }
                if (!AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(0L))) {
                    throw AudioAttributesCompatParcelizer("Expected value");
                }
                MediaMetadataCompat();
                this.MediaMetadataCompat = 10;
                return 10;
            }
            if (i == 1) {
                this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                this.MediaMetadataCompat = 4;
                return 4;
            }
        }
        if (i == 1 || i == 2) {
            MediaMetadataCompat();
            this.MediaMetadataCompat = 7;
            return 7;
        }
        throw AudioAttributesCompatParcelizer("Unexpected value");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        String str;
        String str2;
        int i;
        byte bIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(0L);
        if (bIconCompatParcelizer == 116 || bIconCompatParcelizer == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (bIconCompatParcelizer == 102 || bIconCompatParcelizer == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bIconCompatParcelizer != 110 && bIconCompatParcelizer != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(i3)) {
                return 0;
            }
            byte bIconCompatParcelizer2 = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(i2);
            if (bIconCompatParcelizer2 != str.charAt(i2) && bIconCompatParcelizer2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(length + 1) && AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(length))) {
            return 0;
        }
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(length);
        this.MediaMetadataCompat = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0078, code lost:
    
        if (AudioAttributesCompatParcelizer(r11) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x009f, code lost:
    
        if (r6 != 2) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a1, code lost:
    
        if (r7 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a7, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00a9, code lost:
    
        if (r8 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00af, code lost:
    
        if (r9 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b1, code lost:
    
        if (r8 != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b3, code lost:
    
        if (r8 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b5, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b6, code lost:
    
        r16.MediaDescriptionCompat = r9;
        r16.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(r5);
        r16.MediaMetadataCompat = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
    
        if (r6 == 2) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c6, code lost:
    
        if (r6 == 4) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c9, code lost:
    
        if (r6 == 7) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00cc, code lost:
    
        r16.MediaBrowserCompatMediaItem = r5;
        r16.MediaMetadataCompat = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d2, code lost:
    
        return 17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int handleMediaPlayPauseIfPendingOnHandler() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access2800.handleMediaPlayPauseIfPendingOnHandler():int");
    }

    private boolean AudioAttributesCompatParcelizer(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
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

    @Override // kotlin.Format1
    public final String AudioAttributesImplApi26Parcelizer() throws IOException {
        String strAudioAttributesCompatParcelizer;
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 14) {
            strAudioAttributesCompatParcelizer = onCustomAction();
        } else if (iOnAddQueueItem == 13) {
            strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver);
        } else if (iOnAddQueueItem == 12) {
            strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer);
        } else if (iOnAddQueueItem == 15) {
            strAudioAttributesCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
        this.MediaMetadataCompat = 0;
        this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = strAudioAttributesCompatParcelizer;
        return strAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.Format1
    public final int AudioAttributesCompatParcelizer(Format1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem < 12 || iOnAddQueueItem > 15) {
            return -1;
        }
        if (iOnAddQueueItem == 15) {
            return RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, audioAttributesCompatParcelizer);
        }
        int iRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.read);
        if (iRemoteActionCompatParcelizer != -1) {
            this.MediaMetadataCompat = 0;
            this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = audioAttributesCompatParcelizer.write[iRemoteActionCompatParcelizer];
            return iRemoteActionCompatParcelizer;
        }
        String str = this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1];
        String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        int iRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(strAudioAttributesImplApi26Parcelizer, audioAttributesCompatParcelizer);
        if (iRemoteActionCompatParcelizer2 == -1) {
            this.MediaMetadataCompat = 15;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = strAudioAttributesImplApi26Parcelizer;
            this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = str;
        }
        return iRemoteActionCompatParcelizer2;
    }

    @Override // kotlin.Format1
    public final void MediaDescriptionCompat() throws IOException {
        boolean z = this.AudioAttributesCompatParcelizer;
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 14) {
            onFastForward();
        } else if (iOnAddQueueItem == 13) {
            IconCompatParcelizer(MediaBrowserCompatItemReceiver);
        } else if (iOnAddQueueItem == 12) {
            IconCompatParcelizer(AudioAttributesImplApi26Parcelizer);
        } else if (iOnAddQueueItem != 15) {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
        this.MediaMetadataCompat = 0;
        this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = "null";
    }

    private int RemoteActionCompatParcelizer(String str, Format1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        int length = audioAttributesCompatParcelizer.write.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(audioAttributesCompatParcelizer.write[i])) {
                this.MediaMetadataCompat = 0;
                this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // kotlin.Format1
    public final String MediaBrowserCompatSearchResultReceiver() throws IOException {
        String strRemoteActionCompatParcelizer;
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 10) {
            strRemoteActionCompatParcelizer = onCustomAction();
        } else if (iOnAddQueueItem == 9) {
            strRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver);
        } else if (iOnAddQueueItem == 8) {
            strRemoteActionCompatParcelizer = AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer);
        } else if (iOnAddQueueItem == 11) {
            strRemoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        } else if (iOnAddQueueItem == 16) {
            strRemoteActionCompatParcelizer = Long.toString(this.MediaDescriptionCompat);
        } else if (iOnAddQueueItem == 17) {
            strRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
        this.MediaMetadataCompat = 0;
        int[] iArr = this.write;
        int i = this.AudioAttributesImplBaseParcelizer - 1;
        iArr[i] = iArr[i] + 1;
        return strRemoteActionCompatParcelizer;
    }

    @Override // kotlin.Format1
    public final boolean MediaBrowserCompatItemReceiver() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 5) {
            this.MediaMetadataCompat = 0;
            int[] iArr = this.write;
            int i = this.AudioAttributesImplBaseParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iOnAddQueueItem == 6) {
            this.MediaMetadataCompat = 0;
            int[] iArr2 = this.write;
            int i2 = this.AudioAttributesImplBaseParcelizer - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sb = new StringBuilder("Expected a boolean but was ");
        sb.append(MediaBrowserCompatMediaItem());
        sb.append(" at path ");
        sb.append(RemoteActionCompatParcelizer());
        throw new FormatBuilder(sb.toString());
    }

    @Override // kotlin.Format1
    public final double AudioAttributesImplApi21Parcelizer() throws IOException {
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 16) {
            this.MediaMetadataCompat = 0;
            int[] iArr = this.write;
            int i = this.AudioAttributesImplBaseParcelizer - 1;
            iArr[i] = iArr[i] + 1;
            return this.MediaDescriptionCompat;
        }
        if (iOnAddQueueItem == 17) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        } else if (iOnAddQueueItem == 9) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver);
        } else if (iOnAddQueueItem == 8) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer);
        } else if (iOnAddQueueItem == 10) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = onCustomAction();
        } else if (iOnAddQueueItem != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(MediaBrowserCompatMediaItem());
            sb.append(" at path ");
            sb.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb.toString());
        }
        this.MediaMetadataCompat = 11;
        try {
            double d = Double.parseDouble(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            boolean z = this.read;
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
                sb2.append(d);
                sb2.append(" at path ");
                sb2.append(RemoteActionCompatParcelizer());
                throw new access2700(sb2.toString());
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            this.MediaMetadataCompat = 0;
            int[] iArr2 = this.write;
            int i2 = this.AudioAttributesImplBaseParcelizer - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            sb3.append(" at path ");
            sb3.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb3.toString());
        }
    }

    private String AudioAttributesCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(getrelatedmoduleadapter);
            if (jRemoteActionCompatParcelizer == -1) {
                throw AudioAttributesCompatParcelizer("Unterminated string");
            }
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(jRemoteActionCompatParcelizer) != 92) {
                if (sb == null) {
                    String strRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer);
                    this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                    return strRemoteActionCompatParcelizer;
                }
                sb.append(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer));
                this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer));
            this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
            sb.append(onCommand());
        }
    }

    private String onCustomAction() throws IOException {
        long jRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(RatingCompat);
        resetCurrentSelectedPosition resetcurrentselectedposition = this.MediaBrowserCompatSearchResultReceiver;
        return jRemoteActionCompatParcelizer != -1 ? resetcurrentselectedposition.RemoteActionCompatParcelizer(jRemoteActionCompatParcelizer) : resetcurrentselectedposition.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private void IconCompatParcelizer(getRelatedModuleAdapter getrelatedmoduleadapter) throws IOException {
        while (true) {
            long jRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(getrelatedmoduleadapter);
            if (jRemoteActionCompatParcelizer == -1) {
                throw AudioAttributesCompatParcelizer("Unterminated string");
            }
            if (this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(jRemoteActionCompatParcelizer) == 92) {
                this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(jRemoteActionCompatParcelizer + 1);
                onCommand();
            } else {
                this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(jRemoteActionCompatParcelizer + 1);
                return;
            }
        }
    }

    private void onFastForward() throws IOException {
        long jRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(RatingCompat);
        resetCurrentSelectedPosition resetcurrentselectedposition = this.MediaBrowserCompatSearchResultReceiver;
        if (jRemoteActionCompatParcelizer == -1) {
            jRemoteActionCompatParcelizer = resetcurrentselectedposition.getSize();
        }
        resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(jRemoteActionCompatParcelizer);
    }

    @Override // kotlin.Format1
    public final int AudioAttributesImplBaseParcelizer() throws IOException {
        String strAudioAttributesCompatParcelizer;
        int iOnAddQueueItem = this.MediaMetadataCompat;
        if (iOnAddQueueItem == 0) {
            iOnAddQueueItem = onAddQueueItem();
        }
        if (iOnAddQueueItem == 16) {
            long j = this.MediaDescriptionCompat;
            int i = (int) j;
            if (j != i) {
                StringBuilder sb = new StringBuilder("Expected an int but was ");
                sb.append(this.MediaDescriptionCompat);
                sb.append(" at path ");
                sb.append(RemoteActionCompatParcelizer());
                throw new FormatBuilder(sb.toString());
            }
            this.MediaMetadataCompat = 0;
            int[] iArr = this.write;
            int i2 = this.AudioAttributesImplBaseParcelizer - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iOnAddQueueItem == 17) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem);
        } else if (iOnAddQueueItem == 9 || iOnAddQueueItem == 8) {
            if (iOnAddQueueItem == 9) {
                strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver);
            } else {
                strAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer);
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = strAudioAttributesCompatParcelizer;
            try {
                int i3 = Integer.parseInt(strAudioAttributesCompatParcelizer);
                this.MediaMetadataCompat = 0;
                int[] iArr2 = this.write;
                int i4 = this.AudioAttributesImplBaseParcelizer - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iOnAddQueueItem != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(MediaBrowserCompatMediaItem());
            sb2.append(" at path ");
            sb2.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb2.toString());
        }
        this.MediaMetadataCompat = 11;
        try {
            double d = Double.parseDouble(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            int i5 = (int) d;
            if (i5 != d) {
                StringBuilder sb3 = new StringBuilder("Expected an int but was ");
                sb3.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                sb3.append(" at path ");
                sb3.append(RemoteActionCompatParcelizer());
                throw new FormatBuilder(sb3.toString());
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
            this.MediaMetadataCompat = 0;
            int[] iArr3 = this.write;
            int i6 = this.AudioAttributesImplBaseParcelizer - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            sb4.append(" at path ");
            sb4.append(RemoteActionCompatParcelizer());
            throw new FormatBuilder(sb4.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.MediaMetadataCompat = 0;
        this.RemoteActionCompatParcelizer[0] = 8;
        this.AudioAttributesImplBaseParcelizer = 1;
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
        this.onCustomAction.close();
    }

    @Override // kotlin.Format1
    public final void RatingCompat() throws IOException {
        boolean z = this.AudioAttributesCompatParcelizer;
        int i = 0;
        do {
            int iOnAddQueueItem = this.MediaMetadataCompat;
            if (iOnAddQueueItem == 0) {
                iOnAddQueueItem = onAddQueueItem();
            }
            if (iOnAddQueueItem == 3) {
                RemoteActionCompatParcelizer(1);
            } else if (iOnAddQueueItem == 1) {
                RemoteActionCompatParcelizer(3);
            } else {
                if (iOnAddQueueItem == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb = new StringBuilder("Expected a value but was ");
                        sb.append(MediaBrowserCompatMediaItem());
                        sb.append(" at path ");
                        sb.append(RemoteActionCompatParcelizer());
                        throw new FormatBuilder(sb.toString());
                    }
                    this.AudioAttributesImplBaseParcelizer--;
                } else if (iOnAddQueueItem == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                        sb2.append(MediaBrowserCompatMediaItem());
                        sb2.append(" at path ");
                        sb2.append(RemoteActionCompatParcelizer());
                        throw new FormatBuilder(sb2.toString());
                    }
                    this.AudioAttributesImplBaseParcelizer--;
                } else if (iOnAddQueueItem == 14 || iOnAddQueueItem == 10) {
                    onFastForward();
                } else if (iOnAddQueueItem == 9 || iOnAddQueueItem == 13) {
                    IconCompatParcelizer(MediaBrowserCompatItemReceiver);
                } else if (iOnAddQueueItem == 8 || iOnAddQueueItem == 12) {
                    IconCompatParcelizer(AudioAttributesImplApi26Parcelizer);
                } else if (iOnAddQueueItem == 17) {
                    this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(this.MediaBrowserCompatMediaItem);
                } else if (iOnAddQueueItem == 18) {
                    StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                    sb3.append(MediaBrowserCompatMediaItem());
                    sb3.append(" at path ");
                    sb3.append(RemoteActionCompatParcelizer());
                    throw new FormatBuilder(sb3.toString());
                }
                this.MediaMetadataCompat = 0;
            }
            i++;
            this.MediaMetadataCompat = 0;
        } while (i != 0);
        int[] iArr = this.write;
        int i2 = this.AudioAttributesImplBaseParcelizer - 1;
        iArr[i2] = iArr[i2] + 1;
        this.IconCompatParcelizer[this.AudioAttributesImplBaseParcelizer - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r5.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0 != 47) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r5.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(2) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        MediaMetadataCompat();
        r2 = r5.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(1L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r2 == 42) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r2 != 47) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r5.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
        r5.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
        onPlayFromMediaId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r5.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
        r5.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (onPlay() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        throw AudioAttributesCompatParcelizer("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r0 != 35) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        MediaMetadataCompat();
        onPlayFromMediaId();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int write(boolean r6) throws java.io.IOException {
        /*
            r5 = this;
        L0:
            r0 = 0
        L1:
            o.LessonCompletedDialog r1 = r5.onCustomAction
            int r2 = r0 + 1
            long r3 = (long) r2
            boolean r1 = r1.MediaBrowserCompatCustomActionResultReceiver(r3)
            if (r1 == 0) goto L7b
            o.resetCurrentSelectedPosition r1 = r5.MediaBrowserCompatSearchResultReceiver
            long r3 = (long) r0
            byte r0 = r1.IconCompatParcelizer(r3)
            r1 = 10
            if (r0 == r1) goto L79
            r1 = 32
            if (r0 == r1) goto L79
            r1 = 13
            if (r0 == r1) goto L79
            r1 = 9
            if (r0 == r1) goto L79
            o.resetCurrentSelectedPosition r1 = r5.MediaBrowserCompatSearchResultReceiver
            r1.AudioAttributesImplBaseParcelizer(r3)
            r1 = 47
            if (r0 != r1) goto L6d
            o.LessonCompletedDialog r2 = r5.onCustomAction
            r3 = 2
            boolean r2 = r2.MediaBrowserCompatCustomActionResultReceiver(r3)
            if (r2 == 0) goto L78
            r5.MediaMetadataCompat()
            o.resetCurrentSelectedPosition r2 = r5.MediaBrowserCompatSearchResultReceiver
            r3 = 1
            byte r2 = r2.IconCompatParcelizer(r3)
            r3 = 42
            if (r2 == r3) goto L55
            if (r2 != r1) goto L78
            o.resetCurrentSelectedPosition r0 = r5.MediaBrowserCompatSearchResultReceiver
            r0.MediaMetadataCompat()
            o.resetCurrentSelectedPosition r0 = r5.MediaBrowserCompatSearchResultReceiver
            r0.MediaMetadataCompat()
            r5.onPlayFromMediaId()
            goto L0
        L55:
            o.resetCurrentSelectedPosition r0 = r5.MediaBrowserCompatSearchResultReceiver
            r0.MediaMetadataCompat()
            o.resetCurrentSelectedPosition r0 = r5.MediaBrowserCompatSearchResultReceiver
            r0.MediaMetadataCompat()
            boolean r0 = r5.onPlay()
            if (r0 == 0) goto L66
            goto L0
        L66:
            java.lang.String r6 = "Unterminated comment"
            o.access2700 r5 = r5.AudioAttributesCompatParcelizer(r6)
            throw r5
        L6d:
            r1 = 35
            if (r0 != r1) goto L78
            r5.MediaMetadataCompat()
            r5.onPlayFromMediaId()
            goto L0
        L78:
            return r0
        L79:
            r0 = r2
            goto L1
        L7b:
            if (r6 != 0) goto L7f
            r5 = -1
            return r5
        L7f:
            java.io.EOFException r5 = new java.io.EOFException
            java.lang.String r6 = "End of input"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.access2800.write(boolean):int");
    }

    private void MediaMetadataCompat() throws IOException {
        boolean z = this.read;
        throw AudioAttributesCompatParcelizer("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private void onPlayFromMediaId() throws IOException {
        long jRemoteActionCompatParcelizer = this.onCustomAction.RemoteActionCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver);
        resetCurrentSelectedPosition resetcurrentselectedposition = this.MediaBrowserCompatSearchResultReceiver;
        resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(jRemoteActionCompatParcelizer != -1 ? jRemoteActionCompatParcelizer + 1 : resetcurrentselectedposition.getSize());
    }

    private boolean onPlay() throws IOException {
        LessonCompletedDialog lessonCompletedDialog = this.onCustomAction;
        getRelatedModuleAdapter getrelatedmoduleadapter = AudioAttributesImplApi21Parcelizer;
        long jIconCompatParcelizer = lessonCompletedDialog.IconCompatParcelizer(getrelatedmoduleadapter);
        boolean z = jIconCompatParcelizer != -1;
        resetCurrentSelectedPosition resetcurrentselectedposition = this.MediaBrowserCompatSearchResultReceiver;
        resetcurrentselectedposition.AudioAttributesImplBaseParcelizer(z ? jIconCompatParcelizer + ((long) getrelatedmoduleadapter.MediaBrowserCompatCustomActionResultReceiver()) : resetcurrentselectedposition.getSize());
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.onCustomAction);
        sb.append(")");
        return sb.toString();
    }

    private char onCommand() throws IOException {
        int i;
        if (!this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(1L)) {
            throw AudioAttributesCompatParcelizer("Unterminated escape sequence");
        }
        byte bMediaMetadataCompat = this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
        if (bMediaMetadataCompat == 10 || bMediaMetadataCompat == 34 || bMediaMetadataCompat == 39 || bMediaMetadataCompat == 47 || bMediaMetadataCompat == 92) {
            return (char) bMediaMetadataCompat;
        }
        if (bMediaMetadataCompat == 98) {
            return '\b';
        }
        if (bMediaMetadataCompat == 102) {
            return '\f';
        }
        if (bMediaMetadataCompat == 110) {
            return '\n';
        }
        if (bMediaMetadataCompat == 114) {
            return '\r';
        }
        if (bMediaMetadataCompat == 116) {
            return '\t';
        }
        if (bMediaMetadataCompat == 117) {
            if (!this.onCustomAction.MediaBrowserCompatCustomActionResultReceiver(4L)) {
                StringBuilder sb = new StringBuilder("Unterminated escape sequence at path ");
                sb.append(RemoteActionCompatParcelizer());
                throw new EOFException(sb.toString());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte bIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(i2);
                char c2 = (char) (c << 4);
                if (bIconCompatParcelizer >= 48 && bIconCompatParcelizer <= 57) {
                    i = bIconCompatParcelizer - 48;
                } else if (bIconCompatParcelizer >= 97 && bIconCompatParcelizer <= 102) {
                    i = bIconCompatParcelizer - 87;
                } else {
                    if (bIconCompatParcelizer < 65 || bIconCompatParcelizer > 70) {
                        StringBuilder sb2 = new StringBuilder("\\u");
                        sb2.append(this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(4L));
                        throw AudioAttributesCompatParcelizer(sb2.toString());
                    }
                    i = bIconCompatParcelizer - 55;
                }
                c = (char) (c2 + i);
            }
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplBaseParcelizer(4L);
            return c;
        }
        boolean z = this.read;
        StringBuilder sb3 = new StringBuilder("Invalid escape sequence: \\");
        sb3.append((char) bMediaMetadataCompat);
        throw AudioAttributesCompatParcelizer(sb3.toString());
    }
}
