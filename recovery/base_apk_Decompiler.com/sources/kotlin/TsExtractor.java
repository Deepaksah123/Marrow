package kotlin;

import android.util.Base64;
import android.util.JsonReader;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import kotlin.fillBufferWithAtLeastOnePacket;

/* JADX INFO: loaded from: classes3.dex */
public final class TsExtractor {
    private static final maybeBlockOnQueueing AudioAttributesCompatParcelizer = new queueSecureInputBuffer().read(PsBinarySearchSeekerPsScrSeeker.write).read().AudioAttributesCompatParcelizer();

    /* JADX INFO: loaded from: classes.dex */
    interface write<T> {
        T IconCompatParcelizer(JsonReader jsonReader) throws IOException;
    }

    public static String IconCompatParcelizer(fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacket) {
        return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(fillbufferwithatleastonepacket);
    }

    public static String read(fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVar) {
        return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(readVar);
    }

    public static fillBufferWithAtLeastOnePacket AudioAttributesCompatParcelizer(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                fillBufferWithAtLeastOnePacket fillbufferwithatleastonepacketOnPrepareFromSearch = onPrepareFromSearch(jsonReader);
                jsonReader.close();
                return fillbufferwithatleastonepacketOnPrepareFromSearch;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read write(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read readVarMediaMetadataCompat = MediaMetadataCompat(jsonReader);
                jsonReader.close();
                return readVarMediaMetadataCompat;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static kotlin.fillBufferWithAtLeastOnePacket onPrepareFromSearch(android.util.JsonReader r3) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onPrepareFromSearch(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer onPrepare(android.util.JsonReader r4) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onPrepare(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer");
    }

    private static fillBufferWithAtLeastOnePacket.read onPlay(JsonReader jsonReader) throws IOException {
        fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = fillBufferWithAtLeastOnePacket.read.RemoteActionCompatParcelizer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("files")) {
                RemoteActionCompatParcelizer.write(RemoteActionCompatParcelizer(jsonReader, new write() { // from class: o.TsPayloadReaderEsInfo
                    @Override // o.TsExtractor.write
                    public final Object IconCompatParcelizer(JsonReader jsonReader2) {
                        return TsExtractor.onPause(jsonReader2);
                    }
                }));
            } else if (strNextName.equals("orgId")) {
                RemoteActionCompatParcelizer.IconCompatParcelizer(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer AudioAttributesImplApi21Parcelizer(android.util.JsonReader r3) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.AudioAttributesImplApi21Parcelizer(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$IconCompatParcelizer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fillBufferWithAtLeastOnePacket.read.AbstractC0083read onPause(JsonReader jsonReader) throws IOException {
        fillBufferWithAtLeastOnePacket.read.AbstractC0083read.RemoteActionCompatParcelizer remoteActionCompatParcelizerAudioAttributesCompatParcelizer = fillBufferWithAtLeastOnePacket.read.AbstractC0083read.AudioAttributesCompatParcelizer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("filename")) {
                remoteActionCompatParcelizerAudioAttributesCompatParcelizer.write(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                remoteActionCompatParcelizerAudioAttributesCompatParcelizer.read(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return remoteActionCompatParcelizerAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver onPlayFromSearch(JsonReader jsonReader) throws IOException {
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.read readVarWrite = fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.write();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("identifier")) {
                readVarWrite.write(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return readVarWrite.read();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer MediaBrowserCompatCustomActionResultReceiver(android.util.JsonReader r8) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$IconCompatParcelizer$write r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.IconCompatParcelizer.MediaBrowserCompatItemReceiver()
            r8.beginObject()
        L7:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La1
            java.lang.String r1 = r8.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1618432855: goto L53;
                case -519438642: goto L49;
                case 213652010: goto L3f;
                case 351608024: goto L35;
                case 719853845: goto L2b;
                case 1975623094: goto L21;
                default: goto L20;
            }
        L20:
            goto L5d
        L21:
            java.lang.String r2 = "displayVersion"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r3
            goto L5e
        L2b:
            java.lang.String r2 = "installationUuid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r4
            goto L5e
        L35:
            java.lang.String r2 = "version"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r5
            goto L5e
        L3f:
            java.lang.String r2 = "developmentPlatformVersion"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r6
            goto L5e
        L49:
            java.lang.String r2 = "developmentPlatform"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r7
            goto L5e
        L53:
            java.lang.String r2 = "identifier"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = 0
            goto L5e
        L5d:
            r1 = -1
        L5e:
            if (r1 == 0) goto L98
            if (r1 == r7) goto L8f
            if (r1 == r6) goto L86
            if (r1 == r5) goto L7e
            if (r1 == r4) goto L76
            if (r1 == r3) goto L6e
            r8.skipValue()
            goto L7
        L6e:
            java.lang.String r1 = r8.nextString()
            r0.IconCompatParcelizer(r1)
            goto L7
        L76:
            java.lang.String r1 = r8.nextString()
            r0.write(r1)
            goto L7
        L7e:
            java.lang.String r1 = r8.nextString()
            r0.AudioAttributesImplApi26Parcelizer(r1)
            goto L7
        L86:
            java.lang.String r1 = r8.nextString()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L8f:
            java.lang.String r1 = r8.nextString()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L98:
            java.lang.String r1 = r8.nextString()
            r0.read(r1)
            goto L7
        La1:
            r8.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$IconCompatParcelizer r8 = r0.AudioAttributesCompatParcelizer()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaBrowserCompatCustomActionResultReceiver(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$IconCompatParcelizer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write onPlayFromMediaId(android.util.JsonReader r6) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$write$AudioAttributesCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.write.read()
            r6.beginObject()
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L74
            java.lang.String r1 = r6.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r2) {
                case -911706486: goto L3d;
                case -293026577: goto L33;
                case 351608024: goto L29;
                case 1874684019: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L47
        L1f:
            java.lang.String r2 = "platform"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L29:
            java.lang.String r2 = "version"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r4
            goto L48
        L33:
            java.lang.String r2 = "jailbroken"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r5
            goto L48
        L3d:
            java.lang.String r2 = "buildVersion"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = 0
            goto L48
        L47:
            r1 = -1
        L48:
            if (r1 == 0) goto L6c
            if (r1 == r5) goto L64
            if (r1 == r4) goto L5c
            if (r1 == r3) goto L54
            r6.skipValue()
            goto L7
        L54:
            int r1 = r6.nextInt()
            r0.IconCompatParcelizer(r1)
            goto L7
        L5c:
            java.lang.String r1 = r6.nextString()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L64:
            boolean r1 = r6.nextBoolean()
            r0.write(r1)
            goto L7
        L6c:
            java.lang.String r1 = r6.nextString()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L74:
            r6.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$write r6 = r0.write()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onPlayFromMediaId(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$write");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer RatingCompat(android.util.JsonReader r3) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.RatingCompat(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$AudioAttributesCompatParcelizer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read MediaMetadataCompat(android.util.JsonReader r7) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$read r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver()
            r7.beginObject()
        L7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8a
            java.lang.String r1 = r7.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1335157162: goto L48;
                case 96801: goto L3e;
                case 107332: goto L34;
                case 3575610: goto L2a;
                case 55126294: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L52
        L20:
            java.lang.String r2 = "timestamp"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r3
            goto L53
        L2a:
            java.lang.String r2 = "type"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r4
            goto L53
        L34:
            java.lang.String r2 = "log"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r5
            goto L53
        L3e:
            java.lang.String r2 = "app"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r6
            goto L53
        L48:
            java.lang.String r2 = "device"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 0
            goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L81
            if (r1 == r6) goto L79
            if (r1 == r5) goto L71
            if (r1 == r4) goto L69
            if (r1 == r3) goto L61
            r7.skipValue()
            goto L7
        L61:
            long r1 = r7.nextLong()
            r0.IconCompatParcelizer(r1)
            goto L7
        L69:
            java.lang.String r1 = r7.nextString()
            r0.write(r1)
            goto L7
        L71:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$IconCompatParcelizer r1 = handleMediaPlayPauseIfPendingOnHandler(r7)
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L79:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write r1 = MediaDescriptionCompat(r7)
            r0.IconCompatParcelizer(r1)
            goto L7
        L81:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer r1 = onCustomAction(r7)
            r0.write(r1)
            goto L7
        L8a:
            r7.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read r7 = r0.AudioAttributesCompatParcelizer()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaMetadataCompat(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write MediaDescriptionCompat(android.util.JsonReader r7) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$IconCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesImplBaseParcelizer()
            r7.beginObject()
        L7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L99
            java.lang.String r1 = r7.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1332194002: goto L48;
                case -1090974952: goto L3e;
                case -80231855: goto L34;
                case 555169704: goto L2a;
                case 928737948: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L52
        L20:
            java.lang.String r2 = "uiOrientation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r3
            goto L53
        L2a:
            java.lang.String r2 = "customAttributes"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r4
            goto L53
        L34:
            java.lang.String r2 = "internalKeys"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r5
            goto L53
        L3e:
            java.lang.String r2 = "execution"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r6
            goto L53
        L48:
            java.lang.String r2 = "background"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 0
            goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L8c
            if (r1 == r6) goto L83
            if (r1 == r5) goto L76
            if (r1 == r4) goto L69
            if (r1 == r3) goto L61
            r7.skipValue()
            goto L7
        L61:
            int r1 = r7.nextInt()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L69:
            o.resetPayloadReaders r1 = new o.resetPayloadReaders
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r7, r1)
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L76:
            o.resetPayloadReaders r1 = new o.resetPayloadReaders
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r7, r1)
            r0.IconCompatParcelizer(r1)
            goto L7
        L83:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer r1 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(r7)
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L8c:
            boolean r1 = r7.nextBoolean()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L99:
            r7.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write r7 = r0.RemoteActionCompatParcelizer()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaDescriptionCompat(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(android.util.JsonReader r7) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$RemoteActionCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()
            r7.beginObject()
        L7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L95
            java.lang.String r1 = r7.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1375141843: goto L48;
                case -1337936983: goto L3e;
                case -902467928: goto L34;
                case 937615455: goto L2a;
                case 1481625679: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L52
        L20:
            java.lang.String r2 = "exception"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r3
            goto L53
        L2a:
            java.lang.String r2 = "binaries"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r4
            goto L53
        L34:
            java.lang.String r2 = "signal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r5
            goto L53
        L3e:
            java.lang.String r2 = "threads"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r6
            goto L53
        L48:
            java.lang.String r2 = "appExitInfo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 0
            goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L8c
            if (r1 == r6) goto L7e
            if (r1 == r5) goto L76
            if (r1 == r4) goto L69
            if (r1 == r3) goto L61
            r7.skipValue()
            goto L7
        L61:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write r1 = onCommand(r7)
            r0.read(r1)
            goto L7
        L69:
            o.TsExtractorPmtReader r1 = new o.TsExtractorPmtReader
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r7, r1)
            r0.read(r1)
            goto L7
        L76:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$IconCompatParcelizer r1 = onMediaButtonEvent(r7)
            r0.IconCompatParcelizer(r1)
            goto L7
        L7e:
            o.shouldConsumePacketPayload r1 = new o.shouldConsumePacketPayload
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r7, r1)
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L8c:
            o.fillBufferWithAtLeastOnePacket$IconCompatParcelizer r1 = AudioAttributesImplApi21Parcelizer(r7)
            r0.IconCompatParcelizer(r1)
            goto L7
        L95:
            r7.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer r7 = r0.write()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write onCommand(android.util.JsonReader r7) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write$RemoteActionCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0081write.AudioAttributesImplApi21Parcelizer()
            r7.beginObject()
        L7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8f
            java.lang.String r1 = r7.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1266514778: goto L48;
                case -934964668: goto L3e;
                case 3575610: goto L34;
                case 91997906: goto L2a;
                case 581754413: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L52
        L20:
            java.lang.String r2 = "overflowCount"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r3
            goto L53
        L2a:
            java.lang.String r2 = "causedBy"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r4
            goto L53
        L34:
            java.lang.String r2 = "type"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r5
            goto L53
        L3e:
            java.lang.String r2 = "reason"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r6
            goto L53
        L48:
            java.lang.String r2 = "frames"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 0
            goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L81
            if (r1 == r6) goto L79
            if (r1 == r5) goto L71
            if (r1 == r4) goto L69
            if (r1 == r3) goto L61
            r7.skipValue()
            goto L7
        L61:
            int r1 = r7.nextInt()
            r0.write(r1)
            goto L7
        L69:
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write r1 = onCommand(r7)
            r0.IconCompatParcelizer(r1)
            goto L7
        L71:
            java.lang.String r1 = r7.nextString()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L79:
            java.lang.String r1 = r7.nextString()
            r0.read(r1)
            goto L7
        L81:
            o.TsExtractorExternalSyntheticLambda0 r1 = new o.TsExtractorExternalSyntheticLambda0
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r7, r1)
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L8f:
            r7.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write r7 = r0.AudioAttributesCompatParcelizer()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onCommand(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$write");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer onMediaButtonEvent(android.util.JsonReader r6) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$IconCompatParcelizer$IconCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.IconCompatParcelizer.RemoteActionCompatParcelizer()
            r6.beginObject()
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.String r1 = r6.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1147692044(0xffffffffbb979bf4, float:-0.0046267454)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L3e
            r3 = 3059181(0x2eaded, float:4.286826E-39)
            if (r2 == r3) goto L34
            r3 = 3373707(0x337a8b, float:4.72757E-39)
            if (r2 == r3) goto L2a
            goto L48
        L2a:
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r4
            goto L49
        L34:
            java.lang.String r2 = "code"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r5
            goto L49
        L3e:
            java.lang.String r2 = "address"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = 0
            goto L49
        L48:
            r1 = -1
        L49:
            if (r1 == 0) goto L63
            if (r1 == r5) goto L5b
            if (r1 == r4) goto L53
            r6.skipValue()
            goto L7
        L53:
            java.lang.String r1 = r6.nextString()
            r0.write(r1)
            goto L7
        L5b:
            java.lang.String r1 = r6.nextString()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L63:
            long r1 = r6.nextLong()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L6b:
            r6.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$IconCompatParcelizer r6 = r0.read()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onMediaButtonEvent(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$IconCompatParcelizer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read MediaBrowserCompatSearchResultReceiver(android.util.JsonReader r6) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$read$RemoteActionCompatParcelizer r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0079read.AudioAttributesCompatParcelizer()
            r6.beginObject()
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L78
            java.lang.String r1 = r6.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 3
            r4 = 1
            r5 = 2
            switch(r2) {
                case 3373707: goto L3d;
                case 3530753: goto L33;
                case 3601339: goto L29;
                case 1153765347: goto L1f;
                default: goto L1e;
            }
        L1e:
            goto L47
        L1f:
            java.lang.String r2 = "baseAddress"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r3
            goto L48
        L29:
            java.lang.String r2 = "uuid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r5
            goto L48
        L33:
            java.lang.String r2 = "size"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = r4
            goto L48
        L3d:
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L47
            r1 = 0
            goto L48
        L47:
            r1 = -1
        L48:
            if (r1 == 0) goto L70
            if (r1 == r4) goto L68
            if (r1 == r5) goto L5c
            if (r1 == r3) goto L54
            r6.skipValue()
            goto L7
        L54:
            long r1 = r6.nextLong()
            r0.read(r1)
            goto L7
        L5c:
            java.lang.String r1 = r6.nextString()
            byte[] r1 = android.util.Base64.decode(r1, r5)
            r0.IconCompatParcelizer(r1)
            goto L7
        L68:
            long r1 = r6.nextLong()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L70:
            java.lang.String r1 = r6.nextString()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L78:
            r6.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$read r6 = r0.read()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaBrowserCompatSearchResultReceiver(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$read");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer onFastForward(android.util.JsonReader r6) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$read r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.read()
            r6.beginObject()
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L70
            java.lang.String r1 = r6.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1266514778(0xffffffffb48284a6, float:-2.43109E-7)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L3e
            r3 = 3373707(0x337a8b, float:4.72757E-39)
            if (r2 == r3) goto L34
            r3 = 2125650548(0x7eb2da74, float:1.1886843E38)
            if (r2 == r3) goto L2a
            goto L48
        L2a:
            java.lang.String r2 = "importance"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r4
            goto L49
        L34:
            java.lang.String r2 = "name"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r5
            goto L49
        L3e:
            java.lang.String r2 = "frames"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = 0
            goto L49
        L48:
            r1 = -1
        L49:
            if (r1 == 0) goto L63
            if (r1 == r5) goto L5b
            if (r1 == r4) goto L53
            r6.skipValue()
            goto L7
        L53:
            int r1 = r6.nextInt()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L5b:
            java.lang.String r1 = r6.nextString()
            r0.write(r1)
            goto L7
        L63:
            o.TsExtractorExternalSyntheticLambda0 r1 = new o.TsExtractorExternalSyntheticLambda0
            r1.<init>()
            o.access102 r1 = RemoteActionCompatParcelizer(r6, r1)
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L70:
            r6.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer r6 = r0.AudioAttributesCompatParcelizer()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onFastForward(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer onAddQueueItem(android.util.JsonReader r7) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$read r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.write.AudioAttributesCompatParcelizer.AbstractC0073AudioAttributesCompatParcelizer.AbstractC0074AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer()
            r7.beginObject()
        L7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8a
            java.lang.String r1 = r7.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1019779949: goto L48;
                case -887523944: goto L3e;
                case 3571: goto L34;
                case 3143036: goto L2a;
                case 2125650548: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L52
        L20:
            java.lang.String r2 = "importance"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r3
            goto L53
        L2a:
            java.lang.String r2 = "file"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r4
            goto L53
        L34:
            java.lang.String r2 = "pc"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r5
            goto L53
        L3e:
            java.lang.String r2 = "symbol"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = r6
            goto L53
        L48:
            java.lang.String r2 = "offset"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L52
            r1 = 0
            goto L53
        L52:
            r1 = -1
        L53:
            if (r1 == 0) goto L81
            if (r1 == r6) goto L79
            if (r1 == r5) goto L71
            if (r1 == r4) goto L69
            if (r1 == r3) goto L61
            r7.skipValue()
            goto L7
        L61:
            int r1 = r7.nextInt()
            r0.read(r1)
            goto L7
        L69:
            java.lang.String r1 = r7.nextString()
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        L71:
            long r1 = r7.nextLong()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L79:
            java.lang.String r1 = r7.nextString()
            r0.IconCompatParcelizer(r1)
            goto L7
        L81:
            long r1 = r7.nextLong()
            r0.write(r1)
            goto L7
        L8a:
            r7.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer r7 = r0.read()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onAddQueueItem(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$write$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer$AudioAttributesCompatParcelizer");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer onCustomAction(android.util.JsonReader r8) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer$write r0 = o.fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.AbstractC0071RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()
            r8.beginObject()
        L7:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La5
            java.lang.String r1 = r8.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1708606089: goto L53;
                case -1455558134: goto L49;
                case -1439500848: goto L3f;
                case 279795450: goto L35;
                case 976541947: goto L2b;
                case 1516795582: goto L21;
                default: goto L20;
            }
        L20:
            goto L5d
        L21:
            java.lang.String r2 = "proximityOn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r3
            goto L5e
        L2b:
            java.lang.String r2 = "ramUsed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r4
            goto L5e
        L35:
            java.lang.String r2 = "diskUsed"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r5
            goto L5e
        L3f:
            java.lang.String r2 = "orientation"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r6
            goto L5e
        L49:
            java.lang.String r2 = "batteryVelocity"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = r7
            goto L5e
        L53:
            java.lang.String r2 = "batteryLevel"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5d
            r1 = 0
            goto L5e
        L5d:
            r1 = -1
        L5e:
            if (r1 == 0) goto L98
            if (r1 == r7) goto L8f
            if (r1 == r6) goto L86
            if (r1 == r5) goto L7e
            if (r1 == r4) goto L76
            if (r1 == r3) goto L6e
            r8.skipValue()
            goto L7
        L6e:
            boolean r1 = r8.nextBoolean()
            r0.IconCompatParcelizer(r1)
            goto L7
        L76:
            long r1 = r8.nextLong()
            r0.read(r1)
            goto L7
        L7e:
            long r1 = r8.nextLong()
            r0.write(r1)
            goto L7
        L86:
            int r1 = r8.nextInt()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L8f:
            int r1 = r8.nextInt()
            r0.read(r1)
            goto L7
        L98:
            double r1 = r8.nextDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.AudioAttributesCompatParcelizer(r1)
            goto L7
        La5:
            r8.endObject()
            o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer r8 = r0.AudioAttributesCompatParcelizer()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.onCustomAction(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$RemoteActionCompatParcelizer$read$RemoteActionCompatParcelizer");
    }

    private static fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer handleMediaPlayPauseIfPendingOnHandler(JsonReader jsonReader) throws IOException {
        fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.AbstractC0070IconCompatParcelizer abstractC0070IconCompatParcelizerWrite = fillBufferWithAtLeastOnePacket.RemoteActionCompatParcelizer.read.IconCompatParcelizer.write();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("content")) {
                abstractC0070IconCompatParcelizerWrite.RemoteActionCompatParcelizer(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return abstractC0070IconCompatParcelizerWrite.AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static fillBufferWithAtLeastOnePacket.write MediaBrowserCompatMediaItem(JsonReader jsonReader) throws IOException {
        fillBufferWithAtLeastOnePacket.write.read readVarIconCompatParcelizer = fillBufferWithAtLeastOnePacket.write.IconCompatParcelizer();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("key")) {
                readVarIconCompatParcelizer.RemoteActionCompatParcelizer(jsonReader.nextString());
            } else if (strNextName.equals(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                readVarIconCompatParcelizer.AudioAttributesCompatParcelizer(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return readVarIconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read MediaBrowserCompatItemReceiver(android.util.JsonReader r6) throws java.io.IOException {
        /*
            o.fillBufferWithAtLeastOnePacket$IconCompatParcelizer$read$write r0 = o.fillBufferWithAtLeastOnePacket.IconCompatParcelizer.read.read()
            r6.beginObject()
        L7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6b
            java.lang.String r1 = r6.nextName()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -609862170(0xffffffffdba63de6, float:-9.358581E16)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L3e
            r3 = 3002454(0x2dd056, float:4.207334E-39)
            if (r2 == r3) goto L34
            r3 = 230943785(0xdc3ec29, float:1.2074656E-30)
            if (r2 == r3) goto L2a
            goto L48
        L2a:
            java.lang.String r2 = "buildId"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r4
            goto L49
        L34:
            java.lang.String r2 = "arch"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = r5
            goto L49
        L3e:
            java.lang.String r2 = "libraryName"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L48
            r1 = 0
            goto L49
        L48:
            r1 = -1
        L49:
            if (r1 == 0) goto L63
            if (r1 == r5) goto L5b
            if (r1 == r4) goto L53
            r6.skipValue()
            goto L7
        L53:
            java.lang.String r1 = r6.nextString()
            r0.read(r1)
            goto L7
        L5b:
            java.lang.String r1 = r6.nextString()
            r0.write(r1)
            goto L7
        L63:
            java.lang.String r1 = r6.nextString()
            r0.RemoteActionCompatParcelizer(r1)
            goto L7
        L6b:
            r6.endObject()
            o.fillBufferWithAtLeastOnePacket$IconCompatParcelizer$read r6 = r0.IconCompatParcelizer()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TsExtractor.MediaBrowserCompatItemReceiver(android.util.JsonReader):o.fillBufferWithAtLeastOnePacket$IconCompatParcelizer$read");
    }

    private static <T> access102<T> RemoteActionCompatParcelizer(JsonReader jsonReader, write<T> writeVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(writeVar.IconCompatParcelizer(jsonReader));
        }
        jsonReader.endArray();
        return access102.IconCompatParcelizer(arrayList);
    }
}
